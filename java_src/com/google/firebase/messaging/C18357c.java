package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;
/* renamed from: com.google.firebase.messaging.c */
/* loaded from: classes6.dex */
public class C18357c {

    /* renamed from: a */
    public final Bundle f74335a;

    public C18357c(Bundle bundle) {
        if (bundle != null) {
            this.f74335a = new Bundle(bundle);
            return;
        }
        throw new NullPointerException(MessageExtension.FIELD_DATA);
    }

    /* renamed from: d */
    public static int m47168d(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    /* renamed from: s */
    public static boolean m47153s(String str) {
        if (!str.startsWith("google.c.a.") && !str.equals("from")) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public static boolean m47152t(Bundle bundle) {
        if (!"1".equals(bundle.getString("gcm.n.e")) && !"1".equals(bundle.getString(m47150v("gcm.n.e")))) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    public static boolean m47151u(String str) {
        if (!str.startsWith("google.c.") && !str.startsWith("gcm.n.") && !str.startsWith("gcm.notification.")) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public static String m47150v(String str) {
        if (!str.startsWith("gcm.n.")) {
            return str;
        }
        return str.replace("gcm.n.", "gcm.notification.");
    }

    /* renamed from: z */
    public static String m47146z(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    /* renamed from: a */
    public boolean m47171a(String str) {
        String m47156p = m47156p(str);
        if (!"1".equals(m47156p) && !Boolean.parseBoolean(m47156p)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public Integer m47170b(String str) {
        String m47156p = m47156p(str);
        if (!TextUtils.isEmpty(m47156p)) {
            try {
                return Integer.valueOf(Integer.parseInt(m47156p));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + m47146z(str) + "(" + m47156p + ") into an int");
                return null;
            }
        }
        return null;
    }

    /* renamed from: c */
    public JSONArray m47169c(String str) {
        String m47156p = m47156p(str);
        if (!TextUtils.isEmpty(m47156p)) {
            try {
                return new JSONArray(m47156p);
            } catch (JSONException unused) {
                Log.w("NotificationParams", "Malformed JSON for key " + m47146z(str) + ": " + m47156p + ", falling back to default");
                return null;
            }
        }
        return null;
    }

    /* renamed from: e */
    public int[] m47167e() {
        JSONArray m47169c = m47169c("gcm.n.light_settings");
        if (m47169c == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (m47169c.length() == 3) {
                iArr[0] = m47168d(m47169c.optString(0));
                iArr[1] = m47169c.optInt(1);
                iArr[2] = m47169c.optInt(2);
                return iArr;
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (IllegalArgumentException e) {
            Log.w("NotificationParams", "LightSettings is invalid: " + m47169c + ". " + e.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + m47169c + ". Skipping setting LightSettings");
            return null;
        }
    }

    /* renamed from: f */
    public Uri m47166f() {
        String m47156p = m47156p("gcm.n.link_android");
        if (TextUtils.isEmpty(m47156p)) {
            m47156p = m47156p("gcm.n.link");
        }
        if (!TextUtils.isEmpty(m47156p)) {
            return Uri.parse(m47156p);
        }
        return null;
    }

    /* renamed from: g */
    public Object[] m47165g(String str) {
        JSONArray m47169c = m47169c(str + "_loc_args");
        if (m47169c == null) {
            return null;
        }
        int length = m47169c.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = m47169c.optString(i);
        }
        return strArr;
    }

    /* renamed from: h */
    public String m47164h(String str) {
        return m47156p(str + "_loc_key");
    }

    /* renamed from: i */
    public String m47163i(Resources resources, String str, String str2) {
        String m47164h = m47164h(str2);
        if (TextUtils.isEmpty(m47164h)) {
            return null;
        }
        int identifier = resources.getIdentifier(m47164h, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", m47146z(str2 + "_loc_key") + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] m47165g = m47165g(str2);
        if (m47165g == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, m47165g);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + m47146z(str2) + ": " + Arrays.toString(m47165g) + " Default value will be used.", e);
            return null;
        }
    }

    /* renamed from: j */
    public Long m47162j(String str) {
        String m47156p = m47156p(str);
        if (!TextUtils.isEmpty(m47156p)) {
            try {
                return Long.valueOf(Long.parseLong(m47156p));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + m47146z(str) + "(" + m47156p + ") into a long");
                return null;
            }
        }
        return null;
    }

    /* renamed from: k */
    public String m47161k() {
        return m47156p("gcm.n.android_channel_id");
    }

    /* renamed from: l */
    public Integer m47160l() {
        Integer m47170b = m47170b("gcm.n.notification_count");
        if (m47170b == null) {
            return null;
        }
        if (m47170b.intValue() < 0) {
            Log.w("FirebaseMessaging", "notificationCount is invalid: " + m47170b + ". Skipping setting notificationCount.");
            return null;
        }
        return m47170b;
    }

    /* renamed from: m */
    public Integer m47159m() {
        Integer m47170b = m47170b("gcm.n.notification_priority");
        if (m47170b == null) {
            return null;
        }
        if (m47170b.intValue() >= -2 && m47170b.intValue() <= 2) {
            return m47170b;
        }
        Log.w("FirebaseMessaging", "notificationPriority is invalid " + m47170b + ". Skipping setting notificationPriority.");
        return null;
    }

    /* renamed from: n */
    public String m47158n(Resources resources, String str, String str2) {
        String m47156p = m47156p(str2);
        if (!TextUtils.isEmpty(m47156p)) {
            return m47156p;
        }
        return m47163i(resources, str, str2);
    }

    /* renamed from: o */
    public String m47157o() {
        String m47156p = m47156p("gcm.n.sound2");
        if (TextUtils.isEmpty(m47156p)) {
            return m47156p("gcm.n.sound");
        }
        return m47156p;
    }

    /* renamed from: p */
    public String m47156p(String str) {
        return this.f74335a.getString(m47149w(str));
    }

    /* renamed from: q */
    public long[] m47155q() {
        JSONArray m47169c = m47169c("gcm.n.vibrate_timings");
        if (m47169c == null) {
            return null;
        }
        try {
            if (m47169c.length() > 1) {
                int length = m47169c.length();
                long[] jArr = new long[length];
                for (int i = 0; i < length; i++) {
                    jArr[i] = m47169c.optLong(i);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + m47169c + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    /* renamed from: r */
    public Integer m47154r() {
        Integer m47170b = m47170b("gcm.n.visibility");
        if (m47170b == null) {
            return null;
        }
        if (m47170b.intValue() >= -1 && m47170b.intValue() <= 1) {
            return m47170b;
        }
        Log.w("NotificationParams", "visibility is invalid: " + m47170b + ". Skipping setting visibility.");
        return null;
    }

    /* renamed from: w */
    public final String m47149w(String str) {
        if (!this.f74335a.containsKey(str) && str.startsWith("gcm.n.")) {
            String m47150v = m47150v(str);
            if (this.f74335a.containsKey(m47150v)) {
                return m47150v;
            }
        }
        return str;
    }

    /* renamed from: x */
    public Bundle m47148x() {
        Bundle bundle = new Bundle(this.f74335a);
        for (String str : this.f74335a.keySet()) {
            if (!m47153s(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    /* renamed from: y */
    public Bundle m47147y() {
        Bundle bundle = new Bundle(this.f74335a);
        for (String str : this.f74335a.keySet()) {
            if (m47151u(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
