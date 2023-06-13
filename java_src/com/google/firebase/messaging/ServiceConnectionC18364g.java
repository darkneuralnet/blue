package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.ServiceConnectionC18364g;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* renamed from: com.google.firebase.messaging.g */
/* loaded from: classes6.dex */
public class ServiceConnectionC18364g implements ServiceConnection {

    /* renamed from: b */
    public final Context f74344b;

    /* renamed from: c */
    public final Intent f74345c;

    /* renamed from: d */
    public final ScheduledExecutorService f74346d;

    /* renamed from: e */
    public final Queue<C18365a> f74347e;

    /* renamed from: f */
    public BinderC18362f f74348f;

    /* renamed from: g */
    public boolean f74349g;

    /* renamed from: com.google.firebase.messaging.g$a */
    /* loaded from: classes6.dex */
    public static class C18365a {

        /* renamed from: a */
        public final Intent f74350a;

        /* renamed from: b */
        public final TaskCompletionSource<Void> f74351b = new TaskCompletionSource<>();

        public C18365a(Intent intent) {
            this.f74350a = intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m47119f() {
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + this.f74350a.getAction() + " Releasing WakeLock.");
            m47121d();
        }

        /* renamed from: c */
        public void m47122c(ScheduledExecutorService scheduledExecutorService) {
            boolean z;
            long j;
            if ((this.f74350a.getFlags() & 268435456) != 0) {
                z = true;
            } else {
                z = false;
            }
            Runnable runnable = new Runnable() { // from class: zC6
                @Override // java.lang.Runnable
                public final void run() {
                    ServiceConnectionC18364g.C18365a.this.m47119f();
                }
            };
            if (z) {
                j = C37199Xw6.f44267a;
            } else {
                j = 9000;
            }
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            m47120e().addOnCompleteListener(scheduledExecutorService, new OnCompleteListener() { // from class: AC6
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    schedule.cancel(false);
                }
            });
        }

        /* renamed from: d */
        public void m47121d() {
            this.f74351b.trySetResult(null);
        }

        /* renamed from: e */
        public Task<Void> m47120e() {
            return this.f74351b.getTask();
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public ServiceConnectionC18364g(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    /* renamed from: a */
    public final void m47128a() {
        while (!this.f74347e.isEmpty()) {
            this.f74347e.poll().m47121d();
        }
    }

    /* renamed from: b */
    public final synchronized void m47127b() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f74347e.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            BinderC18362f binderC18362f = this.f74348f;
            if (binderC18362f != null && binderC18362f.isBinderAlive()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f74348f.m47130c(this.f74347e.poll());
            } else {
                m47125d();
                return;
            }
        }
    }

    /* renamed from: c */
    public synchronized Task<Void> m47126c(Intent intent) {
        C18365a c18365a;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        c18365a = new C18365a(intent);
        c18365a.m47122c(this.f74346d);
        this.f74347e.add(c18365a);
        m47127b();
        return c18365a.m47120e();
    }

    /* renamed from: d */
    public final void m47125d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("binder is dead. start connection? ");
            sb.append(!this.f74349g);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f74349g) {
            return;
        }
        this.f74349g = true;
        try {
        } catch (SecurityException e) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e);
        }
        if (ConnectionTracker.getInstance().bindService(this.f74344b, this.f74345c, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f74349g = false;
        m47128a();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
        }
        this.f74349g = false;
        if (!(iBinder instanceof BinderC18362f)) {
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            m47128a();
            return;
        }
        this.f74348f = (BinderC18362f) iBinder;
        m47127b();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        m47127b();
    }

    public ServiceConnectionC18364g(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f74347e = new ArrayDeque();
        this.f74349g = false;
        Context applicationContext = context.getApplicationContext();
        this.f74344b = applicationContext;
        this.f74345c = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f74346d = scheduledExecutorService;
    }
}
