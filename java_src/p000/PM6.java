package p000;

import android.support.annotation.Nullable;
/* renamed from: PM6 */
/* loaded from: classes6.dex */
public final class PM6 {

    /* renamed from: a */
    public final int f28350a;

    /* renamed from: b */
    public final String f28351b;

    /* renamed from: c */
    public final long f28352c;

    /* renamed from: d */
    public final long f28353d;

    /* renamed from: e */
    public final int f28354e;

    public PM6() {
    }

    public PM6(int i, @Nullable String str, long j, long j2, int i2) {
        this();
        this.f28350a = i;
        this.f28351b = str;
        this.f28352c = j;
        this.f28353d = j2;
        this.f28354e = i2;
    }

    /* renamed from: a */
    public int m90374a() {
        return this.f28350a;
    }

    @Nullable
    /* renamed from: b */
    public String m90373b() {
        return this.f28351b;
    }

    /* renamed from: c */
    public long m90372c() {
        return this.f28352c;
    }

    /* renamed from: d */
    public long m90371d() {
        return this.f28353d;
    }

    /* renamed from: e */
    public int m90370e() {
        return this.f28354e;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof PM6) {
            PM6 pm6 = (PM6) obj;
            if (this.f28350a == pm6.m90374a() && ((str = this.f28351b) != null ? str.equals(pm6.m90373b()) : pm6.m90373b() == null) && this.f28352c == pm6.m90372c() && this.f28353d == pm6.m90371d() && this.f28354e == pm6.m90370e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = (this.f28350a ^ 1000003) * 1000003;
        String str = this.f28351b;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f28352c;
        long j2 = this.f28353d;
        return ((((((i ^ hashCode) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f28354e;
    }

    public String toString() {
        int i = this.f28350a;
        String str = this.f28351b;
        long j = this.f28352c;
        long j2 = this.f28353d;
        int i2 = this.f28354e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 157);
        sb.append("SliceCheckpoint{fileExtractionStatus=");
        sb.append(i);
        sb.append(", filePath=");
        sb.append(str);
        sb.append(", fileOffset=");
        sb.append(j);
        sb.append(", remainingBytes=");
        sb.append(j2);
        sb.append(", previousChunk=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
