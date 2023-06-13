package p000;
/* renamed from: U49 */
/* loaded from: classes6.dex */
public final class U49 extends V78 implements InterfaceC48227rj8 {
    private static final U49 zza;
    private int zzd;
    private String zze = "";
    private AbstractC41604gZ7 zzf;
    private String zzg;
    private AbstractC41604gZ7 zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private int zzm;

    static {
        U49 u49 = new U49();
        zza = u49;
        V78.m80336w(U49.class, u49);
    }

    private U49() {
        AbstractC41604gZ7 abstractC41604gZ7 = AbstractC41604gZ7.f82424c;
        this.zzf = abstractC41604gZ7;
        this.zzg = "";
        this.zzh = abstractC41604gZ7;
        this.zzi = 0.25f;
        this.zzj = 0.25f;
        this.zzk = 0.5f;
        this.zzl = 0.85f;
        this.zzm = 1;
    }

    /* renamed from: H */
    public static C50498vZ8 m82005H() {
        return (C50498vZ8) zza.m80351f();
    }

    /* renamed from: J */
    public static /* synthetic */ void m82003J(U49 u49, AbstractC41604gZ7 abstractC41604gZ7) {
        abstractC41604gZ7.getClass();
        u49.zzd |= 2;
        u49.zzf = abstractC41604gZ7;
    }

    /* renamed from: K */
    public static /* synthetic */ void m82002K(U49 u49, AbstractC41604gZ7 abstractC41604gZ7) {
        abstractC41604gZ7.getClass();
        u49.zzd |= 8;
        u49.zzh = abstractC41604gZ7;
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
                    return new C50498vZ8(null);
                }
                return new U49();
            }
            return V78.m80339t(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tင\b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        return (byte) 1;
    }
}
