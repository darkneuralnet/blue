package p000;
/* renamed from: qg5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C47601qg5 extends AbstractC43044iz2 {
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
        DD3.m110675i(this.f91962k, bArr, i + 48);
        DD3.m110675i(this.f91963l, bArr, i + 56);
        mo17251r();
        return 64;
    }

    @Override // p000.P31
    /* renamed from: d */
    public String mo15579d() {
        return "SHA-512";
    }

    @Override // p000.P31
    /* renamed from: e */
    public int mo15578e() {
        return 64;
    }

    @Override // p000.AbstractC43044iz2
    /* renamed from: r */
    public void mo17251r() {
        super.mo17251r();
        this.f91956e = 7640891576956012808L;
        this.f91957f = -4942790177534073029L;
        this.f91958g = 4354685564936845355L;
        this.f91959h = -6534734903238641935L;
        this.f91960i = 5840696475078001361L;
        this.f91961j = -7276294671716946913L;
        this.f91962k = 2270897969802886507L;
        this.f91963l = 6620516959819538809L;
    }
}
