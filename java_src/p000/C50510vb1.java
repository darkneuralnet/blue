package p000;

import java.nio.charset.StandardCharsets;
import kotlin.UByte;
/* renamed from: vb1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50510vb1 {

    /* renamed from: a */
    public final String f114356a;

    /* renamed from: b */
    public EnumC52256yX5 f114357b;

    /* renamed from: c */
    public X31 f114358c;

    /* renamed from: d */
    public X31 f114359d;

    /* renamed from: e */
    public final StringBuilder f114360e;

    /* renamed from: f */
    public int f114361f;

    /* renamed from: g */
    public int f114362g;

    /* renamed from: h */
    public C51070wX5 f114363h;

    /* renamed from: i */
    public int f114364i;

    public C50510vb1(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            char c = (char) (bytes[i] & UByte.MAX_VALUE);
            if (c == '?' && str.charAt(i) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb.append(c);
        }
        this.f114356a = sb.toString();
        this.f114357b = EnumC52256yX5.FORCE_NONE;
        this.f114360e = new StringBuilder(str.length());
        this.f114362g = -1;
    }

    /* renamed from: a */
    public int m8418a() {
        return this.f114360e.length();
    }

    /* renamed from: b */
    public StringBuilder m8417b() {
        return this.f114360e;
    }

    /* renamed from: c */
    public char m8416c() {
        return this.f114356a.charAt(this.f114361f);
    }

    /* renamed from: d */
    public String m8415d() {
        return this.f114356a;
    }

    /* renamed from: e */
    public int m8414e() {
        return this.f114362g;
    }

    /* renamed from: f */
    public int m8413f() {
        return m8411h() - this.f114361f;
    }

    /* renamed from: g */
    public C51070wX5 m8412g() {
        return this.f114363h;
    }

    /* renamed from: h */
    public final int m8411h() {
        return this.f114356a.length() - this.f114364i;
    }

    /* renamed from: i */
    public boolean m8410i() {
        return this.f114361f < m8411h();
    }

    /* renamed from: j */
    public void m8409j() {
        this.f114362g = -1;
    }

    /* renamed from: k */
    public void m8408k() {
        this.f114363h = null;
    }

    /* renamed from: l */
    public void m8407l(X31 x31, X31 x312) {
        this.f114358c = x31;
        this.f114359d = x312;
    }

    /* renamed from: m */
    public void m8406m(int i) {
        this.f114364i = i;
    }

    /* renamed from: n */
    public void m8405n(EnumC52256yX5 enumC52256yX5) {
        this.f114357b = enumC52256yX5;
    }

    /* renamed from: o */
    public void m8404o(int i) {
        this.f114362g = i;
    }

    /* renamed from: p */
    public void m8403p() {
        m8402q(m8418a());
    }

    /* renamed from: q */
    public void m8402q(int i) {
        C51070wX5 c51070wX5 = this.f114363h;
        if (c51070wX5 == null || i > c51070wX5.m6696a()) {
            this.f114363h = C51070wX5.m6685l(i, this.f114357b, this.f114358c, this.f114359d, true);
        }
    }

    /* renamed from: r */
    public void m8401r(char c) {
        this.f114360e.append(c);
    }

    /* renamed from: s */
    public void m8400s(String str) {
        this.f114360e.append(str);
    }
}
