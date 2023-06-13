package p000;

import java.io.IOException;
import p000.AbstractC39920dj2;
import p000.C31834Ay5;
/* renamed from: By5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C32068By5 {

    /* renamed from: a */
    public static final AbstractC39920dj2.C19847a f3151a = AbstractC39920dj2.C19847a.m43839a("s", "e", "o", "nm", "m", "hd");

    private C32068By5() {
    }

    /* renamed from: a */
    public static C31834Ay5 m113209a(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2) throws IOException {
        String str = null;
        C31834Ay5.EnumC0364a enumC0364a = null;
        C27640qe c27640qe = null;
        C27640qe c27640qe2 = null;
        C27640qe c27640qe3 = null;
        boolean z = false;
        while (abstractC39920dj2.mo2767g()) {
            int mo2760s = abstractC39920dj2.mo2760s(f3151a);
            if (mo2760s != 0) {
                if (mo2760s != 1) {
                    if (mo2760s != 2) {
                        if (mo2760s != 3) {
                            if (mo2760s != 4) {
                                if (mo2760s != 5) {
                                    abstractC39920dj2.mo2758u();
                                } else {
                                    z = abstractC39920dj2.mo2766i();
                                }
                            } else {
                                enumC0364a = C31834Ay5.EnumC0364a.m114807b(abstractC39920dj2.mo2764l());
                            }
                        } else {
                            str = abstractC39920dj2.mo2762n();
                        }
                    } else {
                        c27640qe3 = C3184He.m103626f(abstractC39920dj2, c47924rD2, false);
                    }
                } else {
                    c27640qe2 = C3184He.m103626f(abstractC39920dj2, c47924rD2, false);
                }
            } else {
                c27640qe = C3184He.m103626f(abstractC39920dj2, c47924rD2, false);
            }
        }
        return new C31834Ay5(str, enumC0364a, c27640qe, c27640qe2, c27640qe3, z);
    }
}
