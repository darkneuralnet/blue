package com.google.android.libraries.places.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class zzhq extends zzhg {
    private final zzhs zza;

    public zzhq(zzhs zzhsVar, int i) {
        super(zzhsVar.size(), i);
        this.zza = zzhsVar;
    }

    @Override // com.google.android.libraries.places.internal.zzhg
    public final Object zza(int i) {
        return this.zza.get(i);
    }
}
