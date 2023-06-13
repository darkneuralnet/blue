package p000;

import com.google.android.gms.internal.clearcut.C17496b;
/* renamed from: EO7 */
/* loaded from: classes5.dex */
public final class EO7 {

    /* renamed from: a */
    public static final LN7<?> f7409a = new C17496b();

    /* renamed from: b */
    public static final LN7<?> f7410b = m109049a();

    /* renamed from: a */
    public static LN7<?> m109049a() {
        try {
            return (LN7) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static LN7<?> m109048b() {
        return f7409a;
    }

    /* renamed from: c */
    public static LN7<?> m109047c() {
        LN7<?> ln7 = f7410b;
        if (ln7 != null) {
            return ln7;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
