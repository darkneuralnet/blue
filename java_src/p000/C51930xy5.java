package p000;

import java.io.IOException;
import p000.AbstractC39920dj2;
/* renamed from: xy5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C51930xy5 {

    /* renamed from: a */
    public static AbstractC39920dj2.C19847a f118427a = AbstractC39920dj2.C19847a.m43839a("nm", "ind", "ks", "hd");

    private C51930xy5() {
    }

    /* renamed from: a */
    public static C51337wy5 m4369a(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2) throws IOException {
        String str = null;
        int i = 0;
        boolean z = false;
        C31066ze c31066ze = null;
        while (abstractC39920dj2.mo2767g()) {
            int mo2760s = abstractC39920dj2.mo2760s(f118427a);
            if (mo2760s != 0) {
                if (mo2760s != 1) {
                    if (mo2760s != 2) {
                        if (mo2760s != 3) {
                            abstractC39920dj2.mo2758u();
                        } else {
                            z = abstractC39920dj2.mo2766i();
                        }
                    } else {
                        c31066ze = C3184He.m103621k(abstractC39920dj2, c47924rD2);
                    }
                } else {
                    i = abstractC39920dj2.mo2764l();
                }
            } else {
                str = abstractC39920dj2.mo2762n();
            }
        }
        return new C51337wy5(str, i, c31066ze, z);
    }
}
