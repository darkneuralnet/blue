package p000;

import p000.AbstractC9547Xv;
/* renamed from: jt */
/* loaded from: classes5.dex */
public final class C25036jt extends AbstractC9547Xv {

    /* renamed from: a */
    public final AbstractC9547Xv.EnumC9548a f93499a;

    /* renamed from: b */
    public final long f93500b;

    public C25036jt(AbstractC9547Xv.EnumC9548a enumC9548a, long j) {
        if (enumC9548a != null) {
            this.f93499a = enumC9548a;
            this.f93500b = j;
            return;
        }
        throw new NullPointerException("Null status");
    }

    @Override // p000.AbstractC9547Xv
    /* renamed from: b */
    public long mo29794b() {
        return this.f93500b;
    }

    @Override // p000.AbstractC9547Xv
    /* renamed from: c */
    public AbstractC9547Xv.EnumC9548a mo29793c() {
        return this.f93499a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC9547Xv)) {
            return false;
        }
        AbstractC9547Xv abstractC9547Xv = (AbstractC9547Xv) obj;
        if (this.f93499a.equals(abstractC9547Xv.mo29793c()) && this.f93500b == abstractC9547Xv.mo29794b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f93500b;
        return ((this.f93499a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f93499a + ", nextRequestWaitMillis=" + this.f93500b + "}";
    }
}
