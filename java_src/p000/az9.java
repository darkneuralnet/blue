package p000;
/* renamed from: az9 */
/* loaded from: classes5.dex */
public enum az9 implements Z19 {
    DELEGATE_NONE(0),
    NNAPI(1),
    GPU(2),
    HEXAGON(3),
    EDGETPU(4),
    EDGETPU_CORAL(5),
    XNNPACK(6);
    

    /* renamed from: b */
    public final int f56759b;

    az9(int i) {
        this.f56759b = i;
    }

    @Override // p000.Z19
    public final int zza() {
        return this.f56759b;
    }
}
