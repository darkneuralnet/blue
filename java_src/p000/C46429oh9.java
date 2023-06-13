package p000;
/* renamed from: oh9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46429oh9 implements InterfaceC41685gh9 {

    /* renamed from: a */
    public static final AbstractC44354lB8 f102350a;

    /* renamed from: b */
    public static final AbstractC44354lB8 f102351b;

    static {
        C35824Rz8 m86143a = new C35824Rz8(C38279ay8.m65187a("com.google.android.gms.measurement")).m86142b().m86143a();
        f102350a = m86143a.m86138f("measurement.collection.client.log_target_api_version", true);
        f102351b = m86143a.m86138f("measurement.collection.service.log_target_api_version", true);
    }

    @Override // p000.InterfaceC41685gh9
    public final boolean zza() {
        return true;
    }

    @Override // p000.InterfaceC41685gh9
    public final boolean zzb() {
        return ((Boolean) f102350a.m27685b()).booleanValue();
    }

    @Override // p000.InterfaceC41685gh9
    public final boolean zzc() {
        return ((Boolean) f102351b.m27685b()).booleanValue();
    }
}
