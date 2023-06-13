package p000;
/* renamed from: CD7 */
/* loaded from: classes5.dex */
public final class CD7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final CD7 zzb;
    private byte zzf = 2;
    private InterfaceC45964nu7 zze = AbstractC40627eu7.m42399s();

    static {
        CD7 cd7 = new CD7();
        zzb = cd7;
        AbstractC40627eu7.m42395x(CD7.class, cd7);
    }

    private CD7() {
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
                            this.zzf = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new BD7(null);
                }
                return new CD7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zze", C52671zD7.class});
        }
        return Byte.valueOf(this.zzf);
    }
}
