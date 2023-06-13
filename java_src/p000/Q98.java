package p000;
/* renamed from: Q98 */
/* loaded from: classes5.dex */
public final class Q98 {

    /* renamed from: a */
    public static final AbstractC44335l98<?> f29909a = new B98();

    /* renamed from: b */
    public static final AbstractC44335l98<?> f29910b;

    static {
        AbstractC44335l98<?> abstractC44335l98;
        try {
            abstractC44335l98 = (AbstractC44335l98) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            abstractC44335l98 = null;
        }
        f29910b = abstractC44335l98;
    }

    /* renamed from: a */
    public static AbstractC44335l98<?> m88853a() {
        AbstractC44335l98<?> abstractC44335l98 = f29910b;
        if (abstractC44335l98 != null) {
            return abstractC44335l98;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    public static AbstractC44335l98<?> m88852b() {
        return f29909a;
    }
}
