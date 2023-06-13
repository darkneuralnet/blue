package p000;
/* renamed from: jB7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43167jB7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C43167jB7 zzb;
    private int zze;
    private byte zzh = 2;
    private String zzf = "";
    private float zzg = 1.0f;

    static {
        C43167jB7 c43167jB7 = new C43167jB7();
        zzb = c43167jB7;
        AbstractC40627eu7.m42395x(C43167jB7.class, c43167jB7);
    }

    private C43167jB7() {
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
                            this.zzh = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new C42574iB7(null);
                }
                return new C43167jB7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ခ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return Byte.valueOf(this.zzh);
    }
}
