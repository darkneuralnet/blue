package p000;

import java.util.List;
/* renamed from: wt9 */
/* loaded from: classes6.dex */
public final class C51291wt9 extends Em9<C51291wt9, C47735qt9> implements Pp9 {
    private static final InterfaceC46489on9<Integer, Au9> zzb = new C46549ot9();
    private static final C51291wt9 zze;
    private static volatile InterfaceC42368hq9<C51291wt9> zzf;
    private C50106ut9 zzh;
    private int zzk;
    private C48930su9 zzm;
    private Rv9 zzn;
    private String zzg = "";
    private An9<String> zzi = Em9.m108365v();
    private InterfaceC42931in9 zzj = Em9.m108366u();
    private String zzl = "";

    static {
        C51291wt9 c51291wt9 = new C51291wt9();
        zze = c51291wt9;
        Em9.m108371m(C51291wt9.class, c51291wt9);
    }

    private C51291wt9() {
    }

    /* renamed from: x */
    public static C51291wt9 m6145x() {
        return zze;
    }

    /* renamed from: A */
    public final String m6150A() {
        return this.zzg;
    }

    /* renamed from: B */
    public final String m6149B() {
        return this.zzl;
    }

    /* renamed from: C */
    public final List<String> m6148C() {
        return this.zzi;
    }

    /* renamed from: D */
    public final List<Au9> m6147D() {
        return new C50046un9(this.zzj, zzb);
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
                            InterfaceC42368hq9<C51291wt9> interfaceC42368hq9 = zzf;
                            if (interfaceC42368hq9 == null) {
                                synchronized (C51291wt9.class) {
                                    interfaceC42368hq9 = zzf;
                                    if (interfaceC42368hq9 == null) {
                                        interfaceC42368hq9 = new C42328hm9<>(zze);
                                        zzf = interfaceC42368hq9;
                                    }
                                }
                            }
                            return interfaceC42368hq9;
                        }
                        return zze;
                    }
                    return new C47735qt9(null);
                }
                return new C51291wt9();
            }
            return Em9.m108372l(zze, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0002\u0000\u0001Ȉ\u0002\t\u0003Ț\u0004,\u0005\f\u0006Ȉ\u0007\t\b\t", new Object[]{"zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        return (byte) 1;
    }

    /* renamed from: y */
    public final C48930su9 m6144y() {
        C48930su9 c48930su9 = this.zzm;
        if (c48930su9 == null) {
            return C48930su9.m13396D();
        }
        return c48930su9;
    }
}
