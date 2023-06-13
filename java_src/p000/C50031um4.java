package p000;

import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: um4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50031um4 extends AbstractC20684g1 {

    /* renamed from: i */
    public static final int[] f112896i = {1, 10, 34, 70, 126};

    /* renamed from: j */
    public static final int[] f112897j = {4, 20, 48, 81};

    /* renamed from: k */
    public static final int[] f112898k = {0, 161, 961, 2015, 2715};

    /* renamed from: l */
    public static final int[] f112899l = {0, 336, 1036, 1516};

    /* renamed from: m */
    public static final int[] f112900m = {8, 6, 4, 3, 1};

    /* renamed from: n */
    public static final int[] f112901n = {2, 4, 6, 8};

    /* renamed from: o */
    public static final int[][] f112902o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: g */
    public final List<C47934rE3> f112903g = new ArrayList();

    /* renamed from: h */
    public final List<C47934rE3> f112904h = new ArrayList();

    /* renamed from: q */
    public static void m9786q(Collection<C47934rE3> collection, C47934rE3 c47934rE3) {
        boolean z;
        if (c47934rE3 == null) {
            return;
        }
        Iterator<C47934rE3> it = collection.iterator();
        while (true) {
            if (it.hasNext()) {
                C47934rE3 next = it.next();
                if (next.m109003b() == c47934rE3.m109003b()) {
                    next.m16174e();
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            collection.add(c47934rE3);
        }
    }

    /* renamed from: s */
    public static boolean m9784s(C47934rE3 c47934rE3, C47934rE3 c47934rE32) {
        int m109004a = (c47934rE3.m109004a() + (c47934rE32.m109004a() * 16)) % 79;
        int m25033c = (c47934rE3.m16175d().m25033c() * 9) + c47934rE32.m16175d().m25033c();
        if (m25033c > 72) {
            m25033c--;
        }
        if (m25033c > 8) {
            m25033c--;
        }
        if (m109004a == m25033c) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public static C38511bN4 m9783t(C47934rE3 c47934rE3, C47934rE3 c47934rE32) {
        String valueOf = String.valueOf((c47934rE3.m109003b() * 4537077) + c47934rE32.m109003b());
        StringBuilder sb = new StringBuilder(14);
        for (int length = 13 - valueOf.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(valueOf);
        int i = 0;
        for (int i2 = 0; i2 < 13; i2++) {
            int charAt = sb.charAt(i2) - '0';
            if ((i2 & 1) == 0) {
                charAt *= 3;
            }
            i += charAt;
        }
        int i3 = 10 - (i % 10);
        if (i3 == 10) {
            i3 = 0;
        }
        sb.append(i3);
        C40900fN4[] m25035a = c47934rE3.m16175d().m25035a();
        C40900fN4[] m25035a2 = c47934rE32.m16175d().m25035a();
        return new C38511bN4(sb.toString(), null, new C40900fN4[]{m25035a[0], m25035a[1], m25035a2[0], m25035a2[1]}, EnumC7009Qx.RSS_14);
    }

    @Override // p000.AbstractC52944zh3
    /* renamed from: b */
    public C38511bN4 mo543b(int i, C1027CT c1027ct, Map<EnumC47491qV0, ?> map) throws NotFoundException {
        m9786q(this.f112903g, m9781v(c1027ct, false, i, map));
        c1027ct.m112209t();
        m9786q(this.f112904h, m9781v(c1027ct, true, i, map));
        c1027ct.m112209t();
        for (C47934rE3 c47934rE3 : this.f112903g) {
            if (c47934rE3.m16176c() > 1) {
                for (C47934rE3 c47934rE32 : this.f112904h) {
                    if (c47934rE32.m16176c() > 1 && m9784s(c47934rE3, c47934rE32)) {
                        return m9783t(c47934rE3, c47934rE32);
                    }
                }
                continue;
            }
        }
        throw NotFoundException.m45943a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r1 < 4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
        if (r1 < 4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
        r2 = true;
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
        r2 = false;
        r5 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m9785r(boolean z, int i) throws NotFoundException {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int m44340d = C39713dN2.m44340d(m40332l());
        int m44340d2 = C39713dN2.m44340d(m40334j());
        boolean z7 = true;
        boolean z8 = false;
        if (z) {
            if (m44340d > 12) {
                z3 = true;
                z2 = false;
            } else if (m44340d < 4) {
                z2 = true;
                z3 = false;
            } else {
                z2 = false;
                z3 = false;
            }
            if (m44340d2 <= 12) {
            }
            z4 = true;
            z5 = false;
        } else {
            if (m44340d > 11) {
                z3 = true;
                z2 = false;
            } else if (m44340d < 5) {
                z2 = true;
                z3 = false;
            } else {
                z2 = false;
                z3 = false;
            }
            if (m44340d2 <= 10) {
            }
            z4 = true;
            z5 = false;
        }
        int i2 = (m44340d + m44340d2) - i;
        if ((m44340d & 1) == z) {
            z6 = true;
        } else {
            z6 = false;
        }
        if ((m44340d2 & 1) == 1) {
            z8 = true;
        }
        if (i2 == 1) {
            if (z6) {
                if (!z8) {
                    z3 = true;
                } else {
                    throw NotFoundException.m45943a();
                }
            } else if (z8) {
                z4 = true;
            } else {
                throw NotFoundException.m45943a();
            }
        } else if (i2 == -1) {
            if (z6) {
                if (z8) {
                    throw NotFoundException.m45943a();
                }
                if (z7) {
                    if (!z3) {
                        AbstractC20684g1.m40330n(m40332l(), m40331m());
                    } else {
                        throw NotFoundException.m45943a();
                    }
                }
                if (z3) {
                    AbstractC20684g1.m40337g(m40332l(), m40331m());
                }
                if (z5) {
                    if (!z4) {
                        AbstractC20684g1.m40330n(m40334j(), m40331m());
                    } else {
                        throw NotFoundException.m45943a();
                    }
                }
                if (z4) {
                    AbstractC20684g1.m40337g(m40334j(), m40333k());
                    return;
                }
                return;
            } else if (z8) {
                z5 = true;
            } else {
                throw NotFoundException.m45943a();
            }
        } else if (i2 == 0) {
            if (z6) {
                if (z8) {
                    if (m44340d < m44340d2) {
                        z4 = true;
                        if (z7) {
                        }
                        if (z3) {
                        }
                        if (z5) {
                        }
                        if (z4) {
                        }
                    } else {
                        z5 = true;
                        z3 = true;
                    }
                } else {
                    throw NotFoundException.m45943a();
                }
            } else if (z8) {
                throw NotFoundException.m45943a();
            }
        } else {
            throw NotFoundException.m45943a();
        }
        z7 = z2;
        if (z7) {
        }
        if (z3) {
        }
        if (z5) {
        }
        if (z4) {
        }
    }

    @Override // p000.AbstractC52944zh3, p000.InterfaceC36918Wr4
    public void reset() {
        this.f112903g.clear();
        this.f112904h.clear();
    }

    /* renamed from: u */
    public final ES0 m9782u(C1027CT c1027ct, C45285mm1 c45285mm1, boolean z) throws NotFoundException {
        int i;
        int[] m40336h = m40336h();
        for (int i2 = 0; i2 < m40336h.length; i2++) {
            m40336h[i2] = 0;
        }
        if (z) {
            AbstractC52944zh3.m539f(c1027ct, c45285mm1.m25034b()[0], m40336h);
        } else {
            AbstractC52944zh3.m540e(c1027ct, c45285mm1.m25034b()[1] + 1, m40336h);
            int i3 = 0;
            for (int length = m40336h.length - 1; i3 < length; length--) {
                int i4 = m40336h[i3];
                m40336h[i3] = m40336h[length];
                m40336h[length] = i4;
                i3++;
            }
        }
        if (z) {
            i = 16;
        } else {
            i = 15;
        }
        float m44340d = C39713dN2.m44340d(m40336h) / i;
        int[] m40332l = m40332l();
        int[] m40334j = m40334j();
        float[] m40331m = m40331m();
        float[] m40333k = m40333k();
        for (int i5 = 0; i5 < m40336h.length; i5++) {
            float f = m40336h[i5] / m44340d;
            int i6 = (int) (0.5f + f);
            if (i6 <= 0) {
                i6 = 1;
            } else if (i6 > 8) {
                i6 = 8;
            }
            int i7 = i5 / 2;
            if ((i5 & 1) == 0) {
                m40332l[i7] = i6;
                m40331m[i7] = f - i6;
            } else {
                m40334j[i7] = i6;
                m40333k[i7] = f - i6;
            }
        }
        m9785r(z, i);
        int i8 = 0;
        int i9 = 0;
        for (int length2 = m40332l.length - 1; length2 >= 0; length2--) {
            int i10 = m40332l[length2];
            i8 = (i8 * 9) + i10;
            i9 += i10;
        }
        int i11 = 0;
        int i12 = 0;
        for (int length3 = m40334j.length - 1; length3 >= 0; length3--) {
            int i13 = m40334j[length3];
            i11 = (i11 * 9) + i13;
            i12 += i13;
        }
        int i14 = i8 + (i11 * 3);
        if (z) {
            if ((i9 & 1) == 0 && i9 <= 12 && i9 >= 4) {
                int i15 = (12 - i9) / 2;
                int i16 = f112900m[i15];
                int i17 = 9 - i16;
                return new ES0((C51216wm4.m6373b(m40332l, i16, false) * f112896i[i15]) + C51216wm4.m6373b(m40334j, i17, true) + f112898k[i15], i14);
            }
            throw NotFoundException.m45943a();
        } else if ((i12 & 1) == 0 && i12 <= 10 && i12 >= 4) {
            int i18 = (10 - i12) / 2;
            int i19 = f112901n[i18];
            return new ES0((C51216wm4.m6373b(m40334j, 9 - i19, false) * f112897j[i18]) + C51216wm4.m6373b(m40332l, i19, true) + f112899l[i18], i14);
        } else {
            throw NotFoundException.m45943a();
        }
    }

    /* renamed from: v */
    public final C47934rE3 m9781v(C1027CT c1027ct, boolean z, int i, Map<EnumC47491qV0, ?> map) {
        int[] m9780w;
        InterfaceC41493gN4 interfaceC41493gN4;
        try {
            C45285mm1 m9779x = m9779x(c1027ct, i, z, m9780w(c1027ct, z));
            if (map == null) {
                interfaceC41493gN4 = null;
            } else {
                interfaceC41493gN4 = (InterfaceC41493gN4) map.get(EnumC47491qV0.NEED_RESULT_POINT_CALLBACK);
            }
            if (interfaceC41493gN4 != null) {
                float f = (m9780w[0] + m9780w[1]) / 2.0f;
                if (z) {
                    f = (c1027ct.m112213o() - 1) - f;
                }
                interfaceC41493gN4.m39547a(new C40900fN4(f, i));
            }
            ES0 m9782u = m9782u(c1027ct, m9779x, true);
            ES0 m9782u2 = m9782u(c1027ct, m9779x, false);
            return new C47934rE3((m9782u.m109003b() * 1597) + m9782u2.m109003b(), m9782u.m109004a() + (m9782u2.m109004a() * 4), m9779x);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    /* renamed from: w */
    public final int[] m9780w(C1027CT c1027ct, boolean z) throws NotFoundException {
        int[] m40335i = m40335i();
        m40335i[0] = 0;
        m40335i[1] = 0;
        m40335i[2] = 0;
        m40335i[3] = 0;
        int m112213o = c1027ct.m112213o();
        int i = 0;
        boolean z2 = false;
        while (i < m112213o) {
            z2 = !c1027ct.m112217k(i);
            if (z == z2) {
                break;
            }
            i++;
        }
        int i2 = 0;
        int i3 = i;
        while (i < m112213o) {
            if (c1027ct.m112217k(i) != z2) {
                m40335i[i2] = m40335i[i2] + 1;
            } else {
                if (i2 == 3) {
                    if (AbstractC20684g1.m40329o(m40335i)) {
                        return new int[]{i3, i};
                    }
                    i3 += m40335i[0] + m40335i[1];
                    m40335i[0] = m40335i[2];
                    m40335i[1] = m40335i[3];
                    m40335i[2] = 0;
                    m40335i[3] = 0;
                    i2--;
                } else {
                    i2++;
                }
                m40335i[i2] = 1;
                z2 = !z2;
            }
            i++;
        }
        throw NotFoundException.m45943a();
    }

    /* renamed from: x */
    public final C45285mm1 m9779x(C1027CT c1027ct, int i, boolean z, int[] iArr) throws NotFoundException {
        int i2;
        int i3;
        boolean m112217k = c1027ct.m112217k(iArr[0]);
        int i4 = iArr[0] - 1;
        while (i4 >= 0 && m112217k != c1027ct.m112217k(i4)) {
            i4--;
        }
        int i5 = i4 + 1;
        int[] m40335i = m40335i();
        System.arraycopy(m40335i, 0, m40335i, 1, m40335i.length - 1);
        m40335i[0] = iArr[0] - i5;
        int m40328p = AbstractC20684g1.m40328p(m40335i, f112902o);
        int i6 = iArr[1];
        if (z) {
            i2 = (c1027ct.m112213o() - 1) - i6;
            i3 = (c1027ct.m112213o() - 1) - i5;
        } else {
            i2 = i6;
            i3 = i5;
        }
        return new C45285mm1(m40328p, new int[]{i5, iArr[1]}, i3, i2, i);
    }
}
