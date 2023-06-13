package p000;
/* renamed from: ls7 */
/* loaded from: classes5.dex */
public final class C44758ls7 extends AbstractC49926ub9 implements InterfaceC51161wg9 {
    private static final C44758ls7 zzb;
    private int zze;
    private C33204Gu7 zzf;
    private C33204Gu7 zzg;
    private C33204Gu7 zzh;
    private C33204Gu7 zzi;

    static {
        C44758ls7 c44758ls7 = new C44758ls7();
        zzb = c44758ls7;
        AbstractC49926ub9.m9987k(C44758ls7.class, c44758ls7);
    }

    private C44758ls7() {
    }

    /* renamed from: u */
    public static C51269wr7 m26713u() {
        return (C51269wr7) zzb.m9984o();
    }

    /* renamed from: w */
    public static /* synthetic */ void m26711w(C44758ls7 c44758ls7, C33204Gu7 c33204Gu7) {
        c33204Gu7.getClass();
        c44758ls7.zzf = c33204Gu7;
        c44758ls7.zze |= 1;
    }

    /* renamed from: x */
    public static /* synthetic */ void m26710x(C44758ls7 c44758ls7, C33204Gu7 c33204Gu7) {
        c33204Gu7.getClass();
        c44758ls7.zzg = c33204Gu7;
        c44758ls7.zze |= 2;
    }

    /* renamed from: y */
    public static /* synthetic */ void m26709y(C44758ls7 c44758ls7, C33204Gu7 c33204Gu7) {
        c33204Gu7.getClass();
        c44758ls7.zzh = c33204Gu7;
        c44758ls7.zze |= 4;
    }

    /* renamed from: z */
    public static /* synthetic */ void m26708z(C44758ls7 c44758ls7, C33204Gu7 c33204Gu7) {
        c33204Gu7.getClass();
        c44758ls7.zzi = c33204Gu7;
        c44758ls7.zze |= 8;
    }

    @Override // p000.AbstractC49926ub9
    /* renamed from: n */
    public final Object mo9690n(int i, Object obj, Object obj2) {
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
                    return new C51269wr7(null);
                }
                return new C44758ls7();
            }
            return AbstractC49926ub9.m9988j(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
