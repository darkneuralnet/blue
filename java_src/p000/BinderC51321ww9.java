package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: ww9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class BinderC51321ww9 extends IStatusCallback.Stub {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f116866a;

    public BinderC51321ww9(C35886Sg7 c35886Sg7, TaskCompletionSource taskCompletionSource) {
        this.f116866a = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        C35886Sg7.m85132i(status, null, this.f116866a);
    }
}
