package p000;
/* renamed from: ky7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44225ky7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C44225ky7 zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        C44225ky7 c44225ky7 = new C44225ky7();
        zzb = c44225ky7;
        AbstractC40627eu7.m42395x(C44225ky7.class, c44225ky7);
    }

    private C44225ky7() {
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
                    return new C43632jy7(null);
                }
                return new C44225ky7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
