package pack.advancejava;

enum EnumDemo {
    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");
    ;

    private final String dayName;

    EnumDemo(String dayName) {
        this.dayName = dayName;
    }

    public String getDayName() {
        return dayName;
    }
}
