package p000;
/* renamed from: VF8 */
/* loaded from: classes5.dex */
public final class VF8 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final VF8 zzb;
    private int zze;
    private JF8 zzh;
    private C32287Cw8 zzi;
    private C32287Cw8 zzj;
    private C39691dK7 zzk;
    private float zzn;
    private boolean zzq;
    private C34860Nw7 zzr;
    private String zzf = "";
    private String zzg = "";
    private String zzl = "en";
    private int zzm = -1;
    private InterfaceC45964nu7 zzo = AbstractC40627eu7.m42399s();
    private InterfaceC45964nu7 zzp = AbstractC40627eu7.m42399s();
    private int zzs = -1;

    static {
        VF8 vf8 = new VF8();
        zzb = vf8;
        AbstractC40627eu7.m42395x(VF8.class, vf8);
    }

    private VF8() {
    }

    /* renamed from: D */
    public static C44390lF8 m80129D() {
        return (C44390lF8) zzb.m42408f();
    }

    /* renamed from: F */
    public static /* synthetic */ void m80127F(VF8 vf8, C32287Cw8 c32287Cw8) {
        c32287Cw8.getClass();
        vf8.zzi = c32287Cw8;
        vf8.zze |= 8;
    }

    /* renamed from: G */
    public static /* synthetic */ void m80126G(VF8 vf8, C32287Cw8 c32287Cw8) {
        c32287Cw8.getClass();
        vf8.zzj = c32287Cw8;
        vf8.zze |= 16;
    }

    /* renamed from: H */
    public static /* synthetic */ void m80125H(VF8 vf8, int i) {
        vf8.zze |= 128;
        vf8.zzm = i;
    }

    /* renamed from: I */
    public static /* synthetic */ void m80124I(VF8 vf8, float f) {
        vf8.zze |= 256;
        vf8.zzn = f;
    }

    /* renamed from: J */
    public static /* synthetic */ void m80123J(VF8 vf8, Iterable iterable) {
        InterfaceC45964nu7 interfaceC45964nu7 = vf8.zzp;
        if (!interfaceC45964nu7.zzc()) {
            vf8.zzp = AbstractC40627eu7.m42398t(interfaceC45964nu7);
        }
        AbstractC52465ys7.m2343c(iterable, vf8.zzp);
    }

    /* renamed from: K */
    public static /* synthetic */ void m80122K(VF8 vf8, C34860Nw7 c34860Nw7) {
        c34860Nw7.getClass();
        vf8.zzr = c34860Nw7;
        vf8.zze |= 1024;
    }

    /* renamed from: L */
    public static /* synthetic */ void m80121L(VF8 vf8, String str) {
        vf8.zze |= 1;
        vf8.zzf = "";
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
                    return new C44390lF8(null);
                }
                return new VF8();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002င\u0007\u0003ခ\b\u0004\u001a\u0005\u001a\u0006ဉ\u0002\bဇ\t\tဉ\n\nဉ\u0003\u000bဈ\u0006\fဉ\u0004\rင\u000b\u000eဉ\u0005\u000fဈ\u0001", new Object[]{"zze", "zzf", "zzm", "zzn", "zzo", "zzp", "zzh", "zzq", "zzr", "zzi", "zzl", "zzj", "zzs", "zzk", "zzg"});
        }
        return (byte) 1;
    }
}
