package p000;

import java.util.List;
/* renamed from: N52 */
/* loaded from: classes2.dex */
public class N52 extends AbstractC41718gl2<Integer> {
    public N52(List<C41125fl2<Integer>> list) {
        super(list);
    }

    /* renamed from: p */
    public int m94386p() {
        return m94385q(m21664b(), m21662d());
    }

    /* renamed from: q */
    public int m94385q(C41125fl2<Integer> c41125fl2, float f) {
        Integer num;
        if (c41125fl2.f80564b != null && c41125fl2.f80565c != null) {
            C41410gE2<A> c41410gE2 = this.f101567e;
            if (c41410gE2 != 0 && (num = (Integer) c41410gE2.m39822b(c41125fl2.f80569g, c41125fl2.f80570h.floatValue(), c41125fl2.f80564b, c41125fl2.f80565c, f, m21661e(), m21660f())) != null) {
                return num.intValue();
            }
            return C48077rU2.m15910j(c41125fl2.m40900h(), c41125fl2.m40903e(), f);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    @Override // p000.AbstractC26856oB
    /* renamed from: r */
    public Integer mo11803i(C41125fl2<Integer> c41125fl2, float f) {
        return Integer.valueOf(m94385q(c41125fl2, f));
    }
}
