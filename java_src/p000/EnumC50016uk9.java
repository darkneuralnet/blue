package p000;
/* renamed from: uk9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC50016uk9 implements InterfaceC38308b18 {
    UNRECOGNIZED(0),
    CODE_128(1),
    CODE_39(2),
    CODE_93(3),
    CODABAR(4),
    DATA_MATRIX(5),
    EAN_13(6),
    EAN_8(7),
    ITF(8),
    QR_CODE(9),
    UPC_A(10),
    UPC_E(11),
    PDF417(12),
    AZTEC(13),
    DATABAR(14),
    TEZ_CODE(16);
    

    /* renamed from: b */
    public final int f112851b;

    EnumC50016uk9(int i) {
        this.f112851b = i;
    }

    @Override // p000.InterfaceC38308b18
    public final int zza() {
        return this.f112851b;
    }
}
