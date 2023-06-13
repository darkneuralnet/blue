package p000;
/* renamed from: SF7 */
/* loaded from: classes5.dex */
public final class SF7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final SF7 zzb;
    private int zze;
    private float zzg;
    private String zzf = "";
    private InterfaceC45964nu7 zzh = AbstractC40627eu7.m42399s();
    private InterfaceC45964nu7 zzi = AbstractC40627eu7.m42399s();

    static {
        SF7 sf7 = new SF7();
        zzb = sf7;
        AbstractC40627eu7.m42395x(SF7.class, sf7);
    }

    private SF7() {
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
                        return zzb;
                    }
                    return new RF7(null);
                }
                return new SF7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0000\u0005\u0000\u0000\u0001\u007f\u0005\u0000\u0002\u0000\u0001\f\u0002Ȉ\u0003\u0001\u0004Ț\u007fȚ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
