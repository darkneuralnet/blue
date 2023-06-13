package p000;
/* renamed from: u */
/* loaded from: classes6.dex */
public abstract class AbstractC28976u extends AbstractC28493t {
    public AbstractC28976u(C1027CT c1027ct) {
        super(c1027ct);
    }

    /* renamed from: h */
    public abstract void mo11115h(StringBuilder sb, int i);

    /* renamed from: i */
    public abstract int mo11114i(int i);

    /* renamed from: j */
    public final void m11113j(StringBuilder sb, int i, int i2) {
        int m36656f = m13279b().m36656f(i, i2);
        mo11115h(sb, m36656f);
        int mo11114i = mo11114i(m36656f);
        int i3 = 100000;
        for (int i4 = 0; i4 < 5; i4++) {
            if (mo11114i / i3 == 0) {
                sb.append('0');
            }
            i3 /= 10;
        }
        sb.append(mo11114i);
    }
}
