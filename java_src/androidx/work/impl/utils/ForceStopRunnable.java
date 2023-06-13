package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.C12120a;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p000.UC6;
/* loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {

    /* renamed from: f */
    public static final String f56316f = AbstractC32056Bx2.m113270i("ForceStopRunnable");

    /* renamed from: g */
    public static final long f56317g = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: b */
    public final Context f56318b;

    /* renamed from: c */
    public final C37830aD6 f56319c;

    /* renamed from: d */
    public final TZ3 f56320d;

    /* renamed from: e */
    public int f56321e = 0;

    /* loaded from: classes.dex */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a */
        public static final String f56322a = AbstractC32056Bx2.m113270i("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                AbstractC32056Bx2.m113272e().mo113263j(f56322a, "Rescheduling alarm that keeps track of force-stops.");
                ForceStopRunnable.m65468g(context);
            }
        }
    }

    public ForceStopRunnable(Context context, C37830aD6 c37830aD6) {
        this.f56318b = context.getApplicationContext();
        this.f56319c = c37830aD6;
        this.f56320d = c37830aD6.m71760q();
    }

    /* renamed from: c */
    public static Intent m65472c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    /* renamed from: d */
    public static PendingIntent m65471d(Context context, int i) {
        return PendingIntent.getBroadcast(context, -1, m65472c(context), i);
    }

    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: g */
    public static void m65468g(Context context) {
        int i;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (Build.VERSION.SDK_INT >= 31) {
            i = 167772160;
        } else {
            i = 134217728;
        }
        PendingIntent m65471d = m65471d(context, i);
        long currentTimeMillis = System.currentTimeMillis() + f56317g;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, m65471d);
        }
    }

    /* renamed from: a */
    public boolean m65474a() {
        boolean z;
        boolean m39171i = C41593gY5.m39171i(this.f56318b, this.f56319c);
        WorkDatabase m71756u = this.f56319c.m71756u();
        IG6 mo65549I = m71756u.mo65549I();
        InterfaceC52697zG6 mo65550H = m71756u.mo65550H();
        m71756u.m108730c();
        try {
            List<HG6> mo100748t = mo65549I.mo100748t();
            if (mo100748t != null && !mo100748t.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                for (HG6 hg6 : mo100748t) {
                    mo65549I.mo100758j(UC6.EnumC8214a.ENQUEUED, hg6.f13191a);
                    mo65549I.mo100753o(hg6.f13191a, -1L);
                }
            }
            mo65550H.mo1576a();
            m71756u.m108734A();
            if (z || m39171i) {
                return true;
            }
            return false;
        } finally {
            m71756u.m108728g();
        }
    }

    /* renamed from: b */
    public void m65473b() {
        boolean m65474a = m65474a();
        if (m65467h()) {
            AbstractC32056Bx2.m113272e().mo113269a(f56316f, "Rescheduling Workers.");
            this.f56319c.m71752y();
            this.f56319c.m71760q().m83388e(false);
        } else if (m65470e()) {
            AbstractC32056Bx2.m113272e().mo113269a(f56316f, "Application was force-stopped, rescheduling.");
            this.f56319c.m71752y();
            this.f56320d.m83389d(System.currentTimeMillis());
        } else if (m65474a) {
            AbstractC32056Bx2.m113272e().mo113269a(f56316f, "Found unfinished work, scheduling it.");
            C32662Em5.m108385b(this.f56319c.m71763n(), this.f56319c.m71756u(), this.f56319c.m71758s());
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: e */
    public boolean m65470e() {
        int i;
        List historicalProcessExitReasons;
        int reason;
        long timestamp;
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                i = 570425344;
            } else {
                i = 536870912;
            }
            PendingIntent m65471d = m65471d(this.f56318b, i);
            if (i2 >= 30) {
                if (m65471d != null) {
                    m65471d.cancel();
                }
                historicalProcessExitReasons = ((ActivityManager) this.f56318b.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    long m83392a = this.f56320d.m83392a();
                    for (int i3 = 0; i3 < historicalProcessExitReasons.size(); i3++) {
                        ApplicationExitInfo m80593a = C36492Uw1.m80593a(historicalProcessExitReasons.get(i3));
                        reason = m80593a.getReason();
                        if (reason == 10) {
                            timestamp = m80593a.getTimestamp();
                            if (timestamp >= m83392a) {
                                return true;
                            }
                        }
                    }
                }
            } else if (m65471d == null) {
                m65468g(this.f56318b);
                return true;
            }
            return false;
        } catch (IllegalArgumentException | SecurityException e) {
            AbstractC32056Bx2.m113272e().mo113261l(f56316f, "Ignoring exception", e);
            return true;
        }
    }

    /* renamed from: f */
    public boolean m65469f() {
        C12120a m71763n = this.f56319c.m71763n();
        if (TextUtils.isEmpty(m71763n.m65607c())) {
            AbstractC32056Bx2.m113272e().mo113269a(f56316f, "The default process name was not specified.");
            return true;
        }
        boolean m87314b = R64.m87314b(this.f56318b, m71763n);
        AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
        String str = f56316f;
        m113272e.mo113269a(str, "Is default app process = " + m87314b);
        return m87314b;
    }

    /* renamed from: h */
    public boolean m65467h() {
        return this.f56319c.m71760q().m83391b();
    }

    /* renamed from: i */
    public void m65466i(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        try {
            if (!m65469f()) {
                return;
            }
            while (true) {
                try {
                    MC6.m95577d(this.f56318b);
                    AbstractC32056Bx2.m113272e().mo113269a(f56316f, "Performing cleanup operations.");
                    try {
                        m65473b();
                        break;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e) {
                        i = this.f56321e + 1;
                        this.f56321e = i;
                        if (i >= 3) {
                            AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
                            String str = f56316f;
                            m113272e.mo113266d(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                            InterfaceC48378rz0<Throwable> m65605e = this.f56319c.m71763n().m65605e();
                            if (m65605e != null) {
                                AbstractC32056Bx2.m113272e().mo113268b(str, "Routing exception to the specified exception handler", illegalStateException);
                                m65605e.accept(illegalStateException);
                            } else {
                                throw illegalStateException;
                            }
                        } else {
                            AbstractC32056Bx2 m113272e2 = AbstractC32056Bx2.m113272e();
                            String str2 = f56316f;
                            m113272e2.mo113268b(str2, "Retrying after " + (i * 300), e);
                            m65466i(((long) this.f56321e) * 300);
                        }
                    }
                    AbstractC32056Bx2 m113272e22 = AbstractC32056Bx2.m113272e();
                    String str22 = f56316f;
                    m113272e22.mo113268b(str22, "Retrying after " + (i * 300), e);
                    m65466i(((long) this.f56321e) * 300);
                } catch (SQLiteException e2) {
                    AbstractC32056Bx2.m113272e().mo113267c(f56316f, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e2);
                    InterfaceC48378rz0<Throwable> m65605e2 = this.f56319c.m71763n().m65605e();
                    if (m65605e2 != null) {
                        m65605e2.accept(illegalStateException2);
                    } else {
                        throw illegalStateException2;
                    }
                }
            }
        } finally {
            this.f56319c.m71753x();
        }
    }
}
