package p000;

import java.math.BigInteger;
import java.util.Objects;
/* renamed from: UY3 */
/* loaded from: classes8.dex */
public final class UY3 extends AbstractC26779o0 implements InterfaceC44546lX2 {
    private static final long serialVersionUID = 3546932001671571300L;

    /* renamed from: e */
    public final int f37531e;

    /* renamed from: f */
    public final int f37532f;

    /* renamed from: g */
    public final int f37533g;

    /* renamed from: h */
    public final C47670qn4 f37534h;

    public UY3(int i, int i2) {
        if (i != 0) {
            this.f37531e = i;
            this.f37532f = i2;
            this.f37533g = Objects.hash(Integer.valueOf(i), Integer.valueOf(i2));
            this.f37534h = m81357j();
            return;
        }
        throw new IllegalArgumentException("base cannot be zero (because 0^0 is undefined)");
    }

    /* renamed from: p */
    public static UY3 m81351p(WZ3 wz3) {
        return m81350q(wz3.getValue(), wz3.mo71320b());
    }

    /* renamed from: q */
    public static UY3 m81350q(Number number, int i) {
        return new UY3(number.intValue(), i);
    }

    @Override // p000.InterfaceC38077ae6
    /* renamed from: d */
    public boolean mo18701d() {
        if (this.f37531e == 1 || this.f37532f == 0) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC26779o0
    /* renamed from: e */
    public boolean mo18700e(AbstractC26779o0 abstractC26779o0) {
        if (abstractC26779o0 instanceof UY3) {
            if (((UY3) abstractC26779o0).f37531e == this.f37531e) {
                return true;
            }
            return false;
        }
        return abstractC26779o0 instanceof C47077pn4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InterfaceC38077ae6) {
            InterfaceC38077ae6 interfaceC38077ae6 = (InterfaceC38077ae6) obj;
            if (mo18701d() && interfaceC38077ae6.mo18701d()) {
                return true;
            }
        }
        if (!(obj instanceof UY3)) {
            return false;
        }
        UY3 uy3 = (UY3) obj;
        if (this.f37531e == uy3.f37531e && this.f37532f == uy3.f37532f) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC26779o0
    /* renamed from: g */
    public AbstractC26779o0 mo18699g() {
        return new UY3(this.f37531e, -this.f37532f);
    }

    @Override // p000.AbstractC26779o0
    /* renamed from: h */
    public AbstractC26779o0 mo18698h(AbstractC26779o0 abstractC26779o0) {
        if (abstractC26779o0 instanceof UY3) {
            UY3 uy3 = (UY3) abstractC26779o0;
            if (this.f37531e == uy3.f37531e) {
                return m81355l(uy3);
            }
        }
        if (abstractC26779o0 instanceof C47077pn4) {
            return (AbstractC26779o0) m81349r().mo22030c(abstractC26779o0);
        }
        throw new IllegalStateException(String.format("%s.simpleCompose() not handled for converter %s", this, abstractC26779o0));
    }

    public int hashCode() {
        return this.f37533g;
    }

    @Override // p000.AbstractC26779o0
    /* renamed from: i */
    public final String mo18697i() {
        int i = this.f37531e;
        if (i < 0) {
            return String.format("x -> x * (%s)^%s", Integer.valueOf(i), Integer.valueOf(this.f37532f));
        }
        return String.format("x -> x * %s^%s", Integer.valueOf(i), Integer.valueOf(this.f37532f));
    }

    /* renamed from: j */
    public final C47670qn4 m81357j() {
        if (this.f37532f == 0) {
            return C47670qn4.f105800m;
        }
        BigInteger pow = BigInteger.valueOf(this.f37531e).pow(Math.abs(this.f37532f));
        if (this.f37532f > 0) {
            return C47670qn4.m17058o(pow);
        }
        return C47670qn4.m17060m(BigInteger.ONE, pow);
    }

    @Override // java.lang.Comparable
    /* renamed from: k */
    public int compareTo(InterfaceC38077ae6 interfaceC38077ae6) {
        if (this == interfaceC38077ae6) {
            return 0;
        }
        if (mo18701d() && interfaceC38077ae6.mo18701d()) {
            return 0;
        }
        if (interfaceC38077ae6 instanceof UY3) {
            UY3 uy3 = (UY3) interfaceC38077ae6;
            int compare = Integer.compare(this.f37531e, uy3.f37531e);
            if (compare != 0) {
                return compare;
            }
            return Integer.compare(this.f37532f, uy3.f37532f);
        }
        return UY3.class.getName().compareTo(interfaceC38077ae6.getClass().getName());
    }

    /* renamed from: l */
    public final UY3 m81355l(UY3 uy3) {
        return new UY3(this.f37531e, this.f37532f + uy3.f37532f);
    }

    /* renamed from: m */
    public int m81354m() {
        return this.f37531e;
    }

    /* renamed from: n */
    public int m81353n() {
        return this.f37532f;
    }

    @Override // p000.InterfaceC34742Nj6
    /* renamed from: o */
    public Number getValue() {
        return this.f37534h;
    }

    /* renamed from: r */
    public C47077pn4 m81349r() {
        return new C47077pn4(this.f37534h);
    }
}
