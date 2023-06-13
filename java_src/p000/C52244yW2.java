package p000;

import com.google.zxing.WriterException;
import java.util.Map;
/* renamed from: yW2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52244yW2 implements InterfaceC45592nH6 {

    /* renamed from: yW2$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C30605a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f119629a;

        static {
            int[] iArr = new int[EnumC7009Qx.values().length];
            f119629a = iArr;
            try {
                iArr[EnumC7009Qx.EAN_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f119629a[EnumC7009Qx.UPC_E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f119629a[EnumC7009Qx.EAN_13.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f119629a[EnumC7009Qx.UPC_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f119629a[EnumC7009Qx.QR_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f119629a[EnumC7009Qx.CODE_39.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f119629a[EnumC7009Qx.CODE_93.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f119629a[EnumC7009Qx.CODE_128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f119629a[EnumC7009Qx.ITF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f119629a[EnumC7009Qx.PDF_417.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f119629a[EnumC7009Qx.CODABAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f119629a[EnumC7009Qx.DATA_MATRIX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f119629a[EnumC7009Qx.AZTEC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // p000.InterfaceC45592nH6
    /* renamed from: a */
    public C1837ET mo3433a(String str, EnumC7009Qx enumC7009Qx, int i, int i2, Map<EnumC40431eb1, ?> map) throws WriterException {
        InterfaceC45592nH6 h81;
        switch (C30605a.f119629a[enumC7009Qx.ordinal()]) {
            case 1:
                h81 = new H81();
                break;
            case 2:
                h81 = new C42235hd6();
                break;
            case 3:
                h81 = new F81();
                break;
            case 4:
                h81 = new C38067ad6();
                break;
            case 5:
                h81 = new C47550qb4();
                break;
            case 6:
                h81 = new C34754Nl0();
                break;
            case 7:
                h81 = new C35222Pl0();
                break;
            case 8:
                h81 = new C34286Ll0();
                break;
            case 9:
                h81 = new C43287jP1();
                break;
            case 10:
                h81 = new C51481xD3();
                break;
            case 11:
                h81 = new C33818Jl0();
                break;
            case 12:
                h81 = new OS0();
                break;
            case 13:
                h81 = new C19638cv();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(enumC7009Qx)));
        }
        return h81.mo3433a(str, enumC7009Qx, i, i2, map);
    }
}
