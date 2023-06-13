package p000;
/* renamed from: vD8 */
/* loaded from: classes5.dex */
public final class C50300vD8 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C50300vD8 zzb;
    private int zze;
    private JF7 zzf;
    private float zzg;
    private byte zzh = 2;

    static {
        C50300vD8 c50300vD8 = new C50300vD8();
        zzb = c50300vD8;
        AbstractC40627eu7.m42395x(C50300vD8.class, c50300vD8);
    }

    private C50300vD8() {
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
                    return new C43186jD8(null);
                }
                return new C50300vD8();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ခ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return Byte.valueOf(this.zzh);
    }
}
