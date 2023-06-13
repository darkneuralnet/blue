package com.google.android.libraries.places.internal;
/* loaded from: classes6.dex */
public final class zzop extends zzadk implements zzaes {
    private static final zzop zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private byte zzh = 2;

    static {
        zzop zzopVar = new zzop();
        zzb = zzopVar;
        zzadk.zzG(zzop.class, zzopVar);
    }

    private zzop() {
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
                            this.zzh = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzoo(null);
                }
                return new zzop();
            }
            return zzadk.zzF(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔆ\u0000\u0002ᔆ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return Byte.valueOf(this.zzh);
    }
}
