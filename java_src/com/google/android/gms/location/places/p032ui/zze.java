package com.google.android.gms.location.places.p032ui;

import android.view.View;
/* renamed from: com.google.android.gms.location.places.ui.zze */
/* loaded from: classes6.dex */
final class zze implements View.OnClickListener {
    private final /* synthetic */ PlaceAutocompleteFragment zzdl;

    public zze(PlaceAutocompleteFragment placeAutocompleteFragment) {
        this.zzdl = placeAutocompleteFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        z = this.zzdl.zzdh;
        if (!z) {
            this.zzdl.zzn();
        }
    }
}
