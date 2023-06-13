package p000;
/* renamed from: Wk9 */
/* loaded from: classes5.dex */
public final class Wk9 implements Qk9 {

    /* renamed from: a */
    public static final AbstractC44354lB8 f42048a;

    /* renamed from: b */
    public static final AbstractC44354lB8 f42049b;

    /* renamed from: c */
    public static final AbstractC44354lB8 f42050c;

    /* renamed from: d */
    public static final AbstractC44354lB8 f42051d;

    /* renamed from: e */
    public static final AbstractC44354lB8 f42052e;

    static {
        C35824Rz8 m86143a = new C35824Rz8(C38279ay8.m65187a("com.google.android.gms.measurement")).m86142b().m86143a();
        f42048a = m86143a.m86138f("measurement.client.sessions.background_sessions_enabled", true);
        f42049b = m86143a.m86138f("measurement.client.sessions.enable_fix_background_engagement", false);
        f42050c = m86143a.m86138f("measurement.client.sessions.immediate_start_enabled_foreground", true);
        f42051d = m86143a.m86138f("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        f42052e = m86143a.m86138f("measurement.client.sessions.session_id_enabled", true);
    }

    @Override // p000.Qk9
    public final boolean zza() {
        return ((Boolean) f42049b.m27685b()).booleanValue();
    }
}
