package Grigorev;

public class Season {
    int date;
    int month;
    String season;

    public Season(int date, int month) {
        this.date = date;
        this.month = month;
    }

    void whatSeason() {
        if ((month == 12) || (month < 3)) {
            season = "Зима!";
        }
        if ((month > 2) && (month < 6)) {
            season = "Весна!";
        }
        if ((month > 5) && (month < 9)) {
            season = "Лето!";
        }
        if ((month > 8) && (month < 12)) {
            season = "Осень!";
        }
    }

    void writeSeason() {
        if (month <= 12 && month >= 1) {
            System.out.println(date + "." + month + " - это " + season);
        } else {
            System.out.println("Введите корректную дату!");
        }
    }
}