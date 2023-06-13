package p000;
/* renamed from: Br7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32007Br7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C32007Br7 zzb;
    private int zze;
    private int zzf;
    private float zzh;
    private byte zzi = 2;
    private InterfaceC44185ku7 zzg = AbstractC40627eu7.m42401q();

    static {
        C32007Br7 c32007Br7 = new C32007Br7();
        zzb = c32007Br7;
        AbstractC40627eu7.m42395x(C32007Br7.class, c32007Br7);
    }

    private C32007Br7() {
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
                    return new C31773Ar7(null);
                }
                return new C32007Br7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ᔄ\u0000\u0002ᔁ\u0001\u0003\u0016", new Object[]{"zze", "zzf", "zzh", "zzg"});
        }
        return Byte.valueOf(this.zzi);
    }
}
