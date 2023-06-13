package p000;

import java.util.List;
/* renamed from: uQ7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49824uQ7 extends V78 implements InterfaceC48227rj8 {
    private static final C49824uQ7 zza;
    private int zzd;
    private int zze;
    private AbstractC41604gZ7 zzf;
    private String zzg;
    private int zzh;
    private Hl9 zzi;
    private Dx9 zzj;
    private C39772dT7 zzk;
    private C44095kl7 zzl;
    private C40607es7 zzm;
    private C35715Rn7 zzn;
    private C32619Eh7 zzo;
    private C51131wd9 zzp;
    private Qq9 zzq;
    private LT8 zzr;
    private InterfaceC47544qa8 zzs;
    private K98 zzt;
    private String zzu;
    private InterfaceC47544qa8 zzv;
    private boolean zzw;
    private double zzx;
    private AbstractC41604gZ7 zzy;
    private byte zzz = 2;

    static {
        C49824uQ7 c49824uQ7 = new C49824uQ7();
        zza = c49824uQ7;
        V78.m80336w(C49824uQ7.class, c49824uQ7);
    }

    private C49824uQ7() {
        AbstractC41604gZ7 abstractC41604gZ7 = AbstractC41604gZ7.f82424c;
        this.zzf = abstractC41604gZ7;
        this.zzg = "";
        this.zzs = V78.m80342p();
        this.zzt = V78.m80343o();
        this.zzu = "";
        this.zzv = V78.m80342p();
        this.zzw = true;
        this.zzy = abstractC41604gZ7;
    }

    /* renamed from: W */
    public static /* synthetic */ void m10313W(C49824uQ7 c49824uQ7, int i, C48226rj7 c48226rj7) {
        c48226rj7.getClass();
        InterfaceC47544qa8 interfaceC47544qa8 = c49824uQ7.zzs;
        if (!interfaceC47544qa8.zzc()) {
            c49824uQ7.zzs = V78.m80341r(interfaceC47544qa8);
        }
        c49824uQ7.zzs.set(i, c48226rj7);
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
                            this.zzz = b;
                            return null;
                        }
                        return zza;
                    }
                    return new LC7(null);
                }
                return new C49824uQ7();
            }
            return V78.m80339t(zza, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0003\u000b\u0001ᔌ\u0000\u0002ᔊ\u0001\u0003ᔈ\u0002\u0004ᔌ\u0003\u0005ᐉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\u000bЛ\fဈ\u000e\rЛ\u000eည\u0011\u000fᐉ\n\u0010ဉ\u000b\u0011ဉ\f\u0012\u0016\u0013ဉ\r\u0014ဇ\u000f\u0015က\u0010", new Object[]{"zzd", "zze", K68.f19097a, "zzf", "zzg", "zzh", C32494Dt8.f6472a, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzs", C48226rj7.class, "zzu", "zzv", C48226rj7.class, "zzy", "zzo", "zzp", "zzq", "zzt", "zzr", "zzw", "zzx"});
        }
        return Byte.valueOf(this.zzz);
    }

    /* renamed from: H */
    public final int m10328H() {
        int m107453a = FA8.m107453a(this.zzh);
        if (m107453a == 0) {
            return 1;
        }
        return m107453a;
    }

    /* renamed from: I */
    public final int m10327I() {
        return this.zzs.size();
    }

    /* renamed from: J */
    public final C39772dT7 m10326J() {
        C39772dT7 c39772dT7 = this.zzk;
        return c39772dT7 == null ? C39772dT7.m44226I() : c39772dT7;
    }

    /* renamed from: L */
    public final C51131wd9 m10324L() {
        C51131wd9 c51131wd9 = this.zzp;
        return c51131wd9 == null ? C51131wd9.m6572K() : c51131wd9;
    }

    /* renamed from: M */
    public final Hl9 m10323M() {
        Hl9 hl9 = this.zzi;
        return hl9 == null ? Hl9.m103449J() : hl9;
    }

    /* renamed from: N */
    public final Qq9 m10322N() {
        Qq9 qq9 = this.zzq;
        return qq9 == null ? Qq9.m87885I() : qq9;
    }

    /* renamed from: O */
    public final Dx9 m10321O() {
        Dx9 dx9 = this.zzj;
        return dx9 == null ? Dx9.m109582I() : dx9;
    }

    /* renamed from: P */
    public final C32619Eh7 m10320P() {
        C32619Eh7 c32619Eh7 = this.zzo;
        return c32619Eh7 == null ? C32619Eh7.m108571K() : c32619Eh7;
    }

    /* renamed from: Q */
    public final C44095kl7 m10319Q() {
        C44095kl7 c44095kl7 = this.zzl;
        return c44095kl7 == null ? C44095kl7.m28486I() : c44095kl7;
    }

    /* renamed from: R */
    public final C35715Rn7 m10318R() {
        C35715Rn7 c35715Rn7 = this.zzn;
        return c35715Rn7 == null ? C35715Rn7.m86292I() : c35715Rn7;
    }

    /* renamed from: S */
    public final C40607es7 m10317S() {
        C40607es7 c40607es7 = this.zzm;
        return c40607es7 == null ? C40607es7.m42468I() : c40607es7;
    }

    /* renamed from: T */
    public final AbstractC41604gZ7 m10316T() {
        return this.zzf;
    }

    /* renamed from: U */
    public final String m10315U() {
        return this.zzg;
    }

    /* renamed from: V */
    public final List m10314V() {
        return this.zzs;
    }

    /* renamed from: X */
    public final boolean m10312X() {
        return (this.zzd & 2048) != 0;
    }

    /* renamed from: Y */
    public final boolean m10311Y() {
        return (this.zzd & 16) != 0;
    }

    /* renamed from: Z */
    public final boolean m10310Z() {
        return (this.zzd & 4096) != 0;
    }

    /* renamed from: a0 */
    public final boolean m10309a0() {
        return (this.zzd & 32) != 0;
    }

    /* renamed from: b0 */
    public final boolean m10308b0() {
        return (this.zzd & 1024) != 0;
    }

    /* renamed from: c0 */
    public final boolean m10307c0() {
        return (this.zzd & 64) != 0;
    }

    /* renamed from: d0 */
    public final boolean m10306d0() {
        return (this.zzd & 128) != 0;
    }

    /* renamed from: e0 */
    public final boolean m10305e0() {
        return (this.zzd & 512) != 0;
    }

    /* renamed from: f0 */
    public final boolean m10304f0() {
        return (this.zzd & 256) != 0;
    }

    /* renamed from: g0 */
    public final int m10303g0() {
        int m86473a = C35635Re8.m86473a(this.zze);
        if (m86473a == 0) {
            return 1;
        }
        return m86473a;
    }
}
