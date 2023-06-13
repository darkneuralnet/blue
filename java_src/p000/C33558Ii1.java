package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18221n;
import com.google.crypto.tink.shaded.protobuf.C18222o;
/* renamed from: Ii1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33558Ii1 {

    /* renamed from: a */
    public static final AbstractC18221n<?> f16101a = new C18222o();

    /* renamed from: b */
    public static final AbstractC18221n<?> f16102b = m101758c();

    /* renamed from: a */
    public static AbstractC18221n<?> m101760a() {
        AbstractC18221n<?> abstractC18221n = f16102b;
        if (abstractC18221n != null) {
            return abstractC18221n;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    public static AbstractC18221n<?> m101759b() {
        return f16101a;
    }

    /* renamed from: c */
    public static AbstractC18221n<?> m101758c() {
        try {
            return (AbstractC18221n) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
