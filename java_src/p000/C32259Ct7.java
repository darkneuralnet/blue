package p000;
/* renamed from: Ct7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32259Ct7 {

    /* renamed from: a */
    public static final AbstractC31791At7 f4866a = new C32025Bt7();

    /* renamed from: b */
    public static final AbstractC31791At7 f4867b;

    static {
        AbstractC31791At7 abstractC31791At7;
        try {
            abstractC31791At7 = (AbstractC31791At7) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            abstractC31791At7 = null;
        }
        f4867b = abstractC31791At7;
    }

    /* renamed from: a */
    public static AbstractC31791At7 m111376a() {
        AbstractC31791At7 abstractC31791At7 = f4867b;
        if (abstractC31791At7 != null) {
            return abstractC31791At7;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    public static AbstractC31791At7 m111375b() {
        return f4866a;
    }
}
