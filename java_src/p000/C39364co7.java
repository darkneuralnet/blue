package p000;

import android.util.Base64;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.stripe.android.core.networking.AnalyticsFields;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: co7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39364co7 implements InterfaceC33375Hn7 {

    /* renamed from: d */
    public static final String f68328d;

    /* renamed from: a */
    public final String f68329a;

    /* renamed from: b */
    public final String f68330b;

    /* renamed from: c */
    public final C33843Jn7 f68331c;

    static {
        byte[] decode = Base64.decode("opMaSwzKffHEPgAzu/wXmmAoBSQ+L5trn/RQom0", 3);
        byte[] decode2 = Base64.decode("oh/AACypu7EhHIzJlqtCgyEK8MToFuQ8E7pIO7A", 3);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[i] ^ decode2[i]);
        }
        f68328d = Base64.encodeToString(bArr, 3);
    }

    public C39364co7() {
        String str = f68328d;
        C33843Jn7 c33843Jn7 = C33843Jn7.f18246a;
        this.f68329a = str;
        this.f68330b = "https://mobilemlaccelerationcompatibility.googleapis.com";
        this.f68331c = c33843Jn7;
    }

    @Override // p000.InterfaceC33375Hn7
    /* renamed from: a */
    public final C41250fx7 mo53718a(AbstractC52415yn7 abstractC52415yn7, C39974do7 c39974do7, String str, String str2, String str3, int i) throws C33609In7 {
        String str4;
        String str5 = this.f68329a;
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f68330b.concat("/v1/advisor?alt=PROTO")).openConnection();
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.setRequestProperty("Accept", "application/x-protobuf");
                httpURLConnection.setRequestProperty("Content-Type", "application/json; utf-8");
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("X-Goog-Api-Key", str5);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("installation_id", c39974do7.m43686a());
                    jSONObject.put(PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "MLKIT");
                    jSONObject.put("client_library", str);
                    jSONObject.put("client_library_version", str2);
                    JSONObject put = new JSONObject().put("client_info", jSONObject);
                    RJ7 mo2581a = abstractC52415yn7.mo2581a();
                    UJ7 m86961G = mo2581a.m86961G();
                    OJ7 m86964D = mo2581a.m86964D();
                    JSONObject put2 = put.put("android_info", new JSONObject().put("product", new JSONObject().put("device", m86961G.m81631H()).put("product", m86961G.m81628K()).put(RequestHeadersFactory.MODEL, m86961G.m81629J()).put("manufacturer", m86961G.m81630I()).put(AccountRangeJsonParser.FIELD_BRAND, m86961G.m81632G())).put(JsonPOJOBuilder.DEFAULT_BUILD_METHOD, new JSONObject().put(AnalyticsFields.OS_VERSION, m86964D.m92408J()).put("build_type", m86964D.m92409I()).put("preview_sdk", m86964D.m92414D()).put("build_id", m86964D.m92410H())).put("soc", mo2581a.m86960H()));
                    C37894aK7 mo2580b = abstractC52415yn7.mo2580b();
                    JSONArray jSONArray = new JSONArray();
                    for (XJ7 xj7 : mo2580b.m71653F()) {
                        jSONArray.put(new JSONObject().put("device", xj7.m77130G()).put("version", xj7.m77129H()).put("feature_level", xj7.m77133D()));
                    }
                    JSONObject put3 = put2.put("nnapi_info", new JSONObject().put("nnapi_driver_versions", jSONArray)).put("model_namespace", "com.google.perception");
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    byte[] bytes = put3.toString().getBytes(C40922fP8.f80075c);
                    outputStream.write(bytes, 0, bytes.length);
                    outputStream.close();
                    try {
                        httpURLConnection.connect();
                        if (httpURLConnection.getResponseCode() == 200) {
                            String headerField = httpURLConnection.getHeaderField("Content-Type");
                            if (headerField != null && C38524bO8.m64568a(headerField, "application/x-protobuf")) {
                                try {
                                    return LJ7.m97333F(httpURLConnection.getInputStream(), C53068zt7.m154a()).m97335D();
                                } catch (IOException e) {
                                    throw new C33609In7(bz9.RPC_RETURNED_MALFORMED_RESULT, "Error while reading response from MlGoldblum", e);
                                }
                            }
                            String valueOf = String.valueOf(headerField);
                            if (valueOf.length() != 0) {
                                str4 = "Invalid response from MlGoldblum, expected proto buf but got ".concat(valueOf);
                            } else {
                                str4 = new String("Invalid response from MlGoldblum, expected proto buf but got ");
                            }
                            throw new C33609In7(bz9.RPC_RETURNED_MALFORMED_RESULT, str4);
                        }
                        int responseCode = httpURLConnection.getResponseCode();
                        throw new C33609In7(bz9.RPC_ERROR, String.format("Error response (%d: '%s') from MlGoldblumServer", Integer.valueOf(responseCode), httpURLConnection.getResponseMessage()));
                    } catch (IOException e2) {
                        throw new C33609In7(bz9.NO_CONNECTION, "Error while requesting allowlist to MlGoldblum", e2);
                    }
                } catch (IOException | JSONException e3) {
                    throw C33609In7.m101709b("Error creating request", e3);
                }
            } catch (IOException e4) {
                throw C33609In7.m101709b("Error while building allowlist request to MlGoldblum", e4);
            }
        } catch (IOException e5) {
            throw C33609In7.m101709b("Invalid URL built while trying to connect to MlGoldblum", e5);
        }
    }
}
