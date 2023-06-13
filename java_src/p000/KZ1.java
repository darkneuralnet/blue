package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import com.facebook.C17216a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: KZ1 */
/* loaded from: classes5.dex */
public class KZ1 {

    /* renamed from: a */
    public static final HashMap<String, Method> f19863a = new HashMap<>();

    /* renamed from: b */
    public static final HashMap<String, Class<?>> f19864b = new HashMap<>();

    /* renamed from: c */
    public static final String f19865c = C17216a.m52741e().getPackageName();

    /* renamed from: d */
    public static final SharedPreferences f19866d = C17216a.m52741e().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);

    /* renamed from: e */
    public static final SharedPreferences f19867e = C17216a.m52741e().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    /* renamed from: a */
    public static Object m98755a(Context context, IBinder iBinder) {
        if (TD0.m84203d(KZ1.class)) {
            return null;
        }
        try {
            return m98742n(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{iBinder});
        } catch (Throwable th) {
            TD0.m84205b(th, KZ1.class);
            return null;
        }
    }

    /* renamed from: b */
    public static void m98754b() {
        if (TD0.m84203d(KZ1.class)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = f19866d;
            long j = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
            if (j == 0) {
                sharedPreferences.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
            } else if (currentTimeMillis - j > 604800) {
                sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
            }
        } catch (Throwable th) {
            TD0.m84205b(th, KZ1.class);
        }
    }

    /* renamed from: c */
    public static ArrayList<String> m98753c(ArrayList<String> arrayList) {
        if (TD0.m84203d(KZ1.class)) {
            return null;
        }
        try {
            ArrayList<String> arrayList2 = new ArrayList<>();
            SharedPreferences.Editor edit = f19867e.edit();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                try {
                    JSONObject jSONObject = new JSONObject(next);
                    String string = jSONObject.getString("productId");
                    long j = jSONObject.getLong("purchaseTime");
                    String string2 = jSONObject.getString("purchaseToken");
                    if (currentTimeMillis - (j / 1000) <= 86400 && !f19867e.getString(string, "").equals(string2)) {
                        edit.putString(string, string2);
                        arrayList2.add(next);
                    }
                } catch (JSONException unused) {
                }
            }
            edit.apply();
            return arrayList2;
        } catch (Throwable th) {
            TD0.m84205b(th, KZ1.class);
            return null;
        }
    }

    /* renamed from: d */
    public static Class<?> m98752d(Context context, String str) {
        Class<?> loadClass;
        if (TD0.m84203d(KZ1.class)) {
            return null;
        }
        try {
            HashMap<String, Class<?>> hashMap = f19864b;
            Class<?> cls = hashMap.get(str);
            if (cls != null) {
                return cls;
            }
            try {
                loadClass = context.getClassLoader().loadClass(str);
                hashMap.put(str, loadClass);
                return loadClass;
            } catch (ClassNotFoundException unused) {
                return loadClass;
            }
        } catch (Throwable th) {
            TD0.m84205b(th, KZ1.class);
            return null;
        }
    }

    /* renamed from: e */
    public static Method m98751e(Class<?> cls, String str) {
        char c;
        Class<?>[] clsArr;
        Method declaredMethod;
        if (TD0.m84203d(KZ1.class)) {
            return null;
        }
        try {
            HashMap<String, Method> hashMap = f19863a;
            Method method = hashMap.get(str);
            if (method != null) {
                return method;
            }
            try {
                switch (str.hashCode()) {
                    case -1801122596:
                        if (str.equals("getPurchases")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1450694211:
                        if (str.equals("isBillingSupported")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1123215065:
                        if (str.equals("asInterface")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -594356707:
                        if (str.equals("getPurchaseHistory")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -573310373:
                        if (str.equals("getSkuDetails")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c == 0) {
                    clsArr = new Class[]{IBinder.class};
                } else if (c == 1) {
                    clsArr = new Class[]{Integer.TYPE, String.class, String.class, Bundle.class};
                } else if (c == 2) {
                    clsArr = new Class[]{Integer.TYPE, String.class, String.class};
                } else if (c != 3) {
                    clsArr = c != 4 ? null : new Class[]{Integer.TYPE, String.class, String.class, String.class, Bundle.class};
                } else {
                    clsArr = new Class[]{Integer.TYPE, String.class, String.class, String.class};
                }
                declaredMethod = cls.getDeclaredMethod(str, clsArr);
                hashMap.put(str, declaredMethod);
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                return declaredMethod;
            }
        } catch (Throwable th) {
            TD0.m84205b(th, KZ1.class);
            return null;
        }
    }

    /* renamed from: f */
    public static ArrayList<String> m98750f(Context context, Object obj, String str) {
        ArrayList<String> stringArrayList;
        if (TD0.m84203d(KZ1.class)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            if (m98741o(context, obj, str).booleanValue()) {
                char c = 0;
                String str2 = null;
                int i = 0;
                boolean z = false;
                while (true) {
                    Object[] objArr = new Object[5];
                    objArr[c] = 6;
                    objArr[1] = f19865c;
                    objArr[2] = str;
                    objArr[3] = str2;
                    objArr[4] = new Bundle();
                    Object m98742n = m98742n(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, objArr);
                    if (m98742n != null) {
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) m98742n;
                        if (bundle.getInt("RESPONSE_CODE") == 0 && (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) != null) {
                            Iterator<String> it = stringArrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                String next = it.next();
                                if (currentTimeMillis - (new JSONObject(next).getLong("purchaseTime") / 1000) > 1200) {
                                    z = true;
                                    break;
                                }
                                arrayList.add(next);
                                i++;
                            }
                            str2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                            if (i < 30 || str2 == null || z) {
                                break;
                                break;
                            }
                            c = 0;
                        }
                    }
                    str2 = null;
                    if (i < 30) {
                        break;
                    }
                    c = 0;
                }
            }
            return arrayList;
        } catch (Throwable th) {
            TD0.m84205b(th, KZ1.class);
            return null;
        }
    }

    /* renamed from: g */
    public static ArrayList<String> m98749g(Context context, Object obj) {
        if (TD0.m84203d(KZ1.class)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            if (obj == null) {
                return arrayList;
            }
            Class<?> m98752d = m98752d(context, "com.android.vending.billing.IInAppBillingService");
            if (m98752d == null) {
                return arrayList;
            }
            if (m98751e(m98752d, "getPurchaseHistory") == null) {
                return arrayList;
            }
            return m98753c(m98750f(context, obj, "inapp"));
        } catch (Throwable th) {
            TD0.m84205b(th, KZ1.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0065 A[EDGE_INSN: B:29:0x0065->B:23:0x0065 ?: BREAK  , SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList<String> m98748h(Context context, Object obj, String str) {
        if (TD0.m84203d(KZ1.class)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            if (obj == null) {
                return arrayList;
            }
            if (m98741o(context, obj, str).booleanValue()) {
                String str2 = null;
                int i = 0;
                do {
                    Object m98742n = m98742n(context, "com.android.vending.billing.IInAppBillingService", "getPurchases", obj, new Object[]{3, f19865c, str, str2});
                    if (m98742n != null) {
                        Bundle bundle = (Bundle) m98742n;
                        if (bundle.getInt("RESPONSE_CODE") == 0) {
                            ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                            if (stringArrayList == null) {
                                break;
                            }
                            i += stringArrayList.size();
                            arrayList.addAll(stringArrayList);
                            str2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                            if (i >= 30) {
                                break;
                            }
                        }
                    }
                    str2 = null;
                    if (i >= 30) {
                        break;
                        break;
                    }
                } while (str2 != null);
            }
            return arrayList;
        } catch (Throwable th) {
            TD0.m84205b(th, KZ1.class);
            return null;
        }
    }

    /* renamed from: i */
    public static ArrayList<String> m98747i(Context context, Object obj) {
        if (TD0.m84203d(KZ1.class)) {
            return null;
        }
        try {
            return m98753c(m98748h(context, obj, "inapp"));
        } catch (Throwable th) {
            TD0.m84205b(th, KZ1.class);
            return null;
        }
    }

    /* renamed from: j */
    public static ArrayList<String> m98746j(Context context, Object obj) {
        if (TD0.m84203d(KZ1.class)) {
            return null;
        }
        try {
            return m98753c(m98748h(context, obj, "subs"));
        } catch (Throwable th) {
            TD0.m84205b(th, KZ1.class);
            return null;
        }
    }

    /* renamed from: k */
    public static Map<String, String> m98745k(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        if (TD0.m84203d(KZ1.class)) {
            return null;
        }
        try {
            Map<String, String> m98740p = m98740p(arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (!m98740p.containsKey(next)) {
                    arrayList2.add(next);
                }
            }
            m98740p.putAll(m98744l(context, arrayList2, obj, z));
            return m98740p;
        } catch (Throwable th) {
            TD0.m84205b(th, KZ1.class);
            return null;
        }
    }

    /* renamed from: l */
    public static Map<String, String> m98744l(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        String str;
        if (TD0.m84203d(KZ1.class)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            if (obj != null && !arrayList.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
                Object[] objArr = new Object[4];
                objArr[0] = 3;
                objArr[1] = f19865c;
                if (z) {
                    str = "subs";
                } else {
                    str = "inapp";
                }
                objArr[2] = str;
                objArr[3] = bundle;
                Object m98742n = m98742n(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, objArr);
                if (m98742n != null) {
                    Bundle bundle2 = (Bundle) m98742n;
                    if (bundle2.getInt("RESPONSE_CODE") == 0) {
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList != null && arrayList.size() == stringArrayList.size()) {
                            for (int i = 0; i < arrayList.size(); i++) {
                                hashMap.put(arrayList.get(i), stringArrayList.get(i));
                            }
                        }
                        m98739q(hashMap);
                    }
                }
            }
            return hashMap;
        } catch (Throwable th) {
            TD0.m84205b(th, KZ1.class);
            return null;
        }
    }

    /* renamed from: m */
    public static boolean m98743m(String str) {
        if (TD0.m84203d(KZ1.class)) {
            return false;
        }
        try {
            String optString = new JSONObject(str).optString("freeTrialPeriod");
            if (optString == null) {
                return false;
            }
            if (optString.isEmpty()) {
                return false;
            }
            return true;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th) {
            TD0.m84205b(th, KZ1.class);
            return false;
        }
    }

    /* renamed from: n */
    public static Object m98742n(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method m98751e;
        if (TD0.m84203d(KZ1.class)) {
            return null;
        }
        try {
            Class<?> m98752d = m98752d(context, str);
            if (m98752d == null || (m98751e = m98751e(m98752d, str2)) == null) {
                return null;
            }
            if (obj != null) {
                obj = m98752d.cast(obj);
            }
            try {
                return m98751e.invoke(obj, objArr);
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        } catch (Throwable th) {
            TD0.m84205b(th, KZ1.class);
            return null;
        }
    }

    /* renamed from: o */
    public static Boolean m98741o(Context context, Object obj, String str) {
        if (TD0.m84203d(KZ1.class)) {
            return null;
        }
        try {
            if (obj == null) {
                return Boolean.FALSE;
            }
            boolean z = false;
            Object m98742n = m98742n(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, f19865c, str});
            if (m98742n != null && ((Integer) m98742n).intValue() == 0) {
                z = true;
            }
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            TD0.m84205b(th, KZ1.class);
            return null;
        }
    }

    /* renamed from: p */
    public static Map<String, String> m98740p(ArrayList<String> arrayList) {
        if (TD0.m84203d(KZ1.class)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                String string = f19866d.getString(next, null);
                if (string != null) {
                    String[] split = string.split(";", 2);
                    if (currentTimeMillis - Long.parseLong(split[0]) < 43200) {
                        hashMap.put(next, split[1]);
                    }
                }
            }
            return hashMap;
        } catch (Throwable th) {
            TD0.m84205b(th, KZ1.class);
            return null;
        }
    }

    /* renamed from: q */
    public static void m98739q(Map<String, String> map) {
        if (TD0.m84203d(KZ1.class)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor edit = f19866d.edit();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                edit.putString(entry.getKey(), currentTimeMillis + ";" + entry.getValue());
            }
            edit.apply();
        } catch (Throwable th) {
            TD0.m84205b(th, KZ1.class);
        }
    }
}
