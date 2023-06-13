package p000;

import java.util.ArrayList;
import java.util.List;
/* renamed from: U83 */
/* loaded from: classes8.dex */
public class U83 implements InterfaceC36676Vq5 {

    /* renamed from: e */
    public AbstractC48893sr2 f36892e;

    /* renamed from: f */
    public C52053yB0 f36893f;

    /* renamed from: a */
    public boolean f36888a = false;

    /* renamed from: b */
    public boolean f36889b = false;

    /* renamed from: c */
    public boolean f36890c = true;

    /* renamed from: d */
    public boolean f36891d = false;

    /* renamed from: g */
    public C52053yB0[] f36894g = null;

    /* renamed from: h */
    public List f36895h = new ArrayList();

    /* renamed from: i */
    public int f36896i = 0;

    public U83(AbstractC48893sr2 abstractC48893sr2) {
        this.f36893f = null;
        this.f36892e = abstractC48893sr2;
        this.f36893f = null;
    }

    /* renamed from: e */
    public static boolean m81924e(InterfaceC39410cr5 interfaceC39410cr5, int i) {
        return i == 0 || i >= interfaceC39410cr5.size() + (-2);
    }

    /* renamed from: f */
    public static boolean m81923f(C52053yB0 c52053yB0, C52053yB0 c52053yB02, C52053yB0 c52053yB03, C52053yB0 c52053yB04, boolean z, boolean z2, boolean z3, boolean z4) {
        if (m81922g(c52053yB0, c52053yB03, z, z3) || m81922g(c52053yB0, c52053yB04, z, z4) || m81922g(c52053yB02, c52053yB03, z2, z3) || m81922g(c52053yB02, c52053yB04, z2, z4)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m81922g(C52053yB0 c52053yB0, C52053yB0 c52053yB02, boolean z, boolean z2) {
        return !(z && z2) && c52053yB0.m3886g(c52053yB02);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00db  */
    @Override // p000.InterfaceC36676Vq5
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo19421a(InterfaceC39410cr5 interfaceC39410cr5, int i, InterfaceC39410cr5 interfaceC39410cr52, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        C52053yB0 c52053yB0;
        C52053yB0 c52053yB02;
        C52053yB0 c52053yB03;
        boolean z8;
        boolean z9;
        boolean z10;
        if (!this.f36888a && m81925d()) {
            return;
        }
        if (interfaceC39410cr5 == interfaceC39410cr52) {
            z = true;
        } else {
            z = false;
        }
        if (z && i == i2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return;
        }
        if (this.f36889b) {
            if (!m81924e(interfaceC39410cr5, i) && !m81924e(interfaceC39410cr52, i2)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                return;
            }
        }
        C52053yB0 mo44966u = interfaceC39410cr5.mo44966u(i);
        C52053yB0 mo44966u2 = interfaceC39410cr5.mo44966u(i + 1);
        C52053yB0 mo44966u3 = interfaceC39410cr52.mo44966u(i2);
        C52053yB0 mo44966u4 = interfaceC39410cr52.mo44966u(i2 + 1);
        if (i == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (i + 2 == interfaceC39410cr5.size()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i2 == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (i2 + 2 == interfaceC39410cr52.size()) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.f36892e.m13587d(mo44966u, mo44966u2, mo44966u3, mo44966u4);
        if (this.f36892e.m13582i() && this.f36892e.m13579l()) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!this.f36891d) {
            if (z && Math.abs(i2 - i) <= 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                c52053yB0 = mo44966u4;
                c52053yB02 = mo44966u3;
                boolean z11 = z4;
                c52053yB03 = mo44966u2;
                if (m81923f(mo44966u, mo44966u2, mo44966u3, mo44966u4, z3, z11, z5, z6)) {
                    z8 = true;
                    if (!z7 || z8) {
                        this.f36894g = r3;
                        C52053yB0[] c52053yB0Arr = {mo44966u, c52053yB03, c52053yB02, c52053yB0};
                        C52053yB0 m13585f = this.f36892e.m13585f(0);
                        this.f36893f = m13585f;
                        if (this.f36890c) {
                            this.f36895h.add(m13585f);
                        }
                        this.f36896i++;
                    }
                    return;
                }
                z8 = false;
                if (!z7) {
                }
                this.f36894g = c52053yB0Arr;
                C52053yB0[] c52053yB0Arr2 = {mo44966u, c52053yB03, c52053yB02, c52053yB0};
                C52053yB0 m13585f2 = this.f36892e.m13585f(0);
                this.f36893f = m13585f2;
                if (this.f36890c) {
                }
                this.f36896i++;
            }
        }
        c52053yB0 = mo44966u4;
        c52053yB02 = mo44966u3;
        c52053yB03 = mo44966u2;
        z8 = false;
        if (!z7) {
        }
        this.f36894g = c52053yB0Arr2;
        C52053yB0[] c52053yB0Arr22 = {mo44966u, c52053yB03, c52053yB02, c52053yB0};
        C52053yB0 m13585f22 = this.f36892e.m13585f(0);
        this.f36893f = m13585f22;
        if (this.f36890c) {
        }
        this.f36896i++;
    }

    /* renamed from: b */
    public C52053yB0 m81927b() {
        return this.f36893f;
    }

    /* renamed from: c */
    public C52053yB0[] m81926c() {
        return this.f36894g;
    }

    /* renamed from: d */
    public boolean m81925d() {
        return this.f36893f != null;
    }

    /* renamed from: h */
    public void m81921h(boolean z) {
        this.f36888a = z;
    }

    @Override // p000.InterfaceC36676Vq5
    public boolean isDone() {
        if (this.f36888a || this.f36893f == null) {
            return false;
        }
        return true;
    }
}
