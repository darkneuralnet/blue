package com.google.android.libraries.places.internal;
/* loaded from: classes6.dex */
public final class zzzx extends zzadk implements zzaes {
    private static final zzzx zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private String zzh = "";

    static {
        zzzx zzzxVar = new zzzx();
        zzb = zzzxVar;
        zzadk.zzG(zzzx.class, zzzxVar);
    }

    private zzzx() {
    }

    public static /* synthetic */ zzzx zza() {
        return zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzzw(null);
                }
                return new zzzx();
            }
            return zzadk.zzF(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"zze", "zzf", zzvq.zza, "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
