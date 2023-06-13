package p000;
/* renamed from: po8 */
/* loaded from: classes5.dex */
public final class C47091po8 extends AbstractC46897pU8 implements A19 {
    private static final C47091po8 zza;
    private int zzd;
    private int zze = 1;
    private NV8 zzf = AbstractC46897pU8.m19202q();

    static {
        C47091po8 c47091po8 = new C47091po8();
        zza = c47091po8;
        AbstractC46897pU8.m19196w(C47091po8.class, c47091po8);
    }

    private C47091po8() {
    }

    /* renamed from: B */
    public static C35482Qn8 m18669B() {
        return (C35482Qn8) zza.m19209i();
    }

    /* renamed from: D */
    public static /* synthetic */ void m18667D(C47091po8 c47091po8, C35221Pk8 c35221Pk8) {
        c35221Pk8.getClass();
        NV8 nv8 = c47091po8.zzf;
        if (!nv8.zzc()) {
            c47091po8.zzf = AbstractC46897pU8.m19201r(nv8);
        }
        c47091po8.zzf.add(c35221Pk8);
    }

    @Override // p000.AbstractC46897pU8
    /* renamed from: A */
    public final Object mo8350A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new C35482Qn8(null);
                }
                return new C47091po8();
            }
            return AbstractC46897pU8.m19199t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zzd", "zze", C39975do8.f77246a, "zzf", C35221Pk8.class});
        }
        return (byte) 1;
    }
}
