package p000;
/* renamed from: yA8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52052yA8 extends V78 implements InterfaceC48227rj8 {
    private static final C52052yA8 zza;
    private int zzd;
    private C33295He8 zzj;
    private C32305Cy8 zzm;
    private String zze = "";
    private AbstractC41604gZ7 zzf = AbstractC41604gZ7.f82424c;
    private int zzg = 10;
    private float zzh = 0.5f;
    private float zzi = 0.05f;
    private InterfaceC50263v98 zzk = V78.m80345m();
    private int zzl = 1;
    private int zzn = 320;
    private int zzo = 4;
    private int zzp = 2;

    static {
        C52052yA8 c52052yA8 = new C52052yA8();
        zza = c52052yA8;
        V78.m80336w(C52052yA8.class, c52052yA8);
    }

    private C52052yA8() {
    }

    /* renamed from: H */
    public static C50697vt8 m3893H() {
        return (C50697vt8) zza.m80351f();
    }

    /* renamed from: J */
    public static /* synthetic */ void m3891J(C52052yA8 c52052yA8, C33295He8 c33295He8) {
        c33295He8.getClass();
        c52052yA8.zzj = c33295He8;
        c52052yA8.zzd |= 32;
    }

    /* renamed from: K */
    public static /* synthetic */ void m3890K(C52052yA8 c52052yA8, AbstractC41604gZ7 abstractC41604gZ7) {
        abstractC41604gZ7.getClass();
        c52052yA8.zzd |= 2;
        c52052yA8.zzf = abstractC41604gZ7;
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
                    return new C50697vt8(null);
                }
                return new C52052yA8();
            }
            return V78.m80339t(zza, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဋ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ဉ\u0005\u0007\u0013\bင\u0006\tဉ\u0007\nင\b\u000bင\t\fင\n", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
        }
        return (byte) 1;
    }
}
