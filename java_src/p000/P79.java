package p000;

import sun.misc.Unsafe;
/* renamed from: P79 */
/* loaded from: classes5.dex */
public final class P79 extends AbstractC40175e89 {
    public P79(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // p000.AbstractC40175e89
    /* renamed from: a */
    public final double mo43186a(Object obj, long j) {
        return Double.longBitsToDouble(this.f78012a.getLong(obj, j));
    }

    @Override // p000.AbstractC40175e89
    /* renamed from: b */
    public final float mo43185b(Object obj, long j) {
        return Float.intBitsToFloat(this.f78012a.getInt(obj, j));
    }

    @Override // p000.AbstractC40175e89
    /* renamed from: c */
    public final void mo43184c(Object obj, long j, boolean z) {
        if (C44919m89.f97416h) {
            C44919m89.m26275d(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            C44919m89.m26274e(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // p000.AbstractC40175e89
    /* renamed from: d */
    public final void mo43183d(Object obj, long j, byte b) {
        if (C44919m89.f97416h) {
            C44919m89.m26275d(obj, j, b);
        } else {
            C44919m89.m26274e(obj, j, b);
        }
    }

    @Override // p000.AbstractC40175e89
    /* renamed from: e */
    public final void mo43182e(Object obj, long j, double d) {
        this.f78012a.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // p000.AbstractC40175e89
    /* renamed from: f */
    public final void mo43181f(Object obj, long j, float f) {
        this.f78012a.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // p000.AbstractC40175e89
    /* renamed from: g */
    public final boolean mo43180g(Object obj, long j) {
        if (C44919m89.f97416h) {
            return C44919m89.m26254y(obj, j);
        }
        return C44919m89.m26253z(obj, j);
    }
}
