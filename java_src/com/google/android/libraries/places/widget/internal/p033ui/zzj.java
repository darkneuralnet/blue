package com.google.android.libraries.places.widget.internal.p033ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.libraries.places.internal.zzev;
/* renamed from: com.google.android.libraries.places.widget.internal.ui.zzj */
/* loaded from: classes6.dex */
final class zzj implements TextWatcher {
    final /* synthetic */ AutocompleteImplFragment zza;

    public /* synthetic */ zzj(AutocompleteImplFragment autocompleteImplFragment, zzi zziVar) {
        this.zza = autocompleteImplFragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        try {
            AutocompleteImplFragment.zzb(this.zza).zzm(editable.toString());
        } catch (Error | RuntimeException e) {
            zzev.zzb(e);
            throw e;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
