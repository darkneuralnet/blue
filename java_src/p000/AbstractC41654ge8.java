package p000;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.zzb;
/* renamed from: ge8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC41654ge8 extends zzb<Status> {
    public AbstractC41654ge8(GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }
}
