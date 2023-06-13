package p000;
/* renamed from: Op7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35031Op7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C35031Op7 zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private float zzj;
    private byte zzk = 2;

    static {
        C35031Op7 c35031Op7 = new C35031Op7();
        zzb = c35031Op7;
        AbstractC40627eu7.m42395x(C35031Op7.class, c35031Op7);
    }

    private C35031Op7() {
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
                            this.zzk = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new C50656vp7(null);
                }
                return new C35031Op7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002\u0004ᔄ\u0003\u0005ခ\u0004", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return Byte.valueOf(this.zzk);
    }
}
