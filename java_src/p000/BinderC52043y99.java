package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: y99  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class BinderC52043y99 extends IStatusCallback.Stub {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f118849a;

    public BinderC52043y99(Kl9 kl9, TaskCompletionSource taskCompletionSource) {
        this.f118849a = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        if (status.getStatusCode() == 6) {
            this.f118849a.trySetException(ApiExceptionUtil.fromStatus(status));
        } else {
            TaskUtil.setResultOrApiException(status, this.f118849a);
        }
    }
}
