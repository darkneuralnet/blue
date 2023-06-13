package p000;

import ch.qos.logback.core.CoreConstants;
/* renamed from: jj2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C43477jj2 {
    private C43477jj2() {
    }

    /* renamed from: a */
    public static String m30025a(int i, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 != 1 && i3 != 2) {
                if (i3 == 3 || i3 == 4 || i3 == 5) {
                    sb.append(CoreConstants.DOT);
                    String str = strArr[i2];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            } else {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            }
        }
        return sb.toString();
    }
}
