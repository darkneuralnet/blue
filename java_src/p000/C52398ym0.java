package p000;

import android.graphics.Color;
import java.io.IOException;
import p000.AbstractC39920dj2;
/* renamed from: ym0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C52398ym0 implements InterfaceC34274Lj6<Integer> {

    /* renamed from: a */
    public static final C52398ym0 f120147a = new C52398ym0();

    private C52398ym0() {
    }

    @Override // p000.InterfaceC34274Lj6
    /* renamed from: b */
    public Integer mo2631a(AbstractC39920dj2 abstractC39920dj2, float f) throws IOException {
        boolean z;
        double d;
        if (abstractC39920dj2.mo2761q() == AbstractC39920dj2.EnumC19848b.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            abstractC39920dj2.mo2771b();
        }
        double mo2765k = abstractC39920dj2.mo2765k();
        double mo2765k2 = abstractC39920dj2.mo2765k();
        double mo2765k3 = abstractC39920dj2.mo2765k();
        if (abstractC39920dj2.mo2761q() == AbstractC39920dj2.EnumC19848b.NUMBER) {
            d = abstractC39920dj2.mo2765k();
        } else {
            d = 1.0d;
        }
        if (z) {
            abstractC39920dj2.mo2769d();
        }
        if (mo2765k <= 1.0d && mo2765k2 <= 1.0d && mo2765k3 <= 1.0d) {
            mo2765k *= 255.0d;
            mo2765k2 *= 255.0d;
            mo2765k3 *= 255.0d;
            if (d <= 1.0d) {
                d *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) d, (int) mo2765k, (int) mo2765k2, (int) mo2765k3));
    }
}
