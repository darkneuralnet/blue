package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.zzbi;
/* renamed from: HI7 */
/* loaded from: classes5.dex */
public final class HI7 extends zzbi<LocationSettingsResult> {

    /* renamed from: a */
    public final /* synthetic */ LocationSettingsRequest f13255a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HI7(C50946wJ7 c50946wJ7, GoogleApiClient googleApiClient, LocationSettingsRequest locationSettingsRequest, String str) {
        super(googleApiClient);
        this.f13255a = locationSettingsRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ Result createFailedResult(Status status) {
        return new LocationSettingsResult(status, null);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(TA7 ta7) throws RemoteException {
        ta7.m84248o(this.f13255a, this, null);
    }
}
