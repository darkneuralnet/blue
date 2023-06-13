package p000;

import java.util.List;
/* renamed from: mp8 */
/* loaded from: classes5.dex */
public final class C45322mp8 extends AbstractC46897pU8 implements A19 {
    private static final C45322mp8 zza;
    private int zzd;
    private int zze;
    private CV8 zzf = AbstractC46897pU8.m19204o();

    static {
        C45322mp8 c45322mp8 = new C45322mp8();
        zza = c45322mp8;
        AbstractC46897pU8.m19196w(C45322mp8.class, c45322mp8);
    }

    private C45322mp8() {
    }

    /* renamed from: E */
    public static C38189ap8 m24877E() {
        return (C38189ap8) zza.m19209i();
    }

    /* renamed from: H */
    public static /* synthetic */ void m24874H(C45322mp8 c45322mp8, int i) {
        c45322mp8.zzd |= 1;
        c45322mp8.zze = i;
    }

    /* renamed from: I */
    public static /* synthetic */ void m24873I(C45322mp8 c45322mp8, Iterable iterable) {
        CV8 cv8 = c45322mp8.zzf;
        if (!cv8.zzc()) {
            c45322mp8.zzf = AbstractC46897pU8.m19203p(cv8);
        }
        QJ8.m88654b(iterable, c45322mp8.zzf);
    }

    @Override // p000.AbstractC46897pU8
    /* renamed from: A */
    public final Object mo8350A(int i, Object obj, Object obj2) {
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
                    return new C38189ap8(null);
                }
                return new C45322mp8();
            }
            return AbstractC46897pU8.m19199t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: B */
    public final int m24880B() {
        return this.zzf.size();
    }

    /* renamed from: C */
    public final int m24879C() {
        return this.zze;
    }

    /* renamed from: D */
    public final long m24878D(int i) {
        return this.zzf.zza(i);
    }

    /* renamed from: G */
    public final List m24875G() {
        return this.zzf;
    }

    /* renamed from: J */
    public final boolean m24872J() {
        return (this.zzd & 1) != 0;
    }
}
