package p000;

import java.util.ArrayList;
import java.util.Iterator;
import p000.C37211Xy0;
import p000.C43042iz0;
import p000.C5928OE;
/* renamed from: mE1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C44967mE1 {
    /* renamed from: a */
    public static C40201eB6 m25926a(C43042iz0 c43042iz0, int i, ArrayList<C40201eB6> arrayList, C40201eB6 c40201eB6) {
        int i2;
        int m100667w1;
        if (i == 0) {
            i2 = c43042iz0.f91874S0;
        } else {
            i2 = c43042iz0.f91876T0;
        }
        int i3 = 0;
        if (i2 != -1 && (c40201eB6 == null || i2 != c40201eB6.f78081b)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                C40201eB6 c40201eB62 = arrayList.get(i4);
                if (c40201eB62.m43136c() == i2) {
                    if (c40201eB6 != null) {
                        c40201eB6.m43132g(i, c40201eB62);
                        arrayList.remove(c40201eB6);
                    }
                    c40201eB6 = c40201eB62;
                } else {
                    i4++;
                }
            }
        } else if (i2 != -1) {
            return c40201eB6;
        }
        if (c40201eB6 == null) {
            if ((c43042iz0 instanceof JL1) && (m100667w1 = ((JL1) c43042iz0).m100667w1(i)) != -1) {
                int i5 = 0;
                while (true) {
                    if (i5 >= arrayList.size()) {
                        break;
                    }
                    C40201eB6 c40201eB63 = arrayList.get(i5);
                    if (c40201eB63.m43136c() == m100667w1) {
                        c40201eB6 = c40201eB63;
                        break;
                    }
                    i5++;
                }
            }
            if (c40201eB6 == null) {
                c40201eB6 = new C40201eB6(i);
            }
            arrayList.add(c40201eB6);
        }
        if (c40201eB6.m43138a(c43042iz0)) {
            if (c43042iz0 instanceof C50895wE1) {
                C50895wE1 c50895wE1 = (C50895wE1) c43042iz0;
                C37211Xy0 m7197v1 = c50895wE1.m7197v1();
                if (c50895wE1.m7196w1() == 0) {
                    i3 = 1;
                }
                m7197v1.m76000c(i3, arrayList, c40201eB6);
            }
            if (i == 0) {
                c43042iz0.f91874S0 = c40201eB6.m43136c();
                c43042iz0.f91869Q.m76000c(i, arrayList, c40201eB6);
                c43042iz0.f91873S.m76000c(i, arrayList, c40201eB6);
            } else {
                c43042iz0.f91876T0 = c40201eB6.m43136c();
                c43042iz0.f91871R.m76000c(i, arrayList, c40201eB6);
                c43042iz0.f91877U.m76000c(i, arrayList, c40201eB6);
                c43042iz0.f91875T.m76000c(i, arrayList, c40201eB6);
            }
            c43042iz0.f91880X.m76000c(i, arrayList, c40201eB6);
        }
        return c40201eB6;
    }

    /* renamed from: b */
    public static C40201eB6 m25925b(ArrayList<C40201eB6> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C40201eB6 c40201eB6 = arrayList.get(i2);
            if (i == c40201eB6.f78081b) {
                return c40201eB6;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03a0 A[ADDED_TO_REGION] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m25924c(C43635jz0 c43635jz0, C5928OE.InterfaceC5930b interfaceC5930b) {
        C40201eB6 c40201eB6;
        boolean z;
        boolean z2;
        C40201eB6 c40201eB62;
        ArrayList<C43042iz0> m61757v1 = c43635jz0.m61757v1();
        int size = m61757v1.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C43042iz0 c43042iz0 = m61757v1.get(i2);
            if (!m25923d(c43635jz0.m31434C(), c43635jz0.m31397V(), c43042iz0.m31434C(), c43042iz0.m31397V()) || (c43042iz0 instanceof C32496Du1)) {
                return false;
            }
        }
        C38572bU2 c38572bU2 = c43635jz0.f93671b1;
        if (c38572bU2 != null) {
            c38572bU2.f57531F++;
        }
        int i3 = 0;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        while (i3 < size) {
            C43042iz0 c43042iz02 = m61757v1.get(i3);
            if (!m25923d(c43635jz0.m31434C(), c43635jz0.m31397V(), c43042iz02.m31434C(), c43042iz02.m31397V())) {
                C43635jz0.m29537X1(i, c43042iz02, interfaceC5930b, c43635jz0.f93665A1, C5928OE.C5929a.f26236k);
            }
            boolean z3 = c43042iz02 instanceof C50895wE1;
            if (z3) {
                C50895wE1 c50895wE1 = (C50895wE1) c43042iz02;
                if (c50895wE1.m7196w1() == 0) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(c50895wE1);
                }
                if (c50895wE1.m7196w1() == 1) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c50895wE1);
                }
            }
            if (c43042iz02 instanceof JL1) {
                if (c43042iz02 instanceof C1263Cy) {
                    C1263Cy c1263Cy = (C1263Cy) c43042iz02;
                    if (c1263Cy.m111205B1() == 0) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(c1263Cy);
                    }
                    if (c1263Cy.m111205B1() == 1) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(c1263Cy);
                    }
                } else {
                    JL1 jl1 = (JL1) c43042iz02;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(jl1);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(jl1);
                }
            }
            if (c43042iz02.f91869Q.f44308f == null && c43042iz02.f91873S.f44308f == null && !z3 && !(c43042iz02 instanceof C1263Cy)) {
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                arrayList5.add(c43042iz02);
            }
            if (c43042iz02.f91871R.f44308f == null && c43042iz02.f91875T.f44308f == null && c43042iz02.f91877U.f44308f == null && !z3 && !(c43042iz02 instanceof C1263Cy)) {
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                arrayList6.add(c43042iz02);
            }
            i3++;
            i = 0;
        }
        ArrayList<C40201eB6> arrayList7 = new ArrayList<>();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m25926a((C50895wE1) it.next(), 0, arrayList7, null);
            }
        }
        C40201eB6 c40201eB63 = null;
        int i4 = 0;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                JL1 jl12 = (JL1) it2.next();
                C40201eB6 m25926a = m25926a(jl12, i4, arrayList7, c40201eB63);
                jl12.m100668v1(arrayList7, i4, m25926a);
                m25926a.m43137b(arrayList7);
                c40201eB63 = null;
                i4 = 0;
            }
        }
        C37211Xy0 mo7200q = c43635jz0.mo7200q(C37211Xy0.EnumC9561b.LEFT);
        if (mo7200q.m75999d() != null) {
            Iterator<C37211Xy0> it3 = mo7200q.m75999d().iterator();
            while (it3.hasNext()) {
                m25926a(it3.next().f44306d, 0, arrayList7, null);
            }
        }
        C37211Xy0 mo7200q2 = c43635jz0.mo7200q(C37211Xy0.EnumC9561b.RIGHT);
        if (mo7200q2.m75999d() != null) {
            Iterator<C37211Xy0> it4 = mo7200q2.m75999d().iterator();
            while (it4.hasNext()) {
                m25926a(it4.next().f44306d, 0, arrayList7, null);
            }
        }
        C37211Xy0 mo7200q3 = c43635jz0.mo7200q(C37211Xy0.EnumC9561b.CENTER);
        if (mo7200q3.m75999d() != null) {
            Iterator<C37211Xy0> it5 = mo7200q3.m75999d().iterator();
            while (it5.hasNext()) {
                m25926a(it5.next().f44306d, 0, arrayList7, null);
            }
        }
        C40201eB6 c40201eB64 = null;
        if (arrayList5 != null) {
            Iterator it6 = arrayList5.iterator();
            while (it6.hasNext()) {
                m25926a((C43042iz0) it6.next(), 0, arrayList7, null);
            }
        }
        if (arrayList3 != null) {
            Iterator it7 = arrayList3.iterator();
            while (it7.hasNext()) {
                m25926a((C50895wE1) it7.next(), 1, arrayList7, null);
            }
        }
        int i5 = 1;
        if (arrayList4 != null) {
            Iterator it8 = arrayList4.iterator();
            while (it8.hasNext()) {
                JL1 jl13 = (JL1) it8.next();
                C40201eB6 m25926a2 = m25926a(jl13, i5, arrayList7, c40201eB64);
                jl13.m100668v1(arrayList7, i5, m25926a2);
                m25926a2.m43137b(arrayList7);
                c40201eB64 = null;
                i5 = 1;
            }
        }
        C37211Xy0 mo7200q4 = c43635jz0.mo7200q(C37211Xy0.EnumC9561b.TOP);
        if (mo7200q4.m75999d() != null) {
            Iterator<C37211Xy0> it9 = mo7200q4.m75999d().iterator();
            while (it9.hasNext()) {
                m25926a(it9.next().f44306d, 1, arrayList7, null);
            }
        }
        C37211Xy0 mo7200q5 = c43635jz0.mo7200q(C37211Xy0.EnumC9561b.BASELINE);
        if (mo7200q5.m75999d() != null) {
            Iterator<C37211Xy0> it10 = mo7200q5.m75999d().iterator();
            while (it10.hasNext()) {
                m25926a(it10.next().f44306d, 1, arrayList7, null);
            }
        }
        C37211Xy0 mo7200q6 = c43635jz0.mo7200q(C37211Xy0.EnumC9561b.BOTTOM);
        if (mo7200q6.m75999d() != null) {
            Iterator<C37211Xy0> it11 = mo7200q6.m75999d().iterator();
            while (it11.hasNext()) {
                m25926a(it11.next().f44306d, 1, arrayList7, null);
            }
        }
        C37211Xy0 mo7200q7 = c43635jz0.mo7200q(C37211Xy0.EnumC9561b.CENTER);
        if (mo7200q7.m75999d() != null) {
            Iterator<C37211Xy0> it12 = mo7200q7.m75999d().iterator();
            while (it12.hasNext()) {
                m25926a(it12.next().f44306d, 1, arrayList7, null);
            }
        }
        if (arrayList6 != null) {
            Iterator it13 = arrayList6.iterator();
            while (it13.hasNext()) {
                m25926a((C43042iz0) it13.next(), 1, arrayList7, null);
            }
        }
        for (int i6 = 0; i6 < size; i6++) {
            C43042iz0 c43042iz03 = m61757v1.get(i6);
            if (c43042iz03.m31336u0()) {
                C40201eB6 m25925b = m25925b(arrayList7, c43042iz03.f91874S0);
                C40201eB6 m25925b2 = m25925b(arrayList7, c43042iz03.f91876T0);
                if (m25925b != null && m25925b2 != null) {
                    m25925b.m43132g(0, m25925b2);
                    m25925b2.m43130i(2);
                    arrayList7.remove(m25925b);
                }
            }
        }
        if (arrayList7.size() <= 1) {
            return false;
        }
        if (c43635jz0.m31434C() == C43042iz0.EnumC24677b.WRAP_CONTENT) {
            Iterator<C40201eB6> it14 = arrayList7.iterator();
            c40201eB6 = null;
            int i7 = 0;
            while (it14.hasNext()) {
                C40201eB6 next = it14.next();
                if (next.m43135d() != 1) {
                    next.m43131h(false);
                    int m43133f = next.m43133f(c43635jz0.m29546P1(), 0);
                    if (m43133f > i7) {
                        c40201eB6 = next;
                        i7 = m43133f;
                    }
                }
            }
            if (c40201eB6 != null) {
                c43635jz0.m31400T0(C43042iz0.EnumC24677b.FIXED);
                c43635jz0.m31349o1(i7);
                c40201eB6.m43131h(true);
                if (c43635jz0.m31397V() != C43042iz0.EnumC24677b.WRAP_CONTENT) {
                    Iterator<C40201eB6> it15 = arrayList7.iterator();
                    C40201eB6 c40201eB65 = null;
                    int i8 = 0;
                    while (it15.hasNext()) {
                        C40201eB6 next2 = it15.next();
                        if (next2.m43135d() != 0) {
                            next2.m43131h(false);
                            int m43133f2 = next2.m43133f(c43635jz0.m29546P1(), 1);
                            if (m43133f2 > i8) {
                                c40201eB65 = next2;
                                i8 = m43133f2;
                            }
                        }
                    }
                    z = false;
                    z2 = true;
                    if (c40201eB65 != null) {
                        c43635jz0.m31360k1(C43042iz0.EnumC24677b.FIXED);
                        c43635jz0.m31407P0(i8);
                        c40201eB65.m43131h(true);
                        c40201eB62 = c40201eB65;
                        if (c40201eB6 != null && c40201eB62 == null) {
                            return z;
                        }
                        return z2;
                    }
                } else {
                    z = false;
                    z2 = true;
                }
                c40201eB62 = null;
                if (c40201eB6 != null) {
                }
                return z2;
            }
        }
        c40201eB6 = null;
        if (c43635jz0.m31397V() != C43042iz0.EnumC24677b.WRAP_CONTENT) {
        }
        c40201eB62 = null;
        if (c40201eB6 != null) {
        }
        return z2;
    }

    /* renamed from: d */
    public static boolean m25923d(C43042iz0.EnumC24677b enumC24677b, C43042iz0.EnumC24677b enumC24677b2, C43042iz0.EnumC24677b enumC24677b3, C43042iz0.EnumC24677b enumC24677b4) {
        boolean z;
        boolean z2;
        C43042iz0.EnumC24677b enumC24677b5;
        C43042iz0.EnumC24677b enumC24677b6;
        C43042iz0.EnumC24677b enumC24677b7 = C43042iz0.EnumC24677b.FIXED;
        if (enumC24677b3 != enumC24677b7 && enumC24677b3 != (enumC24677b6 = C43042iz0.EnumC24677b.WRAP_CONTENT) && (enumC24677b3 != C43042iz0.EnumC24677b.MATCH_PARENT || enumC24677b == enumC24677b6)) {
            z = false;
        } else {
            z = true;
        }
        if (enumC24677b4 != enumC24677b7 && enumC24677b4 != (enumC24677b5 = C43042iz0.EnumC24677b.WRAP_CONTENT) && (enumC24677b4 != C43042iz0.EnumC24677b.MATCH_PARENT || enumC24677b2 == enumC24677b5)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z && !z2) {
            return false;
        }
        return true;
    }
}
