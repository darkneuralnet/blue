package p000;

import android.os.Bundle;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0007R$\u0010\f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b¨\u0006\u0010"}, m28432d2 = {"Lc70;", "", "Landroid/os/Bundle;", "bundle", "Lorg/json/JSONObject;", "b", "jsonObject", C17296a.f69688o, "", "Ljava/lang/Class;", "Lc70$h;", "Ljava/util/Map;", "SETTERS", "<init>", "()V", "h", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: c70  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38953c70 {

    /* renamed from: a */
    public static final Map<Class<?>, InterfaceC13408h> f60132a;

    /* renamed from: b */
    public static final C38953c70 f60133b = new C38953c70();

    @Metadata(m28433d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\r"}, m28432d2 = {"c70$a", "Lc70$h;", "Landroid/os/Bundle;", "bundle", "", "key", "", "value", "", "b", "Lorg/json/JSONObject;", "json", C17296a.f69688o, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: c70$a */
    /* loaded from: classes5.dex */
    public static final class C13401a implements InterfaceC13408h {
        @Override // p000.C38953c70.InterfaceC13408h
        /* renamed from: a */
        public void mo61924a(JSONObject json, String key, Object value) throws JSONException {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            json.put(key, value);
        }

        @Override // p000.C38953c70.InterfaceC13408h
        /* renamed from: b */
        public void mo61923b(Bundle bundle, String key, Object value) throws JSONException {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putBoolean(key, ((Boolean) value).booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\r"}, m28432d2 = {"c70$b", "Lc70$h;", "Landroid/os/Bundle;", "bundle", "", "key", "", "value", "", "b", "Lorg/json/JSONObject;", "json", C17296a.f69688o, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: c70$b */
    /* loaded from: classes5.dex */
    public static final class C13402b implements InterfaceC13408h {
        @Override // p000.C38953c70.InterfaceC13408h
        /* renamed from: a */
        public void mo61924a(JSONObject json, String key, Object value) throws JSONException {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            json.put(key, value);
        }

        @Override // p000.C38953c70.InterfaceC13408h
        /* renamed from: b */
        public void mo61923b(Bundle bundle, String key, Object value) throws JSONException {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putInt(key, ((Integer) value).intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\r"}, m28432d2 = {"c70$c", "Lc70$h;", "Landroid/os/Bundle;", "bundle", "", "key", "", "value", "", "b", "Lorg/json/JSONObject;", "json", C17296a.f69688o, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: c70$c */
    /* loaded from: classes5.dex */
    public static final class C13403c implements InterfaceC13408h {
        @Override // p000.C38953c70.InterfaceC13408h
        /* renamed from: a */
        public void mo61924a(JSONObject json, String key, Object value) throws JSONException {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            json.put(key, value);
        }

        @Override // p000.C38953c70.InterfaceC13408h
        /* renamed from: b */
        public void mo61923b(Bundle bundle, String key, Object value) throws JSONException {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putLong(key, ((Long) value).longValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\r"}, m28432d2 = {"c70$d", "Lc70$h;", "Landroid/os/Bundle;", "bundle", "", "key", "", "value", "", "b", "Lorg/json/JSONObject;", "json", C17296a.f69688o, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: c70$d */
    /* loaded from: classes5.dex */
    public static final class C13404d implements InterfaceC13408h {
        @Override // p000.C38953c70.InterfaceC13408h
        /* renamed from: a */
        public void mo61924a(JSONObject json, String key, Object value) throws JSONException {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            json.put(key, value);
        }

        @Override // p000.C38953c70.InterfaceC13408h
        /* renamed from: b */
        public void mo61923b(Bundle bundle, String key, Object value) throws JSONException {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putDouble(key, ((Double) value).doubleValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\r"}, m28432d2 = {"c70$e", "Lc70$h;", "Landroid/os/Bundle;", "bundle", "", "key", "", "value", "", "b", "Lorg/json/JSONObject;", "json", C17296a.f69688o, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: c70$e */
    /* loaded from: classes5.dex */
    public static final class C13405e implements InterfaceC13408h {
        @Override // p000.C38953c70.InterfaceC13408h
        /* renamed from: a */
        public void mo61924a(JSONObject json, String key, Object value) throws JSONException {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            json.put(key, value);
        }

        @Override // p000.C38953c70.InterfaceC13408h
        /* renamed from: b */
        public void mo61923b(Bundle bundle, String key, Object value) throws JSONException {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putString(key, (String) value);
        }
    }

    @Metadata(m28433d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\r"}, m28432d2 = {"c70$f", "Lc70$h;", "Landroid/os/Bundle;", "bundle", "", "key", "", "value", "", "b", "Lorg/json/JSONObject;", "json", C17296a.f69688o, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: c70$f */
    /* loaded from: classes5.dex */
    public static final class C13406f implements InterfaceC13408h {
        @Override // p000.C38953c70.InterfaceC13408h
        /* renamed from: a */
        public void mo61924a(JSONObject json, String key, Object value) throws JSONException {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONArray jSONArray = new JSONArray();
            for (String str : (String[]) value) {
                jSONArray.put(str);
            }
            json.put(key, jSONArray);
        }

        @Override // p000.C38953c70.InterfaceC13408h
        /* renamed from: b */
        public void mo61923b(Bundle bundle, String key, Object value) throws JSONException {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            throw new IllegalArgumentException("Unexpected type from JSON");
        }
    }

    @Metadata(m28433d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\r"}, m28432d2 = {"c70$g", "Lc70$h;", "Landroid/os/Bundle;", "bundle", "", "key", "", "value", "", "b", "Lorg/json/JSONObject;", "json", C17296a.f69688o, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: c70$g */
    /* loaded from: classes5.dex */
    public static final class C13407g implements InterfaceC13408h {
        @Override // p000.C38953c70.InterfaceC13408h
        /* renamed from: a */
        public void mo61924a(JSONObject json, String key, Object value) throws JSONException {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.C38953c70.InterfaceC13408h
        /* renamed from: b */
        public void mo61923b(Bundle bundle, String key, Object value) throws JSONException {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONArray jSONArray = (JSONArray) value;
            ArrayList arrayList = new ArrayList();
            if (jSONArray.length() == 0) {
                bundle.putStringArrayList(key, arrayList);
                return;
            }
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof String) {
                    arrayList.add(obj);
                } else {
                    throw new IllegalArgumentException("Unexpected type in an array: " + obj.getClass());
                }
            }
            bundle.putStringArrayList(key, arrayList);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0001H&J \u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0001H&¨\u0006\f"}, m28432d2 = {"Lc70$h;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "", "b", "Lorg/json/JSONObject;", "json", C17296a.f69688o, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: c70$h */
    /* loaded from: classes5.dex */
    public interface InterfaceC13408h {
        /* renamed from: a */
        void mo61924a(JSONObject jSONObject, String str, Object obj) throws JSONException;

        /* renamed from: b */
        void mo61923b(Bundle bundle, String str, Object obj) throws JSONException;
    }

    static {
        HashMap hashMap = new HashMap();
        f60132a = hashMap;
        hashMap.put(Boolean.class, new C13401a());
        hashMap.put(Integer.class, new C13402b());
        hashMap.put(Long.class, new C13403c());
        hashMap.put(Double.class, new C13404d());
        hashMap.put(String.class, new C13405e());
        hashMap.put(String[].class, new C13406f());
        hashMap.put(JSONArray.class, new C13407g());
    }

    private C38953c70() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final Bundle m61926a(JSONObject jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Bundle bundle = new Bundle();
        Iterator<String> keys = jsonObject.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            Object value = jsonObject.get(key);
            if (value != JSONObject.NULL) {
                if (value instanceof JSONObject) {
                    bundle.putBundle(key, m61926a((JSONObject) value));
                } else {
                    InterfaceC13408h interfaceC13408h = f60132a.get(value.getClass());
                    if (interfaceC13408h != null) {
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        Intrinsics.checkNotNullExpressionValue(value, "value");
                        interfaceC13408h.mo61923b(bundle, key, value);
                    } else {
                        throw new IllegalArgumentException("Unsupported type: " + value.getClass());
                    }
                }
            }
        }
        return bundle;
    }

    @JvmStatic
    /* renamed from: b */
    public static final JSONObject m61925b(Bundle bundle) throws JSONException {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        JSONObject jSONObject = new JSONObject();
        for (String key : bundle.keySet()) {
            Object obj = bundle.get(key);
            if (obj != null) {
                Intrinsics.checkNotNullExpressionValue(obj, "bundle[key] ?: // Null i…orted.\n          continue");
                if (obj instanceof List) {
                    JSONArray jSONArray = new JSONArray();
                    for (String str : (List) obj) {
                        jSONArray.put(str);
                    }
                    jSONObject.put(key, jSONArray);
                } else if (obj instanceof Bundle) {
                    jSONObject.put(key, m61925b((Bundle) obj));
                } else {
                    InterfaceC13408h interfaceC13408h = f60132a.get(obj.getClass());
                    if (interfaceC13408h != null) {
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        interfaceC13408h.mo61924a(jSONObject, key, obj);
                    } else {
                        throw new IllegalArgumentException("Unsupported type: " + obj.getClass());
                    }
                }
            }
        }
        return jSONObject;
    }
}
