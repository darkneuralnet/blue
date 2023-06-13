package p000;

import java.util.List;
/* renamed from: Hi7 */
/* loaded from: classes5.dex */
public final class C33330Hi7 extends AbstractC49926ub9 implements InterfaceC51161wg9 {
    private static final C33330Hi7 zzb;
    private int zze;
    private int zzf;
    private InterfaceC39857dc9 zzg = AbstractC49926ub9.m9991e();

    static {
        C33330Hi7 c33330Hi7 = new C33330Hi7();
        zzb = c33330Hi7;
        AbstractC49926ub9.m9987k(C33330Hi7.class, c33330Hi7);
    }

    private C33330Hi7() {
    }

    /* renamed from: v */
    public static C33330Hi7 m103504v() {
        return zzb;
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
                    return new C46579ow9(null);
                }
                return new C33330Hi7();
            }
            return AbstractC49926ub9.m9988j(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zze", "zzf", C51159wg7.f116358a, "zzg", C47192py9.class});
        }
        return (byte) 1;
    }

    /* renamed from: w */
    public final List m103503w() {
        return this.zzg;
    }

    /* renamed from: x */
    public final int m103502x() {
        int m9872a = C49984uh7.m9872a(this.zzf);
        if (m9872a == 0) {
            return 1;
        }
        return m9872a;
    }
}
