package p000;
/* renamed from: og5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C46415og5 extends AbstractC43044iz2 {
    @Override // p000.P31
    /* renamed from: a */
    public int mo15581a(byte[] bArr, int i) {
        m31314n();
        DD3.m110675i(this.f91956e, bArr, i);
        DD3.m110675i(this.f91957f, bArr, i + 8);
        DD3.m110675i(this.f91958g, bArr, i + 16);
        DD3.m110675i(this.f91959h, bArr, i + 24);
        DD3.m110675i(this.f91960i, bArr, i + 32);
        DD3.m110675i(this.f91961j, bArr, i + 40);
        mo17251r();
        return 48;
    }

    @Override // p000.P31
    /* renamed from: d */
    public String mo15579d() {
        return "SHA-384";
    }

    @Override // p000.P31
    /* renamed from: e */
    public int mo15578e() {
        return 48;
    }

    @Override // p000.AbstractC43044iz2
    /* renamed from: r */
    public void mo17251r() {
        super.mo17251r();
        this.f91956e = -3766243637369397544L;
        this.f91957f = 7105036623409894663L;
        this.f91958g = -7973340178411365097L;
        this.f91959h = 1526699215303891257L;
        this.f91960i = 7436329637833083697L;
        this.f91961j = -8163818279084223215L;
        this.f91962k = -2662702644619276377L;
        this.f91963l = 5167115440072839076L;
    }
}
