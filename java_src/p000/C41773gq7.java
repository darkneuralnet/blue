package p000;
/* renamed from: gq7 */
/* loaded from: classes5.dex */
public final class C41773gq7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C41773gq7 zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private float zzj;
    private C33870Jq7 zzk;
    private byte zzl = 2;

    static {
        C41773gq7 c41773gq7 = new C41773gq7();
        zzb = c41773gq7;
        AbstractC40627eu7.m42395x(C41773gq7.class, c41773gq7);
    }

    private C41773gq7() {
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
                    return new C41180fq7(null);
                }
                return new C41773gq7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0004\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002\u0004ᔄ\u0003\u0005ခ\u0004\u0006ဉ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return Byte.valueOf(this.zzl);
    }
}
