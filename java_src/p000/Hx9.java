package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.internal.location.zzaa;
/* renamed from: Hx9 */
/* loaded from: classes5.dex */
public final class Hx9 extends AbstractBinderC42919im7 {

    /* renamed from: a */
    public final BaseImplementation.ResultHolder<Status> f14248a;

    public Hx9(BaseImplementation.ResultHolder<Status> resultHolder) {
        this.f14248a = resultHolder;
    }

    @Override // p000.InterfaceC39354cn7
    public final void zzb(zzaa zzaaVar) {
        this.f14248a.setResult(zzaaVar.getStatus());
    }

    @Override // p000.InterfaceC39354cn7
    public final void zzc() {
    }
}
