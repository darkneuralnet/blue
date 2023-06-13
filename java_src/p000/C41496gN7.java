package p000;
/* renamed from: gN7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41496gN7 {

    /* renamed from: a */
    public static final Class<?> f82082a = m39545a();

    /* renamed from: a */
    public static Class<?> m39545a() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static C50982wN7 m39544b() {
        Class<?> cls = f82082a;
        if (cls != null) {
            try {
                return (C50982wN7) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
            }
        }
        return C50982wN7.f115877c;
    }
}
