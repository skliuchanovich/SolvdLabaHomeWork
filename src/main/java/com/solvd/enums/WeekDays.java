package com.solvd.enums;

public enum WeekDays {
    MONDAY("It's Monday"), TUESDAY("It's Tuesday"), WEDNESDAY("It's Wednesday"),
    THURSDAY("It's Thursday"), FRIDAY("It's Friday"), SATURDAY("It's Saturday"), SUNDAY("It's Sunday");
    private String weekDay;

    WeekDays(String weekDay) {
        this.weekDay = weekDay;
    }

    public String getWeekDay() {
        return weekDay;
    }

    @Override
    public String toString() {
        return "WeekDays{" +
                "weekDay='" + weekDay + '\'' +
                '}';
    }
}
