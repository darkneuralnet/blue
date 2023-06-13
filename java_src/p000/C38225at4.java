package p000;

import android.graphics.PointF;
import java.io.IOException;
import p000.AbstractC39920dj2;
/* renamed from: at4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C38225at4 {

    /* renamed from: a */
    public static final AbstractC39920dj2.C19847a f56488a = AbstractC39920dj2.C19847a.m43839a("nm", "p", "s", "r", "hd");

    private C38225at4() {
    }

    /* renamed from: a */
    public static C37395Ys4 m65325a(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2) throws IOException {
        String str = null;
        InterfaceC2901Ge<PointF, PointF> interfaceC2901Ge = null;
        C30260xe c30260xe = null;
        C27640qe c27640qe = null;
        boolean z = false;
        while (abstractC39920dj2.mo2767g()) {
            int mo2760s = abstractC39920dj2.mo2760s(f56488a);
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
                            c27640qe = C3184He.m103627e(abstractC39920dj2, c47924rD2);
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
        return new C37395Ys4(str, interfaceC2901Ge, c30260xe, c27640qe, z);
    }
}
