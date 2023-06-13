package p000;
/* renamed from: Tz7 */
/* loaded from: classes5.dex */
public final class C36291Tz7 extends AbstractC38831bu7 {
    private static final C36291Tz7 zze;
    private int zzf;
    private boolean zzh;
    private byte zzi = 2;
    private InterfaceC45964nu7 zzg = AbstractC40627eu7.m42399s();

    static {
        C36291Tz7 c36291Tz7 = new C36291Tz7();
        zze = c36291Tz7;
        AbstractC40627eu7.m42395x(C36291Tz7.class, c36291Tz7);
    }

    private C36291Tz7() {
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
                        return zze;
                    }
                    return new C35589Qz7(null);
                }
                return new C36291Tz7();
            }
            return AbstractC40627eu7.m42396v(zze, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000", new Object[]{"zzf", "zzg", C36057Sz7.class, "zzh"});
        }
        return Byte.valueOf(this.zzi);
    }
}
