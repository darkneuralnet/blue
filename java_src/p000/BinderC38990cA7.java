package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.recaptcha.zzx;
import com.google.android.gms.recaptcha.RecaptchaResultData;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: cA7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC38990cA7 extends BinderC43574js9 {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f60238a;

    public BinderC38990cA7(C50308vE7 c50308vE7, TaskCompletionSource taskCompletionSource) {
        this.f60238a = taskCompletionSource;
    }

    @Override // p000.BinderC43574js9, p000.InterfaceC52948zh7
    /* renamed from: B */
    public final void mo537B(Status status, zzx zzxVar) {
        RecaptchaResultData m51018s;
        if (zzxVar == null) {
            m51018s = null;
        } else {
            m51018s = zzxVar.m51018s();
        }
        TaskUtil.setResultOrApiException(status, m51018s, this.f60238a);
    }
}
