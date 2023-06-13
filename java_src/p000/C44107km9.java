package p000;

import sun.misc.Unsafe;
/* renamed from: km9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44107km9 extends AbstractC47665qm9 {
    public C44107km9(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // p000.AbstractC47665qm9
    /* renamed from: a */
    public final double mo17094a(Object obj, long j) {
        return Double.longBitsToDouble(m17084k(obj, j));
    }

    @Override // p000.AbstractC47665qm9
    /* renamed from: b */
    public final float mo17093b(Object obj, long j) {
        return Float.intBitsToFloat(m17085j(obj, j));
    }

    @Override // p000.AbstractC47665qm9
    /* renamed from: c */
    public final void mo17092c(Object obj, long j, boolean z) {
        if (C51221wm9.f116510h) {
            C51221wm9.m6363d(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            C51221wm9.m6362e(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // p000.AbstractC47665qm9
    /* renamed from: d */
    public final void mo17091d(Object obj, long j, byte b) {
        if (C51221wm9.f116510h) {
            C51221wm9.m6363d(obj, j, b);
        } else {
            C51221wm9.m6362e(obj, j, b);
        }
    }

    @Override // p000.AbstractC47665qm9
    /* renamed from: e */
    public final void mo17090e(Object obj, long j, double d) {
        m17080o(obj, j, Double.doubleToLongBits(d));
    }

    @Override // p000.AbstractC47665qm9
    /* renamed from: f */
    public final void mo17089f(Object obj, long j, float f) {
        m17081n(obj, j, Float.floatToIntBits(f));
    }

    @Override // p000.AbstractC47665qm9
    /* renamed from: g */
    public final boolean mo17088g(Object obj, long j) {
        if (C51221wm9.f116510h) {
            return C51221wm9.m6342y(obj, j);
        }
        return C51221wm9.m6341z(obj, j);
    }
}
