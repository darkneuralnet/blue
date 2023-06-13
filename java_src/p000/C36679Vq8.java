package p000;

import java.util.List;
/* renamed from: Vq8 */
/* loaded from: classes5.dex */
public final class C36679Vq8 extends AbstractC46897pU8 implements A19 {
    private static final C36679Vq8 zza;
    private int zzd;
    private String zze = "";
    private NV8 zzf = AbstractC46897pU8.m19202q();

    static {
        C36679Vq8 c36679Vq8 = new C36679Vq8();
        zza = c36679Vq8;
        AbstractC46897pU8.m19196w(C36679Vq8.class, c36679Vq8);
    }

    private C36679Vq8() {
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
                    return new C33169Gq8(null);
                }
                return new C36679Vq8();
            }
            return AbstractC46897pU8.m19199t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzd", "zze", "zzf", C32485Ds8.class});
        }
        return (byte) 1;
    }

    /* renamed from: C */
    public final String m79342C() {
        return this.zze;
    }

    /* renamed from: D */
    public final List m79341D() {
        return this.zzf;
    }
}
