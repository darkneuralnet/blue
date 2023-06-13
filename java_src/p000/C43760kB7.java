package p000;
/* renamed from: kB7 */
/* loaded from: classes5.dex */
public final class C43760kB7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C43760kB7 zzb;
    private byte zzf = 2;
    private InterfaceC45964nu7 zze = AbstractC40627eu7.m42399s();

    static {
        C43760kB7 c43760kB7 = new C43760kB7();
        zzb = c43760kB7;
        AbstractC40627eu7.m42395x(C43760kB7.class, c43760kB7);
    }

    private C43760kB7() {
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
                    return new C41981hB7(null);
                }
                return new C43760kB7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zze", C43167jB7.class});
        }
        return Byte.valueOf(this.zzf);
    }
}
