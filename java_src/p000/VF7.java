package p000;
/* renamed from: VF7 */
/* loaded from: classes5.dex */
public final class VF7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final VF7 zzb;
    private InterfaceC45964nu7 zze = AbstractC40627eu7.m42399s();
    private int zzf;

    static {
        VF7 vf7 = new VF7();
        zzb = vf7;
        AbstractC40627eu7.m42395x(VF7.class, vf7);
    }

    private VF7() {
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
                    return new UF7(null);
                }
                return new VF7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\f", new Object[]{"zze", SF7.class, "zzf"});
        }
        return (byte) 1;
    }
}
