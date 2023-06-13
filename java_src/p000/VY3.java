package p000;

import java.util.Objects;
import p000.C49060t80;
/* renamed from: VY3 */
/* loaded from: classes8.dex */
public final class VY3 extends AbstractC26779o0 implements InterfaceC44546lX2 {

    /* renamed from: i */
    public static final VY3 f39222i = m79752l(1);
    private static final long serialVersionUID = 5000593326722785126L;

    /* renamed from: e */
    public final Object f39223e = new Object[0];

    /* renamed from: f */
    public final int f39224f;

    /* renamed from: g */
    public final int f39225g;

    /* renamed from: h */
    public transient Number f39226h;

    public VY3(int i) {
        this.f39224f = i;
        this.f39225g = Objects.hash(Integer.valueOf(i));
    }

    /* renamed from: l */
    public static VY3 m79752l(int i) {
        return new VY3(i);
    }

    @Override // p000.InterfaceC38077ae6, p000.InterfaceC44546lX2
    /* renamed from: D */
    public boolean mo22026D() {
        return true;
    }

    @Override // p000.InterfaceC38077ae6
    /* renamed from: d */
    public boolean mo18701d() {
        return this.f39224f == 0;
    }

    @Override // p000.AbstractC26779o0
    /* renamed from: e */
    public boolean mo18700e(AbstractC26779o0 abstractC26779o0) {
        return abstractC26779o0 instanceof VY3;
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
        if ((obj instanceof VY3) && this.f39224f == ((VY3) obj).f39224f) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC26779o0
    /* renamed from: g */
    public AbstractC26779o0 mo18699g() {
        return new VY3(-this.f39224f);
    }

    @Override // p000.AbstractC26779o0
    /* renamed from: h */
    public AbstractC26779o0 mo18698h(AbstractC26779o0 abstractC26779o0) {
        return new VY3(this.f39224f + ((VY3) abstractC26779o0).f39224f);
    }

    public int hashCode() {
        return this.f39225g;
    }

    @Override // p000.AbstractC26779o0
    /* renamed from: i */
    public final String mo18697i() {
        return String.format("x -> x * π^%s", Integer.valueOf(this.f39224f));
    }

    @Override // java.lang.Comparable
    /* renamed from: j */
    public int compareTo(InterfaceC38077ae6 interfaceC38077ae6) {
        if (this == interfaceC38077ae6) {
            return 0;
        }
        if (mo18701d() && interfaceC38077ae6.mo18701d()) {
            return 0;
        }
        if (interfaceC38077ae6 instanceof VY3) {
            return Integer.compare(this.f39224f, ((VY3) interfaceC38077ae6).f39224f);
        }
        return VY3.class.getName().compareTo(interfaceC38077ae6.getClass().getName());
    }

    @Override // p000.InterfaceC34742Nj6
    /* renamed from: k */
    public Number getValue() {
        synchronized (this.f39223e) {
            if (this.f39226h == null) {
                int precision = C49060t80.f109904c.getPrecision();
                if (precision != 0) {
                    this.f39226h = C46689p80.m19933c(C49060t80.C28533a.m13016f(precision)).m19931e(this.f39224f).m19932d();
                } else {
                    throw new ArithmeticException("Pi multiplication with unlimited precision");
                }
            }
        }
        return this.f39226h;
    }
}
