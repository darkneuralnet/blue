package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.stripe.android.networking.FraudDetectionData;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.firebase.messaging.e */
/* loaded from: classes6.dex */
public class C18360e {

    /* renamed from: a */
    public final SharedPreferences f74338a;

    /* renamed from: com.google.firebase.messaging.e$a */
    /* loaded from: classes6.dex */
    public static class C18361a {

        /* renamed from: d */
        public static final long f74339d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a */
        public final String f74340a;

        /* renamed from: b */
        public final String f74341b;

        /* renamed from: c */
        public final long f74342c;

        public C18361a(String str, String str2, long j) {
            this.f74340a = str;
            this.f74341b = str2;
            this.f74342c = j;
        }

        /* renamed from: a */
        public static String m47135a(String str, String str2, long j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put(FraudDetectionData.KEY_TIMESTAMP, j);
                return jSONObject.toString();
            } catch (JSONException e) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e);
                return null;
            }
        }

        /* renamed from: c */
        public static C18361a m47133c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (str.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    return new C18361a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong(FraudDetectionData.KEY_TIMESTAMP));
                } catch (JSONException e) {
                    Log.w("FirebaseMessaging", "Failed to parse token: " + e);
                    return null;
                }
            }
            return new C18361a(str, null, 0L);
        }

        /* renamed from: b */
        public boolean m47134b(String str) {
            if (System.currentTimeMillis() <= this.f74342c + f74339d && str.equals(this.f74341b)) {
                return false;
            }
            return true;
        }
    }

    public C18360e(Context context) {
        this.f74338a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        m47142a(context, "com.google.android.gms.appid-no-backup");
    }

    /* renamed from: a */
    public final void m47142a(Context context, String str) {
        File file = new File(NA0.m94295i(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile() && !m47137f()) {
                Log.i("FirebaseMessaging", "App restored, clearing state");
                m47140c();
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
            }
        }
    }

    /* renamed from: b */
    public final String m47141b(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    /* renamed from: c */
    public synchronized void m47140c() {
        this.f74338a.edit().clear().commit();
    }

    /* renamed from: d */
    public synchronized void m47139d(String str, String str2) {
        String m47141b = m47141b(str, str2);
        SharedPreferences.Editor edit = this.f74338a.edit();
        edit.remove(m47141b);
        edit.commit();
    }

    /* renamed from: e */
    public synchronized C18361a m47138e(String str, String str2) {
        return C18361a.m47133c(this.f74338a.getString(m47141b(str, str2), null));
    }

    /* renamed from: f */
    public synchronized boolean m47137f() {
        return this.f74338a.getAll().isEmpty();
    }

    /* renamed from: g */
    public synchronized void m47136g(String str, String str2, String str3, String str4) {
        String m47135a = C18361a.m47135a(str3, str4, System.currentTimeMillis());
        if (m47135a == null) {
            return;
        }
        SharedPreferences.Editor edit = this.f74338a.edit();
        edit.putString(m47141b(str, str2), m47135a);
        edit.commit();
    }
}
