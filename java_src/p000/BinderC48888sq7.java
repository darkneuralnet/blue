package p000;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.recaptcha.zzx;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: sq7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC48888sq7 extends BinderC43574js9 {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f109403a;

    public BinderC48888sq7(C33195Gt7 c33195Gt7, TaskCompletionSource taskCompletionSource) {
        this.f109403a = taskCompletionSource;
    }

    @Override // p000.BinderC43574js9, p000.InterfaceC52948zh7
    /* renamed from: B */
    public final void mo537B(Status status, zzx zzxVar) {
        if (zzxVar == null) {
            this.f109403a.setException(new ApiException(status));
        } else {
            this.f109403a.setResult(zzxVar.m51018s());
        }
    }
}
