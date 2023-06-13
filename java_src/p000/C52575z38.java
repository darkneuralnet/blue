package p000;
/* renamed from: z38  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52575z38 {

    /* renamed from: a */
    public static final W28 f120710a = new C45461n38();

    /* renamed from: b */
    public static final W28 f120711b;

    static {
        W28 w28;
        try {
            w28 = (W28) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            w28 = null;
        }
        f120711b = w28;
    }

    /* renamed from: a */
    public static W28 m1860a() {
        W28 w28 = f120711b;
        if (w28 != null) {
            return w28;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    public static W28 m1859b() {
        return f120710a;
    }
}
