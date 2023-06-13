package p000;
/* renamed from: im9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42921im9 implements InterfaceC39346cm9 {

    /* renamed from: a */
    public static final AbstractC44354lB8 f87860a;

    /* renamed from: b */
    public static final AbstractC44354lB8 f87861b;

    static {
        C35824Rz8 m86143a = new C35824Rz8(C38279ay8.m65187a("com.google.android.gms.measurement")).m86142b().m86143a();
        f87860a = m86143a.m86138f("measurement.sgtm.client.dev", false);
        f87861b = m86143a.m86138f("measurement.sgtm.service", false);
    }

    @Override // p000.InterfaceC39346cm9
    public final boolean zza() {
        return true;
    }

    @Override // p000.InterfaceC39346cm9
    public final boolean zzb() {
        return ((Boolean) f87860a.m27685b()).booleanValue();
    }

    @Override // p000.InterfaceC39346cm9
    public final boolean zzc() {
        return ((Boolean) f87861b.m27685b()).booleanValue();
    }
}
