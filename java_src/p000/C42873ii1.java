package p000;

import java.util.Objects;
/* renamed from: ii1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42873ii1 extends AbstractC26779o0 implements InterfaceC34742Nj6<String> {
    private static final long serialVersionUID = -8851436813812059827L;

    /* renamed from: e */
    public final double f87775e;

    /* renamed from: f */
    public final double f87776f;

    public C42873ii1(double d) {
        this.f87775e = d;
        this.f87776f = Math.log(d);
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
        if (!(abstractC26779o0 instanceof C44803lx2) || ((C44803lx2) abstractC26779o0).m26605k() != this.f87775e) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C42873ii1) {
            return Objects.equals(Double.valueOf(this.f87775e), Double.valueOf(((C42873ii1) obj).f87775e));
        }
        return false;
    }

    @Override // p000.AbstractC26779o0
    /* renamed from: g */
    public AbstractC26779o0 mo18699g() {
        return new C44803lx2(this.f87775e);
    }

    @Override // p000.AbstractC26779o0
    /* renamed from: h */
    public AbstractC26779o0 mo18698h(AbstractC26779o0 abstractC26779o0) {
        return AbstractC26779o0.f101189c;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.f87775e));
    }

    @Override // p000.AbstractC26779o0
    /* renamed from: i */
    public final String mo18697i() {
        double d = this.f87775e;
        if (d == 2.718281828459045d) {
            return "x -> e^x";
        }
        if (d < 0.0d) {
            return String.format("x -> (%s)^x", Double.valueOf(d));
        }
        return String.format("x -> %s^x", Double.valueOf(d));
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
    public double m33539k() {
        return this.f87775e;
    }

    @Override // p000.InterfaceC34742Nj6
    /* renamed from: l */
    public String getValue() {
        return toString();
    }
}
