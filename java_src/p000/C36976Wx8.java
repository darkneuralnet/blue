package p000;
/* renamed from: Wx8 */
/* loaded from: classes5.dex */
public final class C36976Wx8 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C36976Wx8 zzb;
    private int zze;
    private Object zzg;
    private boolean zzh;
    private long zzj;
    private float zzm;
    private float zzn;
    private float zzo;
    private int zzf = 0;
    private byte zzp = 2;
    private InterfaceC45964nu7 zzi = AbstractC40627eu7.m42399s();
    private InterfaceC43592ju7 zzk = AbstractC40627eu7.m42402p();
    private float zzl = 0.15f;

    static {
        C36976Wx8 c36976Wx8 = new C36976Wx8();
        zzb = c36976Wx8;
        AbstractC40627eu7.m42395x(C36976Wx8.class, c36976Wx8);
    }

    private C36976Wx8() {
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
                            this.zzp = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new C34402Lx8(null);
                }
                return new C36976Wx8();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\t\u0001\u0001\u0002\f\t\u0000\u0002\u0001\u0002ᐼ\u0000\u0003ဇ\u0000\u0004\u001b\u0005\u0013\u0006ခ\u0003\u0007ခ\u0004\bခ\u0005\u000bခ\u0006\fဂ\u0001", new Object[]{"zzg", "zzf", "zze", C50300vD8.class, "zzh", "zzi", C34852Nv8.class, "zzk", "zzl", "zzm", "zzn", "zzo", "zzj"});
        }
        return Byte.valueOf(this.zzp);
    }
}
