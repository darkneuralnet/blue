package p000;

import java.util.List;
/* renamed from: Y98 */
/* loaded from: classes5.dex */
public final class Y98 extends AbstractC46897pU8 implements A19 {
    private static final Y98 zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private NV8 zzg = AbstractC46897pU8.m19202q();
    private boolean zzh;
    private C36544Vb8 zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        Y98 y98 = new Y98();
        zza = y98;
        AbstractC46897pU8.m19196w(Y98.class, y98);
    }

    private Y98() {
    }

    /* renamed from: D */
    public static I98 m75492D() {
        return (I98) zza.m19209i();
    }

    /* renamed from: J */
    public static /* synthetic */ void m75486J(Y98 y98, String str) {
        y98.zzd |= 2;
        y98.zzf = str;
    }

    /* renamed from: K */
    public static /* synthetic */ void m75485K(Y98 y98, int i, C32323Da8 c32323Da8) {
        c32323Da8.getClass();
        NV8 nv8 = y98.zzg;
        if (!nv8.zzc()) {
            y98.zzg = AbstractC46897pU8.m19201r(nv8);
        }
        y98.zzg.set(i, c32323Da8);
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
                    return new I98(null);
                }
                return new Y98();
            }
            return AbstractC46897pU8.m19199t(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", C32323Da8.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        return (byte) 1;
    }

    /* renamed from: B */
    public final int m75494B() {
        return this.zzg.size();
    }

    /* renamed from: C */
    public final int m75493C() {
        return this.zze;
    }

    /* renamed from: F */
    public final C32323Da8 m75490F(int i) {
        return (C32323Da8) this.zzg.get(i);
    }

    /* renamed from: G */
    public final C36544Vb8 m75489G() {
        C36544Vb8 c36544Vb8 = this.zzi;
        return c36544Vb8 == null ? C36544Vb8.m79677C() : c36544Vb8;
    }

    /* renamed from: H */
    public final String m75488H() {
        return this.zzf;
    }

    /* renamed from: I */
    public final List m75487I() {
        return this.zzg;
    }

    /* renamed from: M */
    public final boolean m75484M() {
        return this.zzj;
    }

    /* renamed from: N */
    public final boolean m75483N() {
        return this.zzk;
    }

    /* renamed from: O */
    public final boolean m75482O() {
        return this.zzl;
    }

    /* renamed from: P */
    public final boolean m75481P() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: Q */
    public final boolean m75480Q() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: R */
    public final boolean m75479R() {
        return (this.zzd & 64) != 0;
    }
}
