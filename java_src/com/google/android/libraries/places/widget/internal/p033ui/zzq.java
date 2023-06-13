package com.google.android.libraries.places.widget.internal.p033ui;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.C11905h;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.internal.zzev;
/* renamed from: com.google.android.libraries.places.widget.internal.ui.zzq */
/* loaded from: classes6.dex */
final class zzq extends C11905h.AbstractC11911f {
    private zzq() {
    }

    public static final boolean zza(AutocompletePrediction autocompletePrediction, AutocompletePrediction autocompletePrediction2) {
        try {
            return autocompletePrediction.getPlaceId().equals(autocompletePrediction2.getPlaceId());
        } catch (Error | RuntimeException e) {
            zzev.zzb(e);
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.C11905h.AbstractC11911f
    @SuppressLint({"DiffUtilEquals"})
    public final /* synthetic */ boolean areContentsTheSame(Object obj, Object obj2) {
        return ((AutocompletePrediction) obj).equals((AutocompletePrediction) obj2);
    }

    @Override // androidx.recyclerview.widget.C11905h.AbstractC11911f
    public final /* bridge */ /* synthetic */ boolean areItemsTheSame(Object obj, Object obj2) {
        return zza((AutocompletePrediction) obj, (AutocompletePrediction) obj2);
    }

    public /* synthetic */ zzq(zzp zzpVar) {
    }
}
