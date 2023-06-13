package p000;
/* renamed from: zG7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52698zG7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C52698zG7 zzb;
    private int zze;
    private long zzf;
    private int zzi;
    private int zzj;
    private C47956rG7 zzm;
    private AbstractC44175kt7 zzn;
    private LG7 zzo;
    private String zzp;
    private InterfaceC45964nu7 zzq;
    private InterfaceC45964nu7 zzr;
    private AbstractC44175kt7 zzs;
    private String zzt;
    private byte zzu = 2;
    private String zzg = "";
    private String zzh = "";
    private InterfaceC45964nu7 zzk = AbstractC40627eu7.m42399s();
    private String zzl = "";

    static {
        C52698zG7 c52698zG7 = new C52698zG7();
        zzb = c52698zG7;
        AbstractC40627eu7.m42395x(C52698zG7.class, c52698zG7);
    }

    private C52698zG7() {
        AbstractC44175kt7 abstractC44175kt7 = AbstractC44175kt7.f95165c;
        this.zzn = abstractC44175kt7;
        this.zzp = "";
        this.zzq = AbstractC40627eu7.m42399s();
        this.zzr = AbstractC40627eu7.m42399s();
        this.zzs = abstractC44175kt7;
        this.zzt = "";
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
                            this.zzu = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new C50919wG7(null);
                }
                return new C52698zG7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u000f\u0000\u0001\u0001\u001c\u000f\u0000\u0003\u0004\u0001ᔂ\u0000\u0002б\u0010ဈ\u0001\u0011ဈ\u0002\u0012င\u0003\u0013င\u0004\u0014\u001a\u0015ဈ\u0005\u0016ည\u0007\u0017ᐉ\b\u0018ᐉ\u0006\u0019ည\n\u001aဈ\t\u001bဈ\u000b\u001c\u001b", new Object[]{"zze", "zzf", "zzq", C52105yG7.class, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzn", "zzo", "zzm", "zzs", "zzp", "zzt", "zzr", C49734uG7.class});
        }
        return Byte.valueOf(this.zzu);
    }
}
