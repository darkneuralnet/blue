package p000;
/* renamed from: Hr7 */
/* loaded from: classes5.dex */
public final class C33411Hr7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C33411Hr7 zzb;
    private int zze;
    private C41773gq7 zzf;
    private int zzi;
    private int zzj;
    private byte zzk = 2;
    private String zzg = "";
    private InterfaceC44185ku7 zzh = AbstractC40627eu7.m42401q();

    static {
        C33411Hr7 c33411Hr7 = new C33411Hr7();
        zzb = c33411Hr7;
        AbstractC40627eu7.m42395x(C33411Hr7.class, c33411Hr7);
    }

    private C33411Hr7() {
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
                            this.zzk = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new C33177Gr7(null);
                }
                return new C33411Hr7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003\u0016\u0004င\u0002\u0005ဌ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", C47318qB7.m17917a()});
        }
        return Byte.valueOf(this.zzk);
    }
}
