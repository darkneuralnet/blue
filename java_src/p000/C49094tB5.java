package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import p000.InterfaceC32531Dy0;
import p000.MC1;
/* renamed from: tB5  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49094tB5 {

    /* renamed from: d */
    public static volatile C49094tB5 f109996d;

    /* renamed from: a */
    public final InterfaceC28547c f109997a;

    /* renamed from: b */
    public final Set<InterfaceC32531Dy0.InterfaceC1677a> f109998b = new HashSet();

    /* renamed from: c */
    public boolean f109999c;

    /* renamed from: tB5$a */
    /* loaded from: classes5.dex */
    public class C28545a implements MC1.InterfaceC5218b<ConnectivityManager> {

        /* renamed from: a */
        public final /* synthetic */ Context f110000a;

        public C28545a(Context context) {
            this.f110000a = context;
        }

        @Override // p000.MC1.InterfaceC5218b
        /* renamed from: a */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f110000a.getSystemService("connectivity");
        }
    }

    /* renamed from: tB5$b */
    /* loaded from: classes5.dex */
    public class C28546b implements InterfaceC32531Dy0.InterfaceC1677a {
        public C28546b() {
        }

        @Override // p000.InterfaceC32531Dy0.InterfaceC1677a
        /* renamed from: a */
        public void mo12913a(boolean z) {
            ArrayList<InterfaceC32531Dy0.InterfaceC1677a> arrayList;
            C47029pi6.m18924b();
            synchronized (C49094tB5.this) {
                arrayList = new ArrayList(C49094tB5.this.f109998b);
            }
            for (InterfaceC32531Dy0.InterfaceC1677a interfaceC1677a : arrayList) {
                interfaceC1677a.mo12913a(z);
            }
        }
    }

    /* renamed from: tB5$c */
    /* loaded from: classes5.dex */
    public interface InterfaceC28547c {
        boolean register();

        void unregister();
    }

    /* renamed from: tB5$d */
    /* loaded from: classes5.dex */
    public static final class C28548d implements InterfaceC28547c {

        /* renamed from: a */
        public boolean f110003a;

        /* renamed from: b */
        public final InterfaceC32531Dy0.InterfaceC1677a f110004b;

        /* renamed from: c */
        public final MC1.InterfaceC5218b<ConnectivityManager> f110005c;

        /* renamed from: d */
        public final ConnectivityManager.NetworkCallback f110006d = new C28549a();

        /* renamed from: tB5$d$a */
        /* loaded from: classes5.dex */
        public class C28549a extends ConnectivityManager.NetworkCallback {

            /* renamed from: tB5$d$a$a */
            /* loaded from: classes5.dex */
            public class RunnableC28550a implements Runnable {

                /* renamed from: b */
                public final /* synthetic */ boolean f110008b;

                public RunnableC28550a(boolean z) {
                    this.f110008b = z;
                }

                @Override // java.lang.Runnable
                public void run() {
                    C28549a.this.m12912a(this.f110008b);
                }
            }

            public C28549a() {
            }

            /* renamed from: a */
            public void m12912a(boolean z) {
                C47029pi6.m18924b();
                C28548d c28548d = C28548d.this;
                boolean z2 = c28548d.f110003a;
                c28548d.f110003a = z;
                if (z2 != z) {
                    c28548d.f110004b.mo12913a(z);
                }
            }

            /* renamed from: b */
            public final void m12911b(boolean z) {
                C47029pi6.m18905u(new RunnableC28550a(z));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                m12911b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                m12911b(false);
            }
        }

        public C28548d(MC1.InterfaceC5218b<ConnectivityManager> interfaceC5218b, InterfaceC32531Dy0.InterfaceC1677a interfaceC1677a) {
            this.f110005c = interfaceC5218b;
            this.f110004b = interfaceC1677a;
        }

        @Override // p000.C49094tB5.InterfaceC28547c
        @SuppressLint({"MissingPermission"})
        public boolean register() {
            boolean z;
            if (this.f110005c.get().getActiveNetwork() != null) {
                z = true;
            } else {
                z = false;
            }
            this.f110003a = z;
            try {
                this.f110005c.get().registerDefaultNetworkCallback(this.f110006d);
                return true;
            } catch (RuntimeException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e);
                }
                return false;
            }
        }

        @Override // p000.C49094tB5.InterfaceC28547c
        public void unregister() {
            this.f110005c.get().unregisterNetworkCallback(this.f110006d);
        }
    }

    public C49094tB5(Context context) {
        this.f109997a = new C28548d(MC1.m95597a(new C28545a(context)), new C28546b());
    }

    /* renamed from: a */
    public static C49094tB5 m12919a(Context context) {
        if (f109996d == null) {
            synchronized (C49094tB5.class) {
                if (f109996d == null) {
                    f109996d = new C49094tB5(context.getApplicationContext());
                }
            }
        }
        return f109996d;
    }

    /* renamed from: b */
    public final void m12918b() {
        if (!this.f109999c && !this.f109998b.isEmpty()) {
            this.f109999c = this.f109997a.register();
        }
    }

    /* renamed from: c */
    public final void m12917c() {
        if (this.f109999c && this.f109998b.isEmpty()) {
            this.f109997a.unregister();
            this.f109999c = false;
        }
    }

    /* renamed from: d */
    public synchronized void m12916d(InterfaceC32531Dy0.InterfaceC1677a interfaceC1677a) {
        this.f109998b.add(interfaceC1677a);
        m12918b();
    }

    /* renamed from: e */
    public synchronized void m12915e(InterfaceC32531Dy0.InterfaceC1677a interfaceC1677a) {
        this.f109998b.remove(interfaceC1677a);
        m12917c();
    }
}
