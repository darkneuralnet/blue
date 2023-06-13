package p000;

import android.graphics.PointF;
import java.util.Collections;
/* renamed from: bO5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C38521bO5 extends AbstractC26856oB<PointF, PointF> {

    /* renamed from: i */
    public final PointF f57376i;

    /* renamed from: j */
    public final PointF f57377j;

    /* renamed from: k */
    public final AbstractC26856oB<Float, Float> f57378k;

    /* renamed from: l */
    public final AbstractC26856oB<Float, Float> f57379l;

    /* renamed from: m */
    public C41410gE2<Float> f57380m;

    /* renamed from: n */
    public C41410gE2<Float> f57381n;

    public C38521bO5(AbstractC26856oB<Float, Float> abstractC26856oB, AbstractC26856oB<Float, Float> abstractC26856oB2) {
        super(Collections.emptyList());
        this.f57376i = new PointF();
        this.f57377j = new PointF();
        this.f57378k = abstractC26856oB;
        this.f57379l = abstractC26856oB2;
        mo21654m(m21660f());
    }

    @Override // p000.AbstractC26856oB
    /* renamed from: m */
    public void mo21654m(float f) {
        this.f57378k.mo21654m(f);
        this.f57379l.mo21654m(f);
        this.f57376i.set(this.f57378k.mo21658h().floatValue(), this.f57379l.mo21658h().floatValue());
        for (int i = 0; i < this.f101563a.size(); i++) {
            this.f101563a.get(i).mo4989e();
        }
    }

    @Override // p000.AbstractC26856oB
    /* renamed from: p */
    public PointF mo21658h() {
        return mo11803i(null, 0.0f);
    }

    @Override // p000.AbstractC26856oB
    /* renamed from: q */
    public PointF mo11803i(C41125fl2<PointF> c41125fl2, float f) {
        Float f2;
        C41125fl2<Float> m21664b;
        float floatValue;
        C41125fl2<Float> m21664b2;
        float floatValue2;
        Float f3 = null;
        if (this.f57380m != null && (m21664b2 = this.f57378k.m21664b()) != null) {
            float m21662d = this.f57378k.m21662d();
            Float f4 = m21664b2.f80570h;
            C41410gE2<Float> c41410gE2 = this.f57380m;
            float f5 = m21664b2.f80569g;
            if (f4 == null) {
                floatValue2 = f5;
            } else {
                floatValue2 = f4.floatValue();
            }
            f2 = c41410gE2.m39822b(f5, floatValue2, m21664b2.f80564b, m21664b2.f80565c, f, f, m21662d);
        } else {
            f2 = null;
        }
        if (this.f57381n != null && (m21664b = this.f57379l.m21664b()) != null) {
            float m21662d2 = this.f57379l.m21662d();
            Float f6 = m21664b.f80570h;
            C41410gE2<Float> c41410gE22 = this.f57381n;
            float f7 = m21664b.f80569g;
            if (f6 == null) {
                floatValue = f7;
            } else {
                floatValue = f6.floatValue();
            }
            f3 = c41410gE22.m39822b(f7, floatValue, m21664b.f80564b, m21664b.f80565c, f, f, m21662d2);
        }
        if (f2 == null) {
            this.f57377j.set(this.f57376i.x, 0.0f);
        } else {
            this.f57377j.set(f2.floatValue(), 0.0f);
        }
        if (f3 == null) {
            PointF pointF = this.f57377j;
            pointF.set(pointF.x, this.f57376i.y);
        } else {
            PointF pointF2 = this.f57377j;
            pointF2.set(pointF2.x, f3.floatValue());
        }
        return this.f57377j;
    }

    /* renamed from: r */
    public void m64596r(C41410gE2<Float> c41410gE2) {
        C41410gE2<Float> c41410gE22 = this.f57380m;
        if (c41410gE22 != null) {
            c41410gE22.m39821c(null);
        }
        this.f57380m = c41410gE2;
        if (c41410gE2 != null) {
            c41410gE2.m39821c(this);
        }
    }

    /* renamed from: s */
    public void m64595s(C41410gE2<Float> c41410gE2) {
        C41410gE2<Float> c41410gE22 = this.f57381n;
        if (c41410gE22 != null) {
            c41410gE22.m39821c(null);
        }
        this.f57381n = c41410gE2;
        if (c41410gE2 != null) {
            c41410gE2.m39821c(this);
        }
    }
}
