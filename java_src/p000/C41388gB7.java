package p000;
/* renamed from: gB7 */
/* loaded from: classes5.dex */
public final class C41388gB7 extends AbstractC38831bu7 {
    private static final C41388gB7 zze;
    private int zzf;
    private Object zzh;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzg = 0;
    private byte zzm = 2;
    private String zzi = "";

    static {
        C41388gB7 c41388gB7 = new C41388gB7();
        zze = c41388gB7;
        AbstractC40627eu7.m42395x(C41388gB7.class, c41388gB7);
    }

    private C41388gB7() {
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
                        return zze;
                    }
                    return new C40795fB7(null);
                }
                return new C41388gB7();
            }
            return AbstractC40627eu7.m42396v(zze, "\u0001\u0007\u0001\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0006ွ\u0000\u0007ွ\u0000\bံ\u0000", new Object[]{"zzh", "zzg", "zzf", "zzi", "zzj", "zzk", "zzl"});
        }
        return Byte.valueOf(this.zzm);
    }
}
