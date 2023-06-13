package p000;

import androidx.recyclerview.widget.C11925l;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: vm4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50623vm4 extends AbstractC20684g1 {

    /* renamed from: k */
    public static final int[] f114636k = {7, 5, 4, 3, 1};

    /* renamed from: l */
    public static final int[] f114637l = {4, 20, 52, 104, 204};

    /* renamed from: m */
    public static final int[] f114638m = {0, 348, 1388, 2948, 3988};

    /* renamed from: n */
    public static final int[][] f114639n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: o */
    public static final int[][] f114640o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, SyslogConstants.LOG_LOCAL1, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, SyslogConstants.LOG_LOCAL6, 106, 107, 110, 119, 146}, new int[]{16, 48, SyslogConstants.LOG_LOCAL2, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, SyslogConstants.LOG_LOCAL7, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, SyslogConstants.LOG_LOCAL4, 58, 174, 100, 89}};

    /* renamed from: p */
    public static final int[][] f114641p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* renamed from: g */
    public final List<C45838ni1> f114642g = new ArrayList(11);

    /* renamed from: h */
    public final List<C46431oi1> f114643h = new ArrayList();

    /* renamed from: i */
    public final int[] f114644i = new int[2];

    /* renamed from: j */
    public boolean f114645j;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
        continue;
     */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m8058A(Iterable<C45838ni1> iterable, Iterable<C46431oi1> iterable2) {
        boolean z;
        boolean z2;
        Iterator<C46431oi1> it = iterable2.iterator();
        do {
            z = false;
            if (!it.hasNext()) {
                return false;
            }
            C46431oi1 next = it.next();
            Iterator<C45838ni1> it2 = iterable.iterator();
            while (true) {
                if (it2.hasNext()) {
                    C45838ni1 next2 = it2.next();
                    Iterator<C45838ni1> it3 = next.m20589a().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (next2.equals(it3.next())) {
                                z2 = true;
                                continue;
                                break;
                            }
                        } else {
                            z2 = false;
                            continue;
                            break;
                        }
                    }
                    if (!z2) {
                        break;
                    }
                } else {
                    z = true;
                    continue;
                    break;
                }
            }
        } while (!z);
        return true;
    }

    /* renamed from: B */
    public static boolean m8057B(List<C45838ni1> list) {
        int[][] iArr;
        boolean z;
        for (int[] iArr2 : f114641p) {
            if (list.size() <= iArr2.length) {
                int i = 0;
                while (true) {
                    if (i < list.size()) {
                        if (list.get(i).m23287b().m25033c() != iArr2[i]) {
                            z = false;
                            break;
                        }
                        i++;
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x004c, code lost:
        continue;
     */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m8055D(List<C45838ni1> list, List<C46431oi1> list2) {
        boolean z;
        Iterator<C46431oi1> it = list2.iterator();
        while (it.hasNext()) {
            C46431oi1 next = it.next();
            if (next.m20589a().size() != list.size()) {
                Iterator<C45838ni1> it2 = next.m20589a().iterator();
                while (true) {
                    z = true;
                    if (!it2.hasNext()) {
                        break;
                    }
                    C45838ni1 next2 = it2.next();
                    Iterator<C45838ni1> it3 = list.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (next2.equals(it3.next())) {
                                break;
                            }
                        } else {
                            z = false;
                            continue;
                            break;
                        }
                    }
                    if (!z) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: F */
    public static void m8053F(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length / 2; i++) {
            int i2 = iArr[i];
            int i3 = (length - i) - 1;
            iArr[i] = iArr[i3];
            iArr[i3] = i2;
        }
    }

    /* renamed from: u */
    public static C38511bN4 m8047u(List<C45838ni1> list) throws NotFoundException, FormatException {
        String mo13277d = AbstractC28494t0.m13280a(C1483DT.m110416a(list)).mo13277d();
        C40900fN4[] m25035a = list.get(0).m23287b().m25035a();
        C40900fN4[] m25035a2 = list.get(list.size() - 1).m23287b().m25035a();
        return new C38511bN4(mo13277d, null, new C40900fN4[]{m25035a[0], m25035a[1], m25035a2[0], m25035a2[1]}, EnumC7009Qx.RSS_EXPANDED);
    }

    /* renamed from: y */
    public static int m8043y(C1027CT c1027ct, int i) {
        if (c1027ct.m112217k(i)) {
            return c1027ct.m112215m(c1027ct.m112214n(i));
        }
        return c1027ct.m112214n(c1027ct.m112215m(i));
    }

    /* renamed from: z */
    public static boolean m8042z(C45285mm1 c45285mm1, boolean z, boolean z2) {
        return (c45285mm1.m25033c() == 0 && z && z2) ? false : true;
    }

    /* renamed from: C */
    public final C45285mm1 m8056C(C1027CT c1027ct, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        if (z) {
            int i5 = this.f114644i[0] - 1;
            while (i5 >= 0 && !c1027ct.m112217k(i5)) {
                i5--;
            }
            int i6 = i5 + 1;
            int[] iArr = this.f114644i;
            i4 = iArr[0] - i6;
            i2 = iArr[1];
            i3 = i6;
        } else {
            int[] iArr2 = this.f114644i;
            int i7 = iArr2[0];
            int m112214n = c1027ct.m112214n(iArr2[1] + 1);
            i2 = m112214n;
            i3 = i7;
            i4 = m112214n - this.f114644i[1];
        }
        int[] m40335i = m40335i();
        System.arraycopy(m40335i, 0, m40335i, 1, m40335i.length - 1);
        m40335i[0] = i4;
        try {
            return new C45285mm1(AbstractC20684g1.m40328p(m40335i, f114639n), new int[]{i3, i2}, i3, i2, i);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    /* renamed from: E */
    public C45838ni1 m8054E(C1027CT c1027ct, List<C45838ni1> list, int i) throws NotFoundException {
        boolean z;
        C45285mm1 m8056C;
        ES0 es0;
        if (list.size() % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f114645j) {
            z = !z;
        }
        int i2 = -1;
        boolean z2 = true;
        do {
            m8044x(c1027ct, list, i2);
            m8056C = m8056C(c1027ct, i, z);
            if (m8056C == null) {
                i2 = m8043y(c1027ct, this.f114644i[0]);
                continue;
            } else {
                z2 = false;
                continue;
            }
        } while (z2);
        ES0 m8046v = m8046v(c1027ct, m8056C, z, true);
        if (!list.isEmpty() && list.get(list.size() - 1).m23283f()) {
            throw NotFoundException.m45943a();
        }
        try {
            es0 = m8046v(c1027ct, m8056C, z, false);
        } catch (NotFoundException unused) {
            es0 = null;
        }
        return new C45838ni1(m8046v, es0, m8056C, true);
    }

    /* renamed from: G */
    public final void m8052G(int i, boolean z) {
        boolean z2 = false;
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            if (i2 >= this.f114643h.size()) {
                break;
            }
            C46431oi1 c46431oi1 = this.f114643h.get(i2);
            if (c46431oi1.m20588b() > i) {
                z2 = c46431oi1.m20587c(this.f114642g);
                break;
            } else {
                z3 = c46431oi1.m20587c(this.f114642g);
                i2++;
            }
        }
        if (z2 || z3 || m8058A(this.f114642g, this.f114643h)) {
            return;
        }
        this.f114643h.add(i2, new C46431oi1(this.f114642g, i, z));
        m8055D(this.f114642g, this.f114643h);
    }

    @Override // p000.AbstractC52944zh3
    /* renamed from: b */
    public C38511bN4 mo543b(int i, C1027CT c1027ct, Map<EnumC47491qV0, ?> map) throws NotFoundException, FormatException {
        this.f114642g.clear();
        this.f114645j = false;
        try {
            return m8047u(m8045w(i, c1027ct));
        } catch (NotFoundException unused) {
            this.f114642g.clear();
            this.f114645j = true;
            return m8047u(m8045w(i, c1027ct));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m8051q(int i) throws NotFoundException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int m44340d = C39713dN2.m44340d(m40332l());
        int m44340d2 = C39713dN2.m44340d(m40334j());
        boolean z6 = true;
        boolean z7 = false;
        if (m44340d > 13) {
            z2 = true;
            z = false;
        } else if (m44340d < 4) {
            z = true;
            z2 = false;
        } else {
            z = false;
            z2 = false;
        }
        if (m44340d2 > 13) {
            z4 = true;
            z3 = false;
        } else if (m44340d2 < 4) {
            z3 = true;
            z4 = false;
        } else {
            z3 = false;
            z4 = false;
        }
        int i2 = (m44340d + m44340d2) - i;
        if ((m44340d & 1) == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        if ((m44340d2 & 1) == 0) {
            z7 = true;
        }
        if (i2 == 1) {
            if (z5) {
                if (!z7) {
                    z2 = true;
                } else {
                    throw NotFoundException.m45943a();
                }
            } else if (z7) {
                z4 = true;
            } else {
                throw NotFoundException.m45943a();
            }
        } else if (i2 == -1) {
            if (z5) {
                if (z7) {
                    throw NotFoundException.m45943a();
                }
                if (z6) {
                    if (!z2) {
                        AbstractC20684g1.m40330n(m40332l(), m40331m());
                    } else {
                        throw NotFoundException.m45943a();
                    }
                }
                if (z2) {
                    AbstractC20684g1.m40337g(m40332l(), m40331m());
                }
                if (z3) {
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
            } else if (z7) {
                z3 = true;
            } else {
                throw NotFoundException.m45943a();
            }
        } else if (i2 == 0) {
            if (z5) {
                if (z7) {
                    if (m44340d < m44340d2) {
                        z4 = true;
                        if (z6) {
                        }
                        if (z2) {
                        }
                        if (z3) {
                        }
                        if (z4) {
                        }
                    } else {
                        z3 = true;
                        z2 = true;
                    }
                } else {
                    throw NotFoundException.m45943a();
                }
            } else if (z7) {
                throw NotFoundException.m45943a();
            }
        } else {
            throw NotFoundException.m45943a();
        }
        z6 = z;
        if (z6) {
        }
        if (z2) {
        }
        if (z3) {
        }
        if (z4) {
        }
    }

    /* renamed from: r */
    public final boolean m8050r() {
        C45838ni1 c45838ni1 = this.f114642g.get(0);
        ES0 m23286c = c45838ni1.m23286c();
        ES0 m23285d = c45838ni1.m23285d();
        if (m23285d == null) {
            return false;
        }
        int m109004a = m23285d.m109004a();
        int i = 2;
        for (int i2 = 1; i2 < this.f114642g.size(); i2++) {
            C45838ni1 c45838ni12 = this.f114642g.get(i2);
            m109004a += c45838ni12.m23286c().m109004a();
            i++;
            ES0 m23285d2 = c45838ni12.m23285d();
            if (m23285d2 != null) {
                m109004a += m23285d2.m109004a();
                i++;
            }
        }
        if (((i - 4) * 211) + (m109004a % 211) != m23286c.m109003b()) {
            return false;
        }
        return true;
    }

    @Override // p000.AbstractC52944zh3, p000.InterfaceC36918Wr4
    public void reset() {
        this.f114642g.clear();
        this.f114643h.clear();
    }

    /* renamed from: s */
    public final List<C45838ni1> m8049s(List<C46431oi1> list, int i) throws NotFoundException {
        while (i < this.f114643h.size()) {
            C46431oi1 c46431oi1 = this.f114643h.get(i);
            this.f114642g.clear();
            for (C46431oi1 c46431oi12 : list) {
                this.f114642g.addAll(c46431oi12.m20589a());
            }
            this.f114642g.addAll(c46431oi1.m20589a());
            if (m8057B(this.f114642g)) {
                if (m8050r()) {
                    return this.f114642g;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(c46431oi1);
                try {
                    return m8049s(arrayList, i + 1);
                } catch (NotFoundException unused) {
                    continue;
                }
            }
            i++;
        }
        throw NotFoundException.m45943a();
    }

    /* renamed from: t */
    public final List<C45838ni1> m8048t(boolean z) {
        List<C45838ni1> list = null;
        if (this.f114643h.size() > 25) {
            this.f114643h.clear();
            return null;
        }
        this.f114642g.clear();
        if (z) {
            Collections.reverse(this.f114643h);
        }
        try {
            list = m8049s(new ArrayList(), 0);
        } catch (NotFoundException unused) {
        }
        if (z) {
            Collections.reverse(this.f114643h);
        }
        return list;
    }

    /* renamed from: v */
    public ES0 m8046v(C1027CT c1027ct, C45285mm1 c45285mm1, boolean z, boolean z2) throws NotFoundException {
        int i;
        int[] m40336h = m40336h();
        for (int i2 = 0; i2 < m40336h.length; i2++) {
            m40336h[i2] = 0;
        }
        if (z2) {
            AbstractC52944zh3.m539f(c1027ct, c45285mm1.m25034b()[0], m40336h);
        } else {
            AbstractC52944zh3.m540e(c1027ct, c45285mm1.m25034b()[1], m40336h);
            int i3 = 0;
            for (int length = m40336h.length - 1; i3 < length; length--) {
                int i4 = m40336h[i3];
                m40336h[i3] = m40336h[length];
                m40336h[length] = i4;
                i3++;
            }
        }
        float m44340d = C39713dN2.m44340d(m40336h) / 17.0f;
        float f = (c45285mm1.m25034b()[1] - c45285mm1.m25034b()[0]) / 15.0f;
        if (Math.abs(m44340d - f) / f <= 0.3f) {
            int[] m40332l = m40332l();
            int[] m40334j = m40334j();
            float[] m40331m = m40331m();
            float[] m40333k = m40333k();
            for (int i5 = 0; i5 < m40336h.length; i5++) {
                float f2 = (m40336h[i5] * 1.0f) / m44340d;
                int i6 = (int) (0.5f + f2);
                if (i6 <= 0) {
                    if (f2 >= 0.3f) {
                        i6 = 1;
                    } else {
                        throw NotFoundException.m45943a();
                    }
                } else if (i6 > 8) {
                    if (f2 <= 8.7f) {
                        i6 = 8;
                    } else {
                        throw NotFoundException.m45943a();
                    }
                }
                int i7 = i5 / 2;
                if ((i5 & 1) == 0) {
                    m40332l[i7] = i6;
                    m40331m[i7] = f2 - i6;
                } else {
                    m40334j[i7] = i6;
                    m40333k[i7] = f2 - i6;
                }
            }
            m8051q(17);
            int m25033c = c45285mm1.m25033c() * 4;
            if (z) {
                i = 0;
            } else {
                i = 2;
            }
            int i8 = ((m25033c + i) + (!z2 ? 1 : 0)) - 1;
            int i9 = 0;
            int i10 = 0;
            for (int length2 = m40332l.length - 1; length2 >= 0; length2--) {
                if (m8042z(c45285mm1, z, z2)) {
                    i9 += m40332l[length2] * f114640o[i8][length2 * 2];
                }
                i10 += m40332l[length2];
            }
            int i11 = 0;
            for (int length3 = m40334j.length - 1; length3 >= 0; length3--) {
                if (m8042z(c45285mm1, z, z2)) {
                    i11 += m40334j[length3] * f114640o[i8][(length3 * 2) + 1];
                }
            }
            int i12 = i9 + i11;
            if ((i10 & 1) == 0 && i10 <= 13 && i10 >= 4) {
                int i13 = (13 - i10) / 2;
                int i14 = f114636k[i13];
                return new ES0((C51216wm4.m6373b(m40332l, i14, true) * f114637l[i13]) + C51216wm4.m6373b(m40334j, 9 - i14, false) + f114638m[i13], i12);
            }
            throw NotFoundException.m45943a();
        }
        throw NotFoundException.m45943a();
    }

    /* renamed from: w */
    public List<C45838ni1> m8045w(int i, C1027CT c1027ct) throws NotFoundException {
        boolean z = false;
        while (!z) {
            try {
                List<C45838ni1> list = this.f114642g;
                list.add(m8054E(c1027ct, list, i));
            } catch (NotFoundException e) {
                if (!this.f114642g.isEmpty()) {
                    z = true;
                } else {
                    throw e;
                }
            }
        }
        if (m8050r()) {
            return this.f114642g;
        }
        boolean z2 = !this.f114643h.isEmpty();
        m8052G(i, false);
        if (z2) {
            List<C45838ni1> m8048t = m8048t(false);
            if (m8048t != null) {
                return m8048t;
            }
            List<C45838ni1> m8048t2 = m8048t(true);
            if (m8048t2 != null) {
                return m8048t2;
            }
        }
        throw NotFoundException.m45943a();
    }

    /* renamed from: x */
    public final void m8044x(C1027CT c1027ct, List<C45838ni1> list, int i) throws NotFoundException {
        boolean z;
        int[] m40335i = m40335i();
        m40335i[0] = 0;
        m40335i[1] = 0;
        m40335i[2] = 0;
        m40335i[3] = 0;
        int m112213o = c1027ct.m112213o();
        if (i < 0) {
            if (list.isEmpty()) {
                i = 0;
            } else {
                i = list.get(list.size() - 1).m23287b().m25034b()[1];
            }
        }
        if (list.size() % 2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f114645j) {
            z = !z;
        }
        boolean z2 = false;
        while (i < m112213o) {
            z2 = !c1027ct.m112217k(i);
            if (!z2) {
                break;
            }
            i++;
        }
        int i2 = 0;
        boolean z3 = z2;
        int i3 = i;
        while (i < m112213o) {
            if (c1027ct.m112217k(i) != z3) {
                m40335i[i2] = m40335i[i2] + 1;
            } else {
                if (i2 == 3) {
                    if (z) {
                        m8053F(m40335i);
                    }
                    if (AbstractC20684g1.m40329o(m40335i)) {
                        int[] iArr = this.f114644i;
                        iArr[0] = i3;
                        iArr[1] = i;
                        return;
                    }
                    if (z) {
                        m8053F(m40335i);
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
                z3 = !z3;
            }
            i++;
        }
        throw NotFoundException.m45943a();
    }
}
