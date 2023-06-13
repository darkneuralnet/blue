package p000;

import com.fasterxml.jackson.core.JsonPointer;
import com.google.zxing.NotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
/* renamed from: Z11 */
/* loaded from: classes6.dex */
public final class Z11 {

    /* renamed from: a */
    public final C1837ET f47757a;

    /* renamed from: b */
    public final OA6 f47758b;

    /* renamed from: Z11$b */
    /* loaded from: classes6.dex */
    public static final class C10102b {

        /* renamed from: a */
        public final C40900fN4 f47759a;

        /* renamed from: b */
        public final C40900fN4 f47760b;

        /* renamed from: c */
        public final int f47761c;

        /* renamed from: a */
        public C40900fN4 m73835a() {
            return this.f47759a;
        }

        /* renamed from: b */
        public C40900fN4 m73834b() {
            return this.f47760b;
        }

        /* renamed from: c */
        public int m73833c() {
            return this.f47761c;
        }

        public String toString() {
            return this.f47759a + "/" + this.f47760b + JsonPointer.SEPARATOR + this.f47761c;
        }

        public C10102b(C40900fN4 c40900fN4, C40900fN4 c40900fN42, int i) {
            this.f47759a = c40900fN4;
            this.f47760b = c40900fN42;
            this.f47761c = i;
        }
    }

    /* renamed from: Z11$c */
    /* loaded from: classes6.dex */
    public static final class C10103c implements Serializable, Comparator<C10102b> {
        private C10103c() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C10102b c10102b, C10102b c10102b2) {
            return c10102b.m73833c() - c10102b2.m73833c();
        }
    }

    public Z11(C1837ET c1837et) throws NotFoundException {
        this.f47757a = c1837et;
        this.f47758b = new OA6(c1837et);
    }

    /* renamed from: d */
    public static int m73840d(C40900fN4 c40900fN4, C40900fN4 c40900fN42) {
        return C39713dN2.m44341c(C40900fN4.m41472b(c40900fN4, c40900fN42));
    }

    /* renamed from: e */
    public static void m73839e(Map<C40900fN4, Integer> map, C40900fN4 c40900fN4) {
        Integer num = map.get(c40900fN4);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        map.put(c40900fN4, Integer.valueOf(i));
    }

    /* renamed from: g */
    public static C1837ET m73837g(C1837ET c1837et, C40900fN4 c40900fN4, C40900fN4 c40900fN42, C40900fN4 c40900fN43, C40900fN4 c40900fN44, int i, int i2) throws NotFoundException {
        float f = i - 0.5f;
        float f2 = i2 - 0.5f;
        return AbstractC40223eE1.m43088b().mo20940c(c1837et, i, i2, 0.5f, 0.5f, f, 0.5f, f, f2, 0.5f, f2, c40900fN4.m41471c(), c40900fN4.m41470d(), c40900fN44.m41471c(), c40900fN44.m41470d(), c40900fN43.m41471c(), c40900fN43.m41470d(), c40900fN42.m41471c(), c40900fN42.m41470d());
    }

    /* renamed from: a */
    public final C40900fN4 m73843a(C40900fN4 c40900fN4, C40900fN4 c40900fN42, C40900fN4 c40900fN43, C40900fN4 c40900fN44, int i) {
        float f = i;
        float m73840d = m73840d(c40900fN4, c40900fN42) / f;
        float m73840d2 = m73840d(c40900fN43, c40900fN44);
        C40900fN4 c40900fN45 = new C40900fN4(c40900fN44.m41471c() + (((c40900fN44.m41471c() - c40900fN43.m41471c()) / m73840d2) * m73840d), c40900fN44.m41470d() + (m73840d * ((c40900fN44.m41470d() - c40900fN43.m41470d()) / m73840d2)));
        float m73840d3 = m73840d(c40900fN4, c40900fN43) / f;
        float m73840d4 = m73840d(c40900fN42, c40900fN44);
        C40900fN4 c40900fN46 = new C40900fN4(c40900fN44.m41471c() + (((c40900fN44.m41471c() - c40900fN42.m41471c()) / m73840d4) * m73840d3), c40900fN44.m41470d() + (m73840d3 * ((c40900fN44.m41470d() - c40900fN42.m41470d()) / m73840d4)));
        if (!m73838f(c40900fN45)) {
            if (m73838f(c40900fN46)) {
                return c40900fN46;
            }
            return null;
        } else if (!m73838f(c40900fN46)) {
            return c40900fN45;
        } else {
            if (Math.abs(m73836h(c40900fN43, c40900fN45).m73833c() - m73836h(c40900fN42, c40900fN45).m73833c()) <= Math.abs(m73836h(c40900fN43, c40900fN46).m73833c() - m73836h(c40900fN42, c40900fN46).m73833c())) {
                return c40900fN45;
            }
            return c40900fN46;
        }
    }

    /* renamed from: b */
    public final C40900fN4 m73842b(C40900fN4 c40900fN4, C40900fN4 c40900fN42, C40900fN4 c40900fN43, C40900fN4 c40900fN44, int i, int i2) {
        float m73840d = m73840d(c40900fN4, c40900fN42) / i;
        float m73840d2 = m73840d(c40900fN43, c40900fN44);
        C40900fN4 c40900fN45 = new C40900fN4(c40900fN44.m41471c() + (((c40900fN44.m41471c() - c40900fN43.m41471c()) / m73840d2) * m73840d), c40900fN44.m41470d() + (m73840d * ((c40900fN44.m41470d() - c40900fN43.m41470d()) / m73840d2)));
        float m73840d3 = m73840d(c40900fN4, c40900fN43) / i2;
        float m73840d4 = m73840d(c40900fN42, c40900fN44);
        C40900fN4 c40900fN46 = new C40900fN4(c40900fN44.m41471c() + (((c40900fN44.m41471c() - c40900fN42.m41471c()) / m73840d4) * m73840d3), c40900fN44.m41470d() + (m73840d3 * ((c40900fN44.m41470d() - c40900fN42.m41470d()) / m73840d4)));
        if (!m73838f(c40900fN45)) {
            if (m73838f(c40900fN46)) {
                return c40900fN46;
            }
            return null;
        } else if (!m73838f(c40900fN46)) {
            return c40900fN45;
        } else {
            if (Math.abs(i - m73836h(c40900fN43, c40900fN45).m73833c()) + Math.abs(i2 - m73836h(c40900fN42, c40900fN45).m73833c()) <= Math.abs(i - m73836h(c40900fN43, c40900fN46).m73833c()) + Math.abs(i2 - m73836h(c40900fN42, c40900fN46).m73833c())) {
                return c40900fN45;
            }
            return c40900fN46;
        }
    }

    /* renamed from: c */
    public C38904c21 m73841c() throws NotFoundException {
        C40900fN4 c40900fN4;
        C40900fN4 c40900fN42;
        C1837ET m73837g;
        C40900fN4[] m92672c = this.f47758b.m92672c();
        C40900fN4 c40900fN43 = m92672c[0];
        C40900fN4 c40900fN44 = m92672c[1];
        C40900fN4 c40900fN45 = m92672c[2];
        C40900fN4 c40900fN46 = m92672c[3];
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(m73836h(c40900fN43, c40900fN44));
        arrayList.add(m73836h(c40900fN43, c40900fN45));
        arrayList.add(m73836h(c40900fN44, c40900fN46));
        arrayList.add(m73836h(c40900fN45, c40900fN46));
        C40900fN4 c40900fN47 = null;
        Collections.sort(arrayList, new C10103c());
        C10102b c10102b = (C10102b) arrayList.get(0);
        C10102b c10102b2 = (C10102b) arrayList.get(1);
        HashMap hashMap = new HashMap();
        m73839e(hashMap, c10102b.m73835a());
        m73839e(hashMap, c10102b.m73834b());
        m73839e(hashMap, c10102b2.m73835a());
        m73839e(hashMap, c10102b2.m73834b());
        C40900fN4 c40900fN48 = null;
        C40900fN4 c40900fN49 = null;
        for (Map.Entry entry : hashMap.entrySet()) {
            C40900fN4 c40900fN410 = (C40900fN4) entry.getKey();
            if (((Integer) entry.getValue()).intValue() == 2) {
                c40900fN48 = c40900fN410;
            } else if (c40900fN47 == null) {
                c40900fN47 = c40900fN410;
            } else {
                c40900fN49 = c40900fN410;
            }
        }
        if (c40900fN47 != null && c40900fN48 != null && c40900fN49 != null) {
            C40900fN4[] c40900fN4Arr = {c40900fN47, c40900fN48, c40900fN49};
            C40900fN4.m41469e(c40900fN4Arr);
            C40900fN4 c40900fN411 = c40900fN4Arr[0];
            C40900fN4 c40900fN412 = c40900fN4Arr[1];
            C40900fN4 c40900fN413 = c40900fN4Arr[2];
            if (!hashMap.containsKey(c40900fN43)) {
                c40900fN4 = c40900fN43;
            } else if (!hashMap.containsKey(c40900fN44)) {
                c40900fN4 = c40900fN44;
            } else if (!hashMap.containsKey(c40900fN45)) {
                c40900fN4 = c40900fN45;
            } else {
                c40900fN4 = c40900fN46;
            }
            int m73833c = m73836h(c40900fN413, c40900fN4).m73833c();
            int m73833c2 = m73836h(c40900fN411, c40900fN4).m73833c();
            if ((m73833c & 1) == 1) {
                m73833c++;
            }
            int i = m73833c + 2;
            if ((m73833c2 & 1) == 1) {
                m73833c2++;
            }
            int i2 = m73833c2 + 2;
            if (i * 4 < i2 * 7 && i2 * 4 < i * 7) {
                C40900fN4 m73843a = m73843a(c40900fN412, c40900fN411, c40900fN413, c40900fN4, Math.min(i2, i));
                if (m73843a != null) {
                    c40900fN4 = m73843a;
                }
                int max = Math.max(m73836h(c40900fN413, c40900fN4).m73833c(), m73836h(c40900fN411, c40900fN4).m73833c()) + 1;
                if ((max & 1) == 1) {
                    max++;
                }
                int i3 = max;
                m73837g = m73837g(this.f47757a, c40900fN413, c40900fN412, c40900fN411, c40900fN4, i3, i3);
                c40900fN42 = c40900fN413;
            } else {
                c40900fN42 = c40900fN413;
                C40900fN4 m73842b = m73842b(c40900fN412, c40900fN411, c40900fN413, c40900fN4, i, i2);
                if (m73842b != null) {
                    c40900fN4 = m73842b;
                }
                int m73833c3 = m73836h(c40900fN42, c40900fN4).m73833c();
                int m73833c4 = m73836h(c40900fN411, c40900fN4).m73833c();
                if ((m73833c3 & 1) == 1) {
                    m73833c3++;
                }
                int i4 = m73833c3;
                if ((m73833c4 & 1) == 1) {
                    m73833c4++;
                }
                m73837g = m73837g(this.f47757a, c40900fN42, c40900fN412, c40900fN411, c40900fN4, i4, m73833c4);
            }
            return new C38904c21(m73837g, new C40900fN4[]{c40900fN42, c40900fN412, c40900fN411, c40900fN4});
        }
        throw NotFoundException.m45943a();
    }

    /* renamed from: f */
    public final boolean m73838f(C40900fN4 c40900fN4) {
        return c40900fN4.m41471c() >= 0.0f && c40900fN4.m41471c() < ((float) this.f47757a.m108953o()) && c40900fN4.m41470d() > 0.0f && c40900fN4.m41470d() < ((float) this.f47757a.m108956l());
    }

    /* renamed from: h */
    public final C10102b m73836h(C40900fN4 c40900fN4, C40900fN4 c40900fN42) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int m41471c = (int) c40900fN4.m41471c();
        int m41470d = (int) c40900fN4.m41470d();
        int m41471c2 = (int) c40900fN42.m41471c();
        int m41470d2 = (int) c40900fN42.m41470d();
        int i6 = 0;
        int i7 = 1;
        if (Math.abs(m41470d2 - m41470d) > Math.abs(m41471c2 - m41471c)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m41470d = m41471c;
            m41471c = m41470d;
            m41470d2 = m41471c2;
            m41471c2 = m41470d2;
        }
        int abs = Math.abs(m41471c2 - m41471c);
        int abs2 = Math.abs(m41470d2 - m41470d);
        int i8 = (-abs) / 2;
        if (m41470d < m41470d2) {
            i = 1;
        } else {
            i = -1;
        }
        if (m41471c >= m41471c2) {
            i7 = -1;
        }
        C1837ET c1837et = this.f47757a;
        if (z) {
            i2 = m41470d;
        } else {
            i2 = m41471c;
        }
        if (z) {
            i3 = m41471c;
        } else {
            i3 = m41470d;
        }
        boolean m108959h = c1837et.m108959h(i2, i3);
        while (m41471c != m41471c2) {
            C1837ET c1837et2 = this.f47757a;
            if (z) {
                i4 = m41470d;
            } else {
                i4 = m41471c;
            }
            if (z) {
                i5 = m41471c;
            } else {
                i5 = m41470d;
            }
            boolean m108959h2 = c1837et2.m108959h(i4, i5);
            if (m108959h2 != m108959h) {
                i6++;
                m108959h = m108959h2;
            }
            i8 += abs2;
            if (i8 > 0) {
                if (m41470d == m41470d2) {
                    break;
                }
                m41470d += i;
                i8 -= abs;
            }
            m41471c += i7;
        }
        return new C10102b(c40900fN4, c40900fN42, i6);
    }
}
