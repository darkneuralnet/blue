package p000;

import p000.InterfaceC44592lc1;
/* renamed from: xt */
/* loaded from: classes.dex */
public final class C30335xt extends InterfaceC44592lc1.AbstractC25739c {

    /* renamed from: a */
    public final int f118290a;

    /* renamed from: b */
    public final String f118291b;

    /* renamed from: c */
    public final int f118292c;

    /* renamed from: d */
    public final int f118293d;

    /* renamed from: e */
    public final int f118294e;

    /* renamed from: f */
    public final int f118295f;

    /* renamed from: g */
    public final int f118296g;

    /* renamed from: h */
    public final int f118297h;

    /* renamed from: i */
    public final int f118298i;

    /* renamed from: j */
    public final int f118299j;

    public C30335xt(int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.f118290a = i;
        if (str != null) {
            this.f118291b = str;
            this.f118292c = i2;
            this.f118293d = i3;
            this.f118294e = i4;
            this.f118295f = i5;
            this.f118296g = i6;
            this.f118297h = i7;
            this.f118298i = i8;
            this.f118299j = i9;
            return;
        }
        throw new NullPointerException("Null mediaType");
    }

    @Override // p000.InterfaceC44592lc1.AbstractC25739c
    /* renamed from: b */
    public int mo4520b() {
        return this.f118297h;
    }

    @Override // p000.InterfaceC44592lc1.AbstractC25739c
    /* renamed from: c */
    public int mo4519c() {
        return this.f118292c;
    }

    @Override // p000.InterfaceC44592lc1.AbstractC25739c
    /* renamed from: d */
    public int mo4518d() {
        return this.f118298i;
    }

    @Override // p000.InterfaceC44592lc1.AbstractC25739c
    /* renamed from: e */
    public int mo4517e() {
        return this.f118290a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC44592lc1.AbstractC25739c)) {
            return false;
        }
        InterfaceC44592lc1.AbstractC25739c abstractC25739c = (InterfaceC44592lc1.AbstractC25739c) obj;
        if (this.f118290a == abstractC25739c.mo4517e() && this.f118291b.equals(abstractC25739c.mo4513i()) && this.f118292c == abstractC25739c.mo4519c() && this.f118293d == abstractC25739c.mo4516f() && this.f118294e == abstractC25739c.mo4511k() && this.f118295f == abstractC25739c.mo4514h() && this.f118296g == abstractC25739c.mo4512j() && this.f118297h == abstractC25739c.mo4520b() && this.f118298i == abstractC25739c.mo4518d() && this.f118299j == abstractC25739c.mo4515g()) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC44592lc1.AbstractC25739c
    /* renamed from: f */
    public int mo4516f() {
        return this.f118293d;
    }

    @Override // p000.InterfaceC44592lc1.AbstractC25739c
    /* renamed from: g */
    public int mo4515g() {
        return this.f118299j;
    }

    @Override // p000.InterfaceC44592lc1.AbstractC25739c
    /* renamed from: h */
    public int mo4514h() {
        return this.f118295f;
    }

    public int hashCode() {
        return ((((((((((((((((((this.f118290a ^ 1000003) * 1000003) ^ this.f118291b.hashCode()) * 1000003) ^ this.f118292c) * 1000003) ^ this.f118293d) * 1000003) ^ this.f118294e) * 1000003) ^ this.f118295f) * 1000003) ^ this.f118296g) * 1000003) ^ this.f118297h) * 1000003) ^ this.f118298i) * 1000003) ^ this.f118299j;
    }

    @Override // p000.InterfaceC44592lc1.AbstractC25739c
    /* renamed from: i */
    public String mo4513i() {
        return this.f118291b;
    }

    @Override // p000.InterfaceC44592lc1.AbstractC25739c
    /* renamed from: j */
    public int mo4512j() {
        return this.f118296g;
    }

    @Override // p000.InterfaceC44592lc1.AbstractC25739c
    /* renamed from: k */
    public int mo4511k() {
        return this.f118294e;
    }

    public String toString() {
        return "VideoProfileProxy{codec=" + this.f118290a + ", mediaType=" + this.f118291b + ", bitrate=" + this.f118292c + ", frameRate=" + this.f118293d + ", width=" + this.f118294e + ", height=" + this.f118295f + ", profile=" + this.f118296g + ", bitDepth=" + this.f118297h + ", chromaSubsampling=" + this.f118298i + ", hdrFormat=" + this.f118299j + "}";
    }
}
