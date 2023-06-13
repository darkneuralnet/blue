package p000;
/* renamed from: Ns7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34824Ns7 extends C42989it7 {

    /* renamed from: g */
    public final int f25332g;

    /* renamed from: h */
    public final int f25333h;

    public C34824Ns7(byte[] bArr, int i, int i2) {
        super(bArr);
        AbstractC44175kt7.m28207y(i, i + i2, bArr.length);
        this.f25332g = i;
        this.f25333h = i2;
    }

    @Override // p000.C42989it7
    /* renamed from: M */
    public final int mo31671M() {
        return this.f25332g;
    }

    @Override // p000.C42989it7, p000.AbstractC44175kt7
    /* renamed from: a */
    public final byte mo28220a(int i) {
        AbstractC44175kt7.m28222J(i, this.f25333h);
        return this.f91659f[this.f25332g + i];
    }

    @Override // p000.C42989it7, p000.AbstractC44175kt7
    /* renamed from: b */
    public final byte mo28219b(int i) {
        return this.f91659f[this.f25332g + i];
    }

    @Override // p000.C42989it7, p000.AbstractC44175kt7
    /* renamed from: e */
    public final int mo28217e() {
        return this.f25333h;
    }

    @Override // p000.C42989it7, p000.AbstractC44175kt7
    /* renamed from: f */
    public final void mo28216f(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f91659f, this.f25332g + i, bArr, i2, i3);
    }
}
