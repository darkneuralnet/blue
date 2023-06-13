package p000;
/* renamed from: vO8 */
/* loaded from: classes5.dex */
public final class C50399vO8 extends Q58 {
    private static final C50399vO8 zzd;
    private byte zze = 2;

    static {
        C50399vO8 c50399vO8 = new C50399vO8();
        zzd = c50399vO8;
        V78.m80336w(C50399vO8.class, c50399vO8);
    }

    private C50399vO8() {
    }

    /* renamed from: J */
    public static C50399vO8 m8746J() {
        return zzd;
    }

    @Override // p000.V78
    /* renamed from: G */
    public final Object mo3770G(int i, Object obj, Object obj2) {
        byte b;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (obj == null) {
                                b = 0;
                            } else {
                                b = 1;
                            }
                            this.zze = b;
                            return null;
                        }
                        return zzd;
                    }
                    return new C43285jO8(null);
                }
                return new C50399vO8();
            }
            return V78.m80339t(zzd, "\u0003\u0000", null);
        }
        return Byte.valueOf(this.zze);
    }
}
