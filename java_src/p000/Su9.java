package p000;
/* renamed from: Su9 */
/* loaded from: classes6.dex */
public final class Su9 extends Em9<Su9, Qu9> implements Pp9 {
    private static final Su9 zzb;
    private static volatile InterfaceC42368hq9<Su9> zze;
    private int zzg;
    private long zzi;
    private C38299b09 zzj;
    private int zzk;
    private String zzf = "";
    private String zzh = "";

    static {
        Su9 su9 = new Su9();
        zzb = su9;
        Em9.m108371m(Su9.class, su9);
    }

    private Su9() {
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
                            InterfaceC42368hq9<Su9> interfaceC42368hq9 = zze;
                            if (interfaceC42368hq9 == null) {
                                synchronized (Su9.class) {
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
                    return new Qu9(null);
                }
                return new Su9();
            }
            return Em9.m108372l(zzb, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004\u0002\u0005\t\u0007\f", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
