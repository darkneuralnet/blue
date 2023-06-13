package p000;

import android.graphics.PointF;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.IOException;
import p000.AbstractC39920dj2;
/* renamed from: Aj0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C31694Aj0 {

    /* renamed from: a */
    public static final AbstractC39920dj2.C19847a f981a = AbstractC39920dj2.C19847a.m43839a("nm", "p", "s", "hd", DateTokenConverter.CONVERTER_KEY);

    private C31694Aj0() {
    }

    /* renamed from: a */
    public static C52961zj0 m115359a(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2, int i) throws IOException {
        boolean z;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        boolean z3 = false;
        String str = null;
        InterfaceC2901Ge<PointF, PointF> interfaceC2901Ge = null;
        C30260xe c30260xe = null;
        while (abstractC39920dj2.mo2767g()) {
            int mo2760s = abstractC39920dj2.mo2760s(f981a);
            if (mo2760s != 0) {
                if (mo2760s != 1) {
                    if (mo2760s != 2) {
                        if (mo2760s != 3) {
                            if (mo2760s != 4) {
                                abstractC39920dj2.mo2759t();
                                abstractC39920dj2.mo2758u();
                            } else if (abstractC39920dj2.mo2764l() == 3) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z3 = abstractC39920dj2.mo2766i();
                        }
                    } else {
                        c30260xe = C3184He.m103623i(abstractC39920dj2, c47924rD2);
                    }
                } else {
                    interfaceC2901Ge = C29929we.m6565b(abstractC39920dj2, c47924rD2);
                }
            } else {
                str = abstractC39920dj2.mo2762n();
            }
        }
        return new C52961zj0(str, interfaceC2901Ge, c30260xe, z2, z3);
    }
}
