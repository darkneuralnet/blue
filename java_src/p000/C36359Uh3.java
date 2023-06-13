package p000;

import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.SharePhoto;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: Uh3  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36359Uh3 {

    /* renamed from: Uh3$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC8350a {
        /* renamed from: a */
        JSONObject mo81137a(SharePhoto sharePhoto);
    }

    private C36359Uh3() {
    }

    /* renamed from: a */
    public static JSONArray m81141a(List list, InterfaceC8350a interfaceC8350a) throws JSONException {
        if (TD0.m84203d(C36359Uh3.class)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (Object obj : list) {
                jSONArray.put(m81138d(obj, interfaceC8350a));
            }
            return jSONArray;
        } catch (Throwable th) {
            TD0.m84205b(th, C36359Uh3.class);
            return null;
        }
    }

    /* renamed from: b */
    public static JSONObject m81140b(ShareOpenGraphAction shareOpenGraphAction, InterfaceC8350a interfaceC8350a) throws JSONException {
        if (TD0.m84203d(C36359Uh3.class)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : shareOpenGraphAction.m52183d()) {
                jSONObject.put(str, m81138d(shareOpenGraphAction.m52186a(str), interfaceC8350a));
            }
            return jSONObject;
        } catch (Throwable th) {
            TD0.m84205b(th, C36359Uh3.class);
            return null;
        }
    }

    /* renamed from: c */
    public static JSONObject m81139c(ShareOpenGraphObject shareOpenGraphObject, InterfaceC8350a interfaceC8350a) throws JSONException {
        if (TD0.m84203d(C36359Uh3.class)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : shareOpenGraphObject.m52183d()) {
                jSONObject.put(str, m81138d(shareOpenGraphObject.m52186a(str), interfaceC8350a));
            }
            return jSONObject;
        } catch (Throwable th) {
            TD0.m84205b(th, C36359Uh3.class);
            return null;
        }
    }

    /* renamed from: d */
    public static Object m81138d(Object obj, InterfaceC8350a interfaceC8350a) throws JSONException {
        if (TD0.m84203d(C36359Uh3.class)) {
            return null;
        }
        try {
            if (obj == null) {
                return JSONObject.NULL;
            }
            if (!(obj instanceof String) && !(obj instanceof Boolean) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Long)) {
                if (obj instanceof SharePhoto) {
                    if (interfaceC8350a == null) {
                        return null;
                    }
                    return interfaceC8350a.mo81137a((SharePhoto) obj);
                } else if (obj instanceof ShareOpenGraphObject) {
                    return m81139c((ShareOpenGraphObject) obj, interfaceC8350a);
                } else {
                    if (obj instanceof List) {
                        return m81141a((List) obj, interfaceC8350a);
                    }
                    throw new IllegalArgumentException("Invalid object found for JSON serialization: " + obj.toString());
                }
            }
            return obj;
        } catch (Throwable th) {
            TD0.m84205b(th, C36359Uh3.class);
            return null;
        }
    }
}
