package p000;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
/* renamed from: Ws7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36930Ws7 implements ListenerHolder.Notifier<LocationCallback> {

    /* renamed from: a */
    public final /* synthetic */ LocationResult f42239a;

    public C36930Ws7(BinderC31800Au7 binderC31800Au7, LocationResult locationResult) {
        this.f42239a = locationResult;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(LocationCallback locationCallback) {
        locationCallback.onLocationResult(this.f42239a);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
