package p000;
/* renamed from: pV8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46906pV8 extends AbstractC40383eV8 {

    /* renamed from: a */
    public final AV8 f103753a;

    /* renamed from: b */
    public final /* synthetic */ LV8 f103754b;

    public C46906pV8(LV8 lv8, int i) {
        this.f103754b = lv8;
        this.f103753a = new AV8(i);
    }

    @Override // p000.AbstractC40383eV8, p000.WW8
    /* renamed from: a */
    public final WW8 mo19172a(byte[] bArr, int i, int i2) {
        this.f103753a.write(bArr, 0, i2);
        return this;
    }

    @Override // p000.WW8
    public final AW8 zzd() {
        return this.f103754b.mo79836c(this.f103753a.m115699b(), 0, this.f103753a.m115700a());
    }
}
