package p000;
/* renamed from: b09 */
/* loaded from: classes6.dex */
public final class C38299b09 extends Em9<C38299b09, RZ8> implements Pp9 {
    private static final C38299b09 zzb;
    private static volatile InterfaceC42368hq9<C38299b09> zze;
    private int zzf;
    private String zzg = "";

    static {
        C38299b09 c38299b09 = new C38299b09();
        zzb = c38299b09;
        Em9.m108371m(C38299b09.class, c38299b09);
    }

    private C38299b09() {
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
                            InterfaceC42368hq9<C38299b09> interfaceC42368hq9 = zze;
                            if (interfaceC42368hq9 == null) {
                                synchronized (C38299b09.class) {
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
                    return new RZ8(null);
                }
                return new C38299b09();
            }
            return Em9.m108372l(zzb, "\u0001\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0000\u0007ဈ\u0000", new Object[]{"zzf", "zzg"});
        }
        return (byte) 1;
    }
}
