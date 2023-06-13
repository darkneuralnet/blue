package p000;
/* renamed from: Qg9 */
/* loaded from: classes5.dex */
public final class Qg9 implements Ig9 {

    /* renamed from: a */
    public static final AbstractC44354lB8 f30752a;

    /* renamed from: b */
    public static final AbstractC44354lB8 f30753b;

    /* renamed from: c */
    public static final AbstractC44354lB8 f30754c;

    static {
        C35824Rz8 m86143a = new C35824Rz8(C38279ay8.m65187a("com.google.android.gms.measurement")).m86143a();
        f30752a = m86143a.m86140d("measurement.id.lifecycle.app_in_background_parameter", 0L);
        f30753b = m86143a.m86138f("measurement.lifecycle.app_backgrounded_tracking", true);
        f30754c = m86143a.m86138f("measurement.lifecycle.app_in_background_parameter", false);
    }

    @Override // p000.Ig9
    public final boolean zza() {
        return ((Boolean) f30754c.m27685b()).booleanValue();
    }
}
