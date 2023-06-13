package com.facebook;
/* loaded from: classes5.dex */
public class FacebookDialogException extends FacebookException {
    static final long serialVersionUID = 1;

    /* renamed from: c */
    public int f69354c;

    /* renamed from: d */
    public String f69355d;

    public FacebookDialogException(String str, int i, String str2) {
        super(str);
        this.f69354c = i;
        this.f69355d = str2;
    }

    /* renamed from: a */
    public int m52869a() {
        return this.f69354c;
    }

    /* renamed from: b */
    public String m52868b() {
        return this.f69355d;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public final String toString() {
        return "{FacebookDialogException: errorCode: " + m52869a() + ", message: " + getMessage() + ", url: " + m52868b() + "}";
    }
}
