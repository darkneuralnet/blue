package com.google.android.play.core.assetpacks;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.support.annotation.Nullable;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferService;
/* loaded from: classes6.dex */
public class ExtractionForegroundService extends Service {

    /* renamed from: b */
    public final C42061hK6 f73702b = new C42061hK6("ExtractionForegroundService");

    /* renamed from: c */
    public Context f73703c;

    /* renamed from: d */
    public C39115cO6 f73704d;

    /* renamed from: e */
    public NotificationManager f73705e;

    /* renamed from: a */
    public final synchronized void m48469a(Intent intent) {
        Notification.Builder priority;
        String stringExtra = intent.getStringExtra("notification_title");
        String stringExtra2 = intent.getStringExtra("notification_subtext");
        long longExtra = intent.getLongExtra("notification_timeout", 600000L);
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("notification_on_click_intent");
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            C45187mc3.m25312a();
            priority = C44594lc3.m27090a(this.f73703c, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(longExtra);
        } else {
            priority = new Notification.Builder(this.f73703c).setPriority(-2);
        }
        if (pendingIntent != null) {
            priority.setContentIntent(pendingIntent);
        }
        Notification.Builder contentTitle = priority.setSmallIcon(17301633).setOngoing(false).setContentTitle(stringExtra == null ? "Downloading additional file" : stringExtra);
        if (stringExtra2 == null) {
            stringExtra = "Transferring";
        }
        contentTitle.setSubText(stringExtra);
        int intExtra = intent.getIntExtra("notification_color", 0);
        if (intExtra != 0) {
            priority.setColor(intExtra).setVisibility(-1);
        }
        Notification build = priority.build();
        this.f73702b.m36535d("Starting foreground installation service.", new Object[0]);
        this.f73704d.m61445a(true);
        if (i >= 26) {
            m48467c(intent.getStringExtra("notification_channel_name"));
        }
        startForeground(-1883842196, build);
    }

    /* renamed from: b */
    public final synchronized void m48468b() {
        this.f73702b.m36535d("Stopping service.", new Object[0]);
        this.f73704d.m61445a(false);
        stopForeground(true);
        stopSelf();
    }

    @TargetApi(26)
    /* renamed from: c */
    public final synchronized void m48467c(@Nullable String str) {
        if (str == null) {
            str = "File downloads by Play";
        }
        C42795ia3.m33793a();
        this.f73705e.createNotificationChannel(C42202ha3.m36179a("playcore-assetpacks-service-notification-channel", str, 2));
    }

    @Override // android.app.Service
    @Nullable
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        BM6.m114065h(getApplicationContext()).mo17604a(this);
        this.f73705e = (NotificationManager) this.f73703c.getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        m48469a(intent);
        int intExtra = intent.getIntExtra("action_type", 0);
        if (intExtra == 2) {
            m48468b();
        } else {
            this.f73702b.m36537b("Unknown action type received: %d", Integer.valueOf(intExtra));
        }
        return 2;
    }
}
