package p000;

import java.util.Map;
/* renamed from: Z31 */
/* loaded from: classes8.dex */
public abstract class Z31 {

    /* renamed from: a */
    public static Z31 f47787a = new C49804uO5();

    /* renamed from: a */
    public static Z31 m73798a() {
        return f47787a;
    }

    /* renamed from: b */
    public AbstractC26779o0 m73797b(V31 v31) {
        Map<? extends V31, Integer> mo64212e = v31.mo64212e();
        if (mo64212e == null) {
            return AbstractC26779o0.f101189c;
        }
        AbstractC26779o0 abstractC26779o0 = AbstractC26779o0.f101189c;
        for (Map.Entry<? extends V31, Integer> entry : mo64212e.entrySet()) {
            AbstractC26779o0 m73797b = m73797b(entry.getKey());
            if (m73797b.mo22026D()) {
                int intValue = entry.getValue().intValue();
                if (intValue < 0) {
                    intValue = -intValue;
                    m73797b = m73797b.mo22025b();
                }
                for (int i = 0; i < intValue; i++) {
                    abstractC26779o0 = (AbstractC26779o0) abstractC26779o0.mo22030c(m73797b);
                }
            } else {
                throw new UnsupportedOperationException("Non-linear dimensional transform");
            }
        }
        return abstractC26779o0;
    }

    /* renamed from: c */
    public V31 m73796c(V31 v31) {
        Map<? extends V31, Integer> mo64212e = v31.mo64212e();
        if (mo64212e == null) {
            return v31;
        }
        V31 v312 = C38670be6.f57823d;
        for (Map.Entry<? extends V31, Integer> entry : mo64212e.entrySet()) {
            v312 = v312.mo64211f(m73796c(entry.getKey())).mo64213d(entry.getValue().intValue());
        }
        return v312;
    }
}
