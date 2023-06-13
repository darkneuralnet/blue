package p000;
/* renamed from: th8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49392th8 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C49392th8 zzb;
    private int zze;
    private int zzf = 1;
    private boolean zzg;

    static {
        C49392th8 c49392th8 = new C49392th8();
        zzb = c49392th8;
        AbstractC40627eu7.m42395x(C49392th8.class, c49392th8);
    }

    private C49392th8() {
    }

    /* renamed from: D */
    public static C41091fh8 m11911D() {
        return (C41091fh8) zzb.m42408f();
    }

    /* renamed from: F */
    public static /* synthetic */ void m11909F(C49392th8 c49392th8, boolean z) {
        c49392th8.zze |= 2;
        c49392th8.zzg = true;
    }

    /* renamed from: G */
    public static /* synthetic */ void m11908G(C49392th8 c49392th8, int i) {
        c49392th8.zzf = i - 1;
        c49392th8.zze |= 1;
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
                    return new C41091fh8(null);
                }
                return new C49392th8();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"zze", "zzf", R49.f31484a, "zzg"});
        }
        return (byte) 1;
    }
}
