package p000;

import java.util.List;
/* renamed from: Ds8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32485Ds8 extends AbstractC46897pU8 implements A19 {
    private static final C32485Ds8 zza;
    private int zzd;
    private int zze;
    private NV8 zzf = AbstractC46897pU8.m19202q();
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        C32485Ds8 c32485Ds8 = new C32485Ds8();
        zza = c32485Ds8;
        AbstractC46897pU8.m19196w(C32485Ds8.class, c32485Ds8);
    }

    private C32485Ds8() {
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
                    return new C32710Er8(null);
                }
                return new C32485Ds8();
            }
            return AbstractC46897pU8.m19199t(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzd", "zze", C40015ds8.f77334a, "zzf", C32485Ds8.class, "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    /* renamed from: B */
    public final double m109827B() {
        return this.zzj;
    }

    /* renamed from: D */
    public final String m109825D() {
        return this.zzg;
    }

    /* renamed from: E */
    public final String m109824E() {
        return this.zzh;
    }

    /* renamed from: F */
    public final List m109823F() {
        return this.zzf;
    }

    /* renamed from: G */
    public final boolean m109822G() {
        return this.zzi;
    }

    /* renamed from: H */
    public final boolean m109821H() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: I */
    public final boolean m109820I() {
        return (this.zzd & 16) != 0;
    }

    /* renamed from: J */
    public final boolean m109819J() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: K */
    public final int m109818K() {
        int m20373a = C46538os8.m20373a(this.zze);
        if (m20373a == 0) {
            return 1;
        }
        return m20373a;
    }
}
