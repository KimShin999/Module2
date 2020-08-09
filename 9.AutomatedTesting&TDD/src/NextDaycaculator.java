public class NextDaycaculator {
    static int day;
    static int mon;
    static int year;
    static int lastDay;
    static int nexDay;

    public NextDaycaculator() {
    }

    public static boolean checkLeapYear(int year) {
        NextDaycaculator.year = year;
        boolean IsLeap;

        int surplus4 = NextDaycaculator.year % 4;
        int surplus100 = NextDaycaculator.year % 100;
        int surplus400 = NextDaycaculator.year % 400;

        if (surplus4 == 0 && surplus100 != 0) {
            IsLeap = true;
        } else if (surplus100 == 0 && surplus400 == 0) {
            IsLeap = true;
        } else IsLeap = false;

        return IsLeap;
    }

    public static String lastDayOfMonth(int day, int mon) {
        NextDaycaculator.day = day;
        NextDaycaculator.mon = mon;

        switch (NextDaycaculator.mon) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (NextDaycaculator.day == 31) {
                    NextDaycaculator.day = 1;
                    NextDaycaculator.mon += 1;
                } else NextDaycaculator.day += 1;
                break;

            case 2:
                if (checkLeapYear(year)) {
                    if (NextDaycaculator.day == 29) {
                        NextDaycaculator.day = 1;
                        NextDaycaculator.mon += 1;
                    } else NextDaycaculator.day += 1;

                } else {
                    if (NextDaycaculator.day == 28) {
                        NextDaycaculator.day = 1;
                        NextDaycaculator.mon += 1;
                    } else NextDaycaculator.day += 1;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (NextDaycaculator.day == 30) {
                    NextDaycaculator.day = 1;
                    NextDaycaculator.mon += 1;
                } else NextDaycaculator.day += 1;
                break;
        }
        return NextDaycaculator.day + " __________ " + NextDaycaculator.mon;
    }

}