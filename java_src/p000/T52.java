package p000;

import com.facebook.C17216a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONObject;
import p000.C37988aV2;
/* renamed from: T52 */
/* loaded from: classes5.dex */
public final class T52 {

    /* renamed from: a */
    public static boolean f34738a = false;

    /* renamed from: b */
    public static boolean f34739b = false;

    /* renamed from: a */
    public static void m84361a() {
        if (TD0.m84203d(T52.class)) {
            return;
        }
        try {
            f34738a = true;
            f34739b = C34278Lk1.m96391f("FBSDKFeatureIntegritySample", C17216a.m52740f(), false);
        } catch (Throwable th) {
            TD0.m84205b(th, T52.class);
        }
    }

    /* renamed from: b */
    public static String m84360b(String str) {
        if (TD0.m84203d(T52.class)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            Arrays.fill(fArr, 0.0f);
            String[] m71299o = C37988aV2.m71299o(C37988aV2.EnumC10718a.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{str});
            if (m71299o == null) {
                return "none";
            }
            return m71299o[0];
        } catch (Throwable th) {
            TD0.m84205b(th, T52.class);
            return null;
        }
    }

    /* renamed from: c */
    public static void m84359c(Map<String, String> map) {
        if (TD0.m84203d(T52.class)) {
            return;
        }
        try {
            if (f34738a && map.size() != 0) {
                try {
                    ArrayList<String> arrayList = new ArrayList(map.keySet());
                    JSONObject jSONObject = new JSONObject();
                    for (String str : arrayList) {
                        String str2 = map.get(str);
                        if (m84358d(str) || m84358d(str2)) {
                            map.remove(str);
                            if (!f34739b) {
                                str2 = "";
                            }
                            jSONObject.put(str, str2);
                        }
                    }
                    if (jSONObject.length() != 0) {
                        map.put("_onDeviceParams", jSONObject.toString());
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th) {
            TD0.m84205b(th, T52.class);
        }
    }

    /* renamed from: d */
    public static boolean m84358d(String str) {
        if (TD0.m84203d(T52.class)) {
            return false;
        }
        try {
            return !"none".equals(m84360b(str));
        } catch (Throwable th) {
            TD0.m84205b(th, T52.class);
            return false;
        }
    }
}
