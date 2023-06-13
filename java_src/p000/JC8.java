package p000;
/* renamed from: JC8 */
/* loaded from: classes5.dex */
public enum JC8 implements InterfaceC48246rl7 {
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
    public final int f17021b;

    JC8(int i) {
        this.f17021b = i;
    }

    @Override // p000.InterfaceC48246rl7
    public final int zza() {
        return this.f17021b;
    }
}
