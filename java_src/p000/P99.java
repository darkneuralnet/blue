package p000;
/* renamed from: P99 */
/* loaded from: classes5.dex */
public final class P99 {

    /* renamed from: a */
    public static final U89 f28037a = new I99();

    /* renamed from: b */
    public static final U89 f28038b;

    static {
        U89 u89;
        try {
            u89 = (U89) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            u89 = null;
        }
        f28038b = u89;
    }

    /* renamed from: a */
    public static U89 m90620a() {
        U89 u89 = f28038b;
        if (u89 != null) {
            return u89;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    public static U89 m90619b() {
        return f28037a;
    }
}
