package p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.api.GoogleApiClient;
/* renamed from: IM7 */
/* loaded from: classes5.dex */
public final class IM7 extends EJ7 {

    /* renamed from: a */
    public final /* synthetic */ ProxyRequest f15404a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IM7(FN7 fn7, GoogleApiClient googleApiClient, ProxyRequest proxyRequest) {
        super(googleApiClient);
        this.f15404a = proxyRequest;
    }

    @Override // p000.EJ7
    /* renamed from: a */
    public final void mo102452a(Context context, PI7 pi7) throws RemoteException {
        pi7.m90485d5(new BinderC48010rM7(this), this.f15404a);
    }
}
