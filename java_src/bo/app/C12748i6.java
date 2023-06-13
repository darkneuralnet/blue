package bo.app;

import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: bo.app.i6 */
/* loaded from: classes.dex */
public final class C12748i6 {

    /* renamed from: a */
    private static final String f58646a = C43664k20.m29433n(C12748i6.class);

    /* renamed from: a */
    public static InterfaceC50985wO1 m63585a(JSONObject jSONObject, InterfaceC13231y1 interfaceC13231y1) {
        try {
            if (jSONObject == null) {
                C43664k20.m29438i(f58646a, "Templated message Json was null. Not de-serializing templated message.");
                return null;
            }
            String string = jSONObject.getString("type");
            if (string.equals("inapp")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(MessageExtension.FIELD_DATA);
                if (jSONObject2 == null) {
                    return null;
                }
                return C12547b3.m63893a(jSONObject2, interfaceC13231y1);
            }
            String str = f58646a;
            C43664k20.m29421z(str, "Received templated message Json with unknown type: " + string + ". Not parsing.");
            return null;
        } catch (JSONException e) {
            String str2 = f58646a;
            C43664k20.m29450A(str2, "Encountered JSONException processing templated message: " + jSONObject, e);
            return null;
        } catch (Exception e2) {
            String str3 = f58646a;
            C43664k20.m29450A(str3, "Encountered general exception processing templated message: " + jSONObject, e2);
            return null;
        }
    }

    /* renamed from: b */
    public static InterfaceC13232y2 m63584b(JSONObject jSONObject, InterfaceC13231y1 interfaceC13231y1) {
        String string;
        try {
            string = jSONObject.getString("type");
        } catch (JSONException e) {
            String str = f58646a;
            C43664k20.m29450A(str, "Encountered JSONException processing triggered action Json: " + jSONObject, e);
        } catch (Exception e2) {
            String str2 = f58646a;
            C43664k20.m29450A(str2, "Failed to deserialize triggered action Json: " + jSONObject, e2);
        }
        if (string.equals("inapp")) {
            return new C12600e3(jSONObject, interfaceC13231y1);
        }
        if (string.equals("templated_iam")) {
            return new C13117s5(jSONObject, interfaceC13231y1);
        }
        String str3 = f58646a;
        C43664k20.m29431p(str3, "Received unknown trigger type: " + string);
        return null;
    }

    /* renamed from: a */
    public static List<InterfaceC13232y2> m63586a(JSONArray jSONArray, InterfaceC13231y1 interfaceC13231y1) {
        try {
            if (jSONArray == null) {
                C43664k20.m29438i(f58646a, "Triggered actions Json array was null. Not de-serializing triggered actions.");
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                InterfaceC13232y2 m63584b = m63584b(jSONArray.getJSONObject(i), interfaceC13231y1);
                if (m63584b != null) {
                    arrayList.add(m63584b);
                }
            }
            return arrayList;
        } catch (JSONException e) {
            String str = f58646a;
            C43664k20.m29450A(str, "Encountered JSONException processing triggered actions Json array: " + jSONArray, e);
            return null;
        } catch (Exception e2) {
            String str2 = f58646a;
            C43664k20.m29450A(str2, "Failed to deserialize triggered actions Json array: " + jSONArray, e2);
            return null;
        }
    }

    /* renamed from: a */
    public static List<InterfaceC13112s2> m63587a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                C43664k20.m29421z(f58646a, "Received null or blank trigger condition Json. Not parsing.");
            } else {
                String string = optJSONObject.getString("type");
                string.hashCode();
                char c = 65535;
                switch (string.hashCode()) {
                    case -1679221933:
                        if (string.equals("purchase_property")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3417674:
                        if (string.equals("open")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3556498:
                        if (string.equals("test")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 447503464:
                        if (string.equals("custom_event_property")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 717572172:
                        if (string.equals("custom_event")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 1512893214:
                        if (string.equals("iam_click")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 1743324417:
                        if (string.equals("purchase")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1926863907:
                        if (string.equals("push_click")) {
                            c = 7;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        arrayList.add(new C12567c4(optJSONObject));
                        continue;
                    case 1:
                        arrayList.add(new C13081r3());
                        continue;
                    case 2:
                        arrayList.add(new C13148t5());
                        continue;
                    case 3:
                        arrayList.add(new C12576d0(optJSONObject));
                        continue;
                    case 4:
                        arrayList.add(new C12536b0(optJSONObject));
                        continue;
                    case 5:
                        arrayList.add(new C13281z2(optJSONObject));
                        continue;
                    case 6:
                        arrayList.add(new C12520a4(optJSONObject));
                        continue;
                    case 7:
                        arrayList.add(new C12611e4(optJSONObject));
                        continue;
                    default:
                        C43664k20.m29421z(f58646a, "Received triggered condition Json with unknown type: " + string + ". Not parsing.");
                        continue;
                }
            }
        }
        return arrayList;
    }
}
