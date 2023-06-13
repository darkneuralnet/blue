package p000;

import sun.misc.Unsafe;
/* renamed from: ms8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45352ms8 extends AbstractC34357Ls8 {
    public C45352ms8(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // p000.AbstractC34357Ls8
    /* renamed from: a */
    public final double mo4527a(Object obj, long j) {
        return Double.longBitsToDouble(m96251j(obj, j));
    }

    @Override // p000.AbstractC34357Ls8
    /* renamed from: b */
    public final float mo4526b(Object obj, long j) {
        return Float.intBitsToFloat(m96252i(obj, j));
    }

    @Override // p000.AbstractC34357Ls8
    /* renamed from: c */
    public final void mo4525c(Object obj, long j, boolean z) {
        if (C38229at8.f56500h) {
            C38229at8.m65313i(obj, j, z);
        } else {
            C38229at8.m65312j(obj, j, z);
        }
    }

    @Override // p000.AbstractC34357Ls8
    /* renamed from: d */
    public final void mo4524d(Object obj, long j, double d) {
        m96247n(obj, j, Double.doubleToLongBits(d));
    }

    @Override // p000.AbstractC34357Ls8
    /* renamed from: e */
    public final void mo4523e(Object obj, long j, float f) {
        m96248m(obj, j, Float.floatToIntBits(f));
    }

    @Override // p000.AbstractC34357Ls8
    /* renamed from: f */
    public final boolean mo4522f(Object obj, long j) {
        if (C38229at8.f56500h) {
            return C38229at8.m65305q(obj, j);
        }
        return C38229at8.m65304r(obj, j);
    }
}
