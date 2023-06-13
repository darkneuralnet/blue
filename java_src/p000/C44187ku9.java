package p000;

import java.util.Map;
/* renamed from: ku9 */
/* loaded from: classes6.dex */
public final class C44187ku9 extends Em9<C44187ku9, Et9> implements Pp9 {
    private static final C44187ku9 zzb;
    private static volatile InterfaceC42368hq9<C44187ku9> zze;
    private long zzh;
    private boolean zzl;
    private C51301wu9 zzo;
    private C52437yp9<String, String> zzj = C52437yp9.m2510d();
    private C52437yp9<Integer, AbstractC45836nh9> zzm = C52437yp9.m2510d();
    private String zzf = "";
    private String zzg = "";
    private String zzi = "";
    private String zzk = "";
    private String zzn = "";

    static {
        C44187ku9 c44187ku9 = new C44187ku9();
        zzb = c44187ku9;
        Em9.m108371m(C44187ku9.class, c44187ku9);
    }

    private C44187ku9() {
    }

    /* renamed from: B */
    public static /* synthetic */ Map m28176B(C44187ku9 c44187ku9) {
        if (!c44187ku9.zzj.m2506h()) {
            c44187ku9.zzj = c44187ku9.zzj.m2509e();
        }
        return c44187ku9.zzj;
    }

    /* renamed from: C */
    public static /* synthetic */ Map m28175C(C44187ku9 c44187ku9) {
        if (!c44187ku9.zzm.m2506h()) {
            c44187ku9.zzm = c44187ku9.zzm.m2509e();
        }
        return c44187ku9.zzm;
    }

    /* renamed from: D */
    public static /* synthetic */ void m28174D(C44187ku9 c44187ku9, String str) {
        str.getClass();
        c44187ku9.zzk = str;
    }

    /* renamed from: F */
    public static /* synthetic */ void m28172F(C44187ku9 c44187ku9, String str) {
        str.getClass();
        c44187ku9.zzn = str;
    }

    /* renamed from: H */
    public static /* synthetic */ void m28170H(C44187ku9 c44187ku9, String str) {
        str.getClass();
        c44187ku9.zzf = str;
    }

    /* renamed from: w */
    public static /* synthetic */ void m28169w(C44187ku9 c44187ku9, String str) {
        str.getClass();
        c44187ku9.zzg = str;
    }

    /* renamed from: y */
    public static Et9 m28167y() {
        return zzb.m108370o();
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
                            InterfaceC42368hq9<C44187ku9> interfaceC42368hq9 = zze;
                            if (interfaceC42368hq9 == null) {
                                synchronized (C44187ku9.class) {
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
                    return new Et9(null);
                }
                return new C44187ku9();
            }
            return Em9.m108372l(zzb, "\u0000\n\u0000\u0000\u0001\n\n\u0002\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004Ȉ\u00052\u0006Ȉ\u0007\u0007\b2\tȈ\n\t", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", Ct9.f4869a, "zzk", "zzl", "zzm", C43001iu9.f91676a, "zzn", "zzo"});
        }
        return (byte) 1;
    }
}
