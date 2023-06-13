package p000;
/* renamed from: b83  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C38373b83 {

    /* renamed from: a */
    public static final Y73 f56966a = m64931c();

    /* renamed from: b */
    public static final Y73 f56967b = new C37780a83();

    /* renamed from: a */
    public static Y73 m64933a() {
        return f56966a;
    }

    /* renamed from: b */
    public static Y73 m64932b() {
        return f56967b;
    }

    /* renamed from: c */
    public static Y73 m64931c() {
        try {
            return (Y73) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
