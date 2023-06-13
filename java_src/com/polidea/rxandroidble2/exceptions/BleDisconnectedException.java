package com.polidea.rxandroidble2.exceptions;
/* loaded from: classes6.dex */
public class BleDisconnectedException extends BleException {

    /* renamed from: b */
    public final String f75007b;

    /* renamed from: c */
    public final int f75008c;

    @Deprecated
    public BleDisconnectedException() {
        this("", -1);
    }

    /* renamed from: a */
    public static BleDisconnectedException m45872a(String str) {
        return new BleDisconnectedException(new BleAdapterDisabledException(), str, -1);
    }

    /* renamed from: b */
    public static String m45871b(String str, int i) {
        String m75477a = YA1.m75477a(i);
        return "Disconnected from " + C35098Ox2.m91172d(str) + " with status " + i + " (" + m75477a + ")";
    }

    public BleDisconnectedException(Throwable th, String str, int i) {
        super(m45871b(str, i), th);
        this.f75007b = str;
        this.f75008c = i;
    }

    public BleDisconnectedException(String str, int i) {
        super(m45871b(str, i));
        this.f75007b = str;
        this.f75008c = i;
    }
}
