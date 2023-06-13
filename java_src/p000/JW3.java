package p000;

import android.graphics.PointF;
import java.io.IOException;
import p000.AbstractC39920dj2;
/* renamed from: JW3 */
/* loaded from: classes2.dex */
public class JW3 implements InterfaceC34274Lj6<PointF> {

    /* renamed from: a */
    public static final JW3 f17711a = new JW3();

    private JW3() {
    }

    @Override // p000.InterfaceC34274Lj6
    /* renamed from: b */
    public PointF mo2631a(AbstractC39920dj2 abstractC39920dj2, float f) throws IOException {
        AbstractC39920dj2.EnumC19848b mo2761q = abstractC39920dj2.mo2761q();
        if (mo2761q == AbstractC39920dj2.EnumC19848b.BEGIN_ARRAY) {
            return C52963zj2.m472e(abstractC39920dj2, f);
        }
        if (mo2761q == AbstractC39920dj2.EnumC19848b.BEGIN_OBJECT) {
            return C52963zj2.m472e(abstractC39920dj2, f);
        }
        if (mo2761q == AbstractC39920dj2.EnumC19848b.NUMBER) {
            PointF pointF = new PointF(((float) abstractC39920dj2.mo2765k()) * f, ((float) abstractC39920dj2.mo2765k()) * f);
            while (abstractC39920dj2.mo2767g()) {
                abstractC39920dj2.mo2758u();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + mo2761q);
    }
}
