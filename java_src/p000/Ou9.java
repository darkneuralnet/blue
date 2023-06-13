package p000;
/* renamed from: Ou9 */
/* loaded from: classes6.dex */
public final class Ou9 extends Em9<Ou9, Mu9> implements Pp9 {
    private static final Ou9 zzb;
    private static volatile InterfaceC42368hq9<Ou9> zze;
    private int zzf;
    private Su9 zzh;
    private String zzg = "";
    private String zzi = "";
    private String zzj = "";

    static {
        Ou9 ou9 = new Ou9();
        zzb = ou9;
        Em9.m108371m(Ou9.class, ou9);
    }

    private Ou9() {
    }

    /* renamed from: x */
    public static Ou9 m91194x() {
        return zzb;
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
                            InterfaceC42368hq9<Ou9> interfaceC42368hq9 = zze;
                            if (interfaceC42368hq9 == null) {
                                synchronized (Ou9.class) {
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
                    return new Mu9(null);
                }
                return new Ou9();
            }
            return Em9.m108372l(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\t", new Object[]{"zzf", "zzg", "zzi", "zzj", "zzh"});
        }
        return (byte) 1;
    }
}
