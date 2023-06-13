package p000;
/* renamed from: zz7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C53128zz7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C53128zz7 zzb;
    private int zze;
    private C35814Ry7 zzf;
    private C33483Hz7 zzg;
    private C41863gz7 zzh;
    private int zzi;
    private C40084dz7 zzj;
    private C36291Tz7 zzk;
    private long zzl;
    private long zzm;
    private boolean zzn;
    private int zzo;
    private byte zzp = 2;

    static {
        C53128zz7 c53128zz7 = new C53128zz7();
        zzb = c53128zz7;
        AbstractC40627eu7.m42395x(C53128zz7.class, c53128zz7);
    }

    private C53128zz7() {
    }

    /* renamed from: F */
    public static C43642jz7 m2F() {
        return (C43642jz7) zzb.m42408f();
    }

    /* renamed from: H */
    public static /* synthetic */ void m0H(C53128zz7 c53128zz7, int i) {
        c53128zz7.zze |= 512;
        c53128zz7.zzo = 3;
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
                            this.zzp = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new C43642jz7(null);
                }
                return new C53128zz7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဌ\u0003\u0004ဉ\u0004\u0005ᐉ\u0005\u0006ဂ\u0006\u0007ဂ\u0007\bဇ\b\tင\t\nဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzi", C40677ez7.f79248a, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzh"});
        }
        return Byte.valueOf(this.zzp);
    }

    /* renamed from: D */
    public final long m4D() {
        return this.zzm;
    }

    /* renamed from: E */
    public final C40084dz7 m3E() {
        C40084dz7 c40084dz7 = this.zzj;
        return c40084dz7 == null ? C40084dz7.m43425G() : c40084dz7;
    }
}
