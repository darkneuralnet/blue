package p000;
/* renamed from: Vv9 */
/* loaded from: classes6.dex */
public final class Vv9 extends Em9<Vv9, Tv9> implements Pp9 {
    private static final Vv9 zzb;
    private static volatile InterfaceC42368hq9<Vv9> zze;
    private int zzf;
    private String zzg = "";
    private String zzh = "";

    static {
        Vv9 vv9 = new Vv9();
        zzb = vv9;
        Em9.m108371m(Vv9.class, vv9);
    }

    private Vv9() {
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
                            InterfaceC42368hq9<Vv9> interfaceC42368hq9 = zze;
                            if (interfaceC42368hq9 == null) {
                                synchronized (Vv9.class) {
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
                    return new Tv9(null);
                }
                return new Vv9();
            }
            return Em9.m108372l(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
