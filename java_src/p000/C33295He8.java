package p000;
/* renamed from: He8 */
/* loaded from: classes6.dex */
public final class C33295He8 extends V78 implements InterfaceC48227rj8 {
    private static final C33295He8 zza;
    private InterfaceC47544qa8 zzd = V78.m80342p();

    static {
        C33295He8 c33295He8 = new C33295He8();
        zza = c33295He8;
        V78.m80336w(C33295He8.class, c33295He8);
    }

    private C33295He8() {
    }

    /* renamed from: H */
    public static B68 m103577H() {
        return (B68) zza.m80351f();
    }

    /* renamed from: J */
    public static /* synthetic */ void m103575J(C33295He8 c33295He8, C42709iQ7 c42709iQ7) {
        c42709iQ7.getClass();
        InterfaceC47544qa8 interfaceC47544qa8 = c33295He8.zzd;
        if (!interfaceC47544qa8.zzc()) {
            c33295He8.zzd = V78.m80341r(interfaceC47544qa8);
        }
        c33295He8.zzd.add(c42709iQ7);
    }

    @Override // p000.V78
    /* renamed from: G */
    public final Object mo3770G(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new B68(null);
                }
                return new C33295He8();
            }
            return V78.m80339t(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C42709iQ7.class});
        }
        return (byte) 1;
    }
}
