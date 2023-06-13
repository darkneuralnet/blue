package p000;
/* renamed from: NY8 */
/* loaded from: classes5.dex */
public final class NY8 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final NY8 zzb;
    private InterfaceC45964nu7 zze = AbstractC40627eu7.m42399s();

    static {
        NY8 ny8 = new NY8();
        zzb = ny8;
        AbstractC40627eu7.m42395x(NY8.class, ny8);
    }

    private NY8() {
    }

    @Override // p000.AbstractC40627eu7
    /* renamed from: B */
    public final Object mo5B(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new DY8(null);
                }
                return new NY8();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C49897uY8.class});
        }
        return (byte) 1;
    }
}
