package p000;
/* renamed from: Qn7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35481Qn7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C35481Qn7 zzb;
    private int zze;
    private long zzf;
    private float zzg = 0.5f;

    static {
        C35481Qn7 c35481Qn7 = new C35481Qn7();
        zzb = c35481Qn7;
        AbstractC40627eu7.m42395x(C35481Qn7.class, c35481Qn7);
    }

    private C35481Qn7() {
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
                    return new C37344Ym7(null);
                }
                return new C35481Qn7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ခ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
