package p000;

import java.io.IOException;
import p000.AbstractC39920dj2;
/* renamed from: ww1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C51313ww1 {

    /* renamed from: a */
    public static final AbstractC39920dj2.C19847a f116843a = AbstractC39920dj2.C19847a.m43839a("fFamily", "fName", "fStyle", "ascent");

    private C51313ww1() {
    }

    /* renamed from: a */
    public static C41234fw1 m6089a(AbstractC39920dj2 abstractC39920dj2) throws IOException {
        abstractC39920dj2.mo2770c();
        String str = null;
        String str2 = null;
        float f = 0.0f;
        String str3 = null;
        while (abstractC39920dj2.mo2767g()) {
            int mo2760s = abstractC39920dj2.mo2760s(f116843a);
            if (mo2760s != 0) {
                if (mo2760s != 1) {
                    if (mo2760s != 2) {
                        if (mo2760s != 3) {
                            abstractC39920dj2.mo2759t();
                            abstractC39920dj2.mo2758u();
                        } else {
                            f = (float) abstractC39920dj2.mo2765k();
                        }
                    } else {
                        str2 = abstractC39920dj2.mo2762n();
                    }
                } else {
                    str3 = abstractC39920dj2.mo2762n();
                }
            } else {
                str = abstractC39920dj2.mo2762n();
            }
        }
        abstractC39920dj2.mo2768f();
        return new C41234fw1(str, str3, str2, f);
    }
}
