package p000;
/* renamed from: hh8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42277hh8 extends AbstractC46897pU8 implements A19 {
    private static final C42277hh8 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        C42277hh8 c42277hh8 = new C42277hh8();
        zza = c42277hh8;
        AbstractC46897pU8.m19196w(C42277hh8.class, c42277hh8);
    }

    private C42277hh8() {
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
                    return new C35653Rg8(null);
                }
                return new C42277hh8();
            }
            return AbstractC46897pU8.m19199t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
