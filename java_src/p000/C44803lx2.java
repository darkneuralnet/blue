package p000;

import java.util.Objects;
/* renamed from: lx2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44803lx2 extends AbstractC26779o0 implements InterfaceC34742Nj6<String> {
    private static final long serialVersionUID = -7584688290961460870L;

    /* renamed from: e */
    public final double f97002e;

    /* renamed from: f */
    public final double f97003f;

    public C44803lx2(double d) {
        this.f97002e = d;
        this.f97003f = Math.log(d);
    }

    @Override // p000.InterfaceC38077ae6, p000.InterfaceC44546lX2
    /* renamed from: D */
    public boolean mo22026D() {
        return false;
    }

    @Override // p000.InterfaceC38077ae6
    /* renamed from: d */
    public boolean mo18701d() {
        return false;
    }

    @Override // p000.AbstractC26779o0
    /* renamed from: e */
    public boolean mo18700e(AbstractC26779o0 abstractC26779o0) {
        if (!(abstractC26779o0 instanceof C42873ii1) || ((C42873ii1) abstractC26779o0).m33539k() != this.f97002e) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C44803lx2) {
            return Objects.equals(Double.valueOf(this.f97002e), Double.valueOf(((C44803lx2) obj).f97002e));
        }
        return false;
    }

    @Override // p000.AbstractC26779o0
    /* renamed from: g */
    public AbstractC26779o0 mo18699g() {
        return new C42873ii1(this.f97002e);
    }

    @Override // p000.AbstractC26779o0
    /* renamed from: h */
    public AbstractC26779o0 mo18698h(AbstractC26779o0 abstractC26779o0) {
        return AbstractC26779o0.f101189c;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.f97002e));
    }

    @Override // p000.AbstractC26779o0
    /* renamed from: i */
    public final String mo18697i() {
        double d = this.f97002e;
        if (d == 2.718281828459045d) {
            return "x -> ln(x)";
        }
        return String.format("x -> log(base=%s, x)", Double.valueOf(d));
    }

    @Override // java.lang.Comparable
    /* renamed from: j */
    public int compareTo(InterfaceC38077ae6 interfaceC38077ae6) {
        if (this == interfaceC38077ae6) {
            return 0;
        }
        if (interfaceC38077ae6 instanceof InterfaceC34742Nj6) {
            return getValue().compareTo(String.valueOf(((InterfaceC34742Nj6) interfaceC38077ae6).getValue()));
        }
        return -1;
    }

    /* renamed from: k */
    public double m26605k() {
        return this.f97002e;
    }

    @Override // p000.InterfaceC34742Nj6
    /* renamed from: l */
    public String getValue() {
        return toString();
    }
}
