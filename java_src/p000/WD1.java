package p000;

import android.util.Log;
import androidx.recyclerview.widget.C11925l;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.AccessToken;
import com.facebook.C17216a;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 /2\u00020\u0001:\u0001\u0006BC\b\u0000\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010(\u001a\u0004\u0018\u00010$¢\u0006\u0004\b)\u0010*B-\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b)\u0010+B+\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\u0006\u0010,\u001a\u00020\u000b¢\u0006\u0004\b)\u0010-B#\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010(\u001a\u00020$¢\u0006\u0004\b)\u0010.J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0007R\u0016\u0010#\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\rR\u0019\u0010(\u001a\u0004\u0018\u00010$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\f\u0010'¨\u00060"}, m28432d2 = {"LWD1;", "", "Lorg/json/JSONObject;", "c", "", "toString", C17296a.f69688o, "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "()Lorg/json/JSONObject;", "jsonObject", "Lorg/json/JSONArray;", "b", "Lorg/json/JSONArray;", "getJsonArray", "()Lorg/json/JSONArray;", "jsonArray", "Lcom/facebook/GraphRequest;", "Lcom/facebook/GraphRequest;", "getRequest", "()Lcom/facebook/GraphRequest;", "request", "Ljava/net/HttpURLConnection;", "Ljava/net/HttpURLConnection;", "getConnection", "()Ljava/net/HttpURLConnection;", "connection", "e", "Ljava/lang/String;", "getRawResponse", "()Ljava/lang/String;", "rawResponse", "f", "graphObject", "g", "graphObjectArray", "Lcom/facebook/FacebookRequestError;", "h", "Lcom/facebook/FacebookRequestError;", "()Lcom/facebook/FacebookRequestError;", "error", "<init>", "(Lcom/facebook/GraphRequest;Ljava/net/HttpURLConnection;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONArray;Lcom/facebook/FacebookRequestError;)V", "(Lcom/facebook/GraphRequest;Ljava/net/HttpURLConnection;Ljava/lang/String;Lorg/json/JSONObject;)V", "graphObjects", "(Lcom/facebook/GraphRequest;Ljava/net/HttpURLConnection;Ljava/lang/String;Lorg/json/JSONArray;)V", "(Lcom/facebook/GraphRequest;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookRequestError;)V", "j", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: WD1 */
/* loaded from: classes5.dex */
public final class WD1 {

    /* renamed from: a */
    public final JSONObject f40579a;

    /* renamed from: b */
    public final JSONArray f40580b;

    /* renamed from: c */
    public final GraphRequest f40581c;

    /* renamed from: d */
    public final HttpURLConnection f40582d;

    /* renamed from: e */
    public final String f40583e;

    /* renamed from: f */
    public final JSONObject f40584f;

    /* renamed from: g */
    public final JSONArray f40585g;

    /* renamed from: h */
    public final FacebookRequestError f40586h;

    /* renamed from: j */
    public static final C8957a f40578j = new C8957a(null);

    /* renamed from: i */
    public static final String f40577i = WD1.class.getCanonicalName();

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J0\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007J.\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0013\u001a\u00020\u0001H\u0002J*\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0001H\u0002R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u0014\u0010\u001f\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u0014\u0010 \u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0019¨\u0006#"}, m28432d2 = {"LWD1$a;", "", "Ljava/net/HttpURLConnection;", "connection", "LVD1;", "requests", "", "LWD1;", "f", "Ljava/io/InputStream;", "stream", DateTokenConverter.CONVERTER_KEY, "", "responseString", "e", "Lcom/facebook/GraphRequest;", "Lcom/facebook/FacebookException;", "error", C17296a.f69688o, "sourceObject", "c", "request", "originalResult", "b", "TAG", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "BODY_KEY", "CODE_KEY", "NON_JSON_RESPONSE_PROPERTY", "RESPONSE_LOG_TAG", "SUCCESS_KEY", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: WD1$a */
    /* loaded from: classes5.dex */
    public static final class C8957a {
        private C8957a() {
        }

        @JvmStatic
        /* renamed from: a */
        public final List<WD1> m78701a(List<GraphRequest> requests, HttpURLConnection httpURLConnection, FacebookException facebookException) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(requests, "requests");
            List<GraphRequest> list = requests;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (GraphRequest graphRequest : list) {
                arrayList.add(new WD1(graphRequest, httpURLConnection, new FacebookRequestError(httpURLConnection, facebookException)));
            }
            return arrayList;
        }

        /* renamed from: b */
        public final WD1 m78700b(GraphRequest graphRequest, HttpURLConnection httpURLConnection, Object obj, Object obj2) throws JSONException {
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                FacebookRequestError m52857a = FacebookRequestError.f69361q.m52857a(jSONObject, obj2, httpURLConnection);
                if (m52857a != null) {
                    Log.e(m78695g(), m52857a.toString());
                    if (m52857a.m52866b() == 190 && C52364yi6.m2863O(graphRequest.m52835l())) {
                        if (m52857a.m52860i() != 493) {
                            AccessToken.f69314q.m52894h(null);
                        } else {
                            AccessToken.C17188c c17188c = AccessToken.f69314q;
                            AccessToken m52897e = c17188c.m52897e();
                            if (m52897e != null && !m52897e.m52908p()) {
                                c17188c.m52898d();
                            }
                        }
                    }
                    return new WD1(graphRequest, httpURLConnection, m52857a);
                }
                Object m2874D = C52364yi6.m2874D(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                if (m2874D instanceof JSONObject) {
                    return new WD1(graphRequest, httpURLConnection, m2874D.toString(), (JSONObject) m2874D);
                }
                if (m2874D instanceof JSONArray) {
                    return new WD1(graphRequest, httpURLConnection, m2874D.toString(), (JSONArray) m2874D);
                }
                obj = JSONObject.NULL;
                Intrinsics.checkNotNullExpressionValue(obj, "JSONObject.NULL");
            }
            if (obj == JSONObject.NULL) {
                return new WD1(graphRequest, httpURLConnection, obj.toString(), (JSONObject) null);
            }
            throw new FacebookException("Got unexpected object type in response, class: " + obj.getClass().getSimpleName());
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final List<WD1> m78699c(HttpURLConnection httpURLConnection, List<GraphRequest> list, Object obj) throws FacebookException, JSONException {
            JSONArray jSONArray;
            int i;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            if (size == 1) {
                GraphRequest graphRequest = list.get(0);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("body", obj);
                    if (httpURLConnection != null) {
                        i = httpURLConnection.getResponseCode();
                    } else {
                        i = C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION;
                    }
                    jSONObject.put(PaymentMethodOptionsParams.Blik.PARAM_CODE, i);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put(jSONObject);
                    jSONArray = jSONArray2;
                } catch (IOException e) {
                    arrayList.add(new WD1(graphRequest, httpURLConnection, new FacebookRequestError(httpURLConnection, e)));
                } catch (JSONException e2) {
                    arrayList.add(new WD1(graphRequest, httpURLConnection, new FacebookRequestError(httpURLConnection, e2)));
                }
                if (jSONArray instanceof JSONArray) {
                    JSONArray jSONArray3 = (JSONArray) jSONArray;
                    if (jSONArray3.length() == size) {
                        int length = jSONArray3.length();
                        for (int i2 = 0; i2 < length; i2++) {
                            GraphRequest graphRequest2 = list.get(i2);
                            try {
                                Object obj2 = ((JSONArray) jSONArray).get(i2);
                                Intrinsics.checkNotNullExpressionValue(obj2, "obj");
                                arrayList.add(m78700b(graphRequest2, httpURLConnection, obj2, obj));
                            } catch (FacebookException e3) {
                                arrayList.add(new WD1(graphRequest2, httpURLConnection, new FacebookRequestError(httpURLConnection, e3)));
                            } catch (JSONException e4) {
                                arrayList.add(new WD1(graphRequest2, httpURLConnection, new FacebookRequestError(httpURLConnection, e4)));
                            }
                        }
                        return arrayList;
                    }
                }
                throw new FacebookException("Unexpected number of results");
            }
            jSONArray = obj;
            if (jSONArray instanceof JSONArray) {
            }
            throw new FacebookException("Unexpected number of results");
        }

        @JvmStatic
        /* renamed from: d */
        public final List<WD1> m78698d(InputStream inputStream, HttpURLConnection httpURLConnection, VD1 requests) throws FacebookException, JSONException, IOException {
            Intrinsics.checkNotNullParameter(requests, "requests");
            String m2834i0 = C52364yi6.m2834i0(inputStream);
            C32992Fx2.f10539f.m106213d(EnumC36034Sx2.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(m2834i0.length()), m2834i0);
            return m78697e(m2834i0, httpURLConnection, requests);
        }

        @JvmStatic
        /* renamed from: e */
        public final List<WD1> m78697e(String responseString, HttpURLConnection httpURLConnection, VD1 requests) throws FacebookException, JSONException, IOException {
            Intrinsics.checkNotNullParameter(responseString, "responseString");
            Intrinsics.checkNotNullParameter(requests, "requests");
            Object resultObject = new JSONTokener(responseString).nextValue();
            Intrinsics.checkNotNullExpressionValue(resultObject, "resultObject");
            List<WD1> m78699c = m78699c(httpURLConnection, requests, resultObject);
            C32992Fx2.f10539f.m106213d(EnumC36034Sx2.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", requests.m80212x(), Integer.valueOf(responseString.length()), m78699c);
            return m78699c;
        }

        @JvmStatic
        /* renamed from: f */
        public final List<WD1> m78696f(HttpURLConnection connection, VD1 requests) {
            List<WD1> m78701a;
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(requests, "requests");
            InputStream inputStream = null;
            try {
                try {
                } catch (FacebookException e) {
                    C32992Fx2.f10539f.m106213d(EnumC36034Sx2.REQUESTS, "Response", "Response <Error>: %s", e);
                    m78701a = m78701a(requests, connection, e);
                } catch (Exception e2) {
                    C32992Fx2.f10539f.m106213d(EnumC36034Sx2.REQUESTS, "Response", "Response <Error>: %s", e2);
                    m78701a = m78701a(requests, connection, new FacebookException(e2));
                }
                if (C17216a.m52723w()) {
                    if (connection.getResponseCode() >= 400) {
                        inputStream = connection.getErrorStream();
                    } else {
                        inputStream = connection.getInputStream();
                    }
                    m78701a = m78698d(inputStream, connection, requests);
                    return m78701a;
                }
                Log.e(m78695g(), "GraphRequest can't be used when Facebook SDK isn't fully initialized");
                throw new FacebookException("GraphRequest can't be used when Facebook SDK isn't fully initialized");
            } finally {
                C52364yi6.m2839g(null);
            }
        }

        /* renamed from: g */
        public final String m78695g() {
            return WD1.f40577i;
        }

        public /* synthetic */ C8957a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WD1(GraphRequest request, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f40581c = request;
        this.f40582d = httpURLConnection;
        this.f40583e = str;
        this.f40584f = jSONObject;
        this.f40585g = jSONArray;
        this.f40586h = facebookRequestError;
        this.f40579a = jSONObject;
        this.f40580b = jSONArray;
    }

    /* renamed from: b */
    public final FacebookRequestError m78704b() {
        return this.f40586h;
    }

    /* renamed from: c */
    public final JSONObject m78703c() {
        return this.f40584f;
    }

    /* renamed from: d */
    public final JSONObject m78702d() {
        return this.f40579a;
    }

    public String toString() {
        String str;
        int i;
        try {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            HttpURLConnection httpURLConnection = this.f40582d;
            if (httpURLConnection != null) {
                i = httpURLConnection.getResponseCode();
            } else {
                i = C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION;
            }
            objArr[0] = Integer.valueOf(i);
            str = String.format(locale, "%d", Arrays.copyOf(objArr, 1));
            Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(locale, format, *args)");
        } catch (IOException unused) {
            str = "unknown";
        }
        String str2 = "{Response:  responseCode: " + str + ", graphObject: " + this.f40584f + ", error: " + this.f40586h + "}";
        Intrinsics.checkNotNullExpressionValue(str2, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WD1(GraphRequest request, HttpURLConnection httpURLConnection, String rawResponse, JSONObject jSONObject) {
        this(request, httpURLConnection, rawResponse, jSONObject, null, null);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(rawResponse, "rawResponse");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WD1(GraphRequest request, HttpURLConnection httpURLConnection, String rawResponse, JSONArray graphObjects) {
        this(request, httpURLConnection, rawResponse, null, graphObjects, null);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(rawResponse, "rawResponse");
        Intrinsics.checkNotNullParameter(graphObjects, "graphObjects");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WD1(GraphRequest request, HttpURLConnection httpURLConnection, FacebookRequestError error) {
        this(request, httpURLConnection, null, null, null, error);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
    }
}
