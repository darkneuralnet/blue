package p000;
/* renamed from: Nt */
/* loaded from: classes5.dex */
public final class C5732Nt extends AbstractC28071rx2 {

    /* renamed from: a */
    public final long f25334a;

    public C5732Nt(long j) {
        this.f25334a = j;
    }

    @Override // p000.AbstractC28071rx2
    /* renamed from: c */
    public long mo14984c() {
        return this.f25334a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC28071rx2) && this.f25334a == ((AbstractC28071rx2) obj).mo14984c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f25334a;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f25334a + "}";
    }
}
