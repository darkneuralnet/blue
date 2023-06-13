package p000;

import kotlin.text.Typography;
/* renamed from: Ot8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC35068Ot8 implements InterfaceC45010mI8 {
    UNKNOWN_FORMAT(0),
    CONTACT_INFO(1),
    EMAIL(2),
    ISBN(3),
    PHONE(4),
    PRODUCT(5),
    SMS(6),
    TEXT(7),
    URL(8),
    WIFI(9),
    GEO(10),
    CALENDAR_EVENT(11),
    DRIVER_LICENSE(12),
    BOARDING_PASS(13);
    

    /* renamed from: q */
    public static final WI8<EnumC35068Ot8> f27550q = new WI8<EnumC35068Ot8>() { // from class: Eu8
    };

    /* renamed from: b */
    public final int f27552b;

    EnumC35068Ot8(int i) {
        this.f27552b = i;
    }

    /* renamed from: a */
    public static EnumC35068Ot8 m91203a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_FORMAT;
            case 1:
                return CONTACT_INFO;
            case 2:
                return EMAIL;
            case 3:
                return ISBN;
            case 4:
                return PHONE;
            case 5:
                return PRODUCT;
            case 6:
                return SMS;
            case 7:
                return TEXT;
            case 8:
                return URL;
            case 9:
                return WIFI;
            case 10:
                return GEO;
            case 11:
                return CALENDAR_EVENT;
            case 12:
                return DRIVER_LICENSE;
            case 13:
                return BOARDING_PASS;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static KI8 m91202b() {
        return C47744qu8.f106057a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + EnumC35068Ot8.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f27552b + " name=" + name() + Typography.greater;
    }

    @Override // p000.InterfaceC45010mI8
    public final int zza() {
        return this.f27552b;
    }
}
