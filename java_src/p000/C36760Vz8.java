package p000;
/* renamed from: Vz8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36760Vz8 extends V78 implements InterfaceC48227rj8 {
    private static final C36760Vz8 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        C36760Vz8 c36760Vz8 = new C36760Vz8();
        zza = c36760Vz8;
        V78.m80336w(C36760Vz8.class, c36760Vz8);
    }

    private C36760Vz8() {
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
                    return new C33952Jz8(null);
                }
                return new C36760Vz8();
            }
            return V78.m80339t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
