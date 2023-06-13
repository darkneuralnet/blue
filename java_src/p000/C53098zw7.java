package p000;

import sun.misc.Unsafe;
/* renamed from: zw7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C53098zw7 extends AbstractC32052Bw7 {
    public C53098zw7(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // p000.AbstractC32052Bw7
    /* renamed from: a */
    public final double mo97a(Object obj, long j) {
        return Double.longBitsToDouble(m113306k(obj, j));
    }

    @Override // p000.AbstractC32052Bw7
    /* renamed from: b */
    public final float mo96b(Object obj, long j) {
        return Float.intBitsToFloat(m113307j(obj, j));
    }

    @Override // p000.AbstractC32052Bw7
    /* renamed from: c */
    public final void mo95c(Object obj, long j, boolean z) {
        if (C32286Cw7.f4952h) {
            C32286Cw7.m111249d(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            C32286Cw7.m111248e(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // p000.AbstractC32052Bw7
    /* renamed from: d */
    public final void mo94d(Object obj, long j, byte b) {
        if (C32286Cw7.f4952h) {
            C32286Cw7.m111249d(obj, j, b);
        } else {
            C32286Cw7.m111248e(obj, j, b);
        }
    }

    @Override // p000.AbstractC32052Bw7
    /* renamed from: e */
    public final void mo93e(Object obj, long j, double d) {
        m113302o(obj, j, Double.doubleToLongBits(d));
    }

    @Override // p000.AbstractC32052Bw7
    /* renamed from: f */
    public final void mo92f(Object obj, long j, float f) {
        m113303n(obj, j, Float.floatToIntBits(f));
    }

    @Override // p000.AbstractC32052Bw7
    /* renamed from: g */
    public final boolean mo91g(Object obj, long j) {
        if (C32286Cw7.f4952h) {
            return C32286Cw7.m111228y(obj, j);
        }
        return C32286Cw7.m111227z(obj, j);
    }
}
