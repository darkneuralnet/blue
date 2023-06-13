package p000;
/* renamed from: cF7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39035cF7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C39035cF7 zzb;
    private int zze;
    private float zzf = 10.0f;
    private float zzg = 10.0f;
    private float zzh = 5.0f;
    private float zzi = 5.0f;
    private float zzj = 10.0f;
    private float zzk = 10.0f;

    static {
        C39035cF7 c39035cF7 = new C39035cF7();
        zzb = c39035cF7;
        AbstractC40627eu7.m42395x(C39035cF7.class, c39035cF7);
    }

    private C39035cF7() {
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
                    return new C38442bF7(null);
                }
                return new C39035cF7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
