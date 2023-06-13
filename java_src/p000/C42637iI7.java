package p000;
/* renamed from: iI7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42637iI7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C42637iI7 zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private String zzh = "";

    static {
        C42637iI7 c42637iI7 = new C42637iI7();
        zzb = c42637iI7;
        AbstractC40627eu7.m42395x(C42637iI7.class, c42637iI7);
    }

    private C42637iI7() {
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
                    return new C42044hI7(null);
                }
                return new C42637iI7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
