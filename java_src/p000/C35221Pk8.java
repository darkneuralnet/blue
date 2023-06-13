package p000;
/* renamed from: Pk8 */
/* loaded from: classes5.dex */
public final class C35221Pk8 extends AbstractC46897pU8 implements A19 {
    private static final C35221Pk8 zza;
    private int zzd;
    private String zze = "";
    private long zzf;

    static {
        C35221Pk8 c35221Pk8 = new C35221Pk8();
        zza = c35221Pk8;
        AbstractC46897pU8.m19196w(C35221Pk8.class, c35221Pk8);
    }

    private C35221Pk8() {
    }

    /* renamed from: B */
    public static C32413Dk8 m89874B() {
        return (C32413Dk8) zza.m19209i();
    }

    /* renamed from: D */
    public static /* synthetic */ void m89872D(C35221Pk8 c35221Pk8, String str) {
        str.getClass();
        c35221Pk8.zzd |= 1;
        c35221Pk8.zze = str;
    }

    /* renamed from: E */
    public static /* synthetic */ void m89871E(C35221Pk8 c35221Pk8, long j) {
        c35221Pk8.zzd |= 2;
        c35221Pk8.zzf = j;
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
                    return new C32413Dk8(null);
                }
                return new C35221Pk8();
            }
            return AbstractC46897pU8.m19199t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
