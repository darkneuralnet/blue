package p000;
/* renamed from: ol9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46469ol9 implements InterfaceC42911il9 {

    /* renamed from: a */
    public static final AbstractC44354lB8 f102456a;

    /* renamed from: b */
    public static final AbstractC44354lB8 f102457b;

    static {
        C35824Rz8 m86143a = new C35824Rz8(C38279ay8.m65187a("com.google.android.gms.measurement")).m86142b().m86143a();
        f102456a = m86143a.m86138f("measurement.sfmc.client", true);
        f102457b = m86143a.m86138f("measurement.sfmc.service", true);
    }

    @Override // p000.InterfaceC42911il9
    public final boolean zza() {
        return true;
    }

    @Override // p000.InterfaceC42911il9
    public final boolean zzb() {
        return ((Boolean) f102456a.m27685b()).booleanValue();
    }

    @Override // p000.InterfaceC42911il9
    public final boolean zzc() {
        return ((Boolean) f102457b.m27685b()).booleanValue();
    }
}
