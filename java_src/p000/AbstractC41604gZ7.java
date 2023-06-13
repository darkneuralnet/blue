package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
/* renamed from: gZ7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC41604gZ7 implements Iterable, Serializable {

    /* renamed from: c */
    public static final AbstractC41604gZ7 f82424c = new C46330oX7(C32791Fa8.f9739d);

    /* renamed from: d */
    public static final Comparator f82425d;

    /* renamed from: e */
    public static final RY7 f82426e;

    /* renamed from: b */
    public int f82427b = 0;

    static {
        int i = C49267tU7.f110543a;
        f82426e = new RY7(null);
        f82425d = new WV7();
    }

    /* renamed from: C */
    public static AbstractC41604gZ7 m39166C(byte[] bArr, int i, int i2) {
        m39158y(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C46330oX7(bArr2);
    }

    /* renamed from: D */
    public static AbstractC41604gZ7 m39165D(InputStream inputStream) throws IOException {
        AbstractC41604gZ7 m39166C;
        ArrayList arrayList = new ArrayList();
        int i = 256;
        while (true) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            if (i2 == 0) {
                m39166C = null;
            } else {
                m39166C = m39166C(bArr, 0, i2);
            }
            if (m39166C == null) {
                break;
            }
            arrayList.add(m39166C);
            i = Math.min(i + i, 8192);
        }
        int size = arrayList.size();
        if (size == 0) {
            return f82424c;
        }
        return m39159c(arrayList.iterator(), size);
    }

    /* renamed from: H */
    public static void m39162H(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
        }
    }

    /* renamed from: c */
    public static AbstractC41604gZ7 m39159c(Iterator it, int i) {
        if (i > 0) {
            if (i == 1) {
                return (AbstractC41604gZ7) it.next();
            }
            int i2 = i >>> 1;
            AbstractC41604gZ7 m39159c = m39159c(it, i2);
            AbstractC41604gZ7 m39159c2 = m39159c(it, i - i2);
            if (Integer.MAX_VALUE - m39159c.mo5074e() >= m39159c2.mo5074e()) {
                return C48277ro8.m15343O(m39159c, m39159c2);
            }
            int mo5074e = m39159c.mo5074e();
            int mo5074e2 = m39159c2.mo5074e();
            throw new IllegalArgumentException("ByteString would be too long: " + mo5074e + "+" + mo5074e2);
        }
        throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
    }

    /* renamed from: y */
    public static int m39158y(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i >= 0) {
                if (i2 < i) {
                    throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
                }
                throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
            }
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        }
        return i4;
    }

    @Override // java.lang.Iterable
    /* renamed from: A */
    public KW7 iterator() {
        return new IV7(this);
    }

    /* renamed from: E */
    public final String m39164E(Charset charset) {
        return mo5074e() == 0 ? "" : mo15337v(charset);
    }

    /* renamed from: F */
    public final String m39163F() {
        return m39164E(C32791Fa8.f9737b);
    }

    @Deprecated
    /* renamed from: I */
    public final void m39161I(byte[] bArr, int i, int i2, int i3) {
        m39158y(0, i3, mo5074e());
        m39158y(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            mo5073f(bArr, 0, i2, i3);
        }
    }

    /* renamed from: J */
    public final byte[] m39160J() {
        int mo5074e = mo5074e();
        if (mo5074e == 0) {
            return C32791Fa8.f9739d;
        }
        byte[] bArr = new byte[mo5074e];
        mo5073f(bArr, 0, 0, mo5074e);
        return bArr;
    }

    /* renamed from: a */
    public abstract byte mo5076a(int i);

    /* renamed from: b */
    public abstract byte mo5075b(int i);

    /* renamed from: e */
    public abstract int mo5074e();

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public abstract void mo5073f(byte[] bArr, int i, int i2, int i3);

    /* renamed from: h */
    public abstract int mo15342h();

    public final int hashCode() {
        int i = this.f82427b;
        if (i == 0) {
            int mo5074e = mo5074e();
            i = mo15340o(mo5074e, 0, mo5074e);
            if (i == 0) {
                i = 1;
            }
            this.f82427b = i;
        }
        return i;
    }

    /* renamed from: j */
    public abstract boolean mo15341j();

    /* renamed from: o */
    public abstract int mo15340o(int i, int i2, int i3);

    /* renamed from: s */
    public abstract int mo15339s(int i, int i2, int i3);

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo5074e());
        if (mo5074e() <= 50) {
            concat = C41201fs8.m40603a(this);
        } else {
            concat = C41201fs8.m40603a(mo15338u(0, 47)).concat("...");
        }
        objArr[2] = concat;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* renamed from: u */
    public abstract AbstractC41604gZ7 mo15338u(int i, int i2);

    /* renamed from: v */
    public abstract String mo15337v(Charset charset);

    /* renamed from: w */
    public abstract void mo15336w(C50461vV7 c50461vV7) throws IOException;

    /* renamed from: x */
    public abstract boolean mo15335x();

    /* renamed from: z */
    public final int m39157z() {
        return this.f82427b;
    }
}
