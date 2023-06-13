package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
/* renamed from: xK6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ServiceConnectionC51547xK6 implements ServiceConnection {

    /* renamed from: b */
    public final /* synthetic */ C52733zK6 f117429b;

    public /* synthetic */ ServiceConnectionC51547xK6(C52733zK6 c52733zK6) {
        this.f117429b = c52733zK6;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C42061hK6 c42061hK6;
        c42061hK6 = this.f117429b.f121100b;
        c42061hK6.m36535d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f117429b.m1516r(new C49176tK6(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C42061hK6 c42061hK6;
        c42061hK6 = this.f117429b.f121100b;
        c42061hK6.m36535d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f117429b.m1516r(new C50361vK6(this));
    }
}
