package p000;
/* renamed from: Cw8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32287Cw8 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C32287Cw8 zzb;
    private int zze;
    private AbstractC44175kt7 zzf = AbstractC44175kt7.f95165c;
    private String zzg = "";
    private C45995nx8 zzh;

    static {
        C32287Cw8 c32287Cw8 = new C32287Cw8();
        zzb = c32287Cw8;
        AbstractC40627eu7.m42395x(C32287Cw8.class, c32287Cw8);
    }

    private C32287Cw8() {
    }

    /* renamed from: D */
    public static C46578ow8 m111226D() {
        return (C46578ow8) zzb.m42408f();
    }

    /* renamed from: F */
    public static /* synthetic */ void m111224F(C32287Cw8 c32287Cw8, AbstractC44175kt7 abstractC44175kt7) {
        abstractC44175kt7.getClass();
        c32287Cw8.zze |= 1;
        c32287Cw8.zzf = abstractC44175kt7;
    }

    /* renamed from: G */
    public static /* synthetic */ void m111223G(C32287Cw8 c32287Cw8, C45995nx8 c45995nx8) {
        c45995nx8.getClass();
        c32287Cw8.zzh = c45995nx8;
        c32287Cw8.zze |= 4;
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
                    return new C46578ow8(null);
                }
                return new C32287Cw8();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0001\u0002ည\u0000\u0004ဉ\u0002", new Object[]{"zze", "zzg", "zzf", "zzh"});
        }
        return (byte) 1;
    }
}
