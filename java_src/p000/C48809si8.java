package p000;
/* renamed from: si8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48809si8 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C48809si8 zzb;
    private int zze;
    private boolean zzf;
    private float zzg = 0.8f;
    private int zzh;
    private int zzi;

    static {
        C48809si8 c48809si8 = new C48809si8();
        zzb = c48809si8;
        AbstractC40627eu7.m42395x(C48809si8.class, c48809si8);
    }

    private C48809si8() {
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
                    return new C39916di8(null);
                }
                return new C48809si8();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ခ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
