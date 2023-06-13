package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p000.C43042iz0;
import p000.C5928OE;
/* renamed from: o01  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C46017o01 {

    /* renamed from: a */
    public C43635jz0 f101202a;

    /* renamed from: d */
    public C43635jz0 f101205d;

    /* renamed from: b */
    public boolean f101203b = true;

    /* renamed from: c */
    public boolean f101204c = true;

    /* renamed from: e */
    public ArrayList<AbstractC41387gB6> f101206e = new ArrayList<>();

    /* renamed from: f */
    public ArrayList<C40455ed5> f101207f = new ArrayList<>();

    /* renamed from: g */
    public C5928OE.InterfaceC5930b f101208g = null;

    /* renamed from: h */
    public C5928OE.C5929a f101209h = new C5928OE.C5929a();

    /* renamed from: i */
    public ArrayList<C40455ed5> f101210i = new ArrayList<>();

    public C46017o01(C43635jz0 c43635jz0) {
        this.f101202a = c43635jz0;
        this.f101205d = c43635jz0;
    }

    /* renamed from: a */
    public final void m22014a(C46610p01 c46610p01, int i, int i2, C46610p01 c46610p012, ArrayList<C40455ed5> arrayList, C40455ed5 c40455ed5) {
        AbstractC41387gB6 abstractC41387gB6 = c46610p01.f102904d;
        if (abstractC41387gB6.f81751c == null) {
            C43635jz0 c43635jz0 = this.f101202a;
            if (abstractC41387gB6 != c43635jz0.f91891e && abstractC41387gB6 != c43635jz0.f91893f) {
                if (c40455ed5 == null) {
                    c40455ed5 = new C40455ed5(abstractC41387gB6, i2);
                    arrayList.add(c40455ed5);
                }
                abstractC41387gB6.f81751c = c40455ed5;
                c40455ed5.m42694a(abstractC41387gB6);
                for (InterfaceC44238l01 interfaceC44238l01 : abstractC41387gB6.f81756h.f102911k) {
                    if (interfaceC44238l01 instanceof C46610p01) {
                        m22014a((C46610p01) interfaceC44238l01, i, 0, c46610p012, arrayList, c40455ed5);
                    }
                }
                for (InterfaceC44238l01 interfaceC44238l012 : abstractC41387gB6.f81757i.f102911k) {
                    if (interfaceC44238l012 instanceof C46610p01) {
                        m22014a((C46610p01) interfaceC44238l012, i, 1, c46610p012, arrayList, c40455ed5);
                    }
                }
                if (i == 1 && (abstractC41387gB6 instanceof C34085Ko6)) {
                    for (InterfaceC44238l01 interfaceC44238l013 : ((C34085Ko6) abstractC41387gB6).f20245k.f102911k) {
                        if (interfaceC44238l013 instanceof C46610p01) {
                            m22014a((C46610p01) interfaceC44238l013, i, 2, c46610p012, arrayList, c40455ed5);
                        }
                    }
                }
                for (C46610p01 c46610p013 : abstractC41387gB6.f81756h.f102912l) {
                    if (c46610p013 == c46610p012) {
                        c40455ed5.f78626b = true;
                    }
                    m22014a(c46610p013, i, 0, c46610p012, arrayList, c40455ed5);
                }
                for (C46610p01 c46610p014 : abstractC41387gB6.f81757i.f102912l) {
                    if (c46610p014 == c46610p012) {
                        c40455ed5.f78626b = true;
                    }
                    m22014a(c46610p014, i, 1, c46610p012, arrayList, c40455ed5);
                }
                if (i == 1 && (abstractC41387gB6 instanceof C34085Ko6)) {
                    for (C46610p01 c46610p015 : ((C34085Ko6) abstractC41387gB6).f20245k.f102912l) {
                        m22014a(c46610p015, i, 2, c46610p012, arrayList, c40455ed5);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean m22013b(C43635jz0 c43635jz0) {
        int i;
        C43042iz0.EnumC24677b enumC24677b;
        int i2;
        C43042iz0.EnumC24677b enumC24677b2;
        C43042iz0.EnumC24677b enumC24677b3;
        C43042iz0.EnumC24677b enumC24677b4;
        Iterator<C43042iz0> it = c43635jz0.f60262V0.iterator();
        while (it.hasNext()) {
            C43042iz0 next = it.next();
            C43042iz0.EnumC24677b[] enumC24677bArr = next.f91886b0;
            C43042iz0.EnumC24677b enumC24677b5 = enumC24677bArr[0];
            C43042iz0.EnumC24677b enumC24677b6 = enumC24677bArr[1];
            if (next.m31393X() == 8) {
                next.f91883a = true;
            } else {
                if (next.f91839B < 1.0f && enumC24677b5 == C43042iz0.EnumC24677b.MATCH_CONSTRAINT) {
                    next.f91927w = 2;
                }
                if (next.f91845E < 1.0f && enumC24677b6 == C43042iz0.EnumC24677b.MATCH_CONSTRAINT) {
                    next.f91929x = 2;
                }
                if (next.m31332x() > 0.0f) {
                    C43042iz0.EnumC24677b enumC24677b7 = C43042iz0.EnumC24677b.MATCH_CONSTRAINT;
                    if (enumC24677b5 == enumC24677b7 && (enumC24677b6 == C43042iz0.EnumC24677b.WRAP_CONTENT || enumC24677b6 == C43042iz0.EnumC24677b.FIXED)) {
                        next.f91927w = 3;
                    } else if (enumC24677b6 == enumC24677b7 && (enumC24677b5 == C43042iz0.EnumC24677b.WRAP_CONTENT || enumC24677b5 == C43042iz0.EnumC24677b.FIXED)) {
                        next.f91929x = 3;
                    } else if (enumC24677b5 == enumC24677b7 && enumC24677b6 == enumC24677b7) {
                        if (next.f91927w == 0) {
                            next.f91927w = 3;
                        }
                        if (next.f91929x == 0) {
                            next.f91929x = 3;
                        }
                    }
                }
                C43042iz0.EnumC24677b enumC24677b8 = C43042iz0.EnumC24677b.MATCH_CONSTRAINT;
                if (enumC24677b5 == enumC24677b8 && next.f91927w == 1 && (next.f91869Q.f44308f == null || next.f91873S.f44308f == null)) {
                    enumC24677b5 = C43042iz0.EnumC24677b.WRAP_CONTENT;
                }
                C43042iz0.EnumC24677b enumC24677b9 = enumC24677b5;
                if (enumC24677b6 == enumC24677b8 && next.f91929x == 1 && (next.f91871R.f44308f == null || next.f91875T.f44308f == null)) {
                    enumC24677b6 = C43042iz0.EnumC24677b.WRAP_CONTENT;
                }
                C43042iz0.EnumC24677b enumC24677b10 = enumC24677b6;
                C40304eN1 c40304eN1 = next.f91891e;
                c40304eN1.f81752d = enumC24677b9;
                int i3 = next.f91927w;
                c40304eN1.f81749a = i3;
                C34085Ko6 c34085Ko6 = next.f91893f;
                c34085Ko6.f81752d = enumC24677b10;
                int i4 = next.f91929x;
                c34085Ko6.f81749a = i4;
                C43042iz0.EnumC24677b enumC24677b11 = C43042iz0.EnumC24677b.MATCH_PARENT;
                if ((enumC24677b9 != enumC24677b11 && enumC24677b9 != C43042iz0.EnumC24677b.FIXED && enumC24677b9 != C43042iz0.EnumC24677b.WRAP_CONTENT) || (enumC24677b10 != enumC24677b11 && enumC24677b10 != C43042iz0.EnumC24677b.FIXED && enumC24677b10 != C43042iz0.EnumC24677b.WRAP_CONTENT)) {
                    if (enumC24677b9 == enumC24677b8 && (enumC24677b10 == (enumC24677b4 = C43042iz0.EnumC24677b.WRAP_CONTENT) || enumC24677b10 == C43042iz0.EnumC24677b.FIXED)) {
                        if (i3 == 3) {
                            if (enumC24677b10 == enumC24677b4) {
                                m22003l(next, enumC24677b4, 0, enumC24677b4, 0);
                            }
                            int m31328z = next.m31328z();
                            C43042iz0.EnumC24677b enumC24677b12 = C43042iz0.EnumC24677b.FIXED;
                            m22003l(next, enumC24677b12, (int) ((m31328z * next.f91894f0) + 0.5f), enumC24677b12, m31328z);
                            next.f91891e.f81753e.mo20170d(next.m31391Y());
                            next.f91893f.f81753e.mo20170d(next.m31328z());
                            next.f91883a = true;
                        } else if (i3 == 1) {
                            m22003l(next, enumC24677b4, 0, enumC24677b10, 0);
                            next.f91891e.f81753e.f44482m = next.m31391Y();
                        } else if (i3 == 2) {
                            C43042iz0.EnumC24677b enumC24677b13 = c43635jz0.f91886b0[0];
                            C43042iz0.EnumC24677b enumC24677b14 = C43042iz0.EnumC24677b.FIXED;
                            if (enumC24677b13 == enumC24677b14 || enumC24677b13 == enumC24677b11) {
                                m22003l(next, enumC24677b14, (int) ((next.f91839B * c43635jz0.m31391Y()) + 0.5f), enumC24677b10, next.m31328z());
                                next.f91891e.f81753e.mo20170d(next.m31391Y());
                                next.f91893f.f81753e.mo20170d(next.m31328z());
                                next.f91883a = true;
                            }
                        } else {
                            C37211Xy0[] c37211Xy0Arr = next.f91881Y;
                            if (c37211Xy0Arr[0].f44308f == null || c37211Xy0Arr[1].f44308f == null) {
                                m22003l(next, enumC24677b4, 0, enumC24677b10, 0);
                                next.f91891e.f81753e.mo20170d(next.m31391Y());
                                next.f91893f.f81753e.mo20170d(next.m31328z());
                                next.f91883a = true;
                            }
                        }
                    }
                    if (enumC24677b10 == enumC24677b8 && (enumC24677b9 == (enumC24677b3 = C43042iz0.EnumC24677b.WRAP_CONTENT) || enumC24677b9 == C43042iz0.EnumC24677b.FIXED)) {
                        if (i4 == 3) {
                            if (enumC24677b9 == enumC24677b3) {
                                m22003l(next, enumC24677b3, 0, enumC24677b3, 0);
                            }
                            int m31391Y = next.m31391Y();
                            float f = next.f91894f0;
                            if (next.m31330y() == -1) {
                                f = 1.0f / f;
                            }
                            C43042iz0.EnumC24677b enumC24677b15 = C43042iz0.EnumC24677b.FIXED;
                            m22003l(next, enumC24677b15, m31391Y, enumC24677b15, (int) ((m31391Y * f) + 0.5f));
                            next.f91891e.f81753e.mo20170d(next.m31391Y());
                            next.f91893f.f81753e.mo20170d(next.m31328z());
                            next.f91883a = true;
                        } else if (i4 == 1) {
                            m22003l(next, enumC24677b9, 0, enumC24677b3, 0);
                            next.f91893f.f81753e.f44482m = next.m31328z();
                        } else if (i4 == 2) {
                            C43042iz0.EnumC24677b enumC24677b16 = c43635jz0.f91886b0[1];
                            C43042iz0.EnumC24677b enumC24677b17 = C43042iz0.EnumC24677b.FIXED;
                            if (enumC24677b16 == enumC24677b17 || enumC24677b16 == enumC24677b11) {
                                m22003l(next, enumC24677b9, next.m31391Y(), enumC24677b17, (int) ((next.f91845E * c43635jz0.m31328z()) + 0.5f));
                                next.f91891e.f81753e.mo20170d(next.m31391Y());
                                next.f91893f.f81753e.mo20170d(next.m31328z());
                                next.f91883a = true;
                            }
                        } else {
                            C37211Xy0[] c37211Xy0Arr2 = next.f91881Y;
                            if (c37211Xy0Arr2[2].f44308f == null || c37211Xy0Arr2[3].f44308f == null) {
                                m22003l(next, enumC24677b3, 0, enumC24677b10, 0);
                                next.f91891e.f81753e.mo20170d(next.m31391Y());
                                next.f91893f.f81753e.mo20170d(next.m31328z());
                                next.f91883a = true;
                            }
                        }
                    }
                    if (enumC24677b9 == enumC24677b8 && enumC24677b10 == enumC24677b8) {
                        if (i3 != 1 && i4 != 1) {
                            if (i4 == 2 && i3 == 2) {
                                C43042iz0.EnumC24677b[] enumC24677bArr2 = c43635jz0.f91886b0;
                                C43042iz0.EnumC24677b enumC24677b18 = enumC24677bArr2[0];
                                C43042iz0.EnumC24677b enumC24677b19 = C43042iz0.EnumC24677b.FIXED;
                                if (enumC24677b18 == enumC24677b19 && enumC24677bArr2[1] == enumC24677b19) {
                                    m22003l(next, enumC24677b19, (int) ((next.f91839B * c43635jz0.m31391Y()) + 0.5f), enumC24677b19, (int) ((next.f91845E * c43635jz0.m31328z()) + 0.5f));
                                    next.f91891e.f81753e.mo20170d(next.m31391Y());
                                    next.f91893f.f81753e.mo20170d(next.m31328z());
                                    next.f91883a = true;
                                }
                            }
                        } else {
                            C43042iz0.EnumC24677b enumC24677b20 = C43042iz0.EnumC24677b.WRAP_CONTENT;
                            m22003l(next, enumC24677b20, 0, enumC24677b20, 0);
                            next.f91891e.f81753e.f44482m = next.m31391Y();
                            next.f91893f.f81753e.f44482m = next.m31328z();
                        }
                    }
                } else {
                    int m31391Y2 = next.m31391Y();
                    if (enumC24677b9 == enumC24677b11) {
                        i = (c43635jz0.m31391Y() - next.f91869Q.f44309g) - next.f91873S.f44309g;
                        enumC24677b = C43042iz0.EnumC24677b.FIXED;
                    } else {
                        i = m31391Y2;
                        enumC24677b = enumC24677b9;
                    }
                    int m31328z2 = next.m31328z();
                    if (enumC24677b10 == enumC24677b11) {
                        i2 = (c43635jz0.m31328z() - next.f91871R.f44309g) - next.f91875T.f44309g;
                        enumC24677b2 = C43042iz0.EnumC24677b.FIXED;
                    } else {
                        i2 = m31328z2;
                        enumC24677b2 = enumC24677b10;
                    }
                    m22003l(next, enumC24677b, i, enumC24677b2, i2);
                    next.f91891e.f81753e.mo20170d(next.m31391Y());
                    next.f91893f.f81753e.mo20170d(next.m31328z());
                    next.f91883a = true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public void m22012c() {
        m22011d(this.f101206e);
        this.f101210i.clear();
        C40455ed5.f78624h = 0;
        m22006i(this.f101202a.f91891e, 0, this.f101210i);
        m22006i(this.f101202a.f91893f, 1, this.f101210i);
        this.f101203b = false;
    }

    /* renamed from: d */
    public void m22011d(ArrayList<AbstractC41387gB6> arrayList) {
        arrayList.clear();
        this.f101205d.f91891e.mo5646f();
        this.f101205d.f91893f.mo5646f();
        arrayList.add(this.f101205d.f91891e);
        arrayList.add(this.f101205d.f91893f);
        Iterator<C43042iz0> it = this.f101205d.f60262V0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C43042iz0 next = it.next();
            if (next instanceof C50895wE1) {
                arrayList.add(new C51488xE1(next));
            } else {
                if (next.m31361k0()) {
                    if (next.f91887c == null) {
                        next.f91887c = new C46420oh0(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f91887c);
                } else {
                    arrayList.add(next.f91891e);
                }
                if (next.m31355m0()) {
                    if (next.f91889d == null) {
                        next.f91889d = new C46420oh0(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f91889d);
                } else {
                    arrayList.add(next.f91893f);
                }
                if (next instanceof JL1) {
                    arrayList.add(new IL1(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<AbstractC41387gB6> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().mo5646f();
        }
        Iterator<AbstractC41387gB6> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC41387gB6 next2 = it3.next();
            if (next2.f81750b != this.f101205d) {
                next2.mo5648d();
            }
        }
    }

    /* renamed from: e */
    public final int m22010e(C43635jz0 c43635jz0, int i) {
        int size = this.f101210i.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, this.f101210i.get(i2).m42693b(c43635jz0, i));
        }
        return (int) j;
    }

    /* renamed from: f */
    public boolean m22009f(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.f101203b || this.f101204c) {
            Iterator<C43042iz0> it = this.f101202a.f60262V0.iterator();
            while (it.hasNext()) {
                C43042iz0 next = it.next();
                next.m31348p();
                next.f91883a = false;
                next.f91891e.m42989r();
                next.f91893f.m98273q();
            }
            this.f101202a.m31348p();
            C43635jz0 c43635jz0 = this.f101202a;
            c43635jz0.f91883a = false;
            c43635jz0.f91891e.m42989r();
            this.f101202a.f91893f.m98273q();
            this.f101204c = false;
        }
        if (m22013b(this.f101205d)) {
            return false;
        }
        this.f101202a.m31346q1(0);
        this.f101202a.m31343r1(0);
        C43042iz0.EnumC24677b m31334w = this.f101202a.m31334w(0);
        C43042iz0.EnumC24677b m31334w2 = this.f101202a.m31334w(1);
        if (this.f101203b) {
            m22012c();
        }
        int m31389Z = this.f101202a.m31389Z();
        int m31387a0 = this.f101202a.m31387a0();
        this.f101202a.f91891e.f81756h.mo20170d(m31389Z);
        this.f101202a.f91893f.f81756h.mo20170d(m31387a0);
        m22002m();
        C43042iz0.EnumC24677b enumC24677b = C43042iz0.EnumC24677b.WRAP_CONTENT;
        if (m31334w == enumC24677b || m31334w2 == enumC24677b) {
            if (z4) {
                Iterator<AbstractC41387gB6> it2 = this.f101206e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (!it2.next().mo5645m()) {
                        z4 = false;
                        break;
                    }
                }
            }
            if (z4 && m31334w == C43042iz0.EnumC24677b.WRAP_CONTENT) {
                this.f101202a.m31400T0(C43042iz0.EnumC24677b.FIXED);
                C43635jz0 c43635jz02 = this.f101202a;
                c43635jz02.m31349o1(m22010e(c43635jz02, 0));
                C43635jz0 c43635jz03 = this.f101202a;
                c43635jz03.f91891e.f81753e.mo20170d(c43635jz03.m31391Y());
            }
            if (z4 && m31334w2 == C43042iz0.EnumC24677b.WRAP_CONTENT) {
                this.f101202a.m31360k1(C43042iz0.EnumC24677b.FIXED);
                C43635jz0 c43635jz04 = this.f101202a;
                c43635jz04.m31407P0(m22010e(c43635jz04, 1));
                C43635jz0 c43635jz05 = this.f101202a;
                c43635jz05.f91893f.f81753e.mo20170d(c43635jz05.m31328z());
            }
        }
        C43635jz0 c43635jz06 = this.f101202a;
        C43042iz0.EnumC24677b enumC24677b2 = c43635jz06.f91886b0[0];
        C43042iz0.EnumC24677b enumC24677b3 = C43042iz0.EnumC24677b.FIXED;
        if (enumC24677b2 != enumC24677b3 && enumC24677b2 != C43042iz0.EnumC24677b.MATCH_PARENT) {
            z2 = false;
        } else {
            int m31391Y = c43635jz06.m31391Y() + m31389Z;
            this.f101202a.f91891e.f81757i.mo20170d(m31391Y);
            this.f101202a.f91891e.f81753e.mo20170d(m31391Y - m31389Z);
            m22002m();
            C43635jz0 c43635jz07 = this.f101202a;
            C43042iz0.EnumC24677b enumC24677b4 = c43635jz07.f91886b0[1];
            if (enumC24677b4 == enumC24677b3 || enumC24677b4 == C43042iz0.EnumC24677b.MATCH_PARENT) {
                int m31328z = c43635jz07.m31328z() + m31387a0;
                this.f101202a.f91893f.f81757i.mo20170d(m31328z);
                this.f101202a.f91893f.f81753e.mo20170d(m31328z - m31387a0);
            }
            m22002m();
            z2 = true;
        }
        Iterator<AbstractC41387gB6> it3 = this.f101206e.iterator();
        while (it3.hasNext()) {
            AbstractC41387gB6 next2 = it3.next();
            if (next2.f81750b != this.f101202a || next2.f81755g) {
                next2.mo5647e();
            }
        }
        Iterator<AbstractC41387gB6> it4 = this.f101206e.iterator();
        while (it4.hasNext()) {
            AbstractC41387gB6 next3 = it4.next();
            if (z2 || next3.f81750b != this.f101202a) {
                if (!next3.f81756h.f102910j || ((!next3.f81757i.f102910j && !(next3 instanceof C51488xE1)) || (!next3.f81753e.f102910j && !(next3 instanceof C46420oh0) && !(next3 instanceof C51488xE1)))) {
                    z3 = false;
                    break;
                }
            }
        }
        this.f101202a.m31400T0(m31334w);
        this.f101202a.m31360k1(m31334w2);
        return z3;
    }

    /* renamed from: g */
    public boolean m22008g(boolean z) {
        if (this.f101203b) {
            Iterator<C43042iz0> it = this.f101202a.f60262V0.iterator();
            while (it.hasNext()) {
                C43042iz0 next = it.next();
                next.m31348p();
                next.f91883a = false;
                C40304eN1 c40304eN1 = next.f91891e;
                c40304eN1.f81753e.f102910j = false;
                c40304eN1.f81755g = false;
                c40304eN1.m42989r();
                C34085Ko6 c34085Ko6 = next.f91893f;
                c34085Ko6.f81753e.f102910j = false;
                c34085Ko6.f81755g = false;
                c34085Ko6.m98273q();
            }
            this.f101202a.m31348p();
            C43635jz0 c43635jz0 = this.f101202a;
            c43635jz0.f91883a = false;
            C40304eN1 c40304eN12 = c43635jz0.f91891e;
            c40304eN12.f81753e.f102910j = false;
            c40304eN12.f81755g = false;
            c40304eN12.m42989r();
            C34085Ko6 c34085Ko62 = this.f101202a.f91893f;
            c34085Ko62.f81753e.f102910j = false;
            c34085Ko62.f81755g = false;
            c34085Ko62.m98273q();
            m22012c();
        }
        if (m22013b(this.f101205d)) {
            return false;
        }
        this.f101202a.m31346q1(0);
        this.f101202a.m31343r1(0);
        this.f101202a.f91891e.f81756h.mo20170d(0);
        this.f101202a.f91893f.f81756h.mo20170d(0);
        return true;
    }

    /* renamed from: h */
    public boolean m22007h(boolean z, int i) {
        boolean z2;
        C43042iz0.EnumC24677b enumC24677b;
        boolean z3 = true;
        boolean z4 = z & true;
        C43042iz0.EnumC24677b m31334w = this.f101202a.m31334w(0);
        C43042iz0.EnumC24677b m31334w2 = this.f101202a.m31334w(1);
        int m31389Z = this.f101202a.m31389Z();
        int m31387a0 = this.f101202a.m31387a0();
        if (z4 && (m31334w == (enumC24677b = C43042iz0.EnumC24677b.WRAP_CONTENT) || m31334w2 == enumC24677b)) {
            Iterator<AbstractC41387gB6> it = this.f101206e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC41387gB6 next = it.next();
                if (next.f81754f == i && !next.mo5645m()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && m31334w == C43042iz0.EnumC24677b.WRAP_CONTENT) {
                    this.f101202a.m31400T0(C43042iz0.EnumC24677b.FIXED);
                    C43635jz0 c43635jz0 = this.f101202a;
                    c43635jz0.m31349o1(m22010e(c43635jz0, 0));
                    C43635jz0 c43635jz02 = this.f101202a;
                    c43635jz02.f91891e.f81753e.mo20170d(c43635jz02.m31391Y());
                }
            } else if (z4 && m31334w2 == C43042iz0.EnumC24677b.WRAP_CONTENT) {
                this.f101202a.m31360k1(C43042iz0.EnumC24677b.FIXED);
                C43635jz0 c43635jz03 = this.f101202a;
                c43635jz03.m31407P0(m22010e(c43635jz03, 1));
                C43635jz0 c43635jz04 = this.f101202a;
                c43635jz04.f91893f.f81753e.mo20170d(c43635jz04.m31328z());
            }
        }
        if (i == 0) {
            C43635jz0 c43635jz05 = this.f101202a;
            C43042iz0.EnumC24677b enumC24677b2 = c43635jz05.f91886b0[0];
            if (enumC24677b2 == C43042iz0.EnumC24677b.FIXED || enumC24677b2 == C43042iz0.EnumC24677b.MATCH_PARENT) {
                int m31391Y = c43635jz05.m31391Y() + m31389Z;
                this.f101202a.f91891e.f81757i.mo20170d(m31391Y);
                this.f101202a.f91891e.f81753e.mo20170d(m31391Y - m31389Z);
                z2 = true;
            }
            z2 = false;
        } else {
            C43635jz0 c43635jz06 = this.f101202a;
            C43042iz0.EnumC24677b enumC24677b3 = c43635jz06.f91886b0[1];
            if (enumC24677b3 == C43042iz0.EnumC24677b.FIXED || enumC24677b3 == C43042iz0.EnumC24677b.MATCH_PARENT) {
                int m31328z = c43635jz06.m31328z() + m31387a0;
                this.f101202a.f91893f.f81757i.mo20170d(m31328z);
                this.f101202a.f91893f.f81753e.mo20170d(m31328z - m31387a0);
                z2 = true;
            }
            z2 = false;
        }
        m22002m();
        Iterator<AbstractC41387gB6> it2 = this.f101206e.iterator();
        while (it2.hasNext()) {
            AbstractC41387gB6 next2 = it2.next();
            if (next2.f81754f == i && (next2.f81750b != this.f101202a || next2.f81755g)) {
                next2.mo5647e();
            }
        }
        Iterator<AbstractC41387gB6> it3 = this.f101206e.iterator();
        while (it3.hasNext()) {
            AbstractC41387gB6 next3 = it3.next();
            if (next3.f81754f == i && (z2 || next3.f81750b != this.f101202a)) {
                if (!next3.f81756h.f102910j || !next3.f81757i.f102910j || (!(next3 instanceof C46420oh0) && !next3.f81753e.f102910j)) {
                    z3 = false;
                    break;
                }
            }
        }
        this.f101202a.m31400T0(m31334w);
        this.f101202a.m31360k1(m31334w2);
        return z3;
    }

    /* renamed from: i */
    public final void m22006i(AbstractC41387gB6 abstractC41387gB6, int i, ArrayList<C40455ed5> arrayList) {
        for (InterfaceC44238l01 interfaceC44238l01 : abstractC41387gB6.f81756h.f102911k) {
            if (interfaceC44238l01 instanceof C46610p01) {
                m22014a((C46610p01) interfaceC44238l01, i, 0, abstractC41387gB6.f81757i, arrayList, null);
            } else if (interfaceC44238l01 instanceof AbstractC41387gB6) {
                m22014a(((AbstractC41387gB6) interfaceC44238l01).f81756h, i, 0, abstractC41387gB6.f81757i, arrayList, null);
            }
        }
        for (InterfaceC44238l01 interfaceC44238l012 : abstractC41387gB6.f81757i.f102911k) {
            if (interfaceC44238l012 instanceof C46610p01) {
                m22014a((C46610p01) interfaceC44238l012, i, 1, abstractC41387gB6.f81756h, arrayList, null);
            } else if (interfaceC44238l012 instanceof AbstractC41387gB6) {
                m22014a(((AbstractC41387gB6) interfaceC44238l012).f81757i, i, 1, abstractC41387gB6.f81756h, arrayList, null);
            }
        }
        if (i == 1) {
            for (InterfaceC44238l01 interfaceC44238l013 : ((C34085Ko6) abstractC41387gB6).f20245k.f102911k) {
                if (interfaceC44238l013 instanceof C46610p01) {
                    m22014a((C46610p01) interfaceC44238l013, i, 2, null, arrayList, null);
                }
            }
        }
    }

    /* renamed from: j */
    public void m22005j() {
        this.f101203b = true;
    }

    /* renamed from: k */
    public void m22004k() {
        this.f101204c = true;
    }

    /* renamed from: l */
    public final void m22003l(C43042iz0 c43042iz0, C43042iz0.EnumC24677b enumC24677b, int i, C43042iz0.EnumC24677b enumC24677b2, int i2) {
        C5928OE.C5929a c5929a = this.f101209h;
        c5929a.f26239a = enumC24677b;
        c5929a.f26240b = enumC24677b2;
        c5929a.f26241c = i;
        c5929a.f26242d = i2;
        this.f101208g.mo67877b(c43042iz0, c5929a);
        c43042iz0.m31349o1(this.f101209h.f26243e);
        c43042iz0.m31407P0(this.f101209h.f26244f);
        c43042iz0.m31409O0(this.f101209h.f26246h);
        c43042iz0.m31429E0(this.f101209h.f26245g);
    }

    /* renamed from: m */
    public void m22002m() {
        boolean z;
        Y31 y31;
        Iterator<C43042iz0> it = this.f101202a.f60262V0.iterator();
        while (it.hasNext()) {
            C43042iz0 next = it.next();
            if (!next.f91883a) {
                C43042iz0.EnumC24677b[] enumC24677bArr = next.f91886b0;
                boolean z2 = false;
                C43042iz0.EnumC24677b enumC24677b = enumC24677bArr[0];
                C43042iz0.EnumC24677b enumC24677b2 = enumC24677bArr[1];
                int i = next.f91927w;
                int i2 = next.f91929x;
                C43042iz0.EnumC24677b enumC24677b3 = C43042iz0.EnumC24677b.WRAP_CONTENT;
                if (enumC24677b != enumC24677b3 && (enumC24677b != C43042iz0.EnumC24677b.MATCH_CONSTRAINT || i != 1)) {
                    z = false;
                } else {
                    z = true;
                }
                if (enumC24677b2 == enumC24677b3 || (enumC24677b2 == C43042iz0.EnumC24677b.MATCH_CONSTRAINT && i2 == 1)) {
                    z2 = true;
                }
                Y31 y312 = next.f91891e.f81753e;
                boolean z3 = y312.f102910j;
                Y31 y313 = next.f91893f.f81753e;
                boolean z4 = y313.f102910j;
                if (z3 && z4) {
                    C43042iz0.EnumC24677b enumC24677b4 = C43042iz0.EnumC24677b.FIXED;
                    m22003l(next, enumC24677b4, y312.f102907g, enumC24677b4, y313.f102907g);
                    next.f91883a = true;
                } else if (z3 && z2) {
                    m22003l(next, C43042iz0.EnumC24677b.FIXED, y312.f102907g, enumC24677b3, y313.f102907g);
                    if (enumC24677b2 == C43042iz0.EnumC24677b.MATCH_CONSTRAINT) {
                        next.f91893f.f81753e.f44482m = next.m31328z();
                    } else {
                        next.f91893f.f81753e.mo20170d(next.m31328z());
                        next.f91883a = true;
                    }
                } else if (z4 && z) {
                    m22003l(next, enumC24677b3, y312.f102907g, C43042iz0.EnumC24677b.FIXED, y313.f102907g);
                    if (enumC24677b == C43042iz0.EnumC24677b.MATCH_CONSTRAINT) {
                        next.f91891e.f81753e.f44482m = next.m31391Y();
                    } else {
                        next.f91891e.f81753e.mo20170d(next.m31391Y());
                        next.f91883a = true;
                    }
                }
                if (next.f91883a && (y31 = next.f91893f.f20246l) != null) {
                    y31.mo20170d(next.m31345r());
                }
            }
        }
    }

    /* renamed from: n */
    public void m22001n(C5928OE.InterfaceC5930b interfaceC5930b) {
        this.f101208g = interfaceC5930b;
    }
}
