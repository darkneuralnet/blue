package p000;
/* renamed from: sE7 */
/* loaded from: classes5.dex */
public final class C48530sE7 extends AbstractC38831bu7 {
    private static final C48530sE7 zze;
    private byte zzf = 2;

    static {
        C48530sE7 c48530sE7 = new C48530sE7();
        zze = c48530sE7;
        AbstractC40627eu7.m42395x(C48530sE7.class, c48530sE7);
    }

    private C48530sE7() {
    }

    @Override // p000.AbstractC40627eu7
    /* renamed from: B */
    public final Object mo5B(int i, Object obj, Object obj2) {
        byte b;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (obj == null) {
                                b = 0;
                            } else {
                                b = 1;
                            }
                            this.zzf = b;
                            return null;
                        }
                        return zze;
                    }
                    return new C47938rE7(null);
                }
                return new C48530sE7();
            }
            return AbstractC40627eu7.m42396v(zze, "\u0001\u0000", null);
        }
        return Byte.valueOf(this.zzf);
    }
}
