package p000;

import java.util.Arrays;
/* renamed from: Q70 */
/* loaded from: classes6.dex */
public final class Q70 {

    /* renamed from: a */
    public final byte[] f29848a;

    public Q70(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.f29848a = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }

    /* renamed from: a */
    public static Q70 m88906a(byte[] bArr) {
        if (bArr != null) {
            return m88905b(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    /* renamed from: b */
    public static Q70 m88905b(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            return new Q70(bArr, i, i2);
        }
        throw new NullPointerException("data must be non-null");
    }

    /* renamed from: c */
    public int m88904c() {
        return this.f29848a.length;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Q70)) {
            return false;
        }
        return Arrays.equals(((Q70) obj).f29848a, this.f29848a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f29848a);
    }

    public String toString() {
        return "Bytes(" + ML1.m95434b(this.f29848a) + ")";
    }
}
