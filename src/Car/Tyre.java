package Car;

import enums.TyreSeason;

public class Tyre {
    private static TyreSeason tyreSeason;

    public Tyre(TyreSeason tyreSeason) {
        Tyre.tyreSeason = tyreSeason;
    }

    public static TyreSeason getTyreSeason() {
        return tyreSeason;
    }

    public void setTyreSeason(TyreSeason tyreSeason) {
        Tyre.tyreSeason = tyreSeason;


    }

    public static String TS() {
        if (getTyreSeason().equals(TyreSeason.WINTER)) {
            return " Сезон: зимняя";
        } else if (getTyreSeason().equals(TyreSeason.ALL_SEASON)) {
            return " Сезон: всесезонная";
        } else if (getTyreSeason().equals(TyreSeason.SUMMER)) {
            return " Сезон: летняя";

        } else {
            return " Неверный формат";


        }


    }
}
