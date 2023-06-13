package p000;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: Ao */
/* loaded from: classes8.dex */
public final class C0210Ao {

    /* renamed from: Ao$a */
    /* loaded from: classes8.dex */
    public static class C0211a<T> implements Iterator<T> {

        /* renamed from: b */
        public final T[] f1089b;

        /* renamed from: c */
        public int f1090c = 0;

        public C0211a(T[] tArr) {
            this.f1089b = tArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1090c < this.f1089b.length;
        }

        @Override // java.util.Iterator
        public T next() {
            int i = this.f1090c;
            T[] tArr = this.f1089b;
            if (i != tArr.length) {
                this.f1090c = i + 1;
                return tArr[i];
            }
            throw new NoSuchElementException("Out of elements: " + this.f1090c);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }
    }

    private C0210Ao() {
    }

    /* renamed from: a */
    public static boolean m115254a(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    /* renamed from: b */
    public static boolean m115253b(char[] cArr, char[] cArr2) {
        return Arrays.equals(cArr, cArr2);
    }

    /* renamed from: c */
    public static boolean m115252c(short[] sArr, short[] sArr2) {
        return Arrays.equals(sArr, sArr2);
    }

    /* renamed from: d */
    public static byte[] m115251d(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    /* renamed from: e */
    public static short[] m115250e(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        return (short[]) sArr.clone();
    }

    /* renamed from: f */
    public static byte[] m115249f(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return m115251d(bArr2);
        }
        if (bArr2 == null) {
            return m115251d(bArr);
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    /* renamed from: g */
    public static boolean m115248g(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return false;
        }
        if (bArr == bArr2) {
            return true;
        }
        int length = bArr.length < bArr2.length ? bArr.length : bArr2.length;
        int length2 = bArr.length ^ bArr2.length;
        for (int i = 0; i != length; i++) {
            length2 |= bArr[i] ^ bArr2[i];
        }
        while (length < bArr2.length) {
            byte b = bArr2[length];
            length2 |= b ^ (~b);
            length++;
        }
        return length2 == 0;
    }

    /* renamed from: h */
    public static byte[] m115247h(byte[] bArr, int i, int i2) {
        int m115245j = m115245j(i, i2);
        byte[] bArr2 = new byte[m115245j];
        System.arraycopy(bArr, i, bArr2, 0, Math.min(bArr.length - i, m115245j));
        return bArr2;
    }

    /* renamed from: i */
    public static void m115246i(byte[] bArr, byte b) {
        Arrays.fill(bArr, b);
    }

    /* renamed from: j */
    public static int m115245j(int i, int i2) {
        int i3 = i2 - i;
        if (i3 >= 0) {
            return i3;
        }
        StringBuffer stringBuffer = new StringBuffer(i);
        stringBuffer.append(" > ");
        stringBuffer.append(i2);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    /* renamed from: k */
    public static int m115244k(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ bArr[length];
        }
    }

    /* renamed from: l */
    public static int m115243l(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return 0;
        }
        int i3 = i2 + 1;
        while (true) {
            i2--;
            if (i2 < 0) {
                return i3;
            }
            i3 = (i3 * 257) ^ bArr[i + i2];
        }
    }

    /* renamed from: m */
    public static int m115242m(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ cArr[length];
        }
    }

    /* renamed from: n */
    public static int m115241n(int[] iArr) {
        if (iArr == null) {
            return 0;
        }
        int length = iArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ iArr[length];
        }
    }

    /* renamed from: o */
    public static int m115240o(short[] sArr) {
        if (sArr == null) {
            return 0;
        }
        int length = sArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ (sArr[length] & 255);
        }
    }

    /* renamed from: p */
    public static int m115239p(short[][] sArr) {
        int i = 0;
        for (int i2 = 0; i2 != sArr.length; i2++) {
            i = (i * 257) + m115240o(sArr[i2]);
        }
        return i;
    }

    /* renamed from: q */
    public static int m115238q(short[][][] sArr) {
        int i = 0;
        for (int i2 = 0; i2 != sArr.length; i2++) {
            i = (i * 257) + m115239p(sArr[i2]);
        }
        return i;
    }
}
