package p000;
/* renamed from: bs7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC38811bs7 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ InterfaceC35527Qs8 f59677b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC36228Ts7 f59678c;

    public RunnableC38811bs7(AbstractC36228Ts7 abstractC36228Ts7, InterfaceC35527Qs8 interfaceC35527Qs8) {
        this.f59678c = abstractC36228Ts7;
        this.f59677b = interfaceC35527Qs8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f59677b.mo22259C();
        if (C32844Fg7.m106751a()) {
            this.f59677b.mo22257c().m43695w(this);
            return;
        }
        boolean m82318e = this.f59678c.m82318e();
        this.f59678c.f36387c = 0L;
        if (m82318e) {
            this.f59678c.mo6826c();
        }
    }
}
