package MentorSber.DZ1;

public enum Month {
    JANUARY(1, "Зима"),
    FEBRUARY(2, "Зима"),
    MARCH(3, "Весна"),
    APRIL(4, "Весна"),
    MAY(5, "Весна"),
    JUNE(6, "Лето"),
    JULY(7, "Лето"),
    AUGUST(8, "Лето"),
    SEPTEMBER(9, "Осень"),
    OCTOBER(10, "Осень"),
    NOVEMBER(11, "Осень"),
    DECEMBER(12, "Зима");

    private int number;
    private String season;



    Month(int number, String season) {
        this.number = number;
        this.season = season;
    }

    public int getNumber() {
        return number;
    }

    public String getSeason() {
        return season;
    }

    public static Month getMonthByNumber(int number){
        for(Month m : Month.values()) {
            if (m.getNumber() == number){
                System.out.println(m.getSeason());
                return m;
            }
        }
        return JANUARY;
    }

}
