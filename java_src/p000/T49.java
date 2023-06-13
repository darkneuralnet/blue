package p000;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;
/* renamed from: T49 */
/* loaded from: classes6.dex */
public final class T49 extends AbstractRunnableC39054cH8 {

    /* renamed from: c */
    public final /* synthetic */ Oq9 f34733c;

    public T49(Oq9 oq9) {
        this.f34733c = oq9;
    }

    @Override // p000.AbstractRunnableC39054cH8
    /* renamed from: b */
    public final void mo10054b() {
        IInterface iInterface;
        C51459xA8 c51459xA8;
        Context context;
        ServiceConnection serviceConnection;
        Oq9 oq9 = this.f34733c;
        iInterface = oq9.f27469m;
        if (iInterface != null) {
            c51459xA8 = oq9.f27458b;
            c51459xA8.m5751d("Unbind from service.", new Object[0]);
            Oq9 oq92 = this.f34733c;
            context = oq92.f27457a;
            serviceConnection = oq92.f27468l;
            context.unbindService(serviceConnection);
            this.f34733c.f27463g = false;
            this.f34733c.f27469m = null;
            this.f34733c.f27468l = null;
        }
        this.f34733c.m91279t();
    }
}
