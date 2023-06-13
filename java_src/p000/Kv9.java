package p000;
/* renamed from: Kv9 */
/* loaded from: classes6.dex */
public final class Kv9 extends Em9<Kv9, Iv9> implements Pp9 {
    private static final Kv9 zzb;
    private static volatile InterfaceC42368hq9<Kv9> zze;
    private int zzf;
    private Vv9 zzg;
    private boolean zzj;
    private An9<Ov9> zzh = Em9.m108365v();
    private int zzi = 2;
    private An9<AbstractC45836nh9> zzk = Em9.m108365v();

    static {
        Kv9 kv9 = new Kv9();
        zzb = kv9;
        Em9.m108371m(Kv9.class, kv9);
    }

    private Kv9() {
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
                            InterfaceC42368hq9<Kv9> interfaceC42368hq9 = zze;
                            if (interfaceC42368hq9 == null) {
                                synchronized (Kv9.class) {
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
                    return new Iv9(null);
                }
                return new Kv9();
            }
            return Em9.m108372l(zzb, "\u0001\u0005\u0000\u0001\u0001\u0017\u0005\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\bဇ\u0002\t\u001c\u0017ဌ\u0001", new Object[]{"zzf", "zzg", "zzh", Ov9.class, "zzj", "zzk", "zzi", Gv9.m104578a()});
        }
        return (byte) 1;
    }
}
