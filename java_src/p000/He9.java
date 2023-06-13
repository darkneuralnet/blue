package p000;
/* renamed from: He9 */
/* loaded from: classes5.dex */
public final class He9 implements Ae9 {

    /* renamed from: a */
    public static final AbstractC44354lB8 f13714a;

    /* renamed from: b */
    public static final AbstractC44354lB8 f13715b;

    /* renamed from: c */
    public static final AbstractC44354lB8 f13716c;

    static {
        C35824Rz8 m86143a = new C35824Rz8(C38279ay8.m65187a("com.google.android.gms.measurement")).m86143a();
        f13714a = m86143a.m86138f("measurement.client.sessions.check_on_reset_and_enable2", true);
        f13715b = m86143a.m86138f("measurement.client.sessions.check_on_startup", true);
        f13716c = m86143a.m86138f("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // p000.Ae9
    public final boolean zza() {
        return true;
    }

    @Override // p000.Ae9
    public final boolean zzb() {
        return ((Boolean) f13714a.m27685b()).booleanValue();
    }
}
