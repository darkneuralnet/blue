package p000;
/* renamed from: ut9 */
/* loaded from: classes6.dex */
public final class C50106ut9 extends Em9<C50106ut9, C48920st9> implements Pp9 {
    private static final C50106ut9 zzb;
    private static volatile InterfaceC42368hq9<C50106ut9> zze;
    private AbstractC45836nh9 zzf;
    private AbstractC45836nh9 zzg;

    static {
        C50106ut9 c50106ut9 = new C50106ut9();
        zzb = c50106ut9;
        Em9.m108371m(C50106ut9.class, c50106ut9);
    }

    private C50106ut9() {
        AbstractC45836nh9 abstractC45836nh9 = AbstractC45836nh9.f100361c;
        this.zzf = abstractC45836nh9;
        this.zzg = abstractC45836nh9;
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
                            InterfaceC42368hq9<C50106ut9> interfaceC42368hq9 = zze;
                            if (interfaceC42368hq9 == null) {
                                synchronized (C50106ut9.class) {
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
                    return new C48920st9(null);
                }
                return new C50106ut9();
            }
            return Em9.m108372l(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new Object[]{"zzf", "zzg"});
        }
        return (byte) 1;
    }
}
