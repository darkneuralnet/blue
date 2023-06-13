package p000;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.zzaz;
/* renamed from: Au7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class BinderC31800Au7 extends zzaz {

    /* renamed from: a */
    public final ListenerHolder<LocationCallback> f1339a;

    public BinderC31800Au7(ListenerHolder<LocationCallback> listenerHolder) {
        this.f1339a = listenerHolder;
    }

    public final synchronized void zzc() {
        this.f1339a.clear();
    }

    @Override // com.google.android.gms.location.zzba
    public final void zzd(LocationResult locationResult) {
        this.f1339a.notifyListener(new C36930Ws7(this, locationResult));
    }

    @Override // com.google.android.gms.location.zzba
    public final void zze(LocationAvailability locationAvailability) {
        this.f1339a.notifyListener(new C36471Ut7(this, locationAvailability));
    }
}
