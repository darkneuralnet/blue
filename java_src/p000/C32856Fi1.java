package p000;

import com.google.protobuf.C18525k;
/* renamed from: Fi1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32856Fi1 {

    /* renamed from: a */
    public static final Class<?> f9963a = m106736c();

    /* renamed from: a */
    public static C18525k m106738a() {
        C18525k m106737b = m106737b("getEmptyRegistry");
        if (m106737b == null) {
            return C18525k.f74836d;
        }
        return m106737b;
    }

    /* renamed from: b */
    public static final C18525k m106737b(String str) {
        Class<?> cls = f9963a;
        if (cls == null) {
            return null;
        }
        try {
            return (C18525k) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static Class<?> m106736c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
