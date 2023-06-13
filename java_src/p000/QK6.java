package p000;
/* renamed from: QK6 */
/* loaded from: classes6.dex */
public final class QK6 extends AbstractC7546So {

    /* renamed from: a */
    public final String f30217a;

    /* renamed from: b */
    public final int f30218b;

    /* renamed from: c */
    public final int f30219c;

    /* renamed from: d */
    public final long f30220d;

    /* renamed from: e */
    public final long f30221e;

    /* renamed from: f */
    public final int f30222f;

    /* renamed from: g */
    public final int f30223g;

    /* renamed from: h */
    public final String f30224h;

    public QK6(String str, int i, int i2, long j, long j2, int i3, int i4, String str2) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f30217a = str;
        this.f30218b = i;
        this.f30219c = i2;
        this.f30220d = j;
        this.f30221e = j2;
        this.f30222f = i3;
        this.f30223g = i4;
        if (str2 == null) {
            throw new NullPointerException("Null versionTag");
        }
        this.f30224h = str2;
    }

    @Override // p000.AbstractC7546So
    /* renamed from: a */
    public final int mo84823a() {
        return this.f30223g;
    }

    @Override // p000.AbstractC7546So
    /* renamed from: b */
    public final String mo84822b() {
        return this.f30224h;
    }

    @Override // p000.AbstractC7546So
    /* renamed from: c */
    public final long mo84821c() {
        return this.f30220d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7546So) {
            AbstractC7546So abstractC7546So = (AbstractC7546So) obj;
            if (this.f30217a.equals(abstractC7546So.mo84817g()) && this.f30218b == abstractC7546So.mo84816h() && this.f30219c == abstractC7546So.mo84818f() && this.f30220d == abstractC7546So.mo84821c() && this.f30221e == abstractC7546So.mo84815i() && this.f30222f == abstractC7546So.mo84814j() && this.f30223g == abstractC7546So.mo84823a() && this.f30224h.equals(abstractC7546So.mo84822b())) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.AbstractC7546So
    /* renamed from: f */
    public final int mo84818f() {
        return this.f30219c;
    }

    @Override // p000.AbstractC7546So
    /* renamed from: g */
    public final String mo84817g() {
        return this.f30217a;
    }

    @Override // p000.AbstractC7546So
    /* renamed from: h */
    public final int mo84816h() {
        return this.f30218b;
    }

    public final int hashCode() {
        int hashCode = this.f30217a.hashCode();
        int i = this.f30218b;
        int i2 = this.f30219c;
        long j = this.f30220d;
        long j2 = this.f30221e;
        return ((((((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f30222f) * 1000003) ^ this.f30223g) * 1000003) ^ this.f30224h.hashCode();
    }

    @Override // p000.AbstractC7546So
    /* renamed from: i */
    public final long mo84815i() {
        return this.f30221e;
    }

    @Override // p000.AbstractC7546So
    /* renamed from: j */
    public final int mo84814j() {
        return this.f30222f;
    }

    public final String toString() {
        String str = this.f30217a;
        int i = this.f30218b;
        int i2 = this.f30219c;
        long j = this.f30220d;
        long j2 = this.f30221e;
        int i3 = this.f30222f;
        int i4 = this.f30223g;
        String str2 = this.f30224h;
        StringBuilder sb = new StringBuilder(str.length() + 230 + str2.length());
        sb.append("AssetPackState{name=");
        sb.append(str);
        sb.append(", status=");
        sb.append(i);
        sb.append(", errorCode=");
        sb.append(i2);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", transferProgressPercentage=");
        sb.append(i3);
        sb.append(", updateAvailability=");
        sb.append(i4);
        sb.append(", versionTag=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
