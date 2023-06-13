package p000;
/* renamed from: Rv9 */
/* loaded from: classes6.dex */
public final class Rv9 extends Em9<Rv9, Qv9> implements Pp9 {
    private static final Rv9 zzb;
    private static volatile InterfaceC42368hq9<Rv9> zze;
    private int zzf;
    private AbstractC45836nh9 zzg;
    private AbstractC45836nh9 zzh;
    private int zzi;
    private AbstractC45836nh9 zzj;

    static {
        Rv9 rv9 = new Rv9();
        zzb = rv9;
        Em9.m108371m(Rv9.class, rv9);
    }

    private Rv9() {
        AbstractC45836nh9 abstractC45836nh9 = AbstractC45836nh9.f100361c;
        this.zzg = abstractC45836nh9;
        this.zzh = abstractC45836nh9;
        this.zzj = abstractC45836nh9;
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
                            InterfaceC42368hq9<Rv9> interfaceC42368hq9 = zze;
                            if (interfaceC42368hq9 == null) {
                                synchronized (Rv9.class) {
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
                    return new Qv9(null);
                }
                return new Rv9();
            }
            return Em9.m108372l(zzb, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ည\u0000\u0003ည\u0001\u0004ဋ\u0002\u0005ည\u0003", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
