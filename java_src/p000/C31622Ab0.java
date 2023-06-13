package p000;

import com.facebook.share.model.CameraEffectArguments;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: Ab0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C31622Ab0 {

    /* renamed from: a */
    public static final Map<Class<?>, InterfaceC0162d> f828a;

    /* renamed from: Ab0$a */
    /* loaded from: classes5.dex */
    public static class C0159a implements InterfaceC0162d {
        @Override // p000.C31622Ab0.InterfaceC0162d
        /* renamed from: a */
        public void mo115495a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            jSONObject.put(str, obj);
        }
    }

    /* renamed from: Ab0$b */
    /* loaded from: classes5.dex */
    public static class C0160b implements InterfaceC0162d {
        @Override // p000.C31622Ab0.InterfaceC0162d
        /* renamed from: a */
        public void mo115495a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : (String[]) obj) {
                jSONArray.put(str2);
            }
            jSONObject.put(str, jSONArray);
        }
    }

    /* renamed from: Ab0$c */
    /* loaded from: classes5.dex */
    public static class C0161c implements InterfaceC0162d {
        @Override // p000.C31622Ab0.InterfaceC0162d
        /* renamed from: a */
        public void mo115495a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
        }
    }

    /* renamed from: Ab0$d */
    /* loaded from: classes5.dex */
    public interface InterfaceC0162d {
        /* renamed from: a */
        void mo115495a(JSONObject jSONObject, String str, Object obj) throws JSONException;
    }

    static {
        HashMap hashMap = new HashMap();
        f828a = hashMap;
        hashMap.put(String.class, new C0159a());
        hashMap.put(String[].class, new C0160b());
        hashMap.put(JSONArray.class, new C0161c());
    }

    /* renamed from: a */
    public static JSONObject m115496a(CameraEffectArguments cameraEffectArguments) throws JSONException {
        if (cameraEffectArguments == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : cameraEffectArguments.m52295c()) {
            Object m52296b = cameraEffectArguments.m52296b(str);
            if (m52296b != null) {
                InterfaceC0162d interfaceC0162d = f828a.get(m52296b.getClass());
                if (interfaceC0162d != null) {
                    interfaceC0162d.mo115495a(jSONObject, str, m52296b);
                } else {
                    throw new IllegalArgumentException("Unsupported type: " + m52296b.getClass());
                }
            }
        }
        return jSONObject;
    }
}
