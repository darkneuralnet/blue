package p000;
/* renamed from: Jk8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33817Jk8 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C33817Jk8 zzb;
    private int zze;
    private float zzf = 0.7f;
    private int zzg = 2;
    private float zzh = 0.2f;

    static {
        C33817Jk8 c33817Jk8 = new C33817Jk8();
        zzb = c33817Jk8;
        AbstractC40627eu7.m42395x(C33817Jk8.class, c33817Jk8);
    }

    private C33817Jk8() {
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
                    return new C50607vk8(null);
                }
                return new C33817Jk8();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002င\u0001\u0003ခ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
