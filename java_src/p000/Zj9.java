package p000;
/* renamed from: Zj9 */
/* loaded from: classes6.dex */
public final class Zj9 extends Em9<Zj9, Sj9> implements Pp9 {
    private static final Zj9 zzb;
    private static volatile InterfaceC42368hq9<Zj9> zze;
    private long zzf;
    private int zzg;

    static {
        Zj9 zj9 = new Zj9();
        zzb = zj9;
        Em9.m108371m(Zj9.class, zj9);
    }

    private Zj9() {
    }

    /* renamed from: y */
    public static Sj9 m72599y() {
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
                            InterfaceC42368hq9<Zj9> interfaceC42368hq9 = zze;
                            if (interfaceC42368hq9 == null) {
                                synchronized (Zj9.class) {
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
                    return new Sj9(null);
                }
                return new Zj9();
            }
            return new C49483tq9(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zzf", "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: w */
    public final int m72601w() {
        return this.zzg;
    }

    /* renamed from: x */
    public final long m72600x() {
        return this.zzf;
    }
}
