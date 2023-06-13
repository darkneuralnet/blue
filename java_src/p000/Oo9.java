package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
/* renamed from: Oo9 */
/* loaded from: classes6.dex */
public final class Oo9 implements ServiceConnection {

    /* renamed from: b */
    public final /* synthetic */ Oq9 f27395b;

    public /* synthetic */ Oo9(Oq9 oq9, El9 el9) {
        this.f27395b = oq9;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Oq9.m91293f(this.f27395b).m5751d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f27395b.m91296c().post(new C49353td9(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Oq9.m91293f(this.f27395b).m5751d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f27395b.m91296c().post(new Kh9(this));
    }
}
