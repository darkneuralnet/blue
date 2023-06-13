package p000;

import sun.misc.Unsafe;
/* renamed from: Ic7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33510Ic7 extends AbstractC33978Kc7 {
    public C33510Ic7(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // p000.AbstractC33978Kc7
    /* renamed from: a */
    public final double mo98659a(Object obj, long j) {
        return Double.longBitsToDouble(this.f19944a.getLong(obj, j));
    }

    @Override // p000.AbstractC33978Kc7
    /* renamed from: b */
    public final float mo98658b(Object obj, long j) {
        return Float.intBitsToFloat(this.f19944a.getInt(obj, j));
    }

    @Override // p000.AbstractC33978Kc7
    /* renamed from: c */
    public final void mo98657c(Object obj, long j, boolean z) {
        if (C34212Lc7.f21772h) {
            C34212Lc7.m96574d(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            C34212Lc7.m96573e(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // p000.AbstractC33978Kc7
    /* renamed from: d */
    public final void mo98656d(Object obj, long j, byte b) {
        if (C34212Lc7.f21772h) {
            C34212Lc7.m96574d(obj, j, b);
        } else {
            C34212Lc7.m96573e(obj, j, b);
        }
    }

    @Override // p000.AbstractC33978Kc7
    /* renamed from: e */
    public final void mo98655e(Object obj, long j, double d) {
        this.f19944a.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // p000.AbstractC33978Kc7
    /* renamed from: f */
    public final void mo98654f(Object obj, long j, float f) {
        this.f19944a.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // p000.AbstractC33978Kc7
    /* renamed from: g */
    public final boolean mo98653g(Object obj, long j) {
        if (C34212Lc7.f21772h) {
            return C34212Lc7.m96553y(obj, j);
        }
        return C34212Lc7.m96552z(obj, j);
    }
}
