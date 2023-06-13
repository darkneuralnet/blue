package com.google.android.gms.location.places;

import com.google.android.gms.common.api.DataBufferResponse;
@Deprecated
/* loaded from: classes6.dex */
public class PlaceBufferResponse extends DataBufferResponse<Place, PlaceBuffer> {
    public CharSequence getAttributions() {
        return ((PlaceBuffer) getResult()).getAttributions();
    }
}
