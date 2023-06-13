package p000;

import kotlin.UByte;
/* renamed from: TX3 */
/* loaded from: classes8.dex */
public class TX3 {

    /* renamed from: a */
    public PA1 f35637a;

    /* renamed from: b */
    public int f35638b;

    /* renamed from: c */
    public int[] f35639c;

    public TX3(PA1 pa1, int i) {
        this.f35637a = pa1;
        this.f35638b = i;
        int[] iArr = new int[i + 1];
        this.f35639c = iArr;
        iArr[i] = 1;
    }

    /* renamed from: c */
    public static int m83441c(int[] iArr) {
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        return length;
    }

    /* renamed from: i */
    public static int m83435i(int[] iArr) {
        int m83441c = m83441c(iArr);
        if (m83441c == -1) {
            return 0;
        }
        return iArr[m83441c];
    }

    /* renamed from: j */
    public static boolean m83434j(int[] iArr, int[] iArr2) {
        int m83441c = m83441c(iArr);
        if (m83441c != m83441c(iArr2)) {
            return false;
        }
        for (int i = 0; i <= m83441c; i++) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p */
    public static int[] m83428p(int[] iArr, int i) {
        int m83441c = m83441c(iArr);
        if (m83441c == -1) {
            return new int[1];
        }
        int[] iArr2 = new int[m83441c + i + 1];
        System.arraycopy(iArr, 0, iArr2, i, m83441c + 1);
        return iArr2;
    }

    /* renamed from: q */
    public static int[] m83427q(int[] iArr) {
        int m83441c = m83441c(iArr);
        if (m83441c == -1) {
            return new int[1];
        }
        int i = m83441c + 1;
        if (iArr.length == i) {
            return K52.m99251a(iArr);
        }
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        return iArr2;
    }

    /* renamed from: a */
    public final int[] m83443a(int[] iArr, int[] iArr2) {
        int[] iArr3;
        if (iArr.length < iArr2.length) {
            iArr3 = new int[iArr2.length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
        } else {
            iArr3 = new int[iArr.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            iArr = iArr2;
        }
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr3[length] = this.f35637a.m90617a(iArr3[length], iArr[length]);
        }
        return iArr3;
    }

    /* renamed from: b */
    public void m83442b(TX3 tx3) {
        this.f35639c = m83443a(this.f35639c, tx3.f35639c);
        m83440d();
    }

    /* renamed from: d */
    public final void m83440d() {
        int length = this.f35639c.length;
        do {
            this.f35638b = length - 1;
            length = this.f35638b;
            if (length < 0) {
                return;
            }
        } while (this.f35639c[length] == 0);
    }

    /* renamed from: e */
    public int m83439e(int i) {
        int[] iArr = this.f35639c;
        int i2 = this.f35638b;
        int i3 = iArr[i2];
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            i3 = this.f35637a.m90610h(i3, i) ^ this.f35639c[i4];
        }
        return i3;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof TX3)) {
            TX3 tx3 = (TX3) obj;
            if (this.f35637a.equals(tx3.f35637a) && this.f35638b == tx3.f35638b && m83434j(this.f35639c, tx3.f35639c)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public int m83438f(int i) {
        if (i < 0 || i > this.f35638b) {
            return 0;
        }
        return this.f35639c[i];
    }

    /* renamed from: g */
    public int m83437g() {
        int[] iArr = this.f35639c;
        int length = iArr.length - 1;
        if (iArr[length] == 0) {
            return -1;
        }
        return length;
    }

    /* renamed from: h */
    public byte[] m83436h() {
        int i = 8;
        int i2 = 1;
        while (this.f35637a.m90614d() > i) {
            i2++;
            i += 8;
        }
        byte[] bArr = new byte[this.f35639c.length * i2];
        int i3 = 0;
        for (int i4 = 0; i4 < this.f35639c.length; i4++) {
            int i5 = 0;
            while (i5 < i) {
                bArr[i3] = (byte) (this.f35639c[i4] >>> i5);
                i5 += 8;
                i3++;
            }
        }
        return bArr;
    }

    public int hashCode() {
        int hashCode = this.f35637a.hashCode();
        int i = 0;
        while (true) {
            int[] iArr = this.f35639c;
            if (i >= iArr.length) {
                return hashCode;
            }
            hashCode = (hashCode * 31) + iArr[i];
            i++;
        }
    }

    /* renamed from: k */
    public TX3 m83433k(TX3 tx3) {
        return new TX3(this.f35637a, m83432l(this.f35639c, tx3.f35639c));
    }

    /* renamed from: l */
    public final int[] m83432l(int[] iArr, int[] iArr2) {
        int m83441c = m83441c(iArr2);
        if (m83441c != -1) {
            int length = iArr.length;
            int[] iArr3 = new int[length];
            int m90612f = this.f35637a.m90612f(m83435i(iArr2));
            System.arraycopy(iArr, 0, iArr3, 0, length);
            while (m83441c <= m83441c(iArr3)) {
                iArr3 = m83443a(m83429o(m83428p(iArr2, m83441c(iArr3) - m83441c), this.f35637a.m90610h(m83435i(iArr3), m90612f)), iArr3);
            }
            return iArr3;
        }
        throw new ArithmeticException("Division by zero");
    }

    /* renamed from: m */
    public void m83431m(int i) {
        if (!this.f35637a.m90611g(i)) {
            throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
        }
        this.f35639c = m83429o(this.f35639c, i);
        m83440d();
    }

    /* renamed from: n */
    public TX3 m83430n(int i) {
        if (this.f35637a.m90611g(i)) {
            return new TX3(this.f35637a, m83429o(this.f35639c, i));
        }
        throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
    }

    /* renamed from: o */
    public final int[] m83429o(int[] iArr, int i) {
        int m83441c = m83441c(iArr);
        if (m83441c == -1 || i == 0) {
            return new int[1];
        }
        if (i == 1) {
            return K52.m99251a(iArr);
        }
        int[] iArr2 = new int[m83441c + 1];
        while (m83441c >= 0) {
            iArr2[m83441c] = this.f35637a.m90610h(iArr[m83441c], i);
            m83441c--;
        }
        return iArr2;
    }

    public String toString() {
        String str = " Polynomial over " + this.f35637a.toString() + ": \n";
        for (int i = 0; i < this.f35639c.length; i++) {
            str = str + this.f35637a.m90616b(this.f35639c[i]) + "Y^" + i + "+";
        }
        return str + ";";
    }

    public TX3(PA1 pa1, byte[] bArr) {
        this.f35637a = pa1;
        int i = 8;
        int i2 = 1;
        while (pa1.m90614d() > i) {
            i2++;
            i += 8;
        }
        if (bArr.length % i2 != 0) {
            throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
        }
        this.f35639c = new int[bArr.length / i2];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = this.f35639c;
            if (i3 >= iArr.length) {
                if (iArr.length != 1 && iArr[iArr.length - 1] == 0) {
                    throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
                }
                m83440d();
                return;
            }
            int i5 = 0;
            while (i5 < i) {
                int[] iArr2 = this.f35639c;
                iArr2[i3] = ((bArr[i4] & UByte.MAX_VALUE) << i5) ^ iArr2[i3];
                i5 += 8;
                i4++;
            }
            if (!this.f35637a.m90611g(this.f35639c[i3])) {
                throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
            }
            i3++;
        }
    }

    public TX3(PA1 pa1, int[] iArr) {
        this.f35637a = pa1;
        this.f35639c = m83427q(iArr);
        m83440d();
    }

    public TX3(TX3 tx3) {
        this.f35637a = tx3.f35637a;
        this.f35638b = tx3.f35638b;
        this.f35639c = K52.m99251a(tx3.f35639c);
    }
}
