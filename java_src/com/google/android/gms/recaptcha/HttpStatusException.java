package com.google.android.gms.recaptcha;
/* loaded from: classes6.dex */
public class HttpStatusException extends Exception {

    /* renamed from: b */
    public final int f71774b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HttpStatusException(String str, int i) {
        super(r1.toString());
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
        sb.append(str);
        sb.append(" - status: ");
        sb.append(i);
        this.f71774b = i;
    }

    /* renamed from: a */
    public int m50551a() {
        return this.f71774b;
    }
}
