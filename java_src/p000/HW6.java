package p000;

import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: HW6 */
/* loaded from: classes5.dex */
public final class HW6 extends MS6 {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f13493a;

    public HW6(C43957kX6 c43957kX6, TaskCompletionSource taskCompletionSource) {
        this.f13493a = taskCompletionSource;
    }

    @Override // p000.InterfaceC46886pT6
    /* renamed from: S1 */
    public final void mo19223S1(Status status, SavePasswordResult savePasswordResult) throws RemoteException {
        TaskUtil.setResultOrApiException(status, savePasswordResult, this.f13493a);
    }
}
