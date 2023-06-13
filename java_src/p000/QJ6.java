package p000;
/* renamed from: QJ6 */
/* loaded from: classes6.dex */
public final class QJ6 extends X42 {

    /* renamed from: a */
    public final int f30208a;

    /* renamed from: b */
    public final long f30209b;

    /* renamed from: c */
    public final long f30210c;

    /* renamed from: d */
    public final int f30211d;

    /* renamed from: e */
    public final String f30212e;

    public QJ6(int i, long j, long j2, int i2, String str) {
        this.f30208a = i;
        this.f30209b = j;
        this.f30210c = j2;
        this.f30211d = i2;
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.f30212e = str;
    }

    @Override // p000.X42
    /* renamed from: b */
    public final long mo77438b() {
        return this.f30209b;
    }

    @Override // p000.X42
    /* renamed from: c */
    public final int mo77437c() {
        return this.f30211d;
    }

    @Override // p000.X42
    /* renamed from: d */
    public final int mo77436d() {
        return this.f30208a;
    }

    @Override // p000.X42
    /* renamed from: e */
    public final String mo77435e() {
        return this.f30212e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof X42) {
            X42 x42 = (X42) obj;
            if (this.f30208a == x42.mo77436d() && this.f30209b == x42.mo77438b() && this.f30210c == x42.mo77434f() && this.f30211d == x42.mo77437c() && this.f30212e.equals(x42.mo77435e())) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.X42
    /* renamed from: f */
    public final long mo77434f() {
        return this.f30210c;
    }

    public final int hashCode() {
        int i = this.f30208a;
        long j = this.f30209b;
        long j2 = this.f30210c;
        return ((((((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f30211d) * 1000003) ^ this.f30212e.hashCode();
    }

    public final String toString() {
        int i = this.f30208a;
        long j = this.f30209b;
        long j2 = this.f30210c;
        int i2 = this.f30211d;
        String str = this.f30212e;
        StringBuilder sb = new StringBuilder(str.length() + 164);
        sb.append("InstallState{installStatus=");
        sb.append(i);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", installErrorCode=");
        sb.append(i2);
        sb.append(", packageName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
