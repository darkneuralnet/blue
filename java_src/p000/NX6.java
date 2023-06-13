package p000;

import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: NX6 */
/* loaded from: classes5.dex */
public final class NX6 extends AbstractBinderC31638Ac7 {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f24755a;

    public NX6(WX6 wx6, TaskCompletionSource taskCompletionSource) {
        this.f24755a = taskCompletionSource;
    }

    @Override // p000.InterfaceC39865dd7
    /* renamed from: q2 */
    public final void mo44000q2(Status status, BeginSignInResult beginSignInResult) throws RemoteException {
        TaskUtil.setResultOrApiException(status, beginSignInResult, this.f24755a);
    }
}
