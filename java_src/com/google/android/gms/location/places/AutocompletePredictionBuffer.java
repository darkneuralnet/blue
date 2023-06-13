package com.google.android.gms.location.places;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Objects;
@Deprecated
/* loaded from: classes6.dex */
public class AutocompletePredictionBuffer extends AbstractDataBuffer<AutocompletePrediction> implements Result {
    public AutocompletePredictionBuffer(DataHolder dataHolder) {
        super(dataHolder);
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    public AutocompletePrediction get(int i) {
        return new com.google.android.gms.location.places.internal.zzd(this.mDataHolder, i);
    }

    @Override // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return PlacesStatusCodes.zzb(this.mDataHolder.getStatusCode());
    }

    public String toString() {
        return Objects.toStringHelper(this).add("status", getStatus()).toString();
    }
}
