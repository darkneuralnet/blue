package p000;
/* renamed from: xL8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC51558xL8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ V98 f117444b;

    /* renamed from: c */
    public final /* synthetic */ EM8 f117445c;

    public RunnableC51558xL8(EM8 em8, V98 v98) {
        this.f117445c = em8;
        this.f117444b = v98;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f117445c) {
            this.f117445c.f7355b = false;
            if (!this.f117445c.f7357d.m88546w()) {
                this.f117445c.f7357d.f100966a.mo22258a().m106889s().m42708a("Connected to service");
                this.f117445c.f7357d.m88548u(this.f117444b);
            }
        }
    }
}
