package p000;

import java.util.List;
/* renamed from: Id8 */
/* loaded from: classes5.dex */
public final class C33520Id8 extends AbstractC46897pU8 implements A19 {
    private static final C33520Id8 zza;
    private int zzd;
    private int zze;
    private boolean zzg;
    private String zzf = "";
    private NV8 zzh = AbstractC46897pU8.m19202q();

    static {
        C33520Id8 c33520Id8 = new C33520Id8();
        zza = c33520Id8;
        AbstractC46897pU8.m19196w(C33520Id8.class, c33520Id8);
    }

    private C33520Id8() {
    }

    /* renamed from: D */
    public static C33520Id8 m101861D() {
        return zza;
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
                    return new C33511Ic8(null);
                }
                return new C33520Id8();
            }
            return AbstractC46897pU8.m19199t(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzd", "zze", C47574qd8.f105538a, "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    /* renamed from: B */
    public final int m101863B() {
        return this.zzh.size();
    }

    /* renamed from: E */
    public final String m101860E() {
        return this.zzf;
    }

    /* renamed from: F */
    public final List m101859F() {
        return this.zzh;
    }

    /* renamed from: G */
    public final boolean m101858G() {
        return this.zzg;
    }

    /* renamed from: H */
    public final boolean m101857H() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: I */
    public final boolean m101856I() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: J */
    public final boolean m101855J() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: K */
    public final int m101854K() {
        int m8326a = C50537vd8.m8326a(this.zze);
        if (m8326a == 0) {
            return 1;
        }
        return m8326a;
    }
}
