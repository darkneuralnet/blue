package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
/* renamed from: kt7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC44175kt7 implements Iterable, Serializable {

    /* renamed from: c */
    public static final AbstractC44175kt7 f95165c = new C42989it7(C46557ou7.f102754d);

    /* renamed from: d */
    public static final Comparator f95166d;

    /* renamed from: e */
    public static final C43582jt7 f95167e;

    /* renamed from: b */
    public int f95168b = 0;

    static {
        int i = C32016Bs7.f2988a;
        f95167e = new C43582jt7(null);
        f95166d = new C34356Ls7();
    }

    /* renamed from: C */
    public static AbstractC44175kt7 m28228C(byte[] bArr) {
        return m28227D(bArr, 0, bArr.length);
    }

    /* renamed from: D */
    public static AbstractC44175kt7 m28227D(byte[] bArr, int i, int i2) {
        m28207y(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C42989it7(bArr2);
    }

    /* renamed from: E */
    public static AbstractC44175kt7 m28226E(String str) {
        return new C42989it7(str.getBytes(C46557ou7.f102752b));
    }

    /* renamed from: F */
    public static AbstractC44175kt7 m28225F(InputStream inputStream) throws IOException {
        AbstractC44175kt7 m28227D;
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
                m28227D = null;
            } else {
                m28227D = m28227D(bArr, 0, i2);
            }
            if (m28227D == null) {
                break;
            }
            arrayList.add(m28227D);
            i = Math.min(i + i, 8192);
        }
        int size = arrayList.size();
        if (size == 0) {
            return f95165c;
        }
        return m28218c(arrayList.iterator(), size);
    }

    /* renamed from: H */
    public static AbstractC44175kt7 m28224H(byte[] bArr) {
        return new C42989it7(bArr);
    }

    /* renamed from: J */
    public static void m28222J(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder(22);
                sb.append("Index < 0: ");
                sb.append(i);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Index > length: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
    }

    /* renamed from: c */
    public static AbstractC44175kt7 m28218c(Iterator it, int i) {
        if (i > 0) {
            if (i == 1) {
                return (AbstractC44175kt7) it.next();
            }
            int i2 = i >>> 1;
            AbstractC44175kt7 m28218c = m28218c(it, i2);
            AbstractC44175kt7 m28218c2 = m28218c(it, i - i2);
            if (Integer.MAX_VALUE - m28218c.mo28217e() >= m28218c2.mo28217e()) {
                return C34617Mv7.m94563L(m28218c, m28218c2);
            }
            int mo28217e = m28218c.mo28217e();
            int mo28217e2 = m28218c2.mo28217e();
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(mo28217e);
            sb.append("+");
            sb.append(mo28217e2);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
    }

    /* renamed from: y */
    public static int m28207y(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i >= 0) {
                if (i2 < i) {
                    StringBuilder sb = new StringBuilder(66);
                    sb.append("Beginning index larger than ending index: ");
                    sb.append(i);
                    sb.append(", ");
                    sb.append(i2);
                    throw new IndexOutOfBoundsException(sb.toString());
                }
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("End index: ");
                sb2.append(i2);
                sb2.append(" >= ");
                sb2.append(i3);
                throw new IndexOutOfBoundsException(sb2.toString());
            }
            StringBuilder sb3 = new StringBuilder(32);
            sb3.append("Beginning index: ");
            sb3.append(i);
            sb3.append(" < 0");
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        return i4;
    }

    @Override // java.lang.Iterable
    /* renamed from: A */
    public InterfaceC35058Os7 iterator() {
        return new C33888Js7(this);
    }

    /* renamed from: I */
    public final String m28223I(Charset charset) {
        return mo28217e() == 0 ? "" : mo28210v(charset);
    }

    @Deprecated
    /* renamed from: K */
    public final void m28221K(byte[] bArr, int i, int i2, int i3) {
        m28207y(0, i3, mo28217e());
        m28207y(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            mo28216f(bArr, 0, i2, i3);
        }
    }

    /* renamed from: a */
    public abstract byte mo28220a(int i);

    /* renamed from: b */
    public abstract byte mo28219b(int i);

    /* renamed from: e */
    public abstract int mo28217e();

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public abstract void mo28216f(byte[] bArr, int i, int i2, int i3);

    /* renamed from: h */
    public abstract int mo28215h();

    public final int hashCode() {
        int i = this.f95168b;
        if (i == 0) {
            int mo28217e = mo28217e();
            i = mo28213o(mo28217e, 0, mo28217e);
            if (i == 0) {
                i = 1;
            }
            this.f95168b = i;
        }
        return i;
    }

    /* renamed from: j */
    public abstract boolean mo28214j();

    /* renamed from: o */
    public abstract int mo28213o(int i, int i2, int i3);

    /* renamed from: s */
    public abstract int mo28212s(int i, int i2, int i3);

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo28217e());
        if (mo28217e() <= 50) {
            concat = C37659Zv7.m72296a(this);
        } else {
            concat = C37659Zv7.m72296a(mo28211u(0, 47)).concat("...");
        }
        objArr[2] = concat;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* renamed from: u */
    public abstract AbstractC44175kt7 mo28211u(int i, int i2);

    /* renamed from: v */
    public abstract String mo28210v(Charset charset);

    /* renamed from: w */
    public abstract void mo28209w(AbstractC33654Is7 abstractC33654Is7) throws IOException;

    /* renamed from: x */
    public abstract boolean mo28208x();

    /* renamed from: z */
    public final int m28206z() {
        return this.f95168b;
    }
}
