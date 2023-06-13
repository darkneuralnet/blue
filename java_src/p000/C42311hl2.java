package p000;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.io.IOException;
import java.lang.ref.WeakReference;
import p000.AbstractC39920dj2;
/* renamed from: hl2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42311hl2 {

    /* renamed from: b */
    public static LN5<WeakReference<Interpolator>> f85842b;

    /* renamed from: a */
    public static final Interpolator f85841a = new LinearInterpolator();

    /* renamed from: c */
    public static AbstractC39920dj2.C19847a f85843c = AbstractC39920dj2.C19847a.m43839a("t", "s", "e", "o", "i", "h", "to", "ti");

    /* renamed from: d */
    public static AbstractC39920dj2.C19847a f85844d = AbstractC39920dj2.C19847a.m43839a("x", "y");

    /* renamed from: a */
    public static WeakReference<Interpolator> m35895a(int i) {
        WeakReference<Interpolator> m96983k;
        synchronized (C42311hl2.class) {
            m96983k = m35889g().m96983k(i);
        }
        return m96983k;
    }

    /* renamed from: b */
    public static Interpolator m35894b(PointF pointF, PointF pointF2) {
        WeakReference<Interpolator> m35895a;
        Interpolator linearInterpolator;
        pointF.x = C48077rU2.m15918b(pointF.x, -1.0f, 1.0f);
        pointF.y = C48077rU2.m15918b(pointF.y, -100.0f, 100.0f);
        pointF2.x = C48077rU2.m15918b(pointF2.x, -1.0f, 1.0f);
        float m15918b = C48077rU2.m15918b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = m15918b;
        int m104863i = C33095Gi6.m104863i(pointF.x, pointF.y, pointF2.x, m15918b);
        Interpolator interpolator = null;
        if (C32416Dl2.m109976c()) {
            m35895a = null;
        } else {
            m35895a = m35895a(m104863i);
        }
        if (m35895a != null) {
            interpolator = m35895a.get();
        }
        if (m35895a == null || interpolator == null) {
            try {
                linearInterpolator = C43828kJ3.m29072a(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                    linearInterpolator = C43828kJ3.m29072a(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    linearInterpolator = new LinearInterpolator();
                }
            }
            interpolator = linearInterpolator;
            if (!C32416Dl2.m109976c()) {
                try {
                    m35888h(m104863i, new WeakReference(interpolator));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return interpolator;
    }

    /* renamed from: c */
    public static <T> C41125fl2<T> m35893c(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2, float f, InterfaceC34274Lj6<T> interfaceC34274Lj6, boolean z, boolean z2) throws IOException {
        if (z && z2) {
            return m35891e(c47924rD2, abstractC39920dj2, f, interfaceC34274Lj6);
        }
        if (z) {
            return m35892d(c47924rD2, abstractC39920dj2, f, interfaceC34274Lj6);
        }
        return m35890f(abstractC39920dj2, f, interfaceC34274Lj6);
    }

    /* renamed from: d */
    public static <T> C41125fl2<T> m35892d(C47924rD2 c47924rD2, AbstractC39920dj2 abstractC39920dj2, float f, InterfaceC34274Lj6<T> interfaceC34274Lj6) throws IOException {
        Interpolator interpolator;
        Interpolator interpolator2;
        T t;
        abstractC39920dj2.mo2770c();
        PointF pointF = null;
        T t2 = null;
        T t3 = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        float f2 = 0.0f;
        boolean z = false;
        PointF pointF4 = null;
        while (abstractC39920dj2.mo2767g()) {
            switch (abstractC39920dj2.mo2760s(f85843c)) {
                case 0:
                    f2 = (float) abstractC39920dj2.mo2765k();
                    break;
                case 1:
                    t3 = interfaceC34274Lj6.mo2631a(abstractC39920dj2, f);
                    break;
                case 2:
                    t2 = interfaceC34274Lj6.mo2631a(abstractC39920dj2, f);
                    break;
                case 3:
                    pointF = C52963zj2.m472e(abstractC39920dj2, 1.0f);
                    break;
                case 4:
                    pointF4 = C52963zj2.m472e(abstractC39920dj2, 1.0f);
                    break;
                case 5:
                    if (abstractC39920dj2.mo2764l() == 1) {
                        z = true;
                        break;
                    } else {
                        z = false;
                        break;
                    }
                case 6:
                    pointF2 = C52963zj2.m472e(abstractC39920dj2, f);
                    break;
                case 7:
                    pointF3 = C52963zj2.m472e(abstractC39920dj2, f);
                    break;
                default:
                    abstractC39920dj2.mo2758u();
                    break;
            }
        }
        abstractC39920dj2.mo2768f();
        if (z) {
            interpolator2 = f85841a;
            t = t3;
        } else {
            if (pointF != null && pointF4 != null) {
                interpolator = m35894b(pointF, pointF4);
            } else {
                interpolator = f85841a;
            }
            interpolator2 = interpolator;
            t = t2;
        }
        C41125fl2<T> c41125fl2 = new C41125fl2<>(c47924rD2, t3, t, interpolator2, f2, null);
        c41125fl2.f80577o = pointF2;
        c41125fl2.f80578p = pointF3;
        return c41125fl2;
    }

    /* renamed from: e */
    public static <T> C41125fl2<T> m35891e(C47924rD2 c47924rD2, AbstractC39920dj2 abstractC39920dj2, float f, InterfaceC34274Lj6<T> interfaceC34274Lj6) throws IOException {
        Interpolator interpolator;
        Interpolator m35894b;
        Interpolator m35894b2;
        T t;
        PointF pointF;
        C41125fl2<T> c41125fl2;
        PointF pointF2;
        float f2;
        PointF pointF3;
        abstractC39920dj2.mo2770c();
        PointF pointF4 = null;
        boolean z = false;
        PointF pointF5 = null;
        PointF pointF6 = null;
        PointF pointF7 = null;
        T t2 = null;
        PointF pointF8 = null;
        PointF pointF9 = null;
        PointF pointF10 = null;
        float f3 = 0.0f;
        PointF pointF11 = null;
        T t3 = null;
        while (abstractC39920dj2.mo2767g()) {
            switch (abstractC39920dj2.mo2760s(f85843c)) {
                case 0:
                    pointF2 = pointF4;
                    f3 = (float) abstractC39920dj2.mo2765k();
                    break;
                case 1:
                    pointF2 = pointF4;
                    t2 = interfaceC34274Lj6.mo2631a(abstractC39920dj2, f);
                    break;
                case 2:
                    pointF2 = pointF4;
                    t3 = interfaceC34274Lj6.mo2631a(abstractC39920dj2, f);
                    break;
                case 3:
                    pointF2 = pointF4;
                    f2 = f3;
                    PointF pointF12 = pointF11;
                    if (abstractC39920dj2.mo2761q() == AbstractC39920dj2.EnumC19848b.BEGIN_OBJECT) {
                        abstractC39920dj2.mo2770c();
                        float f4 = 0.0f;
                        float f5 = 0.0f;
                        float f6 = 0.0f;
                        float f7 = 0.0f;
                        while (abstractC39920dj2.mo2767g()) {
                            int mo2760s = abstractC39920dj2.mo2760s(f85844d);
                            if (mo2760s == 0) {
                                AbstractC39920dj2.EnumC19848b mo2761q = abstractC39920dj2.mo2761q();
                                AbstractC39920dj2.EnumC19848b enumC19848b = AbstractC39920dj2.EnumC19848b.NUMBER;
                                if (mo2761q == enumC19848b) {
                                    f6 = (float) abstractC39920dj2.mo2765k();
                                    f4 = f6;
                                } else {
                                    abstractC39920dj2.mo2771b();
                                    f4 = (float) abstractC39920dj2.mo2765k();
                                    f6 = abstractC39920dj2.mo2761q() == enumC19848b ? (float) abstractC39920dj2.mo2765k() : f4;
                                    abstractC39920dj2.mo2769d();
                                }
                            } else if (mo2760s != 1) {
                                abstractC39920dj2.mo2758u();
                            } else {
                                AbstractC39920dj2.EnumC19848b mo2761q2 = abstractC39920dj2.mo2761q();
                                AbstractC39920dj2.EnumC19848b enumC19848b2 = AbstractC39920dj2.EnumC19848b.NUMBER;
                                if (mo2761q2 == enumC19848b2) {
                                    f7 = (float) abstractC39920dj2.mo2765k();
                                    f5 = f7;
                                } else {
                                    abstractC39920dj2.mo2771b();
                                    f5 = (float) abstractC39920dj2.mo2765k();
                                    f7 = abstractC39920dj2.mo2761q() == enumC19848b2 ? (float) abstractC39920dj2.mo2765k() : f5;
                                    abstractC39920dj2.mo2769d();
                                }
                            }
                        }
                        PointF pointF13 = new PointF(f4, f5);
                        PointF pointF14 = new PointF(f6, f7);
                        abstractC39920dj2.mo2768f();
                        pointF8 = pointF14;
                        pointF7 = pointF13;
                        pointF11 = pointF12;
                        f3 = f2;
                        break;
                    } else {
                        pointF5 = C52963zj2.m472e(abstractC39920dj2, f);
                        f3 = f2;
                        pointF11 = pointF12;
                        break;
                    }
                case 4:
                    if (abstractC39920dj2.mo2761q() == AbstractC39920dj2.EnumC19848b.BEGIN_OBJECT) {
                        abstractC39920dj2.mo2770c();
                        float f8 = 0.0f;
                        float f9 = 0.0f;
                        float f10 = 0.0f;
                        float f11 = 0.0f;
                        while (abstractC39920dj2.mo2767g()) {
                            PointF pointF15 = pointF11;
                            int mo2760s2 = abstractC39920dj2.mo2760s(f85844d);
                            if (mo2760s2 != 0) {
                                pointF3 = pointF4;
                                if (mo2760s2 != 1) {
                                    abstractC39920dj2.mo2758u();
                                } else {
                                    AbstractC39920dj2.EnumC19848b mo2761q3 = abstractC39920dj2.mo2761q();
                                    AbstractC39920dj2.EnumC19848b enumC19848b3 = AbstractC39920dj2.EnumC19848b.NUMBER;
                                    if (mo2761q3 == enumC19848b3) {
                                        f11 = (float) abstractC39920dj2.mo2765k();
                                        f3 = f3;
                                        f9 = f11;
                                    } else {
                                        float f12 = f3;
                                        abstractC39920dj2.mo2771b();
                                        float mo2765k = (float) abstractC39920dj2.mo2765k();
                                        float mo2765k2 = abstractC39920dj2.mo2761q() == enumC19848b3 ? (float) abstractC39920dj2.mo2765k() : mo2765k;
                                        abstractC39920dj2.mo2769d();
                                        f3 = f12;
                                        pointF11 = pointF15;
                                        pointF4 = pointF3;
                                        f11 = mo2765k2;
                                        f9 = mo2765k;
                                    }
                                }
                            } else {
                                pointF3 = pointF4;
                                float f13 = f3;
                                AbstractC39920dj2.EnumC19848b mo2761q4 = abstractC39920dj2.mo2761q();
                                AbstractC39920dj2.EnumC19848b enumC19848b4 = AbstractC39920dj2.EnumC19848b.NUMBER;
                                if (mo2761q4 == enumC19848b4) {
                                    f10 = (float) abstractC39920dj2.mo2765k();
                                    f3 = f13;
                                    f8 = f10;
                                } else {
                                    abstractC39920dj2.mo2771b();
                                    f8 = (float) abstractC39920dj2.mo2765k();
                                    f10 = abstractC39920dj2.mo2761q() == enumC19848b4 ? (float) abstractC39920dj2.mo2765k() : f8;
                                    abstractC39920dj2.mo2769d();
                                    f3 = f13;
                                }
                            }
                            pointF11 = pointF15;
                            pointF4 = pointF3;
                        }
                        pointF2 = pointF4;
                        f2 = f3;
                        PointF pointF16 = new PointF(f8, f9);
                        PointF pointF17 = new PointF(f10, f11);
                        abstractC39920dj2.mo2768f();
                        pointF10 = pointF17;
                        pointF9 = pointF16;
                        f3 = f2;
                        break;
                    } else {
                        pointF2 = pointF4;
                        pointF6 = C52963zj2.m472e(abstractC39920dj2, f);
                        break;
                    }
                case 5:
                    if (abstractC39920dj2.mo2764l() == 1) {
                        z = true;
                    } else {
                        z = false;
                        continue;
                    }
                case 6:
                    pointF11 = C52963zj2.m472e(abstractC39920dj2, f);
                    continue;
                case 7:
                    pointF4 = C52963zj2.m472e(abstractC39920dj2, f);
                    continue;
                default:
                    pointF2 = pointF4;
                    abstractC39920dj2.mo2758u();
                    break;
            }
            pointF4 = pointF2;
        }
        PointF pointF18 = pointF4;
        float f14 = f3;
        PointF pointF19 = pointF11;
        abstractC39920dj2.mo2768f();
        if (z) {
            interpolator = f85841a;
            t = t2;
        } else {
            if (pointF5 != null && pointF6 != null) {
                interpolator = m35894b(pointF5, pointF6);
            } else if (pointF7 != null && pointF8 != null && pointF9 != null && pointF10 != null) {
                m35894b = m35894b(pointF7, pointF9);
                m35894b2 = m35894b(pointF8, pointF10);
                t = t3;
                interpolator = null;
                if (m35894b == null && m35894b2 != null) {
                    pointF = pointF19;
                    c41125fl2 = new C41125fl2<>(c47924rD2, t2, t, m35894b, m35894b2, f14, null);
                } else {
                    pointF = pointF19;
                    c41125fl2 = new C41125fl2<>(c47924rD2, t2, t, interpolator, f14, null);
                }
                c41125fl2.f80577o = pointF;
                c41125fl2.f80578p = pointF18;
                return c41125fl2;
            } else {
                interpolator = f85841a;
            }
            t = t3;
        }
        m35894b = null;
        m35894b2 = null;
        if (m35894b == null) {
        }
        pointF = pointF19;
        c41125fl2 = new C41125fl2<>(c47924rD2, t2, t, interpolator, f14, null);
        c41125fl2.f80577o = pointF;
        c41125fl2.f80578p = pointF18;
        return c41125fl2;
    }

    /* renamed from: f */
    public static <T> C41125fl2<T> m35890f(AbstractC39920dj2 abstractC39920dj2, float f, InterfaceC34274Lj6<T> interfaceC34274Lj6) throws IOException {
        return new C41125fl2<>(interfaceC34274Lj6.mo2631a(abstractC39920dj2, f));
    }

    /* renamed from: g */
    public static LN5<WeakReference<Interpolator>> m35889g() {
        if (f85842b == null) {
            f85842b = new LN5<>();
        }
        return f85842b;
    }

    /* renamed from: h */
    public static void m35888h(int i, WeakReference<Interpolator> weakReference) {
        synchronized (C42311hl2.class) {
            f85842b.m96978p(i, weakReference);
        }
    }
}
