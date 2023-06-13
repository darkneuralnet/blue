package p000;
/* renamed from: VL8 */
/* loaded from: classes6.dex */
public final class VL8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ V98 f38894b;

    /* renamed from: c */
    public final /* synthetic */ EM8 f38895c;

    public VL8(EM8 em8, V98 v98) {
        this.f38895c = em8;
        this.f38894b = v98;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f38895c) {
            this.f38895c.f7355b = false;
            if (!this.f38895c.f7357d.m88546w()) {
                this.f38895c.f7357d.f100966a.mo22258a().m106894n().m42708a("Connected to remote service");
                this.f38895c.f7357d.m88548u(this.f38894b);
            }
        }
    }
}
