package p000;
/* renamed from: qH8 */
/* loaded from: classes5.dex */
public final class C47373qH8 extends V78 implements InterfaceC48227rj8 {
    private static final C47373qH8 zza;
    private int zzd;
    private int zzg;
    private C41815gu9 zzh;
    private Dd9 zzi;
    private C50399vO8 zzj;
    private int zzk;
    private byte zzm = 2;
    private int zze = 17;
    private InterfaceC47544qa8 zzf = V78.m80342p();
    private InterfaceC47544qa8 zzl = V78.m80342p();

    static {
        C47373qH8 c47373qH8 = new C47373qH8();
        zza = c47373qH8;
        V78.m80336w(C47373qH8.class, c47373qH8);
    }

    private C47373qH8() {
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
                            this.zzm = b;
                            return null;
                        }
                        return zza;
                    }
                    return new C39433ct8(null);
                }
                return new C47373qH8();
            }
            return V78.m80339t(zza, "\u0001\b\u0000\u0001\u0001\u000f\b\u0000\u0002\u0004\u0001ဌ\u0000\u0003Л\u0004င\u0001\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007င\u0005\b\u001b\u000fᐉ\u0004", new Object[]{"zzd", "zze", C40787fA8.f79638a, "zzf", C37353Yn7.class, "zzg", "zzh", "zzi", "zzk", "zzl", C32232Cq7.class, "zzj"});
        }
        return Byte.valueOf(this.zzm);
    }
}
