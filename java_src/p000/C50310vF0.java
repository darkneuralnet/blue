package p000;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import p000.InterfaceC45057mO1;
/* renamed from: vF0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C50310vF0 {

    /* renamed from: a */
    public final InterfaceC45650nO1 f113743a;

    /* renamed from: b */
    public final ComponentName f113744b;

    /* renamed from: c */
    public final Context f113745c;

    /* renamed from: vF0$a */
    /* loaded from: classes.dex */
    public class C29461a extends AbstractServiceConnectionC52089yF0 {

        /* renamed from: b */
        public final /* synthetic */ Context f113746b;

        public C29461a(Context context) {
            this.f113746b = context;
        }

        @Override // p000.AbstractServiceConnectionC52089yF0
        public final void onCustomTabsServiceConnected(ComponentName componentName, C50310vF0 c50310vF0) {
            c50310vF0.m8955f(0L);
            this.f113746b.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: vF0$b */
    /* loaded from: classes.dex */
    public class BinderC29462b extends InterfaceC45057mO1.AbstractBinderC26081a {

        /* renamed from: a */
        public Handler f113747a = new Handler(Looper.getMainLooper());

        /* renamed from: b */
        public final /* synthetic */ C49718uF0 f113748b;

        /* renamed from: vF0$b$a */
        /* loaded from: classes.dex */
        public class RunnableC29463a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ int f113750b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f113751c;

            public RunnableC29463a(int i, Bundle bundle) {
                this.f113750b = i;
                this.f113751c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC29462b.this.f113748b.mo10515e(this.f113750b, this.f113751c);
            }
        }

        /* renamed from: vF0$b$b */
        /* loaded from: classes.dex */
        public class RunnableC29464b implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ String f113753b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f113754c;

            public RunnableC29464b(String str, Bundle bundle) {
                this.f113753b = str;
                this.f113754c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC29462b.this.f113748b.mo10519a(this.f113753b, this.f113754c);
            }
        }

        /* renamed from: vF0$b$c */
        /* loaded from: classes.dex */
        public class RunnableC29465c implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ Bundle f113756b;

            public RunnableC29465c(Bundle bundle) {
                this.f113756b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC29462b.this.f113748b.mo10516d(this.f113756b);
            }
        }

        /* renamed from: vF0$b$d */
        /* loaded from: classes.dex */
        public class RunnableC29466d implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ String f113758b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f113759c;

            public RunnableC29466d(String str, Bundle bundle) {
                this.f113758b = str;
                this.f113759c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC29462b.this.f113748b.mo10514f(this.f113758b, this.f113759c);
            }
        }

        /* renamed from: vF0$b$e */
        /* loaded from: classes.dex */
        public class RunnableC29467e implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ int f113761b;

            /* renamed from: c */
            public final /* synthetic */ Uri f113762c;

            /* renamed from: d */
            public final /* synthetic */ boolean f113763d;

            /* renamed from: e */
            public final /* synthetic */ Bundle f113764e;

            public RunnableC29467e(int i, Uri uri, boolean z, Bundle bundle) {
                this.f113761b = i;
                this.f113762c = uri;
                this.f113763d = z;
                this.f113764e = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC29462b.this.f113748b.mo10513g(this.f113761b, this.f113762c, this.f113763d, this.f113764e);
            }
        }

        /* renamed from: vF0$b$f */
        /* loaded from: classes.dex */
        public class RunnableC29468f implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ int f113766b;

            /* renamed from: c */
            public final /* synthetic */ int f113767c;

            /* renamed from: d */
            public final /* synthetic */ Bundle f113768d;

            public RunnableC29468f(int i, int i2, Bundle bundle) {
                this.f113766b = i;
                this.f113767c = i2;
                this.f113768d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC29462b.this.f113748b.mo10517c(this.f113766b, this.f113767c, this.f113768d);
            }
        }

        public BinderC29462b(C49718uF0 c49718uF0) {
            this.f113748b = c49718uF0;
        }

        @Override // p000.InterfaceC45057mO1
        /* renamed from: D1 */
        public void mo8954D1(int i, Bundle bundle) {
            if (this.f113748b == null) {
                return;
            }
            this.f113747a.post(new RunnableC29463a(i, bundle));
        }

        @Override // p000.InterfaceC45057mO1
        /* renamed from: P */
        public Bundle mo8953P(String str, Bundle bundle) throws RemoteException {
            C49718uF0 c49718uF0 = this.f113748b;
            if (c49718uF0 == null) {
                return null;
            }
            return c49718uF0.mo10518b(str, bundle);
        }

        @Override // p000.InterfaceC45057mO1
        /* renamed from: U4 */
        public void mo8952U4(String str, Bundle bundle) throws RemoteException {
            if (this.f113748b == null) {
                return;
            }
            this.f113747a.post(new RunnableC29466d(str, bundle));
        }

        @Override // p000.InterfaceC45057mO1
        /* renamed from: X4 */
        public void mo8951X4(Bundle bundle) throws RemoteException {
            if (this.f113748b == null) {
                return;
            }
            this.f113747a.post(new RunnableC29465c(bundle));
        }

        @Override // p000.InterfaceC45057mO1
        /* renamed from: Y4 */
        public void mo8950Y4(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException {
            if (this.f113748b == null) {
                return;
            }
            this.f113747a.post(new RunnableC29467e(i, uri, z, bundle));
        }

        @Override // p000.InterfaceC45057mO1
        /* renamed from: a3 */
        public void mo8949a3(String str, Bundle bundle) throws RemoteException {
            if (this.f113748b == null) {
                return;
            }
            this.f113747a.post(new RunnableC29464b(str, bundle));
        }

        @Override // p000.InterfaceC45057mO1
        /* renamed from: h1 */
        public void mo8948h1(int i, int i2, Bundle bundle) throws RemoteException {
            if (this.f113748b == null) {
                return;
            }
            this.f113747a.post(new RunnableC29468f(i, i2, bundle));
        }
    }

    public C50310vF0(InterfaceC45650nO1 interfaceC45650nO1, ComponentName componentName, Context context) {
        this.f113743a = interfaceC45650nO1;
        this.f113744b = componentName;
        this.f113745c = context;
    }

    /* renamed from: a */
    public static boolean m8960a(Context context, String str, AbstractServiceConnectionC52089yF0 abstractServiceConnectionC52089yF0) {
        abstractServiceConnectionC52089yF0.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, abstractServiceConnectionC52089yF0, 33);
    }

    /* renamed from: b */
    public static boolean m8959b(Context context, String str) {
        if (str == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            return m8960a(applicationContext, str, new C29461a(applicationContext));
        } catch (SecurityException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public final InterfaceC45057mO1.AbstractBinderC26081a m8958c(C49718uF0 c49718uF0) {
        return new BinderC29462b(c49718uF0);
    }

    /* renamed from: d */
    public C52682zF0 m8957d(C49718uF0 c49718uF0) {
        return m8956e(c49718uF0, null);
    }

    /* renamed from: e */
    public final C52682zF0 m8956e(C49718uF0 c49718uF0, PendingIntent pendingIntent) {
        boolean mo23913Q;
        InterfaceC45057mO1.AbstractBinderC26081a m8958c = m8958c(c49718uF0);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                mo23913Q = this.f113743a.mo23912Z(m8958c, bundle);
            } else {
                mo23913Q = this.f113743a.mo23913Q(m8958c);
            }
            if (!mo23913Q) {
                return null;
            }
            return new C52682zF0(this.f113743a, m8958c, this.f113744b, pendingIntent);
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public boolean m8955f(long j) {
        try {
            return this.f113743a.mo23911c1(j);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
