package com.google.android.libraries.places.internal;
/* loaded from: classes6.dex */
final class zzaen {
    private static final zzaem zza;
    private static final zzaem zzb;

    static {
        zzaem zzaemVar;
        try {
            zzaemVar = (zzaem) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzaemVar = null;
        }
        zza = zzaemVar;
        zzb = new zzaem();
    }

    public static zzaem zza() {
        return zza;
    }

    public static zzaem zzb() {
        return zzb;
    }
}
