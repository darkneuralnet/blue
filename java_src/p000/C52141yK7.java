package p000;
/* renamed from: yK7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52141yK7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C52141yK7 zzb;
    private int zze;
    private float zzh;
    private String zzf = "en";
    private int zzg = -1;
    private InterfaceC45964nu7 zzi = AbstractC40627eu7.m42399s();
    private InterfaceC45964nu7 zzj = AbstractC40627eu7.m42399s();

    static {
        C52141yK7 c52141yK7 = new C52141yK7();
        zzb = c52141yK7;
        AbstractC40627eu7.m42395x(C52141yK7.class, c52141yK7);
    }

    private C52141yK7() {
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
                    return new C51548xK7(null);
                }
                return new C52141yK7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ခ\u0002\u0004\u001a\u0005\u001a", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
