package p000;

import java.util.HashSet;
import p000.C43042iz0;
import p000.C5928OE;
/* renamed from: zu6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C53077zu6 extends JL1 {

    /* renamed from: X0 */
    public int f122451X0 = 0;

    /* renamed from: Y0 */
    public int f122452Y0 = 0;

    /* renamed from: Z0 */
    public int f122453Z0 = 0;

    /* renamed from: a1 */
    public int f122454a1 = 0;

    /* renamed from: b1 */
    public int f122455b1 = 0;

    /* renamed from: c1 */
    public int f122456c1 = 0;

    /* renamed from: d1 */
    public int f122457d1 = 0;

    /* renamed from: e1 */
    public int f122458e1 = 0;

    /* renamed from: f1 */
    public boolean f122459f1 = false;

    /* renamed from: g1 */
    public int f122460g1 = 0;

    /* renamed from: h1 */
    public int f122461h1 = 0;

    /* renamed from: i1 */
    public C5928OE.C5929a f122462i1 = new C5928OE.C5929a();

    /* renamed from: j1 */
    public C5928OE.InterfaceC5930b f122463j1 = null;

    /* renamed from: A1 */
    public int m141A1() {
        return this.f122461h1;
    }

    /* renamed from: B1 */
    public int m140B1() {
        return this.f122460g1;
    }

    /* renamed from: C1 */
    public int m139C1() {
        return this.f122452Y0;
    }

    /* renamed from: D1 */
    public int m138D1() {
        return this.f122457d1;
    }

    /* renamed from: E1 */
    public int m137E1() {
        return this.f122458e1;
    }

    /* renamed from: F1 */
    public int m136F1() {
        return this.f122451X0;
    }

    /* renamed from: G1 */
    public void mo135G1(int i, int i2, int i3, int i4) {
    }

    /* renamed from: H1 */
    public void m134H1(C43042iz0 c43042iz0, C43042iz0.EnumC24677b enumC24677b, int i, C43042iz0.EnumC24677b enumC24677b2, int i2) {
        while (this.f122463j1 == null && m31414M() != null) {
            this.f122463j1 = ((C43635jz0) m31414M()).m29548N1();
        }
        C5928OE.C5929a c5929a = this.f122462i1;
        c5929a.f26239a = enumC24677b;
        c5929a.f26240b = enumC24677b2;
        c5929a.f26241c = i;
        c5929a.f26242d = i2;
        this.f122463j1.mo67877b(c43042iz0, c5929a);
        c43042iz0.m31349o1(this.f122462i1.f26243e);
        c43042iz0.m31407P0(this.f122462i1.f26244f);
        c43042iz0.m31409O0(this.f122462i1.f26246h);
        c43042iz0.m31429E0(this.f122462i1.f26245g);
    }

    /* renamed from: I1 */
    public boolean m133I1() {
        C5928OE.InterfaceC5930b interfaceC5930b;
        C43042iz0 c43042iz0 = this.f91888c0;
        if (c43042iz0 != null) {
            interfaceC5930b = ((C43635jz0) c43042iz0).m29548N1();
        } else {
            interfaceC5930b = null;
        }
        if (interfaceC5930b == null) {
            return false;
        }
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= this.f17386W0) {
                return true;
            }
            C43042iz0 c43042iz02 = this.f17385V0[i];
            if (c43042iz02 != null && !(c43042iz02 instanceof C50895wE1)) {
                C43042iz0.EnumC24677b m31334w = c43042iz02.m31334w(0);
                C43042iz0.EnumC24677b m31334w2 = c43042iz02.m31334w(1);
                C43042iz0.EnumC24677b enumC24677b = C43042iz0.EnumC24677b.MATCH_CONSTRAINT;
                if (m31334w != enumC24677b || c43042iz02.f91927w == 1 || m31334w2 != enumC24677b || c43042iz02.f91929x == 1) {
                    z = false;
                }
                if (!z) {
                    if (m31334w == enumC24677b) {
                        m31334w = C43042iz0.EnumC24677b.WRAP_CONTENT;
                    }
                    if (m31334w2 == enumC24677b) {
                        m31334w2 = C43042iz0.EnumC24677b.WRAP_CONTENT;
                    }
                    C5928OE.C5929a c5929a = this.f122462i1;
                    c5929a.f26239a = m31334w;
                    c5929a.f26240b = m31334w2;
                    c5929a.f26241c = c43042iz02.m31391Y();
                    this.f122462i1.f26242d = c43042iz02.m31328z();
                    interfaceC5930b.mo67877b(c43042iz02, this.f122462i1);
                    c43042iz02.m31349o1(this.f122462i1.f26243e);
                    c43042iz02.m31407P0(this.f122462i1.f26244f);
                    c43042iz02.m31429E0(this.f122462i1.f26245g);
                }
            }
            i++;
        }
    }

    /* renamed from: J1 */
    public boolean m132J1() {
        return this.f122459f1;
    }

    /* renamed from: K1 */
    public void m131K1(boolean z) {
        this.f122459f1 = z;
    }

    /* renamed from: L1 */
    public void m130L1(int i, int i2) {
        this.f122460g1 = i;
        this.f122461h1 = i2;
    }

    /* renamed from: M1 */
    public void m129M1(int i) {
        this.f122453Z0 = i;
        this.f122451X0 = i;
        this.f122454a1 = i;
        this.f122452Y0 = i;
        this.f122455b1 = i;
        this.f122456c1 = i;
    }

    /* renamed from: N1 */
    public void m128N1(int i) {
        this.f122452Y0 = i;
    }

    /* renamed from: O1 */
    public void m127O1(int i) {
        this.f122456c1 = i;
    }

    /* renamed from: P1 */
    public void m126P1(int i) {
        this.f122453Z0 = i;
        this.f122457d1 = i;
    }

    /* renamed from: Q1 */
    public void m125Q1(int i) {
        this.f122454a1 = i;
        this.f122458e1 = i;
    }

    /* renamed from: R1 */
    public void m124R1(int i) {
        this.f122455b1 = i;
        this.f122457d1 = i;
        this.f122458e1 = i;
    }

    /* renamed from: S1 */
    public void m123S1(int i) {
        this.f122451X0 = i;
    }

    @Override // p000.JL1, p000.HL1
    /* renamed from: b */
    public void mo122b(C43635jz0 c43635jz0) {
        m120y1();
    }

    /* renamed from: x1 */
    public void m121x1(boolean z) {
        int i = this.f122455b1;
        if (i > 0 || this.f122456c1 > 0) {
            if (z) {
                this.f122457d1 = this.f122456c1;
                this.f122458e1 = i;
                return;
            }
            this.f122457d1 = i;
            this.f122458e1 = this.f122456c1;
        }
    }

    /* renamed from: y1 */
    public void m120y1() {
        for (int i = 0; i < this.f17386W0; i++) {
            C43042iz0 c43042iz0 = this.f17385V0[i];
            if (c43042iz0 != null) {
                c43042iz0.m31390Y0(true);
            }
        }
    }

    /* renamed from: z1 */
    public boolean m119z1(HashSet<C43042iz0> hashSet) {
        for (int i = 0; i < this.f17386W0; i++) {
            if (hashSet.contains(this.f17385V0[i])) {
                return true;
            }
        }
        return false;
    }
}
