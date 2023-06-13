package p000;

import ch.qos.logback.core.joran.action.Action;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: lv0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C44781lv0 {
    /* renamed from: a */
    public final void m26688a(C49940ud3 c49940ud3, String str, JSONObject jSONObject) throws JSONException {
        c49940ud3.m9938r(str, new C34835Nu0(str, jSONObject.getString("url"), jSONObject.getString("certificate")));
    }

    /* renamed from: b */
    public final C5534NG m26687b(JSONObject jSONObject) throws JSONException {
        C5534NG c5534ng = new C5534NG();
        m26683f(c5534ng, jSONObject);
        return c5534ng;
    }

    /* renamed from: c */
    public final C32855Fi0 m26686c(JSONObject jSONObject) throws JSONException {
        C32855Fi0 c32855Fi0 = new C32855Fi0();
        m26683f(c32855Fi0, jSONObject);
        return c32855Fi0;
    }

    /* renamed from: d */
    public final C49940ud3 m26685d(JSONObject jSONObject) throws JSONException {
        C49940ud3 c49940ud3 = new C49940ud3();
        m26683f(c49940ud3, jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray(Action.SCOPE_ATTRIBUTE);
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            if ("*".equals(string)) {
                c49940ud3.m9940p();
            } else {
                c49940ud3.m9939q(string);
            }
        }
        if (jSONObject.has("endpoints")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("endpoints");
            if (jSONObject2.has("live")) {
                m26688a(c49940ud3, "live", jSONObject2.getJSONObject("live"));
            }
            if (jSONObject2.has("develop")) {
                m26688a(c49940ud3, "develop", jSONObject2.getJSONObject("develop"));
            }
            if (jSONObject2.has("mock")) {
                m26688a(c49940ud3, "mock", jSONObject2.getJSONObject("mock"));
            }
        }
        return c49940ud3;
    }

    /* renamed from: e */
    public C36044Sy3 m26684e(JSONObject jSONObject) throws JSONException {
        C36044Sy3 c36044Sy3 = new C36044Sy3();
        c36044Sy3.m84532a(jSONObject.getString("file_timestamp"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("1.0");
        JSONArray jSONArray = jSONObject2.getJSONArray("oauth2_recipes_in_decreasing_priority_order");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(i);
            if (jSONObject3 != null) {
                c36044Sy3.m84525h(m26685d(jSONObject3));
            }
        }
        JSONArray jSONArray2 = jSONObject2.getJSONArray("checkout_recipes_in_decreasing_priority_order");
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            JSONObject jSONObject4 = jSONArray2.getJSONObject(i2);
            if (jSONObject4 != null) {
                c36044Sy3.m84526g(m26686c(jSONObject4));
            }
        }
        JSONArray jSONArray3 = jSONObject2.getJSONArray("billing_agreement_recipes_in_decreasing_priority_order");
        for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
            JSONObject jSONObject5 = jSONArray3.getJSONObject(i3);
            if (jSONObject5 != null) {
                c36044Sy3.m84527f(m26687b(jSONObject5));
            }
        }
        return c36044Sy3;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ms4] */
    /* renamed from: f */
    public final void m26683f(AbstractC45348ms4<?> abstractC45348ms4, JSONObject jSONObject) throws JSONException {
        abstractC45348ms4.m24824l(EnumC43236jJ4.valueOf(jSONObject.getString("target"))).m24826j(jSONObject.getString("protocol"));
        if (jSONObject.has("intent_action")) {
            abstractC45348ms4.m24823m(jSONObject.getString("intent_action"));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("packages");
        for (int i = 0; i < jSONArray.length(); i++) {
            abstractC45348ms4.m24822n(jSONArray.getString(i));
        }
        if (jSONObject.has("supported_locales")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("supported_locales");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                abstractC45348ms4.m24825k(jSONArray2.getString(i2));
            }
        }
    }
}
