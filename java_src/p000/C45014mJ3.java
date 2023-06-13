package p000;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;
/* renamed from: mJ3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C45014mJ3 extends AbstractC41718gl2<PointF> {

    /* renamed from: i */
    public final PointF f97810i;

    /* renamed from: j */
    public final float[] f97811j;

    /* renamed from: k */
    public final PathMeasure f97812k;

    /* renamed from: l */
    public C44421lJ3 f97813l;

    public C45014mJ3(List<? extends C41125fl2<PointF>> list) {
        super(list);
        this.f97810i = new PointF();
        this.f97811j = new float[2];
        this.f97812k = new PathMeasure();
    }

    @Override // p000.AbstractC26856oB
    /* renamed from: p */
    public PointF mo11803i(C41125fl2<PointF> c41125fl2, float f) {
        PointF pointF;
        C44421lJ3 c44421lJ3 = (C44421lJ3) c41125fl2;
        Path m27427k = c44421lJ3.m27427k();
        if (m27427k == null) {
            return c41125fl2.f80564b;
        }
        C41410gE2<A> c41410gE2 = this.f101567e;
        if (c41410gE2 != 0 && (pointF = (PointF) c41410gE2.m39822b(c44421lJ3.f80569g, c44421lJ3.f80570h.floatValue(), (PointF) c44421lJ3.f80564b, (PointF) c44421lJ3.f80565c, m21661e(), f, m21660f())) != null) {
            return pointF;
        }
        if (this.f97813l != c44421lJ3) {
            this.f97812k.setPath(m27427k, false);
            this.f97813l = c44421lJ3;
        }
        PathMeasure pathMeasure = this.f97812k;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.f97811j, null);
        PointF pointF2 = this.f97810i;
        float[] fArr = this.f97811j;
        pointF2.set(fArr[0], fArr[1]);
        return this.f97810i;
    }
}
