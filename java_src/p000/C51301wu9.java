package p000;
/* renamed from: wu9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51301wu9 extends Em9<C51301wu9, C50116uu9> implements Pp9 {
    private static final C51301wu9 zzb;
    private static volatile InterfaceC42368hq9<C51301wu9> zze;
    private AbstractC45836nh9 zzf;
    private int zzg;
    private int zzh;
    private AbstractC45836nh9 zzi;

    static {
        C51301wu9 c51301wu9 = new C51301wu9();
        zzb = c51301wu9;
        Em9.m108371m(C51301wu9.class, c51301wu9);
    }

    private C51301wu9() {
        AbstractC45836nh9 abstractC45836nh9 = AbstractC45836nh9.f100361c;
        this.zzf = abstractC45836nh9;
        this.zzi = abstractC45836nh9;
    }

    /* renamed from: w */
    public static C50116uu9 m6116w() {
        return zzb.m108370o();
    }

    /* renamed from: y */
    public static C51301wu9 m6114y() {
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
                            InterfaceC42368hq9<C51301wu9> interfaceC42368hq9 = zze;
                            if (interfaceC42368hq9 == null) {
                                synchronized (C51301wu9.class) {
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
                    return new C50116uu9(null);
                }
                return new C51301wu9();
            }
            return Em9.m108372l(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0002\u0004\u0003\u0004\u0004\n", new Object[]{"zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
