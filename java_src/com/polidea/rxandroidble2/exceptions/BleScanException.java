package com.polidea.rxandroidble2.exceptions;

import java.util.Date;
/* loaded from: classes6.dex */
public class BleScanException extends BleException {

    /* renamed from: b */
    public final int f75014b;

    /* renamed from: c */
    public final Date f75015c;

    public BleScanException(int i) {
        super(m45867a(i, null));
        this.f75014b = i;
        this.f75015c = null;
    }

    /* renamed from: a */
    public static String m45867a(int i, Date date) {
        return m45864d(i) + " (code " + i + ")" + m45863e(date);
    }

    /* renamed from: d */
    public static String m45864d(int i) {
        if (i != 2147483646) {
            switch (i) {
                case 0:
                    return "Bluetooth cannot start";
                case 1:
                    return "Bluetooth disabled";
                case 2:
                    return "Bluetooth not available";
                case 3:
                    return "Location Permission missing";
                case 4:
                    return "Location Services disabled";
                case 5:
                    return "Scan failed because it has already started";
                case 6:
                    return "Scan failed because application registration failed";
                case 7:
                    return "Scan failed because of an internal error";
                case 8:
                    return "Scan failed because feature unsupported";
                case 9:
                    return "Scan failed because out of hardware resources";
                default:
                    return "Unknown error";
            }
        }
        return "Undocumented scan throttle";
    }

    /* renamed from: e */
    public static String m45863e(Date date) {
        if (date == null) {
            return "";
        }
        return ", suggested retry date is " + date;
    }

    /* renamed from: b */
    public int m45866b() {
        return this.f75014b;
    }

    /* renamed from: c */
    public Date m45865c() {
        return this.f75015c;
    }

    public BleScanException(int i, Date date) {
        super(m45867a(i, date));
        this.f75014b = i;
        this.f75015c = date;
    }

    public BleScanException(int i, Throwable th) {
        super(m45867a(i, null), th);
        this.f75014b = i;
        this.f75015c = null;
    }
}
