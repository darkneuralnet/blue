package p000;
/* renamed from: PA1 */
/* loaded from: classes8.dex */
public class PA1 {

    /* renamed from: a */
    public int f28040a;

    /* renamed from: b */
    public int f28041b;

    public PA1(byte[] bArr) {
        this.f28040a = 0;
        if (bArr.length != 4) {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        int m91269d = C35053Os2.m91269d(bArr);
        this.f28041b = m91269d;
        if (!UX3.m81371d(m91269d)) {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        this.f28040a = UX3.m81374a(this.f28041b);
    }

    /* renamed from: i */
    public static String m90609i(int i) {
        if (i == 0) {
            return "0";
        }
        String str = ((byte) (i & 1)) == 1 ? "1" : "";
        int i2 = i >>> 1;
        int i3 = 1;
        while (i2 != 0) {
            if (((byte) (i2 & 1)) == 1) {
                str = str + "+x^" + i3;
            }
            i2 >>>= 1;
            i3++;
        }
        return str;
    }

    /* renamed from: a */
    public int m90617a(int i, int i2) {
        return i ^ i2;
    }

    /* renamed from: b */
    public String m90616b(int i) {
        StringBuilder sb;
        String str;
        String str2 = "";
        for (int i2 = 0; i2 < this.f28040a; i2++) {
            if ((((byte) i) & 1) == 0) {
                sb = new StringBuilder();
                str = "0";
            } else {
                sb = new StringBuilder();
                str = "1";
            }
            sb.append(str);
            sb.append(str2);
            str2 = sb.toString();
            i >>>= 1;
        }
        return str2;
    }

    /* renamed from: c */
    public int m90615c(int i, int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i2 < 0) {
            i = m90612f(i);
            i2 = -i2;
        }
        int i3 = 1;
        while (i2 != 0) {
            if ((i2 & 1) == 1) {
                i3 = m90610h(i3, i);
            }
            i = m90610h(i, i);
            i2 >>>= 1;
        }
        return i3;
    }

    /* renamed from: d */
    public int m90614d() {
        return this.f28040a;
    }

    /* renamed from: e */
    public byte[] m90613e() {
        return C35053Os2.m91270c(this.f28041b);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof PA1)) {
            PA1 pa1 = (PA1) obj;
            if (this.f28040a == pa1.f28040a && this.f28041b == pa1.f28041b) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public int m90612f(int i) {
        return m90615c(i, (1 << this.f28040a) - 2);
    }

    /* renamed from: g */
    public boolean m90611g(int i) {
        int i2 = this.f28040a;
        return i2 == 31 ? i >= 0 : i >= 0 && i < (1 << i2);
    }

    /* renamed from: h */
    public int m90610h(int i, int i2) {
        return UX3.m81370e(i, i2, this.f28041b);
    }

    public int hashCode() {
        return this.f28041b;
    }

    public String toString() {
        return "Finite Field GF(2^" + this.f28040a + ") = GF(2)[X]/<" + m90609i(this.f28041b) + "> ";
    }
}
