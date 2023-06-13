package p000;

import android.util.Patterns;
import com.amazonaws.services.p026s3.internal.Constants;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.model.PaymentMethod;
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: Bk1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C31938Bk1 {

    /* renamed from: a */
    public static Map<String, String> f2797a = null;

    /* renamed from: b */
    public static Map<String, String> f2798b = null;

    /* renamed from: c */
    public static Map<String, String> f2799c = null;

    /* renamed from: d */
    public static JSONObject f2800d = null;

    /* renamed from: e */
    public static boolean f2801e = false;

    /* renamed from: a */
    public static float[] m113563a(JSONObject jSONObject, String str) {
        String lowerCase;
        JSONObject jSONObject2;
        String optString;
        JSONArray jSONArray;
        JSONObject m113562b;
        if (TD0.m84203d(C31938Bk1.class)) {
            return null;
        }
        try {
            if (!f2801e) {
                return null;
            }
            float[] fArr = new float[30];
            Arrays.fill(fArr, 0.0f);
            try {
                lowerCase = str.toLowerCase();
                jSONObject2 = new JSONObject(jSONObject.optJSONObject("view").toString());
                optString = jSONObject.optString("screenname");
                jSONArray = new JSONArray();
                m113554j(jSONObject2, jSONArray);
                m113551m(fArr, m113555i(jSONObject2));
                m113562b = m113562b(jSONObject2);
            } catch (JSONException unused) {
            }
            if (m113562b == null) {
                return null;
            }
            m113551m(fArr, m113556h(m113562b, jSONArray, optString, jSONObject2.toString(), lowerCase));
            return fArr;
        } catch (Throwable th) {
            TD0.m84205b(th, C31938Bk1.class);
            return null;
        }
    }

    /* renamed from: b */
    public static JSONObject m113562b(JSONObject jSONObject) {
        if (TD0.m84203d(C31938Bk1.class)) {
            return null;
        }
        try {
        } catch (JSONException unused) {
        } catch (Throwable th) {
            TD0.m84205b(th, C31938Bk1.class);
        }
        if (jSONObject.optBoolean("is_interacted")) {
            return jSONObject;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
        if (optJSONArray == null) {
            return null;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject m113562b = m113562b(optJSONArray.getJSONObject(i));
            if (m113562b != null) {
                return m113562b;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static String m113561c(String str, String str2, String str3) {
        if (TD0.m84203d(C31938Bk1.class)) {
            return null;
        }
        try {
            return (str3 + " | " + str2 + ", " + str).toLowerCase();
        } catch (Throwable th) {
            TD0.m84205b(th, C31938Bk1.class);
            return null;
        }
    }

    /* renamed from: d */
    public static void m113560d(File file) {
        if (TD0.m84203d(C31938Bk1.class)) {
            return;
        }
        try {
            try {
                f2800d = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                f2800d = new JSONObject(new String(bArr, Constants.DEFAULT_ENCODING));
                HashMap hashMap = new HashMap();
                f2797a = hashMap;
                hashMap.put("ENGLISH", "1");
                f2797a.put("GERMAN", "2");
                f2797a.put("SPANISH", "3");
                f2797a.put("JAPANESE", "4");
                HashMap hashMap2 = new HashMap();
                f2798b = hashMap2;
                hashMap2.put("VIEW_CONTENT", "0");
                f2798b.put("SEARCH", "1");
                f2798b.put("ADD_TO_CART", "2");
                f2798b.put("ADD_TO_WISHLIST", "3");
                f2798b.put("INITIATE_CHECKOUT", "4");
                f2798b.put("ADD_PAYMENT_INFO", "5");
                f2798b.put("PURCHASE", "6");
                f2798b.put("LEAD", "7");
                f2798b.put("COMPLETE_REGISTRATION", "8");
                HashMap hashMap3 = new HashMap();
                f2799c = hashMap3;
                hashMap3.put("BUTTON_TEXT", "1");
                f2799c.put("PAGE_TITLE", "2");
                f2799c.put("RESOLVED_DOCUMENT_LINK", "3");
                f2799c.put("BUTTON_ID", "4");
                f2801e = true;
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            TD0.m84205b(th, C31938Bk1.class);
        }
    }

    /* renamed from: e */
    public static boolean m113559e(JSONObject jSONObject) {
        if (TD0.m84203d(C31938Bk1.class)) {
            return false;
        }
        try {
            if ((jSONObject.optInt("classtypebitmask") & 32) <= 0) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            TD0.m84205b(th, C31938Bk1.class);
            return false;
        }
    }

    /* renamed from: f */
    public static boolean m113558f() {
        if (TD0.m84203d(C31938Bk1.class)) {
            return false;
        }
        try {
            return f2801e;
        } catch (Throwable th) {
            TD0.m84205b(th, C31938Bk1.class);
            return false;
        }
    }

    /* renamed from: g */
    public static boolean m113557g(String[] strArr, String[] strArr2) {
        if (TD0.m84203d(C31938Bk1.class)) {
            return false;
        }
        try {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (str2.contains(str)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            TD0.m84205b(th, C31938Bk1.class);
            return false;
        }
    }

    /* renamed from: h */
    public static float[] m113556h(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        if (TD0.m84203d(C31938Bk1.class)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            float f13 = 0.0f;
            Arrays.fill(fArr, 0.0f);
            int length = jSONArray.length();
            if (length > 1) {
                i = length - 1;
            } else {
                i = 0;
            }
            fArr[3] = i;
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    if (m113559e(jSONArray.getJSONObject(i2))) {
                        fArr[9] = fArr[9] + 1.0f;
                    }
                } catch (JSONException unused) {
                }
            }
            fArr[13] = -1.0f;
            fArr[14] = -1.0f;
            String str4 = str + '|' + str3;
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            m113550n(jSONObject, sb2, sb);
            String sb3 = sb.toString();
            String sb4 = sb2.toString();
            if (m113552l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_TEXT", sb4)) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            fArr[15] = f;
            if (m113552l("ENGLISH", "COMPLETE_REGISTRATION", "PAGE_TITLE", str4)) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            fArr[16] = f2;
            if (m113552l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_ID", sb3)) {
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            fArr[17] = f3;
            if (str2.contains("password")) {
                f4 = 1.0f;
            } else {
                f4 = 0.0f;
            }
            fArr[18] = f4;
            if (m113553k("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2)) {
                f5 = 1.0f;
            } else {
                f5 = 0.0f;
            }
            fArr[19] = f5;
            if (m113553k("(?i)(sign in)|login|signIn", str2)) {
                f6 = 1.0f;
            } else {
                f6 = 0.0f;
            }
            fArr[20] = f6;
            if (m113553k("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2)) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            fArr[21] = f7;
            if (m113552l("ENGLISH", "PURCHASE", "BUTTON_TEXT", sb4)) {
                f8 = 1.0f;
            } else {
                f8 = 0.0f;
            }
            fArr[22] = f8;
            if (m113552l("ENGLISH", "PURCHASE", "PAGE_TITLE", str4)) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            fArr[24] = f9;
            if (m113553k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", sb4)) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            fArr[25] = f10;
            if (m113553k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str4)) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            fArr[27] = f11;
            if (m113552l("ENGLISH", "LEAD", "BUTTON_TEXT", sb4)) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            fArr[28] = f12;
            if (m113552l("ENGLISH", "LEAD", "PAGE_TITLE", str4)) {
                f13 = 1.0f;
            }
            fArr[29] = f13;
            return fArr;
        } catch (Throwable th) {
            TD0.m84205b(th, C31938Bk1.class);
            return null;
        }
    }

    /* renamed from: i */
    public static float[] m113555i(JSONObject jSONObject) {
        if (TD0.m84203d(C31938Bk1.class)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            Arrays.fill(fArr, 0.0f);
            String lowerCase = jSONObject.optString(Entry.TYPE_TEXT).toLowerCase();
            String lowerCase2 = jSONObject.optString("hint").toLowerCase();
            String lowerCase3 = jSONObject.optString("classname").toLowerCase();
            int optInt = jSONObject.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (m113557g(new String[]{"$", "amount", "price", "total"}, strArr)) {
                fArr[0] = (float) (fArr[0] + 1.0d);
            }
            if (m113557g(new String[]{"password", "pwd"}, strArr)) {
                fArr[1] = (float) (fArr[1] + 1.0d);
            }
            if (m113557g(new String[]{"tel", PaymentMethod.BillingDetails.PARAM_PHONE}, strArr)) {
                fArr[2] = (float) (fArr[2] + 1.0d);
            }
            if (m113557g(new String[]{"search"}, strArr)) {
                fArr[4] = (float) (fArr[4] + 1.0d);
            }
            if (optInt >= 0) {
                fArr[5] = (float) (fArr[5] + 1.0d);
            }
            if (optInt == 3 || optInt == 2) {
                fArr[6] = (float) (fArr[6] + 1.0d);
            }
            if (optInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = (float) (fArr[7] + 1.0d);
            }
            if (lowerCase3.contains("checkbox")) {
                fArr[8] = (float) (fArr[8] + 1.0d);
            }
            if (m113557g(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = (float) (fArr[10] + 1.0d);
            }
            if (lowerCase3.contains("radio") && lowerCase3.contains("button")) {
                fArr[12] = (float) (fArr[12] + 1.0d);
            }
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    m113551m(fArr, m113555i(optJSONArray.getJSONObject(i)));
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th) {
            TD0.m84205b(th, C31938Bk1.class);
            return null;
        }
    }

    /* renamed from: j */
    public static boolean m113554j(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z;
        if (TD0.m84203d(C31938Bk1.class)) {
            return false;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return true;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            int i = 0;
            while (true) {
                if (i < optJSONArray.length()) {
                    if (optJSONArray.getJSONObject(i).optBoolean("is_interacted")) {
                        z = true;
                        break;
                    }
                    i++;
                } else {
                    z = false;
                    break;
                }
            }
            boolean z2 = z;
            JSONArray jSONArray2 = new JSONArray();
            if (z) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    jSONArray.put(optJSONArray.getJSONObject(i2));
                }
            } else {
                for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i3);
                    if (m113554j(jSONObject2, jSONArray)) {
                        jSONArray2.put(jSONObject2);
                        z2 = true;
                    }
                }
                jSONObject.put("childviews", jSONArray2);
            }
            return z2;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th) {
            TD0.m84205b(th, C31938Bk1.class);
            return false;
        }
    }

    /* renamed from: k */
    public static boolean m113553k(String str, String str2) {
        if (TD0.m84203d(C31938Bk1.class)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th) {
            TD0.m84205b(th, C31938Bk1.class);
            return false;
        }
    }

    /* renamed from: l */
    public static boolean m113552l(String str, String str2, String str3, String str4) {
        if (TD0.m84203d(C31938Bk1.class)) {
            return false;
        }
        try {
            return m113553k(f2800d.optJSONObject("rulesForLanguage").optJSONObject(f2797a.get(str)).optJSONObject("rulesForEvent").optJSONObject(f2798b.get(str2)).optJSONObject("positiveRules").optString(f2799c.get(str3)), str4);
        } catch (Throwable th) {
            TD0.m84205b(th, C31938Bk1.class);
            return false;
        }
    }

    /* renamed from: m */
    public static void m113551m(float[] fArr, float[] fArr2) {
        if (TD0.m84203d(C31938Bk1.class)) {
            return;
        }
        for (int i = 0; i < fArr.length; i++) {
            try {
                fArr[i] = fArr[i] + fArr2[i];
            } catch (Throwable th) {
                TD0.m84205b(th, C31938Bk1.class);
                return;
            }
        }
    }

    /* renamed from: n */
    public static void m113550n(JSONObject jSONObject, StringBuilder sb, StringBuilder sb2) {
        if (TD0.m84203d(C31938Bk1.class)) {
            return;
        }
        try {
            String lowerCase = jSONObject.optString(Entry.TYPE_TEXT, "").toLowerCase();
            String lowerCase2 = jSONObject.optString("hint", "").toLowerCase();
            if (!lowerCase.isEmpty()) {
                sb.append(lowerCase);
                sb.append(" ");
            }
            if (!lowerCase2.isEmpty()) {
                sb2.append(lowerCase2);
                sb2.append(" ");
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            if (optJSONArray == null) {
                return;
            }
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    m113550n(optJSONArray.getJSONObject(i), sb, sb2);
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th) {
            TD0.m84205b(th, C31938Bk1.class);
        }
    }
}
