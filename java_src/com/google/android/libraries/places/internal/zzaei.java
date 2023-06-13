package com.google.android.libraries.places.internal;
/* loaded from: classes6.dex */
final class zzaei implements zzaep {
    private final zzaep[] zza;

    public zzaei(zzaep... zzaepVarArr) {
        this.zza = zzaepVarArr;
    }

    @Override // com.google.android.libraries.places.internal.zzaep
    public final zzaeo zzb(Class cls) {
        String str;
        zzaep[] zzaepVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            zzaep zzaepVar = zzaepVarArr[i];
            if (zzaepVar.zzc(cls)) {
                return zzaepVar.zzb(cls);
            }
        }
        String name = cls.getName();
        if (name.length() != 0) {
            str = "No factory is available for message type: ".concat(name);
        } else {
            str = new String("No factory is available for message type: ");
        }
        throw new UnsupportedOperationException(str);
    }

    @Override // com.google.android.libraries.places.internal.zzaep
    public final boolean zzc(Class cls) {
        zzaep[] zzaepVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            if (zzaepVarArr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
