package p000;
/* renamed from: wB8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50875wB8 extends AbstractC48979sz8<PC8> implements InterfaceC41864gz8 {

    /* renamed from: f */
    public final Exception f115481f;

    /* renamed from: g */
    public final boolean f115482g;

    public C50875wB8(String str, InterfaceC41864gz8 interfaceC41864gz8, EC8 ec8, boolean z) {
        super(str, interfaceC41864gz8, ec8);
        this.f115481f = interfaceC41864gz8.zze();
        this.f115482g = z;
    }

    @Override // p000.PC8
    /* renamed from: D2 */
    public final PC8 mo7268D2(String str, EC8 ec8) {
        return mo7267T0(str, ec8, true);
    }

    @Override // p000.InterfaceC41864gz8
    /* renamed from: T0 */
    public final PC8 mo7267T0(String str, EC8 ec8, boolean z) {
        if (z && !this.f115482g) {
            J38 j38 = FE8.f9066a;
        }
        boolean z2 = true;
        if ((!z || this.f115482g) && !this.f115482g) {
            z2 = false;
        }
        return new C50875wB8(str, this, ec8, z2);
    }

    @Override // p000.InterfaceC41864gz8
    public final Exception zze() {
        return this.f115481f;
    }

    public C50875wB8(String str, EC8 ec8, boolean z) {
        super(str, C32782Ez8.m108153b().m108152c(), ec8);
        this.f115481f = C43761kB8.f94062f;
        this.f115482g = z;
    }
}
