package p000;

import java.util.List;
/* renamed from: Cg8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32143Cg8 extends AbstractC46897pU8 implements A19 {
    private static final C32143Cg8 zza;
    private int zzd;
    private long zze;
    private int zzg;
    private boolean zzl;
    private String zzf = "";
    private NV8 zzh = AbstractC46897pU8.m19202q();
    private NV8 zzi = AbstractC46897pU8.m19202q();
    private NV8 zzj = AbstractC46897pU8.m19202q();
    private String zzk = "";
    private NV8 zzm = AbstractC46897pU8.m19202q();
    private NV8 zzn = AbstractC46897pU8.m19202q();
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";

    static {
        C32143Cg8 c32143Cg8 = new C32143Cg8();
        zza = c32143Cg8;
        AbstractC46897pU8.m19196w(C32143Cg8.class, c32143Cg8);
    }

    private C32143Cg8() {
    }

    /* renamed from: F */
    public static C45232mg8 m111895F() {
        return (C45232mg8) zza.m19209i();
    }

    /* renamed from: H */
    public static C32143Cg8 m111893H() {
        return zza;
    }

    /* renamed from: R */
    public static /* synthetic */ void m111884R(C32143Cg8 c32143Cg8, int i, C37048Xf8 c37048Xf8) {
        c37048Xf8.getClass();
        NV8 nv8 = c32143Cg8.zzi;
        if (!nv8.zzc()) {
            c32143Cg8.zzi = AbstractC46897pU8.m19201r(nv8);
        }
        c32143Cg8.zzi.set(i, c37048Xf8);
    }

    @Override // p000.AbstractC46897pU8
    /* renamed from: A */
    public final Object mo8350A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new C45232mg8(null);
                }
                return new C32143Cg8();
            }
            return AbstractC46897pU8.m19199t(zza, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\fဈ\u0006\rဈ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", C34024Kh8.class, "zzi", C37048Xf8.class, "zzj", C49078t98.class, "zzk", "zzl", "zzm", C48899sr8.class, "zzn", C49372tf8.class, "zzo", "zzp", "zzq"});
        }
        return (byte) 1;
    }

    /* renamed from: B */
    public final int m111899B() {
        return this.zzm.size();
    }

    /* renamed from: C */
    public final int m111898C() {
        return this.zzi.size();
    }

    /* renamed from: D */
    public final long m111897D() {
        return this.zze;
    }

    /* renamed from: E */
    public final C37048Xf8 m111896E(int i) {
        return (C37048Xf8) this.zzi.get(i);
    }

    /* renamed from: I */
    public final String m111892I() {
        return this.zzf;
    }

    /* renamed from: J */
    public final String m111891J() {
        return this.zzq;
    }

    /* renamed from: K */
    public final String m111890K() {
        return this.zzp;
    }

    /* renamed from: M */
    public final String m111889M() {
        return this.zzo;
    }

    /* renamed from: N */
    public final List m111888N() {
        return this.zzj;
    }

    /* renamed from: O */
    public final List m111887O() {
        return this.zzn;
    }

    /* renamed from: P */
    public final List m111886P() {
        return this.zzm;
    }

    /* renamed from: Q */
    public final List m111885Q() {
        return this.zzh;
    }

    /* renamed from: T */
    public final boolean m111882T() {
        return this.zzl;
    }

    /* renamed from: U */
    public final boolean m111881U() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: V */
    public final boolean m111880V() {
        return (this.zzd & 1) != 0;
    }
}
