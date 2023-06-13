package p000;
/* renamed from: mi9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45253mi9 implements InterfaceC40509ei9 {

    /* renamed from: a */
    public static final AbstractC44354lB8 f98604a;

    /* renamed from: b */
    public static final AbstractC44354lB8 f98605b;

    /* renamed from: c */
    public static final AbstractC44354lB8 f98606c;

    /* renamed from: d */
    public static final AbstractC44354lB8 f98607d;

    /* renamed from: e */
    public static final AbstractC44354lB8 f98608e;

    static {
        C35824Rz8 m86143a = new C35824Rz8(C38279ay8.m65187a("com.google.android.gms.measurement")).m86143a();
        f98604a = m86143a.m86138f("measurement.test.boolean_flag", false);
        f98605b = m86143a.m86141c("measurement.test.double_flag", -3.0d);
        f98606c = m86143a.m86140d("measurement.test.int_flag", -2L);
        f98607d = m86143a.m86140d("measurement.test.long_flag", -1L);
        f98608e = m86143a.m86139e("measurement.test.string_flag", "---");
    }

    @Override // p000.InterfaceC40509ei9
    public final double zza() {
        return ((Double) f98605b.m27685b()).doubleValue();
    }

    @Override // p000.InterfaceC40509ei9
    public final long zzb() {
        return ((Long) f98606c.m27685b()).longValue();
    }

    @Override // p000.InterfaceC40509ei9
    public final long zzc() {
        return ((Long) f98607d.m27685b()).longValue();
    }

    @Override // p000.InterfaceC40509ei9
    public final String zzd() {
        return (String) f98608e.m27685b();
    }

    @Override // p000.InterfaceC40509ei9
    public final boolean zze() {
        return ((Boolean) f98604a.m27685b()).booleanValue();
    }
}
