package com.google.android.libraries.places.internal;
/* loaded from: classes6.dex */
public final class zzuf extends zzadk implements zzaes {
    private static final zzuf zzb;
    private int zze;
    private int zzf;

    static {
        zzuf zzufVar = new zzuf();
        zzb = zzufVar;
        zzadk.zzG(zzuf.class, zzufVar);
    }

    private zzuf() {
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
                    return new zzue(null);
                }
                return new zzuf();
            }
            return zzadk.zzF(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }
}