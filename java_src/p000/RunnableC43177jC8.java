package p000;
/* renamed from: jC8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC43177jC8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ boolean f92286b;

    /* renamed from: c */
    public final /* synthetic */ RC8 f92287c;

    public RunnableC43177jC8(RC8 rc8, boolean z) {
        this.f92287c = rc8;
        this.f92286b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean m89762l = this.f92287c.f100966a.m89762l();
        boolean m89763k = this.f92287c.f100966a.m89763k();
        this.f92287c.f100966a.m89766h(this.f92286b);
        if (m89763k == this.f92286b) {
            this.f92287c.f100966a.mo22258a().m106889s().m42707b("Default data collection state already set to", Boolean.valueOf(this.f92286b));
        }
        if (this.f92287c.f100966a.m89762l() == m89762l || this.f92287c.f100966a.m89762l() != this.f92287c.f100966a.m89763k()) {
            this.f92287c.f100966a.mo22258a().m106887u().m42706c("Default data collection is different than actual status", Boolean.valueOf(this.f92286b), Boolean.valueOf(m89762l));
        }
        this.f92287c.m87180P();
    }
}
