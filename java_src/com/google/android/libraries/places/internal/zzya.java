package com.google.android.libraries.places.internal;

import okhttp3.internal.http2.Http2Connection;
/* loaded from: classes6.dex */
public final class zzya extends zzadk implements zzaes {
    private static final zzya zzb;
    private zzwj zzA;
    private zzaao zzB;
    private boolean zzC;
    private zzwt zzE;
    private boolean zzF;
    private int zzH;
    private int zzK;
    private int zze;
    private int zzf;
    private zzln zzh;
    private zzop zzi;
    private int zzj;
    private float zzk;
    private zzzm zzm;
    private zzww zzo;
    private zzxd zzp;
    private zzze zzq;
    private zzyo zzr;
    private zzyx zzs;
    private zzyt zzt;
    private zzzj zzu;
    private zzxp zzv;
    private zzyc zzw;
    private zzyz zzx;
    private zzxs zzy;
    private zzxg zzz;
    private byte zzM = 2;
    private int zzg = 1;
    private zzadr zzl = zzadk.zzB();
    private zzadr zzn = zzadk.zzB();
    private String zzD = "";
    private String zzG = "";
    private String zzI = "";
    private String zzJ = "";
    private String zzL = "";

    static {
        zzya zzyaVar = new zzya();
        zzb = zzyaVar;
        zzadk.zzG(zzya.class, zzyaVar);
    }

    private zzya() {
    }

    public static zzxv zza() {
        return (zzxv) zzb.zzx();
    }

    public static /* synthetic */ void zzd(zzya zzyaVar, zzzm zzzmVar) {
        zzzmVar.getClass();
        zzyaVar.zzm = zzzmVar;
        zzyaVar.zze |= 64;
    }

    public static /* synthetic */ void zze(zzya zzyaVar, zzze zzzeVar) {
        zzzeVar.getClass();
        zzyaVar.zzq = zzzeVar;
        zzyaVar.zze |= 512;
    }

    public static /* synthetic */ void zzf(zzya zzyaVar, zzyo zzyoVar) {
        zzyoVar.getClass();
        zzyaVar.zzr = zzyoVar;
        zzyaVar.zze |= 1024;
    }

    public static /* synthetic */ void zzg(zzya zzyaVar, zzln zzlnVar) {
        zzlnVar.getClass();
        zzyaVar.zzh = zzlnVar;
        zzyaVar.zze |= 4;
    }

    public static /* synthetic */ void zzh(zzya zzyaVar, zzxp zzxpVar) {
        zzxpVar.getClass();
        zzyaVar.zzv = zzxpVar;
        zzyaVar.zze |= 16384;
    }

    public static /* synthetic */ void zzi(zzya zzyaVar, zzwt zzwtVar) {
        zzwtVar.getClass();
        zzyaVar.zzE = zzwtVar;
        zzyaVar.zze |= 8388608;
    }

    public static /* synthetic */ void zzj(zzya zzyaVar, boolean z) {
        zzyaVar.zze |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        zzyaVar.zzF = true;
    }

    public static /* synthetic */ void zzk(zzya zzyaVar, String str) {
        str.getClass();
        zzyaVar.zze |= 33554432;
        zzyaVar.zzG = str;
    }

    public static /* synthetic */ void zzl(zzya zzyaVar, String str) {
        zzyaVar.zze |= 134217728;
        zzyaVar.zzI = "2.6.0";
    }

    public static /* synthetic */ void zzm(zzya zzyaVar, String str) {
        str.getClass();
        zzyaVar.zze |= 1073741824;
        zzyaVar.zzL = str;
    }

    public static /* synthetic */ void zzn(zzya zzyaVar, int i) {
        zzyaVar.zzg = i;
        zzyaVar.zze |= 2;
    }

    public static /* synthetic */ void zzo(zzya zzyaVar, int i) {
        zzyaVar.zzK = i - 1;
        zzyaVar.zze |= 536870912;
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
                            this.zzM = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzxv(null);
                }
                return new zzya();
            }
            return zzadk.zzF(zzb, "\u0001!\u0000\u0001\u0001!!\u0000\u0002\u0003\u0001ဌ\u0001\u0002ဉ\u0002\u0003ᐉ\u0003\u0004\u001b\u0005ᐉ\u0006\u0006\u001b\u0007ဉ\u0007\bᐉ\b\tဌ\u0004\nခ\u0005\u000bဇ\u0015\fဉ\t\rဈ\u0016\u000eဉ\n\u000fဉ\u000b\u0010ဉ\f\u0011ဉ\r\u0012ဉ\u000e\u0013ဉ\u000f\u0014ဉ\u0010\u0015ဉ\u0011\u0016ဉ\u0012\u0017ဉ\u0013\u0018ဉ\u0017\u0019င\u0000\u001aဉ\u0014\u001bဇ\u0018\u001cဈ\u0019\u001dဌ\u001a\u001eဈ\u001b\u001fဈ\u001c ဌ\u001d!ဈ\u001e", new Object[]{"zze", "zzg", zzxx.zza, "zzh", "zzi", "zzl", zzaas.class, "zzm", "zzn", zzww.class, "zzo", "zzp", "zzj", zzxw.zza, "zzk", "zzC", "zzq", "zzD", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzE", "zzf", "zzB", "zzF", "zzG", "zzH", zzxy.zza, "zzI", "zzJ", "zzK", zzxz.zza, "zzL"});
        }
        return Byte.valueOf(this.zzM);
    }
}
