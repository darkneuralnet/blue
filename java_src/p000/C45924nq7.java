package p000;
/* renamed from: nq7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45924nq7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C45924nq7 zzb;
    private int zze;
    private double zzf;
    private double zzg;

    static {
        C45924nq7 c45924nq7 = new C45924nq7();
        zzb = c45924nq7;
        AbstractC40627eu7.m42395x(C45924nq7.class, c45924nq7);
    }

    private C45924nq7() {
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
                    return new C45331mq7(null);
                }
                return new C45924nq7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
