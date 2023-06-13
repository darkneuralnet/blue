package p000;

import java.io.IOException;
import p000.AbstractC39920dj2;
/* renamed from: gc5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C41631gc5 {

    /* renamed from: a */
    public static final AbstractC39920dj2.C19847a f83946a = AbstractC39920dj2.C19847a.m43839a("nm", "r", "hd");

    private C41631gc5() {
    }

    /* renamed from: a */
    public static C40445ec5 m37977a(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2) throws IOException {
        boolean z = false;
        String str = null;
        C27640qe c27640qe = null;
        while (abstractC39920dj2.mo2767g()) {
            int mo2760s = abstractC39920dj2.mo2760s(f83946a);
            if (mo2760s != 0) {
                if (mo2760s != 1) {
                    if (mo2760s != 2) {
                        abstractC39920dj2.mo2758u();
                    } else {
                        z = abstractC39920dj2.mo2766i();
                    }
                } else {
                    c27640qe = C3184He.m103626f(abstractC39920dj2, c47924rD2, true);
                }
            } else {
                str = abstractC39920dj2.mo2762n();
            }
        }
        if (z) {
            return null;
        }
        return new C40445ec5(str, c27640qe);
    }
}
