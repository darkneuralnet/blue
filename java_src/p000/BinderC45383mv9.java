package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: mv9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class BinderC45383mv9 extends AbstractBinderC37756a59 {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f99050a;

    public BinderC45383mv9(C35886Sg7 c35886Sg7, TaskCompletionSource taskCompletionSource) {
        this.f99050a = taskCompletionSource;
    }

    @Override // p000.InterfaceC50857w99
    /* renamed from: j */
    public final void mo7344j(Status status, Bundle bundle) {
        C35886Sg7.m85132i(status, bundle, this.f99050a);
    }
}
