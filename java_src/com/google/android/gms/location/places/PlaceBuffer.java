package com.google.android.gms.location.places;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.internal.zzar;
@Deprecated
/* loaded from: classes6.dex */
public class PlaceBuffer extends AbstractDataBuffer<Place> implements Result {
    private final Status zzp;
    private final String zzq;

    public PlaceBuffer(DataHolder dataHolder) {
        super(dataHolder);
        this.zzp = PlacesStatusCodes.zzb(dataHolder.getStatusCode());
        if (dataHolder.getMetadata() != null) {
            this.zzq = dataHolder.getMetadata().getString("com.google.android.gms.location.places.PlaceBuffer.ATTRIBUTIONS_EXTRA_KEY");
        } else {
            this.zzq = null;
        }
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    public Place get(int i) {
        return new zzar(this.mDataHolder, i);
    }

    public CharSequence getAttributions() {
        return this.zzq;
    }

    @Override // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this.zzp;
    }
}
