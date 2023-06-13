package p000;

import java.math.RoundingMode;
import java.util.Arrays;
/* renamed from: k09  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C43653k09 {

    /* renamed from: a */
    public final String f93758a;

    /* renamed from: b */
    public final char[] f93759b;

    /* renamed from: c */
    public final int f93760c;

    /* renamed from: d */
    public final int f93761d;

    /* renamed from: e */
    public final int f93762e;

    /* renamed from: f */
    public final int f93763f;

    /* renamed from: g */
    public final byte[] f93764g;

    public C43653k09(String str, char[] cArr) {
        String str2;
        boolean z;
        str.getClass();
        this.f93758a = str;
        cArr.getClass();
        this.f93759b = cArr;
        try {
            int length = cArr.length;
            int m103050b = I19.m103050b(length, RoundingMode.UNNECESSARY);
            this.f93761d = m103050b;
            int min = Math.min(8, Integer.lowestOneBit(m103050b));
            try {
                this.f93762e = 8 / min;
                this.f93763f = m103050b / min;
                this.f93760c = length - 1;
                byte[] bArr = new byte[128];
                Arrays.fill(bArr, (byte) -1);
                int i = 0;
                while (true) {
                    boolean z2 = true;
                    if (i >= cArr.length) {
                        break;
                    }
                    char c = cArr[i];
                    if (c < 128) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C52142yK8.m3659f(z, "Non-ASCII character: %s", c);
                    if (bArr[c] != -1) {
                        z2 = false;
                    }
                    C52142yK8.m3659f(z2, "Duplicate character: %s", c);
                    bArr[c] = (byte) i;
                    i++;
                }
                this.f93764g = bArr;
                boolean[] zArr = new boolean[this.f93762e];
                for (int i2 = 0; i2 < this.f93763f; i2++) {
                    zArr[I19.m103051a(i2 * 8, this.f93761d, RoundingMode.CEILING)] = true;
                }
            } catch (ArithmeticException e) {
                String str3 = new String(cArr);
                if (str3.length() != 0) {
                    str2 = "Illegal alphabet ".concat(str3);
                } else {
                    str2 = new String("Illegal alphabet ");
                }
                throw new IllegalArgumentException(str2, e);
            }
        } catch (ArithmeticException e2) {
            int length2 = cArr.length;
            StringBuilder sb = new StringBuilder(35);
            sb.append("Illegal alphabet length ");
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString(), e2);
        }
    }

    /* renamed from: a */
    public final char m29479a(int i) {
        return this.f93759b[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* renamed from: b */
    public final C43653k09 m29478b() {
        boolean z;
        int i = 0;
        for (char c : this.f93759b) {
            if (MF8.m95466a(c)) {
                char[] cArr = this.f93759b;
                int length = cArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        char c2 = cArr[i2];
                        if (c2 >= 'a' && c2 <= 'z') {
                            z = true;
                            break;
                        }
                        i2++;
                    } else {
                        z = false;
                        break;
                    }
                }
                C52142yK8.m3655j(!z, "Cannot call lowerCase() on a mixed-case alphabet");
                char[] cArr2 = new char[this.f93759b.length];
                while (true) {
                    char[] cArr3 = this.f93759b;
                    if (i < cArr3.length) {
                        char c3 = cArr3[i];
                        if (MF8.m95466a(c3)) {
                            c3 ^= 32;
                        }
                        cArr2[i] = (char) c3;
                        i++;
                    } else {
                        return new C43653k09(String.valueOf(this.f93758a).concat(".lowerCase()"), cArr2);
                    }
                }
            }
        }
        return this;
    }

    /* renamed from: c */
    public final boolean m29477c(char c) {
        return c < 128 && this.f93764g[c] != -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C43653k09) {
            return Arrays.equals(this.f93759b, ((C43653k09) obj).f93759b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f93759b);
    }

    public final String toString() {
        return this.f93758a;
    }
}
