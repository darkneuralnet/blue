package p000;

import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: LL7 */
/* loaded from: classes5.dex */
public final class LL7 extends BinderC52096yF7 {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f21299a;

    public LL7(C38505bM7 c38505bM7, TaskCompletionSource taskCompletionSource) {
        this.f21299a = taskCompletionSource;
    }

    @Override // p000.BinderC52096yF7, p000.XH7
    /* renamed from: A0 */
    public final void mo3739A0(String str) throws RemoteException {
        Status status;
        if (str != null) {
            status = Status.RESULT_SUCCESS;
        } else {
            status = new Status(AuthApiStatusCodes.AUTH_APP_CERT_ERROR);
        }
        TaskUtil.setResultOrApiException(status, str, this.f21299a);
    }
}
