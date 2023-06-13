package p000;
/* renamed from: GA7 */
/* loaded from: classes5.dex */
public final class GA7 extends AbstractC38831bu7 {
    private static final GA7 zze;
    private int zzf;
    private double zzg;
    private int zzh;
    private int zzi;
    private double zzj;
    private double zzk;
    private byte zzl = 2;

    static {
        GA7 ga7 = new GA7();
        zze = ga7;
        AbstractC40627eu7.m42395x(GA7.class, ga7);
    }

    private GA7() {
    }

    @Override // p000.AbstractC40627eu7
    /* renamed from: B */
    public final Object mo5B(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (obj == null) {
                                b = 0;
                            }
                            this.zzl = b;
                            return null;
                        }
                        return zze;
                    }
                    return new FA7(null);
                }
                return new GA7();
            }
            return AbstractC40627eu7.m42396v(zze, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001က\u0000\u0002င\u0001\u0003င\u0002\u0004က\u0003\u0005က\u0004", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return Byte.valueOf(this.zzl);
    }
}
