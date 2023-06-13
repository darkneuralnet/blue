package p000;

import java.io.IOException;
import p000.AbstractC39920dj2;
/* renamed from: NY */
/* loaded from: classes2.dex */
public class C5603NY {

    /* renamed from: a */
    public static final AbstractC39920dj2.C19847a f24756a = AbstractC39920dj2.C19847a.m43839a("ef");

    /* renamed from: b */
    public static final AbstractC39920dj2.C19847a f24757b = AbstractC39920dj2.C19847a.m43839a("ty", "v");

    /* renamed from: a */
    public static C5309MY m93791a(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2) throws IOException {
        abstractC39920dj2.mo2770c();
        C5309MY c5309my = null;
        while (true) {
            boolean z = false;
            while (abstractC39920dj2.mo2767g()) {
                int mo2760s = abstractC39920dj2.mo2760s(f24757b);
                if (mo2760s != 0) {
                    if (mo2760s != 1) {
                        abstractC39920dj2.mo2759t();
                        abstractC39920dj2.mo2758u();
                    } else if (z) {
                        c5309my = new C5309MY(C3184He.m103627e(abstractC39920dj2, c47924rD2));
                    } else {
                        abstractC39920dj2.mo2758u();
                    }
                } else if (abstractC39920dj2.mo2764l() == 0) {
                    z = true;
                }
            }
            abstractC39920dj2.mo2768f();
            return c5309my;
        }
    }

    /* renamed from: b */
    public static C5309MY m93790b(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2) throws IOException {
        C5309MY c5309my = null;
        while (abstractC39920dj2.mo2767g()) {
            if (abstractC39920dj2.mo2760s(f24756a) != 0) {
                abstractC39920dj2.mo2759t();
                abstractC39920dj2.mo2758u();
            } else {
                abstractC39920dj2.mo2771b();
                while (abstractC39920dj2.mo2767g()) {
                    C5309MY m93791a = m93791a(abstractC39920dj2, c47924rD2);
                    if (m93791a != null) {
                        c5309my = m93791a;
                    }
                }
                abstractC39920dj2.mo2769d();
            }
        }
        return c5309my;
    }
}
