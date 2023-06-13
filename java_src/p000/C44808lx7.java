package p000;
/* renamed from: lx7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44808lx7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C44808lx7 zzb;
    private int zze;
    private int zzf = -1;

    static {
        C44808lx7 c44808lx7 = new C44808lx7();
        zzb = c44808lx7;
        AbstractC40627eu7.m42395x(C44808lx7.class, c44808lx7);
    }

    private C44808lx7() {
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
                    return new C44215kx7(null);
                }
                return new C44808lx7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }
}
