package p000;

import com.android.volley.ParseError;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;
import p000.EM4;
/* renamed from: Ui2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C36367Ui2 extends AbstractC42291hj2<JSONObject> {
    public C36367Ui2(String str, EM4.InterfaceC1800b<JSONObject> interfaceC1800b, EM4.InterfaceC1799a interfaceC1799a) {
        super(0, str, null, interfaceC1800b, interfaceC1799a);
    }

    @Override // p000.AbstractC42291hj2, p000.AbstractC45006mI4
    public EM4<JSONObject> parseNetworkResponse(O73 o73) {
        try {
            return EM4.m109111c(new JSONObject(new String(o73.f25919b, EN1.m109100f(o73.f25920c, "utf-8"))), EN1.m109101e(o73));
        } catch (UnsupportedEncodingException e) {
            return EM4.m109113a(new ParseError(e));
        } catch (JSONException e2) {
            return EM4.m109113a(new ParseError(e2));
        }
    }

    @Deprecated
    public C36367Ui2(String str, JSONObject jSONObject, EM4.InterfaceC1800b<JSONObject> interfaceC1800b, EM4.InterfaceC1799a interfaceC1799a) {
        super(jSONObject == null ? 0 : 1, str, jSONObject != null ? jSONObject.toString() : null, interfaceC1800b, interfaceC1799a);
    }

    public C36367Ui2(int i, String str, JSONObject jSONObject, EM4.InterfaceC1800b<JSONObject> interfaceC1800b, EM4.InterfaceC1799a interfaceC1799a) {
        super(i, str, jSONObject != null ? jSONObject.toString() : null, interfaceC1800b, interfaceC1799a);
    }
}
