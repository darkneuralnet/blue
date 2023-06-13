package p000;
/* renamed from: Dd9 */
/* loaded from: classes5.dex */
public final class Dd9 extends V78 implements InterfaceC48227rj8 {
    private static final Dd9 zza;
    private int zzd;
    private C50399vO8 zzj;
    private byte zzk = 2;
    private K98 zze = V78.m80343o();
    private InterfaceC50263v98 zzf = V78.m80345m();
    private boolean zzg = true;
    private String zzh = "";
    private String zzi = "";

    static {
        Dd9 dd9 = new Dd9();
        zza = dd9;
        V78.m80336w(Dd9.class, dd9);
    }

    private Dd9() {
    }

    @Override // p000.V78
    /* renamed from: G */
    public final Object mo3770G(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (obj == null) {
                                b = 0;
                            }
                            this.zzk = b;
                            return null;
                        }
                        return zza;
                    }
                    return new E99(null);
                }
                return new Dd9();
            }
            return V78.m80339t(zza, "\u0001\u0006\u0000\u0001\u0001\u000f\u0006\u0000\u0002\u0001\u0001\u0016\u0002\u0013\u0003ဇ\u0000\u0004ဈ\u0001\u0005ဈ\u0002\u000fᐉ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return Byte.valueOf(this.zzk);
    }
}
