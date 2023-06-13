package p000;
/* renamed from: vL7 */
/* loaded from: classes5.dex */
public final class C50371vL7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C50371vL7 zzb;
    private int zze;
    private float zzi;
    private byte zzj = 2;
    private String zzf = "";
    private String zzg = "";
    private InterfaceC45964nu7 zzh = AbstractC40627eu7.m42399s();

    static {
        C50371vL7 c50371vL7 = new C50371vL7();
        zzb = c50371vL7;
        AbstractC40627eu7.m42395x(C50371vL7.class, c50371vL7);
    }

    private C50371vL7() {
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
                    return new C40885fL7(null);
                }
                return new C50371vL7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003Л\u0004ခ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh", C53048zr7.class, "zzi"});
        }
        return Byte.valueOf(this.zzj);
    }
}
