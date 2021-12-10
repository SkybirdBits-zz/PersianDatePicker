package com.skybirdbits.persiandatepicker.persiandate;

import java.util.Locale;

public class PersianCalendarLocales {
    public static final  Locale FARSI = new Locale("fa");
    public static final Locale ENGLISH = Locale.ENGLISH;

    private static PersianCalendarLocales instance;

    private Locale mLocale = Locale.getDefault();


    public static PersianCalendarLocales getInstance(){

        if (instance == null)
            instance = new PersianCalendarLocales();

        return instance;
    }

    public void setLocale(Locale locale) {
        this.mLocale = locale;
    }

    public Locale getLocale() {
        return mLocale;
    }
}
