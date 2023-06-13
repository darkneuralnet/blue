package p000;
/* renamed from: Yn7 */
/* loaded from: classes5.dex */
public final class C37353Yn7 extends V78 implements InterfaceC48227rj8 {
    public static final C47280q78 zza;
    private static final InterfaceC38039aa8 zzd = new C47653ql7();
    private static final C37353Yn7 zze;
    private int zzf;
    private C44217kx9 zzl;
    private C50399vO8 zzm;
    private byte zzn = 2;
    private String zzg = "";
    private String zzh = "";
    private K98 zzi = V78.m80343o();
    private String zzj = "";
    private String zzk = "";

    static {
        C37353Yn7 c37353Yn7 = new C37353Yn7();
        zze = c37353Yn7;
        V78.m80336w(C37353Yn7.class, c37353Yn7);
        zza = V78.m80349h(C50399vO8.m8746J(), c37353Yn7, c37353Yn7, null, 308676116, EnumC50737vx8.f114987m, C37353Yn7.class);
    }

    private C37353Yn7() {
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
                            this.zzn = b;
                            return null;
                        }
                        return zze;
                    }
                    return new C45884nm7(null);
                }
                return new C37353Yn7();
            }
            return V78.m80339t(zze, "\u0001\u0007\u0000\u0001\u0001Ǵ\u0007\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ဈ\u0001\u0003\u001e\u0005ဈ\u0002\u0006ဈ\u0003\u000fᐉ\u0005Ǵဉ\u0004", new Object[]{"zzf", "zzg", "zzh", "zzi", C42336hn7.f85892a, "zzj", "zzk", "zzm", "zzl"});
        }
        return Byte.valueOf(this.zzn);
    }
}
