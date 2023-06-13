package com.google.android.gms.location.places.p032ui;

import android.view.View;
/* renamed from: com.google.android.gms.location.places.ui.zzg */
/* loaded from: classes6.dex */
final class zzg implements View.OnClickListener {
    private final /* synthetic */ SupportPlaceAutocompleteFragment zzdm;

    public zzg(SupportPlaceAutocompleteFragment supportPlaceAutocompleteFragment) {
        this.zzdm = supportPlaceAutocompleteFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        z = this.zzdm.zzdh;
        if (!z) {
            this.zzdm.zzn();
        }
    }
}
