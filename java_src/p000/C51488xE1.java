package p000;
/* renamed from: xE1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C51488xE1 extends AbstractC41387gB6 {
    public C51488xE1(C43042iz0 c43042iz0) {
        super(c43042iz0);
        c43042iz0.f91891e.mo5646f();
        c43042iz0.f91893f.mo5646f();
        this.f81754f = ((C50895wE1) c43042iz0).m7196w1();
    }

    @Override // p000.AbstractC41387gB6, p000.InterfaceC44238l01
    /* renamed from: a */
    public void mo5649a(InterfaceC44238l01 interfaceC44238l01) {
        C46610p01 c46610p01 = this.f81756h;
        if (!c46610p01.f102903c || c46610p01.f102910j) {
            return;
        }
        this.f81756h.mo20170d((int) ((c46610p01.f102912l.get(0).f102907g * ((C50895wE1) this.f81750b).m7193z1()) + 0.5f));
    }

    @Override // p000.AbstractC41387gB6
    /* renamed from: d */
    public void mo5648d() {
        C50895wE1 c50895wE1 = (C50895wE1) this.f81750b;
        int m7195x1 = c50895wE1.m7195x1();
        int m7194y1 = c50895wE1.m7194y1();
        c50895wE1.m7193z1();
        if (c50895wE1.m7196w1() == 1) {
            if (m7195x1 != -1) {
                this.f81756h.f102912l.add(this.f81750b.f91888c0.f91891e.f81756h);
                this.f81750b.f91888c0.f91891e.f81756h.f102911k.add(this.f81756h);
                this.f81756h.f102906f = m7195x1;
            } else if (m7194y1 != -1) {
                this.f81756h.f102912l.add(this.f81750b.f91888c0.f91891e.f81757i);
                this.f81750b.f91888c0.f91891e.f81757i.f102911k.add(this.f81756h);
                this.f81756h.f102906f = -m7194y1;
            } else {
                C46610p01 c46610p01 = this.f81756h;
                c46610p01.f102902b = true;
                c46610p01.f102912l.add(this.f81750b.f91888c0.f91891e.f81757i);
                this.f81750b.f91888c0.f91891e.f81757i.f102911k.add(this.f81756h);
            }
            m5644q(this.f81750b.f91891e.f81756h);
            m5644q(this.f81750b.f91891e.f81757i);
            return;
        }
        if (m7195x1 != -1) {
            this.f81756h.f102912l.add(this.f81750b.f91888c0.f91893f.f81756h);
            this.f81750b.f91888c0.f91893f.f81756h.f102911k.add(this.f81756h);
            this.f81756h.f102906f = m7195x1;
        } else if (m7194y1 != -1) {
            this.f81756h.f102912l.add(this.f81750b.f91888c0.f91893f.f81757i);
            this.f81750b.f91888c0.f91893f.f81757i.f102911k.add(this.f81756h);
            this.f81756h.f102906f = -m7194y1;
        } else {
            C46610p01 c46610p012 = this.f81756h;
            c46610p012.f102902b = true;
            c46610p012.f102912l.add(this.f81750b.f91888c0.f91893f.f81757i);
            this.f81750b.f91888c0.f91893f.f81757i.f102911k.add(this.f81756h);
        }
        m5644q(this.f81750b.f91893f.f81756h);
        m5644q(this.f81750b.f91893f.f81757i);
    }

    @Override // p000.AbstractC41387gB6
    /* renamed from: e */
    public void mo5647e() {
        if (((C50895wE1) this.f81750b).m7196w1() == 1) {
            this.f81750b.m31346q1(this.f81756h.f102907g);
        } else {
            this.f81750b.m31343r1(this.f81756h.f102907g);
        }
    }

    @Override // p000.AbstractC41387gB6
    /* renamed from: f */
    public void mo5646f() {
        this.f81756h.m20171c();
    }

    @Override // p000.AbstractC41387gB6
    /* renamed from: m */
    public boolean mo5645m() {
        return false;
    }

    /* renamed from: q */
    public final void m5644q(C46610p01 c46610p01) {
        this.f81756h.f102911k.add(c46610p01);
        c46610p01.f102912l.add(this.f81756h);
    }
}
