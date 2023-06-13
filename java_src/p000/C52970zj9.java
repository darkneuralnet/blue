package p000;
/* renamed from: zj9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52970zj9 implements InterfaceC48820sj9 {

    /* renamed from: a */
    public static final AbstractC44354lB8 f122129a;

    /* renamed from: b */
    public static final AbstractC44354lB8 f122130b;

    /* renamed from: c */
    public static final AbstractC44354lB8 f122131c;

    /* renamed from: d */
    public static final AbstractC44354lB8 f122132d;

    /* renamed from: e */
    public static final AbstractC44354lB8 f122133e;

    /* renamed from: f */
    public static final AbstractC44354lB8 f122134f;

    /* renamed from: g */
    public static final AbstractC44354lB8 f122135g;

    /* renamed from: h */
    public static final AbstractC44354lB8 f122136h;

    /* renamed from: i */
    public static final AbstractC44354lB8 f122137i;

    /* renamed from: j */
    public static final AbstractC44354lB8 f122138j;

    /* renamed from: k */
    public static final AbstractC44354lB8 f122139k;

    /* renamed from: l */
    public static final AbstractC44354lB8 f122140l;

    /* renamed from: m */
    public static final AbstractC44354lB8 f122141m;

    /* renamed from: n */
    public static final AbstractC44354lB8 f122142n;

    static {
        C35824Rz8 m86143a = new C35824Rz8(C38279ay8.m65187a("com.google.android.gms.measurement")).m86142b().m86143a();
        f122129a = m86143a.m86138f("measurement.redaction.app_instance_id", true);
        f122130b = m86143a.m86138f("measurement.redaction.client_ephemeral_aiid_generation", true);
        f122131c = m86143a.m86138f("measurement.redaction.config_redacted_fields", true);
        f122132d = m86143a.m86138f("measurement.redaction.device_info", true);
        f122133e = m86143a.m86138f("measurement.redaction.e_tag", true);
        f122134f = m86143a.m86138f("measurement.redaction.enhanced_uid", true);
        f122135g = m86143a.m86138f("measurement.redaction.populate_ephemeral_app_instance_id", true);
        f122136h = m86143a.m86138f("measurement.redaction.google_signals", true);
        f122137i = m86143a.m86138f("measurement.redaction.no_aiid_in_config_request", true);
        f122138j = m86143a.m86138f("measurement.redaction.retain_major_os_version", true);
        f122139k = m86143a.m86138f("measurement.redaction.scion_payload_generator", true);
        f122140l = m86143a.m86138f("measurement.redaction.upload_redacted_fields", true);
        f122141m = m86143a.m86138f("measurement.redaction.upload_subdomain_override", true);
        f122142n = m86143a.m86138f("measurement.redaction.user_id", true);
    }

    @Override // p000.InterfaceC48820sj9
    public final boolean zza() {
        return ((Boolean) f122138j.m27685b()).booleanValue();
    }

    @Override // p000.InterfaceC48820sj9
    public final boolean zzb() {
        return ((Boolean) f122139k.m27685b()).booleanValue();
    }
}
