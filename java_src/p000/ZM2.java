package p000;
/* renamed from: ZM2 */
/* loaded from: classes6.dex */
public final class ZM2 {
    private ZM2() {
    }

    /* renamed from: a */
    public static int m73240a(String str, int i) {
        if (i > 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append(str);
        sb.append(" (");
        sb.append(i);
        sb.append(") must be > 0");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public static void m73239b(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
