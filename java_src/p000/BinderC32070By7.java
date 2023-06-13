package p000;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.location.LocationStatusCodes;
/* renamed from: By7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class BinderC32070By7 extends AbstractBinderC36417Un7 {

    /* renamed from: a */
    public BaseImplementation.ResultHolder<Status> f3180a;

    public BinderC32070By7(BaseImplementation.ResultHolder<Status> resultHolder) {
        this.f3180a = resultHolder;
    }

    @Override // p000.InterfaceC35490Qo7
    /* renamed from: b5 */
    public final void mo18350b5(int i, String[] strArr) {
        if (this.f3180a == null) {
            Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times", new Exception());
            return;
        }
        this.f3180a.setResult(LocationStatusCodes.zzb(LocationStatusCodes.zza(i)));
        this.f3180a = null;
    }

    @Override // p000.InterfaceC35490Qo7
    /* renamed from: i2 */
    public final void mo18348i2(int i, String[] strArr) {
        Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByRequestIdsResult", new Exception());
    }

    @Override // p000.InterfaceC35490Qo7
    /* renamed from: s0 */
    public final void mo18347s0(int i, PendingIntent pendingIntent) {
        Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByPendingIntentResult", new Exception());
    }
}
