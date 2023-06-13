package p000;
/* renamed from: bc9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38653bc9 implements Ub9 {

    /* renamed from: a */
    public static final AbstractC44354lB8 f57759a;

    /* renamed from: b */
    public static final AbstractC44354lB8 f57760b;

    /* renamed from: c */
    public static final AbstractC44354lB8 f57761c;

    static {
        C35824Rz8 m86143a = new C35824Rz8(C38279ay8.m65187a("com.google.android.gms.measurement")).m86142b().m86143a();
        f57759a = m86143a.m86138f("measurement.collection.event_safelist", true);
        f57760b = m86143a.m86138f("measurement.service.store_null_safelist", true);
        f57761c = m86143a.m86138f("measurement.service.store_safelist", true);
    }

    @Override // p000.Ub9
    public final boolean zza() {
        return true;
    }

    @Override // p000.Ub9
    public final boolean zzb() {
        return ((Boolean) f57760b.m27685b()).booleanValue();
    }

    @Override // p000.Ub9
    public final boolean zzc() {
        return ((Boolean) f57761c.m27685b()).booleanValue();
    }
}
