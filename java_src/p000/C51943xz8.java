package p000;
/* renamed from: xz8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51943xz8 extends V78 implements InterfaceC48227rj8 {
    private static final C51943xz8 zza;
    private int zzd;
    private int zze = -1;

    static {
        C51943xz8 c51943xz8 = new C51943xz8();
        zza = c51943xz8;
        V78.m80336w(C51943xz8.class, c51943xz8);
    }

    private C51943xz8() {
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
                    return new C44829lz8(null);
                }
                return new C51943xz8();
            }
            return V78.m80339t(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
