package com.google.android.libraries.places.internal;
/* loaded from: classes6.dex */
public final class zzlg extends zzadk implements zzaes {
    private static final zzlg zzb;
    private int zze;
    private zzya zzg;
    private zzni zzh;
    private zzaav zzi;
    private zzux zzj;
    private zzqq zzk;
    private zzob zzl;
    private zznc zzm;
    private zzmi zzn;
    private zznv zzo;
    private zzsh zzp;
    private zzsv zzq;
    private zzsy zzr;
    private zzls zzs;
    private zzox zzt;
    private zzc zzu;
    private zzaj zzv;
    private zzar zzw;
    private byte zzx = 2;
    private int zzf = 1;

    static {
        zzlg zzlgVar = new zzlg();
        zzb = zzlgVar;
        zzadk.zzG(zzlg.class, zzlgVar);
    }

    private zzlg() {
    }

    public static zzle zza() {
        return (zzle) zzb.zzx();
    }

    public static /* synthetic */ void zzd(zzlg zzlgVar, zzya zzyaVar) {
        zzyaVar.getClass();
        zzlgVar.zzg = zzyaVar;
        zzlgVar.zze |= 2;
    }

    public static /* synthetic */ void zze(zzlg zzlgVar, int i) {
        zzlgVar.zzf = 1;
        zzlgVar.zze = 1 | zzlgVar.zze;
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
                            this.zzx = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzle(null);
                }
                return new zzlg();
            }
            return zzadk.zzF(zzb, "\u0001\u0012\u0000\u0001\u0001\u0013\u0012\u0000\u0000\u0002\u0001ဌ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f\u000fဉ\r\u0010ဉ\u000e\u0011ဉ\u000f\u0012ဉ\u0010\u0013ဉ\u0011", new Object[]{"zze", "zzf", zzlf.zza, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw"});
        }
        return Byte.valueOf(this.zzx);
    }
}
