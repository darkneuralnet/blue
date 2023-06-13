package com.nimbusds.jose;
/* loaded from: classes6.dex */
public class KeyLengthException extends KeyException {

    /* renamed from: b */
    public final int f74968b;

    /* renamed from: c */
    public final C1744E9 f74969c;

    public KeyLengthException(String str) {
        super(str);
        this.f74968b = 0;
        this.f74969c = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public KeyLengthException(int i, C1744E9 c1744e9) {
        super(r0.toString());
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            str = "The expected key length is " + i + " bits";
        } else {
            str = "Unexpected key length";
        }
        sb.append(str);
        if (c1744e9 != null) {
            str2 = " (for " + c1744e9 + " algorithm)";
        } else {
            str2 = "";
        }
        sb.append(str2);
        this.f74968b = i;
        this.f74969c = c1744e9;
    }
}
