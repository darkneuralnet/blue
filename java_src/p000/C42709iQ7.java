package p000;
/* renamed from: iQ7 */
/* loaded from: classes6.dex */
public final class C42709iQ7 extends V78 implements InterfaceC48227rj8 {
    private static final C42709iQ7 zza;
    private int zzd;
    private InterfaceC50263v98 zze = V78.m80345m();
    private InterfaceC50263v98 zzf = V78.m80345m();
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        C42709iQ7 c42709iQ7 = new C42709iQ7();
        zza = c42709iQ7;
        V78.m80336w(C42709iQ7.class, c42709iQ7);
    }

    private C42709iQ7() {
    }

    /* renamed from: H */
    public static C50883wC7 m33939H() {
        return (C50883wC7) zza.m80351f();
    }

    /* renamed from: J */
    public static /* synthetic */ void m33937J(C42709iQ7 c42709iQ7, int i) {
        c42709iQ7.zzd |= 2;
        c42709iQ7.zzh = i;
    }

    /* renamed from: K */
    public static /* synthetic */ void m33936K(C42709iQ7 c42709iQ7, float f) {
        InterfaceC50263v98 interfaceC50263v98 = c42709iQ7.zze;
        if (!interfaceC50263v98.zzc()) {
            c42709iQ7.zze = V78.m80344n(interfaceC50263v98);
        }
        c42709iQ7.zze.mo9066u0(f);
    }

    /* renamed from: L */
    public static /* synthetic */ void m33935L(C42709iQ7 c42709iQ7, float f) {
        InterfaceC50263v98 interfaceC50263v98 = c42709iQ7.zzf;
        if (!interfaceC50263v98.zzc()) {
            c42709iQ7.zzf = V78.m80344n(interfaceC50263v98);
        }
        c42709iQ7.zzf.mo9066u0(f);
    }

    /* renamed from: M */
    public static /* synthetic */ void m33934M(C42709iQ7 c42709iQ7, int i) {
        c42709iQ7.zzd |= 1;
        c42709iQ7.zzg = i;
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
                    return new C50883wC7(null);
                }
                return new C42709iQ7();
            }
            return V78.m80339t(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0013\u0002\u0013\u0003ဋ\u0000\u0004ဋ\u0001\u0005ဋ\u0002\u0006ဋ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
