package p000;
/* renamed from: fu */
/* loaded from: classes6.dex */
public final class C20619fu extends AbstractC46849pP5 {

    /* renamed from: a */
    public final long f81008a;

    /* renamed from: b */
    public final long f81009b;

    /* renamed from: c */
    public final long f81010c;

    public C20619fu(long j, long j2, long j3) {
        this.f81008a = j;
        this.f81009b = j2;
        this.f81010c = j3;
    }

    @Override // p000.AbstractC46849pP5
    /* renamed from: b */
    public long mo19335b() {
        return this.f81009b;
    }

    @Override // p000.AbstractC46849pP5
    /* renamed from: c */
    public long mo19334c() {
        return this.f81008a;
    }

    @Override // p000.AbstractC46849pP5
    /* renamed from: d */
    public long mo19333d() {
        return this.f81010c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC46849pP5)) {
            return false;
        }
        AbstractC46849pP5 abstractC46849pP5 = (AbstractC46849pP5) obj;
        if (this.f81008a == abstractC46849pP5.mo19334c() && this.f81009b == abstractC46849pP5.mo19335b() && this.f81010c == abstractC46849pP5.mo19333d()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f81008a;
        long j2 = this.f81009b;
        long j3 = this.f81010c;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f81008a + ", elapsedRealtime=" + this.f81009b + ", uptimeMillis=" + this.f81010c + "}";
    }
}
