package p000;
/* renamed from: mH7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45000mH7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C45000mH7 zzb;
    private int zze;
    private int zzf;
    private boolean zzi;
    private int zzg = 100;
    private int zzh = -100;
    private float zzj = 40.0f;

    static {
        C45000mH7 c45000mH7 = new C45000mH7();
        zzb = c45000mH7;
        AbstractC40627eu7.m42395x(C45000mH7.class, c45000mH7);
    }

    private C45000mH7() {
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
                    return new C44407lH7(null);
                }
                return new C45000mH7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ခ\u0004", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
