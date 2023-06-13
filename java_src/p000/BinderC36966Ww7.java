package p000;

import android.location.Location;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.zzbc;
/* renamed from: Ww7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class BinderC36966Ww7 extends zzbc {

    /* renamed from: a */
    public final ListenerHolder<LocationListener> f42374a;

    public BinderC36966Ww7(ListenerHolder<LocationListener> listenerHolder) {
        this.f42374a = listenerHolder;
    }

    public final synchronized void zzc() {
        this.f42374a.clear();
    }

    @Override // com.google.android.gms.location.zzbd
    public final synchronized void zzd(Location location) {
        this.f42374a.notifyListener(new C42426hw7(this, location));
    }
}
