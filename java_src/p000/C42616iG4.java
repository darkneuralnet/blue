package p000;

import java.io.IOException;
import p000.AbstractC39920dj2;
/* renamed from: iG4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42616iG4 {

    /* renamed from: a */
    public static final AbstractC39920dj2.C19847a f87045a = AbstractC39920dj2.C19847a.m43839a("nm", "c", "o", "tr", "hd");

    private C42616iG4() {
    }

    /* renamed from: a */
    public static C41430gG4 m34275a(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2) throws IOException {
        String str = null;
        C27640qe c27640qe = null;
        C27640qe c27640qe2 = null;
        C1920Ee c1920Ee = null;
        boolean z = false;
        while (abstractC39920dj2.mo2767g()) {
            int mo2760s = abstractC39920dj2.mo2760s(f87045a);
            if (mo2760s != 0) {
                if (mo2760s != 1) {
                    if (mo2760s != 2) {
                        if (mo2760s != 3) {
                            if (mo2760s != 4) {
                                abstractC39920dj2.mo2758u();
                            } else {
                                z = abstractC39920dj2.mo2766i();
                            }
                        } else {
                            c1920Ee = C2373Fe.m106827g(abstractC39920dj2, c47924rD2);
                        }
                    } else {
                        c27640qe2 = C3184He.m103626f(abstractC39920dj2, c47924rD2, false);
                    }
                } else {
                    c27640qe = C3184He.m103626f(abstractC39920dj2, c47924rD2, false);
                }
            } else {
                str = abstractC39920dj2.mo2762n();
            }
        }
        return new C41430gG4(str, c27640qe, c27640qe2, c1920Ee, z);
    }
}
