package p000;
/* renamed from: By */
/* loaded from: classes6.dex */
public final class C0777By extends V78<C0777By, FN8> implements InterfaceC48227rj8 {
    private static final C0777By zza;
    private int zzd;
    private C52052yA8 zze;
    private U49 zzf;

    static {
        C0777By c0777By = new C0777By();
        zza = c0777By;
        V78.m80336w(C0777By.class, c0777By);
    }

    private C0777By() {
    }

    /* renamed from: H */
    public static FN8 m113255H() {
        return (FN8) zza.m80351f();
    }

    /* renamed from: J */
    public static /* synthetic */ void m113253J(C0777By c0777By, C52052yA8 c52052yA8) {
        c52052yA8.getClass();
        c0777By.zze = c52052yA8;
        c0777By.zzd |= 1;
    }

    /* renamed from: K */
    public static /* synthetic */ void m113252K(C0777By c0777By, U49 u49) {
        u49.getClass();
        c0777By.zzf = u49;
        c0777By.zzd |= 2;
    }

    @Override // p000.V78
    /* renamed from: G */
    public final Object mo3770G(int i, Object obj, Object obj2) {
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
                    return new FN8(null);
                }
                return new C0777By();
            }
            return V78.m80339t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
