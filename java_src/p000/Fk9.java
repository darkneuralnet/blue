package p000;
/* renamed from: Fk9 */
/* loaded from: classes5.dex */
public final class Fk9 implements InterfaceC52980zk9 {

    /* renamed from: a */
    public static final AbstractC44354lB8 f10061a;

    /* renamed from: b */
    public static final AbstractC44354lB8 f10062b;

    /* renamed from: c */
    public static final AbstractC44354lB8 f10063c;

    /* renamed from: d */
    public static final AbstractC44354lB8 f10064d;

    static {
        C35824Rz8 m86143a = new C35824Rz8(C38279ay8.m65187a("com.google.android.gms.measurement")).m86142b().m86143a();
        f10061a = m86143a.m86138f("measurement.collection.enable_session_stitching_token.client.dev", true);
        f10062b = m86143a.m86138f("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        f10063c = m86143a.m86138f("measurement.session_stitching_token_enabled", false);
        f10064d = m86143a.m86138f("measurement.link_sst_to_sid", false);
    }

    @Override // p000.InterfaceC52980zk9
    public final boolean zza() {
        return true;
    }

    @Override // p000.InterfaceC52980zk9
    public final boolean zzb() {
        return ((Boolean) f10061a.m27685b()).booleanValue();
    }

    @Override // p000.InterfaceC52980zk9
    public final boolean zzc() {
        return ((Boolean) f10062b.m27685b()).booleanValue();
    }

    @Override // p000.InterfaceC52980zk9
    public final boolean zzd() {
        return ((Boolean) f10063c.m27685b()).booleanValue();
    }

    @Override // p000.InterfaceC52980zk9
    public final boolean zze() {
        return ((Boolean) f10064d.m27685b()).booleanValue();
    }
}
