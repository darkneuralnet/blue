package p000;

import java.util.List;
/* renamed from: Hl9 */
/* loaded from: classes6.dex */
public final class Hl9 extends V78 implements InterfaceC48227rj8 {
    private static final Hl9 zza;
    private int zzd;
    private ER7 zze;
    private byte zzm = 2;
    private String zzf = "";
    private String zzg = "";
    private InterfaceC47544qa8 zzh = V78.m80342p();
    private InterfaceC47544qa8 zzi = V78.m80342p();
    private InterfaceC47544qa8 zzj = V78.m80342p();
    private InterfaceC47544qa8 zzk = V78.m80342p();
    private String zzl = "";

    static {
        Hl9 hl9 = new Hl9();
        zza = hl9;
        V78.m80336w(Hl9.class, hl9);
    }

    private Hl9() {
    }

    /* renamed from: J */
    public static Hl9 m103449J() {
        return zza;
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
                    return new Nh9(null);
                }
                return new Hl9();
            }
            return V78.m80339t(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0004\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b\u0005\u001b\u0006\u001a\u0007Л\bဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", C39772dT7.class, "zzi", Dx9.class, "zzj", "zzk", C37957aR7.class, "zzl"});
        }
        return Byte.valueOf(this.zzm);
    }

    /* renamed from: H */
    public final ER7 m103451H() {
        ER7 er7 = this.zze;
        return er7 == null ? ER7.m109012I() : er7;
    }

    /* renamed from: K */
    public final String m103448K() {
        return this.zzf;
    }

    /* renamed from: L */
    public final String m103447L() {
        return this.zzg;
    }

    /* renamed from: M */
    public final List m103446M() {
        return this.zzk;
    }

    /* renamed from: N */
    public final List m103445N() {
        return this.zzi;
    }

    /* renamed from: O */
    public final List m103444O() {
        return this.zzh;
    }

    /* renamed from: P */
    public final List m103443P() {
        return this.zzj;
    }
}
