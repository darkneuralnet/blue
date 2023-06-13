package p000;
/* renamed from: Gu7 */
/* loaded from: classes5.dex */
public final class C33204Gu7 extends AbstractC49926ub9 implements InterfaceC51161wg9 {
    private static final C33204Gu7 zzb;
    private int zze;
    private T69 zzf = T69.f34797c;
    private String zzg = "";
    private String zzh = "";

    static {
        C33204Gu7 c33204Gu7 = new C33204Gu7();
        zzb = c33204Gu7;
        AbstractC49926ub9.m9987k(C33204Gu7.class, c33204Gu7);
    }

    private C33204Gu7() {
    }

    /* renamed from: u */
    public static C35535Qt7 m104597u() {
        return (C35535Qt7) zzb.m9984o();
    }

    /* renamed from: w */
    public static /* synthetic */ void m104595w(C33204Gu7 c33204Gu7, String str) {
        c33204Gu7.zze |= 2;
        c33204Gu7.zzg = str;
    }

    /* renamed from: x */
    public static /* synthetic */ void m104594x(C33204Gu7 c33204Gu7, String str) {
        c33204Gu7.zze |= 4;
        c33204Gu7.zzh = str;
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
                    return new C35535Qt7(null);
                }
                return new C33204Gu7();
            }
            return AbstractC49926ub9.m9988j(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
