package p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
/* renamed from: LM7 */
/* loaded from: classes6.dex */
public final class LM7 {

    /* renamed from: a */
    public final C45063mO7 f21323a;

    public LM7(Context context) {
        this.f21323a = C45063mO7.m25667a(context);
    }

    /* renamed from: a */
    public static /* synthetic */ void m97023a(InterfaceC45854nj7 interfaceC45854nj7, Status status) {
        try {
            interfaceC45854nj7.mo397o4(status, null);
        } catch (RemoteException e) {
            C33384Ho7.m103418a("RecaptchaOPInit", e);
        }
    }

    /* renamed from: b */
    public final void m97022b(InterfaceC45854nj7 interfaceC45854nj7, String str, String str2, OU7 ou7) {
        C50508va9.m8423m(this.f21323a.m25665c(str, str2, ou7), new C50380vM7(this, interfaceC45854nj7, str, str2), C40328eP7.f78379b);
    }
}
