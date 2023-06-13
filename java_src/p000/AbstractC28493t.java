package p000;
/* renamed from: t */
/* loaded from: classes6.dex */
public abstract class AbstractC28493t extends AbstractC28494t0 {
    public AbstractC28493t(C1027CT c1027ct) {
        super(c1027ct);
    }

    /* renamed from: e */
    public static void m13283e(StringBuilder sb, int i) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 13; i4++) {
            int charAt = sb.charAt(i4 + i) - '0';
            if ((i4 & 1) == 0) {
                charAt *= 3;
            }
            i3 += charAt;
        }
        int i5 = 10 - (i3 % 10);
        if (i5 != 10) {
            i2 = i5;
        }
        sb.append(i2);
    }

    /* renamed from: f */
    public final void m13282f(StringBuilder sb, int i) {
        sb.append("(01)");
        int length = sb.length();
        sb.append('9');
        m13281g(sb, i, length);
    }

    /* renamed from: g */
    public final void m13281g(StringBuilder sb, int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            int m36656f = m13279b().m36656f((i3 * 10) + i, 10);
            if (m36656f / 100 == 0) {
                sb.append('0');
            }
            if (m36656f / 10 == 0) {
                sb.append('0');
            }
            sb.append(m36656f);
        }
        m13283e(sb, i2);
    }
}
