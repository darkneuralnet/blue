package p000;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import p000.AbstractC26856oB;
import p000.C31834Ay5;
import p000.XX3;
/* renamed from: WX3 */
/* loaded from: classes2.dex */
public class WX3 implements InterfaceC42049hJ3, AbstractC26856oB.InterfaceC26858b, InterfaceC32407Dk2 {

    /* renamed from: b */
    public final String f41236b;

    /* renamed from: c */
    public final RD2 f41237c;

    /* renamed from: d */
    public final XX3.EnumC9423a f41238d;

    /* renamed from: e */
    public final boolean f41239e;

    /* renamed from: f */
    public final boolean f41240f;

    /* renamed from: g */
    public final AbstractC26856oB<?, Float> f41241g;

    /* renamed from: h */
    public final AbstractC26856oB<?, PointF> f41242h;

    /* renamed from: i */
    public final AbstractC26856oB<?, Float> f41243i;

    /* renamed from: j */
    public final AbstractC26856oB<?, Float> f41244j;

    /* renamed from: k */
    public final AbstractC26856oB<?, Float> f41245k;

    /* renamed from: l */
    public final AbstractC26856oB<?, Float> f41246l;

    /* renamed from: m */
    public final AbstractC26856oB<?, Float> f41247m;

    /* renamed from: o */
    public boolean f41249o;

    /* renamed from: a */
    public final Path f41235a = new Path();

    /* renamed from: n */
    public final C50107uu0 f41248n = new C50107uu0();

    /* renamed from: WX3$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C9080a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f41250a;

        static {
            int[] iArr = new int[XX3.EnumC9423a.values().length];
            f41250a = iArr;
            try {
                iArr[XX3.EnumC9423a.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41250a[XX3.EnumC9423a.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public WX3(RD2 rd2, AbstractC27525qB abstractC27525qB, XX3 xx3) {
        this.f41237c = rd2;
        this.f41236b = xx3.m76906d();
        XX3.EnumC9423a m76900j = xx3.m76900j();
        this.f41238d = m76900j;
        this.f41239e = xx3.m76899k();
        this.f41240f = xx3.m76898l();
        AbstractC26856oB<Float, Float> mo951a = xx3.m76903g().mo951a();
        this.f41241g = mo951a;
        AbstractC26856oB<PointF, PointF> mo951a2 = xx3.m76902h().mo951a();
        this.f41242h = mo951a2;
        AbstractC26856oB<Float, Float> mo951a3 = xx3.m76901i().mo951a();
        this.f41243i = mo951a3;
        AbstractC26856oB<Float, Float> mo951a4 = xx3.m76905e().mo951a();
        this.f41245k = mo951a4;
        AbstractC26856oB<Float, Float> mo951a5 = xx3.m76904f().mo951a();
        this.f41247m = mo951a5;
        XX3.EnumC9423a enumC9423a = XX3.EnumC9423a.STAR;
        if (m76900j == enumC9423a) {
            this.f41244j = xx3.m76908b().mo951a();
            this.f41246l = xx3.m76907c().mo951a();
        } else {
            this.f41244j = null;
            this.f41246l = null;
        }
        abstractC27525qB.m17981i(mo951a);
        abstractC27525qB.m17981i(mo951a2);
        abstractC27525qB.m17981i(mo951a3);
        abstractC27525qB.m17981i(mo951a4);
        abstractC27525qB.m17981i(mo951a5);
        if (m76900j == enumC9423a) {
            abstractC27525qB.m17981i(this.f41244j);
            abstractC27525qB.m17981i(this.f41246l);
        }
        mo951a.m21665a(this);
        mo951a2.m21665a(this);
        mo951a3.m21665a(this);
        mo951a4.m21665a(this);
        mo951a5.m21665a(this);
        if (m76900j == enumC9423a) {
            this.f41244j.m21665a(this);
            this.f41246l.m21665a(this);
        }
    }

    /* renamed from: b */
    public final void m78248b() {
        double floatValue;
        int i;
        double d;
        double d2;
        double d3;
        int floor = (int) Math.floor(this.f41241g.mo21658h().floatValue());
        AbstractC26856oB<?, Float> abstractC26856oB = this.f41243i;
        if (abstractC26856oB == null) {
            floatValue = 0.0d;
        } else {
            floatValue = abstractC26856oB.mo21658h().floatValue();
        }
        double radians = Math.toRadians(floatValue - 90.0d);
        double d4 = floor;
        float floatValue2 = this.f41247m.mo21658h().floatValue() / 100.0f;
        float floatValue3 = this.f41245k.mo21658h().floatValue();
        double d5 = floatValue3;
        float cos = (float) (Math.cos(radians) * d5);
        float sin = (float) (Math.sin(radians) * d5);
        this.f41235a.moveTo(cos, sin);
        double d6 = (float) (6.283185307179586d / d4);
        double d7 = radians + d6;
        double ceil = Math.ceil(d4);
        int i2 = 0;
        while (i2 < ceil) {
            float cos2 = (float) (Math.cos(d7) * d5);
            double d8 = ceil;
            float sin2 = (float) (d5 * Math.sin(d7));
            if (floatValue2 != 0.0f) {
                d2 = d5;
                i = i2;
                d = d7;
                double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                float cos3 = (float) Math.cos(atan2);
                d3 = d6;
                double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                float f = floatValue3 * floatValue2 * 0.25f;
                this.f41235a.cubicTo(cos - (cos3 * f), sin - (((float) Math.sin(atan2)) * f), cos2 + (((float) Math.cos(atan22)) * f), sin2 + (f * ((float) Math.sin(atan22))), cos2, sin2);
            } else {
                i = i2;
                d = d7;
                d2 = d5;
                d3 = d6;
                this.f41235a.lineTo(cos2, sin2);
            }
            d7 = d + d3;
            i2 = i + 1;
            sin = sin2;
            cos = cos2;
            ceil = d8;
            d5 = d2;
            d6 = d3;
        }
        PointF mo21658h = this.f41242h.mo21658h();
        this.f41235a.offset(mo21658h.x, mo21658h.y);
        this.f41235a.close();
    }

    @Override // p000.InterfaceC32173Ck2
    /* renamed from: c */
    public void mo14523c(C31939Bk2 c31939Bk2, int i, List<C31939Bk2> list, C31939Bk2 c31939Bk22) {
        C48077rU2.m15909k(c31939Bk2, i, list, c31939Bk22, this);
    }

    @Override // p000.AbstractC26856oB.InterfaceC26858b
    /* renamed from: e */
    public void mo4989e() {
        m78246j();
    }

    @Override // p000.InterfaceC36752Vz0
    /* renamed from: f */
    public void mo4988f(List<InterfaceC36752Vz0> list, List<InterfaceC36752Vz0> list2) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC36752Vz0 interfaceC36752Vz0 = list.get(i);
            if (interfaceC36752Vz0 instanceof C51691xa6) {
                C51691xa6 c51691xa6 = (C51691xa6) interfaceC36752Vz0;
                if (c51691xa6.m4985j() == C31834Ay5.EnumC0364a.SIMULTANEOUSLY) {
                    this.f41248n.m9539a(c51691xa6);
                    c51691xa6.m4991b(this);
                }
            }
        }
    }

    @Override // p000.InterfaceC36752Vz0
    public String getName() {
        return this.f41236b;
    }

    @Override // p000.InterfaceC42049hJ3
    public Path getPath() {
        if (this.f41249o) {
            return this.f41235a;
        }
        this.f41235a.reset();
        if (this.f41239e) {
            this.f41249o = true;
            return this.f41235a;
        }
        int i = C9080a.f41250a[this.f41238d.ordinal()];
        if (i != 1) {
            if (i == 2) {
                m78248b();
            }
        } else {
            m78247i();
        }
        this.f41235a.close();
        this.f41248n.m9538b(this.f41235a);
        this.f41249o = true;
        return this.f41235a;
    }

    @Override // p000.InterfaceC32173Ck2
    /* renamed from: h */
    public <T> void mo3374h(T t, C41410gE2<T> c41410gE2) {
        AbstractC26856oB<?, Float> abstractC26856oB;
        AbstractC26856oB<?, Float> abstractC26856oB2;
        if (t == InterfaceC37835aE2.f50134w) {
            this.f41241g.m21653n(c41410gE2);
        } else if (t == InterfaceC37835aE2.f50135x) {
            this.f41243i.m21653n(c41410gE2);
        } else if (t == InterfaceC37835aE2.f50125n) {
            this.f41242h.m21653n(c41410gE2);
        } else if (t == InterfaceC37835aE2.f50136y && (abstractC26856oB2 = this.f41244j) != null) {
            abstractC26856oB2.m21653n(c41410gE2);
        } else if (t == InterfaceC37835aE2.f50137z) {
            this.f41245k.m21653n(c41410gE2);
        } else if (t == InterfaceC37835aE2.f50097A && (abstractC26856oB = this.f41246l) != null) {
            abstractC26856oB.m21653n(c41410gE2);
        } else if (t == InterfaceC37835aE2.f50098B) {
            this.f41247m.m21653n(c41410gE2);
        }
    }

    /* renamed from: i */
    public final void m78247i() {
        double floatValue;
        float f;
        float f2;
        int i;
        float f3;
        float f4;
        double d;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        double d2;
        float f10;
        float f11;
        float f12;
        double d3;
        float f13;
        float f14;
        float f15;
        float f16;
        float floatValue2 = this.f41241g.mo21658h().floatValue();
        AbstractC26856oB<?, Float> abstractC26856oB = this.f41243i;
        if (abstractC26856oB == null) {
            floatValue = 0.0d;
        } else {
            floatValue = abstractC26856oB.mo21658h().floatValue();
        }
        double radians = Math.toRadians(floatValue - 90.0d);
        double d4 = floatValue2;
        float f17 = (float) (6.283185307179586d / d4);
        if (this.f41240f) {
            f17 *= -1.0f;
        }
        float f18 = f17 / 2.0f;
        float f19 = floatValue2 - ((int) floatValue2);
        int i2 = (f19 > 0.0f ? 1 : (f19 == 0.0f ? 0 : -1));
        if (i2 != 0) {
            radians += (1.0f - f19) * f18;
        }
        float floatValue3 = this.f41245k.mo21658h().floatValue();
        float floatValue4 = this.f41244j.mo21658h().floatValue();
        AbstractC26856oB<?, Float> abstractC26856oB2 = this.f41246l;
        if (abstractC26856oB2 != null) {
            f = abstractC26856oB2.mo21658h().floatValue() / 100.0f;
        } else {
            f = 0.0f;
        }
        AbstractC26856oB<?, Float> abstractC26856oB3 = this.f41247m;
        if (abstractC26856oB3 != null) {
            f2 = abstractC26856oB3.mo21658h().floatValue() / 100.0f;
        } else {
            f2 = 0.0f;
        }
        if (i2 != 0) {
            f6 = ((floatValue3 - floatValue4) * f19) + floatValue4;
            i = i2;
            double d5 = f6;
            float cos = (float) (d5 * Math.cos(radians));
            f5 = (float) (d5 * Math.sin(radians));
            this.f41235a.moveTo(cos, f5);
            d = radians + ((f17 * f19) / 2.0f);
            f3 = cos;
            f4 = f18;
        } else {
            i = i2;
            double d6 = floatValue3;
            float cos2 = (float) (Math.cos(radians) * d6);
            float sin = (float) (d6 * Math.sin(radians));
            this.f41235a.moveTo(cos2, sin);
            f3 = cos2;
            f4 = f18;
            d = radians + f4;
            f5 = sin;
            f6 = 0.0f;
        }
        double ceil = Math.ceil(d4) * 2.0d;
        int i3 = 0;
        float f20 = f4;
        float f21 = f3;
        boolean z = false;
        while (true) {
            double d7 = i3;
            if (d7 < ceil) {
                if (z) {
                    f7 = floatValue3;
                } else {
                    f7 = floatValue4;
                }
                int i4 = (f6 > 0.0f ? 1 : (f6 == 0.0f ? 0 : -1));
                if (i4 != 0 && d7 == ceil - 2.0d) {
                    f8 = f17;
                    f9 = (f17 * f19) / 2.0f;
                } else {
                    f8 = f17;
                    f9 = f20;
                }
                if (i4 != 0 && d7 == ceil - 1.0d) {
                    d2 = d7;
                    f10 = f6;
                } else {
                    d2 = d7;
                    f10 = f6;
                    f6 = f7;
                }
                double d8 = f6;
                double d9 = ceil;
                float cos3 = (float) (d8 * Math.cos(d));
                float sin2 = (float) (d8 * Math.sin(d));
                if (f == 0.0f && f2 == 0.0f) {
                    this.f41235a.lineTo(cos3, sin2);
                    d3 = d;
                    f11 = f;
                    f12 = f2;
                } else {
                    f11 = f;
                    double atan2 = (float) (Math.atan2(f5, f21) - 1.5707963267948966d);
                    float cos4 = (float) Math.cos(atan2);
                    float sin3 = (float) Math.sin(atan2);
                    f12 = f2;
                    d3 = d;
                    double atan22 = (float) (Math.atan2(sin2, cos3) - 1.5707963267948966d);
                    float cos5 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    if (z) {
                        f13 = f11;
                    } else {
                        f13 = f12;
                    }
                    if (z) {
                        f14 = f12;
                    } else {
                        f14 = f11;
                    }
                    if (z) {
                        f15 = floatValue4;
                    } else {
                        f15 = floatValue3;
                    }
                    if (z) {
                        f16 = floatValue3;
                    } else {
                        f16 = floatValue4;
                    }
                    float f22 = f15 * f13 * 0.47829f;
                    float f23 = cos4 * f22;
                    float f24 = f22 * sin3;
                    float f25 = f16 * f14 * 0.47829f;
                    float f26 = cos5 * f25;
                    float f27 = f25 * sin4;
                    if (i != 0) {
                        if (i3 == 0) {
                            f23 *= f19;
                            f24 *= f19;
                        } else if (d2 == d9 - 1.0d) {
                            f26 *= f19;
                            f27 *= f19;
                        }
                    }
                    this.f41235a.cubicTo(f21 - f23, f5 - f24, cos3 + f26, sin2 + f27, cos3, sin2);
                }
                d = d3 + f9;
                z = !z;
                i3++;
                f21 = cos3;
                f5 = sin2;
                f2 = f12;
                f = f11;
                f6 = f10;
                f17 = f8;
                ceil = d9;
            } else {
                PointF mo21658h = this.f41242h.mo21658h();
                this.f41235a.offset(mo21658h.x, mo21658h.y);
                this.f41235a.close();
                return;
            }
        }
    }

    /* renamed from: j */
    public final void m78246j() {
        this.f41249o = false;
        this.f41237c.invalidateSelf();
    }
}
