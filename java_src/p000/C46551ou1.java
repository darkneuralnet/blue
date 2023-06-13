package p000;

import java.util.List;
/* renamed from: ou1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C46551ou1 extends AbstractC41718gl2<Float> {
    public C46551ou1(List<C41125fl2<Float>> list) {
        super(list);
    }

    /* renamed from: p */
    public float m20303p() {
        return m20302q(m21664b(), m21662d());
    }

    /* renamed from: q */
    public float m20302q(C41125fl2<Float> c41125fl2, float f) {
        Float f2;
        if (c41125fl2.f80564b != null && c41125fl2.f80565c != null) {
            C41410gE2<A> c41410gE2 = this.f101567e;
            if (c41410gE2 != 0 && (f2 = (Float) c41410gE2.m39822b(c41125fl2.f80569g, c41125fl2.f80570h.floatValue(), c41125fl2.f80564b, c41125fl2.f80565c, f, m21661e(), m21660f())) != null) {
                return f2.floatValue();
            }
            return C48077rU2.m15911i(c41125fl2.m40901g(), c41125fl2.m40904d(), f);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    @Override // p000.AbstractC26856oB
    /* renamed from: r */
    public Float mo11803i(C41125fl2<Float> c41125fl2, float f) {
        return Float.valueOf(m20302q(c41125fl2, f));
    }
}
