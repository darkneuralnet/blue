package p000;

import p000.EI4;
/* renamed from: og1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46411og1 implements EI4, InterfaceC45599nI4 {

    /* renamed from: a */
    public final Object f102297a;

    /* renamed from: b */
    public final EI4 f102298b;

    /* renamed from: c */
    public volatile InterfaceC45599nI4 f102299c;

    /* renamed from: d */
    public volatile InterfaceC45599nI4 f102300d;

    /* renamed from: e */
    public EI4.EnumC1777a f102301e;

    /* renamed from: f */
    public EI4.EnumC1777a f102302f;

    public C46411og1(Object obj, EI4 ei4) {
        EI4.EnumC1777a enumC1777a = EI4.EnumC1777a.CLEARED;
        this.f102301e = enumC1777a;
        this.f102302f = enumC1777a;
        this.f102297a = obj;
        this.f102298b = ei4;
    }

    @Override // p000.EI4, p000.InterfaceC45599nI4
    /* renamed from: a */
    public boolean mo20678a() {
        boolean z;
        synchronized (this.f102297a) {
            if (!this.f102299c.mo20678a() && !this.f102300d.mo20678a()) {
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
        synchronized (this.f102297a) {
            if (m20668k() && interfaceC45599nI4.equals(this.f102299c)) {
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
        synchronized (this.f102297a) {
            if (m20667l() && m20669j(interfaceC45599nI4)) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // p000.InterfaceC45599nI4
    public void clear() {
        synchronized (this.f102297a) {
            EI4.EnumC1777a enumC1777a = EI4.EnumC1777a.CLEARED;
            this.f102301e = enumC1777a;
            this.f102299c.clear();
            if (this.f102302f != enumC1777a) {
                this.f102302f = enumC1777a;
                this.f102300d.clear();
            }
        }
    }

    @Override // p000.EI4
    /* renamed from: d */
    public void mo20675d(InterfaceC45599nI4 interfaceC45599nI4) {
        synchronized (this.f102297a) {
            if (interfaceC45599nI4.equals(this.f102299c)) {
                this.f102301e = EI4.EnumC1777a.SUCCESS;
            } else if (interfaceC45599nI4.equals(this.f102300d)) {
                this.f102302f = EI4.EnumC1777a.SUCCESS;
            }
            EI4 ei4 = this.f102298b;
            if (ei4 != null) {
                ei4.mo20675d(this);
            }
        }
    }

    @Override // p000.InterfaceC45599nI4
    /* renamed from: e */
    public boolean mo20674e(InterfaceC45599nI4 interfaceC45599nI4) {
        if (!(interfaceC45599nI4 instanceof C46411og1)) {
            return false;
        }
        C46411og1 c46411og1 = (C46411og1) interfaceC45599nI4;
        if (!this.f102299c.mo20674e(c46411og1.f102299c) || !this.f102300d.mo20674e(c46411og1.f102300d)) {
            return false;
        }
        return true;
    }

    @Override // p000.InterfaceC45599nI4
    /* renamed from: f */
    public boolean mo20673f() {
        boolean z;
        synchronized (this.f102297a) {
            EI4.EnumC1777a enumC1777a = this.f102301e;
            EI4.EnumC1777a enumC1777a2 = EI4.EnumC1777a.CLEARED;
            if (enumC1777a == enumC1777a2 && this.f102302f == enumC1777a2) {
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
        boolean m20666m;
        synchronized (this.f102297a) {
            m20666m = m20666m();
        }
        return m20666m;
    }

    @Override // p000.EI4
    public EI4 getRoot() {
        EI4 ei4;
        synchronized (this.f102297a) {
            EI4 ei42 = this.f102298b;
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
        synchronized (this.f102297a) {
            if (!interfaceC45599nI4.equals(this.f102300d)) {
                this.f102301e = EI4.EnumC1777a.FAILED;
                EI4.EnumC1777a enumC1777a = this.f102302f;
                EI4.EnumC1777a enumC1777a2 = EI4.EnumC1777a.RUNNING;
                if (enumC1777a != enumC1777a2) {
                    this.f102302f = enumC1777a2;
                    this.f102300d.mo20670i();
                }
                return;
            }
            this.f102302f = EI4.EnumC1777a.FAILED;
            EI4 ei4 = this.f102298b;
            if (ei4 != null) {
                ei4.mo20671h(this);
            }
        }
    }

    @Override // p000.InterfaceC45599nI4
    /* renamed from: i */
    public void mo20670i() {
        synchronized (this.f102297a) {
            EI4.EnumC1777a enumC1777a = this.f102301e;
            EI4.EnumC1777a enumC1777a2 = EI4.EnumC1777a.RUNNING;
            if (enumC1777a != enumC1777a2) {
                this.f102301e = enumC1777a2;
                this.f102299c.mo20670i();
            }
        }
    }

    @Override // p000.InterfaceC45599nI4
    public boolean isComplete() {
        boolean z;
        synchronized (this.f102297a) {
            EI4.EnumC1777a enumC1777a = this.f102301e;
            EI4.EnumC1777a enumC1777a2 = EI4.EnumC1777a.SUCCESS;
            if (enumC1777a != enumC1777a2 && this.f102302f != enumC1777a2) {
                z = false;
            }
            z = true;
        }
        return z;
    }

    @Override // p000.InterfaceC45599nI4
    public boolean isRunning() {
        boolean z;
        synchronized (this.f102297a) {
            EI4.EnumC1777a enumC1777a = this.f102301e;
            EI4.EnumC1777a enumC1777a2 = EI4.EnumC1777a.RUNNING;
            if (enumC1777a != enumC1777a2 && this.f102302f != enumC1777a2) {
                z = false;
            }
            z = true;
        }
        return z;
    }

    /* renamed from: j */
    public final boolean m20669j(InterfaceC45599nI4 interfaceC45599nI4) {
        EI4.EnumC1777a enumC1777a;
        EI4.EnumC1777a enumC1777a2 = this.f102301e;
        EI4.EnumC1777a enumC1777a3 = EI4.EnumC1777a.FAILED;
        if (enumC1777a2 != enumC1777a3) {
            return interfaceC45599nI4.equals(this.f102299c);
        }
        if (interfaceC45599nI4.equals(this.f102300d) && ((enumC1777a = this.f102302f) == EI4.EnumC1777a.SUCCESS || enumC1777a == enumC1777a3)) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final boolean m20668k() {
        EI4 ei4 = this.f102298b;
        return ei4 == null || ei4.mo20677b(this);
    }

    /* renamed from: l */
    public final boolean m20667l() {
        EI4 ei4 = this.f102298b;
        return ei4 == null || ei4.mo20676c(this);
    }

    /* renamed from: m */
    public final boolean m20666m() {
        EI4 ei4 = this.f102298b;
        return ei4 == null || ei4.mo20672g(this);
    }

    /* renamed from: n */
    public void m20665n(InterfaceC45599nI4 interfaceC45599nI4, InterfaceC45599nI4 interfaceC45599nI42) {
        this.f102299c = interfaceC45599nI4;
        this.f102300d = interfaceC45599nI42;
    }

    @Override // p000.InterfaceC45599nI4
    public void pause() {
        synchronized (this.f102297a) {
            EI4.EnumC1777a enumC1777a = this.f102301e;
            EI4.EnumC1777a enumC1777a2 = EI4.EnumC1777a.RUNNING;
            if (enumC1777a == enumC1777a2) {
                this.f102301e = EI4.EnumC1777a.PAUSED;
                this.f102299c.pause();
            }
            if (this.f102302f == enumC1777a2) {
                this.f102302f = EI4.EnumC1777a.PAUSED;
                this.f102300d.pause();
            }
        }
    }
}
