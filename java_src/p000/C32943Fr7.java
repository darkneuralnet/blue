package p000;
/* renamed from: Fr7 */
/* loaded from: classes5.dex */
public final class C32943Fr7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C32943Fr7 zzb;
    private int zze;
    private C41773gq7 zzf;
    private byte zzh = 2;
    private InterfaceC44185ku7 zzg = AbstractC40627eu7.m42401q();

    static {
        C32943Fr7 c32943Fr7 = new C32943Fr7();
        zzb = c32943Fr7;
        AbstractC40627eu7.m42395x(C32943Fr7.class, c32943Fr7);
    }

    private C32943Fr7() {
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
                            this.zzh = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new C32709Er7(null);
                }
                return new C32943Fr7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u0016", new Object[]{"zze", "zzf", "zzg"});
        }
        return Byte.valueOf(this.zzh);
    }
}
