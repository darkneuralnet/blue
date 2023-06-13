package p000;
/* renamed from: SO7 */
/* loaded from: classes6.dex */
public final class SO7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final SO7 zzb;
    private int zze;
    private int zzf = -1;
    private float zzg = 0.3f;
    private int zzh = 5;
    private float zzi = 0.5f;
    private int zzj = 1;
    private boolean zzk = true;
    private float zzl = 0.85f;
    private boolean zzm = true;
    private float zzn;

    static {
        SO7 so7 = new SO7();
        zzb = so7;
        AbstractC40627eu7.m42395x(SO7.class, so7);
    }

    private SO7() {
    }

    /* renamed from: D */
    public static C46249oO7 m85524D() {
        return (C46249oO7) zzb.m42408f();
    }

    /* renamed from: F */
    public static /* synthetic */ void m85522F(SO7 so7, float f) {
        so7.zze |= 64;
        so7.zzl = 0.0f;
    }

    /* renamed from: G */
    public static /* synthetic */ void m85521G(SO7 so7, boolean z) {
        so7.zze |= 128;
        so7.zzm = false;
    }

    /* renamed from: H */
    public static /* synthetic */ void m85520H(SO7 so7, int i) {
        so7.zze |= 4;
        so7.zzh = i;
    }

    /* renamed from: I */
    public static /* synthetic */ void m85519I(SO7 so7, float f) {
        so7.zze |= 8;
        so7.zzi = 0.2f;
    }

    /* renamed from: J */
    public static /* synthetic */ void m85518J(SO7 so7, int i) {
        so7.zzj = 2;
        so7.zze |= 16;
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
                    return new C46249oO7(null);
                }
                return new SO7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\t\u0000\u0001\u0001\u0011\t\u0000\u0000\u0000\u0001င\u0000\u0005ခ\u0001\u0006င\u0002\u0007ခ\u0003\fဌ\u0004\u000eဇ\u0005\u000fခ\u0006\u0010ဇ\u0007\u0011ခ\b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", DO7.f5591a, "zzk", "zzl", "zzm", "zzn"});
        }
        return (byte) 1;
    }
}
