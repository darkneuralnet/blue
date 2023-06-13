package com.google.android.libraries.places.internal;
/* loaded from: classes6.dex */
final class zzadg implements zzaep {
    private static final zzadg zza = new zzadg();

    private zzadg() {
    }

    public static zzadg zza() {
        return zza;
    }

    @Override // com.google.android.libraries.places.internal.zzaep
    public final zzaeo zzb(Class cls) {
        String str;
        String str2;
        if (!zzadk.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            if (name.length() != 0) {
                str2 = "Unsupported message type: ".concat(name);
            } else {
                str2 = new String("Unsupported message type: ");
            }
            throw new IllegalArgumentException(str2);
        }
        try {
            return (zzaeo) zzadk.zzy(cls.asSubclass(zzadk.class)).zzb(3, null, null);
        } catch (Exception e) {
            String name2 = cls.getName();
            if (name2.length() != 0) {
                str = "Unable to get message info for ".concat(name2);
            } else {
                str = new String("Unable to get message info for ");
            }
            throw new RuntimeException(str, e);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzaep
    public final boolean zzc(Class cls) {
        return zzadk.class.isAssignableFrom(cls);
    }
}
