package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.recaptcha.zzai;
import com.google.android.gms.recaptcha.RecaptchaHandle;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: mz7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC45421mz7 extends AbstractBinderC50026ul9 {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f99197a;

    public BinderC45421mz7(C50308vE7 c50308vE7, TaskCompletionSource taskCompletionSource) {
        this.f99197a = taskCompletionSource;
    }

    @Override // p000.InterfaceC45854nj7
    /* renamed from: o4 */
    public final void mo397o4(Status status, zzai zzaiVar) {
        RecaptchaHandle m51031s;
        if (zzaiVar == null) {
            m51031s = null;
        } else {
            m51031s = zzaiVar.m51031s();
        }
        TaskUtil.setResultOrApiException(status, m51031s, this.f99197a);
    }
}
