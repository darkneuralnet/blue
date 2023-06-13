package p000;

import java.util.List;
/* renamed from: No8 */
/* loaded from: classes5.dex */
public final class C34789No8 extends AbstractC46897pU8 implements A19 {
    private static final C34789No8 zza;
    private CV8 zzd = AbstractC46897pU8.m19204o();
    private CV8 zze = AbstractC46897pU8.m19204o();
    private NV8 zzf = AbstractC46897pU8.m19202q();
    private NV8 zzg = AbstractC46897pU8.m19202q();

    static {
        C34789No8 c34789No8 = new C34789No8();
        zza = c34789No8;
        AbstractC46897pU8.m19196w(C34789No8.class, c34789No8);
    }

    private C34789No8() {
    }

    /* renamed from: F */
    public static C31981Bo8 m93382F() {
        return (C31981Bo8) zza.m19209i();
    }

    /* renamed from: H */
    public static C34789No8 m93380H() {
        return zza;
    }

    /* renamed from: N */
    public static /* synthetic */ void m93375N(C34789No8 c34789No8, Iterable iterable) {
        CV8 cv8 = c34789No8.zzd;
        if (!cv8.zzc()) {
            c34789No8.zzd = AbstractC46897pU8.m19203p(cv8);
        }
        QJ8.m88654b(iterable, c34789No8.zzd);
    }

    /* renamed from: P */
    public static /* synthetic */ void m93373P(C34789No8 c34789No8, Iterable iterable) {
        CV8 cv8 = c34789No8.zze;
        if (!cv8.zzc()) {
            c34789No8.zze = AbstractC46897pU8.m19203p(cv8);
        }
        QJ8.m88654b(iterable, c34789No8.zze);
    }

    /* renamed from: R */
    public static /* synthetic */ void m93371R(C34789No8 c34789No8, Iterable iterable) {
        NV8 nv8 = c34789No8.zzf;
        if (!nv8.zzc()) {
            c34789No8.zzf = AbstractC46897pU8.m19201r(nv8);
        }
        QJ8.m88654b(iterable, c34789No8.zzf);
    }

    /* renamed from: T */
    public static /* synthetic */ void m93369T(C34789No8 c34789No8, Iterable iterable) {
        NV8 nv8 = c34789No8.zzg;
        if (!nv8.zzc()) {
            c34789No8.zzg = AbstractC46897pU8.m19201r(nv8);
        }
        QJ8.m88654b(iterable, c34789No8.zzg);
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
                    return new C31981Bo8(null);
                }
                return new C34789No8();
            }
            return AbstractC46897pU8.m19199t(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzd", "zze", "zzf", C35446Qj8.class, "zzg", C45322mp8.class});
        }
        return (byte) 1;
    }

    /* renamed from: B */
    public final int m93386B() {
        return this.zzf.size();
    }

    /* renamed from: C */
    public final int m93385C() {
        return this.zze.size();
    }

    /* renamed from: D */
    public final int m93384D() {
        return this.zzg.size();
    }

    /* renamed from: E */
    public final int m93383E() {
        return this.zzd.size();
    }

    /* renamed from: I */
    public final List m93379I() {
        return this.zzf;
    }

    /* renamed from: J */
    public final List m93378J() {
        return this.zze;
    }

    /* renamed from: K */
    public final List m93377K() {
        return this.zzg;
    }

    /* renamed from: M */
    public final List m93376M() {
        return this.zzd;
    }
}
