package com.google.android.libraries.places.widget.internal.p033ui;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.C17646R;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.internal.zzev;
/* renamed from: com.google.android.libraries.places.widget.internal.ui.zzs */
/* loaded from: classes6.dex */
public final class zzs extends RecyclerView.AbstractC11834D implements View.OnClickListener {
    private final TextView zza;
    private final TextView zzb;
    private AutocompletePrediction zzc;
    private boolean zzd;
    private final zze zze;

    public zzs(zze zzeVar, View view, byte[] bArr) {
        super(view);
        this.zze = zzeVar;
        this.zza = (TextView) view.findViewById(C17646R.C17648id.places_autocomplete_prediction_primary_text);
        this.zzb = (TextView) view.findViewById(C17646R.C17648id.places_autocomplete_prediction_secondary_text);
        this.itemView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            zze zzeVar = this.zze;
            zzeVar.zza.zze(this.zzc, getAdapterPosition());
        } catch (Error | RuntimeException e) {
            zzev.zzb(e);
            throw e;
        }
    }

    public final void zza(AutocompletePrediction autocompletePrediction, boolean z) {
        this.zzc = autocompletePrediction;
        this.zzd = z;
        this.zza.setText(autocompletePrediction.getPrimaryText(new ForegroundColorSpan(NA0.m94301c(this.itemView.getContext(), C17646R.color.places_autocomplete_prediction_primary_text_highlight))));
        SpannableString secondaryText = autocompletePrediction.getSecondaryText(null);
        this.zzb.setText(secondaryText);
        if (secondaryText.length() == 0) {
            this.zzb.setVisibility(8);
            this.zza.setGravity(16);
            return;
        }
        this.zzb.setVisibility(0);
        this.zza.setGravity(80);
    }

    public final boolean zzb() {
        return this.zzd;
    }
}
