package p000;

import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.common.api.Status;
/* renamed from: YM7 */
/* loaded from: classes5.dex */
public final class YM7 extends BinderC52096yF7 {

    /* renamed from: a */
    public final /* synthetic */ C46833pN7 f45791a;

    public YM7(C46833pN7 c46833pN7) {
        this.f45791a = c46833pN7;
    }

    @Override // p000.BinderC52096yF7, p000.XH7
    /* renamed from: A0 */
    public final void mo3739A0(String str) {
        if (str != null) {
            this.f45791a.setResult((C46833pN7) new C43877kO7(str));
        } else {
            this.f45791a.setResult((C46833pN7) new C43877kO7(new Status(AuthApiStatusCodes.AUTH_APP_CERT_ERROR)));
        }
    }
}
