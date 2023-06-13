package com.google.android.libraries.places.internal;

import androidx.lifecycle.C11759u;
/* loaded from: classes6.dex */
public final class zzgd implements C11759u.InterfaceC11763b {
    private final zzfs zza;
    private final zzgi zzb;
    private final zzgj zzc;

    public zzgd(zzfs zzfsVar, zzgi zzgiVar, zzgj zzgjVar) {
        this.zza = zzfsVar;
        this.zzb = zzgiVar;
        this.zzc = zzgjVar;
    }

    @Override // androidx.lifecycle.C11759u.InterfaceC11763b
    public /* bridge */ /* synthetic */ AbstractC35048Or6 create(Class cls, FE0 fe0) {
        return super.create(cls, fe0);
    }

    @Override // androidx.lifecycle.C11759u.InterfaceC11763b
    public final AbstractC35048Or6 create(Class cls) {
        zzha.zze(cls == zzgf.class, "This factory can only be used to instantiate its enclosing class.");
        return new zzgf(this.zza, this.zzb, this.zzc, null);
    }
}
