package p000;
/* renamed from: Iu9 */
/* loaded from: classes6.dex */
public final class Iu9 extends Em9<Iu9, Gu9> implements Pp9 {
    private static final Iu9 zzb;
    private static volatile InterfaceC42368hq9<Iu9> zze;
    private int zzf;
    private Su9 zzh;
    private String zzg = "";
    private String zzi = "";

    static {
        Iu9 iu9 = new Iu9();
        zzb = iu9;
        Em9.m108371m(Iu9.class, iu9);
    }

    private Iu9() {
    }

    /* renamed from: x */
    public static Iu9 m101486x() {
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
                            InterfaceC42368hq9<Iu9> interfaceC42368hq9 = zze;
                            if (interfaceC42368hq9 == null) {
                                synchronized (Iu9.class) {
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
                    return new Gu9(null);
                }
                return new Iu9();
            }
            return Em9.m108372l(zzb, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\t\u0005Ȉ", new Object[]{"zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
