package p000;

import java.io.IOException;
/* renamed from: W09 */
/* loaded from: classes6.dex */
public abstract class W09 {

    /* renamed from: a */
    public static final W09 f40252a = new D09("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* renamed from: b */
    public static final W09 f40253b = new D09("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* renamed from: c */
    public static final W09 f40254c = new M09("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* renamed from: d */
    public static final W09 f40255d = new M09("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* renamed from: e */
    public static final W09 f40256e = new C48989t09("base16()", "0123456789ABCDEF");

    /* renamed from: d */
    public static W09 m78935d() {
        return f40256e;
    }

    /* renamed from: a */
    public abstract void mo13251a(Appendable appendable, byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: b */
    public abstract int mo78937b(int i);

    /* renamed from: c */
    public abstract W09 mo78936c();

    /* renamed from: e */
    public final String m78934e(byte[] bArr, int i, int i2) {
        C52142yK8.m3657h(0, i2, bArr.length);
        StringBuilder sb = new StringBuilder(mo78937b(i2));
        try {
            mo13251a(sb, bArr, 0, i2);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
