package com.google.android.libraries.places.internal;
/* loaded from: classes6.dex */
public final class zzxk extends zzadk implements zzaes {
    private static final zzxk zzb;
    private int zze;
    private zzor zzg;
    private zzwy zzh;
    private byte zzi = 2;
    private String zzf = "";

    static {
        zzxk zzxkVar = new zzxk();
        zzb = zzxkVar;
        zzadk.zzG(zzxk.class, zzxkVar);
    }

    private zzxk() {
    }

    public static zzxj zza() {
        return (zzxj) zzb.zzx();
    }

    public static /* synthetic */ void zzd(zzxk zzxkVar, zzwy zzwyVar) {
        zzxkVar.zzh = zzwyVar;
        zzxkVar.zze |= 4;
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
                            this.zzi = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzxj(null);
                }
                return new zzxk();
            }
            return zzadk.zzF(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return Byte.valueOf(this.zzi);
    }
}
