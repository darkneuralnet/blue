package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferService;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.C18343a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.concurrent.ExecutionException;
import p000.BT2;
/* renamed from: com.google.firebase.messaging.b */
/* loaded from: classes6.dex */
public class C18356b {
    /* renamed from: A */
    public static boolean m47200A(Intent intent) {
        if (intent != null && !m47180r(intent)) {
            return m47197a();
        }
        return false;
    }

    /* renamed from: B */
    public static boolean m47199B(Intent intent) {
        if (intent != null && !m47180r(intent)) {
            return m47198C(intent.getExtras());
        }
        return false;
    }

    /* renamed from: C */
    public static boolean m47198C(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    /* renamed from: a */
    public static boolean m47197a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            C31722Am1.m115292k();
            Context m115293j = C31722Am1.m115292k().m115293j();
            SharedPreferences sharedPreferences = m115293j.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = m115293j.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(m115293j.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    /* renamed from: b */
    public static BT2 m47196b(BT2.EnumC0621b enumC0621b, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        BT2.C0620a m113985h = BT2.m113993p().m113980m(m47182p(extras)).m113988e(enumC0621b).m113987f(m47192f(extras)).m113984i(m47185m()).m113982k(BT2.EnumC0623d.ANDROID).m113985h(m47187k(extras));
        String m47190h = m47190h(extras);
        if (m47190h != null) {
            m113985h.m113986g(m47190h);
        }
        String m47183o = m47183o(extras);
        if (m47183o != null) {
            m113985h.m113981l(m47183o);
        }
        String m47195c = m47195c(extras);
        if (m47195c != null) {
            m113985h.m113990c(m47195c);
        }
        String m47189i = m47189i(extras);
        if (m47189i != null) {
            m113985h.m113991b(m47189i);
        }
        String m47193e = m47193e(extras);
        if (m47193e != null) {
            m113985h.m113989d(m47193e);
        }
        long m47184n = m47184n(extras);
        if (m47184n > 0) {
            m113985h.m113983j(m47184n);
        }
        return m113985h.m113992a();
    }

    /* renamed from: c */
    public static String m47195c(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    /* renamed from: d */
    public static String m47194d(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    /* renamed from: e */
    public static String m47193e(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    /* renamed from: f */
    public static String m47192f(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) Tasks.await(C18343a.m47262q(C31722Am1.m115292k()).getId());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: g */
    public static String m47191g(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    /* renamed from: h */
    public static String m47190h(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        if (string == null) {
            return bundle.getString("message_id");
        }
        return string;
    }

    /* renamed from: i */
    public static String m47189i(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    /* renamed from: j */
    public static String m47188j(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    /* renamed from: k */
    public static BT2.EnumC0622c m47187k(Bundle bundle) {
        if (bundle != null && C18357c.m47152t(bundle)) {
            return BT2.EnumC0622c.DISPLAY_NOTIFICATION;
        }
        return BT2.EnumC0622c.DATA_MESSAGE;
    }

    /* renamed from: l */
    public static String m47186l(Bundle bundle) {
        return (bundle == null || !C18357c.m47152t(bundle)) ? MessageExtension.FIELD_DATA : "display";
    }

    /* renamed from: m */
    public static String m47185m() {
        return C31722Am1.m115292k().m115293j().getPackageName();
    }

    /* renamed from: n */
    public static long m47184n(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException e) {
                Log.w("FirebaseMessaging", "error parsing project number", e);
            }
        }
        C31722Am1 m115292k = C31722Am1.m115292k();
        String m18704d = m115292k.m115290m().m18704d();
        if (m18704d != null) {
            try {
                return Long.parseLong(m18704d);
            } catch (NumberFormatException e2) {
                Log.w("FirebaseMessaging", "error parsing sender ID", e2);
            }
        }
        String m18705c = m115292k.m115290m().m18705c();
        if (!m18705c.startsWith("1:")) {
            try {
                return Long.parseLong(m18705c);
            } catch (NumberFormatException e3) {
                Log.w("FirebaseMessaging", "error parsing app ID", e3);
            }
        } else {
            String[] split = m18705c.split(":");
            if (split.length < 2) {
                return 0L;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return 0L;
            }
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e4) {
                Log.w("FirebaseMessaging", "error parsing app ID", e4);
            }
        }
        return 0L;
    }

    /* renamed from: o */
    public static String m47183o(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    /* renamed from: p */
    public static int m47182p(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                return 0;
            }
        }
        return 0;
    }

    /* renamed from: q */
    public static String m47181q(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    /* renamed from: r */
    public static boolean m47180r(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    /* renamed from: s */
    public static void m47179s(Intent intent) {
        m47174x("_nd", intent.getExtras());
    }

    /* renamed from: t */
    public static void m47178t(Intent intent) {
        m47174x("_nf", intent.getExtras());
    }

    /* renamed from: u */
    public static void m47177u(Bundle bundle) {
        m47172z(bundle);
        m47174x("_no", bundle);
    }

    /* renamed from: v */
    public static void m47176v(Intent intent) {
        if (m47199B(intent)) {
            m47174x("_nr", intent.getExtras());
        }
        if (m47200A(intent)) {
            m47175w(BT2.EnumC0621b.MESSAGE_DELIVERED, intent, FirebaseMessaging.getTransportFactory());
        }
    }

    /* renamed from: w */
    public static void m47175w(BT2.EnumC0621b enumC0621b, Intent intent, U96 u96) {
        if (u96 == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        BT2 m47196b = m47196b(enumC0621b, intent);
        if (m47196b == null) {
            return;
        }
        try {
            u96.mo80270a("FCM_CLIENT_EVENT_LOGGING", CT2.class, C35142Pc1.m90060b("proto"), new C96() { // from class: AT2
                @Override // p000.C96
                public final Object apply(Object obj) {
                    return ((CT2) obj).m112203c();
                }
            }).mo77276a(AbstractC52339yg1.m2986d(CT2.m112204b().m112201b(m47196b).m112202a()));
        } catch (RuntimeException e) {
            Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e);
        }
    }

    /* renamed from: x */
    public static void m47174x(String str, Bundle bundle) {
        try {
            C31722Am1.m115292k();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String m47194d = m47194d(bundle);
            if (m47194d != null) {
                bundle2.putString("_nmid", m47194d);
            }
            String m47193e = m47193e(bundle);
            if (m47193e != null) {
                bundle2.putString("_nmn", m47193e);
            }
            String m47189i = m47189i(bundle);
            if (!TextUtils.isEmpty(m47189i)) {
                bundle2.putString("label", m47189i);
            }
            String m47191g = m47191g(bundle);
            if (!TextUtils.isEmpty(m47191g)) {
                bundle2.putString("message_channel", m47191g);
            }
            String m47183o = m47183o(bundle);
            if (m47183o != null) {
                bundle2.putString("_nt", m47183o);
            }
            String m47188j = m47188j(bundle);
            if (m47188j != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(m47188j));
                } catch (NumberFormatException e) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
                }
            }
            String m47181q = m47181q(bundle);
            if (m47181q != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(m47181q));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
                }
            }
            String m47186l = m47186l(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", m47186l);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            InterfaceC12447ba interfaceC12447ba = (InterfaceC12447ba) C31722Am1.m115292k().m115294i(InterfaceC12447ba.class);
            if (interfaceC12447ba != null) {
                interfaceC12447ba.mo61209a("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    /* renamed from: y */
    public static void m47173y(boolean z) {
        C31722Am1.m115292k().m115293j().getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", z).apply();
    }

    /* renamed from: z */
    public static void m47172z(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if ("1".equals(bundle.getString("google.c.a.tc"))) {
            InterfaceC12447ba interfaceC12447ba = (InterfaceC12447ba) C31722Am1.m115292k().m115294i(InterfaceC12447ba.class);
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
            }
            if (interfaceC12447ba != null) {
                String string = bundle.getString("google.c.a.c_id");
                interfaceC12447ba.mo61208b("fcm", "_ln", string);
                Bundle bundle2 = new Bundle();
                bundle2.putString(Stripe3ds2AuthParams.FIELD_SOURCE, "Firebase");
                bundle2.putString("medium", TransferService.INTENT_KEY_NOTIFICATION);
                bundle2.putString("campaign", string);
                interfaceC12447ba.mo61209a("fcm", "_cmp", bundle2);
                return;
            }
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
        }
    }
}
