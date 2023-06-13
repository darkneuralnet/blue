package p000;
/* renamed from: Yf9 */
/* loaded from: classes5.dex */
public final class Yf9 implements Rf9 {

    /* renamed from: a */
    public static final AbstractC44354lB8 f46270a;

    /* renamed from: b */
    public static final AbstractC44354lB8 f46271b;

    static {
        C35824Rz8 m86143a = new C35824Rz8(C38279ay8.m65187a("com.google.android.gms.measurement")).m86142b().m86143a();
        f46270a = m86143a.m86138f("measurement.item_scoped_custom_parameters.client", true);
        f46271b = m86143a.m86138f("measurement.item_scoped_custom_parameters.service", false);
    }

    @Override // p000.Rf9
    public final boolean zza() {
        return true;
    }

    @Override // p000.Rf9
    public final boolean zzb() {
        return ((Boolean) f46270a.m27685b()).booleanValue();
    }

    @Override // p000.Rf9
    public final boolean zzc() {
        return ((Boolean) f46271b.m27685b()).booleanValue();
    }
}
