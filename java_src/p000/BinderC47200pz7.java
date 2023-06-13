package p000;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.location.LocationStatusCodes;
/* renamed from: pz7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class BinderC47200pz7 extends AbstractBinderC36417Un7 {

    /* renamed from: a */
    public BaseImplementation.ResultHolder<Status> f104456a;

    public BinderC47200pz7(BaseImplementation.ResultHolder<Status> resultHolder) {
        this.f104456a = resultHolder;
    }

    @Override // p000.InterfaceC35490Qo7
    /* renamed from: b5 */
    public final void mo18350b5(int i, String[] strArr) {
        Log.wtf("LocationClientImpl", "Unexpected call to onAddGeofencesResult", new Exception());
    }

    /* renamed from: c5 */
    public final void m18349c5(int i) {
        if (this.f104456a == null) {
            Log.wtf("LocationClientImpl", "onRemoveGeofencesResult called multiple times", new Exception());
            return;
        }
        this.f104456a.setResult(LocationStatusCodes.zzb(LocationStatusCodes.zza(i)));
        this.f104456a = null;
    }

    @Override // p000.InterfaceC35490Qo7
    /* renamed from: i2 */
    public final void mo18348i2(int i, String[] strArr) {
        m18349c5(i);
    }

    @Override // p000.InterfaceC35490Qo7
    /* renamed from: s0 */
    public final void mo18347s0(int i, PendingIntent pendingIntent) {
        m18349c5(i);
    }
}
