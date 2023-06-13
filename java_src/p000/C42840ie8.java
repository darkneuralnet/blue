package p000;
/* renamed from: ie8 */
/* loaded from: classes5.dex */
public final class C42840ie8 extends V78 implements InterfaceC48227rj8 {
    public static final C47280q78 zza;
    private static final C42840ie8 zzd;
    private int zze;
    private C50399vO8 zzj;
    private C42840ie8 zzk;
    private C44217kx9 zzl;
    private byte zzm = 2;
    private String zzf = "";
    private InterfaceC47544qa8 zzg = V78.m80342p();
    private InterfaceC47544qa8 zzh = V78.m80342p();
    private InterfaceC47544qa8 zzi = V78.m80342p();

    static {
        C42840ie8 c42840ie8 = new C42840ie8();
        zzd = c42840ie8;
        V78.m80336w(C42840ie8.class, c42840ie8);
        zza = V78.m80349h(C50399vO8.m8746J(), c42840ie8, c42840ie8, null, 12208774, EnumC50737vx8.f114987m, C42840ie8.class);
    }

    private C42840ie8() {
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
                        return zzd;
                    }
                    return new C37765a68(null);
                }
                return new C42840ie8();
            }
            return V78.m80339t(zzd, "\u0001\u0007\u0000\u0001\u0002Ǵ\u0007\u0000\u0003\u0004\u0002Л\u0005Л\u0006\u001b\bᐉ\u0001\nဈ\u0000\u000bᐉ\u0002Ǵဉ\u0003", new Object[]{"zze", "zzg", C47373qH8.class, "zzi", C47373qH8.class, "zzh", C39827dZ8.class, "zzj", "zzf", "zzk", "zzl"});
        }
        return Byte.valueOf(this.zzm);
    }
}
