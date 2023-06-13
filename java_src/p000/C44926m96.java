package p000;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;
import p000.AbstractC26856oB;
/* renamed from: m96  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C44926m96 {

    /* renamed from: a */
    public final Matrix f97451a = new Matrix();

    /* renamed from: b */
    public final Matrix f97452b;

    /* renamed from: c */
    public final Matrix f97453c;

    /* renamed from: d */
    public final Matrix f97454d;

    /* renamed from: e */
    public final float[] f97455e;

    /* renamed from: f */
    public AbstractC26856oB<PointF, PointF> f97456f;

    /* renamed from: g */
    public AbstractC26856oB<?, PointF> f97457g;

    /* renamed from: h */
    public AbstractC26856oB<C39923dj5, C39923dj5> f97458h;

    /* renamed from: i */
    public AbstractC26856oB<Float, Float> f97459i;

    /* renamed from: j */
    public AbstractC26856oB<Integer, Integer> f97460j;

    /* renamed from: k */
    public C46551ou1 f97461k;

    /* renamed from: l */
    public C46551ou1 f97462l;

    /* renamed from: m */
    public AbstractC26856oB<?, Float> f97463m;

    /* renamed from: n */
    public AbstractC26856oB<?, Float> f97464n;

    public C44926m96(C1920Ee c1920Ee) {
        AbstractC26856oB<PointF, PointF> mo951a;
        AbstractC26856oB<PointF, PointF> mo951a2;
        AbstractC26856oB<C39923dj5, C39923dj5> mo951a3;
        AbstractC26856oB<Float, Float> mo951a4;
        C46551ou1 c46551ou1;
        C46551ou1 c46551ou12;
        if (c1920Ee.m108627c() == null) {
            mo951a = null;
        } else {
            mo951a = c1920Ee.m108627c().mo951a();
        }
        this.f97456f = mo951a;
        if (c1920Ee.m108624f() == null) {
            mo951a2 = null;
        } else {
            mo951a2 = c1920Ee.m108624f().mo951a();
        }
        this.f97457g = mo951a2;
        if (c1920Ee.m108622h() == null) {
            mo951a3 = null;
        } else {
            mo951a3 = c1920Ee.m108622h().mo951a();
        }
        this.f97458h = mo951a3;
        if (c1920Ee.m108623g() == null) {
            mo951a4 = null;
        } else {
            mo951a4 = c1920Ee.m108623g().mo951a();
        }
        this.f97459i = mo951a4;
        if (c1920Ee.m108621i() == null) {
            c46551ou1 = null;
        } else {
            c46551ou1 = (C46551ou1) c1920Ee.m108621i().mo951a();
        }
        this.f97461k = c46551ou1;
        if (c46551ou1 != null) {
            this.f97452b = new Matrix();
            this.f97453c = new Matrix();
            this.f97454d = new Matrix();
            this.f97455e = new float[9];
        } else {
            this.f97452b = null;
            this.f97453c = null;
            this.f97454d = null;
            this.f97455e = null;
        }
        if (c1920Ee.m108620j() == null) {
            c46551ou12 = null;
        } else {
            c46551ou12 = (C46551ou1) c1920Ee.m108620j().mo951a();
        }
        this.f97462l = c46551ou12;
        if (c1920Ee.m108625e() != null) {
            this.f97460j = c1920Ee.m108625e().mo951a();
        }
        if (c1920Ee.m108619k() != null) {
            this.f97463m = c1920Ee.m108619k().mo951a();
        } else {
            this.f97463m = null;
        }
        if (c1920Ee.m108626d() != null) {
            this.f97464n = c1920Ee.m108626d().mo951a();
        } else {
            this.f97464n = null;
        }
    }

    /* renamed from: a */
    public void m26237a(AbstractC27525qB abstractC27525qB) {
        abstractC27525qB.m17981i(this.f97460j);
        abstractC27525qB.m17981i(this.f97463m);
        abstractC27525qB.m17981i(this.f97464n);
        abstractC27525qB.m17981i(this.f97456f);
        abstractC27525qB.m17981i(this.f97457g);
        abstractC27525qB.m17981i(this.f97458h);
        abstractC27525qB.m17981i(this.f97459i);
        abstractC27525qB.m17981i(this.f97461k);
        abstractC27525qB.m17981i(this.f97462l);
    }

    /* renamed from: b */
    public void m26236b(AbstractC26856oB.InterfaceC26858b interfaceC26858b) {
        AbstractC26856oB<Integer, Integer> abstractC26856oB = this.f97460j;
        if (abstractC26856oB != null) {
            abstractC26856oB.m21665a(interfaceC26858b);
        }
        AbstractC26856oB<?, Float> abstractC26856oB2 = this.f97463m;
        if (abstractC26856oB2 != null) {
            abstractC26856oB2.m21665a(interfaceC26858b);
        }
        AbstractC26856oB<?, Float> abstractC26856oB3 = this.f97464n;
        if (abstractC26856oB3 != null) {
            abstractC26856oB3.m21665a(interfaceC26858b);
        }
        AbstractC26856oB<PointF, PointF> abstractC26856oB4 = this.f97456f;
        if (abstractC26856oB4 != null) {
            abstractC26856oB4.m21665a(interfaceC26858b);
        }
        AbstractC26856oB<?, PointF> abstractC26856oB5 = this.f97457g;
        if (abstractC26856oB5 != null) {
            abstractC26856oB5.m21665a(interfaceC26858b);
        }
        AbstractC26856oB<C39923dj5, C39923dj5> abstractC26856oB6 = this.f97458h;
        if (abstractC26856oB6 != null) {
            abstractC26856oB6.m21665a(interfaceC26858b);
        }
        AbstractC26856oB<Float, Float> abstractC26856oB7 = this.f97459i;
        if (abstractC26856oB7 != null) {
            abstractC26856oB7.m21665a(interfaceC26858b);
        }
        C46551ou1 c46551ou1 = this.f97461k;
        if (c46551ou1 != null) {
            c46551ou1.m21665a(interfaceC26858b);
        }
        C46551ou1 c46551ou12 = this.f97462l;
        if (c46551ou12 != null) {
            c46551ou12.m21665a(interfaceC26858b);
        }
    }

    /* renamed from: c */
    public <T> boolean m26235c(T t, C41410gE2<T> c41410gE2) {
        if (t == InterfaceC37835aE2.f50117f) {
            AbstractC26856oB<PointF, PointF> abstractC26856oB = this.f97456f;
            if (abstractC26856oB == null) {
                this.f97456f = new C32168Cj6(c41410gE2, new PointF());
                return true;
            }
            abstractC26856oB.m21653n(c41410gE2);
            return true;
        } else if (t == InterfaceC37835aE2.f50118g) {
            AbstractC26856oB<?, PointF> abstractC26856oB2 = this.f97457g;
            if (abstractC26856oB2 == null) {
                this.f97457g = new C32168Cj6(c41410gE2, new PointF());
                return true;
            }
            abstractC26856oB2.m21653n(c41410gE2);
            return true;
        } else {
            if (t == InterfaceC37835aE2.f50119h) {
                AbstractC26856oB<?, PointF> abstractC26856oB3 = this.f97457g;
                if (abstractC26856oB3 instanceof C38521bO5) {
                    ((C38521bO5) abstractC26856oB3).m64596r(c41410gE2);
                    return true;
                }
            }
            if (t == InterfaceC37835aE2.f50120i) {
                AbstractC26856oB<?, PointF> abstractC26856oB4 = this.f97457g;
                if (abstractC26856oB4 instanceof C38521bO5) {
                    ((C38521bO5) abstractC26856oB4).m64595s(c41410gE2);
                    return true;
                }
            }
            if (t == InterfaceC37835aE2.f50126o) {
                AbstractC26856oB<C39923dj5, C39923dj5> abstractC26856oB5 = this.f97458h;
                if (abstractC26856oB5 == null) {
                    this.f97458h = new C32168Cj6(c41410gE2, new C39923dj5());
                    return true;
                }
                abstractC26856oB5.m21653n(c41410gE2);
                return true;
            } else if (t == InterfaceC37835aE2.f50127p) {
                AbstractC26856oB<Float, Float> abstractC26856oB6 = this.f97459i;
                if (abstractC26856oB6 == null) {
                    this.f97459i = new C32168Cj6(c41410gE2, Float.valueOf(0.0f));
                    return true;
                }
                abstractC26856oB6.m21653n(c41410gE2);
                return true;
            } else if (t == InterfaceC37835aE2.f50114c) {
                AbstractC26856oB<Integer, Integer> abstractC26856oB7 = this.f97460j;
                if (abstractC26856oB7 == null) {
                    this.f97460j = new C32168Cj6(c41410gE2, 100);
                    return true;
                }
                abstractC26856oB7.m21653n(c41410gE2);
                return true;
            } else if (t == InterfaceC37835aE2.f50099C) {
                AbstractC26856oB<?, Float> abstractC26856oB8 = this.f97463m;
                if (abstractC26856oB8 == null) {
                    this.f97463m = new C32168Cj6(c41410gE2, Float.valueOf(100.0f));
                    return true;
                }
                abstractC26856oB8.m21653n(c41410gE2);
                return true;
            } else if (t == InterfaceC37835aE2.f50100D) {
                AbstractC26856oB<?, Float> abstractC26856oB9 = this.f97464n;
                if (abstractC26856oB9 == null) {
                    this.f97464n = new C32168Cj6(c41410gE2, Float.valueOf(100.0f));
                    return true;
                }
                abstractC26856oB9.m21653n(c41410gE2);
                return true;
            } else if (t == InterfaceC37835aE2.f50128q) {
                if (this.f97461k == null) {
                    this.f97461k = new C46551ou1(Collections.singletonList(new C41125fl2(Float.valueOf(0.0f))));
                }
                this.f97461k.m21653n(c41410gE2);
                return true;
            } else if (t == InterfaceC37835aE2.f50129r) {
                if (this.f97462l == null) {
                    this.f97462l = new C46551ou1(Collections.singletonList(new C41125fl2(Float.valueOf(0.0f))));
                }
                this.f97462l.m21653n(c41410gE2);
                return true;
            } else {
                return false;
            }
        }
    }

    /* renamed from: d */
    public final void m26234d() {
        for (int i = 0; i < 9; i++) {
            this.f97455e[i] = 0.0f;
        }
    }

    /* renamed from: e */
    public AbstractC26856oB<?, Float> m26233e() {
        return this.f97464n;
    }

    /* renamed from: f */
    public Matrix m26232f() {
        C46551ou1 c46551ou1;
        PointF mo21658h;
        C46551ou1 c46551ou12;
        float cos;
        C46551ou1 c46551ou13;
        float sin;
        float m20303p;
        PointF mo21658h2;
        this.f97451a.reset();
        AbstractC26856oB<?, PointF> abstractC26856oB = this.f97457g;
        if (abstractC26856oB != null && (mo21658h2 = abstractC26856oB.mo21658h()) != null) {
            float f = mo21658h2.x;
            if (f != 0.0f || mo21658h2.y != 0.0f) {
                this.f97451a.preTranslate(f, mo21658h2.y);
            }
        }
        AbstractC26856oB<Float, Float> abstractC26856oB2 = this.f97459i;
        if (abstractC26856oB2 != null) {
            if (abstractC26856oB2 instanceof C32168Cj6) {
                m20303p = abstractC26856oB2.mo21658h().floatValue();
            } else {
                m20303p = ((C46551ou1) abstractC26856oB2).m20303p();
            }
            if (m20303p != 0.0f) {
                this.f97451a.preRotate(m20303p);
            }
        }
        if (this.f97461k != null) {
            if (this.f97462l == null) {
                cos = 0.0f;
            } else {
                cos = (float) Math.cos(Math.toRadians((-c46551ou12.m20303p()) + 90.0f));
            }
            if (this.f97462l == null) {
                sin = 1.0f;
            } else {
                sin = (float) Math.sin(Math.toRadians((-c46551ou13.m20303p()) + 90.0f));
            }
            float tan = (float) Math.tan(Math.toRadians(c46551ou1.m20303p()));
            m26234d();
            float[] fArr = this.f97455e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f2 = -sin;
            fArr[3] = f2;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.f97452b.setValues(fArr);
            m26234d();
            float[] fArr2 = this.f97455e;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f97453c.setValues(fArr2);
            m26234d();
            float[] fArr3 = this.f97455e;
            fArr3[0] = cos;
            fArr3[1] = f2;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.f97454d.setValues(fArr3);
            this.f97453c.preConcat(this.f97452b);
            this.f97454d.preConcat(this.f97453c);
            this.f97451a.preConcat(this.f97454d);
        }
        AbstractC26856oB<C39923dj5, C39923dj5> abstractC26856oB3 = this.f97458h;
        if (abstractC26856oB3 != null) {
            C39923dj5 mo21658h3 = abstractC26856oB3.mo21658h();
            if (mo21658h3.m43836b() != 1.0f || mo21658h3.m43835c() != 1.0f) {
                this.f97451a.preScale(mo21658h3.m43836b(), mo21658h3.m43835c());
            }
        }
        AbstractC26856oB<PointF, PointF> abstractC26856oB4 = this.f97456f;
        if (abstractC26856oB4 != null && (((mo21658h = abstractC26856oB4.mo21658h()) != null && mo21658h.x != 0.0f) || mo21658h.y != 0.0f)) {
            this.f97451a.preTranslate(-mo21658h.x, -mo21658h.y);
        }
        return this.f97451a;
    }

    /* renamed from: g */
    public Matrix m26231g(float f) {
        PointF mo21658h;
        C39923dj5 mo21658h2;
        float f2;
        AbstractC26856oB<?, PointF> abstractC26856oB = this.f97457g;
        PointF pointF = null;
        if (abstractC26856oB == null) {
            mo21658h = null;
        } else {
            mo21658h = abstractC26856oB.mo21658h();
        }
        AbstractC26856oB<C39923dj5, C39923dj5> abstractC26856oB2 = this.f97458h;
        if (abstractC26856oB2 == null) {
            mo21658h2 = null;
        } else {
            mo21658h2 = abstractC26856oB2.mo21658h();
        }
        this.f97451a.reset();
        if (mo21658h != null) {
            this.f97451a.preTranslate(mo21658h.x * f, mo21658h.y * f);
        }
        if (mo21658h2 != null) {
            double d = f;
            this.f97451a.preScale((float) Math.pow(mo21658h2.m43836b(), d), (float) Math.pow(mo21658h2.m43835c(), d));
        }
        AbstractC26856oB<Float, Float> abstractC26856oB3 = this.f97459i;
        if (abstractC26856oB3 != null) {
            float floatValue = abstractC26856oB3.mo21658h().floatValue();
            AbstractC26856oB<PointF, PointF> abstractC26856oB4 = this.f97456f;
            if (abstractC26856oB4 != null) {
                pointF = abstractC26856oB4.mo21658h();
            }
            Matrix matrix = this.f97451a;
            float f3 = floatValue * f;
            float f4 = 0.0f;
            if (pointF == null) {
                f2 = 0.0f;
            } else {
                f2 = pointF.x;
            }
            if (pointF != null) {
                f4 = pointF.y;
            }
            matrix.preRotate(f3, f2, f4);
        }
        return this.f97451a;
    }

    /* renamed from: h */
    public AbstractC26856oB<?, Integer> m26230h() {
        return this.f97460j;
    }

    /* renamed from: i */
    public AbstractC26856oB<?, Float> m26229i() {
        return this.f97463m;
    }

    /* renamed from: j */
    public void m26228j(float f) {
        AbstractC26856oB<Integer, Integer> abstractC26856oB = this.f97460j;
        if (abstractC26856oB != null) {
            abstractC26856oB.mo21654m(f);
        }
        AbstractC26856oB<?, Float> abstractC26856oB2 = this.f97463m;
        if (abstractC26856oB2 != null) {
            abstractC26856oB2.mo21654m(f);
        }
        AbstractC26856oB<?, Float> abstractC26856oB3 = this.f97464n;
        if (abstractC26856oB3 != null) {
            abstractC26856oB3.mo21654m(f);
        }
        AbstractC26856oB<PointF, PointF> abstractC26856oB4 = this.f97456f;
        if (abstractC26856oB4 != null) {
            abstractC26856oB4.mo21654m(f);
        }
        AbstractC26856oB<?, PointF> abstractC26856oB5 = this.f97457g;
        if (abstractC26856oB5 != null) {
            abstractC26856oB5.mo21654m(f);
        }
        AbstractC26856oB<C39923dj5, C39923dj5> abstractC26856oB6 = this.f97458h;
        if (abstractC26856oB6 != null) {
            abstractC26856oB6.mo21654m(f);
        }
        AbstractC26856oB<Float, Float> abstractC26856oB7 = this.f97459i;
        if (abstractC26856oB7 != null) {
            abstractC26856oB7.mo21654m(f);
        }
        C46551ou1 c46551ou1 = this.f97461k;
        if (c46551ou1 != null) {
            c46551ou1.mo21654m(f);
        }
        C46551ou1 c46551ou12 = this.f97462l;
        if (c46551ou12 != null) {
            c46551ou12.mo21654m(f);
        }
    }
}
