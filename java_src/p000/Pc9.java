package p000;
/* renamed from: Pc9 */
/* loaded from: classes5.dex */
public final class Pc9 implements Ic9 {

    /* renamed from: a */
    public static final AbstractC44354lB8 f28750a;

    /* renamed from: b */
    public static final AbstractC44354lB8 f28751b;

    /* renamed from: c */
    public static final AbstractC44354lB8 f28752c;

    /* renamed from: d */
    public static final AbstractC44354lB8 f28753d;

    static {
        C35824Rz8 m86143a = new C35824Rz8(C38279ay8.m65187a("com.google.android.gms.measurement")).m86143a();
        f28750a = m86143a.m86138f("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f28751b = m86143a.m86138f("measurement.audience.refresh_event_count_filters_timestamp", false);
        f28752c = m86143a.m86138f("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f28753d = m86143a.m86138f("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // p000.Ic9
    public final boolean zza() {
        return true;
    }

    @Override // p000.Ic9
    public final boolean zzb() {
        return ((Boolean) f28751b.m27685b()).booleanValue();
    }

    @Override // p000.Ic9
    public final boolean zzc() {
        return ((Boolean) f28752c.m27685b()).booleanValue();
    }

    @Override // p000.Ic9
    public final boolean zzd() {
        return ((Boolean) f28753d.m27685b()).booleanValue();
    }
}
