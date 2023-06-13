package p000;

import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;
import p000.AbstractC39920dj2;
/* renamed from: we */
/* loaded from: classes2.dex */
public class C29929we {

    /* renamed from: a */
    public static final AbstractC39920dj2.C19847a f116294a = AbstractC39920dj2.C19847a.m43839a("k", "x", "y");

    private C29929we() {
    }

    /* renamed from: a */
    public static C29600ve m6566a(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (abstractC39920dj2.mo2761q() == AbstractC39920dj2.EnumC19848b.BEGIN_ARRAY) {
            abstractC39920dj2.mo2771b();
            while (abstractC39920dj2.mo2767g()) {
                arrayList.add(C45607nJ3.m23981a(abstractC39920dj2, c47924rD2));
            }
            abstractC39920dj2.mo2769d();
            C42904il2.m33513b(arrayList);
        } else {
            arrayList.add(new C41125fl2(C52963zj2.m472e(abstractC39920dj2, C33095Gi6.m104867e())));
        }
        return new C29600ve(arrayList);
    }

    /* renamed from: b */
    public static InterfaceC2901Ge<PointF, PointF> m6565b(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2) throws IOException {
        abstractC39920dj2.mo2770c();
        C29600ve c29600ve = null;
        C27640qe c27640qe = null;
        boolean z = false;
        C27640qe c27640qe2 = null;
        while (abstractC39920dj2.mo2761q() != AbstractC39920dj2.EnumC19848b.END_OBJECT) {
            int mo2760s = abstractC39920dj2.mo2760s(f116294a);
            if (mo2760s != 0) {
                if (mo2760s != 1) {
                    if (mo2760s != 2) {
                        abstractC39920dj2.mo2759t();
                        abstractC39920dj2.mo2758u();
                    } else if (abstractC39920dj2.mo2761q() == AbstractC39920dj2.EnumC19848b.STRING) {
                        abstractC39920dj2.mo2758u();
                        z = true;
                    } else {
                        c27640qe = C3184He.m103627e(abstractC39920dj2, c47924rD2);
                    }
                } else if (abstractC39920dj2.mo2761q() == AbstractC39920dj2.EnumC19848b.STRING) {
                    abstractC39920dj2.mo2758u();
                    z = true;
                } else {
                    c27640qe2 = C3184He.m103627e(abstractC39920dj2, c47924rD2);
                }
            } else {
                c29600ve = m6566a(abstractC39920dj2, c47924rD2);
            }
        }
        abstractC39920dj2.mo2768f();
        if (z) {
            c47924rD2.m16223a("Lottie doesn't support expressions.");
        }
        if (c29600ve != null) {
            return c29600ve;
        }
        return new C0165Ae(c27640qe2, c27640qe);
    }
}
