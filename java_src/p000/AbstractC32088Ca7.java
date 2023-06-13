package p000;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
/* renamed from: Ca7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC32088Ca7 implements Iterable, Serializable {

    /* renamed from: c */
    public static final AbstractC32088Ca7 f4281c = new C52878za7(C46960pb7.f103842d);

    /* renamed from: d */
    public static final Comparator f4282d;

    /* renamed from: e */
    public static final C31854Ba7 f4283e;

    /* renamed from: b */
    public int f4284b = 0;

    static {
        int i = C42206ha7.f85494a;
        f4283e = new C31854Ba7(null);
        f4282d = new C47543qa7();
    }

    /* renamed from: s */
    public static int m112098s(int i, int i2, int i3) {
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

    /* renamed from: v */
    public static AbstractC32088Ca7 m112096v(byte[] bArr, int i, int i2) {
        m112098s(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C52878za7(bArr2);
    }

    /* renamed from: a */
    public abstract byte mo1074a(int i);

    /* renamed from: b */
    public abstract byte mo1073b(int i);

    /* renamed from: c */
    public abstract int mo1072c();

    /* renamed from: e */
    public abstract int mo1071e(int i, int i2, int i3);

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public abstract AbstractC32088Ca7 mo1070f(int i, int i2);

    /* renamed from: h */
    public abstract String mo1069h(Charset charset);

    public final int hashCode() {
        int i = this.f4284b;
        if (i == 0) {
            int mo1072c = mo1072c();
            i = mo1071e(mo1072c, 0, mo1072c);
            if (i == 0) {
                i = 1;
            }
            this.f4284b = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C46950pa7(this);
    }

    /* renamed from: j */
    public abstract void mo1068j(C46357oa7 c46357oa7) throws IOException;

    /* renamed from: o */
    public abstract boolean mo1067o();

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo1072c());
        if (mo1072c() <= 50) {
            concat = C51712xc7.m4933a(this);
        } else {
            concat = C51712xc7.m4933a(mo1070f(0, 47)).concat("...");
        }
        objArr[2] = concat;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* renamed from: u */
    public final int m112097u() {
        return this.f4284b;
    }

    /* renamed from: w */
    public final String m112095w(Charset charset) {
        return mo1072c() == 0 ? "" : mo1069h(charset);
    }
}
