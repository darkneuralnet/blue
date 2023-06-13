package p000;
/* renamed from: yG7 */
/* loaded from: classes5.dex */
public final class C52105yG7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C52105yG7 zzb;
    private int zze;
    private int zzf;
    private int zzh;
    private boolean zzi;
    private byte zzj = 2;
    private InterfaceC45964nu7 zzg = AbstractC40627eu7.m42399s();

    static {
        C52105yG7 c52105yG7 = new C52105yG7();
        zzb = c52105yG7;
        AbstractC40627eu7.m42395x(C52105yG7.class, c52105yG7);
    }

    private C52105yG7() {
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
                            this.zzj = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new C51512xG7(null);
                }
                return new C52105yG7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0001\u0002\u0003ᔄ\u0000\u0004Л\u0005င\u0001\u0006ဇ\u0002", new Object[]{"zze", "zzf", "zzg", CG7.class, "zzh", "zzi"});
        }
        return Byte.valueOf(this.zzj);
    }
}
