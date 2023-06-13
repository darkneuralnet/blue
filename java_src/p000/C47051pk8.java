package p000;

import java.util.List;
/* renamed from: pk8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47051pk8 extends AbstractC46897pU8 implements A19 {
    private static final C47051pk8 zza;
    private int zzd;
    private NV8 zze = AbstractC46897pU8.m19202q();
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;

    static {
        C47051pk8 c47051pk8 = new C47051pk8();
        zza = c47051pk8;
        AbstractC46897pU8.m19196w(C47051pk8.class, c47051pk8);
    }

    private C47051pk8() {
    }

    /* renamed from: F */
    public static C39936dk8 m18861F() {
        return (C39936dk8) zza.m19209i();
    }

    /* renamed from: K */
    public static /* synthetic */ void m18856K(C47051pk8 c47051pk8, int i, C47061pl8 c47061pl8) {
        c47061pl8.getClass();
        c47051pk8.m18845W();
        c47051pk8.zze.set(i, c47061pl8);
    }

    /* renamed from: M */
    public static /* synthetic */ void m18855M(C47051pk8 c47051pk8, C47061pl8 c47061pl8) {
        c47061pl8.getClass();
        c47051pk8.m18845W();
        c47051pk8.zze.add(c47061pl8);
    }

    /* renamed from: N */
    public static /* synthetic */ void m18854N(C47051pk8 c47051pk8, Iterable iterable) {
        c47051pk8.m18845W();
        QJ8.m88654b(iterable, c47051pk8.zze);
    }

    /* renamed from: P */
    public static /* synthetic */ void m18852P(C47051pk8 c47051pk8, int i) {
        c47051pk8.m18845W();
        c47051pk8.zze.remove(i);
    }

    /* renamed from: Q */
    public static /* synthetic */ void m18851Q(C47051pk8 c47051pk8, String str) {
        str.getClass();
        c47051pk8.zzd |= 1;
        c47051pk8.zzf = str;
    }

    /* renamed from: R */
    public static /* synthetic */ void m18850R(C47051pk8 c47051pk8, long j) {
        c47051pk8.zzd |= 2;
        c47051pk8.zzg = j;
    }

    /* renamed from: S */
    public static /* synthetic */ void m18849S(C47051pk8 c47051pk8, long j) {
        c47051pk8.zzd |= 4;
        c47051pk8.zzh = j;
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
                    return new C39936dk8(null);
                }
                return new C47051pk8();
            }
            return AbstractC46897pU8.m19199t(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzd", "zze", C47061pl8.class, "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    /* renamed from: B */
    public final int m18865B() {
        return this.zzi;
    }

    /* renamed from: C */
    public final int m18864C() {
        return this.zze.size();
    }

    /* renamed from: D */
    public final long m18863D() {
        return this.zzh;
    }

    /* renamed from: E */
    public final long m18862E() {
        return this.zzg;
    }

    /* renamed from: H */
    public final C47061pl8 m18859H(int i) {
        return (C47061pl8) this.zze.get(i);
    }

    /* renamed from: I */
    public final String m18858I() {
        return this.zzf;
    }

    /* renamed from: J */
    public final List m18857J() {
        return this.zze;
    }

    /* renamed from: T */
    public final boolean m18848T() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: U */
    public final boolean m18847U() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: V */
    public final boolean m18846V() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: W */
    public final void m18845W() {
        NV8 nv8 = this.zze;
        if (!nv8.zzc()) {
            this.zze = AbstractC46897pU8.m19201r(nv8);
        }
    }
}
