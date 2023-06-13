package p000;
/* renamed from: df9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39887df9 implements Ve9 {

    /* renamed from: a */
    public static final AbstractC44354lB8 f77016a;

    /* renamed from: b */
    public static final AbstractC44354lB8 f77017b;

    /* renamed from: c */
    public static final AbstractC44354lB8 f77018c;

    /* renamed from: d */
    public static final AbstractC44354lB8 f77019d;

    static {
        C35824Rz8 m86143a = new C35824Rz8(C38279ay8.m65187a("com.google.android.gms.measurement")).m86142b().m86143a();
        f77016a = m86143a.m86138f("measurement.client.global_params", true);
        f77017b = m86143a.m86138f("measurement.service.global_params_in_payload", true);
        f77018c = m86143a.m86138f("measurement.service.clear_global_params_on_uninstall", true);
        f77019d = m86143a.m86138f("measurement.service.global_params", true);
    }

    @Override // p000.Ve9
    public final boolean zza() {
        return true;
    }

    @Override // p000.Ve9
    public final boolean zzb() {
        return ((Boolean) f77018c.m27685b()).booleanValue();
    }
}
