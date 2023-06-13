package p000;
/* renamed from: aQ8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37949aQ8 {

    /* renamed from: a */
    public static final EP8 f50452a = m71408c();

    /* renamed from: b */
    public static final EP8 f50453b = new C48630sP8();

    /* renamed from: a */
    public static EP8 m71410a() {
        return f50452a;
    }

    /* renamed from: b */
    public static EP8 m71409b() {
        return f50453b;
    }

    /* renamed from: c */
    public static EP8 m71408c() {
        try {
            return (EP8) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
