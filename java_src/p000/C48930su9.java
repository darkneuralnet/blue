package p000;

import java.util.List;
/* renamed from: su9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C48930su9 extends Em9<C48930su9, C47745qu9> implements Pp9 {
    private static final C48930su9 zzb;
    private static volatile InterfaceC42368hq9<C48930su9> zze;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private An9<AbstractC45836nh9> zzf = Em9.m108365v();
    private AbstractC45836nh9 zzk = AbstractC45836nh9.f100361c;

    static {
        C48930su9 c48930su9 = new C48930su9();
        zzb = c48930su9;
        Em9.m108371m(C48930su9.class, c48930su9);
    }

    private C48930su9() {
    }

    /* renamed from: D */
    public static C48930su9 m13396D() {
        return zzb;
    }

    /* renamed from: A */
    public final int m13399A() {
        return this.zzj;
    }

    /* renamed from: B */
    public final AbstractC45836nh9 m13398B() {
        return this.zzk;
    }

    /* renamed from: E */
    public final List<AbstractC45836nh9> m13395E() {
        return this.zzf;
    }

    @Override // p000.Em9
    /* renamed from: n */
    public final Object mo1998n(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (i2 != 6) {
                                return null;
                            }
                            InterfaceC42368hq9<C48930su9> interfaceC42368hq9 = zze;
                            if (interfaceC42368hq9 == null) {
                                synchronized (C48930su9.class) {
                                    interfaceC42368hq9 = zze;
                                    if (interfaceC42368hq9 == null) {
                                        interfaceC42368hq9 = new C42328hm9<>(zzb);
                                        zze = interfaceC42368hq9;
                                    }
                                }
                            }
                            return interfaceC42368hq9;
                        }
                        return zzb;
                    }
                    return new C47745qu9(null);
                }
                return new C48930su9();
            }
            return Em9.m108372l(zzb, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001c\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\n", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }

    /* renamed from: w */
    public final int m13394w() {
        return this.zzg;
    }

    /* renamed from: x */
    public final int m13393x() {
        return this.zzh;
    }

    /* renamed from: y */
    public final int m13392y() {
        return this.zzi;
    }
}
