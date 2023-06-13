package p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
@VisibleForTesting
@TargetApi(14)
/* renamed from: GC8 */
/* loaded from: classes6.dex */
public final class GC8 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b */
    public final /* synthetic */ RC8 f11140b;

    public GC8(RC8 rc8) {
        this.f11140b = rc8;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C35248Pn8 c35248Pn8;
        Uri uri;
        String stringExtra;
        String str;
        boolean z;
        try {
            try {
                this.f11140b.f100966a.mo22258a().m106889s().m42708a("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent == null) {
                    c35248Pn8 = this.f11140b.f100966a;
                } else {
                    Wc9.m78119b();
                    Uri uri2 = null;
                    if (!this.f11140b.f100966a.m89751w().m37502y(null, C37795a98.f49938H0)) {
                        uri2 = intent.getData();
                    } else {
                        Uri data = intent.getData();
                        if (data != null && data.isHierarchical()) {
                            uri = data;
                            if (uri != null && uri.isHierarchical()) {
                                this.f11140b.f100966a.m89776N();
                                stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                                if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) && !"https://www.google.com".equals(stringExtra) && !"android-app://com.google.appcrawler".equals(stringExtra)) {
                                    str = "auto";
                                    String str2 = str;
                                    String queryParameter = uri.getQueryParameter("referrer");
                                    if (bundle != null) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    this.f11140b.f100966a.mo22257c().m43695w(new RunnableC50291vC8(this, z, uri, str2, queryParameter));
                                    c35248Pn8 = this.f11140b.f100966a;
                                }
                                str = "gs";
                                String str22 = str;
                                String queryParameter2 = uri.getQueryParameter("referrer");
                                if (bundle != null) {
                                }
                                this.f11140b.f100966a.mo22257c().m43695w(new RunnableC50291vC8(this, z, uri, str22, queryParameter2));
                                c35248Pn8 = this.f11140b.f100966a;
                            }
                            c35248Pn8 = this.f11140b.f100966a;
                        }
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("com.android.vending.referral_url");
                            if (!TextUtils.isEmpty(string)) {
                                uri2 = Uri.parse(string);
                            }
                        }
                    }
                    uri = uri2;
                    if (uri != null) {
                        this.f11140b.f100966a.m89776N();
                        stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra)) {
                            str = "auto";
                            String str222 = str;
                            String queryParameter22 = uri.getQueryParameter("referrer");
                            if (bundle != null) {
                            }
                            this.f11140b.f100966a.mo22257c().m43695w(new RunnableC50291vC8(this, z, uri, str222, queryParameter22));
                            c35248Pn8 = this.f11140b.f100966a;
                        }
                        str = "gs";
                        String str2222 = str;
                        String queryParameter222 = uri.getQueryParameter("referrer");
                        if (bundle != null) {
                        }
                        this.f11140b.f100966a.mo22257c().m43695w(new RunnableC50291vC8(this, z, uri, str2222, queryParameter222));
                        c35248Pn8 = this.f11140b.f100966a;
                    }
                    c35248Pn8 = this.f11140b.f100966a;
                }
            } catch (RuntimeException e) {
                this.f11140b.f100966a.mo22258a().m106893o().m42707b("Throwable caught in onActivityCreated", e);
                c35248Pn8 = this.f11140b.f100966a;
            }
            c35248Pn8.m89779K().m24001v(activity, bundle);
        } catch (Throwable th) {
            this.f11140b.f100966a.m89779K().m24001v(activity, bundle);
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f11140b.f100966a.m89779K().m24000w(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f11140b.f100966a.m89779K().m23999x(activity);
        C39144cR8 m89777M = this.f11140b.f100966a.m89777M();
        m89777M.f100966a.mo22257c().m43695w(new RunnableC50408vP8(m89777M, m89777M.f100966a.mo22260A().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C39144cR8 m89777M = this.f11140b.f100966a.m89777M();
        m89777M.f100966a.mo22257c().m43695w(new RunnableC49223tP8(m89777M, m89777M.f100966a.mo22260A().elapsedRealtime()));
        this.f11140b.f100966a.m89779K().m23998y(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f11140b.f100966a.m89779K().m24016B(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
