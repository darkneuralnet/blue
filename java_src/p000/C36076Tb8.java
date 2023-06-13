package p000;
/* renamed from: Tb8 */
/* loaded from: classes6.dex */
public final class C36076Tb8 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C36076Tb8 zzb;
    private int zze;
    private int zzf;
    private JF7 zzg;
    private FG8 zzh;
    private C50213v48 zzi;
    private C33537If7 zzj;
    private byte zzk = 2;

    static {
        C36076Tb8 c36076Tb8 = new C36076Tb8();
        zzb = c36076Tb8;
        AbstractC40627eu7.m42395x(C36076Tb8.class, c36076Tb8);
    }

    private C36076Tb8() {
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
                    return new C48147rb8(null);
                }
                return new C36076Tb8();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဉ\u0002\u0002ဉ\u0003\u0003ဌ\u0000\u0004ဉ\u0004\u0005ᐉ\u0001", new Object[]{"zze", "zzh", "zzi", "zzf", C32800Fb8.f9751a, "zzj", "zzg"});
        }
        return Byte.valueOf(this.zzk);
    }
}
