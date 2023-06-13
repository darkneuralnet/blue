package p000;

import java.util.List;
/* renamed from: up9 */
/* loaded from: classes5.dex */
public final class C50066up9 extends AbstractC49926ub9 implements InterfaceC51161wg9 {
    private static final C50066up9 zzb;
    private byte zzf = 2;
    private InterfaceC39857dc9 zze = AbstractC49926ub9.m9991e();

    static {
        C50066up9 c50066up9 = new C50066up9();
        zzb = c50066up9;
        AbstractC49926ub9.m9987k(C50066up9.class, c50066up9);
    }

    private C50066up9() {
    }

    /* renamed from: v */
    public static C50066up9 m9688v() {
        return zzb;
    }

    @Override // p000.AbstractC49926ub9
    /* renamed from: n */
    public final Object mo9690n(int i, Object obj, Object obj2) {
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
                            this.zzf = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new C47695qp9(null);
                }
                return new C50066up9();
            }
            return AbstractC49926ub9.m9988j(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zze", C43544jp9.class});
        }
        return Byte.valueOf(this.zzf);
    }

    /* renamed from: w */
    public final List m9687w() {
        return this.zze;
    }
}
