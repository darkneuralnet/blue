package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityServiceException;
/* renamed from: Nq9 */
/* loaded from: classes6.dex */
public final class Nq9 {

    /* renamed from: a */
    public final C51459xA8 f25293a;

    /* renamed from: b */
    public final String f25294b;

    /* renamed from: c */
    public final Oq9 f25295c;

    public Nq9(Context context, C51459xA8 c51459xA8) {
        this.f25294b = context.getPackageName();
        this.f25293a = c51459xA8;
        if (!C50126uv9.m9484a(context)) {
            c51459xA8.m5753b("Phonesky is not installed.", new Object[0]);
            this.f25295c = null;
            return;
        }
        this.f25295c = new Oq9(context, c51459xA8, "IntegrityService", C48318rs9.f107822a, Jh9.f18058a, null, null);
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ Bundle m93282a(Nq9 nq9, byte[] bArr, Long l) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", nq9.f25294b);
        bundle.putByteArray("nonce", bArr);
        if (l != null) {
            bundle.putLong("cloud.prj", l.longValue());
        }
        return bundle;
    }

    /* renamed from: b */
    public final Task m93281b(V52 v52) {
        if (this.f25295c == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        try {
            byte[] decode = Base64.decode(v52.mo39482c(), 10);
            Long mo39483b = v52.mo39483b();
            this.f25293a.m5751d("requestIntegrityToken(%s)", v52);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f25295c.m91283p(new Dl9(this, taskCompletionSource, decode, mo39483b, taskCompletionSource, v52), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e) {
            return Tasks.forException(new IntegrityServiceException(-13, e));
        }
    }
}
