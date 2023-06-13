package p000;
/* renamed from: gu9 */
/* loaded from: classes5.dex */
public final class C41815gu9 extends V78 implements InterfaceC48227rj8 {
    public static final C47280q78 zza;
    private static final C41815gu9 zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private C50399vO8 zzh;
    private byte zzi = 2;

    static {
        C41815gu9 c41815gu9 = new C41815gu9();
        zzd = c41815gu9;
        V78.m80336w(C41815gu9.class, c41815gu9);
        zza = V78.m80349h(C50399vO8.m8746J(), c41815gu9, c41815gu9, null, 13258261, EnumC50737vx8.f114987m, C41815gu9.class);
    }

    private C41815gu9() {
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
                            this.zzi = b;
                            return null;
                        }
                        return zzd;
                    }
                    return new C53060zs9(null);
                }
                return new C41815gu9();
            }
            return V78.m80339t(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔅ\u0000\u0002ᔅ\u0001\u0003ᐉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return Byte.valueOf(this.zzi);
    }
}
