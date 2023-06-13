package p000;
/* renamed from: dT7 */
/* loaded from: classes5.dex */
public final class C39772dT7 extends V78 implements InterfaceC48227rj8 {
    private static final C39772dT7 zza;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        C39772dT7 c39772dT7 = new C39772dT7();
        zza = c39772dT7;
        V78.m80336w(C39772dT7.class, c39772dT7);
    }

    private C39772dT7() {
    }

    /* renamed from: I */
    public static C39772dT7 m44226I() {
        return zza;
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
                    return new UR7(null);
                }
                return new C39772dT7();
            }
            return V78.m80339t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", C51620xS7.f117635a, "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: J */
    public final String m44225J() {
        return this.zzf;
    }

    /* renamed from: K */
    public final int m44224K() {
        int m92277a = OS7.m92277a(this.zze);
        if (m92277a == 0) {
            return 1;
        }
        return m92277a;
    }
}
