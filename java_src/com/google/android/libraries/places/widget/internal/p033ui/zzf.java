package com.google.android.libraries.places.widget.internal.p033ui;

import com.google.android.libraries.places.internal.zzgf;
/* renamed from: com.google.android.libraries.places.widget.internal.ui.zzf */
/* loaded from: classes6.dex */
final class zzf extends AbstractC36566Ve3 {
    final /* synthetic */ AutocompleteImplFragment zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(AutocompleteImplFragment autocompleteImplFragment, boolean z) {
        super(true);
        this.zza = autocompleteImplFragment;
    }

    @Override // p000.AbstractC36566Ve3
    public final void handleOnBackPressed() {
        zzgf zzgfVar;
        zzgfVar = this.zza.zze;
        zzgfVar.zzj();
    }
}
