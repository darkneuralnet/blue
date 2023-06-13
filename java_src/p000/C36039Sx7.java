package p000;
/* renamed from: Sx7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36039Sx7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C36039Sx7 zzb;
    private int zze;
    private float zzf = 50.0f;
    private int zzg = 1;

    static {
        C36039Sx7 c36039Sx7 = new C36039Sx7();
        zzb = c36039Sx7;
        AbstractC40627eu7.m42395x(C36039Sx7.class, c36039Sx7);
    }

    private C36039Sx7() {
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
                    return new C40064dx7(null);
                }
                return new C36039Sx7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
