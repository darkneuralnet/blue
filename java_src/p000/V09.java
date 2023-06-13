package p000;
/* renamed from: V09 */
/* loaded from: classes5.dex */
public enum V09 implements InterfaceC41586gX7 {
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
    public final int f38432b;

    V09(int i) {
        this.f38432b = i;
    }

    @Override // p000.InterfaceC41586gX7
    public final int zza() {
        return this.f38432b;
    }
}
