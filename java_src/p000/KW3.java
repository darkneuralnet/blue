package p000;

import android.graphics.PointF;
import java.util.List;
/* renamed from: KW3 */
/* loaded from: classes2.dex */
public class KW3 extends AbstractC41718gl2<PointF> {

    /* renamed from: i */
    public final PointF f19710i;

    public KW3(List<C41125fl2<PointF>> list) {
        super(list);
        this.f19710i = new PointF();
    }

    @Override // p000.AbstractC26856oB
    /* renamed from: p */
    public PointF mo11803i(C41125fl2<PointF> c41125fl2, float f) {
        return mo21657j(c41125fl2, f, f, f);
    }

    @Override // p000.AbstractC26856oB
    /* renamed from: q */
    public PointF mo21657j(C41125fl2<PointF> c41125fl2, float f, float f2, float f3) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = c41125fl2.f80564b;
        if (pointF3 != null && (pointF = c41125fl2.f80565c) != null) {
            PointF pointF4 = pointF3;
            PointF pointF5 = pointF;
            C41410gE2<A> c41410gE2 = this.f101567e;
            if (c41410gE2 != 0 && (pointF2 = (PointF) c41410gE2.m39822b(c41125fl2.f80569g, c41125fl2.f80570h.floatValue(), pointF4, pointF5, f, m21661e(), m21660f())) != null) {
                return pointF2;
            }
            PointF pointF6 = this.f19710i;
            float f4 = pointF4.x;
            float f5 = f4 + (f2 * (pointF5.x - f4));
            float f6 = pointF4.y;
            pointF6.set(f5, f6 + (f3 * (pointF5.y - f6)));
            return this.f19710i;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
