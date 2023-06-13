package p000;

import com.google.protobuf.AbstractC18527l;
import com.google.protobuf.C18528m;
/* renamed from: Hi1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33324Hi1 {

    /* renamed from: a */
    public static final AbstractC18527l<?> f13777a = new C18528m();

    /* renamed from: b */
    public static final AbstractC18527l<?> f13778b = m103515c();

    /* renamed from: a */
    public static AbstractC18527l<?> m103517a() {
        AbstractC18527l<?> abstractC18527l = f13778b;
        if (abstractC18527l != null) {
            return abstractC18527l;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    public static AbstractC18527l<?> m103516b() {
        return f13777a;
    }

    /* renamed from: c */
    public static AbstractC18527l<?> m103515c() {
        try {
            return (AbstractC18527l) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
