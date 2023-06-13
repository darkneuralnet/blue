package p000;

import java.io.IOException;
import p000.AbstractC39920dj2;
/* renamed from: ej5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C40515ej5 implements InterfaceC34274Lj6<C39923dj5> {

    /* renamed from: a */
    public static final C40515ej5 f78741a = new C40515ej5();

    private C40515ej5() {
    }

    @Override // p000.InterfaceC34274Lj6
    /* renamed from: b */
    public C39923dj5 mo2631a(AbstractC39920dj2 abstractC39920dj2, float f) throws IOException {
        boolean z;
        if (abstractC39920dj2.mo2761q() == AbstractC39920dj2.EnumC19848b.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            abstractC39920dj2.mo2771b();
        }
        float mo2765k = (float) abstractC39920dj2.mo2765k();
        float mo2765k2 = (float) abstractC39920dj2.mo2765k();
        while (abstractC39920dj2.mo2767g()) {
            abstractC39920dj2.mo2758u();
        }
        if (z) {
            abstractC39920dj2.mo2769d();
        }
        return new C39923dj5((mo2765k / 100.0f) * f, (mo2765k2 / 100.0f) * f);
    }
}
