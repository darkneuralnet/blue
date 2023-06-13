package p000;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.integrity.IntegrityServiceException;
/* renamed from: No9 */
/* loaded from: classes6.dex */
public final class No9 extends AbstractBinderC49442tm8 {

    /* renamed from: a */
    public final C51459xA8 f25213a = new C51459xA8("OnRequestIntegrityTokenCallback");

    /* renamed from: b */
    public final TaskCompletionSource f25214b;

    /* renamed from: c */
    public final /* synthetic */ Nq9 f25215c;

    public No9(Nq9 nq9, TaskCompletionSource taskCompletionSource) {
        this.f25215c = nq9;
        this.f25214b = taskCompletionSource;
    }

    @Override // p000.InterfaceC50105ut8
    /* renamed from: v1 */
    public final void mo9544v1(Bundle bundle) {
        this.f25215c.f25295c.m91281r(this.f25214b);
        this.f25213a.m5751d("onRequestIntegrityToken", new Object[0]);
        int i = bundle.getInt("error");
        if (i != 0) {
            this.f25214b.trySetException(new IntegrityServiceException(i, null));
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f25214b.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        TaskCompletionSource taskCompletionSource = this.f25214b;
        C46339oY7 c46339oY7 = new C46339oY7();
        c46339oY7.mo11199a(string);
        taskCompletionSource.trySetResult(c46339oY7.mo11198b());
    }
}
