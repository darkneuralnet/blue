package p000;
/* renamed from: rw7 */
/* loaded from: classes5.dex */
public final class C48356rw7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C48356rw7 zzb;
    private long zze;
    private int zzf;

    static {
        C48356rw7 c48356rw7 = new C48356rw7();
        zzb = c48356rw7;
        AbstractC40627eu7.m42395x(C48356rw7.class, c48356rw7);
    }

    private C48356rw7() {
    }

    /* renamed from: E */
    public static C47763qw7 m15008E() {
        return (C47763qw7) zzb.m42408f();
    }

    /* renamed from: G */
    public static C48356rw7 m15006G() {
        return zzb;
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
                    return new C47763qw7(null);
                }
                return new C48356rw7();
            }
            return new C33447Hv7(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: D */
    public final long m15009D() {
        return this.zze;
    }
}
