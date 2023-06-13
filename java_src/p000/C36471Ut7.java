package p000;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
/* renamed from: Ut7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36471Ut7 implements ListenerHolder.Notifier<LocationCallback> {

    /* renamed from: a */
    public final /* synthetic */ LocationAvailability f38222a;

    public C36471Ut7(BinderC31800Au7 binderC31800Au7, LocationAvailability locationAvailability) {
        this.f38222a = locationAvailability;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(LocationCallback locationCallback) {
        locationCallback.onLocationAvailability(this.f38222a);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
