package p000;
/* renamed from: HF7 */
/* loaded from: classes5.dex */
public final class HF7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final HF7 zzb;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;

    static {
        HF7 hf7 = new HF7();
        zzb = hf7;
        AbstractC40627eu7.m42395x(HF7.class, hf7);
    }

    private HF7() {
    }

    /* renamed from: D */
    public static GF7 m104096D() {
        return (GF7) zzb.m42408f();
    }

    /* renamed from: F */
    public static /* synthetic */ void m104094F(HF7 hf7, int i) {
        hf7.zze |= 1;
        hf7.zzf = i;
    }

    /* renamed from: G */
    public static /* synthetic */ void m104093G(HF7 hf7, long j) {
        hf7.zze |= 2;
        hf7.zzg = j;
    }

    /* renamed from: H */
    public static /* synthetic */ void m104092H(HF7 hf7, long j) {
        hf7.zze |= 4;
        hf7.zzh = j;
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
                    return new GF7(null);
                }
                return new HF7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
