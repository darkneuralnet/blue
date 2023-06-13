package p000;

import android.graphics.PointF;
import java.io.IOException;
import p000.AbstractC39920dj2;
import p000.N51;
/* renamed from: O51 */
/* loaded from: classes2.dex */
public class O51 implements InterfaceC34274Lj6<N51> {

    /* renamed from: a */
    public static final O51 f25618a = new O51();

    /* renamed from: b */
    public static final AbstractC39920dj2.C19847a f25619b = AbstractC39920dj2.C19847a.m43839a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    private O51() {
    }

    @Override // p000.InterfaceC34274Lj6
    /* renamed from: b */
    public N51 mo2631a(AbstractC39920dj2 abstractC39920dj2, float f) throws IOException {
        N51.EnumC5475a enumC5475a = N51.EnumC5475a.CENTER;
        abstractC39920dj2.mo2770c();
        N51.EnumC5475a enumC5475a2 = enumC5475a;
        String str = null;
        String str2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = true;
        while (abstractC39920dj2.mo2767g()) {
            switch (abstractC39920dj2.mo2760s(f25619b)) {
                case 0:
                    str = abstractC39920dj2.mo2762n();
                    break;
                case 1:
                    str2 = abstractC39920dj2.mo2762n();
                    break;
                case 2:
                    f2 = (float) abstractC39920dj2.mo2765k();
                    break;
                case 3:
                    int mo2764l = abstractC39920dj2.mo2764l();
                    enumC5475a2 = N51.EnumC5475a.CENTER;
                    if (mo2764l <= enumC5475a2.ordinal() && mo2764l >= 0) {
                        enumC5475a2 = N51.EnumC5475a.values()[mo2764l];
                        break;
                    }
                    break;
                case 4:
                    i = abstractC39920dj2.mo2764l();
                    break;
                case 5:
                    f3 = (float) abstractC39920dj2.mo2765k();
                    break;
                case 6:
                    f4 = (float) abstractC39920dj2.mo2765k();
                    break;
                case 7:
                    i2 = C52963zj2.m473d(abstractC39920dj2);
                    break;
                case 8:
                    i3 = C52963zj2.m473d(abstractC39920dj2);
                    break;
                case 9:
                    f5 = (float) abstractC39920dj2.mo2765k();
                    break;
                case 10:
                    z = abstractC39920dj2.mo2766i();
                    break;
                case 11:
                    abstractC39920dj2.mo2771b();
                    PointF pointF3 = new PointF(((float) abstractC39920dj2.mo2765k()) * f, ((float) abstractC39920dj2.mo2765k()) * f);
                    abstractC39920dj2.mo2769d();
                    pointF = pointF3;
                    break;
                case 12:
                    abstractC39920dj2.mo2771b();
                    PointF pointF4 = new PointF(((float) abstractC39920dj2.mo2765k()) * f, ((float) abstractC39920dj2.mo2765k()) * f);
                    abstractC39920dj2.mo2769d();
                    pointF2 = pointF4;
                    break;
                default:
                    abstractC39920dj2.mo2759t();
                    abstractC39920dj2.mo2758u();
                    break;
            }
        }
        abstractC39920dj2.mo2768f();
        return new N51(str, str2, f2, enumC5475a2, i, f3, f4, i2, i3, f5, z, pointF, pointF2);
    }
}
