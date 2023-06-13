package p000;

import java.io.Serializable;
import java.util.Map;
/* renamed from: vL3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50367vL3 implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    public final EnumC29481a f113850b;

    /* renamed from: c */
    public final Map<String, Object> f113851c;

    /* renamed from: d */
    public final String f113852d;

    /* renamed from: e */
    public final byte[] f113853e;

    /* renamed from: f */
    public final C3824Iy f113854f;

    /* renamed from: g */
    public final C43457jh2 f113855g;

    /* renamed from: h */
    public final LA5 f113856h;

    /* renamed from: vL3$a */
    /* loaded from: classes6.dex */
    public enum EnumC29481a {
        JSON,
        STRING,
        BYTE_ARRAY,
        BASE64URL,
        JWS_OBJECT,
        SIGNED_JWT
    }

    public C50367vL3(String str) {
        if (str != null) {
            this.f113851c = null;
            this.f113852d = str;
            this.f113853e = null;
            this.f113854f = null;
            this.f113855g = null;
            this.f113856h = null;
            this.f113850b = EnumC29481a.STRING;
            return;
        }
        throw new IllegalArgumentException("The string must not be null");
    }

    /* renamed from: a */
    public static String m8887a(byte[] bArr) {
        if (bArr != null) {
            return new String(bArr, C48618sO5.f108725a);
        }
        return null;
    }

    /* renamed from: b */
    public static byte[] m8886b(String str) {
        if (str != null) {
            return str.getBytes(C48618sO5.f108725a);
        }
        return null;
    }

    /* renamed from: c */
    public C3824Iy m8885c() {
        C3824Iy c3824Iy = this.f113854f;
        if (c3824Iy != null) {
            return c3824Iy;
        }
        return C3824Iy.m101442e(m8884d());
    }

    /* renamed from: d */
    public byte[] m8884d() {
        byte[] bArr = this.f113853e;
        if (bArr != null) {
            return bArr;
        }
        C3824Iy c3824Iy = this.f113854f;
        if (c3824Iy != null) {
            return c3824Iy.m104549a();
        }
        return m8886b(toString());
    }

    public String toString() {
        String str = this.f113852d;
        if (str != null) {
            return str;
        }
        C43457jh2 c43457jh2 = this.f113855g;
        if (c43457jh2 != null) {
            if (c43457jh2.m106755a() != null) {
                return this.f113855g.m106755a();
            }
            return this.f113855g.m30097l();
        }
        Map<String, Object> map = this.f113851c;
        if (map != null) {
            return C34477Mg2.m95053o(map);
        }
        byte[] bArr = this.f113853e;
        if (bArr != null) {
            return m8887a(bArr);
        }
        C3824Iy c3824Iy = this.f113854f;
        if (c3824Iy != null) {
            return c3824Iy.m104547c();
        }
        return null;
    }

    public C50367vL3(byte[] bArr) {
        if (bArr != null) {
            this.f113851c = null;
            this.f113852d = null;
            this.f113853e = bArr;
            this.f113854f = null;
            this.f113855g = null;
            this.f113856h = null;
            this.f113850b = EnumC29481a.BYTE_ARRAY;
            return;
        }
        throw new IllegalArgumentException("The byte array must not be null");
    }

    public C50367vL3(C3824Iy c3824Iy) {
        if (c3824Iy != null) {
            this.f113851c = null;
            this.f113852d = null;
            this.f113853e = null;
            this.f113854f = c3824Iy;
            this.f113855g = null;
            this.f113856h = null;
            this.f113850b = EnumC29481a.BASE64URL;
            return;
        }
        throw new IllegalArgumentException("The Base64URL-encoded object must not be null");
    }
}
