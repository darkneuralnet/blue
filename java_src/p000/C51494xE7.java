package p000;
/* renamed from: xE7 */
/* loaded from: classes6.dex */
public final class C51494xE7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C51494xE7 zzb;
    private int zze;
    private Object zzg;
    private int zzf = 0;
    private byte zzi = 2;
    private InterfaceC45964nu7 zzh = AbstractC40627eu7.m42399s();

    static {
        C51494xE7 c51494xE7 = new C51494xE7();
        zzb = c51494xE7;
        AbstractC40627eu7.m42395x(C51494xE7.class, c51494xE7);
    }

    private C51494xE7() {
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
                    return new JD7(null);
                }
                return new C51494xE7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0002\u0001\u0001\u0001\u0003\u0002\u0000\u0001\u0001\u0001်\u0000\u0003Л", new Object[]{"zzg", "zzf", "zze", "zzh", C46752pE7.class});
        }
        return Byte.valueOf(this.zzi);
    }
}
