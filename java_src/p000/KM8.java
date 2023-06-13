package p000;
/* renamed from: KM8 */
/* loaded from: classes5.dex */
public final class KM8 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final InterfaceC44778lu7 zzb = new PL8();
    private static final KM8 zze;
    private int zzf;
    private int zzh;
    private int zzg = 1;
    private int zzi = 4;
    private int zzj = 240;
    private InterfaceC44185ku7 zzk = AbstractC40627eu7.m42401q();

    static {
        KM8 km8 = new KM8();
        zze = km8;
        AbstractC40627eu7.m42395x(KM8.class, km8);
    }

    private KM8() {
    }

    /* renamed from: E */
    public static KM8 m98958E() {
        return zze;
    }

    @Override // p000.AbstractC40627eu7
    /* renamed from: B */
    public final Object mo5B(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zze;
                    }
                    return new C38506bM8(null);
                }
                return new KM8();
            }
            return AbstractC40627eu7.m42396v(zze, "\u0001\u0005\u0000\u0001\u0003\n\u0005\u0000\u0001\u0000\u0003ဌ\u0000\u0007င\u0001\bင\u0002\tင\u0003\n,", new Object[]{"zzf", "zzg", C52753zM8.f121139a, "zzh", "zzi", "zzj", "zzk", C45639nM8.f99826a});
        }
        return (byte) 1;
    }
}
