package p000;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;
import p000.AbstractC26856oB;
import p000.C31834Ay5;
/* renamed from: Us4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C36459Us4 implements AbstractC26856oB.InterfaceC26858b, InterfaceC32407Dk2, InterfaceC42049hJ3 {

    /* renamed from: c */
    public final String f38186c;

    /* renamed from: d */
    public final boolean f38187d;

    /* renamed from: e */
    public final RD2 f38188e;

    /* renamed from: f */
    public final AbstractC26856oB<?, PointF> f38189f;

    /* renamed from: g */
    public final AbstractC26856oB<?, PointF> f38190g;

    /* renamed from: h */
    public final AbstractC26856oB<?, Float> f38191h;

    /* renamed from: k */
    public boolean f38194k;

    /* renamed from: a */
    public final Path f38184a = new Path();

    /* renamed from: b */
    public final RectF f38185b = new RectF();

    /* renamed from: i */
    public final C50107uu0 f38192i = new C50107uu0();

    /* renamed from: j */
    public AbstractC26856oB<Float, Float> f38193j = null;

    public C36459Us4(RD2 rd2, AbstractC27525qB abstractC27525qB, C37395Ys4 c37395Ys4) {
        this.f38186c = c37395Ys4.m74049c();
        this.f38187d = c37395Ys4.m74046f();
        this.f38188e = rd2;
        AbstractC26856oB<PointF, PointF> mo951a = c37395Ys4.m74048d().mo951a();
        this.f38189f = mo951a;
        AbstractC26856oB<PointF, PointF> mo951a2 = c37395Ys4.m74047e().mo951a();
        this.f38190g = mo951a2;
        AbstractC26856oB<Float, Float> mo951a3 = c37395Ys4.m74050b().mo951a();
        this.f38191h = mo951a3;
        abstractC27525qB.m17981i(mo951a);
        abstractC27525qB.m17981i(mo951a2);
        abstractC27525qB.m17981i(mo951a3);
        mo951a.m21665a(this);
        mo951a2.m21665a(this);
        mo951a3.m21665a(this);
    }

    /* renamed from: b */
    public final void m80685b() {
        this.f38194k = false;
        this.f38188e.invalidateSelf();
    }

    @Override // p000.InterfaceC32173Ck2
    /* renamed from: c */
    public void mo14523c(C31939Bk2 c31939Bk2, int i, List<C31939Bk2> list, C31939Bk2 c31939Bk22) {
        C48077rU2.m15909k(c31939Bk2, i, list, c31939Bk22, this);
    }

    @Override // p000.AbstractC26856oB.InterfaceC26858b
    /* renamed from: e */
    public void mo4989e() {
        m80685b();
    }

    @Override // p000.InterfaceC36752Vz0
    /* renamed from: f */
    public void mo4988f(List<InterfaceC36752Vz0> list, List<InterfaceC36752Vz0> list2) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC36752Vz0 interfaceC36752Vz0 = list.get(i);
            if (interfaceC36752Vz0 instanceof C51691xa6) {
                C51691xa6 c51691xa6 = (C51691xa6) interfaceC36752Vz0;
                if (c51691xa6.m4985j() == C31834Ay5.EnumC0364a.SIMULTANEOUSLY) {
                    this.f38192i.m9539a(c51691xa6);
                    c51691xa6.m4991b(this);
                }
            }
            if (interfaceC36752Vz0 instanceof C41038fc5) {
                this.f38193j = ((C41038fc5) interfaceC36752Vz0).m41109h();
            }
        }
    }

    @Override // p000.InterfaceC36752Vz0
    public String getName() {
        return this.f38186c;
    }

    @Override // p000.InterfaceC42049hJ3
    public Path getPath() {
        float m20303p;
        AbstractC26856oB<Float, Float> abstractC26856oB;
        if (this.f38194k) {
            return this.f38184a;
        }
        this.f38184a.reset();
        if (this.f38187d) {
            this.f38194k = true;
            return this.f38184a;
        }
        PointF mo21658h = this.f38190g.mo21658h();
        float f = mo21658h.x / 2.0f;
        float f2 = mo21658h.y / 2.0f;
        AbstractC26856oB<?, Float> abstractC26856oB2 = this.f38191h;
        if (abstractC26856oB2 == null) {
            m20303p = 0.0f;
        } else {
            m20303p = ((C46551ou1) abstractC26856oB2).m20303p();
        }
        if (m20303p == 0.0f && (abstractC26856oB = this.f38193j) != null) {
            m20303p = Math.min(abstractC26856oB.mo21658h().floatValue(), Math.min(f, f2));
        }
        float min = Math.min(f, f2);
        if (m20303p > min) {
            m20303p = min;
        }
        PointF mo21658h2 = this.f38189f.mo21658h();
        this.f38184a.moveTo(mo21658h2.x + f, (mo21658h2.y - f2) + m20303p);
        this.f38184a.lineTo(mo21658h2.x + f, (mo21658h2.y + f2) - m20303p);
        int i = (m20303p > 0.0f ? 1 : (m20303p == 0.0f ? 0 : -1));
        if (i > 0) {
            RectF rectF = this.f38185b;
            float f3 = mo21658h2.x;
            float f4 = m20303p * 2.0f;
            float f5 = mo21658h2.y;
            rectF.set((f3 + f) - f4, (f5 + f2) - f4, f3 + f, f5 + f2);
            this.f38184a.arcTo(this.f38185b, 0.0f, 90.0f, false);
        }
        this.f38184a.lineTo((mo21658h2.x - f) + m20303p, mo21658h2.y + f2);
        if (i > 0) {
            RectF rectF2 = this.f38185b;
            float f6 = mo21658h2.x;
            float f7 = mo21658h2.y;
            float f8 = m20303p * 2.0f;
            rectF2.set(f6 - f, (f7 + f2) - f8, (f6 - f) + f8, f7 + f2);
            this.f38184a.arcTo(this.f38185b, 90.0f, 90.0f, false);
        }
        this.f38184a.lineTo(mo21658h2.x - f, (mo21658h2.y - f2) + m20303p);
        if (i > 0) {
            RectF rectF3 = this.f38185b;
            float f9 = mo21658h2.x;
            float f10 = mo21658h2.y;
            float f11 = m20303p * 2.0f;
            rectF3.set(f9 - f, f10 - f2, (f9 - f) + f11, (f10 - f2) + f11);
            this.f38184a.arcTo(this.f38185b, 180.0f, 90.0f, false);
        }
        this.f38184a.lineTo((mo21658h2.x + f) - m20303p, mo21658h2.y - f2);
        if (i > 0) {
            RectF rectF4 = this.f38185b;
            float f12 = mo21658h2.x;
            float f13 = m20303p * 2.0f;
            float f14 = mo21658h2.y;
            rectF4.set((f12 + f) - f13, f14 - f2, f12 + f, (f14 - f2) + f13);
            this.f38184a.arcTo(this.f38185b, 270.0f, 90.0f, false);
        }
        this.f38184a.close();
        this.f38192i.m9538b(this.f38184a);
        this.f38194k = true;
        return this.f38184a;
    }

    @Override // p000.InterfaceC32173Ck2
    /* renamed from: h */
    public <T> void mo3374h(T t, C41410gE2<T> c41410gE2) {
        if (t == InterfaceC37835aE2.f50123l) {
            this.f38190g.m21653n(c41410gE2);
        } else if (t == InterfaceC37835aE2.f50125n) {
            this.f38189f.m21653n(c41410gE2);
        } else if (t == InterfaceC37835aE2.f50124m) {
            this.f38191h.m21653n(c41410gE2);
        }
    }
}
