package p000;
/* renamed from: y69  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC52013y69 implements InterfaceC47444qP7 {
    UNKNOWN(0),
    CANONICAL(1),
    TFLITE(2),
    TFLITE_SUPPORT(3);
    

    /* renamed from: b */
    public final int f118764b;

    EnumC52013y69(int i) {
        this.f118764b = i;
    }

    /* renamed from: a */
    public static EnumC52013y69 m4130a(int i) {
        EnumC52013y69[] values;
        for (EnumC52013y69 enumC52013y69 : values()) {
            if (enumC52013y69.f118764b == i) {
                return enumC52013y69;
            }
        }
        return UNKNOWN;
    }

    @Override // p000.InterfaceC47444qP7
    public final int zza() {
        return this.f118764b;
    }
}
