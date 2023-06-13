package com.google.p034ar.core;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.google.p034ar.core.ArCoreApk;
import com.google.p034ar.core.dependencies.AbstractBinderC17993g;
import com.google.p034ar.core.dependencies.InterfaceC17994h;
import com.google.p034ar.core.exceptions.FatalException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.ar.core.u */
/* loaded from: classes6.dex */
public final class C18013u {

    /* renamed from: a */
    private final Queue f73835a;

    /* renamed from: b */
    private Context f73836b;

    /* renamed from: c */
    private InterfaceC17994h f73837c;

    /* renamed from: d */
    private final ServiceConnection f73838d;

    /* renamed from: e */
    private BroadcastReceiver f73839e;

    /* renamed from: f */
    private Context f73840f;

    /* renamed from: g */
    private PackageInstaller f73841g;

    /* renamed from: h */
    private PackageInstaller.SessionCallback f73842h;

    /* renamed from: i */
    private volatile int f73843i;

    public C18013u() {
    }

    public C18013u(byte[] bArr) {
        this();
        this.f73835a = new ArrayDeque();
        this.f73843i = 1;
        this.f73838d = new ServiceConnectionC18014v(this);
    }

    /* renamed from: k */
    public static /* bridge */ /* synthetic */ Bundle m48390k() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("package.name", "com.google.ar.core");
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final synchronized void m48389l(IBinder iBinder) {
        InterfaceC17994h m48418b = AbstractBinderC17993g.m48418b(iBinder);
        Log.i("ARCore-InstallService", "Install service connected");
        this.f73837c = m48418b;
        this.f73843i = 3;
        for (Runnable runnable : this.f73835a) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public final synchronized void m48388m() {
        Log.i("ARCore-InstallService", "Install service disconnected");
        this.f73843i = 1;
        this.f73837c = null;
    }

    /* renamed from: n */
    private final synchronized void m48387n(Runnable runnable) throws C17977ad {
        int i = this.f73843i;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        return;
                    }
                    runnable.run();
                    return;
                }
                this.f73835a.offer(runnable);
                return;
            }
            throw new C17977ad();
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static void m48386o(Activity activity, C18011s c18011s) {
        boolean z;
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.ar.core"));
            C18002j m48414a = C18002j.m48414a();
            Iterator<ResolveInfo> it = activity.getPackageManager().queryIntentActivities(intent, 65536).iterator();
            while (true) {
                if (it.hasNext()) {
                    ActivityInfo activityInfo = it.next().activityInfo;
                    if (activityInfo != null && activityInfo.name.equals("com.sec.android.app.samsungapps.MainForChina")) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            m48414a.f73804b = !z;
            activity.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            c18011s.m48401b(new FatalException("Failed to launch installer.", e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static void m48385p(Activity activity, Bundle bundle, C18011s c18011s) {
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("resolution.intent");
        if (pendingIntent != null) {
            try {
                activity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1234, new Intent(activity, activity.getClass()), 0, 0, 0);
                return;
            } catch (IntentSender.SendIntentException e) {
                c18011s.m48401b(new FatalException("Installation Intent failed", e));
                return;
            }
        }
        Log.e("ARCore-InstallService", "Did not get pending intent.");
        c18011s.m48401b(new FatalException("Installation intent failed to unparcel."));
    }

    /* renamed from: a */
    public final synchronized void m48400a(Context context) {
        this.f73836b = context;
        if (context.bindService(new Intent("com.google.android.play.core.install.BIND_INSTALL_SERVICE").setPackage("com.android.vending"), this.f73838d, 1)) {
            this.f73843i = 2;
            return;
        }
        this.f73843i = 1;
        this.f73836b = null;
        Log.w("ARCore-InstallService", "bindService returned false.");
        context.unbindService(this.f73838d);
    }

    /* renamed from: b */
    public final synchronized void m48399b(Context context, InterfaceC18000h interfaceC18000h) {
        try {
            m48387n(new RunnableC18016x(this, context, interfaceC18000h));
        } catch (C17977ad unused) {
            Log.e("ARCore-InstallService", "Play Store install service could not be bound.");
            interfaceC18000h.mo48403a(ArCoreApk.Availability.UNKNOWN_ERROR);
        }
    }

    /* renamed from: c */
    public final synchronized void m48398c() {
        int i = this.f73843i;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1 || i2 == 2) {
                this.f73836b.unbindService(this.f73838d);
                this.f73836b = null;
                this.f73843i = 1;
            }
            BroadcastReceiver broadcastReceiver = this.f73839e;
            if (broadcastReceiver != null) {
                this.f73840f.unregisterReceiver(broadcastReceiver);
            }
            PackageInstaller.SessionCallback sessionCallback = this.f73842h;
            if (sessionCallback != null) {
                this.f73841g.unregisterSessionCallback(sessionCallback);
                this.f73842h = null;
                return;
            }
            return;
        }
        throw null;
    }

    @SuppressLint({"UnprotectedReceiver"})
    /* renamed from: d */
    public final void m48397d(Activity activity, C18011s c18011s) {
        if (this.f73842h == null) {
            try {
                this.f73841g = activity.getPackageManager().getPackageInstaller();
                C18017y c18017y = new C18017y(this, c18011s);
                this.f73842h = c18017y;
                this.f73841g.registerSessionCallback(c18017y);
            } catch (NullPointerException unused) {
                c18011s.m48401b(new FatalException("Unable to obtain Android PackageInstaller; is this a Play Instant App?"));
            }
        }
        if (this.f73839e == null) {
            C18018z c18018z = new C18018z(c18011s);
            this.f73839e = c18018z;
            this.f73840f = activity;
            if (Build.VERSION.SDK_INT >= 33) {
                activity.registerReceiver(c18018z, new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), 2);
            } else {
                activity.registerReceiver(c18018z, new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"));
            }
        }
        try {
            m48387n(new RunnableC17976ac(this, activity, c18011s));
        } catch (C17977ad unused2) {
            Log.w("ARCore-InstallService", "requestInstall bind failed, launching fullscreen.");
            m48386o(activity, c18011s);
        }
    }
}
