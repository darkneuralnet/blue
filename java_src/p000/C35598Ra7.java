package p000;
/* renamed from: Ra7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35598Ra7 {

    /* renamed from: a */
    public static final AbstractC35130Pa7 f32253a = new C35364Qa7();

    /* renamed from: b */
    public static final AbstractC35130Pa7 f32254b;

    static {
        AbstractC35130Pa7 abstractC35130Pa7;
        try {
            abstractC35130Pa7 = (AbstractC35130Pa7) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            abstractC35130Pa7 = null;
        }
        f32254b = abstractC35130Pa7;
    }

    /* renamed from: a */
    public static AbstractC35130Pa7 m86595a() {
        AbstractC35130Pa7 abstractC35130Pa7 = f32254b;
        if (abstractC35130Pa7 != null) {
            return abstractC35130Pa7;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    public static AbstractC35130Pa7 m86594b() {
        return f32253a;
    }
}
