package p000;
/* renamed from: tK8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC49178tK8 implements KV7 {
    UNKNOWN_FORMAT(0),
    NV16(1),
    NV21(2),
    YV12(3),
    YUV_420_888(7),
    JPEG(8),
    BITMAP(4),
    CM_SAMPLE_BUFFER_REF(5),
    UI_IMAGE(6),
    CV_PIXEL_BUFFER_REF(9);
    

    /* renamed from: b */
    public final int f110317b;

    EnumC49178tK8(int i) {
        this.f110317b = i;
    }

    @Override // p000.KV7
    public final int zza() {
        return this.f110317b;
    }
}
