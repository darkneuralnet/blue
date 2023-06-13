package p000;

import java.math.BigInteger;
import java.util.Objects;
/* renamed from: pn4  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47077pn4 extends AbstractC26779o0 implements InterfaceC44546lX2 {
    private static final long serialVersionUID = -9192231963353351648L;

    /* renamed from: e */
    public final C47670qn4 f104096e;

    public C47077pn4(C47670qn4 c47670qn4) {
        Objects.requireNonNull(c47670qn4);
        this.f104096e = c47670qn4;
    }

    /* renamed from: p */
    public static C47077pn4 m18690p(C47670qn4 c47670qn4) {
        return new C47077pn4(c47670qn4);
    }

    @Override // p000.InterfaceC38077ae6
    /* renamed from: d */
    public boolean mo18701d() {
        return this.f104096e.m17069d(C47670qn4.f105800m) == 0;
    }

    @Override // p000.AbstractC26779o0
    /* renamed from: e */
    public boolean mo18700e(AbstractC26779o0 abstractC26779o0) {
        if (abstractC26779o0 instanceof C47077pn4) {
            return true;
        }
        return abstractC26779o0 instanceof UY3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C47077pn4) {
            return Objects.equals(this.f104096e, ((C47077pn4) obj).f104096e);
        }
        return false;
    }

    @Override // p000.AbstractC26779o0
    /* renamed from: h */
    public AbstractC26779o0 mo18698h(AbstractC26779o0 abstractC26779o0) {
        if (abstractC26779o0 instanceof C47077pn4) {
            return m18695k((C47077pn4) abstractC26779o0);
        }
        if (abstractC26779o0 instanceof UY3) {
            return m18695k(((UY3) abstractC26779o0).m81349r());
        }
        throw new IllegalStateException(String.format("%s.simpleCompose() not handled for converter %s", this, abstractC26779o0));
    }

    public int hashCode() {
        return this.f104096e.hashCode();
    }

    @Override // p000.AbstractC26779o0
    /* renamed from: i */
    public final String mo18697i() {
        return String.format("x -> x * %s", this.f104096e);
    }

    @Override // java.lang.Comparable
    /* renamed from: j */
    public int compareTo(InterfaceC38077ae6 interfaceC38077ae6) {
        if (this == interfaceC38077ae6) {
            return 0;
        }
        if (interfaceC38077ae6 instanceof C47077pn4) {
            return this.f104096e.m17069d(((C47077pn4) interfaceC38077ae6).f104096e);
        }
        return C47077pn4.class.getName().compareTo(interfaceC38077ae6.getClass().getName());
    }

    /* renamed from: k */
    public final AbstractC26779o0 m18695k(C47077pn4 c47077pn4) {
        BigInteger multiply = m18694l().multiply(c47077pn4.m18694l());
        BigInteger multiply2 = m18693m().multiply(c47077pn4.m18693m());
        BigInteger gcd = multiply.gcd(multiply2);
        BigInteger divide = multiply.divide(gcd);
        BigInteger divide2 = multiply2.divide(gcd);
        BigInteger bigInteger = BigInteger.ONE;
        if (divide.equals(bigInteger) && divide2.equals(bigInteger)) {
            return AbstractC26779o0.f101189c;
        }
        return new C47077pn4(divide, divide2);
    }

    /* renamed from: l */
    public BigInteger m18694l() {
        return this.f104096e.m17068e();
    }

    /* renamed from: m */
    public BigInteger m18693m() {
        return this.f104096e.m17067f();
    }

    @Override // p000.InterfaceC34742Nj6
    /* renamed from: n */
    public Number getValue() {
        return this.f104096e;
    }

    @Override // p000.AbstractC26779o0
    /* renamed from: o */
    public C47077pn4 mo18699g() {
        return m18690p(this.f104096e.m17056q());
    }

    public C47077pn4(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f104096e = C47670qn4.m17060m(bigInteger, bigInteger2);
    }
}
