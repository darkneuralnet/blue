package p000;

import android.graphics.PointF;
import com.facebook.share.internal.C17296a;
import java.io.IOException;
import p000.AbstractC39920dj2;
/* renamed from: Fe */
/* loaded from: classes2.dex */
public class C2373Fe {

    /* renamed from: a */
    public static final AbstractC39920dj2.C19847a f9855a = AbstractC39920dj2.C19847a.m43839a(C17296a.f69688o, "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* renamed from: b */
    public static final AbstractC39920dj2.C19847a f9856b = AbstractC39920dj2.C19847a.m43839a("k");

    private C2373Fe() {
    }

    /* renamed from: a */
    public static boolean m106833a(C29600ve c29600ve) {
        return c29600ve == null || (c29600ve.isStatic() && c29600ve.mo950b().get(0).f80564b.equals(0.0f, 0.0f));
    }

    /* renamed from: b */
    public static boolean m106832b(InterfaceC2901Ge<PointF, PointF> interfaceC2901Ge) {
        if (interfaceC2901Ge != null && ((interfaceC2901Ge instanceof C0165Ae) || !interfaceC2901Ge.isStatic() || !interfaceC2901Ge.mo950b().get(0).f80564b.equals(0.0f, 0.0f))) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m106831c(C27640qe c27640qe) {
        return c27640qe == null || (c27640qe.isStatic() && ((Float) ((C41125fl2) c27640qe.mo950b().get(0)).f80564b).floatValue() == 0.0f);
    }

    /* renamed from: d */
    public static boolean m106830d(C30641ye c30641ye) {
        return c30641ye == null || (c30641ye.isStatic() && ((C39923dj5) ((C41125fl2) c30641ye.mo950b().get(0)).f80564b).m43837a(1.0f, 1.0f));
    }

    /* renamed from: e */
    public static boolean m106829e(C27640qe c27640qe) {
        return c27640qe == null || (c27640qe.isStatic() && ((Float) ((C41125fl2) c27640qe.mo950b().get(0)).f80564b).floatValue() == 0.0f);
    }

    /* renamed from: f */
    public static boolean m106828f(C27640qe c27640qe) {
        return c27640qe == null || (c27640qe.isStatic() && ((Float) ((C41125fl2) c27640qe.mo950b().get(0)).f80564b).floatValue() == 0.0f);
    }

    /* renamed from: g */
    public static C1920Ee m106827g(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2) throws IOException {
        boolean z;
        C29600ve c29600ve;
        InterfaceC2901Ge<PointF, PointF> interfaceC2901Ge;
        C27640qe c27640qe;
        C27640qe c27640qe2;
        C27640qe c27640qe3;
        boolean z2;
        boolean z3 = false;
        if (abstractC39920dj2.mo2761q() == AbstractC39920dj2.EnumC19848b.BEGIN_OBJECT) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            abstractC39920dj2.mo2770c();
        }
        C27640qe c27640qe4 = null;
        C29600ve c29600ve2 = null;
        InterfaceC2901Ge<PointF, PointF> interfaceC2901Ge2 = null;
        C30641ye c30641ye = null;
        C27640qe c27640qe5 = null;
        C27640qe c27640qe6 = null;
        C28363se c28363se = null;
        C27640qe c27640qe7 = null;
        C27640qe c27640qe8 = null;
        while (abstractC39920dj2.mo2767g()) {
            switch (abstractC39920dj2.mo2760s(f9855a)) {
                case 0:
                    boolean z4 = z3;
                    abstractC39920dj2.mo2770c();
                    while (abstractC39920dj2.mo2767g()) {
                        if (abstractC39920dj2.mo2760s(f9856b) != 0) {
                            abstractC39920dj2.mo2759t();
                            abstractC39920dj2.mo2758u();
                        } else {
                            c29600ve2 = C29929we.m6566a(abstractC39920dj2, c47924rD2);
                        }
                    }
                    abstractC39920dj2.mo2768f();
                    z3 = z4;
                    continue;
                case 1:
                    interfaceC2901Ge2 = C29929we.m6565b(abstractC39920dj2, c47924rD2);
                    continue;
                case 2:
                    c30641ye = C3184He.m103622j(abstractC39920dj2, c47924rD2);
                    continue;
                case 3:
                    c47924rD2.m16223a("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    c28363se = C3184He.m103624h(abstractC39920dj2, c47924rD2);
                    continue;
                case 6:
                    c27640qe7 = C3184He.m103626f(abstractC39920dj2, c47924rD2, z3);
                    continue;
                case 7:
                    c27640qe8 = C3184He.m103626f(abstractC39920dj2, c47924rD2, z3);
                    continue;
                case 8:
                    c27640qe5 = C3184He.m103626f(abstractC39920dj2, c47924rD2, z3);
                    continue;
                case 9:
                    c27640qe6 = C3184He.m103626f(abstractC39920dj2, c47924rD2, z3);
                    continue;
                default:
                    abstractC39920dj2.mo2759t();
                    abstractC39920dj2.mo2758u();
                    continue;
            }
            C27640qe m103626f = C3184He.m103626f(abstractC39920dj2, c47924rD2, z3);
            if (m103626f.mo950b().isEmpty()) {
                m103626f.mo950b().add(new C41125fl2(c47924rD2, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(c47924rD2.m16218f())));
            } else if (((C41125fl2) m103626f.mo950b().get(0)).f80564b == null) {
                z2 = false;
                m103626f.mo950b().set(0, new C41125fl2(c47924rD2, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(c47924rD2.m16218f())));
                z3 = z2;
                c27640qe4 = m103626f;
            }
            z2 = false;
            z3 = z2;
            c27640qe4 = m103626f;
        }
        if (z) {
            abstractC39920dj2.mo2768f();
        }
        if (m106833a(c29600ve2)) {
            c29600ve = null;
        } else {
            c29600ve = c29600ve2;
        }
        if (m106832b(interfaceC2901Ge2)) {
            interfaceC2901Ge = null;
        } else {
            interfaceC2901Ge = interfaceC2901Ge2;
        }
        if (m106831c(c27640qe4)) {
            c27640qe = null;
        } else {
            c27640qe = c27640qe4;
        }
        if (m106830d(c30641ye)) {
            c30641ye = null;
        }
        if (m106828f(c27640qe5)) {
            c27640qe2 = null;
        } else {
            c27640qe2 = c27640qe5;
        }
        if (m106829e(c27640qe6)) {
            c27640qe3 = null;
        } else {
            c27640qe3 = c27640qe6;
        }
        return new C1920Ee(c29600ve, interfaceC2901Ge, c30641ye, c27640qe, c28363se, c27640qe7, c27640qe8, c27640qe2, c27640qe3);
    }
}
