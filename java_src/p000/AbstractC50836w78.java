package p000;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
/* renamed from: w78  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC50836w78 implements Iterable<Byte>, Serializable {

    /* renamed from: c */
    public static final AbstractC50836w78 f115390c = new W58(C41051fd8.f80382c);

    /* renamed from: d */
    public static final Comparator<AbstractC50836w78> f115391d;

    /* renamed from: e */
    public static final C41943h78 f115392e;

    /* renamed from: b */
    public int f115393b = 0;

    static {
        int i = Q28.f29740a;
        f115392e = new C41943h78(null);
        f115391d = new C51992y48();
    }

    /* renamed from: o */
    public static int m7379o(int i, int i2, int i3) {
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

    /* renamed from: u */
    public static AbstractC50836w78 m7377u(byte[] bArr, int i, int i2) {
        m7379o(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new W58(bArr2);
    }

    /* renamed from: v */
    public static AbstractC50836w78 m7376v(String str) {
        return new W58(str.getBytes(C41051fd8.f80380a));
    }

    /* renamed from: a */
    public abstract byte mo7386a(int i);

    /* renamed from: b */
    public abstract byte mo7385b(int i);

    /* renamed from: c */
    public abstract int mo7384c();

    /* renamed from: e */
    public abstract int mo7383e(int i, int i2, int i3);

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public abstract AbstractC50836w78 mo7382f(int i, int i2);

    /* renamed from: h */
    public abstract String mo7381h(Charset charset);

    public final int hashCode() {
        int i = this.f115393b;
        if (i == 0) {
            int mo7384c = mo7384c();
            i = mo7383e(mo7384c, 0, mo7384c);
            if (i == 0) {
                i = 1;
            }
            this.f115393b = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
        return new V38(this);
    }

    /* renamed from: j */
    public abstract boolean mo7380j();

    /* renamed from: s */
    public final int m7378s() {
        return this.f115393b;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo7384c());
        if (mo7384c() <= 50) {
            concat = C41774gq8.m37421a(this);
        } else {
            concat = String.valueOf(C41774gq8.m37421a(mo7382f(0, 47))).concat("...");
        }
        objArr[2] = concat;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* renamed from: w */
    public final String m7375w(Charset charset) {
        if (mo7384c() == 0) {
            return "";
        }
        return mo7381h(charset);
    }
}
