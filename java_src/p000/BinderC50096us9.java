package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: us9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class BinderC50096us9 extends IStatusCallback.Stub {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f113133a;

    public BinderC50096us9(Zt9 zt9, TaskCompletionSource taskCompletionSource) {
        this.f113133a = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        if (status.getStatusCode() == 6) {
            this.f113133a.trySetException(ApiExceptionUtil.fromStatus(status));
        } else {
            TaskUtil.setResultOrApiException(status, this.f113133a);
        }
    }
}
