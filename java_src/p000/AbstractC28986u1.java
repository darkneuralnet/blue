package p000;

import java.util.HashMap;
import java.util.Map;
import javax.measure.IncommensurableException;
import javax.measure.UnconvertibleException;
/* renamed from: u1 */
/* loaded from: classes8.dex */
public abstract class AbstractC28986u1<Q> implements InterfaceC35726Rp0<Q> {

    /* renamed from: d */
    public static final InterfaceC35858Sd6<InterfaceC37738a41> f111479d = new C47276q74();

    /* renamed from: e */
    public static final transient Map<String, InterfaceC35858Sd6<?>> f111480e = new HashMap();
    private static final long serialVersionUID = -4344589505537030204L;

    /* renamed from: b */
    public String f111481b;

    /* renamed from: c */
    public String f111482c;

    public AbstractC28986u1() {
    }

    /* renamed from: E */
    public void m11090E(String str) {
        this.f111481b = str;
    }

    @Override // p000.InterfaceC35858Sd6
    /* renamed from: F */
    public abstract V31 mo3806F();

    @Override // p000.InterfaceC35726Rp0, p000.InterfaceC35858Sd6
    /* renamed from: G */
    public final InterfaceC35858Sd6<Q> mo11089G() {
        return mo3805J();
    }

    /* renamed from: H */
    public void m11088H(String str) {
        this.f111482c = str;
    }

    /* renamed from: J */
    public abstract InterfaceC35858Sd6<Q> mo3805J();

    /* renamed from: K */
    public final InterfaceC35858Sd6<Q> m11087K(InterfaceC38077ae6 interfaceC38077ae6) {
        InterfaceC35858Sd6<Q> mo11089G = mo11089G();
        if (m11066v()) {
            interfaceC38077ae6 = mo3804b0().mo22030c(interfaceC38077ae6);
        }
        if (!interfaceC38077ae6.mo18701d()) {
            return new B96((String) null, this, mo11089G, interfaceC38077ae6);
        }
        return mo11089G;
    }

    @Override // p000.InterfaceC35858Sd6
    /* renamed from: a */
    public String mo11086a() {
        return this.f111482c;
    }

    @Override // p000.InterfaceC35858Sd6
    /* renamed from: b */
    public final InterfaceC35858Sd6<?> mo11085b() {
        InterfaceC35858Sd6<InterfaceC37738a41> interfaceC35858Sd6 = f111479d;
        if (equals(interfaceC35858Sd6)) {
            return this;
        }
        return C47276q74.m18096c0(interfaceC35858Sd6, this);
    }

    @Override // p000.InterfaceC35858Sd6
    /* renamed from: c */
    public final InterfaceC35858Sd6<?> mo11084c(int i) {
        if (i > 0) {
            return C47276q74.m18095d0(this, i);
        }
        if (i != 0) {
            return f111479d.mo11078i(mo11084c(-i));
        }
        throw new ArithmeticException("Root's order of zero");
    }

    @Override // p000.InterfaceC35858Sd6
    /* renamed from: d */
    public InterfaceC35858Sd6<?> mo11083d(int i) {
        if (i > 0) {
            return mo11077j(mo11083d(i - 1));
        }
        if (i == 0) {
            return f111479d;
        }
        return f111479d.mo11078i(mo11083d(-i));
    }

    @Override // p000.InterfaceC35858Sd6
    /* renamed from: e */
    public InterfaceC35858Sd6<Q> mo11082e(WZ3 wz3) {
        return m11087K(InterfaceC44546lX2.m27176w0(wz3));
    }

    public abstract boolean equals(Object obj);

    @Override // p000.InterfaceC35858Sd6
    /* renamed from: g */
    public InterfaceC35858Sd6<Q> mo11080g(double d) {
        return mo11079h(C47670qn4.m17063j(d));
    }

    @Override // p000.InterfaceC35858Sd6
    public String getName() {
        return this.f111481b;
    }

    @Override // p000.InterfaceC35858Sd6
    /* renamed from: h */
    public final InterfaceC35858Sd6<Q> mo11079h(Number number) {
        if (C49060t80.m13024c().mo13934a(number)) {
            return this;
        }
        return m11087K(InterfaceC44546lX2.m27181M2(number));
    }

    @Override // p000.InterfaceC35858Sd6
    /* renamed from: i */
    public final InterfaceC35858Sd6<?> mo11078i(InterfaceC35858Sd6<?> interfaceC35858Sd6) {
        return mo11077j(interfaceC35858Sd6.mo11085b());
    }

    @Override // p000.InterfaceC35858Sd6
    /* renamed from: j */
    public final InterfaceC35858Sd6<?> mo11077j(InterfaceC35858Sd6<?> interfaceC35858Sd6) {
        if (interfaceC35858Sd6 instanceof InterfaceC35726Rp0) {
            return m11065w((InterfaceC35726Rp0) interfaceC35858Sd6);
        }
        return C47276q74.m18097Z(this, interfaceC35858Sd6);
    }

    @Override // p000.InterfaceC35858Sd6
    /* renamed from: k */
    public final InterfaceC38077ae6 mo11076k(InterfaceC35858Sd6<Q> interfaceC35858Sd6) throws UnconvertibleException {
        return m11069s(interfaceC35858Sd6, true);
    }

    @Override // p000.InterfaceC35858Sd6
    /* renamed from: l */
    public abstract Map<? extends InterfaceC35858Sd6<?>, Integer> mo3803l();

    @Override // p000.InterfaceC35858Sd6
    /* renamed from: m */
    public InterfaceC35858Sd6<Q> mo11075m(double d) {
        return m11071q(C47670qn4.m17063j(d));
    }

    @Override // p000.InterfaceC35858Sd6
    /* renamed from: n */
    public final <T> InterfaceC35726Rp0<T> mo11081f(Class<T> cls) {
        V31 m64215b = C38670be6.m64215b(cls);
        if (m64215b != null && !m64215b.equals(mo3806F())) {
            throw new ClassCastException("The unit: " + this + " is not compatible with quantities of type " + cls);
        }
        return this;
    }

    @Override // java.lang.Comparable
    /* renamed from: o */
    public int compareTo(InterfaceC35858Sd6<Q> interfaceC35858Sd6) {
        int m11072p = m11072p(mo11086a(), interfaceC35858Sd6.mo11086a());
        if (m11072p == 0) {
            return m11072p(this.f111481b, interfaceC35858Sd6.getName());
        }
        return m11072p;
    }

    /* renamed from: p */
    public final int m11072p(String str, String str2) {
        if (str == null) {
            return str2 == null ? 0 : -1;
        } else if (str2 == null) {
            return 1;
        } else {
            return str.compareTo(str2);
        }
    }

    /* renamed from: q */
    public final InterfaceC35858Sd6<Q> m11071q(Number number) {
        if (C49060t80.m13024c().mo13934a(number)) {
            return this;
        }
        return m11087K(InterfaceC44546lX2.m27181M2(C46689p80.m19933c(number).m19930f().m19932d()));
    }

    /* renamed from: r */
    public final InterfaceC38077ae6 m11070r(InterfaceC35858Sd6<?> interfaceC35858Sd6) throws IncommensurableException, UnconvertibleException {
        if (m11067u(interfaceC35858Sd6)) {
            InterfaceC35726Rp0 interfaceC35726Rp0 = (InterfaceC35726Rp0) interfaceC35858Sd6;
            Z31 m73798a = Z31.m73798a();
            return m73798a.m73797b(interfaceC35726Rp0.mo11089G().mo3806F()).mo22030c(interfaceC35726Rp0.mo3804b0()).mo22025b().mo22030c(m73798a.m73797b(mo11089G().mo3806F()).mo22030c(mo3804b0()));
        }
        throw new IncommensurableException(this + " is not compatible with " + interfaceC35858Sd6);
    }

    /* renamed from: s */
    public final InterfaceC38077ae6 m11069s(InterfaceC35858Sd6<Q> interfaceC35858Sd6, boolean z) throws UnconvertibleException {
        if (z) {
            if (this == interfaceC35858Sd6 || equals(interfaceC35858Sd6)) {
                return AbstractC26779o0.f101189c;
            }
        } else if (this == interfaceC35858Sd6) {
            return AbstractC26779o0.f101189c;
        }
        InterfaceC35858Sd6<Q> mo11089G = mo11089G();
        InterfaceC35858Sd6<Q> mo11089G2 = interfaceC35858Sd6.mo11089G();
        if (!mo11089G.equals(mo11089G2)) {
            try {
                return m11070r(interfaceC35858Sd6);
            } catch (IncommensurableException e) {
                throw new UnconvertibleException(e);
            }
        }
        return interfaceC35858Sd6.mo11076k(mo11089G2).mo22025b().mo22030c(mo3804b0());
    }

    /* renamed from: t */
    public final boolean m11068t(InterfaceC35858Sd6<?> interfaceC35858Sd6, boolean z) {
        if (z) {
            if (this == interfaceC35858Sd6 || equals(interfaceC35858Sd6)) {
                return true;
            }
        } else if (this == interfaceC35858Sd6) {
            return true;
        }
        if (!(interfaceC35858Sd6 instanceof InterfaceC35726Rp0)) {
            return false;
        }
        V31 mo3806F = mo3806F();
        V31 mo3806F2 = interfaceC35858Sd6.mo3806F();
        if (mo3806F.equals(mo3806F2)) {
            return true;
        }
        Z31 m73798a = Z31.m73798a();
        return m73798a.m73796c(mo3806F).equals(m73798a.m73796c(mo3806F2));
    }

    @Override // p000.InterfaceC35858Sd6
    public String toString() {
        return AbstractC38404bB5.m64874k().m9384b(this);
    }

    /* renamed from: u */
    public final boolean m11067u(InterfaceC35858Sd6<?> interfaceC35858Sd6) {
        return m11068t(interfaceC35858Sd6, true);
    }

    /* renamed from: v */
    public boolean m11066v() {
        InterfaceC35858Sd6<Q> mo3805J = mo3805J();
        if (this != mo3805J && !equals(mo3805J)) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    public final InterfaceC35858Sd6<?> m11065w(InterfaceC35726Rp0<?> interfaceC35726Rp0) {
        InterfaceC35858Sd6<InterfaceC37738a41> interfaceC35858Sd6 = f111479d;
        if (equals(interfaceC35858Sd6)) {
            return interfaceC35726Rp0;
        }
        if (interfaceC35726Rp0.equals(interfaceC35858Sd6)) {
            return this;
        }
        return C47276q74.m18097Z(this, interfaceC35726Rp0);
    }

    public AbstractC28986u1(String str) {
        this.f111482c = str;
    }
}
