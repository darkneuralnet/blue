package p000;
/* renamed from: Qr7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35517Qr7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C35517Qr7 zzb;
    private int zze;
    private String zzf = "";
    private double zzg = 1.0d;
    private InterfaceC45964nu7 zzh = AbstractC40627eu7.m42399s();

    static {
        C35517Qr7 c35517Qr7 = new C35517Qr7();
        zzb = c35517Qr7;
        AbstractC40627eu7.m42395x(C35517Qr7.class, c35517Qr7);
    }

    private C35517Qr7() {
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
                    return new C35283Pr7(null);
                }
                return new C35517Qr7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0003\u0000\u0001\u0001\u000f\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002က\u0001\u000f\u001a", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
