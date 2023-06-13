package p000;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.UByte;
/* renamed from: jv9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC43604jv9 implements Serializable, Iterable<Byte> {

    /* renamed from: c */
    public static final AbstractC43604jv9 f93538c = new C39945dl7(C44389lF7.f95798c);

    /* renamed from: d */
    public static final InterfaceC52355yh7 f93539d;

    /* renamed from: e */
    public static final Comparator<AbstractC43604jv9> f93540e;

    /* renamed from: b */
    public int f93541b = 0;

    static {
        InterfaceC52355yh7 c32133Cf7;
        if (C41645gd9.m37944b()) {
            c32133Cf7 = new C41713gk7(null);
        } else {
            c32133Cf7 = new C32133Cf7(null);
        }
        f93539d = c32133Cf7;
        f93540e = new C48960sx9();
    }

    /* renamed from: C */
    public static C45261mj7 m29755C(int i) {
        return new C45261mj7(i, null);
    }

    /* renamed from: f */
    public static int m29750f(byte b) {
        return b & UByte.MAX_VALUE;
    }

    /* renamed from: w */
    public static int m29744w(int i, int i2, int i3) {
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

    /* renamed from: x */
    public static AbstractC43604jv9 m29743x(byte[] bArr, int i, int i2) {
        m29744w(i, i + i2, bArr.length);
        return new C39945dl7(f93539d.mo2895a(bArr, i, i2));
    }

    /* renamed from: z */
    public static AbstractC43604jv9 m29742z(String str) {
        return new C39945dl7(str.getBytes(C44389lF7.f95796a));
    }

    /* renamed from: A */
    public abstract byte mo11134A(int i);

    /* renamed from: a */
    public final byte[] m29754a() {
        int size = size();
        if (size == 0) {
            return C44389lF7.f95798c;
        }
        byte[] bArr = new byte[size];
        mo11132u(bArr, 0, 0, size);
        return bArr;
    }

    /* renamed from: b */
    public final String m29753b() {
        Charset charset = C44389lF7.f95796a;
        if (size() == 0) {
            return "";
        }
        return mo29748j(charset);
    }

    /* renamed from: c */
    public abstract boolean mo29752c();

    /* renamed from: e */
    public final int m29751e() {
        return this.f93541b;
    }

    public abstract boolean equals(Object obj);

    /* renamed from: h */
    public abstract int mo29749h(int i, int i2, int i3);

    public final int hashCode() {
        int i = this.f93541b;
        if (i == 0) {
            int size = size();
            i = mo29749h(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f93541b = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new Lt9(this);
    }

    /* renamed from: j */
    public abstract String mo29748j(Charset charset);

    /* renamed from: o */
    public abstract AbstractC43604jv9 mo29747o(int i, int i2);

    /* renamed from: s */
    public abstract void mo29746s(Dq9 dq9) throws IOException;

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    /* renamed from: u */
    public abstract void mo11132u(byte[] bArr, int i, int i2, int i3);

    /* renamed from: y */
    public abstract byte mo11131y(int i);
}
