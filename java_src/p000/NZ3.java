package p000;

import android.content.SharedPreferences;
import android.view.View;
import com.facebook.C17216a;
import com.stripe.android.financialconnections.domain.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: NZ3 */
/* loaded from: classes5.dex */
public final class NZ3 {

    /* renamed from: b */
    public static SharedPreferences f24790b;

    /* renamed from: a */
    public static final Map<String, String> f24789a = new HashMap();

    /* renamed from: c */
    public static final AtomicBoolean f24791c = new AtomicBoolean(false);

    /* renamed from: a */
    public static void m93759a(String str, String str2) {
        if (TD0.m84203d(NZ3.class)) {
            return;
        }
        try {
            if (!f24791c.get()) {
                m93757c();
            }
            Map<String, String> map = f24789a;
            map.put(str, str2);
            f24790b.edit().putString("SUGGESTED_EVENTS_HISTORY", C52364yi6.m2848b0(map)).apply();
        } catch (Throwable th) {
            TD0.m84205b(th, NZ3.class);
        }
    }

    /* renamed from: b */
    public static String m93758b(View view, String str) {
        if (TD0.m84203d(NZ3.class)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(Entry.TYPE_TEXT, str);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    view = C45933nr6.m22282j(view);
                }
                jSONObject.put("classname", jSONArray);
            } catch (JSONException unused) {
            }
            return C52364yi6.m2808v0(jSONObject.toString());
        } catch (Throwable th) {
            TD0.m84205b(th, NZ3.class);
            return null;
        }
    }

    /* renamed from: c */
    public static void m93757c() {
        if (TD0.m84203d(NZ3.class)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f24791c;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences sharedPreferences = C17216a.m52741e().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
            f24790b = sharedPreferences;
            f24789a.putAll(C52364yi6.m2855W(sharedPreferences.getString("SUGGESTED_EVENTS_HISTORY", "")));
            atomicBoolean.set(true);
        } catch (Throwable th) {
            TD0.m84205b(th, NZ3.class);
        }
    }

    /* renamed from: d */
    public static String m93756d(String str) {
        if (TD0.m84203d(NZ3.class)) {
            return null;
        }
        try {
            Map<String, String> map = f24789a;
            if (!map.containsKey(str)) {
                return null;
            }
            return map.get(str);
        } catch (Throwable th) {
            TD0.m84205b(th, NZ3.class);
            return null;
        }
    }
}
