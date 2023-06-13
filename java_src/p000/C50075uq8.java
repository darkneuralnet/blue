package p000;

import java.util.List;
/* renamed from: uq8 */
/* loaded from: classes5.dex */
public final class C50075uq8 extends AbstractC46897pU8 implements A19 {
    private static final C50075uq8 zza;
    private NV8 zzd = AbstractC46897pU8.m19202q();

    static {
        C50075uq8 c50075uq8 = new C50075uq8();
        zza = c50075uq8;
        AbstractC46897pU8.m19196w(C50075uq8.class, c50075uq8);
    }

    private C50075uq8() {
    }

    /* renamed from: D */
    public static C50075uq8 m9659D() {
        return zza;
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
                    return new C48297rq8(null);
                }
                return new C50075uq8();
            }
            return AbstractC46897pU8.m19199t(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C36679Vq8.class});
        }
        return (byte) 1;
    }

    /* renamed from: B */
    public final int m9661B() {
        return this.zzd.size();
    }

    /* renamed from: E */
    public final List m9658E() {
        return this.zzd;
    }
}
