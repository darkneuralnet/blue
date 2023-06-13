package p000;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
/* renamed from: TD7 */
/* loaded from: classes5.dex */
public abstract class TD7 implements Serializable, Iterable<Byte> {

    /* renamed from: c */
    public static final TD7 f34940c = new C50353vJ7(C37975aT7.f50514c);

    /* renamed from: d */
    public static final XG7 f34941d;

    /* renamed from: b */
    public int f34942b = 0;

    static {
        f34941d = C31836Ay7.m114805b() ? new C43841kK7(null) : new C46761pF7(null);
    }

    /* renamed from: h */
    public static int m84182h(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Beginning index: ");
                sb.append(i);
                sb.append(" < 0");
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (i2 < i) {
                StringBuilder sb2 = new StringBuilder(66);
                sb2.append("Beginning index larger than ending index: ");
                sb2.append(i);
                sb2.append(", ");
                sb2.append(i2);
                throw new IndexOutOfBoundsException(sb2.toString());
            } else {
                StringBuilder sb3 = new StringBuilder(37);
                sb3.append("End index: ");
                sb3.append(i2);
                sb3.append(" >= ");
                sb3.append(i3);
                throw new IndexOutOfBoundsException(sb3.toString());
            }
        }
        return i4;
    }

    /* renamed from: j */
    public static TD7 m84181j(byte[] bArr, int i, int i2) {
        return new C50353vJ7(f34941d.mo19695a(bArr, i, i2));
    }

    /* renamed from: o */
    public static TD7 m84180o(String str) {
        return new C50353vJ7(str.getBytes(C37975aT7.f50512a));
    }

    /* renamed from: u */
    public static OH7 m84179u(int i) {
        return new OH7(i, null);
    }

    /* renamed from: a */
    public abstract int mo8905a(int i, int i2, int i3);

    /* renamed from: b */
    public abstract String mo8904b(Charset charset);

    /* renamed from: c */
    public abstract TD7 mo8903c(int i, int i2);

    /* renamed from: e */
    public abstract void mo8902e(VC7 vc7) throws IOException;

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public final int m84183f() {
        return this.f34942b;
    }

    public final int hashCode() {
        int i = this.f34942b;
        if (i == 0) {
            int size = size();
            i = mo8905a(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f34942b = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new C52087yE7(this);
    }

    /* renamed from: s */
    public abstract byte mo8901s(int i);

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    /* renamed from: v */
    public final String m84178v() {
        return size() == 0 ? "" : mo8904b(C37975aT7.f50512a);
    }

    /* renamed from: v1 */
    public abstract boolean mo8900v1();
}
