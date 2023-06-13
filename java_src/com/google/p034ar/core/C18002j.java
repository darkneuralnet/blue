package com.google.p034ar.core;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.google.p034ar.core.ArCoreApk;
import com.google.p034ar.core.exceptions.FatalException;
import com.google.p034ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.p034ar.core.exceptions.UnavailableUserDeclinedInstallationException;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.ar.core.j */
/* loaded from: classes6.dex */
public final class C18002j extends ArCoreApk {

    /* renamed from: c */
    private static final C18002j f73802c = new C18002j();

    /* renamed from: a */
    Exception f73803a;

    /* renamed from: b */
    boolean f73804b = true;

    /* renamed from: d */
    private boolean f73805d;

    /* renamed from: e */
    private int f73806e;

    /* renamed from: f */
    private long f73807f;

    /* renamed from: g */
    private ArCoreApk.Availability f73808g;

    /* renamed from: h */
    private boolean f73809h;

    /* renamed from: i */
    private C18013u f73810i;

    /* renamed from: j */
    private boolean f73811j;

    /* renamed from: k */
    private boolean f73812k;

    /* renamed from: l */
    private int f73813l;

    /* renamed from: a */
    public static C18002j m48414a() {
        return f73802c;
    }

    /* renamed from: g */
    private static int m48408g(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.ar.core", 4);
            int i = packageInfo.versionCode;
            if (i == 0) {
                ServiceInfo[] serviceInfoArr = packageInfo.services;
                if (serviceInfoArr != null) {
                    if (serviceInfoArr.length != 0) {
                        return 0;
                    }
                }
                return -1;
            }
            return i;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    /* renamed from: h */
    private final synchronized void m48407h(Context context) {
        if (this.f73811j) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        try {
            Bundle bundle = packageManager.getApplicationInfo(packageName, 128).metaData;
            if (bundle.containsKey("com.google.ar.core")) {
                String string = bundle.getString("com.google.ar.core");
                string.getClass();
                this.f73812k = string.equals("required");
                if (bundle.containsKey("com.google.ar.core.min_apk_version")) {
                    this.f73813l = bundle.getInt("com.google.ar.core.min_apk_version");
                    try {
                        ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(packageName, 1).activities;
                        String canonicalName = InstallActivity.class.getCanonicalName();
                        for (ActivityInfo activityInfo : activityInfoArr) {
                            if (canonicalName.equals(activityInfo.name)) {
                                this.f73811j = true;
                                return;
                            }
                        }
                        throw new FatalException("Application manifest must contain activity " + canonicalName);
                    } catch (PackageManager.NameNotFoundException e) {
                        throw new FatalException("Could not load application package info", e);
                    }
                }
                throw new FatalException("Application manifest must contain meta-data com.google.ar.core.min_apk_version");
            }
            throw new FatalException("Application manifest must contain meta-data com.google.ar.core");
        } catch (PackageManager.NameNotFoundException e2) {
            throw new FatalException("Could not load application package metadata", e2);
        }
    }

    /* renamed from: i */
    private final boolean m48406i(Context context) {
        m48407h(context);
        return this.f73812k;
    }

    /* renamed from: j */
    private static final ArCoreApk.InstallStatus m48405j(Activity activity) throws UnavailableDeviceNotCompatibleException, UnavailableUserDeclinedInstallationException {
        PendingIntent m48433a = C17980ag.m48433a(activity);
        if (m48433a != null) {
            try {
                Log.i("ARCore-ArCoreApk", "Starting setup activity");
                activity.startIntentSender(m48433a.getIntentSender(), null, 0, 0, 0);
                return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
            } catch (IntentSender.SendIntentException | RuntimeException e) {
                Log.w("ARCore-ArCoreApk", "Setup activity launch failed", e);
            }
        }
        return ArCoreApk.InstallStatus.INSTALLED;
    }

    /* renamed from: b */
    public final synchronized C18013u m48413b(Context context) {
        if (this.f73810i == null) {
            C18013u c18013u = new C18013u(null);
            c18013u.m48400a(context.getApplicationContext());
            this.f73810i = c18013u;
        }
        return this.f73810i;
    }

    @Override // com.google.p034ar.core.ArCoreApk
    public final ArCoreApk.Availability checkAvailability(Context context) {
        ArCoreApk.Availability availability;
        try {
            if (m48410e(context)) {
                m48411d();
                try {
                    if (C17980ag.m48433a(context) != null) {
                        availability = ArCoreApk.Availability.SUPPORTED_APK_TOO_OLD;
                    } else {
                        availability = ArCoreApk.Availability.SUPPORTED_INSTALLED;
                    }
                    return availability;
                } catch (UnavailableDeviceNotCompatibleException unused) {
                    return ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE;
                } catch (UnavailableUserDeclinedInstallationException | RuntimeException unused2) {
                    return ArCoreApk.Availability.UNKNOWN_ERROR;
                }
            }
            synchronized (this) {
                ArCoreApk.Availability availability2 = this.f73808g;
                if ((availability2 == null || availability2.isUnknown()) && !this.f73809h) {
                    this.f73809h = true;
                    C18001i c18001i = new C18001i(this);
                    if (m48410e(context)) {
                        c18001i.mo48403a(ArCoreApk.Availability.SUPPORTED_INSTALLED);
                    } else if (m48408g(context) != -1) {
                        c18001i.mo48403a(ArCoreApk.Availability.SUPPORTED_APK_TOO_OLD);
                    } else if (m48406i(context)) {
                        c18001i.mo48403a(ArCoreApk.Availability.SUPPORTED_NOT_INSTALLED);
                    } else {
                        m48413b(context).m48399b(context, c18001i);
                    }
                }
                ArCoreApk.Availability availability3 = this.f73808g;
                if (availability3 != null) {
                    return availability3;
                }
                if (this.f73809h) {
                    return ArCoreApk.Availability.UNKNOWN_CHECKING;
                }
                Log.e("ARCore-ArCoreApk", "request not running but result is null?");
                return ArCoreApk.Availability.UNKNOWN_ERROR;
            }
        } catch (FatalException e) {
            Log.e("ARCore-ArCoreApk", "Error while checking app details and ARCore status", e);
            return ArCoreApk.Availability.UNKNOWN_ERROR;
        }
    }

    /* renamed from: d */
    public final synchronized void m48411d() {
        if (this.f73803a == null) {
            this.f73806e = 0;
        }
        this.f73805d = false;
        C18013u c18013u = this.f73810i;
        if (c18013u != null) {
            c18013u.m48398c();
            this.f73810i = null;
        }
    }

    /* renamed from: e */
    public final boolean m48410e(Context context) {
        m48407h(context);
        if (m48408g(context) != 0 && m48408g(context) < this.f73813l) {
            return false;
        }
        return true;
    }

    @Override // com.google.p034ar.core.ArCoreApk
    public final ArCoreApk.InstallStatus requestInstall(Activity activity, boolean z) throws UnavailableDeviceNotCompatibleException, UnavailableUserDeclinedInstallationException {
        ArCoreApk.UserMessageType userMessageType;
        ArCoreApk.InstallBehavior installBehavior = m48406i(activity) ? ArCoreApk.InstallBehavior.REQUIRED : ArCoreApk.InstallBehavior.OPTIONAL;
        if (m48406i(activity)) {
            userMessageType = ArCoreApk.UserMessageType.APPLICATION;
        } else {
            userMessageType = ArCoreApk.UserMessageType.USER_ALREADY_INFORMED;
        }
        return requestInstall(activity, z, installBehavior, userMessageType);
    }

    @Override // com.google.p034ar.core.ArCoreApk
    public final ArCoreApk.InstallStatus requestInstall(Activity activity, boolean z, ArCoreApk.InstallBehavior installBehavior, ArCoreApk.UserMessageType userMessageType) throws UnavailableDeviceNotCompatibleException, UnavailableUserDeclinedInstallationException {
        if (m48410e(activity)) {
            m48411d();
            return m48405j(activity);
        } else if (this.f73805d) {
            return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
        } else {
            Exception exc = this.f73803a;
            if (exc != null) {
                if (z) {
                    Log.w("ARCore-ArCoreApk", "Clearing previous failure: ", exc);
                    this.f73803a = null;
                } else if (!(exc instanceof UnavailableDeviceNotCompatibleException)) {
                    if (!(exc instanceof UnavailableUserDeclinedInstallationException)) {
                        if (exc instanceof RuntimeException) {
                            throw ((RuntimeException) exc);
                        }
                        throw new RuntimeException("Unexpected exception type", exc);
                    }
                    throw ((UnavailableUserDeclinedInstallationException) exc);
                } else {
                    throw ((UnavailableDeviceNotCompatibleException) exc);
                }
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.f73807f > 5000) {
                this.f73806e = 0;
            }
            int i = this.f73806e + 1;
            this.f73806e = i;
            this.f73807f = uptimeMillis;
            if (i <= 2) {
                try {
                    activity.startActivity(new Intent(activity, InstallActivity.class).putExtra("message", userMessageType).putExtra("behavior", installBehavior));
                    this.f73805d = true;
                    return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
                } catch (ActivityNotFoundException e) {
                    throw new FatalException("Failed to launch InstallActivity", e);
                }
            }
            throw new FatalException("Requesting ARCore installation too rapidly.");
        }
    }
}
