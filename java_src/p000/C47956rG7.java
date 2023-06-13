package p000;
/* renamed from: rG7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47956rG7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C47956rG7 zzb;
    private int zze;
    private double zzf;
    private double zzg;
    private double zzi;
    private boolean zzj;
    private double zzk;
    private double zzl;
    private byte zzm = 2;
    private String zzh = "";

    static {
        C47956rG7 c47956rG7 = new C47956rG7();
        zzb = c47956rG7;
        AbstractC40627eu7.m42395x(C47956rG7.class, c47956rG7);
    }

    private C47956rG7() {
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
                    return new C47363qG7(null);
                }
                return new C47956rG7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0002\u0001ᔀ\u0000\u0002ᔀ\u0001\u0004က\u0005\u0005က\u0006\u0006ဇ\u0004\u0007က\u0003\bဈ\u0002", new Object[]{"zze", "zzf", "zzg", "zzk", "zzl", "zzj", "zzi", "zzh"});
        }
        return Byte.valueOf(this.zzm);
    }
}
