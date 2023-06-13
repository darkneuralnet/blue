package p000;
/* renamed from: G28 */
/* loaded from: classes6.dex */
public final class G28 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final G28 zzb;
    private int zze;
    private boolean zzf;

    static {
        G28 g28 = new G28();
        zzb = g28;
        AbstractC40627eu7.m42395x(G28.class, g28);
    }

    private G28() {
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
                    return new C48415s28(null);
                }
                return new G28();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }
}
