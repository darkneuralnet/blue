package p000;
/* renamed from: Nq7 */
/* loaded from: classes5.dex */
public final class C34806Nq7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C34806Nq7 zzb;
    private int zze;
    private C35274Pq7 zzf;
    private float zzg;
    private byte zzi = 2;
    private InterfaceC43592ju7 zzh = AbstractC40627eu7.m42402p();

    static {
        C34806Nq7 c34806Nq7 = new C34806Nq7();
        zzb = c34806Nq7;
        AbstractC40627eu7.m42395x(C34806Nq7.class, c34806Nq7);
    }

    private C34806Nq7() {
    }

    @Override // p000.AbstractC40627eu7
    /* renamed from: B */
    public final Object mo5B(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (obj == null) {
                                b = 0;
                            }
                            this.zzi = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new C34572Mq7(null);
                }
                return new C34806Nq7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ခ\u0001\u0003\u0013", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return Byte.valueOf(this.zzi);
    }
}
