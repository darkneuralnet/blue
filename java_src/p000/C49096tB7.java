package p000;
/* renamed from: tB7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49096tB7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C49096tB7 zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh = 1;
    private int zzi = 1;

    static {
        C49096tB7 c49096tB7 = new C49096tB7();
        zzb = c49096tB7;
        AbstractC40627eu7.m42395x(C49096tB7.class, c49096tB7);
    }

    private C49096tB7() {
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
                    return new C48503sB7(null);
                }
                return new C49096tB7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
