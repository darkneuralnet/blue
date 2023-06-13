package p000;
/* renamed from: eB7 */
/* loaded from: classes5.dex */
public final class C40202eB7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C40202eB7 zzb;
    private int zze;
    private C35031Op7 zzg;
    private float zzh;
    private byte zzi = 2;
    private int zzf = 2;

    static {
        C40202eB7 c40202eB7 = new C40202eB7();
        zzb = c40202eB7;
        AbstractC40627eu7.m42395x(C40202eB7.class, c40202eB7);
    }

    private C40202eB7() {
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
                    return new C39610dB7(null);
                }
                return new C40202eB7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᐉ\u0001\u0007ခ\u0002", new Object[]{"zze", "zzf", OA7.f26098a, "zzg", "zzh"});
        }
        return Byte.valueOf(this.zzi);
    }
}
