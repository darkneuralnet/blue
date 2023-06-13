package p000;

import com.google.android.gms.internal.vision.C17553F;
/* renamed from: QE8 */
/* loaded from: classes6.dex */
public final class QE8 {

    /* renamed from: a */
    public static final AbstractC50309vE8<?> f30094a = new C17553F();

    /* renamed from: b */
    public static final AbstractC50309vE8<?> f30095b = m88701c();

    /* renamed from: a */
    public static AbstractC50309vE8<?> m88703a() {
        return f30094a;
    }

    /* renamed from: b */
    public static AbstractC50309vE8<?> m88702b() {
        AbstractC50309vE8<?> abstractC50309vE8 = f30095b;
        if (abstractC50309vE8 != null) {
            return abstractC50309vE8;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: c */
    public static AbstractC50309vE8<?> m88701c() {
        try {
            return (AbstractC50309vE8) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
