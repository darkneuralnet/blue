package p000;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.zzbi;
/* renamed from: uj7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC50004uj7 extends zzbi<Status> {
    public AbstractC50004uj7(GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }
}
