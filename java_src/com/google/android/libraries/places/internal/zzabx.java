package com.google.android.libraries.places.internal;
/* loaded from: classes6.dex */
public final class zzabx extends zzadk implements zzaes {
    private static final zzabx zzb;
    private int zze;
    private int zzf;
    private zzabb zzg;
    private zzabb zzh;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private zzabb zzo;
    private zzabe zzp;
    private zzabk zzq;
    private int zzr;
    private int zzs;
    private zzabh zzt;
    private byte zzu = 2;
    private zzadr zzi = zzadk.zzB();

    static {
        zzabx zzabxVar = new zzabx();
        zzb = zzabxVar;
        zzadk.zzG(zzabx.class, zzabxVar);
    }

    private zzabx() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    public final Object zzb(int i, Object obj, Object obj2) {
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
                            this.zzu = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzabw(null);
                }
                return new zzabx();
            }
            return zzadk.zzF(zzb, "\u0001\u000f\u0000\u0001\u0002\u0010\u000f\u0000\u0001\u0001\u0002ᔄ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005\u001b\u0006င\u0003\u0007င\u0004\bင\u0005\tင\u0006\nင\u0007\u000bဉ\b\fဉ\t\rဉ\n\u000eင\u000b\u000fင\f\u0010ဉ\r", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzabu.class, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt"});
        }
        return Byte.valueOf(this.zzu);
    }
}
