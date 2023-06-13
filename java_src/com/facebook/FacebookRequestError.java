package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.C11925l;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.net.HttpURLConnection;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 N2\u00020\u0001:\u0003O\r\u0017B\u0083\u0001\b\u0002\u0012\u0006\u0010\"\u001a\u00020\u0006\u0012\u0006\u0010$\u001a\u00020\u0006\u0012\u0006\u0010&\u001a\u00020\u0006\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010B\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0002\u0012\b\u00103\u001a\u0004\u0018\u00010.\u0012\b\u00105\u001a\u0004\u0018\u00010.\u0012\b\u0010;\u001a\u0004\u0018\u000106\u0012\b\u0010A\u001a\u0004\u0018\u00010<\u0012\b\u0010C\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bF\u0010GB#\b\u0017\u0012\b\u0010A\u001a\u0004\u0018\u00010<\u0012\u000e\u0010\u0015\u001a\n\u0018\u00010Hj\u0004\u0018\u0001`I¢\u0006\u0004\bF\u0010JB%\b\u0016\u0012\u0006\u0010$\u001a\u00020\u0006\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bF\u0010KB\u0011\b\u0012\u0012\u0006\u0010L\u001a\u00020\u0004¢\u0006\u0004\bF\u0010MJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028F¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR(\u0010\u0015\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\"\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010$\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b\u000b\u0010!R\u0017\u0010&\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b%\u0010!R\u0019\u0010'\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\f\u001a\u0004\b\u0017\u0010\u000eR\u0019\u0010*\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\f\u001a\u0004\b)\u0010\u000eR\u0019\u0010-\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\f\u001a\u0004\b,\u0010\u000eR\u0019\u00103\u001a\u0004\u0018\u00010.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u00105\u001a\u0004\u0018\u00010.8\u0006¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b#\u00102R\u0019\u0010;\u001a\u0004\u0018\u0001068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010A\u001a\u0004\u0018\u00010<8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@¨\u0006P"}, m28432d2 = {"Lcom/facebook/FacebookRequestError;", "Landroid/os/Parcelable;", "", "toString", "Landroid/os/Parcel;", "out", "", "flags", "", "writeToParcel", "describeContents", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "errorMessage", "Lcom/facebook/FacebookException;", "<set-?>", "Lcom/facebook/FacebookException;", "e", "()Lcom/facebook/FacebookException;", "exception", "Lcom/facebook/FacebookRequestError$a;", DateTokenConverter.CONVERTER_KEY, "Lcom/facebook/FacebookRequestError$a;", "getCategory", "()Lcom/facebook/FacebookRequestError$a;", "category", "getErrorRecoveryMessage", "errorRecoveryMessage", "f", "I", "h", "()I", "requestStatusCode", "g", "errorCode", "i", "subErrorCode", "errorType", "j", "getErrorUserTitle", "errorUserTitle", "k", "getErrorUserMessage", "errorUserMessage", "Lorg/json/JSONObject;", "l", "Lorg/json/JSONObject;", "getRequestResultBody", "()Lorg/json/JSONObject;", "requestResultBody", "m", "requestResult", "", "n", "Ljava/lang/Object;", "getBatchRequestResult", "()Ljava/lang/Object;", "batchRequestResult", "Ljava/net/HttpURLConnection;", "o", "Ljava/net/HttpURLConnection;", "getConnection", "()Ljava/net/HttpURLConnection;", "connection", "errorMessageField", "exceptionField", "", "errorIsTransient", "<init>", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookException;Z)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/net/HttpURLConnection;Ljava/lang/Exception;)V", "(ILjava/lang/String;Ljava/lang/String;)V", "parcel", "(Landroid/os/Parcel;)V", "q", C17296a.f69688o, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class FacebookRequestError implements Parcelable {

    /* renamed from: b */
    public final String f69362b;

    /* renamed from: c */
    public FacebookException f69363c;

    /* renamed from: d */
    public final EnumC17196a f69364d;

    /* renamed from: e */
    public final String f69365e;

    /* renamed from: f */
    public final int f69366f;

    /* renamed from: g */
    public final int f69367g;

    /* renamed from: h */
    public final int f69368h;

    /* renamed from: i */
    public final String f69369i;

    /* renamed from: j */
    public final String f69370j;

    /* renamed from: k */
    public final String f69371k;

    /* renamed from: l */
    public final JSONObject f69372l;

    /* renamed from: m */
    public final JSONObject f69373m;

    /* renamed from: n */
    public final Object f69374n;

    /* renamed from: o */
    public final HttpURLConnection f69375o;

    /* renamed from: q */
    public static final C17198c f69361q = new C17198c(null);

    /* renamed from: p */
    public static final C17199d f69360p = new C17199d(C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION, 299);
    @JvmField
    public static final Parcelable.Creator<FacebookRequestError> CREATOR = new C17197b();

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/facebook/FacebookRequestError$a;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: com.facebook.FacebookRequestError$a */
    /* loaded from: classes5.dex */
    public enum EnumC17196a {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT
    }

    @Metadata(m28433d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m28432d2 = {"com/facebook/FacebookRequestError$b", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/FacebookRequestError;", "Landroid/os/Parcel;", "parcel", C17296a.f69688o, "", "size", "", "b", "(I)[Lcom/facebook/FacebookRequestError;", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: com.facebook.FacebookRequestError$b */
    /* loaded from: classes5.dex */
    public static final class C17197b implements Parcelable.Creator<FacebookRequestError> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public FacebookRequestError createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FacebookRequestError(parcel, (DefaultConstructorMarker) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public FacebookRequestError[] newArray(int i) {
            return new FacebookRequestError[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)J&\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0011\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014R\u0014\u0010\u001c\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014R\u0014\u0010\u001d\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014R\u0014\u0010\u001e\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0014R\u0014\u0010\u001f\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0014R\u0014\u0010 \u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0014R\u0014\u0010!\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0014R\u0014\u0010\"\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0014R\u0014\u0010#\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0014R\u0014\u0010%\u001a\u00020$8\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020$8\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010&¨\u0006*"}, m28432d2 = {"Lcom/facebook/FacebookRequestError$c;", "", "Lorg/json/JSONObject;", "singleResult", "batchResult", "Ljava/net/HttpURLConnection;", "connection", "Lcom/facebook/FacebookRequestError;", C17296a.f69688o, "Lcom/facebook/FacebookRequestError$d;", "HTTP_RANGE_SUCCESS", "Lcom/facebook/FacebookRequestError$d;", "c", "()Lcom/facebook/FacebookRequestError$d;", "Lnj1;", "b", "()Lnj1;", "errorClassification", "", "BODY_KEY", "Ljava/lang/String;", "CODE_KEY", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "ERROR_CODE_FIELD_KEY", "ERROR_CODE_KEY", "ERROR_IS_TRANSIENT_KEY", "ERROR_KEY", "ERROR_MESSAGE_FIELD_KEY", "ERROR_MSG_KEY", "ERROR_REASON_KEY", "ERROR_SUB_CODE_KEY", "ERROR_TYPE_FIELD_KEY", "ERROR_USER_MSG_KEY", "ERROR_USER_TITLE_KEY", "", "INVALID_ERROR_CODE", "I", "INVALID_HTTP_STATUS_CODE", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: com.facebook.FacebookRequestError$c */
    /* loaded from: classes5.dex */
    public static final class C17198c {
        private C17198c() {
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x00cd A[Catch: JSONException -> 0x012b, TryCatch #0 {JSONException -> 0x012b, blocks: (B:3:0x0012, B:5:0x0018, B:7:0x0022, B:9:0x0026, B:12:0x0034, B:14:0x003f, B:17:0x0049, B:20:0x0053, B:23:0x005b, B:25:0x0061, B:28:0x006b, B:31:0x0075, B:45:0x00cd, B:33:0x0081, B:36:0x008e, B:38:0x0097, B:42:0x00a8, B:47:0x00ee, B:49:0x00f8, B:51:0x0106, B:53:0x010f), top: B:57:0x0012 }] */
        @JvmStatic
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final FacebookRequestError m52857a(JSONObject singleResult, Object obj, HttpURLConnection httpURLConnection) {
            JSONObject jSONObject;
            String optString;
            int optInt;
            boolean z;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            int i;
            Intrinsics.checkNotNullParameter(singleResult, "singleResult");
            try {
                if (singleResult.has(PaymentMethodOptionsParams.Blik.PARAM_CODE)) {
                    int i2 = singleResult.getInt(PaymentMethodOptionsParams.Blik.PARAM_CODE);
                    Object m2874D = C52364yi6.m2874D(singleResult, "body", "FACEBOOK_NON_JSON_RESULT");
                    if (m2874D != null && (m2874D instanceof JSONObject)) {
                        boolean z2 = false;
                        int i3 = -1;
                        if (((JSONObject) m2874D).has("error")) {
                            JSONObject jSONObject2 = (JSONObject) C52364yi6.m2874D((JSONObject) m2874D, "error", null);
                            if (jSONObject2 != null) {
                                optString = jSONObject2.optString("type", null);
                            } else {
                                optString = null;
                            }
                            if (jSONObject2 != null) {
                                str5 = jSONObject2.optString("message", null);
                            } else {
                                str5 = null;
                            }
                            if (jSONObject2 != null) {
                                i = jSONObject2.optInt(PaymentMethodOptionsParams.Blik.PARAM_CODE, -1);
                            } else {
                                i = -1;
                            }
                            if (jSONObject2 != null) {
                                i3 = jSONObject2.optInt("error_subcode", -1);
                            }
                            if (jSONObject2 != null) {
                                str = jSONObject2.optString("error_user_msg", null);
                            } else {
                                str = null;
                            }
                            if (jSONObject2 != null) {
                                str2 = jSONObject2.optString("error_user_title", null);
                            } else {
                                str2 = null;
                            }
                            if (jSONObject2 != null) {
                                z2 = jSONObject2.optBoolean("is_transient", false);
                            }
                            z = z2;
                            z2 = true;
                            str3 = str5;
                            optInt = i3;
                            i3 = i;
                        } else {
                            if (!((JSONObject) m2874D).has("error_code") && !((JSONObject) m2874D).has("error_msg") && !((JSONObject) m2874D).has("error_reason")) {
                                z = false;
                                optInt = -1;
                                str4 = null;
                                str3 = null;
                                str = null;
                                str2 = null;
                                if (z2) {
                                    return new FacebookRequestError(i2, i3, optInt, str4, str3, str2, str, (JSONObject) m2874D, singleResult, obj, httpURLConnection, null, z, null);
                                }
                            }
                            optString = ((JSONObject) m2874D).optString("error_reason", null);
                            String optString2 = ((JSONObject) m2874D).optString("error_msg", null);
                            int optInt2 = ((JSONObject) m2874D).optInt("error_code", -1);
                            optInt = ((JSONObject) m2874D).optInt("error_subcode", -1);
                            i3 = optInt2;
                            z = false;
                            str = null;
                            str2 = null;
                            z2 = true;
                            str3 = optString2;
                        }
                        str4 = optString;
                        if (z2) {
                        }
                    }
                    if (!m52855c().m52854a(i2)) {
                        if (singleResult.has("body")) {
                            jSONObject = (JSONObject) C52364yi6.m2874D(singleResult, "body", "FACEBOOK_NON_JSON_RESULT");
                        } else {
                            jSONObject = null;
                        }
                        return new FacebookRequestError(i2, -1, -1, null, null, null, null, jSONObject, singleResult, obj, httpURLConnection, null, false, null);
                    }
                }
            } catch (JSONException unused) {
            }
            return null;
        }

        @JvmStatic
        /* renamed from: b */
        public final synchronized C45848nj1 m52856b() {
            C34512Mk1 m93522j = C34746Nk1.m93522j(C17216a.m52740f());
            if (m93522j != null) {
                return m93522j.m94977e();
            }
            return C45848nj1.f100423h.m23265b();
        }

        /* renamed from: c */
        public final C17199d m52855c() {
            return FacebookRequestError.f69360p;
        }

        public /* synthetic */ C17198c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\f"}, m28432d2 = {"Lcom/facebook/FacebookRequestError$d;", "", "", "value", "", C17296a.f69688o, "I", "start", "b", "end", "<init>", "(II)V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: com.facebook.FacebookRequestError$d */
    /* loaded from: classes5.dex */
    public static final class C17199d {

        /* renamed from: a */
        public final int f69380a;

        /* renamed from: b */
        public final int f69381b;

        public C17199d(int i, int i2) {
            this.f69380a = i;
            this.f69381b = i2;
        }

        /* renamed from: a */
        public final boolean m52854a(int i) {
            return this.f69380a <= i && this.f69381b >= i;
        }
    }

    public /* synthetic */ FacebookRequestError(int i, int i2, int i3, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, FacebookException facebookException, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, str, str2, str3, str4, jSONObject, jSONObject2, obj, httpURLConnection, facebookException, z);
    }

    /* renamed from: b */
    public final int m52866b() {
        return this.f69367g;
    }

    /* renamed from: c */
    public final String m52865c() {
        String str = this.f69362b;
        if (str != null) {
            return str;
        }
        FacebookException facebookException = this.f69363c;
        if (facebookException != null) {
            return facebookException.getLocalizedMessage();
        }
        return null;
    }

    /* renamed from: d */
    public final String m52864d() {
        return this.f69369i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final FacebookException m52863e() {
        return this.f69363c;
    }

    /* renamed from: g */
    public final JSONObject m52862g() {
        return this.f69373m;
    }

    /* renamed from: h */
    public final int m52861h() {
        return this.f69366f;
    }

    /* renamed from: i */
    public final int m52860i() {
        return this.f69368h;
    }

    public String toString() {
        String str = "{HttpStatus: " + this.f69366f + ", errorCode: " + this.f69367g + ", subErrorCode: " + this.f69368h + ", errorType: " + this.f69369i + ", errorMessage: " + m52865c() + "}";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder(\"{HttpStat…(\"}\")\n        .toString()");
        return str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.f69366f);
        out.writeInt(this.f69367g);
        out.writeInt(this.f69368h);
        out.writeString(this.f69369i);
        out.writeString(m52865c());
        out.writeString(this.f69370j);
        out.writeString(this.f69371k);
    }

    public /* synthetic */ FacebookRequestError(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    public FacebookRequestError(int i, int i2, int i3, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, FacebookException facebookException, boolean z) {
        boolean z2;
        EnumC17196a m23268c;
        this.f69366f = i;
        this.f69367g = i2;
        this.f69368h = i3;
        this.f69369i = str;
        this.f69370j = str3;
        this.f69371k = str4;
        this.f69372l = jSONObject;
        this.f69373m = jSONObject2;
        this.f69374n = obj;
        this.f69375o = httpURLConnection;
        this.f69362b = str2;
        if (facebookException != null) {
            this.f69363c = facebookException;
            z2 = true;
        } else {
            this.f69363c = new FacebookServiceException(this, m52865c());
            z2 = false;
        }
        if (z2) {
            m23268c = EnumC17196a.OTHER;
        } else {
            m23268c = f69361q.m52856b().m23268c(i2, i3, z);
        }
        this.f69364d = m23268c;
        this.f69365e = f69361q.m52856b().m23267d(m23268c);
    }

    public FacebookRequestError(HttpURLConnection httpURLConnection, Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, null, null, httpURLConnection, exc instanceof FacebookException ? (FacebookException) exc : new FacebookException(exc), false);
    }

    public FacebookRequestError(int i, String str, String str2) {
        this(-1, i, -1, str, str2, null, null, null, null, null, null, null, false);
    }

    public FacebookRequestError(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, null, null, null, null, false);
    }
}
