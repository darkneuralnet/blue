package p000;

import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.braintreepayments.api.models.PostalAddress;
import org.json.JSONObject;
/* renamed from: IY3 */
/* loaded from: classes2.dex */
public class IY3 {
    /* renamed from: a */
    public static String m101938a(JSONObject jSONObject) {
        return ("" + C39299ci2.m61029a(jSONObject, "address2", "") + "\n" + C39299ci2.m61029a(jSONObject, "address3", "") + "\n" + C39299ci2.m61029a(jSONObject, "address4", "") + "\n" + C39299ci2.m61029a(jSONObject, "address5", "")).trim();
    }

    /* renamed from: b */
    public static PostalAddress m101937b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new PostalAddress();
        }
        String m61029a = C39299ci2.m61029a(jSONObject, "street1", null);
        String m61029a2 = C39299ci2.m61029a(jSONObject, "street2", null);
        String m61029a3 = C39299ci2.m61029a(jSONObject, "country", null);
        if (m61029a == null) {
            m61029a = C39299ci2.m61029a(jSONObject, "line1", null);
        }
        if (m61029a2 == null) {
            m61029a2 = C39299ci2.m61029a(jSONObject, "line2", null);
        }
        if (m61029a3 == null) {
            m61029a3 = C39299ci2.m61029a(jSONObject, "countryCode", null);
        }
        if (m61029a == null && C39299ci2.m61029a(jSONObject, "name", null) != null) {
            return m101936c(jSONObject);
        }
        return new PostalAddress().m53312n(C39299ci2.m61029a(jSONObject, "recipientName", null)).m53309q(m61029a).m53323b(m61029a2).m53315k(C39299ci2.m61029a(jSONObject, "city", null)).m53311o(C39299ci2.m61029a(jSONObject, TransferTable.COLUMN_STATE, null)).m53313m(C39299ci2.m61029a(jSONObject, "postalCode", null)).m53324a(m61029a3);
    }

    /* renamed from: c */
    public static PostalAddress m101936c(JSONObject jSONObject) {
        PostalAddress postalAddress = new PostalAddress();
        postalAddress.m53312n(C39299ci2.m61029a(jSONObject, "name", "")).m53314l(C39299ci2.m61029a(jSONObject, "phoneNumber", "")).m53309q(C39299ci2.m61029a(jSONObject, "address1", "")).m53323b(m101938a(jSONObject)).m53315k(C39299ci2.m61029a(jSONObject, "locality", "")).m53311o(C39299ci2.m61029a(jSONObject, "administrativeArea", "")).m53324a(C39299ci2.m61029a(jSONObject, "countryCode", "")).m53313m(C39299ci2.m61029a(jSONObject, "postalCode", "")).m53310p(C39299ci2.m61029a(jSONObject, "sortingCode", ""));
        return postalAddress;
    }
}
