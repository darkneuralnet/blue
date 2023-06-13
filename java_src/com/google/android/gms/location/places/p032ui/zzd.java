package com.google.android.gms.location.places.p032ui;

import android.view.View;
/* renamed from: com.google.android.gms.location.places.ui.zzd */
/* loaded from: classes6.dex */
final class zzd implements View.OnClickListener {
    private final /* synthetic */ PlaceAutocompleteFragment zzdl;

    public zzd(PlaceAutocompleteFragment placeAutocompleteFragment) {
        this.zzdl = placeAutocompleteFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zzdl.setText("");
    }
}
