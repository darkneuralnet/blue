package p000;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataBufferSafeParcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.places.zzi;
import com.google.android.gms.location.places.PlacesStatusCodes;
@ShowFirstParty
@Deprecated
/* renamed from: ht8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42397ht8 extends DataBufferSafeParcelable<zzi> implements Result {

    /* renamed from: b */
    public final Status f86069b;

    public C42397ht8(DataHolder dataHolder) {
        this(dataHolder, PlacesStatusCodes.zzb(dataHolder.getStatusCode()));
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.f86069b;
    }

    public C42397ht8(DataHolder dataHolder, Status status) {
        super(dataHolder, zzi.CREATOR);
        Preconditions.checkArgument(dataHolder == null || dataHolder.getStatusCode() == status.getStatusCode());
        this.f86069b = status;
    }
}
