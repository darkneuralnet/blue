package p000;

import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: eW6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class BinderC40390eW6 extends GR6 {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f78505a;

    public BinderC40390eW6(C43957kX6 c43957kX6, TaskCompletionSource taskCompletionSource) {
        this.f78505a = taskCompletionSource;
    }

    @Override // p000.InterfaceC43319jS6
    /* renamed from: N */
    public final void mo30592N(Status status, SaveAccountLinkingTokenResult saveAccountLinkingTokenResult) throws RemoteException {
        if (status.isSuccess()) {
            this.f78505a.setResult(saveAccountLinkingTokenResult);
        } else {
            this.f78505a.setException(ApiExceptionUtil.fromStatus(status));
        }
    }
}
