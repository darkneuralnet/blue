package p000;

import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: wL7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class BinderC50964wL7 extends BinderC52096yF7 {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f115857a;

    public BinderC50964wL7(C38505bM7 c38505bM7, TaskCompletionSource taskCompletionSource) {
        this.f115857a = taskCompletionSource;
    }

    @Override // p000.BinderC52096yF7, p000.XH7
    /* renamed from: d2 */
    public final void mo3738d2(ProxyResponse proxyResponse) throws RemoteException {
        TaskUtil.setResultOrApiException(new Status(proxyResponse.googlePlayServicesStatusCode), proxyResponse, this.f115857a);
    }
}
