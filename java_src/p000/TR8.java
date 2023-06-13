package p000;
/* renamed from: TR8 */
/* loaded from: classes6.dex */
public abstract class TR8 extends IR8 {

    /* renamed from: c */
    public boolean f35472c;

    public TR8(C42162hV8 c42162hV8) {
        super(c42162hV8);
        this.f15489b.m36272o();
    }

    /* renamed from: f */
    public final void m83601f() {
        if (!m83599h()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: g */
    public final void m83600g() {
        if (!this.f35472c) {
            mo11655i();
            this.f15489b.m36280j();
            this.f35472c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* renamed from: h */
    public final boolean m83599h() {
        return this.f35472c;
    }

    /* renamed from: i */
    public abstract boolean mo11655i();
}
