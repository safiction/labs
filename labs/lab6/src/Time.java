public  class Time {
    int seconds;
    int minutes;
    int hours;

    public Time(){}

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public Time difference(Time start, Time end) {
        Time diff = new Time();
        if (start.seconds > end.seconds) {
            end.seconds += 60;
            end.minutes--;
        }
        if (start.minutes > end.minutes) {
            end.minutes += 60;
            end.hours--;
        }
        diff.seconds = end.seconds - start.seconds;
        diff.minutes = end.minutes - start.seconds;
        diff.hours = end.hours - start.hours;
        return diff;
    }

    @Override
    public String toString() {
        return hours+":"+minutes+":"+seconds;
    }

    public static void main(String[] args) {
        Time start = new Time(2, 15, 20);
        Time end = new Time(2, 40, 20);

    }
}
