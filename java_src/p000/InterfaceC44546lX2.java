package p000;

import java.math.BigDecimal;
import java.math.BigInteger;
/* renamed from: lX2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC44546lX2 extends InterfaceC38077ae6, InterfaceC34742Nj6<Number>, Comparable<InterfaceC38077ae6> {
    /* renamed from: M2 */
    static InterfaceC44546lX2 m27181M2(Number number) {
        InterfaceC48754sd3 m13024c = C49060t80.m13024c();
        if (m13024c.mo13934a(number)) {
            return identity();
        }
        Number mo13931d = m13024c.mo13931d(number);
        if (mo13931d instanceof C47670qn4) {
            return m27179a1((C47670qn4) mo13931d);
        }
        if (m13024c.mo13932c(mo13931d)) {
            if (mo13931d instanceof BigInteger) {
                return m27179a1(C47670qn4.m17058o((BigInteger) mo13931d));
            }
            if (m13024c instanceof C39199cY0) {
                return m27179a1(C47670qn4.m17059n(mo13931d.longValue()));
            }
            throw new UnsupportedOperationException("not yet supported");
        } else if (!(mo13931d instanceof Double) && !(mo13931d instanceof Float)) {
            if (mo13931d instanceof BigDecimal) {
                return m27179a1(C47670qn4.m17061l((BigDecimal) mo13931d));
            }
            throw new UnsupportedOperationException("not yet supported");
        } else {
            return m27177t0(mo13931d.doubleValue());
        }
    }

    /* renamed from: a1 */
    static InterfaceC44546lX2 m27179a1(C47670qn4 c47670qn4) {
        if (c47670qn4.equals(C47670qn4.f105800m)) {
            return identity();
        }
        return C47077pn4.m18690p(c47670qn4);
    }

    static InterfaceC44546lX2 identity() {
        return C45129mW1.f98125b;
    }

    /* renamed from: l1 */
    static InterfaceC44546lX2 m27178l1(long j, long j2) {
        return m27179a1(C47670qn4.m17062k(j, j2));
    }

    /* renamed from: t0 */
    static InterfaceC44546lX2 m27177t0(double d) {
        if (d == 1.0d) {
            return identity();
        }
        return m27179a1(C47670qn4.m17063j(d));
    }

    /* renamed from: w0 */
    static InterfaceC44546lX2 m27176w0(WZ3 wz3) {
        if (wz3 == null) {
            return identity();
        }
        if (wz3.mo71320b() == 1) {
            return m27181M2(wz3.getValue());
        }
        InterfaceC48754sd3 m13024c = C49060t80.m13024c();
        if (!m13024c.mo13932c(wz3.getValue())) {
            return m27181M2(m13024c.mo13924k(wz3.getValue(), wz3.mo71320b()));
        }
        return UY3.m81351p(wz3);
    }

    @Override // 
    /* renamed from: D */
    default boolean mo22026D() {
        return true;
    }

    /* renamed from: Y2 */
    default Number m27180Y2() {
        return getValue();
    }
}
