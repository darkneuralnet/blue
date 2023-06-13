package p000;

import java.io.IOException;
import p000.AbstractC39920dj2;
import p000.C43324jT2;
/* renamed from: lT2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C44510lT2 {

    /* renamed from: a */
    public static final AbstractC39920dj2.C19847a f96233a = AbstractC39920dj2.C19847a.m43839a("nm", "mm", "hd");

    private C44510lT2() {
    }

    /* renamed from: a */
    public static C43324jT2 m27259a(AbstractC39920dj2 abstractC39920dj2) throws IOException {
        String str = null;
        boolean z = false;
        C43324jT2.EnumC24846a enumC24846a = null;
        while (abstractC39920dj2.mo2767g()) {
            int mo2760s = abstractC39920dj2.mo2760s(f96233a);
            if (mo2760s != 0) {
                if (mo2760s != 1) {
                    if (mo2760s != 2) {
                        abstractC39920dj2.mo2759t();
                        abstractC39920dj2.mo2758u();
                    } else {
                        z = abstractC39920dj2.mo2766i();
                    }
                } else {
                    enumC24846a = C43324jT2.EnumC24846a.m30584b(abstractC39920dj2.mo2764l());
                }
            } else {
                str = abstractC39920dj2.mo2762n();
            }
        }
        return new C43324jT2(str, enumC24846a, z);
    }
}
