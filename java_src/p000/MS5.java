package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
/* renamed from: MS5 */
/* loaded from: classes2.dex */
public class MS5 extends AbstractC28243sE {

    /* renamed from: r */
    public final AbstractC27525qB f23135r;

    /* renamed from: s */
    public final String f23136s;

    /* renamed from: t */
    public final boolean f23137t;

    /* renamed from: u */
    public final AbstractC26856oB<Integer, Integer> f23138u;

    /* renamed from: v */
    public AbstractC26856oB<ColorFilter, ColorFilter> f23139v;

    public MS5(RD2 rd2, AbstractC27525qB abstractC27525qB, C52523yy5 c52523yy5) {
        super(rd2, abstractC27525qB, c52523yy5.m2196b().m2185b(), c52523yy5.m2193e().m2183b(), c52523yy5.m2191g(), c52523yy5.m2189i(), c52523yy5.m2188j(), c52523yy5.m2192f(), c52523yy5.m2194d());
        this.f23135r = abstractC27525qB;
        this.f23136s = c52523yy5.m2190h();
        this.f23137t = c52523yy5.m2187k();
        AbstractC26856oB<Integer, Integer> mo951a = c52523yy5.m2195c().mo951a();
        this.f23138u = mo951a;
        mo951a.m21665a(this);
        abstractC27525qB.m17981i(mo951a);
    }

    @Override // p000.AbstractC28243sE, p000.InterfaceC46680p71
    /* renamed from: d */
    public void mo14522d(Canvas canvas, Matrix matrix, int i) {
        if (this.f23137t) {
            return;
        }
        this.f108471i.setColor(((C49434tm0) this.f23138u).m11802p());
        AbstractC26856oB<ColorFilter, ColorFilter> abstractC26856oB = this.f23139v;
        if (abstractC26856oB != null) {
            this.f108471i.setColorFilter(abstractC26856oB.mo21658h());
        }
        super.mo14522d(canvas, matrix, i);
    }

    @Override // p000.InterfaceC36752Vz0
    public String getName() {
        return this.f23136s;
    }

    @Override // p000.AbstractC28243sE, p000.InterfaceC32173Ck2
    /* renamed from: h */
    public <T> void mo3374h(T t, C41410gE2<T> c41410gE2) {
        super.mo3374h(t, c41410gE2);
        if (t == InterfaceC37835aE2.f50113b) {
            this.f23138u.m21653n(c41410gE2);
        } else if (t == InterfaceC37835aE2.f50107K) {
            AbstractC26856oB<ColorFilter, ColorFilter> abstractC26856oB = this.f23139v;
            if (abstractC26856oB != null) {
                this.f23135r.m17989G(abstractC26856oB);
            }
            if (c41410gE2 == null) {
                this.f23139v = null;
                return;
            }
            C32168Cj6 c32168Cj6 = new C32168Cj6(c41410gE2);
            this.f23139v = c32168Cj6;
            c32168Cj6.m21665a(this);
            this.f23135r.m17981i(this.f23138u);
        }
    }
}
