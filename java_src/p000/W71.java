package p000;

import android.graphics.Color;
import android.graphics.Paint;
import p000.AbstractC26856oB;
/* renamed from: W71 */
/* loaded from: classes2.dex */
public class W71 implements AbstractC26856oB.InterfaceC26858b {

    /* renamed from: a */
    public final AbstractC26856oB.InterfaceC26858b f40435a;

    /* renamed from: b */
    public final AbstractC26856oB<Integer, Integer> f40436b;

    /* renamed from: c */
    public final AbstractC26856oB<Float, Float> f40437c;

    /* renamed from: d */
    public final AbstractC26856oB<Float, Float> f40438d;

    /* renamed from: e */
    public final AbstractC26856oB<Float, Float> f40439e;

    /* renamed from: f */
    public final AbstractC26856oB<Float, Float> f40440f;

    /* renamed from: g */
    public boolean f40441g = true;

    /* renamed from: W71$a */
    /* loaded from: classes2.dex */
    public class C8939a extends C41410gE2<Float> {

        /* renamed from: d */
        public final /* synthetic */ C41410gE2 f40442d;

        public C8939a(C41410gE2 c41410gE2) {
            this.f40442d = c41410gE2;
        }

        @Override // p000.C41410gE2
        /* renamed from: d */
        public Float mo39823a(TD2<Float> td2) {
            Float f = (Float) this.f40442d.mo39823a(td2);
            if (f == null) {
                return null;
            }
            return Float.valueOf(f.floatValue() * 2.55f);
        }
    }

    public W71(AbstractC26856oB.InterfaceC26858b interfaceC26858b, AbstractC27525qB abstractC27525qB, U71 u71) {
        this.f40435a = interfaceC26858b;
        AbstractC26856oB<Integer, Integer> mo951a = u71.m81949a().mo951a();
        this.f40436b = mo951a;
        mo951a.m21665a(this);
        abstractC27525qB.m17981i(mo951a);
        AbstractC26856oB<Float, Float> mo951a2 = u71.m81946d().mo951a();
        this.f40437c = mo951a2;
        mo951a2.m21665a(this);
        abstractC27525qB.m17981i(mo951a2);
        AbstractC26856oB<Float, Float> mo951a3 = u71.m81948b().mo951a();
        this.f40438d = mo951a3;
        mo951a3.m21665a(this);
        abstractC27525qB.m17981i(mo951a3);
        AbstractC26856oB<Float, Float> mo951a4 = u71.m81947c().mo951a();
        this.f40439e = mo951a4;
        mo951a4.m21665a(this);
        abstractC27525qB.m17981i(mo951a4);
        AbstractC26856oB<Float, Float> mo951a5 = u71.m81945e().mo951a();
        this.f40440f = mo951a5;
        mo951a5.m21665a(this);
        abstractC27525qB.m17981i(mo951a5);
    }

    /* renamed from: a */
    public void m78813a(Paint paint) {
        if (!this.f40441g) {
            return;
        }
        this.f40441g = false;
        double floatValue = this.f40438d.mo21658h().floatValue() * 0.017453292519943295d;
        float floatValue2 = this.f40439e.mo21658h().floatValue();
        float sin = ((float) Math.sin(floatValue)) * floatValue2;
        float cos = ((float) Math.cos(floatValue + 3.141592653589793d)) * floatValue2;
        int intValue = this.f40436b.mo21658h().intValue();
        paint.setShadowLayer(this.f40440f.mo21658h().floatValue(), sin, cos, Color.argb(Math.round(this.f40437c.mo21658h().floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
    }

    /* renamed from: b */
    public void m78812b(C41410gE2<Integer> c41410gE2) {
        this.f40436b.m21653n(c41410gE2);
    }

    /* renamed from: c */
    public void m78811c(C41410gE2<Float> c41410gE2) {
        this.f40438d.m21653n(c41410gE2);
    }

    /* renamed from: d */
    public void m78810d(C41410gE2<Float> c41410gE2) {
        this.f40439e.m21653n(c41410gE2);
    }

    @Override // p000.AbstractC26856oB.InterfaceC26858b
    /* renamed from: e */
    public void mo4989e() {
        this.f40441g = true;
        this.f40435a.mo4989e();
    }

    /* renamed from: f */
    public void m78809f(C41410gE2<Float> c41410gE2) {
        if (c41410gE2 == null) {
            this.f40437c.m21653n(null);
        } else {
            this.f40437c.m21653n(new C8939a(c41410gE2));
        }
    }

    /* renamed from: g */
    public void m78808g(C41410gE2<Float> c41410gE2) {
        this.f40440f.m21653n(c41410gE2);
    }
}
