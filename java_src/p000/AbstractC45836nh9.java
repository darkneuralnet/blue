package p000;

import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
/* renamed from: nh9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC45836nh9 implements Iterable<Byte>, Serializable {

    /* renamed from: c */
    public static final AbstractC45836nh9 f100361c = new Xg9(Fn9.f10240c);

    /* renamed from: d */
    public static final Comparator<AbstractC45836nh9> f100362d;

    /* renamed from: e */
    public static final C41092fh9 f100363e;

    /* renamed from: b */
    public int f100364b = 0;

    static {
        int i = C48780sf9.f109092a;
        f100363e = new C41092fh9(null);
        f100362d = new C40489eg9();
    }

    /* renamed from: A */
    public static AbstractC45836nh9 m23303A(byte[] bArr) {
        return new Xg9(bArr);
    }

    /* renamed from: u */
    public static int m23295u(int i, int i2, int i3) {
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

    /* renamed from: w */
    public static AbstractC45836nh9 m23293w(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        m23295u(0, remaining, byteBuffer.remaining());
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr);
        return new Xg9(bArr);
    }

    /* renamed from: x */
    public static AbstractC45836nh9 m23292x(byte[] bArr) {
        return m23291y(bArr, 0, bArr.length);
    }

    /* renamed from: y */
    public static AbstractC45836nh9 m23291y(byte[] bArr, int i, int i2) {
        m23295u(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new Xg9(bArr2);
    }

    /* renamed from: z */
    public static AbstractC45836nh9 m23290z(String str) {
        return new Xg9(str.getBytes(Fn9.f10238a));
    }

    /* renamed from: C */
    public final String m23302C(Charset charset) {
        if (mo11924c() == 0) {
            return "";
        }
        return mo23298j(charset);
    }

    /* renamed from: D */
    public final byte[] m23301D() {
        int mo11924c = mo11924c();
        if (mo11924c == 0) {
            return Fn9.f10240c;
        }
        byte[] bArr = new byte[mo11924c];
        mo11923e(bArr, 0, 0, mo11924c);
        return bArr;
    }

    /* renamed from: a */
    public abstract byte mo11926a(int i);

    /* renamed from: b */
    public abstract byte mo11925b(int i);

    /* renamed from: c */
    public abstract int mo11924c();

    /* renamed from: e */
    public abstract void mo11923e(byte[] bArr, int i, int i2, int i3);

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public abstract int mo23300f(int i, int i2, int i3);

    /* renamed from: h */
    public abstract AbstractC45836nh9 mo23299h(int i, int i2);

    public final int hashCode() {
        int i = this.f100364b;
        if (i == 0) {
            int mo11924c = mo11924c();
            i = mo23300f(mo11924c, 0, mo11924c);
            if (i == 0) {
                i = 1;
            }
            this.f100364b = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
        return new Qf9(this);
    }

    /* renamed from: j */
    public abstract String mo23298j(Charset charset);

    /* renamed from: o */
    public abstract void mo23297o(If9 if9) throws IOException;

    /* renamed from: s */
    public abstract boolean mo23296s();

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo11924c());
        if (mo11924c() <= 50) {
            concat = Er9.m108319a(this);
        } else {
            concat = String.valueOf(Er9.m108319a(mo23299h(0, 47))).concat("...");
        }
        objArr[2] = concat;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* renamed from: v */
    public final int m23294v() {
        return this.f100364b;
    }
}
