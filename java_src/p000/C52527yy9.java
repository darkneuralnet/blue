package p000;
/* renamed from: yy9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52527yy9 extends AbstractC52517yx9 {

    /* renamed from: g */
    public final C50527vc8 f120488g;

    /* renamed from: h */
    public final /* synthetic */ C32835Ff7 f120489h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52527yy9(C32835Ff7 c32835Ff7, String str, int i, C50527vc8 c50527vc8) {
        super(str, i);
        this.f120489h = c32835Ff7;
        this.f120488g = c50527vc8;
    }

    @Override // p000.AbstractC52517yx9
    /* renamed from: a */
    public final int mo2182a() {
        return this.f120488g.m8349B();
    }

    @Override // p000.AbstractC52517yx9
    /* renamed from: b */
    public final boolean mo2181b() {
        return false;
    }

    @Override // p000.AbstractC52517yx9
    /* renamed from: c */
    public final boolean mo2180c() {
        return true;
    }

    /* renamed from: k */
    public final boolean m2179k(Long l, Long l2, C34096Kp8 c34096Kp8, boolean z) {
        Object[] objArr;
        Object obj;
        Bc9.m113800b();
        boolean m37502y = this.f120489h.f100966a.m89751w().m37502y(this.f120451a, C37795a98.f49957Y);
        boolean m8343H = this.f120488g.m8343H();
        boolean m8342I = this.f120488g.m8342I();
        boolean m8341J = this.f120488g.m8341J();
        if (!m8343H && !m8342I && !m8341J) {
            objArr = null;
        } else {
            objArr = 1;
        }
        Boolean bool = null;
        Integer num = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (z && objArr == null) {
            C40448ec8 m106889s = this.f120489h.f100966a.mo22258a().m106889s();
            Integer valueOf = Integer.valueOf(this.f120452b);
            if (this.f120488g.m8340K()) {
                num = Integer.valueOf(this.f120488g.m8349B());
            }
            m106889s.m42706c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", valueOf, num);
            return true;
        }
        C32323Da8 m8348C = this.f120488g.m8348C();
        boolean m110139H = m8348C.m110139H();
        if (c34096Kp8.m98243S()) {
            if (!m8348C.m110137J()) {
                this.f120489h.f100966a.mo22258a().m106888t().m42707b("No number filter for long property. property", this.f120489h.f100966a.m89786D().m17330f(c34096Kp8.m98254G()));
            } else {
                bool = AbstractC52517yx9.m2208j(AbstractC52517yx9.m2210h(c34096Kp8.m98258C(), m8348C.m110143D()), m110139H);
            }
        } else if (c34096Kp8.m98244R()) {
            if (!m8348C.m110137J()) {
                this.f120489h.f100966a.mo22258a().m106888t().m42707b("No number filter for double property. property", this.f120489h.f100966a.m89786D().m17330f(c34096Kp8.m98254G()));
            } else {
                bool = AbstractC52517yx9.m2208j(AbstractC52517yx9.m2211g(c34096Kp8.m98259B(), m8348C.m110143D()), m110139H);
            }
        } else if (c34096Kp8.m98241U()) {
            if (!m8348C.m110135M()) {
                if (!m8348C.m110137J()) {
                    this.f120489h.f100966a.mo22258a().m106888t().m42707b("No string or number filter defined. property", this.f120489h.f100966a.m89786D().m17330f(c34096Kp8.m98254G()));
                } else if (DV8.m110331N(c34096Kp8.m98253H())) {
                    bool = AbstractC52517yx9.m2208j(AbstractC52517yx9.m2209i(c34096Kp8.m98253H(), m8348C.m110143D()), m110139H);
                } else {
                    this.f120489h.f100966a.mo22258a().m106888t().m42706c("Invalid user property value for Numeric number filter. property, value", this.f120489h.f100966a.m89786D().m17330f(c34096Kp8.m98254G()), c34096Kp8.m98253H());
                }
            } else {
                bool = AbstractC52517yx9.m2208j(AbstractC52517yx9.m2212f(c34096Kp8.m98253H(), m8348C.m110142E(), this.f120489h.f100966a.mo22258a()), m110139H);
            }
        } else {
            this.f120489h.f100966a.mo22258a().m106888t().m42707b("User property has no value, property", this.f120489h.f100966a.m89786D().m17330f(c34096Kp8.m98254G()));
        }
        C40448ec8 m106889s2 = this.f120489h.f100966a.mo22258a().m106889s();
        if (bool == null) {
            obj = "null";
        } else {
            obj = bool;
        }
        m106889s2.m42707b("Property filter result", obj);
        if (bool == null) {
            return false;
        }
        this.f120453c = Boolean.TRUE;
        if (m8341J && !bool.booleanValue()) {
            return true;
        }
        if (!z || this.f120488g.m8343H()) {
            this.f120454d = bool;
        }
        if (bool.booleanValue() && objArr != null && c34096Kp8.m98242T()) {
            long m98257D = c34096Kp8.m98257D();
            if (l != null) {
                m98257D = l.longValue();
            }
            if (m37502y && this.f120488g.m8343H() && !this.f120488g.m8342I() && l2 != null) {
                m98257D = l2.longValue();
            }
            if (this.f120488g.m8342I()) {
                this.f120456f = Long.valueOf(m98257D);
            } else {
                this.f120455e = Long.valueOf(m98257D);
            }
        }
        return true;
    }
}
