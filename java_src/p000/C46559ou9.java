package p000;
/* renamed from: ou9 */
/* loaded from: classes6.dex */
public final class C46559ou9 extends Em9<C46559ou9, C45373mu9> implements Pp9 {
    private static final C46559ou9 zzb;
    private static volatile InterfaceC42368hq9<C46559ou9> zze;
    private int zzg;
    private Rv9 zzi;
    private String zzf = "";
    private String zzh = "";

    static {
        C46559ou9 c46559ou9 = new C46559ou9();
        zzb = c46559ou9;
        Em9.m108371m(C46559ou9.class, c46559ou9);
    }

    private C46559ou9() {
    }

    /* renamed from: x */
    public static C46559ou9 m20284x() {
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
                            InterfaceC42368hq9<C46559ou9> interfaceC42368hq9 = zze;
                            if (interfaceC42368hq9 == null) {
                                synchronized (C46559ou9.class) {
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
                    return new C45373mu9(null);
                }
                return new C46559ou9();
            }
            return Em9.m108372l(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ\u0004\t", new Object[]{"zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    /* renamed from: y */
    public final String m20283y() {
        return this.zzf;
    }
}
