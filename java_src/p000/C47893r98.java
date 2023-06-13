package p000;
/* renamed from: r98 */
/* loaded from: classes6.dex */
public final class C47893r98 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C47893r98 zzb;
    private int zze;
    private C42610iF7 zzf;
    private C48584sK7 zzg;
    private C50846w88 zzh;
    private boolean zzi;
    private byte zzj = 2;

    static {
        C47893r98 c47893r98 = new C47893r98();
        zzb = c47893r98;
        AbstractC40627eu7.m42395x(C47893r98.class, c47893r98);
    }

    private C47893r98() {
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
                    return new C38388b98(null);
                }
                return new C47893r98();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဇ\u0003\u0003ᐉ\u0002\u0004ဉ\u0001", new Object[]{"zze", "zzf", "zzi", "zzh", "zzg"});
        }
        return Byte.valueOf(this.zzj);
    }
}
