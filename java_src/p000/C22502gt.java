package p000;
/* renamed from: gt */
/* loaded from: classes.dex */
public final class C22502gt extends AbstractC2954Gp {

    /* renamed from: b */
    public final int f84401b;

    /* renamed from: c */
    public final Throwable f84402c;

    public C22502gt(int i, Throwable th) {
        this.f84401b = i;
        this.f84402c = th;
    }

    @Override // p000.AbstractC2954Gp
    /* renamed from: a */
    public int mo37368a() {
        return this.f84401b;
    }

    @Override // p000.AbstractC2954Gp
    /* renamed from: b */
    public Throwable mo37367b() {
        return this.f84402c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2954Gp)) {
            return false;
        }
        AbstractC2954Gp abstractC2954Gp = (AbstractC2954Gp) obj;
        if (this.f84401b == abstractC2954Gp.mo37368a()) {
            Throwable th = this.f84402c;
            if (th == null) {
                if (abstractC2954Gp.mo37367b() == null) {
                    return true;
                }
            } else if (th.equals(abstractC2954Gp.mo37367b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i = (this.f84401b ^ 1000003) * 1000003;
        Throwable th = this.f84402c;
        if (th == null) {
            hashCode = 0;
        } else {
            hashCode = th.hashCode();
        }
        return i ^ hashCode;
    }

    public String toString() {
        return "AudioStats{audioState=" + this.f84401b + ", errorCause=" + this.f84402c + "}";
    }
}
