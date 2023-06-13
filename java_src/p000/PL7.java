package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.recaptcha.zzbi;
import com.google.android.gms.internal.recaptcha.zzbx;
import com.google.android.gms.internal.recaptcha.zzby;
import com.google.android.gms.internal.recaptcha.zzx;
import com.google.android.gms.recaptcha.HttpStatusException;
import com.google.android.gms.recaptcha.RecaptchaNetworkException;
import com.google.android.gms.recaptcha.RecaptchaResultData;
import java.util.concurrent.ExecutorService;
/* renamed from: PL7 */
/* loaded from: classes6.dex */
public final class PL7 implements M99<String> {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC52948zh7 f28294a;

    public PL7(C40894fM7 c40894fM7, InterfaceC52948zh7 interfaceC52948zh7) {
        this.f28294a = interfaceC52948zh7;
    }

    @Override // p000.M99
    public final void zza(Throwable th) {
        th.getMessage();
        if (th instanceof zzby) {
            C40894fM7.m41494d(this.f28294a, new Status(8, "Error during initialization step - read/write local cache failed"));
        } else if (th instanceof zzbx) {
            Exception exc = (Exception) th.getCause();
            if (exc instanceof RecaptchaNetworkException) {
                C40894fM7.m41494d(this.f28294a, new Status(7, "Error during initialization step - server connection failed"));
            } else if (exc instanceof HttpStatusException) {
                InterfaceC52948zh7 interfaceC52948zh7 = this.f28294a;
                int m50551a = ((HttpStatusException) exc).m50551a();
                StringBuilder sb = new StringBuilder(92);
                sb.append("Error during initialization step - failed to fetch initialization data - status: ");
                sb.append(m50551a);
                C40894fM7.m41494d(interfaceC52948zh7, new Status(13, sb.toString()));
            }
        } else if (th instanceof zzbi) {
            C40894fM7.m41494d(this.f28294a, new Status(13, ((zzbi) th).getMessage()));
        } else if (th instanceof RecaptchaNetworkException) {
            C40894fM7.m41494d(this.f28294a, new Status(7, ((RecaptchaNetworkException) th).getMessage()));
        } else if (th instanceof HttpStatusException) {
            C40894fM7.m41494d(this.f28294a, new Status(13, ((HttpStatusException) th).getMessage()));
        } else {
            C40894fM7.m41494d(this.f28294a, new Status(8, "Internal error during execution"));
        }
    }

    @Override // p000.M99
    public final /* bridge */ /* synthetic */ void zzb(String str) {
        String str2 = str;
        InterfaceC52948zh7 interfaceC52948zh7 = this.f28294a;
        Status status = new Status(0);
        ExecutorService executorService = C40894fM7.f79973e;
        try {
            interfaceC52948zh7.mo537B(status, new zzx(new RecaptchaResultData(str2)));
        } catch (RemoteException e) {
            C33384Ho7.m103418a("RecaptchaOPExecute", e);
        }
    }
}
