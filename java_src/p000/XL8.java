package p000;
/* renamed from: XL8 */
/* loaded from: classes5.dex */
public final class XL8 extends V78 implements InterfaceC48227rj8 {
    private static final XL8 zza;
    private int zzd;
    private String zze = "";

    static {
        XL8 xl8 = new XL8();
        zza = xl8;
        V78.m80336w(XL8.class, xl8);
    }

    private XL8() {
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
                    return new LL8(null);
                }
                return new XL8();
            }
            return V78.m80339t(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
