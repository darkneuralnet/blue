package p000;

import java.util.Map;
import java.util.Objects;
/* renamed from: B96 */
/* loaded from: classes8.dex */
public final class B96<Q> extends AbstractC28986u1<Q> {
    private static final long serialVersionUID = 1;

    /* renamed from: f */
    public final AbstractC28986u1<Q> f1924f;

    /* renamed from: g */
    public final InterfaceC35858Sd6<Q> f1925g;

    /* renamed from: h */
    public final InterfaceC38077ae6 f1926h;

    public B96(InterfaceC35858Sd6<Q> interfaceC35858Sd6, InterfaceC38077ae6 interfaceC38077ae6) {
        this(null, interfaceC35858Sd6, interfaceC38077ae6);
    }

    @Override // p000.AbstractC28986u1, p000.InterfaceC35858Sd6
    /* renamed from: F */
    public V31 mo3806F() {
        return this.f1924f.mo3806F();
    }

    @Override // p000.AbstractC28986u1
    /* renamed from: J */
    public InterfaceC35858Sd6<Q> mo3805J() {
        InterfaceC35858Sd6<Q> interfaceC35858Sd6 = this.f1925g;
        return interfaceC35858Sd6 != null ? interfaceC35858Sd6 : this.f1924f.mo11089G();
    }

    /* renamed from: L */
    public InterfaceC38077ae6 m114319L() {
        return this.f1926h;
    }

    /* renamed from: M */
    public InterfaceC35858Sd6<Q> m114318M() {
        return this.f1924f;
    }

    @Override // p000.InterfaceC35726Rp0
    /* renamed from: b0 */
    public InterfaceC38077ae6 mo3804b0() {
        return this.f1924f.mo3804b0().mo22030c(this.f1926h);
    }

    @Override // p000.AbstractC28986u1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B96)) {
            return false;
        }
        B96 b96 = (B96) obj;
        if (Objects.equals(this.f1924f, b96.f1924f) && Objects.equals(this.f1926h, b96.f1926h)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f1924f, this.f1926h);
    }

    @Override // p000.AbstractC28986u1, p000.InterfaceC35858Sd6
    /* renamed from: l */
    public Map<? extends InterfaceC35858Sd6<?>, Integer> mo3803l() {
        return this.f1924f.mo3803l();
    }

    public B96(String str, String str2, InterfaceC35858Sd6<Q> interfaceC35858Sd6, InterfaceC38077ae6 interfaceC38077ae6) {
        this(str, str2, interfaceC35858Sd6, interfaceC35858Sd6.mo11089G(), interfaceC38077ae6);
    }

    public B96(String str, InterfaceC35858Sd6<Q> interfaceC35858Sd6, InterfaceC38077ae6 interfaceC38077ae6) {
        this(str, interfaceC35858Sd6, interfaceC35858Sd6.mo11089G(), interfaceC38077ae6);
    }

    public B96(String str, String str2, InterfaceC35858Sd6<Q> interfaceC35858Sd6, InterfaceC35858Sd6<Q> interfaceC35858Sd62, InterfaceC38077ae6 interfaceC38077ae6) {
        if (interfaceC35858Sd6 instanceof AbstractC28986u1) {
            this.f1925g = interfaceC35858Sd62;
            this.f1924f = (AbstractC28986u1) interfaceC35858Sd6;
            this.f1926h = interfaceC38077ae6;
            m11088H(str);
            m11090E(str2);
            return;
        }
        throw new IllegalArgumentException("The parent unit: " + interfaceC35858Sd6 + " is not an abstract unit.");
    }

    public B96(String str, InterfaceC35858Sd6<Q> interfaceC35858Sd6, InterfaceC35858Sd6<Q> interfaceC35858Sd62, InterfaceC38077ae6 interfaceC38077ae6) {
        this(str, null, interfaceC35858Sd6, interfaceC35858Sd62, interfaceC38077ae6);
    }
}
