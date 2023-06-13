package p000;

import com.google.android.gms.internal.places.C17527a;
/* renamed from: Ft7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32961Ft7 {

    /* renamed from: a */
    public static final Class<?> f10458a = m106288a();

    /* renamed from: a */
    public static Class<?> m106288a() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static C17527a m106287b() {
        Class<?> cls = f10458a;
        if (cls != null) {
            try {
                return (C17527a) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
            }
        }
        return C17527a.f71145d;
    }
}
