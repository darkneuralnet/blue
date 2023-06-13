package p000;
/* renamed from: hx7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42436hx7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C42436hx7 zzb;
    private int zze;
    private C40667ey7 zzf;
    private InterfaceC45964nu7 zzg = AbstractC40627eu7.m42399s();
    private InterfaceC45964nu7 zzh = AbstractC40627eu7.m42399s();

    static {
        C42436hx7 c42436hx7 = new C42436hx7();
        zzb = c42436hx7;
        AbstractC40627eu7.m42395x(C42436hx7.class, c42436hx7);
    }

    private C42436hx7() {
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
                    return new C41843gx7(null);
                }
                return new C42436hx7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b", new Object[]{"zze", "zzf", "zzg", C48968sy7.class, "zzh", C34860Nw7.class});
        }
        return (byte) 1;
    }
}
