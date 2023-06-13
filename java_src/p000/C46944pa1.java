package p000;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import p000.AbstractC26856oB;
import p000.C31834Ay5;
/* renamed from: pa1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C46944pa1 implements InterfaceC42049hJ3, AbstractC26856oB.InterfaceC26858b, InterfaceC32407Dk2 {

    /* renamed from: b */
    public final String f103810b;

    /* renamed from: c */
    public final RD2 f103811c;

    /* renamed from: d */
    public final AbstractC26856oB<?, PointF> f103812d;

    /* renamed from: e */
    public final AbstractC26856oB<?, PointF> f103813e;

    /* renamed from: f */
    public final C52961zj0 f103814f;

    /* renamed from: h */
    public boolean f103816h;

    /* renamed from: a */
    public final Path f103809a = new Path();

    /* renamed from: g */
    public final C50107uu0 f103815g = new C50107uu0();

    public C46944pa1(RD2 rd2, AbstractC27525qB abstractC27525qB, C52961zj0 c52961zj0) {
        this.f103810b = c52961zj0.m482b();
        this.f103811c = rd2;
        AbstractC26856oB<PointF, PointF> mo951a = c52961zj0.m480d().mo951a();
        this.f103812d = mo951a;
        AbstractC26856oB<PointF, PointF> mo951a2 = c52961zj0.m481c().mo951a();
        this.f103813e = mo951a2;
        this.f103814f = c52961zj0;
        abstractC27525qB.m17981i(mo951a);
        abstractC27525qB.m17981i(mo951a2);
        mo951a.m21665a(this);
        mo951a2.m21665a(this);
    }

    /* renamed from: b */
    public final void m19103b() {
        this.f103816h = false;
        this.f103811c.invalidateSelf();
    }

    @Override // p000.InterfaceC32173Ck2
    /* renamed from: c */
    public void mo14523c(C31939Bk2 c31939Bk2, int i, List<C31939Bk2> list, C31939Bk2 c31939Bk22) {
        C48077rU2.m15909k(c31939Bk2, i, list, c31939Bk22, this);
    }

    @Override // p000.AbstractC26856oB.InterfaceC26858b
    /* renamed from: e */
    public void mo4989e() {
        m19103b();
    }

    @Override // p000.InterfaceC36752Vz0
    /* renamed from: f */
    public void mo4988f(List<InterfaceC36752Vz0> list, List<InterfaceC36752Vz0> list2) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC36752Vz0 interfaceC36752Vz0 = list.get(i);
            if (interfaceC36752Vz0 instanceof C51691xa6) {
                C51691xa6 c51691xa6 = (C51691xa6) interfaceC36752Vz0;
                if (c51691xa6.m4985j() == C31834Ay5.EnumC0364a.SIMULTANEOUSLY) {
                    this.f103815g.m9539a(c51691xa6);
                    c51691xa6.m4991b(this);
                }
            }
        }
    }

    @Override // p000.InterfaceC36752Vz0
    public String getName() {
        return this.f103810b;
    }

    @Override // p000.InterfaceC42049hJ3
    public Path getPath() {
        if (this.f103816h) {
            return this.f103809a;
        }
        this.f103809a.reset();
        if (this.f103814f.m479e()) {
            this.f103816h = true;
            return this.f103809a;
        }
        PointF mo21658h = this.f103812d.mo21658h();
        float f = mo21658h.x / 2.0f;
        float f2 = mo21658h.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.f103809a.reset();
        if (this.f103814f.m478f()) {
            float f5 = -f2;
            this.f103809a.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.f103809a.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            this.f103809a.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            this.f103809a.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.f103809a.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.f103809a.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            this.f103809a.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            this.f103809a.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            this.f103809a.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.f103809a.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF mo21658h2 = this.f103813e.mo21658h();
        this.f103809a.offset(mo21658h2.x, mo21658h2.y);
        this.f103809a.close();
        this.f103815g.m9538b(this.f103809a);
        this.f103816h = true;
        return this.f103809a;
    }

    @Override // p000.InterfaceC32173Ck2
    /* renamed from: h */
    public <T> void mo3374h(T t, C41410gE2<T> c41410gE2) {
        if (t == InterfaceC37835aE2.f50122k) {
            this.f103812d.m21653n(c41410gE2);
        } else if (t == InterfaceC37835aE2.f50125n) {
            this.f103813e.m21653n(c41410gE2);
        }
    }
}
