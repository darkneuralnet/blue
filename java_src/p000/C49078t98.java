package p000;

import java.util.List;
/* renamed from: t98  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49078t98 extends AbstractC46897pU8 implements A19 {
    private static final C49078t98 zza;
    private int zzd;
    private int zze;
    private NV8 zzf = AbstractC46897pU8.m19202q();
    private NV8 zzg = AbstractC46897pU8.m19202q();
    private boolean zzh;
    private boolean zzi;

    static {
        C49078t98 c49078t98 = new C49078t98();
        zza = c49078t98;
        AbstractC46897pU8.m19196w(C49078t98.class, c49078t98);
    }

    private C49078t98() {
    }

    /* renamed from: J */
    public static /* synthetic */ void m12971J(C49078t98 c49078t98, int i, C50527vc8 c50527vc8) {
        c50527vc8.getClass();
        NV8 nv8 = c49078t98.zzf;
        if (!nv8.zzc()) {
            c49078t98.zzf = AbstractC46897pU8.m19201r(nv8);
        }
        c49078t98.zzf.set(i, c50527vc8);
    }

    /* renamed from: K */
    public static /* synthetic */ void m12970K(C49078t98 c49078t98, int i, Y98 y98) {
        y98.getClass();
        NV8 nv8 = c49078t98.zzg;
        if (!nv8.zzc()) {
            c49078t98.zzg = AbstractC46897pU8.m19201r(nv8);
        }
        c49078t98.zzg.set(i, y98);
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
                    return new C39592d98(null);
                }
                return new C49078t98();
            }
            return AbstractC46897pU8.m19199t(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzd", "zze", "zzf", C50527vc8.class, "zzg", Y98.class, "zzh", "zzi"});
        }
        return (byte) 1;
    }

    /* renamed from: B */
    public final int m12979B() {
        return this.zze;
    }

    /* renamed from: C */
    public final int m12978C() {
        return this.zzg.size();
    }

    /* renamed from: D */
    public final int m12977D() {
        return this.zzf.size();
    }

    /* renamed from: F */
    public final Y98 m12975F(int i) {
        return (Y98) this.zzg.get(i);
    }

    /* renamed from: G */
    public final C50527vc8 m12974G(int i) {
        return (C50527vc8) this.zzf.get(i);
    }

    /* renamed from: H */
    public final List m12973H() {
        return this.zzg;
    }

    /* renamed from: I */
    public final List m12972I() {
        return this.zzf;
    }

    /* renamed from: M */
    public final boolean m12969M() {
        return (this.zzd & 1) != 0;
    }
}
