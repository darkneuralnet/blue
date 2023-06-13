package p000;
/* renamed from: FG7 */
/* loaded from: classes5.dex */
public final class FG7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final FG7 zzb;
    private int zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private byte zzj = 2;

    static {
        FG7 fg7 = new FG7();
        zzb = fg7;
        AbstractC40627eu7.m42395x(FG7.class, fg7);
    }

    private FG7() {
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
                            this.zzj = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new EG7(null);
                }
                return new FG7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᔁ\u0000\u0002ᔁ\u0001\u0003ᔁ\u0002\u0004ᔁ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return Byte.valueOf(this.zzj);
    }
}
