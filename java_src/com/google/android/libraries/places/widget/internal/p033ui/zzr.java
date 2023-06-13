package com.google.android.libraries.places.widget.internal.p033ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC11940o;
import com.google.android.libraries.places.C17646R;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.internal.zzev;
import java.util.List;
/* renamed from: com.google.android.libraries.places.widget.internal.ui.zzr */
/* loaded from: classes6.dex */
public final class zzr extends AbstractC11940o {
    private int zza;
    private boolean zzb;
    private final zze zzc;

    public zzr(zze zzeVar, byte[] bArr) {
        super(new zzq(null));
        this.zzb = true;
        this.zzc = zzeVar;
    }

    @Override // androidx.recyclerview.widget.AbstractC11940o
    public final void submitList(List list) {
        boolean z;
        try {
            int i = 0;
            if (this.zza == 0 && list != null && !list.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            this.zzb = z;
            if (list != null) {
                i = list.size();
            }
            this.zza = i;
            super.submitList(list);
        } catch (Error | RuntimeException e) {
            zzev.zzb(e);
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    /* renamed from: zza */
    public final zzs onCreateViewHolder(ViewGroup viewGroup, int i) {
        try {
            return new zzs(this.zzc, LayoutInflater.from(viewGroup.getContext()).inflate(C17646R.C17649layout.places_autocomplete_prediction, viewGroup, false), null);
        } catch (Error | RuntimeException e) {
            zzev.zzb(e);
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    /* renamed from: zzb */
    public final void onBindViewHolder(zzs zzsVar, int i) {
        try {
            zzsVar.zza((AutocompletePrediction) getItem(i), this.zzb);
        } catch (Error | RuntimeException e) {
            zzev.zzb(e);
            throw e;
        }
    }
}
