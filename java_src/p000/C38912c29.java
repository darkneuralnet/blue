package p000;
/* renamed from: c29  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C38912c29 {
    /* renamed from: a */
    public static void m61997a(boolean z, String str, long j, long j2) {
        if (z) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 54);
        sb.append("overflow: ");
        sb.append(str);
        sb.append("(");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(")");
        throw new ArithmeticException(sb.toString());
    }

    /* renamed from: b */
    public static void m61996b(boolean z) {
        if (z) {
            return;
        }
        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
    }
}
