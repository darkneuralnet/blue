package p000;
/* renamed from: mt9 */
/* loaded from: classes6.dex */
public final class C45363mt9 extends Em9<C45363mt9, C44177kt9> implements Pp9 {
    private static final C45363mt9 zzb;
    private static volatile InterfaceC42368hq9<C45363mt9> zze;
    private Object zzg;
    private boolean zzi;
    private Kv9 zzj;
    private int zzf = 0;
    private AbstractC45836nh9 zzh = AbstractC45836nh9.f100361c;

    static {
        C45363mt9 c45363mt9 = new C45363mt9();
        zzb = c45363mt9;
        Em9.m108371m(C45363mt9.class, c45363mt9);
    }

    private C45363mt9() {
    }

    /* renamed from: w */
    public static C44177kt9 m24743w() {
        return zzb.m108370o();
    }

    /* renamed from: y */
    public static /* synthetic */ void m24741y(C45363mt9 c45363mt9, At9 at9) {
        at9.getClass();
        c45363mt9.zzg = at9;
        c45363mt9.zzf = 2;
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
                            InterfaceC42368hq9<C45363mt9> interfaceC42368hq9 = zze;
                            if (interfaceC42368hq9 == null) {
                                synchronized (C45363mt9.class) {
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
                    return new C44177kt9(null);
                }
                return new C45363mt9();
            }
            return Em9.m108372l(zzb, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȼ\u0000\u0002<\u0000\u0003\n\u0004\u0007\u0005\t", new Object[]{"zzg", "zzf", At9.class, "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
