package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.recaptcha.zzai;
import com.google.android.gms.recaptcha.HttpStatusException;
import com.google.android.gms.recaptcha.RecaptchaHandle;
import com.google.android.gms.recaptcha.RecaptchaNetworkException;
import java.io.IOException;
/* renamed from: vM7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50380vM7 implements M99<C47230q28> {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC45854nj7 f113958a;

    /* renamed from: b */
    public final /* synthetic */ String f113959b;

    /* renamed from: c */
    public final /* synthetic */ String f113960c;

    public C50380vM7(LM7 lm7, InterfaceC45854nj7 interfaceC45854nj7, String str, String str2) {
        this.f113958a = interfaceC45854nj7;
        this.f113959b = str;
        this.f113960c = str2;
    }

    @Override // p000.M99
    public final void zza(Throwable th) {
        th.getMessage();
        if (th instanceof RecaptchaNetworkException) {
            LM7.m97023a(this.f113958a, new Status(7, th.getMessage()));
        } else if (th instanceof HttpStatusException) {
            InterfaceC45854nj7 interfaceC45854nj7 = this.f113958a;
            int m50551a = ((HttpStatusException) th).m50551a();
            StringBuilder sb = new StringBuilder(58);
            sb.append("Failed to fetch data for local cache - status: ");
            sb.append(m50551a);
            LM7.m97023a(interfaceC45854nj7, new Status(13, sb.toString()));
        } else if (th instanceof IOException) {
            LM7.m97023a(this.f113958a, new Status(8, "Failed to read/write local cache"));
        } else {
            LM7.m97023a(this.f113958a, new Status(8, "Internal error during init"));
        }
    }

    @Override // p000.M99
    public final /* bridge */ /* synthetic */ void zzb(C47230q28 c47230q28) {
        try {
            this.f113958a.mo397o4(new Status(0), new zzai(new RecaptchaHandle(this.f113959b, this.f113960c, c47230q28.m18269D())));
        } catch (RemoteException e) {
            C33384Ho7.m103418a("RecaptchaOPInit", e);
        }
    }
}
