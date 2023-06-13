package p000;

import sun.misc.Unsafe;
/* renamed from: vv8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50717vv8 extends AbstractC33916Jv8 {
    public C50717vv8(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // p000.AbstractC33916Jv8
    /* renamed from: a */
    public final double mo7742a(Object obj, long j) {
        return Double.longBitsToDouble(this.f18780a.getLong(obj, j));
    }

    @Override // p000.AbstractC33916Jv8
    /* renamed from: b */
    public final float mo7741b(Object obj, long j) {
        return Float.intBitsToFloat(this.f18780a.getInt(obj, j));
    }

    @Override // p000.AbstractC33916Jv8
    /* renamed from: c */
    public final void mo7740c(Object obj, long j, boolean z) {
        if (C37192Xv8.f44252h) {
            C37192Xv8.m76075d(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            C37192Xv8.m76074e(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // p000.AbstractC33916Jv8
    /* renamed from: d */
    public final void mo7739d(Object obj, long j, byte b) {
        if (C37192Xv8.f44252h) {
            C37192Xv8.m76075d(obj, j, b);
        } else {
            C37192Xv8.m76074e(obj, j, b);
        }
    }

    @Override // p000.AbstractC33916Jv8
    /* renamed from: e */
    public final void mo7738e(Object obj, long j, double d) {
        this.f18780a.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // p000.AbstractC33916Jv8
    /* renamed from: f */
    public final void mo7737f(Object obj, long j, float f) {
        this.f18780a.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // p000.AbstractC33916Jv8
    /* renamed from: g */
    public final boolean mo7736g(Object obj, long j) {
        if (C37192Xv8.f44252h) {
            return C37192Xv8.m76054y(obj, j);
        }
        return C37192Xv8.m76053z(obj, j);
    }
}
