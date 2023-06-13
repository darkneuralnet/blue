package p000;
/* renamed from: pM5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C46822pM5 implements InterfaceC36676Vq5 {

    /* renamed from: a */
    public AbstractC48893sr2 f103561a = new C31861Bb5();

    /* renamed from: b */
    public double f103562b;

    /* renamed from: c */
    public C48008rM5 f103563c;

    public C46822pM5(double d, C48008rM5 c48008rM5) {
        this.f103563c = c48008rM5;
        this.f103562b = d;
    }

    /* renamed from: b */
    public static boolean m19420b(InterfaceC39410cr5 interfaceC39410cr5, int i, InterfaceC39410cr5 interfaceC39410cr52, int i2) {
        boolean z;
        if (interfaceC39410cr5 != interfaceC39410cr52) {
            return false;
        }
        if (Math.abs(i - i2) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        if (interfaceC39410cr5.isClosed()) {
            int size = interfaceC39410cr5.size() - 1;
            if ((i == 0 && i2 == size) || (i2 == 0 && i == size)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC36676Vq5
    /* renamed from: a */
    public void mo19421a(InterfaceC39410cr5 interfaceC39410cr5, int i, InterfaceC39410cr5 interfaceC39410cr52, int i2) {
        if (interfaceC39410cr5 == interfaceC39410cr52 && i == i2) {
            return;
        }
        C52053yB0 mo44966u = interfaceC39410cr5.mo44966u(i);
        C52053yB0 mo44966u2 = interfaceC39410cr5.mo44966u(i + 1);
        C52053yB0 mo44966u3 = interfaceC39410cr52.mo44966u(i2);
        C52053yB0 mo44966u4 = interfaceC39410cr52.mo44966u(i2 + 1);
        if (!m19420b(interfaceC39410cr5, i, interfaceC39410cr52, i2)) {
            this.f103561a.m13587d(mo44966u, mo44966u2, mo44966u3, mo44966u4);
            if (this.f103561a.m13582i() && this.f103561a.m13584g() == 1) {
                C52053yB0 m16037a = this.f103563c.m16037a(this.f103561a.m13585f(0));
                ((S83) interfaceC39410cr5).m85917a(m16037a, i);
                ((S83) interfaceC39410cr52).m85917a(m16037a, i2);
            }
        }
        m19419c(interfaceC39410cr5, i, mo44966u, interfaceC39410cr52, i2, mo44966u3, mo44966u4);
        m19419c(interfaceC39410cr5, i, mo44966u2, interfaceC39410cr52, i2, mo44966u3, mo44966u4);
        m19419c(interfaceC39410cr52, i2, mo44966u3, interfaceC39410cr5, i, mo44966u, mo44966u2);
        m19419c(interfaceC39410cr52, i2, mo44966u4, interfaceC39410cr5, i, mo44966u, mo44966u2);
    }

    /* renamed from: c */
    public final void m19419c(InterfaceC39410cr5 interfaceC39410cr5, int i, C52053yB0 c52053yB0, InterfaceC39410cr5 interfaceC39410cr52, int i2, C52053yB0 c52053yB02, C52053yB0 c52053yB03) {
        if (c52053yB0.m3887f(c52053yB02) >= this.f103562b && c52053yB0.m3887f(c52053yB03) >= this.f103562b && G51.m105836a(c52053yB0, c52053yB02, c52053yB03) < this.f103562b) {
            ((S83) interfaceC39410cr52).m85917a(c52053yB0, i2);
            ((S83) interfaceC39410cr5).m85917a(c52053yB0, i);
        }
    }

    @Override // p000.InterfaceC36676Vq5
    public boolean isDone() {
        return false;
    }
}
