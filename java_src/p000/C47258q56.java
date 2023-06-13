package p000;

import android.text.TextUtils;
import android.util.Base64;
import com.amazonaws.services.p026s3.internal.Constants;
import com.google.android.gms.common.internal.Preconditions;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: q56  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C47258q56 {
    /* renamed from: a */
    public static Map<String, Object> m18194a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject == JSONObject.NULL) {
                return null;
            }
            return m18191d(jSONObject);
        } catch (Exception e) {
            C33460Hx2 m103196f = C33460Hx2.m103196f();
            m103196f.m103200b("Failed to parse JSONObject into Map:\n" + e);
            return Collections.emptyMap();
        }
    }

    /* renamed from: b */
    public static Map<String, Object> m18193b(String str) {
        Preconditions.checkNotEmpty(str);
        String[] split = str.split("\\.", -1);
        if (split.length < 2) {
            C33460Hx2 m103196f = C33460Hx2.m103196f();
            m103196f.m103198d("Invalid token (too few subsections):\n" + str);
            return Collections.emptyMap();
        }
        try {
            Map<String, Object> m18194a = m18194a(new String(Base64.decode(split[1], 11), Constants.DEFAULT_ENCODING));
            if (m18194a == null) {
                return Collections.emptyMap();
            }
            return m18194a;
        } catch (UnsupportedEncodingException e) {
            C33460Hx2 m103196f2 = C33460Hx2.m103196f();
            m103196f2.m103198d("Unable to decode token (charset unknown):\n" + e);
            return Collections.emptyMap();
        }
    }

    /* renamed from: c */
    public static List<Object> m18192c(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = m18192c((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m18191d((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* renamed from: d */
    public static Map<String, Object> m18191d(JSONObject jSONObject) throws JSONException {
        C28385so c28385so = new C28385so();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = m18192c((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m18191d((JSONObject) obj);
            } else if (obj.equals(JSONObject.NULL)) {
                obj = null;
            }
            c28385so.put(next, obj);
        }
        return c28385so;
    }
}
