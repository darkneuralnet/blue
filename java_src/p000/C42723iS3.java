package p000;

import android.os.Bundle;
import com.google.firebase.remoteconfig.internal.C18378b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* renamed from: iS3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C42723iS3 {

    /* renamed from: a */
    public final X94<InterfaceC12447ba> f87342a;

    /* renamed from: b */
    public final Map<String, String> f87343b = Collections.synchronizedMap(new HashMap());

    public C42723iS3(X94<InterfaceC12447ba> x94) {
        this.f87342a = x94;
    }

    /* renamed from: a */
    public void m33907a(String str, C18378b c18378b) {
        JSONObject optJSONObject;
        InterfaceC12447ba interfaceC12447ba = this.f87342a.get();
        if (interfaceC12447ba == null) {
            return;
        }
        JSONObject m46992h = c18378b.m46992h();
        if (m46992h.length() < 1) {
            return;
        }
        JSONObject m46994f = c18378b.m46994f();
        if (m46994f.length() < 1 || (optJSONObject = m46992h.optJSONObject(str)) == null) {
            return;
        }
        String optString = optJSONObject.optString("choiceId");
        if (optString.isEmpty()) {
            return;
        }
        synchronized (this.f87343b) {
            if (optString.equals(this.f87343b.get(str))) {
                return;
            }
            this.f87343b.put(str, optString);
            Bundle bundle = new Bundle();
            bundle.putString("arm_key", str);
            bundle.putString("arm_value", m46994f.optString(str));
            bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
            bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
            bundle.putString("group", optJSONObject.optString("group"));
            interfaceC12447ba.mo61209a("fp", "personalization_assignment", bundle);
            Bundle bundle2 = new Bundle();
            bundle2.putString("_fpid", optString);
            interfaceC12447ba.mo61209a("fp", "_fpc", bundle2);
        }
    }
}
