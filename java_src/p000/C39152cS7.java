package p000;
/* renamed from: cS7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39152cS7 {

    /* renamed from: a */
    public static final InterfaceC51611xR7 f60683a = m61296c();

    /* renamed from: b */
    public static final InterfaceC51611xR7 f60684b = new C47471qS7();

    /* renamed from: a */
    public static InterfaceC51611xR7 m61298a() {
        return f60683a;
    }

    /* renamed from: b */
    public static InterfaceC51611xR7 m61297b() {
        return f60684b;
    }

    /* renamed from: c */
    public static InterfaceC51611xR7 m61296c() {
        try {
            return (InterfaceC51611xR7) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
