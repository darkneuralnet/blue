package p000;
/* renamed from: xR8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51612xR8 {

    /* renamed from: a */
    public static final AbstractC39755dR8 f117622a = new C45684nR8();

    /* renamed from: b */
    public static final AbstractC39755dR8 f117623b;

    static {
        AbstractC39755dR8 abstractC39755dR8;
        try {
            abstractC39755dR8 = (AbstractC39755dR8) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            abstractC39755dR8 = null;
        }
        f117623b = abstractC39755dR8;
    }

    /* renamed from: a */
    public static AbstractC39755dR8 m5254a() {
        AbstractC39755dR8 abstractC39755dR8 = f117623b;
        if (abstractC39755dR8 != null) {
            return abstractC39755dR8;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    public static AbstractC39755dR8 m5253b() {
        return f117622a;
    }
}
