package p000;
/* renamed from: YZ8 */
/* loaded from: classes5.dex */
public final class YZ8 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final YZ8 zzb;
    private int zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private float zzj;
    private long zzk;
    private byte zzl = 2;

    static {
        YZ8 yz8 = new YZ8();
        zzb = yz8;
        AbstractC40627eu7.m42395x(YZ8.class, yz8);
    }

    private YZ8() {
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
                            this.zzl = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new OZ8(null);
                }
                return new YZ8();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0004\u0001ᔁ\u0000\u0002ᔁ\u0001\u0003ᔁ\u0002\u0004ᔁ\u0003\u0005ခ\u0004\u0006ဂ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return Byte.valueOf(this.zzl);
    }
}
