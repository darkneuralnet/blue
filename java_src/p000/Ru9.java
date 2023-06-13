package p000;
/* renamed from: Ru9 */
/* loaded from: classes5.dex */
public final class Ru9 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final Ru9 zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private InterfaceC45964nu7 zzm = AbstractC40627eu7.m42399s();
    private String zzn = "";
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private int zzr;
    private int zzs;

    static {
        Ru9 ru9 = new Ru9();
        zzb = ru9;
        AbstractC40627eu7.m42395x(Ru9.class, ru9);
    }

    private Ru9() {
    }

    /* renamed from: D */
    public static Pu9 m86229D() {
        return (Pu9) zzb.m42408f();
    }

    /* renamed from: F */
    public static Ru9 m86227F() {
        return zzb;
    }

    /* renamed from: H */
    public static /* synthetic */ void m86225H(Ru9 ru9, String str) {
        ru9.zze |= 1;
        ru9.zzf = str;
    }

    /* renamed from: I */
    public static /* synthetic */ void m86224I(Ru9 ru9, String str) {
        ru9.zze |= 8;
        ru9.zzi = str;
    }

    /* renamed from: J */
    public static /* synthetic */ void m86223J(Ru9 ru9, String str) {
        ru9.zze |= 16;
        ru9.zzj = str;
    }

    /* renamed from: K */
    public static /* synthetic */ void m86222K(Ru9 ru9, String str) {
        ru9.zze |= 32;
        ru9.zzk = str;
    }

    /* renamed from: L */
    public static /* synthetic */ void m86221L(Ru9 ru9, String str) {
        ru9.zze |= 64;
        ru9.zzl = str;
    }

    /* renamed from: M */
    public static /* synthetic */ void m86220M(Ru9 ru9, Iterable iterable) {
        InterfaceC45964nu7 interfaceC45964nu7 = ru9.zzm;
        if (!interfaceC45964nu7.zzc()) {
            ru9.zzm = AbstractC40627eu7.m42398t(interfaceC45964nu7);
        }
        AbstractC52465ys7.m2343c(iterable, ru9.zzm);
    }

    /* renamed from: N */
    public static /* synthetic */ void m86219N(Ru9 ru9, String str) {
        ru9.zze |= 128;
        ru9.zzn = str;
    }

    /* renamed from: O */
    public static /* synthetic */ void m86218O(Ru9 ru9, boolean z) {
        ru9.zze |= 256;
        ru9.zzo = z;
    }

    /* renamed from: P */
    public static /* synthetic */ void m86217P(Ru9 ru9, boolean z) {
        ru9.zze |= 512;
        ru9.zzp = z;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m86216Q(Ru9 ru9, int i) {
        ru9.zze |= 2048;
        ru9.zzr = i;
    }

    /* renamed from: R */
    public static /* synthetic */ void m86215R(Ru9 ru9, int i) {
        ru9.zze |= 4096;
        ru9.zzs = i;
    }

    /* renamed from: S */
    public static /* synthetic */ void m86214S(Ru9 ru9, String str) {
        ru9.zze |= 2;
        ru9.zzg = str;
    }

    /* renamed from: T */
    public static /* synthetic */ void m86213T(Ru9 ru9, String str) {
        ru9.zze |= 4;
        ru9.zzh = str;
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
                    return new Pu9(null);
                }
                return new Ru9();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\b\u001a\tဈ\u0007\nဇ\b\u000bဇ\t\fဇ\n\rဋ\u000b\u000eင\f", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        return (byte) 1;
    }

    /* renamed from: G */
    public final String m86226G() {
        return this.zzj;
    }
}
