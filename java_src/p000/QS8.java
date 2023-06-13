package p000;
/* renamed from: QS8 */
/* loaded from: classes5.dex */
public enum QS8 implements InterfaceC47444qP7 {
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
    public final int f30409b;

    QS8(int i) {
        this.f30409b = i;
    }

    @Override // p000.InterfaceC47444qP7
    public final int zza() {
        return this.f30409b;
    }
}
