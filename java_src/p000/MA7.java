package p000;
/* renamed from: MA7 */
/* loaded from: classes5.dex */
public final class MA7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final MA7 zzb;
    private int zze;
    private C35031Op7 zzg;
    private byte zzh = 2;
    private InterfaceC45964nu7 zzf = AbstractC40627eu7.m42399s();

    static {
        MA7 ma7 = new MA7();
        zzb = ma7;
        AbstractC40627eu7.m42395x(MA7.class, ma7);
    }

    private MA7() {
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
                    return new LA7(null);
                }
                return new MA7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000", new Object[]{"zze", "zzf", KA7.class, "zzg"});
        }
        return Byte.valueOf(this.zzh);
    }
}
