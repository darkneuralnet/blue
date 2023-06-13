package p000;
/* renamed from: w88 */
/* loaded from: classes6.dex */
public final class C50846w88 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C50846w88 zzb;
    private int zze;
    private C48584sK7 zzf;
    private VF8 zzg;
    private JF7 zzh;
    private VF8 zzi;
    private byte zzj = 2;

    static {
        C50846w88 c50846w88 = new C50846w88();
        zzb = c50846w88;
        AbstractC40627eu7.m42395x(C50846w88.class, c50846w88);
    }

    private C50846w88() {
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
                            this.zzj = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new C41953h88(null);
                }
                return new C50846w88();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return Byte.valueOf(this.zzj);
    }
}
