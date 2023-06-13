package p000;

import com.facebook.share.internal.C17296a;
import java.io.IOException;
import p000.AbstractC39920dj2;
/* renamed from: De */
/* loaded from: classes2.dex */
public class C1576De {

    /* renamed from: a */
    public static final AbstractC39920dj2.C19847a f6121a = AbstractC39920dj2.C19847a.m43839a(C17296a.f69688o);

    /* renamed from: b */
    public static final AbstractC39920dj2.C19847a f6122b = AbstractC39920dj2.C19847a.m43839a("fc", "sc", "sw", "t");

    private C1576De() {
    }

    /* renamed from: a */
    public static C1109Ce m110073a(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2) throws IOException {
        abstractC39920dj2.mo2770c();
        C1109Ce c1109Ce = null;
        while (abstractC39920dj2.mo2767g()) {
            if (abstractC39920dj2.mo2760s(f6121a) != 0) {
                abstractC39920dj2.mo2759t();
                abstractC39920dj2.mo2758u();
            } else {
                c1109Ce = m110072b(abstractC39920dj2, c47924rD2);
            }
        }
        abstractC39920dj2.mo2768f();
        if (c1109Ce == null) {
            return new C1109Ce(null, null, null, null);
        }
        return c1109Ce;
    }

    /* renamed from: b */
    public static C1109Ce m110072b(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2) throws IOException {
        abstractC39920dj2.mo2770c();
        C27323pe c27323pe = null;
        C27323pe c27323pe2 = null;
        C27640qe c27640qe = null;
        C27640qe c27640qe2 = null;
        while (abstractC39920dj2.mo2767g()) {
            int mo2760s = abstractC39920dj2.mo2760s(f6122b);
            if (mo2760s != 0) {
                if (mo2760s != 1) {
                    if (mo2760s != 2) {
                        if (mo2760s != 3) {
                            abstractC39920dj2.mo2759t();
                            abstractC39920dj2.mo2758u();
                        } else {
                            c27640qe2 = C3184He.m103627e(abstractC39920dj2, c47924rD2);
                        }
                    } else {
                        c27640qe = C3184He.m103627e(abstractC39920dj2, c47924rD2);
                    }
                } else {
                    c27323pe2 = C3184He.m103629c(abstractC39920dj2, c47924rD2);
                }
            } else {
                c27323pe = C3184He.m103629c(abstractC39920dj2, c47924rD2);
            }
        }
        abstractC39920dj2.mo2768f();
        return new C1109Ce(c27323pe, c27323pe2, c27640qe, c27640qe2);
    }
}
