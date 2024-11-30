import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class VendingMachine {

    private int insertedMoney = 0;

    public static void main(String[] args) {

        VendingMachine vm = new VendingMachine();
        try (Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH)) {
            boolean purchaseCompleted;
            do {
                int itemNumber = 1;
                System.out.println("------ Vending Machine ------");

                System.out.println("Here is the menu:");
                for (Drinks drinks : Drinks.values()) {
                    drinks.displayMenu(itemNumber);
                    itemNumber++;
                }
                boolean insertionCompleted;
                boolean firstChoise = true;
                do {
                    vm.insertMoney(scan, firstChoise);
                    insertionCompleted = vm.buyDrink(scan);
                    firstChoise = false;
                }
                while (!insertionCompleted);
                purchaseCompleted = vm.completePurchase(scan);
            }
            while (!purchaseCompleted);
        }

    }

    private boolean scanChar(Scanner scan) {
        char ch;
        do {
            ch = scan.next().charAt(0);
            if (ch != 'y' && ch != 'n')
                System.out.println("Type only 'y' or 'n'");
        }
        while (ch != 'y' && ch != 'n');
        return (ch != 'y');
    }

    private int scanNumber(Scanner scan, String action) {
        double value = 0.5;
        boolean inserted = false;
        do {
            try {
                value = scan.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Please do not enter characters, try again ");
                scan.next();
                continue;
            }
            if (action.equals("money")) {
                for (Money money : Money.values()) {
                    if (value == money.getDenomination()) {
                        inserted = true;
                        break;
                    }
                }
            }
            else if (action.equals("menu item")) {
                for (Drinks drinks : Drinks.values()) {
                    if (value == (drinks.ordinal() + 1)) {
                        inserted = true;
                        break;
                    }
                }
            }
            if (!inserted) {
                System.out.println("Please enter applicable " + action);
            }
        }
        while (!inserted);
        return (int) value;
    }

    private void insertMoney(Scanner scan, boolean firstChoice) {
        boolean insertionUnneeded = false;
        if (insertedMoney > 0 && firstChoice) {
            System.out.println("Would you like to add more money? (y/n): ");
            insertionUnneeded = scanChar(scan);
        }

        if (!insertionUnneeded) {
            boolean insertionCompleted;
            StringBuilder useOnly = new StringBuilder("Please insert the money. Use only coins and banknotes of ");
            for (Money money : Money.values()) {
                useOnly.append(money.getDenomination());
            }
            useOnly.append("denomination: ");
            do {
                System.out.println(useOnly);
                insertedMoney += scanNumber(scan, "money");
                System.out.println("Totally you inserted " + insertedMoney +
                        "₽. Would you like to insert more money? (y/n): ");
                insertionCompleted = scanChar(scan);
            }
            while (!insertionCompleted);
        }
    }

    private boolean buyDrink(Scanner scan) {
        boolean insertionCompleted = false;
        boolean drinkChosen = true;
        do {
            System.out.println("Choose the item from the menu by typing its number: ");
            int drinkItem = scanNumber(scan, "menu item");
            for (Drinks drinks : Drinks.values()) {
                if ((drinks.ordinal() + 1) == drinkItem) {
                    if (insertedMoney < drinks.getPrice()) {
                        System.out.println("Not enough money. Insert more or choose another drink.");
                        System.out.println();
                        System.out.println("Would you like to insert more money? (y/n): ");
                        insertionCompleted = scanChar(scan);

                        if (insertionCompleted) {
                            System.out.println("Would you like to choose another drink? (y/n): ");
                            drinkChosen = scanChar(scan);
                            if (!drinkChosen)
                                break;
                        }
                        else
                            break;
                    }
                    else {
                        insertedMoney -= drinks.getPrice();
                        System.out.println("Please take your " + drinks.getName());
                        System.out.println();
                    }
                }
            }
        }
        while (insertionCompleted && !drinkChosen);
        return insertionCompleted;
    }

    private boolean completePurchase(Scanner scan) {
        boolean purchaseCompleted;
        if (insertedMoney > 0)
            System.out.println("You have " + insertedMoney +
                    "₽ left. Would you like to buy more drinks? (y/n): ");
        else
            System.out.println("Would you like to buy more drinks? (y/n): ");
        purchaseCompleted = scanChar(scan);
        if (purchaseCompleted) {
            insertedMoney = 0;
            System.out.println("Thank you! Come back later!");
        }
        return purchaseCompleted;
    }
}
