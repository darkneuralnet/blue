package p000;

import java.io.IOException;
import java.util.ArrayList;
import p000.AbstractC39920dj2;
/* renamed from: ry5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C48373ry5 {

    /* renamed from: a */
    public static final AbstractC39920dj2.C19847a f107976a = AbstractC39920dj2.C19847a.m43839a("nm", "hd", "it");

    private C48373ry5() {
    }

    /* renamed from: a */
    public static C47781qy5 m14963a(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2) throws IOException {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (abstractC39920dj2.mo2767g()) {
            int mo2760s = abstractC39920dj2.mo2760s(f107976a);
            if (mo2760s != 0) {
                if (mo2760s != 1) {
                    if (mo2760s != 2) {
                        abstractC39920dj2.mo2758u();
                    } else {
                        abstractC39920dj2.mo2771b();
                        while (abstractC39920dj2.mo2767g()) {
                            InterfaceC52637zA0 m116044a = AA0.m116044a(abstractC39920dj2, c47924rD2);
                            if (m116044a != null) {
                                arrayList.add(m116044a);
                            }
                        }
                        abstractC39920dj2.mo2769d();
                    }
                } else {
                    z = abstractC39920dj2.mo2766i();
                }
            } else {
                str = abstractC39920dj2.mo2762n();
            }
        }
        return new C47781qy5(str, arrayList, z);
    }
}
