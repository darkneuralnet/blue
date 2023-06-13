package p000;

import sun.misc.Unsafe;
/* renamed from: ds9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C40016ds9 extends Ds9 {
    public C40016ds9(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // p000.Ds9
    /* renamed from: a */
    public final double mo43557a(Object obj, long j) {
        return Double.longBitsToDouble(m109814k(obj, j));
    }

    @Override // p000.Ds9
    /* renamed from: b */
    public final float mo43556b(Object obj, long j) {
        return Float.intBitsToFloat(m109815j(obj, j));
    }

    @Override // p000.Ds9
    /* renamed from: c */
    public final void mo43555c(Object obj, long j, boolean z) {
        if (Fs9.f10402i) {
            Fs9.m106352d(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            Fs9.m106351e(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // p000.Ds9
    /* renamed from: d */
    public final void mo43554d(Object obj, long j, byte b) {
        if (Fs9.f10402i) {
            Fs9.m106352d(obj, j, b);
        } else {
            Fs9.m106351e(obj, j, b);
        }
    }

    @Override // p000.Ds9
    /* renamed from: e */
    public final void mo43553e(Object obj, long j, double d) {
        m109810o(obj, j, Double.doubleToLongBits(d));
    }

    @Override // p000.Ds9
    /* renamed from: f */
    public final void mo43552f(Object obj, long j, float f) {
        m109811n(obj, j, Float.floatToIntBits(f));
    }

    @Override // p000.Ds9
    /* renamed from: g */
    public final boolean mo43551g(Object obj, long j) {
        if (Fs9.f10402i) {
            return Fs9.m106331y(obj, j);
        }
        return Fs9.m106330z(obj, j);
    }
}
