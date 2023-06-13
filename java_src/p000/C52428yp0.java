package p000;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.C18357c;
import java.util.concurrent.atomic.AtomicInteger;
import p000.C38054ac3;
/* renamed from: yp0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52428yp0 {

    /* renamed from: a */
    public static final AtomicInteger f120222a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: yp0$a */
    /* loaded from: classes6.dex */
    public static class C30707a {

        /* renamed from: a */
        public final C38054ac3.C10770e f120223a;

        /* renamed from: b */
        public final String f120224b;

        /* renamed from: c */
        public final int f120225c;

        public C30707a(C38054ac3.C10770e c10770e, String str, int i) {
            this.f120223a = c10770e;
            this.f120224b = str;
            this.f120225c = i;
        }
    }

    private C52428yp0() {
    }

    /* renamed from: a */
    public static PendingIntent m2549a(Context context, C18357c c18357c, String str, PackageManager packageManager) {
        Intent m2544f = m2544f(str, c18357c, packageManager);
        if (m2544f == null) {
            return null;
        }
        m2544f.addFlags(67108864);
        m2544f.putExtras(c18357c.m47147y());
        if (m2533q(c18357c)) {
            m2544f.putExtra("gcm.n.analytics_data", c18357c.m47148x());
        }
        return PendingIntent.getActivity(context, m2543g(), m2544f, m2538l(1073741824));
    }

    /* renamed from: b */
    public static PendingIntent m2548b(Context context, Context context2, C18357c c18357c) {
        if (!m2533q(c18357c)) {
            return null;
        }
        return m2547c(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(c18357c.m47148x()));
    }

    /* renamed from: c */
    public static PendingIntent m2547c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, m2543g(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context2, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), m2538l(1073741824));
    }

    /* renamed from: d */
    public static C30707a m2546d(Context context, Context context2, C18357c c18357c, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        C38054ac3.C10770e c10770e = new C38054ac3.C10770e(context2, str);
        String m47158n = c18357c.m47158n(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(m47158n)) {
            c10770e.m71047m(m47158n);
        }
        String m47158n2 = c18357c.m47158n(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(m47158n2)) {
            c10770e.m71048l(m47158n2);
            c10770e.m71065D(new C38054ac3.C10768c().m71072h(m47158n2));
        }
        c10770e.m71067B(m2537m(packageManager, resources, packageName, c18357c.m47156p("gcm.n.icon"), bundle));
        Uri m2536n = m2536n(packageName, c18357c, resources);
        if (m2536n != null) {
            c10770e.m71066C(m2536n);
        }
        c10770e.m71049k(m2549a(context, c18357c, packageName, packageManager));
        PendingIntent m2548b = m2548b(context, context2, c18357c);
        if (m2548b != null) {
            c10770e.m71043q(m2548b);
        }
        Integer m2542h = m2542h(context2, c18357c.m47156p("gcm.n.color"), bundle);
        if (m2542h != null) {
            c10770e.m71050j(m2542h.intValue());
        }
        c10770e.m71053g(!c18357c.m47171a("gcm.n.sticky"));
        c10770e.m71039u(c18357c.m47171a("gcm.n.local_only"));
        String m47156p = c18357c.m47156p("gcm.n.ticker");
        if (m47156p != null) {
            c10770e.m71063F(m47156p);
        }
        Integer m47159m = c18357c.m47159m();
        if (m47159m != null) {
            c10770e.m71036x(m47159m.intValue());
        }
        Integer m47154r = c18357c.m47154r();
        if (m47154r != null) {
            c10770e.m71061H(m47154r.intValue());
        }
        Integer m47160l = c18357c.m47160l();
        if (m47160l != null) {
            c10770e.m71038v(m47160l.intValue());
        }
        Long m47162j = c18357c.m47162j("gcm.n.event_time");
        if (m47162j != null) {
            c10770e.m71068A(true);
            c10770e.m71060I(m47162j.longValue());
        }
        long[] m47155q = c18357c.m47155q();
        if (m47155q != null) {
            c10770e.m71062G(m47155q);
        }
        int[] m47167e = c18357c.m47167e();
        if (m47167e != null) {
            c10770e.m71040t(m47167e[0], m47167e[1], m47167e[2]);
        }
        c10770e.m71044p(m2541i(c18357c));
        return new C30707a(c10770e, m2535o(c18357c), 0);
    }

    /* renamed from: e */
    public static C30707a m2545e(Context context, C18357c c18357c) {
        Bundle m2540j = m2540j(context.getPackageManager(), context.getPackageName());
        return m2546d(context, context, c18357c, m2539k(context, c18357c.m47161k(), m2540j), m2540j);
    }

    /* renamed from: f */
    public static Intent m2544f(String str, C18357c c18357c, PackageManager packageManager) {
        String m47156p = c18357c.m47156p("gcm.n.click_action");
        if (!TextUtils.isEmpty(m47156p)) {
            Intent intent = new Intent(m47156p);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri m47166f = c18357c.m47166f();
        if (m47166f != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(m47166f);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    /* renamed from: g */
    public static int m2543g() {
        return f120222a.incrementAndGet();
    }

    /* renamed from: h */
    public static Integer m2542h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i != 0) {
            try {
                return Integer.valueOf(NA0.m94301c(context, i));
            } catch (Resources.NotFoundException unused2) {
                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* renamed from: i */
    public static int m2541i(C18357c c18357c) {
        boolean m47171a = c18357c.m47171a("gcm.n.default_sound");
        ?? r0 = m47171a;
        if (c18357c.m47171a("gcm.n.default_vibrate_timings")) {
            r0 = (m47171a ? 1 : 0) | true;
        }
        if (c18357c.m47171a("gcm.n.default_light_settings")) {
            return r0 | 4;
        }
        return r0;
    }

    /* renamed from: j */
    public static Bundle m2540j(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e);
        }
        return Bundle.EMPTY;
    }

    @TargetApi(26)
    /* renamed from: k */
    public static String m2539k(Context context, String str, Bundle bundle) {
        NotificationChannel notificationChannel;
        String string;
        NotificationChannel notificationChannel2;
        NotificationChannel notificationChannel3;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                notificationChannel3 = notificationManager.getNotificationChannel(str);
                if (notificationChannel3 != null) {
                    return str;
                }
                Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (!TextUtils.isEmpty(string2)) {
                notificationChannel2 = notificationManager.getNotificationChannel(string2);
                if (notificationChannel2 != null) {
                    return string2;
                }
                Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            } else {
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            }
            notificationChannel = notificationManager.getNotificationChannel("fcm_fallback_notification_channel");
            if (notificationChannel == null) {
                int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                if (identifier == 0) {
                    Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    string = "Misc";
                } else {
                    string = context.getString(identifier);
                }
                C42795ia3.m33793a();
                notificationManager.createNotificationChannel(C42202ha3.m36179a("fcm_fallback_notification_channel", string, 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: l */
    public static int m2538l(int i) {
        return i | 67108864;
    }

    /* renamed from: m */
    public static int m2537m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && m2534p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && m2534p(resources, identifier2)) {
                return identifier2;
            }
            Log.w("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i == 0 || !m2534p(resources, i)) {
            try {
                i = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e);
            }
        }
        if (i == 0 || !m2534p(resources, i)) {
            return 17301651;
        }
        return i;
    }

    /* renamed from: n */
    public static Uri m2536n(String str, C18357c c18357c, Resources resources) {
        String m47157o = c18357c.m47157o();
        if (TextUtils.isEmpty(m47157o)) {
            return null;
        }
        if (!"default".equals(m47157o) && resources.getIdentifier(m47157o, "raw", str) != 0) {
            return Uri.parse("android.resource://" + str + "/raw/" + m47157o);
        }
        return RingtoneManager.getDefaultUri(2);
    }

    /* renamed from: o */
    public static String m2535o(C18357c c18357c) {
        String m47156p = c18357c.m47156p("gcm.n.tag");
        if (!TextUtils.isEmpty(m47156p)) {
            return m47156p;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    @TargetApi(26)
    /* renamed from: p */
    public static boolean m2534p(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!C51835xp0.m4593a(resources.getDrawable(i, null))) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i + ", treating it as an invalid icon");
            return false;
        }
    }

    /* renamed from: q */
    public static boolean m2533q(C18357c c18357c) {
        return c18357c.m47171a("google.c.a.e");
    }
}
