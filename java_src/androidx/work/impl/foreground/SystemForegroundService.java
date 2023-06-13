package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.LifecycleService;
import androidx.work.impl.foreground.C12149a;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferService;
/* loaded from: classes.dex */
public class SystemForegroundService extends LifecycleService implements C12149a.InterfaceC12151b {

    /* renamed from: g */
    public static final String f56288g = AbstractC32056Bx2.m113270i("SystemFgService");

    /* renamed from: h */
    public static SystemForegroundService f56289h = null;

    /* renamed from: c */
    public Handler f56290c;

    /* renamed from: d */
    public boolean f56291d;

    /* renamed from: e */
    public C12149a f56292e;

    /* renamed from: f */
    public NotificationManager f56293f;

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$a */
    /* loaded from: classes.dex */
    public class RunnableC12144a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ int f56294b;

        /* renamed from: c */
        public final /* synthetic */ Notification f56295c;

        /* renamed from: d */
        public final /* synthetic */ int f56296d;

        public RunnableC12144a(int i, Notification notification, int i2) {
            this.f56294b = i;
            this.f56295c = notification;
            this.f56296d = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                C12148e.m65489a(SystemForegroundService.this, this.f56294b, this.f56295c, this.f56296d);
            } else if (i >= 29) {
                C12147d.m65490a(SystemForegroundService.this, this.f56294b, this.f56295c, this.f56296d);
            } else {
                SystemForegroundService.this.startForeground(this.f56294b, this.f56295c);
            }
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$b */
    /* loaded from: classes.dex */
    public class RunnableC12145b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ int f56298b;

        /* renamed from: c */
        public final /* synthetic */ Notification f56299c;

        public RunnableC12145b(int i, Notification notification) {
            this.f56298b = i;
            this.f56299c = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f56293f.notify(this.f56298b, this.f56299c);
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$c */
    /* loaded from: classes.dex */
    public class RunnableC12146c implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ int f56301b;

        public RunnableC12146c(int i) {
            this.f56301b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f56293f.cancel(this.f56301b);
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$d */
    /* loaded from: classes.dex */
    public static class C12147d {
        private C12147d() {
        }

        /* renamed from: a */
        public static void m65490a(Service service, int i, Notification notification, int i2) {
            service.startForeground(i, notification, i2);
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$e */
    /* loaded from: classes.dex */
    public static class C12148e {
        private C12148e() {
        }

        /* renamed from: a */
        public static void m65489a(Service service, int i, Notification notification, int i2) {
            try {
                service.startForeground(i, notification, i2);
            } catch (ForegroundServiceStartNotAllowedException e) {
                AbstractC32056Bx2.m113272e().mo113261l(SystemForegroundService.f56288g, "Unable to start foreground service", e);
            }
        }
    }

    @Override // androidx.work.impl.foreground.C12149a.InterfaceC12151b
    /* renamed from: a */
    public void mo65477a(int i, Notification notification) {
        this.f56290c.post(new RunnableC12145b(i, notification));
    }

    @Override // androidx.work.impl.foreground.C12149a.InterfaceC12151b
    /* renamed from: c */
    public void mo65476c(int i, int i2, Notification notification) {
        this.f56290c.post(new RunnableC12144a(i, notification, i2));
    }

    @Override // androidx.work.impl.foreground.C12149a.InterfaceC12151b
    /* renamed from: d */
    public void mo65475d(int i) {
        this.f56290c.post(new RunnableC12146c(i));
    }

    /* renamed from: f */
    public final void m65491f() {
        this.f56290c = new Handler(Looper.getMainLooper());
        this.f56293f = (NotificationManager) getApplicationContext().getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
        C12149a c12149a = new C12149a(getApplicationContext());
        this.f56292e = c12149a;
        c12149a.m65478n(this);
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        f56289h = this;
        m65491f();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f56292e.m65480l();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f56291d) {
            AbstractC32056Bx2.m113272e().mo113265f(f56288g, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f56292e.m65480l();
            m65491f();
            this.f56291d = false;
        }
        if (intent != null) {
            this.f56292e.m65479m(intent);
            return 3;
        }
        return 3;
    }

    @Override // androidx.work.impl.foreground.C12149a.InterfaceC12151b
    public void stop() {
        this.f56291d = true;
        AbstractC32056Bx2.m113272e().mo113269a(f56288g, "All commands completed.");
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f56289h = null;
        stopSelf();
    }
}
