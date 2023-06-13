package com.google.android.gms.location.places;

import com.google.android.gms.common.api.DataBufferResponse;
@Deprecated
/* loaded from: classes6.dex */
public class AutocompletePredictionBufferResponse extends DataBufferResponse<AutocompletePrediction, AutocompletePredictionBuffer> {
    public String toString() {
        return ((AutocompletePredictionBuffer) getResult()).toString();
    }
}
