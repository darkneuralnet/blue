package p000;
/* renamed from: Wp7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36903Wp7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C36903Wp7 zzb;
    private C32718Es7 zze;

    static {
        C36903Wp7 c36903Wp7 = new C36903Wp7();
        zzb = c36903Wp7;
        AbstractC40627eu7.m42395x(C36903Wp7.class, c36903Wp7);
    }

    private C36903Wp7() {
    }

    /* renamed from: E */
    public static C36903Wp7 m77817E() {
        return zzb;
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
                    return new C36669Vp7(null);
                }
                return new C36903Wp7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        }
        return (byte) 1;
    }
}
