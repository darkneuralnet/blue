package p000;
/* renamed from: Jk9 */
/* loaded from: classes6.dex */
public final class Jk9 {

    /* renamed from: a */
    public static final AbstractC52387yk9<?> f18126a = new Ek9();

    /* renamed from: b */
    public static final AbstractC52387yk9<?> f18127b;

    static {
        AbstractC52387yk9<?> abstractC52387yk9;
        try {
            abstractC52387yk9 = (AbstractC52387yk9) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            abstractC52387yk9 = null;
        }
        f18127b = abstractC52387yk9;
    }

    /* renamed from: a */
    public static AbstractC52387yk9<?> m99869a() {
        AbstractC52387yk9<?> abstractC52387yk9 = f18127b;
        if (abstractC52387yk9 != null) {
            return abstractC52387yk9;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    public static AbstractC52387yk9<?> m99868b() {
        return f18126a;
    }
}
