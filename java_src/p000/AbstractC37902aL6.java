package p000;

import android.content.Context;
import android.support.annotation.NonNull;
import java.io.File;
import org.json.JSONObject;
/* renamed from: aL6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC37902aL6 {
    /* renamed from: a */
    public static JSONObject m71614a(String str, Context context) {
        KJ6.m99012a(AbstractC37902aL6.class, 0, "entering getCachedConfig");
        JSONObject jSONObject = null;
        try {
            String m71610e = m71610e(context, str);
            if (m71610e.isEmpty()) {
                KJ6.m99012a(AbstractC37902aL6.class, 0, "leaving getCachedConfig,cached config loaded empty");
            } else {
                KJ6.m99012a(AbstractC37902aL6.class, 0, "leaving getCachedConfig,cached config loadsuccessfully");
                jSONObject = new JSONObject(m71610e);
            }
        } catch (Exception e) {
            KJ6.m99011b(AbstractC37902aL6.class, 3, e);
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static void m71613b(Context context, String str, String str2) {
        KJ6.m99012a(AbstractC37902aL6.class, 0, "entering saveConfigData");
        File filesDir = context.getFilesDir();
        File file = new File(filesDir, str2 + "_DATA");
        File filesDir2 = context.getFilesDir();
        File file2 = new File(filesDir2, str2 + "_TIME");
        C44451lM6.m27389b(file, str);
        C44451lM6.m27389b(file2, String.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: c */
    public static boolean m71612c(Context context, String str) {
        KJ6.m99012a(AbstractC37902aL6.class, 0, "entering deleteCachedConfigDataFromDisk");
        File filesDir = context.getFilesDir();
        File file = new File(filesDir, str + "_DATA");
        File filesDir2 = context.getFilesDir();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_TIME");
        return C44451lM6.m27386e(file) && C44451lM6.m27386e(new File(filesDir2, sb.toString()));
    }

    /* renamed from: d */
    public static boolean m71611d(@NonNull JSONObject jSONObject, long j, VL6 vl6) {
        return System.currentTimeMillis() > j + (jSONObject.optLong(vl6 == VL6.RAMP ? EnumC39708dM6.CONF_REFRESH_TIME_KEY.toString() : vl6 == VL6.REMOTE ? EnumC40300eM6.CONF_REFRESH_TIME_KEY.toString() : "", 0L) * 1000);
    }

    /* renamed from: e */
    public static String m71610e(Context context, String str) {
        KJ6.m99012a(AbstractC37902aL6.class, 0, "Loading loadCachedConfigData");
        File filesDir = context.getFilesDir();
        return C44451lM6.m27390a(new File(filesDir, str + "_DATA"));
    }

    /* renamed from: f */
    public String m71609f(Context context, String str) {
        KJ6.m99012a(getClass(), 0, "Loading loadCachedConfigTime");
        File filesDir = context.getFilesDir();
        return C44451lM6.m27390a(new File(filesDir, str + "_TIME"));
    }
}
