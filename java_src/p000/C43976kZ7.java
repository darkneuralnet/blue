package p000;
/* renamed from: kZ7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43976kZ7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C43976kZ7 zzb;
    private int zze;
    private int zzf = -1;
    private float zzg = 1.0f;
    private int zzh;

    static {
        C43976kZ7 c43976kZ7 = new C43976kZ7();
        zzb = c43976kZ7;
        AbstractC40627eu7.m42395x(C43976kZ7.class, c43976kZ7);
    }

    private C43976kZ7() {
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
                    return new VY7(null);
                }
                return new C43976kZ7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
