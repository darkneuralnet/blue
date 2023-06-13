package p000;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: TX6 */
/* loaded from: classes5.dex */
public final class TX6 extends AQ6 {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f35641a;

    public TX6(WX6 wx6, TaskCompletionSource taskCompletionSource) {
        this.f35641a = taskCompletionSource;
    }

    @Override // p000.InterfaceC39753dR6
    /* renamed from: u1 */
    public final void mo44258u1(Status status, PendingIntent pendingIntent) throws RemoteException {
        TaskUtil.setResultOrApiException(status, pendingIntent, this.f35641a);
    }
}
