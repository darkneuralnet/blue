package p000;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p000.C43042iz0;
import p000.C5928OE;
/* renamed from: jz0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C43635jz0 extends C38998cB6 {

    /* renamed from: Y0 */
    public int f93668Y0;

    /* renamed from: b1 */
    public C38572bU2 f93671b1;

    /* renamed from: d1 */
    public int f93673d1;

    /* renamed from: e1 */
    public int f93674e1;

    /* renamed from: f1 */
    public int f93675f1;

    /* renamed from: g1 */
    public int f93676g1;

    /* renamed from: W0 */
    public C5928OE f93666W0 = new C5928OE(this);

    /* renamed from: X0 */
    public C46017o01 f93667X0 = new C46017o01(this);

    /* renamed from: Z0 */
    public C5928OE.InterfaceC5930b f93669Z0 = null;

    /* renamed from: a1 */
    public boolean f93670a1 = false;

    /* renamed from: c1 */
    public C34342Lr2 f93672c1 = new C34342Lr2();

    /* renamed from: h1 */
    public int f93677h1 = 0;

    /* renamed from: i1 */
    public int f93678i1 = 0;

    /* renamed from: j1 */
    public C45827nh0[] f93679j1 = new C45827nh0[4];

    /* renamed from: k1 */
    public C45827nh0[] f93680k1 = new C45827nh0[4];

    /* renamed from: l1 */
    public boolean f93681l1 = false;

    /* renamed from: m1 */
    public boolean f93682m1 = false;

    /* renamed from: n1 */
    public boolean f93683n1 = false;

    /* renamed from: o1 */
    public int f93684o1 = 0;

    /* renamed from: p1 */
    public int f93685p1 = 0;

    /* renamed from: q1 */
    public int f93686q1 = 257;

    /* renamed from: r1 */
    public boolean f93687r1 = false;

    /* renamed from: s1 */
    public boolean f93688s1 = false;

    /* renamed from: t1 */
    public boolean f93689t1 = false;

    /* renamed from: u1 */
    public int f93690u1 = 0;

    /* renamed from: v1 */
    public WeakReference<C37211Xy0> f93691v1 = null;

    /* renamed from: w1 */
    public WeakReference<C37211Xy0> f93692w1 = null;

    /* renamed from: x1 */
    public WeakReference<C37211Xy0> f93693x1 = null;

    /* renamed from: y1 */
    public WeakReference<C37211Xy0> f93694y1 = null;

    /* renamed from: z1 */
    public HashSet<C43042iz0> f93695z1 = new HashSet<>();

    /* renamed from: A1 */
    public C5928OE.C5929a f93665A1 = new C5928OE.C5929a();

    /* renamed from: X1 */
    public static boolean m29537X1(int i, C43042iz0 c43042iz0, C5928OE.InterfaceC5930b interfaceC5930b, C5928OE.C5929a c5929a, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        if (interfaceC5930b == null) {
            return false;
        }
        if (c43042iz0.m31393X() != 8 && !(c43042iz0 instanceof C50895wE1) && !(c43042iz0 instanceof C1263Cy)) {
            c5929a.f26239a = c43042iz0.m31434C();
            c5929a.f26240b = c43042iz0.m31397V();
            c5929a.f26241c = c43042iz0.m31391Y();
            c5929a.f26242d = c43042iz0.m31328z();
            c5929a.f26247i = false;
            c5929a.f26248j = i2;
            C43042iz0.EnumC24677b enumC24677b = c5929a.f26239a;
            C43042iz0.EnumC24677b enumC24677b2 = C43042iz0.EnumC24677b.MATCH_CONSTRAINT;
            if (enumC24677b == enumC24677b2) {
                z = true;
            } else {
                z = false;
            }
            if (c5929a.f26240b == enumC24677b2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && c43042iz0.f91894f0 > 0.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2 && c43042iz0.f91894f0 > 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z && c43042iz0.m31383c0(0) && c43042iz0.f91927w == 0 && !z3) {
                c5929a.f26239a = C43042iz0.EnumC24677b.WRAP_CONTENT;
                if (z2 && c43042iz0.f91929x == 0) {
                    c5929a.f26239a = C43042iz0.EnumC24677b.FIXED;
                }
                z = false;
            }
            if (z2 && c43042iz0.m31383c0(1) && c43042iz0.f91929x == 0 && !z4) {
                c5929a.f26240b = C43042iz0.EnumC24677b.WRAP_CONTENT;
                if (z && c43042iz0.f91927w == 0) {
                    c5929a.f26240b = C43042iz0.EnumC24677b.FIXED;
                }
                z2 = false;
            }
            if (c43042iz0.mo7201p0()) {
                c5929a.f26239a = C43042iz0.EnumC24677b.FIXED;
                z = false;
            }
            if (c43042iz0.mo7199q0()) {
                c5929a.f26240b = C43042iz0.EnumC24677b.FIXED;
                z2 = false;
            }
            if (z3) {
                if (c43042iz0.f91931y[0] == 4) {
                    c5929a.f26239a = C43042iz0.EnumC24677b.FIXED;
                } else if (!z2) {
                    C43042iz0.EnumC24677b enumC24677b3 = c5929a.f26240b;
                    C43042iz0.EnumC24677b enumC24677b4 = C43042iz0.EnumC24677b.FIXED;
                    if (enumC24677b3 == enumC24677b4) {
                        i4 = c5929a.f26242d;
                    } else {
                        c5929a.f26239a = C43042iz0.EnumC24677b.WRAP_CONTENT;
                        interfaceC5930b.mo67877b(c43042iz0, c5929a);
                        i4 = c5929a.f26244f;
                    }
                    c5929a.f26239a = enumC24677b4;
                    c5929a.f26241c = (int) (c43042iz0.m31332x() * i4);
                }
            }
            if (z4) {
                if (c43042iz0.f91931y[1] == 4) {
                    c5929a.f26240b = C43042iz0.EnumC24677b.FIXED;
                } else if (!z) {
                    C43042iz0.EnumC24677b enumC24677b5 = c5929a.f26239a;
                    C43042iz0.EnumC24677b enumC24677b6 = C43042iz0.EnumC24677b.FIXED;
                    if (enumC24677b5 == enumC24677b6) {
                        i3 = c5929a.f26241c;
                    } else {
                        c5929a.f26240b = C43042iz0.EnumC24677b.WRAP_CONTENT;
                        interfaceC5930b.mo67877b(c43042iz0, c5929a);
                        i3 = c5929a.f26243e;
                    }
                    c5929a.f26240b = enumC24677b6;
                    if (c43042iz0.m31330y() == -1) {
                        c5929a.f26242d = (int) (i3 / c43042iz0.m31332x());
                    } else {
                        c5929a.f26242d = (int) (c43042iz0.m31332x() * i3);
                    }
                }
            }
            interfaceC5930b.mo67877b(c43042iz0, c5929a);
            c43042iz0.m31349o1(c5929a.f26243e);
            c43042iz0.m31407P0(c5929a.f26244f);
            c43042iz0.m31409O0(c5929a.f26246h);
            c43042iz0.m31429E0(c5929a.f26245g);
            c5929a.f26248j = C5928OE.C5929a.f26236k;
            return c5929a.f26247i;
        }
        c5929a.f26243e = 0;
        c5929a.f26244f = 0;
        return false;
    }

    /* renamed from: A1 */
    public boolean m29561A1(C34342Lr2 c34342Lr2) {
        int i;
        boolean m29536Y1 = m29536Y1(64);
        mo7204g(c34342Lr2, m29536Y1);
        int size = this.f60262V0.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            C43042iz0 c43042iz0 = this.f60262V0.get(i2);
            c43042iz0.m31394W0(0, false);
            c43042iz0.m31394W0(1, false);
            if (c43042iz0 instanceof C1263Cy) {
                z = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                C43042iz0 c43042iz02 = this.f60262V0.get(i3);
                if (c43042iz02 instanceof C1263Cy) {
                    ((C1263Cy) c43042iz02).m111204C1();
                }
            }
        }
        this.f93695z1.clear();
        for (int i4 = 0; i4 < size; i4++) {
            C43042iz0 c43042iz03 = this.f60262V0.get(i4);
            if (c43042iz03.m31375f()) {
                if (c43042iz03 instanceof C53077zu6) {
                    this.f93695z1.add(c43042iz03);
                } else {
                    c43042iz03.mo7204g(c34342Lr2, m29536Y1);
                }
            }
        }
        while (this.f93695z1.size() > 0) {
            int size2 = this.f93695z1.size();
            Iterator<C43042iz0> it = this.f93695z1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C53077zu6 c53077zu6 = (C53077zu6) it.next();
                if (c53077zu6.m119z1(this.f93695z1)) {
                    c53077zu6.mo7204g(c34342Lr2, m29536Y1);
                    this.f93695z1.remove(c53077zu6);
                    break;
                }
            }
            if (size2 == this.f93695z1.size()) {
                Iterator<C43042iz0> it2 = this.f93695z1.iterator();
                while (it2.hasNext()) {
                    it2.next().mo7204g(c34342Lr2, m29536Y1);
                }
                this.f93695z1.clear();
            }
        }
        if (C34342Lr2.f22120r) {
            HashSet<C43042iz0> hashSet = new HashSet<>();
            for (int i5 = 0; i5 < size; i5++) {
                C43042iz0 c43042iz04 = this.f60262V0.get(i5);
                if (!c43042iz04.m31375f()) {
                    hashSet.add(c43042iz04);
                }
            }
            if (m31434C() == C43042iz0.EnumC24677b.WRAP_CONTENT) {
                i = 0;
            } else {
                i = 1;
            }
            m31378e(this, c34342Lr2, hashSet, i, false);
            Iterator<C43042iz0> it3 = hashSet.iterator();
            while (it3.hasNext()) {
                C43042iz0 next = it3.next();
                C42442hy3.m35435a(this, c34342Lr2, next);
                next.mo7204g(c34342Lr2, m29536Y1);
            }
        } else {
            for (int i6 = 0; i6 < size; i6++) {
                C43042iz0 c43042iz05 = this.f60262V0.get(i6);
                if (c43042iz05 instanceof C43635jz0) {
                    C43042iz0.EnumC24677b[] enumC24677bArr = c43042iz05.f91886b0;
                    C43042iz0.EnumC24677b enumC24677b = enumC24677bArr[0];
                    C43042iz0.EnumC24677b enumC24677b2 = enumC24677bArr[1];
                    C43042iz0.EnumC24677b enumC24677b3 = C43042iz0.EnumC24677b.WRAP_CONTENT;
                    if (enumC24677b == enumC24677b3) {
                        c43042iz05.m31400T0(C43042iz0.EnumC24677b.FIXED);
                    }
                    if (enumC24677b2 == enumC24677b3) {
                        c43042iz05.m31360k1(C43042iz0.EnumC24677b.FIXED);
                    }
                    c43042iz05.mo7204g(c34342Lr2, m29536Y1);
                    if (enumC24677b == enumC24677b3) {
                        c43042iz05.m31400T0(enumC24677b);
                    }
                    if (enumC24677b2 == enumC24677b3) {
                        c43042iz05.m31360k1(enumC24677b2);
                    }
                } else {
                    C42442hy3.m35435a(this, c34342Lr2, c43042iz05);
                    if (!c43042iz05.m31375f()) {
                        c43042iz05.mo7204g(c34342Lr2, m29536Y1);
                    }
                }
            }
        }
        if (this.f93677h1 > 0) {
            C45234mh0.m25163b(this, c34342Lr2, null, 0);
        }
        if (this.f93678i1 > 0) {
            C45234mh0.m25163b(this, c34342Lr2, null, 1);
        }
        return true;
    }

    /* renamed from: B1 */
    public final void m29560B1(C43042iz0 c43042iz0) {
        int i = this.f93677h1 + 1;
        C45827nh0[] c45827nh0Arr = this.f93680k1;
        if (i >= c45827nh0Arr.length) {
            this.f93680k1 = (C45827nh0[]) Arrays.copyOf(c45827nh0Arr, c45827nh0Arr.length * 2);
        }
        this.f93680k1[this.f93677h1] = new C45827nh0(c43042iz0, 0, m29540U1());
        this.f93677h1++;
    }

    /* renamed from: C1 */
    public void m29559C1(C37211Xy0 c37211Xy0) {
        WeakReference<C37211Xy0> weakReference = this.f93694y1;
        if (weakReference == null || weakReference.get() == null || c37211Xy0.m75998e() > this.f93694y1.get().m75998e()) {
            this.f93694y1 = new WeakReference<>(c37211Xy0);
        }
    }

    /* renamed from: D1 */
    public void m29558D1(C37211Xy0 c37211Xy0) {
        WeakReference<C37211Xy0> weakReference = this.f93692w1;
        if (weakReference == null || weakReference.get() == null || c37211Xy0.m75998e() > this.f93692w1.get().m75998e()) {
            this.f93692w1 = new WeakReference<>(c37211Xy0);
        }
    }

    /* renamed from: E1 */
    public final void m29557E1(C37211Xy0 c37211Xy0, C48017rN5 c48017rN5) {
        this.f93672c1.m96284h(c48017rN5, this.f93672c1.m96275q(c37211Xy0), 0, 5);
    }

    /* renamed from: F1 */
    public final void m29556F1(C37211Xy0 c37211Xy0, C48017rN5 c48017rN5) {
        this.f93672c1.m96284h(this.f93672c1.m96275q(c37211Xy0), c48017rN5, 0, 5);
    }

    /* renamed from: G1 */
    public final void m29555G1(C43042iz0 c43042iz0) {
        int i = this.f93678i1 + 1;
        C45827nh0[] c45827nh0Arr = this.f93679j1;
        if (i >= c45827nh0Arr.length) {
            this.f93679j1 = (C45827nh0[]) Arrays.copyOf(c45827nh0Arr, c45827nh0Arr.length * 2);
        }
        this.f93679j1[this.f93678i1] = new C45827nh0(c43042iz0, 1, m29540U1());
        this.f93678i1++;
    }

    /* renamed from: H1 */
    public void m29554H1(C37211Xy0 c37211Xy0) {
        WeakReference<C37211Xy0> weakReference = this.f93693x1;
        if (weakReference == null || weakReference.get() == null || c37211Xy0.m75998e() > this.f93693x1.get().m75998e()) {
            this.f93693x1 = new WeakReference<>(c37211Xy0);
        }
    }

    /* renamed from: I1 */
    public void m29553I1(C37211Xy0 c37211Xy0) {
        WeakReference<C37211Xy0> weakReference = this.f93691v1;
        if (weakReference == null || weakReference.get() == null || c37211Xy0.m75998e() > this.f93691v1.get().m75998e()) {
            this.f93691v1 = new WeakReference<>(c37211Xy0);
        }
    }

    /* renamed from: J1 */
    public boolean m29552J1(boolean z) {
        return this.f93667X0.m22009f(z);
    }

    /* renamed from: K1 */
    public boolean m29551K1(boolean z) {
        return this.f93667X0.m22008g(z);
    }

    /* renamed from: L1 */
    public boolean m29550L1(boolean z, int i) {
        return this.f93667X0.m22007h(z, i);
    }

    /* renamed from: M1 */
    public void m29549M1(C38572bU2 c38572bU2) {
        this.f93671b1 = c38572bU2;
        this.f93672c1.m96270v(c38572bU2);
    }

    /* renamed from: N1 */
    public C5928OE.InterfaceC5930b m29548N1() {
        return this.f93669Z0;
    }

    /* renamed from: O1 */
    public int m29547O1() {
        return this.f93686q1;
    }

    /* renamed from: P1 */
    public C34342Lr2 m29546P1() {
        return this.f93672c1;
    }

    @Override // p000.C43042iz0
    /* renamed from: Q */
    public void mo29545Q(StringBuilder sb) {
        sb.append(this.f91911o + ":{\n");
        sb.append("  actualWidth:" + this.f91890d0);
        sb.append("\n");
        sb.append("  actualHeight:" + this.f91892e0);
        sb.append("\n");
        Iterator<C43042iz0> it = m61757v1().iterator();
        while (it.hasNext()) {
            it.next().mo29545Q(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    /* renamed from: Q1 */
    public boolean m29544Q1() {
        return false;
    }

    /* renamed from: R1 */
    public void m29543R1() {
        this.f93667X0.m22005j();
    }

    /* renamed from: S1 */
    public void m29542S1() {
        this.f93667X0.m22004k();
    }

    /* renamed from: T1 */
    public boolean m29541T1() {
        return this.f93689t1;
    }

    /* renamed from: U1 */
    public boolean m29540U1() {
        return this.f93670a1;
    }

    /* renamed from: V1 */
    public boolean m29539V1() {
        return this.f93688s1;
    }

    /* renamed from: W1 */
    public long m29538W1(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.f93673d1 = i8;
        this.f93674e1 = i9;
        return this.f93666W0.m92603d(this, i, i8, i9, i2, i3, i4, i5, i6, i7);
    }

    /* renamed from: Y1 */
    public boolean m29536Y1(int i) {
        return (this.f93686q1 & i) == i;
    }

    /* renamed from: Z1 */
    public final void m29535Z1() {
        this.f93677h1 = 0;
        this.f93678i1 = 0;
    }

    /* renamed from: a2 */
    public void m29534a2(C5928OE.InterfaceC5930b interfaceC5930b) {
        this.f93669Z0 = interfaceC5930b;
        this.f93667X0.m22001n(interfaceC5930b);
    }

    /* renamed from: b2 */
    public void m29533b2(int i) {
        this.f93686q1 = i;
        C34342Lr2.f22120r = m29536Y1(512);
    }

    /* renamed from: c2 */
    public void m29532c2(int i) {
        this.f93668Y0 = i;
    }

    /* renamed from: d2 */
    public void m29531d2(boolean z) {
        this.f93670a1 = z;
    }

    /* renamed from: e2 */
    public boolean m29530e2(C34342Lr2 c34342Lr2, boolean[] zArr) {
        zArr[2] = false;
        boolean m29536Y1 = m29536Y1(64);
        mo7198u1(c34342Lr2, m29536Y1);
        int size = this.f60262V0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C43042iz0 c43042iz0 = this.f60262V0.get(i);
            c43042iz0.mo7198u1(c34342Lr2, m29536Y1);
            if (c43042iz0.m31377e0()) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: f2 */
    public void m29529f2() {
        this.f93666W0.m92602e(this);
    }

    @Override // p000.C43042iz0
    /* renamed from: t1 */
    public void mo29528t1(boolean z, boolean z2) {
        super.mo29528t1(z, z2);
        int size = this.f60262V0.size();
        for (int i = 0; i < size; i++) {
            this.f60262V0.get(i).mo29528t1(z, z2);
        }
    }

    @Override // p000.C38998cB6, p000.C43042iz0
    /* renamed from: v0 */
    public void mo29527v0() {
        this.f93672c1.m96292E();
        this.f93673d1 = 0;
        this.f93675f1 = 0;
        this.f93674e1 = 0;
        this.f93676g1 = 0;
        this.f93687r1 = false;
        super.mo29527v0();
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x031d  */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // p000.C38998cB6
    /* renamed from: w1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo29526w1() {
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        ?? r6;
        boolean z6;
        boolean z7;
        int i3;
        C43042iz0.EnumC24677b enumC24677b;
        boolean z8;
        int i4 = 0;
        this.f91898h0 = 0;
        this.f91900i0 = 0;
        this.f93688s1 = false;
        this.f93689t1 = false;
        int size = this.f60262V0.size();
        int max = Math.max(0, m31391Y());
        int max2 = Math.max(0, m31328z());
        C43042iz0.EnumC24677b[] enumC24677bArr = this.f91886b0;
        C43042iz0.EnumC24677b enumC24677b2 = enumC24677bArr[1];
        C43042iz0.EnumC24677b enumC24677b3 = enumC24677bArr[0];
        C38572bU2 c38572bU2 = this.f93671b1;
        if (c38572bU2 != null) {
            c38572bU2.f57530E++;
        }
        if (this.f93668Y0 == 0 && C42442hy3.m35434b(this.f93686q1, 1)) {
            C38924c41.m61973h(this, m29548N1());
            for (int i5 = 0; i5 < size; i5++) {
                C43042iz0 c43042iz0 = this.f60262V0.get(i5);
                if (c43042iz0.m31350o0() && !(c43042iz0 instanceof C50895wE1) && !(c43042iz0 instanceof C1263Cy) && !(c43042iz0 instanceof C53077zu6) && !c43042iz0.m31353n0()) {
                    C43042iz0.EnumC24677b m31334w = c43042iz0.m31334w(0);
                    C43042iz0.EnumC24677b m31334w2 = c43042iz0.m31334w(1);
                    C43042iz0.EnumC24677b enumC24677b4 = C43042iz0.EnumC24677b.MATCH_CONSTRAINT;
                    if (m31334w == enumC24677b4 && c43042iz0.f91927w != 1 && m31334w2 == enumC24677b4 && c43042iz0.f91929x != 1) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (!z8) {
                        m29537X1(0, c43042iz0, this.f93669Z0, new C5928OE.C5929a(), C5928OE.C5929a.f26236k);
                    }
                }
            }
        }
        if (size > 2 && ((enumC24677b3 == (enumC24677b = C43042iz0.EnumC24677b.WRAP_CONTENT) || enumC24677b2 == enumC24677b) && C42442hy3.m35434b(this.f93686q1, 1024) && C44967mE1.m25924c(this, m29548N1()))) {
            if (enumC24677b3 == enumC24677b) {
                if (max < m31391Y() && max > 0) {
                    m31349o1(max);
                    this.f93688s1 = true;
                } else {
                    max = m31391Y();
                }
            }
            if (enumC24677b2 == enumC24677b) {
                if (max2 < m31328z() && max2 > 0) {
                    m31407P0(max2);
                    this.f93689t1 = true;
                } else {
                    max2 = m31328z();
                }
            }
            i = max2;
            i2 = max;
            z = true;
        } else {
            i = max2;
            i2 = max;
            z = false;
        }
        if (!m29536Y1(64) && !m29536Y1(128)) {
            z2 = false;
        } else {
            z2 = true;
        }
        C34342Lr2 c34342Lr2 = this.f93672c1;
        c34342Lr2.f22136h = false;
        c34342Lr2.f22137i = false;
        if (this.f93686q1 != 0 && z2) {
            c34342Lr2.f22137i = true;
        }
        ArrayList<C43042iz0> arrayList = this.f60262V0;
        C43042iz0.EnumC24677b m31434C = m31434C();
        C43042iz0.EnumC24677b enumC24677b5 = C43042iz0.EnumC24677b.WRAP_CONTENT;
        if (m31434C != enumC24677b5 && m31397V() != enumC24677b5) {
            z3 = false;
        } else {
            z3 = true;
        }
        m29535Z1();
        for (int i6 = 0; i6 < size; i6++) {
            C43042iz0 c43042iz02 = this.f60262V0.get(i6);
            if (c43042iz02 instanceof C38998cB6) {
                ((C38998cB6) c43042iz02).mo29526w1();
            }
        }
        boolean m29536Y1 = m29536Y1(64);
        boolean z9 = z;
        int i7 = 0;
        boolean z10 = true;
        while (z10) {
            int i8 = i7 + 1;
            try {
                this.f93672c1.m96292E();
                m29535Z1();
                m31351o(this.f93672c1);
                for (int i9 = i4; i9 < size; i9++) {
                    this.f60262V0.get(i9).m31351o(this.f93672c1);
                }
                z10 = m29561A1(this.f93672c1);
                WeakReference<C37211Xy0> weakReference = this.f93691v1;
                if (weakReference != null && weakReference.get() != null) {
                    m29556F1(this.f93691v1.get(), this.f93672c1.m96275q(this.f91871R));
                    this.f93691v1 = null;
                }
                WeakReference<C37211Xy0> weakReference2 = this.f93693x1;
                if (weakReference2 != null && weakReference2.get() != null) {
                    m29557E1(this.f93693x1.get(), this.f93672c1.m96275q(this.f91875T));
                    this.f93693x1 = null;
                }
                WeakReference<C37211Xy0> weakReference3 = this.f93692w1;
                if (weakReference3 != null && weakReference3.get() != null) {
                    m29556F1(this.f93692w1.get(), this.f93672c1.m96275q(this.f91869Q));
                    this.f93692w1 = null;
                }
                WeakReference<C37211Xy0> weakReference4 = this.f93694y1;
                if (weakReference4 != null && weakReference4.get() != null) {
                    m29557E1(this.f93694y1.get(), this.f93672c1.m96275q(this.f91873S));
                    this.f93694y1 = null;
                }
                if (z10) {
                    this.f93672c1.m96296A();
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("EXCEPTION : " + e);
            }
            if (z10) {
                z4 = m29530e2(this.f93672c1, C42442hy3.f86241a);
            } else {
                mo7198u1(this.f93672c1, m29536Y1);
                for (int i10 = 0; i10 < size; i10++) {
                    this.f60262V0.get(i10).mo7198u1(this.f93672c1, m29536Y1);
                }
                z4 = false;
            }
            if (z3 && i8 < 8 && C42442hy3.f86241a[2]) {
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i11 < size) {
                    C43042iz0 c43042iz03 = this.f60262V0.get(i11);
                    i13 = Math.max(i13, c43042iz03.f91898h0 + c43042iz03.m31391Y());
                    i12 = Math.max(i12, c43042iz03.f91900i0 + c43042iz03.m31328z());
                    i11++;
                    z4 = z4;
                }
                z5 = z4;
                int max3 = Math.max(this.f91912o0, i13);
                int max4 = Math.max(this.f91914p0, i12);
                C43042iz0.EnumC24677b enumC24677b6 = C43042iz0.EnumC24677b.WRAP_CONTENT;
                if (enumC24677b3 == enumC24677b6 && m31391Y() < max3) {
                    m31349o1(max3);
                    this.f91886b0[0] = enumC24677b6;
                    z9 = true;
                    z5 = true;
                }
                if (enumC24677b2 == enumC24677b6 && m31328z() < max4) {
                    m31407P0(max4);
                    this.f91886b0[1] = enumC24677b6;
                    z9 = true;
                    z5 = true;
                }
            } else {
                z5 = z4;
            }
            int max5 = Math.max(this.f91912o0, m31391Y());
            if (max5 > m31391Y()) {
                m31349o1(max5);
                this.f91886b0[0] = C43042iz0.EnumC24677b.FIXED;
                z9 = true;
                z5 = true;
            }
            int max6 = Math.max(this.f91914p0, m31328z());
            if (max6 > m31328z()) {
                m31407P0(max6);
                r6 = 1;
                this.f91886b0[1] = C43042iz0.EnumC24677b.FIXED;
                z6 = true;
                z5 = true;
            } else {
                r6 = 1;
                z6 = z9;
            }
            if (!z6) {
                C43042iz0.EnumC24677b enumC24677b7 = this.f91886b0[0];
                C43042iz0.EnumC24677b enumC24677b8 = C43042iz0.EnumC24677b.WRAP_CONTENT;
                if (enumC24677b7 == enumC24677b8 && i2 > 0 && m31391Y() > i2) {
                    this.f93688s1 = r6;
                    this.f91886b0[0] = C43042iz0.EnumC24677b.FIXED;
                    m31349o1(i2);
                    z6 = r6;
                    z5 = z6;
                }
                if (this.f91886b0[r6] == enumC24677b8 && i > 0 && m31328z() > i) {
                    this.f93689t1 = r6;
                    this.f91886b0[r6] = C43042iz0.EnumC24677b.FIXED;
                    m31407P0(i);
                    i3 = 8;
                    z7 = true;
                    z9 = true;
                    if (i8 <= i3) {
                        z10 = false;
                    } else {
                        z10 = z7;
                    }
                    i7 = i8;
                    i4 = 0;
                }
            }
            z9 = z6;
            z7 = z5;
            i3 = 8;
            if (i8 <= i3) {
            }
            i7 = i8;
            i4 = 0;
        }
        this.f60262V0 = arrayList;
        if (z9) {
            C43042iz0.EnumC24677b[] enumC24677bArr2 = this.f91886b0;
            enumC24677bArr2[0] = enumC24677b3;
            enumC24677bArr2[1] = enumC24677b2;
        }
        mo31327z0(this.f93672c1.m96269w());
    }

    /* renamed from: z1 */
    public void m29525z1(C43042iz0 c43042iz0, int i) {
        if (i == 0) {
            m29560B1(c43042iz0);
        } else if (i == 1) {
            m29555G1(c43042iz0);
        }
    }
}
