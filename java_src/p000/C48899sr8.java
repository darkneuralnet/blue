package p000;

import java.util.List;
/* renamed from: sr8 */
/* loaded from: classes5.dex */
public final class C48899sr8 extends AbstractC46897pU8 implements A19 {
    private static final C48899sr8 zza;
    private int zzd;
    private NV8 zze = AbstractC46897pU8.m19202q();
    private C50075uq8 zzf;

    static {
        C48899sr8 c48899sr8 = new C48899sr8();
        zza = c48899sr8;
        AbstractC46897pU8.m19196w(C48899sr8.class, c48899sr8);
    }

    private C48899sr8() {
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
                    return new C41784gr8(null);
                }
                return new C48899sr8();
            }
            return AbstractC46897pU8.m19199t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzd", "zze", C32485Ds8.class, "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: B */
    public final C50075uq8 m13567B() {
        C50075uq8 c50075uq8 = this.zzf;
        return c50075uq8 == null ? C50075uq8.m9659D() : c50075uq8;
    }

    /* renamed from: D */
    public final List m13565D() {
        return this.zze;
    }
}
