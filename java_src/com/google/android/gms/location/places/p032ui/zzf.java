package com.google.android.gms.location.places.p032ui;

import android.view.View;
/* renamed from: com.google.android.gms.location.places.ui.zzf */
/* loaded from: classes6.dex */
final class zzf implements View.OnClickListener {
    private final /* synthetic */ SupportPlaceAutocompleteFragment zzdm;

    public zzf(SupportPlaceAutocompleteFragment supportPlaceAutocompleteFragment) {
        this.zzdm = supportPlaceAutocompleteFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zzdm.setText("");
    }
}
