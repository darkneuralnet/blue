package p000;

import p000.EI4;
/* renamed from: Z36 */
/* loaded from: classes5.dex */
public class Z36 implements EI4, InterfaceC45599nI4 {

    /* renamed from: a */
    public final EI4 f47796a;

    /* renamed from: b */
    public final Object f47797b;

    /* renamed from: c */
    public volatile InterfaceC45599nI4 f47798c;

    /* renamed from: d */
    public volatile InterfaceC45599nI4 f47799d;

    /* renamed from: e */
    public EI4.EnumC1777a f47800e;

    /* renamed from: f */
    public EI4.EnumC1777a f47801f;

    /* renamed from: g */
    public boolean f47802g;

    public Z36(Object obj, EI4 ei4) {
        EI4.EnumC1777a enumC1777a = EI4.EnumC1777a.CLEARED;
        this.f47800e = enumC1777a;
        this.f47801f = enumC1777a;
        this.f47797b = obj;
        this.f47796a = ei4;
    }

    @Override // p000.EI4, p000.InterfaceC45599nI4
    /* renamed from: a */
    public boolean mo20678a() {
        boolean z;
        synchronized (this.f47797b) {
            if (!this.f47799d.mo20678a() && !this.f47798c.mo20678a()) {
                z = false;
            }
            z = true;
        }
        return z;
    }

    @Override // p000.EI4
    /* renamed from: b */
    public boolean mo20677b(InterfaceC45599nI4 interfaceC45599nI4) {
        boolean z;
        synchronized (this.f47797b) {
            if (m73795j() && interfaceC45599nI4.equals(this.f47798c) && this.f47800e != EI4.EnumC1777a.PAUSED) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // p000.EI4
    /* renamed from: c */
    public boolean mo20676c(InterfaceC45599nI4 interfaceC45599nI4) {
        boolean z;
        synchronized (this.f47797b) {
            if (m73794k() && interfaceC45599nI4.equals(this.f47798c) && !mo20678a()) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // p000.InterfaceC45599nI4
    public void clear() {
        synchronized (this.f47797b) {
            this.f47802g = false;
            EI4.EnumC1777a enumC1777a = EI4.EnumC1777a.CLEARED;
            this.f47800e = enumC1777a;
            this.f47801f = enumC1777a;
            this.f47799d.clear();
            this.f47798c.clear();
        }
    }

    @Override // p000.EI4
    /* renamed from: d */
    public void mo20675d(InterfaceC45599nI4 interfaceC45599nI4) {
        synchronized (this.f47797b) {
            if (interfaceC45599nI4.equals(this.f47799d)) {
                this.f47801f = EI4.EnumC1777a.SUCCESS;
                return;
            }
            this.f47800e = EI4.EnumC1777a.SUCCESS;
            EI4 ei4 = this.f47796a;
            if (ei4 != null) {
                ei4.mo20675d(this);
            }
            if (!this.f47801f.m109232a()) {
                this.f47799d.clear();
            }
        }
    }

    @Override // p000.InterfaceC45599nI4
    /* renamed from: e */
    public boolean mo20674e(InterfaceC45599nI4 interfaceC45599nI4) {
        if (!(interfaceC45599nI4 instanceof Z36)) {
            return false;
        }
        Z36 z36 = (Z36) interfaceC45599nI4;
        if (this.f47798c == null) {
            if (z36.f47798c != null) {
                return false;
            }
        } else if (!this.f47798c.mo20674e(z36.f47798c)) {
            return false;
        }
        if (this.f47799d == null) {
            if (z36.f47799d != null) {
                return false;
            }
        } else if (!this.f47799d.mo20674e(z36.f47799d)) {
            return false;
        }
        return true;
    }

    @Override // p000.InterfaceC45599nI4
    /* renamed from: f */
    public boolean mo20673f() {
        boolean z;
        synchronized (this.f47797b) {
            if (this.f47800e == EI4.EnumC1777a.CLEARED) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // p000.EI4
    /* renamed from: g */
    public boolean mo20672g(InterfaceC45599nI4 interfaceC45599nI4) {
        boolean z;
        synchronized (this.f47797b) {
            if (m73793l() && (interfaceC45599nI4.equals(this.f47798c) || this.f47800e != EI4.EnumC1777a.SUCCESS)) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // p000.EI4
    public EI4 getRoot() {
        EI4 ei4;
        synchronized (this.f47797b) {
            EI4 ei42 = this.f47796a;
            if (ei42 != null) {
                ei4 = ei42.getRoot();
            } else {
                ei4 = this;
            }
        }
        return ei4;
    }

    @Override // p000.EI4
    /* renamed from: h */
    public void mo20671h(InterfaceC45599nI4 interfaceC45599nI4) {
        synchronized (this.f47797b) {
            if (!interfaceC45599nI4.equals(this.f47798c)) {
                this.f47801f = EI4.EnumC1777a.FAILED;
                return;
            }
            this.f47800e = EI4.EnumC1777a.FAILED;
            EI4 ei4 = this.f47796a;
            if (ei4 != null) {
                ei4.mo20671h(this);
            }
        }
    }

    @Override // p000.InterfaceC45599nI4
    /* renamed from: i */
    public void mo20670i() {
        synchronized (this.f47797b) {
            this.f47802g = true;
            if (this.f47800e != EI4.EnumC1777a.SUCCESS) {
                EI4.EnumC1777a enumC1777a = this.f47801f;
                EI4.EnumC1777a enumC1777a2 = EI4.EnumC1777a.RUNNING;
                if (enumC1777a != enumC1777a2) {
                    this.f47801f = enumC1777a2;
                    this.f47799d.mo20670i();
                }
            }
            if (this.f47802g) {
                EI4.EnumC1777a enumC1777a3 = this.f47800e;
                EI4.EnumC1777a enumC1777a4 = EI4.EnumC1777a.RUNNING;
                if (enumC1777a3 != enumC1777a4) {
                    this.f47800e = enumC1777a4;
                    this.f47798c.mo20670i();
                }
            }
            this.f47802g = false;
        }
    }

    @Override // p000.InterfaceC45599nI4
    public boolean isComplete() {
        boolean z;
        synchronized (this.f47797b) {
            if (this.f47800e == EI4.EnumC1777a.SUCCESS) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // p000.InterfaceC45599nI4
    public boolean isRunning() {
        boolean z;
        synchronized (this.f47797b) {
            if (this.f47800e == EI4.EnumC1777a.RUNNING) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: j */
    public final boolean m73795j() {
        EI4 ei4 = this.f47796a;
        return ei4 == null || ei4.mo20677b(this);
    }

    /* renamed from: k */
    public final boolean m73794k() {
        EI4 ei4 = this.f47796a;
        return ei4 == null || ei4.mo20676c(this);
    }

    /* renamed from: l */
    public final boolean m73793l() {
        EI4 ei4 = this.f47796a;
        return ei4 == null || ei4.mo20672g(this);
    }

    /* renamed from: m */
    public void m73792m(InterfaceC45599nI4 interfaceC45599nI4, InterfaceC45599nI4 interfaceC45599nI42) {
        this.f47798c = interfaceC45599nI4;
        this.f47799d = interfaceC45599nI42;
    }

    @Override // p000.InterfaceC45599nI4
    public void pause() {
        synchronized (this.f47797b) {
            if (!this.f47801f.m109232a()) {
                this.f47801f = EI4.EnumC1777a.PAUSED;
                this.f47799d.pause();
            }
            if (!this.f47800e.m109232a()) {
                this.f47800e = EI4.EnumC1777a.PAUSED;
                this.f47798c.pause();
            }
        }
    }
}
