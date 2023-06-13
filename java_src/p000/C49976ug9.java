package p000;
/* renamed from: ug9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49976ug9 implements InterfaceC45826ng9 {

    /* renamed from: a */
    public static final AbstractC44354lB8 f112758a;

    /* renamed from: b */
    public static final AbstractC44354lB8 f112759b;

    /* renamed from: c */
    public static final AbstractC44354lB8 f112760c;

    /* renamed from: d */
    public static final AbstractC44354lB8 f112761d;

    static {
        C35824Rz8 m86143a = new C35824Rz8(C38279ay8.m65187a("com.google.android.gms.measurement")).m86143a();
        f112758a = m86143a.m86138f("measurement.sdk.collection.enable_extend_user_property_size", true);
        f112759b = m86143a.m86138f("measurement.sdk.collection.last_deep_link_referrer2", true);
        f112760c = m86143a.m86138f("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f112761d = m86143a.m86140d("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // p000.InterfaceC45826ng9
    public final boolean zza() {
        return ((Boolean) f112760c.m27685b()).booleanValue();
    }
}
