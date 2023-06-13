package p000;
/* renamed from: gp9 */
/* loaded from: classes5.dex */
public final class C41765gp9 extends AbstractC49926ub9 implements InterfaceC51161wg9 {
    private static final C41765gp9 zzb;
    private int zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private int zzi = 15000;
    private int zzj;
    private float zzk;

    static {
        C41765gp9 c41765gp9 = new C41765gp9();
        zzb = c41765gp9;
        AbstractC49926ub9.m9987k(C41765gp9.class, c41765gp9);
    }

    private C41765gp9() {
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
                    return new C42348ho9(null);
                }
                return new C41765gp9();
            }
            return AbstractC49926ub9.m9988j(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ခ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", C50056uo9.f113023a, "zzj", C39394cp9.f75686a, "zzk"});
        }
        return (byte) 1;
    }

    /* renamed from: u */
    public final float m37435u() {
        return this.zzf;
    }

    /* renamed from: v */
    public final float m37434v() {
        return this.zzg;
    }

    /* renamed from: x */
    public final int m37432x() {
        int m8004a = C50648vo9.m8004a(this.zzi);
        if (m8004a == 0) {
            return 15001;
        }
        return m8004a;
    }
}
