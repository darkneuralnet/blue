package p000;
/* renamed from: FF7 */
/* loaded from: classes5.dex */
public final class FF7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final FF7 zzb;
    private int zze;
    private String zzf = "";
    private AbstractC44175kt7 zzg;
    private HF7 zzh;
    private String zzi;
    private AbstractC44175kt7 zzj;
    private HF7 zzk;
    private String zzl;
    private AbstractC44175kt7 zzm;
    private HF7 zzn;
    private String zzo;
    private String zzp;
    private HF7 zzq;

    static {
        FF7 ff7 = new FF7();
        zzb = ff7;
        AbstractC40627eu7.m42395x(FF7.class, ff7);
    }

    private FF7() {
        AbstractC44175kt7 abstractC44175kt7 = AbstractC44175kt7.f95165c;
        this.zzg = abstractC44175kt7;
        this.zzi = "";
        this.zzj = abstractC44175kt7;
        this.zzl = "";
        this.zzm = abstractC44175kt7;
        this.zzo = "";
        this.zzp = "";
    }

    /* renamed from: D */
    public static EF7 m107375D() {
        return (EF7) zzb.m42408f();
    }

    /* renamed from: F */
    public static FF7 m107373F() {
        return zzb;
    }

    /* renamed from: G */
    public static /* synthetic */ void m107372G(FF7 ff7, AbstractC44175kt7 abstractC44175kt7) {
        abstractC44175kt7.getClass();
        ff7.zze |= 16;
        ff7.zzj = abstractC44175kt7;
    }

    /* renamed from: H */
    public static /* synthetic */ void m107371H(FF7 ff7, AbstractC44175kt7 abstractC44175kt7) {
        abstractC44175kt7.getClass();
        ff7.zze |= 128;
        ff7.zzm = abstractC44175kt7;
    }

    /* renamed from: I */
    public static /* synthetic */ void m107370I(FF7 ff7, HF7 hf7) {
        hf7.getClass();
        ff7.zzh = hf7;
        ff7.zze |= 4;
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
                    return new EF7(null);
                }
                return new FF7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ည\u0004\u0004ဈ\u0003\u0005ဈ\u0006\u0006ည\u0007\u0007ဈ\t\bဈ\n\tဉ\u0002\nဉ\u0005\u000bဉ\b\fဉ\u000b", new Object[]{"zze", "zzf", "zzg", "zzj", "zzi", "zzl", "zzm", "zzo", "zzp", "zzh", "zzk", "zzn", "zzq"});
        }
        return (byte) 1;
    }
}
