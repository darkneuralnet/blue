package p000;
/* renamed from: iE7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42601iE7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C42601iE7 zzb;
    private byte zzf = 2;
    private InterfaceC45964nu7 zze = AbstractC40627eu7.m42399s();

    static {
        C42601iE7 c42601iE7 = new C42601iE7();
        zzb = c42601iE7;
        AbstractC40627eu7.m42395x(C42601iE7.class, c42601iE7);
    }

    private C42601iE7() {
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
                    return new C42008hE7(null);
                }
                return new C42601iE7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zze", C40822fE7.class});
        }
        return Byte.valueOf(this.zzf);
    }
}
