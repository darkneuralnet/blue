package p000;

import android.location.Location;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationListener;
/* renamed from: hw7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42426hw7 implements ListenerHolder.Notifier<LocationListener> {

    /* renamed from: a */
    public final /* synthetic */ Location f86219a;

    public C42426hw7(BinderC36966Ww7 binderC36966Ww7, Location location) {
        this.f86219a = location;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(LocationListener locationListener) {
        locationListener.onLocationChanged(this.f86219a);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
