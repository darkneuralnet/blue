package p000;

import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: wy9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class BinderC51341wy9 extends MT8 {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f116937a;

    public BinderC51341wy9(C35886Sg7 c35886Sg7, TaskCompletionSource taskCompletionSource) {
        this.f116937a = taskCompletionSource;
    }

    @Override // p000.CZ8
    /* renamed from: j0 */
    public final void mo6016j0(Status status, AccountChangeEventsResponse accountChangeEventsResponse) {
        C35886Sg7.m85132i(status, accountChangeEventsResponse, this.f116937a);
    }
}
