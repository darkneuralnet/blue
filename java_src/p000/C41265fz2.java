package p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.util.Log;
import io.reactivex.InterfaceC24578y;
import io.reactivex.InterfaceC24579z;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23478a;
@TargetApi(21)
/* renamed from: fz2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C41265fz2 implements I73 {

    /* renamed from: a */
    public ConnectivityManager.NetworkCallback f81242a;

    /* renamed from: fz2$a */
    /* loaded from: classes5.dex */
    public class C20671a implements InterfaceC23478a {

        /* renamed from: b */
        public final /* synthetic */ ConnectivityManager f81243b;

        public C20671a(ConnectivityManager connectivityManager) {
            this.f81243b = connectivityManager;
        }

        @Override // io.reactivex.functions.InterfaceC23478a
        public void run() {
            C41265fz2.this.m40386h(this.f81243b);
        }
    }

    /* renamed from: fz2$b */
    /* loaded from: classes5.dex */
    public class C20672b implements InterfaceC24579z<C32063By0> {

        /* renamed from: b */
        public final /* synthetic */ Context f81245b;

        /* renamed from: c */
        public final /* synthetic */ ConnectivityManager f81246c;

        public C20672b(Context context, ConnectivityManager connectivityManager) {
            this.f81245b = context;
            this.f81246c = connectivityManager;
        }

        @Override // io.reactivex.InterfaceC24579z
        public void subscribe(InterfaceC24578y<C32063By0> interfaceC24578y) throws Exception {
            C41265fz2 c41265fz2 = C41265fz2.this;
            c41265fz2.f81242a = c41265fz2.m40388f(interfaceC24578y, this.f81245b);
            this.f81246c.registerNetworkCallback(new NetworkRequest.Builder().build(), C41265fz2.this.f81242a);
        }
    }

    /* renamed from: fz2$c */
    /* loaded from: classes5.dex */
    public class C20673c extends ConnectivityManager.NetworkCallback {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC24578y f81248a;

        /* renamed from: b */
        public final /* synthetic */ Context f81249b;

        public C20673c(InterfaceC24578y interfaceC24578y, Context context) {
            this.f81248a = interfaceC24578y;
            this.f81249b = context;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            this.f81248a.onNext(C32063By0.m113249c(this.f81249b));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            this.f81248a.onNext(C32063By0.m113249c(this.f81249b));
        }
    }

    @Override // p000.I73
    /* renamed from: a */
    public Observable<C32063By0> mo21300a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return Observable.create(new C20672b(context, connectivityManager)).doOnDispose(new C20671a(connectivityManager)).startWith((Observable) C32063By0.m113249c(context)).distinctUntilChanged();
    }

    /* renamed from: f */
    public final ConnectivityManager.NetworkCallback m40388f(InterfaceC24578y<C32063By0> interfaceC24578y, Context context) {
        return new C20673c(interfaceC24578y, context);
    }

    /* renamed from: g */
    public void m40387g(String str, Exception exc) {
        Log.e("ReactiveNetwork", str, exc);
    }

    /* renamed from: h */
    public final void m40386h(ConnectivityManager connectivityManager) {
        try {
            connectivityManager.unregisterNetworkCallback(this.f81242a);
        } catch (Exception e) {
            m40387g("could not unregister network callback", e);
        }
    }
}
