package p000;
/* renamed from: we8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC51140we8 extends C46677p68 {

    /* renamed from: b */
    public boolean f116311b;

    public AbstractC51140we8(C35248Pn8 c35248Pn8) {
        super(c35248Pn8);
        this.f100966a.m89768f();
    }

    /* renamed from: f */
    public final void m6551f() {
        if (!m6547j()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: g */
    public final void m6550g() {
        if (!this.f116311b) {
            if (!mo6546k()) {
                this.f100966a.m89770d();
                this.f116311b = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* renamed from: h */
    public final void m6549h() {
        if (!this.f116311b) {
            mo6548i();
            this.f100966a.m89770d();
            this.f116311b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* renamed from: i */
    public void mo6548i() {
    }

    /* renamed from: j */
    public final boolean m6547j() {
        return this.f116311b;
    }

    /* renamed from: k */
    public abstract boolean mo6546k();
}
