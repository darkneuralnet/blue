package com.google.android.libraries.places.internal;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class zzeg implements zzej {
    private Context zza;
    private zzem zzb;
    private zzet zzc;

    private zzeg() {
    }

    public /* synthetic */ zzeg(zzef zzefVar) {
    }

    @Override // com.google.android.libraries.places.internal.zzej
    public final /* synthetic */ zzej zza(zzem zzemVar) {
        this.zzb = zzemVar;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzej
    public final /* synthetic */ zzej zzb(zzet zzetVar) {
        this.zzc = zzetVar;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzej
    public final /* synthetic */ zzej zzc(Context context) {
        context.getClass();
        this.zza = context;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzej
    public final zzek zzd() {
        zzagk.zzb(this.zza, Context.class);
        zzagk.zzb(this.zzb, zzem.class);
        zzagk.zzb(this.zzc, zzet.class);
        return new zzei(this.zza, this.zzb, this.zzc, null);
    }
}
