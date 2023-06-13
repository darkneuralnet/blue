package p000;

import com.google.android.gms.internal.recaptcha.zzbx;
import com.google.android.gms.internal.recaptcha.zzby;
import com.google.android.gms.recaptcha.HttpStatusException;
import com.google.android.gms.recaptcha.RecaptchaNetworkException;
import java.util.concurrent.ExecutorService;
/* renamed from: zL7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C52743zL7 implements InterfaceC43713k69 {

    /* renamed from: a */
    public static final /* synthetic */ C52743zL7 f121121a = new C52743zL7();

    private /* synthetic */ C52743zL7() {
    }

    @Override // p000.InterfaceC43713k69
    public final Mb9 zza(Object obj) {
        Exception exc = (Exception) obj;
        ExecutorService executorService = C40894fM7.f79973e;
        if (!(exc instanceof RecaptchaNetworkException) && !(exc instanceof HttpStatusException)) {
            return C50508va9.m8431e(new zzby(exc));
        }
        return C50508va9.m8431e(new zzbx(exc));
    }
}
