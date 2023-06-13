package p000;
/* renamed from: ea8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40428ea8 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C40428ea8 zzb;
    private int zze;
    private C36850Wj8 zzf;
    private Ry9 zzg;
    private C50371vL7 zzh;
    private C31918Bh8 zzi;
    private C34672Nb8 zzj;
    private C36769Wa8 zzk;
    private C34708Nf8 zzl;
    private byte zzm = 2;

    static {
        C40428ea8 c40428ea8 = new C40428ea8();
        zzb = c40428ea8;
        AbstractC40627eu7.m42395x(C40428ea8.class, c40428ea8);
    }

    private C40428ea8() {
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
                            this.zzm = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new O98(null);
                }
                return new C40428ea8();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        return Byte.valueOf(this.zzm);
    }
}
