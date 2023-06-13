package p000;

import com.google.android.gms.internal.places.C17529b;
/* renamed from: lv7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44788lv7 {

    /* renamed from: a */
    public static final AbstractC49521tu7<?> f96961a = new C17529b();

    /* renamed from: b */
    public static final AbstractC49521tu7<?> f96962b = m26669a();

    /* renamed from: a */
    public static AbstractC49521tu7<?> m26669a() {
        try {
            return (AbstractC49521tu7) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static AbstractC49521tu7<?> m26668b() {
        return f96961a;
    }

    /* renamed from: c */
    public static AbstractC49521tu7<?> m26667c() {
        AbstractC49521tu7<?> abstractC49521tu7 = f96962b;
        if (abstractC49521tu7 != null) {
            return abstractC49521tu7;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
