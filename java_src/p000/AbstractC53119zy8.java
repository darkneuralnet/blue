package p000;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import kotlin.UByte;
/* renamed from: zy8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC53119zy8 implements Serializable, Iterable<Byte> {

    /* renamed from: c */
    public static final AbstractC53119zy8 f122544c = new C52061yB8(C52124yI8.f119327c);

    /* renamed from: d */
    public static final InterfaceC36058Sz8 f122545d;

    /* renamed from: e */
    public static final Comparator<AbstractC53119zy8> f122546e;

    /* renamed from: b */
    public int f122547b = 0;

    static {
        InterfaceC36058Sz8 c50165uz8;
        if (C36256Tv8.m82238b()) {
            c50165uz8 = new C44947mB8(null);
        } else {
            c50165uz8 = new C50165uz8(null);
        }
        f122545d = c50165uz8;
        f122546e = new C36985Wy8();
    }

    /* renamed from: A */
    public static AbstractC53119zy8 m48A(byte[] bArr, int i, int i2) {
        return new C43050iz8(bArr, i, i2);
    }

    /* renamed from: C */
    public static C37814aB8 m47C(int i) {
        return new C37814aB8(i, null);
    }

    /* renamed from: j */
    public static AbstractC53119zy8 m39j(String str) {
        return new C52061yB8(str.getBytes(C52124yI8.f119325a));
    }

    /* renamed from: o */
    public static AbstractC53119zy8 m38o(byte[] bArr) {
        return new C52061yB8(bArr);
    }

    /* renamed from: s */
    public static AbstractC53119zy8 m37s(byte[] bArr, int i, int i2) {
        m32y(i, i + i2, bArr.length);
        return new C52061yB8(f122545d.mo9411a(bArr, i, i2));
    }

    /* renamed from: x */
    public static int m33x(byte b) {
        return b & UByte.MAX_VALUE;
    }

    /* renamed from: y */
    public static int m32y(int i, int i2, int i3) {
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

    /* renamed from: D */
    public final int m46D() {
        return this.f122547b;
    }

    /* renamed from: a */
    public abstract byte mo45a(int i);

    /* renamed from: b */
    public abstract int mo44b();

    /* renamed from: e */
    public abstract int mo42e(int i, int i2, int i3);

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public abstract String mo41f(Charset charset);

    /* renamed from: h */
    public abstract AbstractC53119zy8 mo40h(int i, int i2);

    public final int hashCode() {
        int i = this.f122547b;
        if (i == 0) {
            int mo44b = mo44b();
            i = mo42e(mo44b, 0, mo44b);
            if (i == 0) {
                i = 1;
            }
            this.f122547b = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new C46005ny8(this);
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo44b());
        if (mo44b() <= 50) {
            concat = C48110rX8.m15805a(this);
        } else {
            concat = String.valueOf(C48110rX8.m15805a(mo40h(0, 47))).concat("...");
        }
        objArr[2] = concat;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* renamed from: u */
    public abstract void mo36u(AbstractC35572Qx8 abstractC35572Qx8) throws IOException;

    /* renamed from: v */
    public abstract void mo35v(byte[] bArr, int i, int i2, int i3);

    /* renamed from: w */
    public abstract byte mo34w(int i);

    /* renamed from: z */
    public final String m31z() {
        Charset charset = C52124yI8.f119325a;
        if (mo44b() == 0) {
            return "";
        }
        return mo41f(charset);
    }

    public abstract boolean zzc();
}
