package p000;
/* renamed from: vq7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50666vq7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C50666vq7 zzb;
    private int zze;
    private String zzf = "";
    private int zzg;

    static {
        C50666vq7 c50666vq7 = new C50666vq7();
        zzb = c50666vq7;
        AbstractC40627eu7.m42395x(C50666vq7.class, c50666vq7);
    }

    private C50666vq7() {
    }

    @Override // p000.AbstractC40627eu7
    /* renamed from: B */
    public final Object mo5B(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new C32223Cp7(null);
                }
                return new C50666vq7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: D */
    public final int m7928D() {
        return this.zzg;
    }

    /* renamed from: F */
    public final String m7926F() {
        return this.zzf;
    }
}
