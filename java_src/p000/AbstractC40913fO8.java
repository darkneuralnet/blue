package p000;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
/* renamed from: fO8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC40913fO8 implements Iterable, Serializable {

    /* renamed from: c */
    public static final AbstractC40913fO8 f80055c = new OM8(XV8.f43344d);

    /* renamed from: d */
    public static final Comparator f80056d;

    /* renamed from: e */
    public static final C45055mN8 f80057e;

    /* renamed from: b */
    public int f80058b = 0;

    static {
        int i = C46214oK8.f101793a;
        f80057e = new C45055mN8(null);
        f80056d = new HL8();
    }

    /* renamed from: s */
    public static int m41431s(int i, int i2, int i3) {
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
    public static AbstractC40913fO8 m41429v(byte[] bArr, int i, int i2) {
        m41431s(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new OM8(bArr2);
    }

    /* renamed from: a */
    public abstract byte mo41439a(int i);

    /* renamed from: b */
    public abstract byte mo41438b(int i);

    /* renamed from: c */
    public abstract int mo41437c();

    /* renamed from: e */
    public abstract int mo41436e(int i, int i2, int i3);

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public abstract AbstractC40913fO8 mo41435f(int i, int i2);

    /* renamed from: h */
    public abstract String mo41434h(Charset charset);

    public final int hashCode() {
        int i = this.f80058b;
        if (i == 0) {
            int mo41437c = mo41437c();
            i = mo41436e(mo41437c, 0, mo41437c);
            if (i == 0) {
                i = 1;
            }
            this.f80058b = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C50372vL8(this);
    }

    /* renamed from: j */
    public abstract void mo41433j(C43258jL8 c43258jL8) throws IOException;

    /* renamed from: o */
    public abstract boolean mo41432o();

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo41437c());
        if (mo41437c() <= 50) {
            concat = B69.m114354a(this);
        } else {
            concat = B69.m114354a(mo41435f(0, 47)).concat("...");
        }
        objArr[2] = concat;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* renamed from: u */
    public final int m41430u() {
        return this.f80058b;
    }

    /* renamed from: w */
    public final String m41428w(Charset charset) {
        return mo41437c() == 0 ? "" : mo41434h(charset);
    }
}
