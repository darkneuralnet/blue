package p000;
/* renamed from: KA7 */
/* loaded from: classes5.dex */
public final class KA7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final KA7 zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private byte zzh = 2;

    static {
        KA7 ka7 = new KA7();
        zzb = ka7;
        AbstractC40627eu7.m42395x(KA7.class, ka7);
    }

    private KA7() {
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
                            this.zzh = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new JA7(null);
                }
                return new KA7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return Byte.valueOf(this.zzh);
    }
}
