package p000;

import kotlin.text.Typography;
/* renamed from: Ps8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC35293Ps8 implements InterfaceC45010mI8 {
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
    

    /* renamed from: s */
    public static final WI8<EnumC35293Ps8> f29209s = new WI8<EnumC35293Ps8>() { // from class: As8
    };

    /* renamed from: b */
    public final int f29211b;

    EnumC35293Ps8(int i) {
        this.f29211b = i;
    }

    /* renamed from: a */
    public static EnumC35293Ps8 m89662a(int i) {
        switch (i) {
            case 0:
                return UNRECOGNIZED;
            case 1:
                return CODE_128;
            case 2:
                return CODE_39;
            case 3:
                return CODE_93;
            case 4:
                return CODABAR;
            case 5:
                return DATA_MATRIX;
            case 6:
                return EAN_13;
            case 7:
                return EAN_8;
            case 8:
                return ITF;
            case 9:
                return QR_CODE;
            case 10:
                return UPC_A;
            case 11:
                return UPC_E;
            case 12:
                return PDF417;
            case 13:
                return AZTEC;
            case 14:
                return DATABAR;
            case 15:
            default:
                return null;
            case 16:
                return TEZ_CODE;
        }
    }

    /* renamed from: b */
    public static KI8 m89661b() {
        return C40035du8.f77404a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + EnumC35293Ps8.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f29211b + " name=" + name() + Typography.greater;
    }

    @Override // p000.InterfaceC45010mI8
    public final int zza() {
        return this.f29211b;
    }
}
