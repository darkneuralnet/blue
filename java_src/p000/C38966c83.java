package p000;

import com.google.crypto.tink.shaded.protobuf.C18154J;
/* renamed from: c83  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C38966c83 {

    /* renamed from: a */
    public static final Z73 f60183a = m61910c();

    /* renamed from: b */
    public static final Z73 f60184b = new C18154J();

    /* renamed from: a */
    public static Z73 m61912a() {
        return f60183a;
    }

    /* renamed from: b */
    public static Z73 m61911b() {
        return f60184b;
    }

    /* renamed from: c */
    public static Z73 m61910c() {
        try {
            return (Z73) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
