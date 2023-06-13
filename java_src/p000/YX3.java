package p000;

import android.graphics.PointF;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.IOException;
import p000.AbstractC39920dj2;
import p000.XX3;
/* renamed from: YX3 */
/* loaded from: classes2.dex */
public class YX3 {

    /* renamed from: a */
    public static final AbstractC39920dj2.C19847a f45981a = AbstractC39920dj2.C19847a.m43839a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd", DateTokenConverter.CONVERTER_KEY);

    private YX3() {
    }

    /* renamed from: a */
    public static XX3 m74931a(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2, int i) throws IOException {
        boolean z;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = false;
        boolean z3 = z;
        String str = null;
        XX3.EnumC9423a enumC9423a = null;
        C27640qe c27640qe = null;
        InterfaceC2901Ge<PointF, PointF> interfaceC2901Ge = null;
        C27640qe c27640qe2 = null;
        C27640qe c27640qe3 = null;
        C27640qe c27640qe4 = null;
        C27640qe c27640qe5 = null;
        C27640qe c27640qe6 = null;
        while (abstractC39920dj2.mo2767g()) {
            switch (abstractC39920dj2.mo2760s(f45981a)) {
                case 0:
                    str = abstractC39920dj2.mo2762n();
                    break;
                case 1:
                    enumC9423a = XX3.EnumC9423a.m76896b(abstractC39920dj2.mo2764l());
                    break;
                case 2:
                    c27640qe = C3184He.m103626f(abstractC39920dj2, c47924rD2, false);
                    break;
                case 3:
                    interfaceC2901Ge = C29929we.m6565b(abstractC39920dj2, c47924rD2);
                    break;
                case 4:
                    c27640qe2 = C3184He.m103626f(abstractC39920dj2, c47924rD2, false);
                    break;
                case 5:
                    c27640qe4 = C3184He.m103627e(abstractC39920dj2, c47924rD2);
                    break;
                case 6:
                    c27640qe6 = C3184He.m103626f(abstractC39920dj2, c47924rD2, false);
                    break;
                case 7:
                    c27640qe3 = C3184He.m103627e(abstractC39920dj2, c47924rD2);
                    break;
                case 8:
                    c27640qe5 = C3184He.m103626f(abstractC39920dj2, c47924rD2, false);
                    break;
                case 9:
                    z2 = abstractC39920dj2.mo2766i();
                    break;
                case 10:
                    if (abstractC39920dj2.mo2764l() == 3) {
                        z3 = true;
                        break;
                    } else {
                        z3 = false;
                        break;
                    }
                default:
                    abstractC39920dj2.mo2759t();
                    abstractC39920dj2.mo2758u();
                    break;
            }
        }
        return new XX3(str, enumC9423a, c27640qe, interfaceC2901Ge, c27640qe2, c27640qe3, c27640qe4, c27640qe5, c27640qe6, z2, z3);
    }
}
