package p000;
/* renamed from: R28 */
/* loaded from: classes6.dex */
public final class R28 extends Em9<R28, E28> implements Pp9 {
    private static final R28 zzb;
    private static volatile InterfaceC42368hq9<R28> zze;
    private String zzf = "";
    private Kr9 zzg;

    static {
        R28 r28 = new R28();
        zzb = r28;
        Em9.m108371m(R28.class, r28);
    }

    private R28() {
    }

    /* renamed from: B */
    public static /* synthetic */ void m87391B(R28 r28, String str) {
        str.getClass();
        r28.zzf = str;
    }

    /* renamed from: C */
    public static /* synthetic */ void m87390C(R28 r28, Kr9 kr9) {
        kr9.getClass();
        r28.zzg = kr9;
    }

    /* renamed from: w */
    public static E28 m87389w() {
        return zzb.m108370o();
    }

    /* renamed from: y */
    public static R28 m87387y() {
        return zzb;
    }

    /* renamed from: A */
    public final String m87392A() {
        return this.zzf;
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
                            InterfaceC42368hq9<R28> interfaceC42368hq9 = zze;
                            if (interfaceC42368hq9 == null) {
                                synchronized (R28.class) {
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
                    return new E28(null);
                }
                return new R28();
            }
            return Em9.m108372l(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzf", "zzg"});
        }
        return (byte) 1;
    }
}
