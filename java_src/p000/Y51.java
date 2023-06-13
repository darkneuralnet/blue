package p000;

import java.util.Objects;
/* renamed from: Y51 */
/* loaded from: classes8.dex */
public final class Y51 extends AbstractC26779o0 implements InterfaceC44546lX2 {
    private static final long serialVersionUID = 6588759878444545649L;

    /* renamed from: e */
    public final double f44507e;

    public Y51(double d) {
        this.f44507e = d;
    }

    @Override // p000.InterfaceC38077ae6
    /* renamed from: d */
    public boolean mo18701d() {
        return this.f44507e == 1.0d;
    }

    @Override // p000.AbstractC26779o0
    /* renamed from: e */
    public boolean mo18700e(AbstractC26779o0 abstractC26779o0) {
        return abstractC26779o0 instanceof Y51;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Y51) {
            return Objects.equals(Double.valueOf(this.f44507e), Double.valueOf(((Y51) obj).f44507e));
        }
        return false;
    }

    @Override // p000.AbstractC26779o0
    /* renamed from: h */
    public AbstractC26779o0 mo18698h(AbstractC26779o0 abstractC26779o0) {
        return new Y51(this.f44507e * ((Y51) abstractC26779o0).f44507e);
    }

    public int hashCode() {
        return Objects.hashCode(Double.valueOf(this.f44507e));
    }

    @Override // p000.AbstractC26779o0
    /* renamed from: i */
    public final String mo18697i() {
        return String.format("x -> x * %s", Double.valueOf(this.f44507e));
    }

    @Override // java.lang.Comparable
    /* renamed from: j */
    public int compareTo(InterfaceC38077ae6 interfaceC38077ae6) {
        if (this == interfaceC38077ae6) {
            return 0;
        }
        if (interfaceC38077ae6 instanceof Y51) {
            return getValue().compareTo(((Y51) interfaceC38077ae6).getValue());
        }
        return -1;
    }

    @Override // p000.InterfaceC34742Nj6
    /* renamed from: k */
    public Double getValue() {
        return Double.valueOf(this.f44507e);
    }

    @Override // p000.AbstractC26779o0
    /* renamed from: l */
    public Y51 mo18699g() {
        return new Y51(1.0d / this.f44507e);
    }
}
