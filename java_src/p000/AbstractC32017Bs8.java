package p000;
/* renamed from: Bs8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC32017Bs8 extends C45945ns8 {

    /* renamed from: b */
    public boolean f2989b;

    public AbstractC32017Bs8(C35248Pn8 c35248Pn8) {
        super(c35248Pn8);
        this.f100966a.m89768f();
    }

    /* renamed from: f */
    public void mo92073f() {
    }

    /* renamed from: g */
    public abstract boolean mo43707g();

    /* renamed from: h */
    public final void m113419h() {
        if (!m113416k()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: i */
    public final void m113418i() {
        if (!this.f2989b) {
            if (!mo43707g()) {
                this.f100966a.m89770d();
                this.f2989b = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* renamed from: j */
    public final void m113417j() {
        if (!this.f2989b) {
            mo92073f();
            this.f100966a.m89770d();
            this.f2989b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* renamed from: k */
    public final boolean m113416k() {
        return this.f2989b;
    }
}
