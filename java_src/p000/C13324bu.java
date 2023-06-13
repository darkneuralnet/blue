package p000;
/* renamed from: bu */
/* loaded from: classes.dex */
public final class C13324bu extends AbstractC34821Ns4 {

    /* renamed from: a */
    public final long f59725a;

    /* renamed from: b */
    public final long f59726b;

    /* renamed from: c */
    public final AbstractC2954Gp f59727c;

    public C13324bu(long j, long j2, AbstractC2954Gp abstractC2954Gp) {
        this.f59725a = j;
        this.f59726b = j2;
        if (abstractC2954Gp != null) {
            this.f59727c = abstractC2954Gp;
            return;
        }
        throw new NullPointerException("Null audioStats");
    }

    @Override // p000.AbstractC34821Ns4
    /* renamed from: a */
    public AbstractC2954Gp mo62170a() {
        return this.f59727c;
    }

    @Override // p000.AbstractC34821Ns4
    /* renamed from: b */
    public long mo62169b() {
        return this.f59726b;
    }

    @Override // p000.AbstractC34821Ns4
    /* renamed from: c */
    public long mo62168c() {
        return this.f59725a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC34821Ns4)) {
            return false;
        }
        AbstractC34821Ns4 abstractC34821Ns4 = (AbstractC34821Ns4) obj;
        if (this.f59725a == abstractC34821Ns4.mo62168c() && this.f59726b == abstractC34821Ns4.mo62169b() && this.f59727c.equals(abstractC34821Ns4.mo62170a())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f59725a;
        long j2 = this.f59726b;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f59727c.hashCode();
    }

    public String toString() {
        return "RecordingStats{recordedDurationNanos=" + this.f59725a + ", numBytesRecorded=" + this.f59726b + ", audioStats=" + this.f59727c + "}";
    }
}
