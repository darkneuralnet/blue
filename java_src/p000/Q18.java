package p000;
/* renamed from: Q18 */
/* loaded from: classes5.dex */
public final class Q18 {

    /* renamed from: a */
    public static final InterfaceC46034o18 f29707a = m89107c();

    /* renamed from: b */
    public static final InterfaceC46034o18 f29708b = new C18();

    /* renamed from: a */
    public static InterfaceC46034o18 m89109a() {
        return f29707a;
    }

    /* renamed from: b */
    public static InterfaceC46034o18 m89108b() {
        return f29708b;
    }

    /* renamed from: c */
    public static InterfaceC46034o18 m89107c() {
        try {
            return (InterfaceC46034o18) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
