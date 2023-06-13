package p000;
/* renamed from: Aq9 */
/* loaded from: classes5.dex */
public final class Aq9 extends AbstractC49926ub9 implements InterfaceC51161wg9 {
    private static final Aq9 zzb;
    private int zze;
    private C33204Gu7 zzf;
    private C33204Gu7 zzg;

    static {
        Aq9 aq9 = new Aq9();
        zzb = aq9;
        AbstractC49926ub9.m9987k(Aq9.class, aq9);
    }

    private Aq9() {
    }

    /* renamed from: u */
    public static Co9 m115115u() {
        return (Co9) zzb.m9984o();
    }

    /* renamed from: w */
    public static /* synthetic */ void m115113w(Aq9 aq9, C33204Gu7 c33204Gu7) {
        c33204Gu7.getClass();
        aq9.zzf = c33204Gu7;
        aq9.zze |= 1;
    }

    /* renamed from: x */
    public static /* synthetic */ void m115112x(Aq9 aq9, C33204Gu7 c33204Gu7) {
        c33204Gu7.getClass();
        aq9.zzg = c33204Gu7;
        aq9.zze |= 2;
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
                    return new Co9(null);
                }
                return new Aq9();
            }
            return AbstractC49926ub9.m9988j(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
