package p000;
/* renamed from: xW7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51656xW7 extends C46330oX7 {

    /* renamed from: g */
    public final int f117752g;

    /* renamed from: h */
    public final int f117753h;

    public C51656xW7(byte[] bArr, int i, int i2) {
        super(bArr);
        AbstractC41604gZ7.m39158y(i, i + i2, bArr.length);
        this.f117752g = i;
        this.f117753h = i2;
    }

    @Override // p000.C46330oX7
    /* renamed from: L */
    public final int mo5077L() {
        return this.f117752g;
    }

    @Override // p000.C46330oX7, p000.AbstractC41604gZ7
    /* renamed from: a */
    public final byte mo5076a(int i) {
        AbstractC41604gZ7.m39162H(i, this.f117753h);
        return this.f102128f[this.f117752g + i];
    }

    @Override // p000.C46330oX7, p000.AbstractC41604gZ7
    /* renamed from: b */
    public final byte mo5075b(int i) {
        return this.f102128f[this.f117752g + i];
    }

    @Override // p000.C46330oX7, p000.AbstractC41604gZ7
    /* renamed from: e */
    public final int mo5074e() {
        return this.f117753h;
    }

    @Override // p000.C46330oX7, p000.AbstractC41604gZ7
    /* renamed from: f */
    public final void mo5073f(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f102128f, this.f117752g + i, bArr, i2, i3);
    }
}
