package p000;
/* renamed from: b78  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38368b78 implements O38 {

    /* renamed from: b */
    public final int f56956b;

    /* renamed from: c */
    public final EnumC50737vx8 f56957c;

    public C38368b78(Q88 q88, int i, EnumC50737vx8 enumC50737vx8, boolean z, boolean z2) {
        this.f56956b = i;
        this.f56957c = enumC50737vx8;
    }

    @Override // p000.O38
    /* renamed from: B0 */
    public final InterfaceC35437Qi8 mo64937B0(InterfaceC35437Qi8 interfaceC35437Qi8, InterfaceC39926dj8 interfaceC39926dj8) {
        ((C43702k58) interfaceC35437Qi8).m29318h((V78) interfaceC39926dj8);
        return interfaceC35437Qi8;
    }

    @Override // p000.O38
    /* renamed from: I1 */
    public final InterfaceC48237rk8 mo64936I1(InterfaceC48237rk8 interfaceC48237rk8, InterfaceC48237rk8 interfaceC48237rk82) {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.f56956b - ((C38368b78) obj).f56956b;
    }

    @Override // p000.O38
    /* renamed from: x */
    public final boolean mo64935x() {
        return false;
    }

    @Override // p000.O38
    public final int zza() {
        return this.f56956b;
    }

    @Override // p000.O38
    public final EnumC50737vx8 zzd() {
        return this.f56957c;
    }

    @Override // p000.O38
    public final EnumC33466Hx8 zze() {
        return this.f56957c.m7706a();
    }

    @Override // p000.O38
    public final boolean zzg() {
        return false;
    }
}
