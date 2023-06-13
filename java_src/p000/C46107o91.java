package p000;

import java.net.MalformedURLException;
import java.net.URL;
import p000.AbstractC43142j91;
/* renamed from: o91  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C46107o91 extends AbstractC43142j91 {

    /* renamed from: i */
    public static final String[] f101494i = {"http://www.", "https://www.", "http://", "https://"};

    /* renamed from: j */
    public static final String[] f101495j = {".com/", ".org/", ".edu/", ".net/", ".info/", ".biz/", ".gov/", ".com", ".org", ".edu", ".net", ".info", ".biz", ".gov"};
    private static final long serialVersionUID = 1;

    /* renamed from: g */
    public final int f101496g;

    /* renamed from: h */
    public final URL f101497h;

    public C46107o91() {
        this(5, 22, new byte[]{-86, -2, 16, 0});
    }

    /* renamed from: e */
    public final String m21712e(byte[] bArr) {
        byte b;
        if (bArr.length >= 5 && (b = bArr[4]) >= 0) {
            String[] strArr = f101494i;
            if (strArr.length > b) {
                return strArr[b];
            }
        }
        return null;
    }

    /* renamed from: f */
    public final int m21711f(byte[] bArr) {
        if (4 <= bArr.length) {
            return bArr[3];
        }
        return 0;
    }

    /* renamed from: g */
    public final URL m21710g(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        String m21712e = m21712e(bArr);
        if (m21712e != null) {
            sb.append(m21712e);
        }
        for (int i = 5; i < bArr.length; i++) {
            byte b = bArr[i];
            if (b >= 0) {
                String[] strArr = f101495j;
                if (b < strArr.length) {
                    sb.append(strArr[b]);
                }
            }
            if (32 < b && b < Byte.MAX_VALUE) {
                sb.append((char) b);
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        try {
            return new URL(sb.toString());
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    @Override // p000.AbstractC43142j91, p000.C35533Qt5, p000.C20674g
    public String toString() {
        return String.format("EddystoneURL(TxPower=%d,URL=%s)", Integer.valueOf(this.f101496g), this.f101497h);
    }

    public C46107o91(int i, int i2, byte[] bArr) {
        super(i, i2, bArr, AbstractC43142j91.EnumC24725a.URL);
        this.f101496g = m21711f(bArr);
        this.f101497h = m21710g(bArr);
    }
}
