package p000;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.PowerManager;
import android.util.Log;
import io.reactivex.AbstractC24490k;
import io.reactivex.EnumC23460b;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.subjects.AbstractC24569h;
import io.reactivex.subjects.C24558d;
@TargetApi(23)
/* renamed from: oM2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C46226oM2 implements I73 {

    /* renamed from: a */
    public ConnectivityManager.NetworkCallback f101823a;

    /* renamed from: d */
    public C32063By0 f101826d = C32063By0.m113250b();

    /* renamed from: c */
    public final BroadcastReceiver f101825c = m21297d();

    /* renamed from: b */
    public final AbstractC24569h<C32063By0> f101824b = C24558d.m31902e().m31878a();

    /* renamed from: oM2$a */
    /* loaded from: classes5.dex */
    public class C26920a implements InterfaceC23492o<C32063By0, InterfaceC45761na4<C32063By0>> {
        public C26920a() {
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public InterfaceC45761na4<C32063By0> apply(C32063By0 c32063By0) {
            C46226oM2 c46226oM2 = C46226oM2.this;
            return c46226oM2.m21292i(c46226oM2.f101826d, c32063By0);
        }
    }

    /* renamed from: oM2$b */
    /* loaded from: classes5.dex */
    public class C26921b implements InterfaceC23484g<C32063By0> {
        public C26921b() {
        }

        @Override // io.reactivex.functions.InterfaceC23484g
        /* renamed from: a */
        public void accept(C32063By0 c32063By0) {
            C46226oM2.this.f101826d = c32063By0;
        }
    }

    /* renamed from: oM2$c */
    /* loaded from: classes5.dex */
    public class C26922c implements InterfaceC23478a {

        /* renamed from: b */
        public final /* synthetic */ ConnectivityManager f101829b;

        /* renamed from: c */
        public final /* synthetic */ Context f101830c;

        public C26922c(ConnectivityManager connectivityManager, Context context) {
            this.f101829b = connectivityManager;
            this.f101830c = context;
        }

        @Override // io.reactivex.functions.InterfaceC23478a
        public void run() {
            C46226oM2.this.m21290k(this.f101829b);
            C46226oM2.this.m21289l(this.f101830c);
        }
    }

    /* renamed from: oM2$d */
    /* loaded from: classes5.dex */
    public class C26923d extends BroadcastReceiver {
        public C26923d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (C46226oM2.this.m21295f(context)) {
                C46226oM2.this.m21293h(C32063By0.m113250b());
            } else {
                C46226oM2.this.m21293h(C32063By0.m113249c(context));
            }
        }
    }

    /* renamed from: oM2$e */
    /* loaded from: classes5.dex */
    public class C26924e extends ConnectivityManager.NetworkCallback {

        /* renamed from: a */
        public final /* synthetic */ Context f101833a;

        public C26924e(Context context) {
            this.f101833a = context;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            C46226oM2.this.m21293h(C32063By0.m113249c(this.f101833a));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            C46226oM2.this.m21293h(C32063By0.m113249c(this.f101833a));
        }
    }

    @Override // p000.I73
    /* renamed from: a */
    public Observable<C32063By0> mo21300a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f101823a = m21296e(context);
        m21291j(context);
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).addCapability(13).build(), this.f101823a);
        return this.f101824b.toFlowable(EnumC23460b.LATEST).m32201F(new C26922c(connectivityManager, context)).m32205D(new C26921b()).m32167W(new C26920a()).m32170U0(C32063By0.m113249c(context)).m32209B().m32113r1();
    }

    /* renamed from: d */
    public BroadcastReceiver m21297d() {
        return new C26923d();
    }

    /* renamed from: e */
    public ConnectivityManager.NetworkCallback m21296e(Context context) {
        return new C26924e(context);
    }

    /* renamed from: f */
    public boolean m21295f(Context context) {
        String packageName = context.getPackageName();
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        boolean isIgnoringBatteryOptimizations = powerManager.isIgnoringBatteryOptimizations(packageName);
        if (powerManager.isDeviceIdleMode() && !isIgnoringBatteryOptimizations) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public void m21294g(String str, Exception exc) {
        Log.e("ReactiveNetwork", str, exc);
    }

    /* renamed from: h */
    public void m21293h(C32063By0 c32063By0) {
        this.f101824b.onNext(c32063By0);
    }

    /* renamed from: i */
    public InterfaceC45761na4<C32063By0> m21292i(C32063By0 c32063By0, C32063By0 c32063By02) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (c32063By0.m113242j() != c32063By02.m113242j()) {
            z = true;
        } else {
            z = false;
        }
        if (c32063By0.m113244h() == NetworkInfo.State.CONNECTED) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c32063By02.m113244h() == NetworkInfo.State.DISCONNECTED) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (c32063By02.m113246f() != NetworkInfo.DetailedState.IDLE) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z && z2 && z3 && z4) {
            return AbstractC24490k.m32144h0(c32063By02, c32063By0);
        }
        return AbstractC24490k.m32144h0(c32063By02);
    }

    /* renamed from: j */
    public void m21291j(Context context) {
        context.registerReceiver(this.f101825c, new IntentFilter("android.os.action.DEVICE_IDLE_MODE_CHANGED"));
    }

    /* renamed from: k */
    public void m21290k(ConnectivityManager connectivityManager) {
        try {
            connectivityManager.unregisterNetworkCallback(this.f101823a);
        } catch (Exception e) {
            m21294g("could not unregister network callback", e);
        }
    }

    /* renamed from: l */
    public void m21289l(Context context) {
        try {
            context.unregisterReceiver(this.f101825c);
        } catch (Exception e) {
            m21294g("could not unregister receiver", e);
        }
    }
}
