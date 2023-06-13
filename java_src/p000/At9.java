package p000;
/* renamed from: At9 */
/* loaded from: classes6.dex */
public final class At9 extends Em9<At9, C52477yt9> implements Pp9 {
    private static final At9 zzb;
    private static volatile InterfaceC42368hq9<At9> zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        At9 at9 = new At9();
        zzb = at9;
        Em9.m108371m(At9.class, at9);
    }

    private At9() {
    }

    /* renamed from: A */
    public static /* synthetic */ void m114976A(At9 at9, String str) {
        str.getClass();
        at9.zzg = str;
    }

    /* renamed from: B */
    public static /* synthetic */ void m114975B(At9 at9, String str) {
        str.getClass();
        at9.zzh = str;
    }

    /* renamed from: w */
    public static C52477yt9 m114974w() {
        return zzb.m108370o();
    }

    /* renamed from: y */
    public static /* synthetic */ void m114972y(At9 at9, String str) {
        str.getClass();
        at9.zzf = str;
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
                            InterfaceC42368hq9<At9> interfaceC42368hq9 = zze;
                            if (interfaceC42368hq9 == null) {
                                synchronized (At9.class) {
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
                    return new C52477yt9(null);
                }
                return new At9();
            }
            return Em9.m108372l(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
