package p000;
/* renamed from: hR3  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C42121hR3 {

    /* renamed from: a */
    public int[] f85215a;

    public C42121hR3(byte[] bArr) {
        if (bArr.length <= 4) {
            throw new IllegalArgumentException("invalid encoding");
        }
        int m91268e = C35053Os2.m91268e(bArr, 0);
        int m95835a = M52.m95835a(m91268e - 1);
        if (bArr.length != (m91268e * m95835a) + 4) {
            throw new IllegalArgumentException("invalid encoding");
        }
        this.f85215a = new int[m91268e];
        for (int i = 0; i < m91268e; i++) {
            this.f85215a[i] = C35053Os2.m91267f(bArr, (i * m95835a) + 4, m95835a);
        }
        if (!m36399b(this.f85215a)) {
            throw new IllegalArgumentException("invalid encoding");
        }
    }

    /* renamed from: a */
    public byte[] m36400a() {
        int length = this.f85215a.length;
        int m95835a = M52.m95835a(length - 1);
        byte[] bArr = new byte[(length * m95835a) + 4];
        C35053Os2.m91272a(length, bArr, 0);
        for (int i = 0; i < length; i++) {
            C35053Os2.m91271b(this.f85215a[i], bArr, (i * m95835a) + 4, m95835a);
        }
        return bArr;
    }

    /* renamed from: b */
    public final boolean m36399b(int[] iArr) {
        int length = iArr.length;
        boolean[] zArr = new boolean[length];
        for (int i : iArr) {
            if (i < 0 || i >= length || zArr[i]) {
                return false;
            }
            zArr[i] = true;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C42121hR3) {
            return K52.m99250b(this.f85215a, ((C42121hR3) obj).f85215a);
        }
        return false;
    }

    public int hashCode() {
        return C0210Ao.m115241n(this.f85215a);
    }

    public String toString() {
        String str = "[" + this.f85215a[0];
        for (int i = 1; i < this.f85215a.length; i++) {
            str = str + ", " + this.f85215a[i];
        }
        return str + "]";
    }
}
