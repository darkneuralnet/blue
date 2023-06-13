package com.google.android.libraries.places.internal;
/* loaded from: classes6.dex */
public final class zzyj extends zzadk implements zzaes {
    private static final zzyj zzb;
    private int zze;
    private zzop zzf;
    private byte zzg = 2;

    static {
        zzyj zzyjVar = new zzyj();
        zzb = zzyjVar;
        zzadk.zzG(zzyj.class, zzyjVar);
    }

    private zzyj() {
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
                            this.zzg = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzyi(null);
                }
                return new zzyj();
            }
            return zzadk.zzF(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"zze", "zzf"});
        }
        return Byte.valueOf(this.zzg);
    }
}
