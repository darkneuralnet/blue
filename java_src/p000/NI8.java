package p000;
/* renamed from: NI8 */
/* loaded from: classes5.dex */
public final class NI8 extends V78 implements InterfaceC48227rj8 {
    private static final NI8 zza;
    private int zzd;
    private int zze;

    static {
        NI8 ni8 = new NI8();
        zza = ni8;
        V78.m80336w(NI8.class, ni8);
    }

    private NI8() {
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
                    return new BI8(null);
                }
                return new NI8();
            }
            return V78.m80339t(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
