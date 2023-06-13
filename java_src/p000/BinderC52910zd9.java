package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: zd9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class BinderC52910zd9 extends GY7 {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f121671a;

    public BinderC52910zd9(Kl9 kl9, TaskCompletionSource taskCompletionSource) {
        this.f121671a = taskCompletionSource;
    }

    @Override // p000.N68
    /* renamed from: D3 */
    public final void mo952D3(Status status, int i) {
        TaskUtil.setResultOrApiException(status, Integer.valueOf(i), this.f121671a);
    }
}
