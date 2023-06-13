package p000;
/* renamed from: RL7 */
/* loaded from: classes6.dex */
public final class RL7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final RL7 zzb;
    private int zze;
    private NY8 zzf;
    private YZ8 zzg;
    private boolean zzh;
    private byte zzi = 2;

    static {
        RL7 rl7 = new RL7();
        zzb = rl7;
        AbstractC40627eu7.m42395x(RL7.class, rl7);
    }

    private RL7() {
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
                            this.zzi = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new BL7(null);
                }
                return new RL7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return Byte.valueOf(this.zzi);
    }
}
