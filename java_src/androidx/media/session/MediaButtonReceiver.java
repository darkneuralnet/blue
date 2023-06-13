package androidx.media.session;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.support.p001v4.media.MediaBrowserCompat;
import android.support.p001v4.media.session.MediaControllerCompat;
import android.util.Log;
import android.view.KeyEvent;
import java.util.List;
/* loaded from: classes.dex */
public class MediaButtonReceiver extends BroadcastReceiver {

    /* renamed from: androidx.media.session.MediaButtonReceiver$a */
    /* loaded from: classes.dex */
    public static class C11807a extends MediaBrowserCompat.C10876c {

        /* renamed from: c */
        public final Context f55113c;

        /* renamed from: d */
        public final Intent f55114d;

        /* renamed from: e */
        public final BroadcastReceiver.PendingResult f55115e;

        /* renamed from: f */
        public MediaBrowserCompat f55116f;

        public C11807a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f55113c = context;
            this.f55114d = intent;
            this.f55115e = pendingResult;
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.C10876c
        /* renamed from: a */
        public void mo66840a() {
            new MediaControllerCompat(this.f55113c, this.f55116f.m70716c()).m70646a((KeyEvent) this.f55114d.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            m66837e();
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.C10876c
        /* renamed from: b */
        public void mo66839b() {
            m66837e();
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.C10876c
        /* renamed from: c */
        public void mo66838c() {
            m66837e();
        }

        /* renamed from: e */
        public final void m66837e() {
            this.f55116f.m70717b();
            this.f55115e.finish();
        }

        /* renamed from: f */
        public void m66836f(MediaBrowserCompat mediaBrowserCompat) {
            this.f55116f = mediaBrowserCompat;
        }
    }

    /* renamed from: a */
    public static ComponentName m66841a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        } else if (queryIntentServices.isEmpty()) {
            return null;
        } else {
            throw new IllegalStateException("Expected 1 service that handles " + str + ", found " + queryIntentServices.size());
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null && "android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            ComponentName m66841a = m66841a(context, "android.intent.action.MEDIA_BUTTON");
            if (m66841a != null) {
                intent.setComponent(m66841a);
                NA0.m94290n(context, intent);
                return;
            }
            ComponentName m66841a2 = m66841a(context, "android.media.browse.MediaBrowserService");
            if (m66841a2 != null) {
                BroadcastReceiver.PendingResult goAsync = goAsync();
                Context applicationContext = context.getApplicationContext();
                C11807a c11807a = new C11807a(applicationContext, intent, goAsync);
                MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, m66841a2, c11807a, null);
                c11807a.m66836f(mediaBrowserCompat);
                mediaBrowserCompat.m70718a();
                return;
            }
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        Log.d("MediaButtonReceiver", "Ignore unsupported intent: " + intent);
    }
}
