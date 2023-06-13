package p000;
/* renamed from: Kr9 */
/* loaded from: classes6.dex */
public final class Kr9 extends Em9<Kr9, Ir9> implements Pp9 {
    private static final Kr9 zzb;
    private static volatile InterfaceC42368hq9<Kr9> zze;
    private long zzf;
    private int zzg;

    static {
        Kr9 kr9 = new Kr9();
        zzb = kr9;
        Em9.m108371m(Kr9.class, kr9);
    }

    private Kr9() {
    }

    /* renamed from: B */
    public static Kr9 m98223B() {
        return zzb;
    }

    /* renamed from: y */
    public static Ir9 m98218y() {
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
                            InterfaceC42368hq9<Kr9> interfaceC42368hq9 = zze;
                            if (interfaceC42368hq9 == null) {
                                synchronized (Kr9.class) {
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
                    return new Ir9(null);
                }
                return new Kr9();
            }
            return new C49483tq9(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zzf", "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: w */
    public final int m98220w() {
        return this.zzg;
    }

    /* renamed from: x */
    public final long m98219x() {
        return this.zzf;
    }
}
