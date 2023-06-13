package p000;
/* renamed from: Kn7 */
/* loaded from: classes5.dex */
public final class C34077Kn7 extends AbstractC49926ub9 implements InterfaceC51161wg9 {
    private static final C34077Kn7 zzb;
    private int zze;
    private C33204Gu7 zzf;
    private C33204Gu7 zzg;
    private C33204Gu7 zzh;
    private C33204Gu7 zzi;

    static {
        C34077Kn7 c34077Kn7 = new C34077Kn7();
        zzb = c34077Kn7;
        AbstractC49926ub9.m9987k(C34077Kn7.class, c34077Kn7);
    }

    private C34077Kn7() {
    }

    /* renamed from: u */
    public static C35706Rm7 m98290u() {
        return (C35706Rm7) zzb.m9984o();
    }

    /* renamed from: w */
    public static /* synthetic */ void m98288w(C34077Kn7 c34077Kn7, C33204Gu7 c33204Gu7) {
        c33204Gu7.getClass();
        c34077Kn7.zzf = c33204Gu7;
        c34077Kn7.zze |= 1;
    }

    /* renamed from: x */
    public static /* synthetic */ void m98287x(C34077Kn7 c34077Kn7, C33204Gu7 c33204Gu7) {
        c33204Gu7.getClass();
        c34077Kn7.zzg = c33204Gu7;
        c34077Kn7.zze |= 2;
    }

    /* renamed from: y */
    public static /* synthetic */ void m98286y(C34077Kn7 c34077Kn7, C33204Gu7 c33204Gu7) {
        c33204Gu7.getClass();
        c34077Kn7.zzh = c33204Gu7;
        c34077Kn7.zze |= 4;
    }

    /* renamed from: z */
    public static /* synthetic */ void m98285z(C34077Kn7 c34077Kn7, C33204Gu7 c33204Gu7) {
        c33204Gu7.getClass();
        c34077Kn7.zzi = c33204Gu7;
        c34077Kn7.zze |= 8;
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
                    return new C35706Rm7(null);
                }
                return new C34077Kn7();
            }
            return AbstractC49926ub9.m9988j(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
