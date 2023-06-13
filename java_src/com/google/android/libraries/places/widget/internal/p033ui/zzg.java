package com.google.android.libraries.places.widget.internal.p033ui;

import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.internal.zzev;
import com.google.android.libraries.places.internal.zzgf;
/* renamed from: com.google.android.libraries.places.widget.internal.ui.zzg */
/* loaded from: classes6.dex */
final class zzg extends RecyclerView.AbstractC11863t {
    final /* synthetic */ AutocompleteImplFragment zza;

    public zzg(AutocompleteImplFragment autocompleteImplFragment) {
        this.zza = autocompleteImplFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11863t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        zzgf zzgfVar;
        EditText editText;
        if (i == 1) {
            try {
                zzgfVar = this.zza.zze;
                zzgfVar.zzg();
                editText = this.zza.zzg;
                editText.clearFocus();
            } catch (Error | RuntimeException e) {
                zzev.zzb(e);
                throw e;
            }
        }
    }
}
