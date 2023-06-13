package p000;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.recaptcha.zzai;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: zp7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC53028zp7 extends AbstractBinderC50026ul9 {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f122293a;

    public BinderC53028zp7(C33195Gt7 c33195Gt7, TaskCompletionSource taskCompletionSource) {
        this.f122293a = taskCompletionSource;
    }

    @Override // p000.InterfaceC45854nj7
    /* renamed from: o4 */
    public final void mo397o4(Status status, zzai zzaiVar) {
        if (zzaiVar == null) {
            this.f122293a.setException(new ApiException(status));
        } else {
            this.f122293a.setResult(zzaiVar.m51031s());
        }
    }
}
