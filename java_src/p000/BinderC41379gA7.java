package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.LocationSettingsResult;
/* renamed from: gA7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class BinderC41379gA7 extends AbstractBinderC47120pr7 {

    /* renamed from: a */
    public BaseImplementation.ResultHolder<LocationSettingsResult> f81724a;

    public BinderC41379gA7(BaseImplementation.ResultHolder<LocationSettingsResult> resultHolder) {
        boolean z;
        if (resultHolder != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "listener can't be null.");
        this.f81724a = resultHolder;
    }

    @Override // p000.InterfaceC41793gs7
    /* renamed from: J */
    public final void mo37369J(LocationSettingsResult locationSettingsResult) throws RemoteException {
        this.f81724a.setResult(locationSettingsResult);
        this.f81724a = null;
    }
}
