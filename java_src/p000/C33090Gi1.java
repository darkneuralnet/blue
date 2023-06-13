package p000;

import com.google.crypto.tink.shaded.protobuf.C18219m;
/* renamed from: Gi1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33090Gi1 {

    /* renamed from: a */
    public static final Class<?> f12284a = m104874c();

    /* renamed from: a */
    public static C18219m m104876a() {
        C18219m m104875b = m104875b("getEmptyRegistry");
        if (m104875b == null) {
            return C18219m.f74180d;
        }
        return m104875b;
    }

    /* renamed from: b */
    public static final C18219m m104875b(String str) {
        Class<?> cls = f12284a;
        if (cls == null) {
            return null;
        }
        try {
            return (C18219m) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static Class<?> m104874c() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
