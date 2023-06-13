package p000;
/* renamed from: uS7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49842uS7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C49842uS7 zzb;
    private int zze;
    private Object zzg;
    private C46064o48 zzh;
    private boolean zzi;
    private C37868aH8 zzj;
    private C49392th8 zzk;
    private C48257rm8 zzl;
    private int zzm;
    private int zzf = 0;
    private byte zzn = 2;

    static {
        C49842uS7 c49842uS7 = new C49842uS7();
        zzb = c49842uS7;
        AbstractC40627eu7.m42395x(C49842uS7.class, c49842uS7);
    }

    private C49842uS7() {
    }

    /* renamed from: E */
    public static C40948fS7 m10263E() {
        return (C40948fS7) zzb.m42408f();
    }

    /* renamed from: G */
    public static /* synthetic */ void m10261G(C49842uS7 c49842uS7, C49392th8 c49392th8) {
        c49392th8.getClass();
        c49842uS7.zzk = c49392th8;
        c49842uS7.zze |= 8;
    }

    /* renamed from: H */
    public static /* synthetic */ void m10260H(C49842uS7 c49842uS7, C48257rm8 c48257rm8) {
        c48257rm8.getClass();
        c49842uS7.zzl = c48257rm8;
        c49842uS7.zze |= 64;
    }

    /* renamed from: I */
    public static /* synthetic */ void m10259I(C49842uS7 c49842uS7, C46064o48 c46064o48) {
        c46064o48.getClass();
        c49842uS7.zzh = c46064o48;
        c49842uS7.zze |= 1;
    }

    /* renamed from: J */
    public static /* synthetic */ void m10258J(C49842uS7 c49842uS7, C37868aH8 c37868aH8) {
        c37868aH8.getClass();
        c49842uS7.zzj = c37868aH8;
        c49842uS7.zze |= 4;
    }

    @Override // p000.AbstractC40627eu7
    /* renamed from: B */
    public final Object mo5B(int i, Object obj, Object obj2) {
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
                            this.zzn = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new C40948fS7(null);
                }
                return new C49842uS7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဇ\u0001\u0003ဉ\u0003\u0004ဉ\u0002\u0005်\u0000\u0006်\u0000\u0007ဉ\u0006\bင\u0007", new Object[]{"zzg", "zzf", "zze", "zzh", "zzi", "zzk", "zzj", "zzl", "zzm"});
        }
        return Byte.valueOf(this.zzn);
    }

    /* renamed from: D */
    public final int m10264D() {
        return this.zzm;
    }

    /* renamed from: K */
    public final boolean m10257K() {
        if (this.zzf == 6) {
            return ((Boolean) this.zzg).booleanValue();
        }
        return false;
    }

    /* renamed from: L */
    public final boolean m10256L() {
        if (this.zzf == 5) {
            return ((Boolean) this.zzg).booleanValue();
        }
        return false;
    }

    /* renamed from: M */
    public final boolean m10255M() {
        return (this.zze & 128) != 0;
    }
}
