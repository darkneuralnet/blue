package p000;

import java.io.Serializable;
/* renamed from: AB0 */
/* loaded from: classes8.dex */
public final class AB0 implements FB0, Serializable {

    /* renamed from: b */
    public static final AB0 f234b = new AB0();
    private static final long serialVersionUID = -4099577099607551657L;

    private AB0() {
    }

    /* renamed from: d */
    public static AB0 m116035d() {
        return f234b;
    }

    private Object readResolve() {
        return m116035d();
    }

    @Override // p000.FB0
    /* renamed from: a */
    public EB0 mo107447a(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i3 > 1) {
            i3 = 1;
        }
        if (i4 > 3) {
            i4 = 3;
        }
        if (i4 < 2) {
            i4 = 2;
        }
        return new C52646zB0(i, i4 + i3, i3);
    }

    @Override // p000.FB0
    /* renamed from: b */
    public EB0 mo107446b(int i, int i2) {
        if (i2 > 3) {
            i2 = 3;
        }
        if (i2 < 2) {
            i2 = 2;
        }
        return new C52646zB0(i, i2);
    }

    @Override // p000.FB0
    /* renamed from: c */
    public EB0 mo107445c(C52053yB0[] c52053yB0Arr) {
        return new C52646zB0(c52053yB0Arr);
    }
}
