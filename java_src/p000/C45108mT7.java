package p000;

import java.util.Locale;
/* renamed from: mT7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C45108mT7 extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C45108mT7(int i) {
        super(String.format(r1, r3.toString(), Integer.valueOf(i)));
        String m23606a = C45710nU7.m23606a(2);
        Locale locale = Locale.getDefault();
        StringBuilder sb = new StringBuilder(String.valueOf(m23606a).length() + 3);
        sb.append(m23606a);
        sb.append(" %d");
    }
}
