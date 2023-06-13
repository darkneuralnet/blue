package p000;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
/* renamed from: T69 */
/* loaded from: classes5.dex */
public abstract class T69 implements Iterable, Serializable {

    /* renamed from: c */
    public static final T69 f34797c = new C50827w69(C44007kc9.f94656d);

    /* renamed from: d */
    public static final Comparator f34798d;

    /* renamed from: e */
    public static final L69 f34799e;

    /* renamed from: b */
    public int f34800b = 0;

    static {
        int i = C38339b49.f56884a;
        f34799e = new L69(null);
        f34798d = new I59();
    }

    /* renamed from: s */
    public static int m84305s(int i, int i2, int i3) {
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

    /* renamed from: v */
    public static T69 m84303v(byte[] bArr, int i, int i2) {
        m84305s(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C50827w69(bArr2);
    }

    /* renamed from: w */
    public static T69 m84302w(String str) {
        return new C50827w69(str.getBytes(C44007kc9.f94654b));
    }

    /* renamed from: a */
    public abstract byte mo7404a(int i);

    /* renamed from: b */
    public abstract byte mo7403b(int i);

    /* renamed from: c */
    public abstract int mo7402c();

    /* renamed from: e */
    public abstract int mo7401e(int i, int i2, int i3);

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public abstract T69 mo7400f(int i, int i2);

    /* renamed from: h */
    public abstract String mo7399h(Charset charset);

    public final int hashCode() {
        int i = this.f34800b;
        if (i == 0) {
            int mo7402c = mo7402c();
            i = mo7401e(mo7402c, 0, mo7402c);
            if (i == 0) {
                i = 1;
            }
            this.f34800b = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C48446s59(this);
    }

    /* renamed from: j */
    public abstract void mo7398j(C43703k59 c43703k59) throws IOException;

    /* renamed from: o */
    public abstract boolean mo7397o();

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo7402c());
        if (mo7402c() <= 50) {
            concat = Bk9.m113528a(this);
        } else {
            concat = Bk9.m113528a(mo7400f(0, 47)).concat("...");
        }
        objArr[2] = concat;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* renamed from: u */
    public final int m84304u() {
        return this.f34800b;
    }

    /* renamed from: x */
    public final String m84301x(Charset charset) {
        return mo7402c() == 0 ? "" : mo7399h(charset);
    }
}
