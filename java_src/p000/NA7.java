package p000;
/* renamed from: NA7 */
/* loaded from: classes5.dex */
public final class NA7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final NA7 zzb;
    private int zze;
    private Object zzg;
    private int zzf = 0;
    private byte zzh = 2;

    static {
        NA7 na7 = new NA7();
        zzb = na7;
        AbstractC40627eu7.m42395x(NA7.class, na7);
    }

    private NA7() {
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
                    return new IA7(null);
                }
                return new NA7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᐼ\u0000\u0002ᐼ\u0000\u0003ᐼ\u0000", new Object[]{"zzg", "zzf", "zze", MA7.class, C35031Op7.class, C48286rp7.class});
        }
        return Byte.valueOf(this.zzh);
    }
}
