package p000;
/* renamed from: rp7 */
/* loaded from: classes5.dex */
public final class C48286rp7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C48286rp7 zzb;
    private int zze;
    private C47100pp7 zzf;
    private double zzg;
    private boolean zzh;
    private C35031Op7 zzi;
    private byte zzj = 2;

    static {
        C48286rp7 c48286rp7 = new C48286rp7();
        zzb = c48286rp7;
        AbstractC40627eu7.m42395x(C48286rp7.class, c48286rp7);
    }

    private C48286rp7() {
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
                    return new C47693qp7(null);
                }
                return new C48286rp7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002က\u0001\u0003ဇ\u0002\u0004ᐉ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return Byte.valueOf(this.zzj);
    }
}
