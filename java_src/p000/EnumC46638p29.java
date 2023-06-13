package p000;
/* renamed from: p29  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC46638p29 implements InterfaceC38308b18 {
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
    public final int f103048b;

    EnumC46638p29(int i) {
        this.f103048b = i;
    }

    @Override // p000.InterfaceC38308b18
    public final int zza() {
        return this.f103048b;
    }
}
