package com.stripe.android.stripe3ds2.transaction;

import com.nimbusds.jose.JOSEException;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import java.security.interfaces.ECPublicKey;
import java.text.ParseException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/DefaultAcsDataParser;", "Lcom/stripe/android/stripe3ds2/transaction/AcsDataParser;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "(Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V", "parse", "Lcom/stripe/android/stripe3ds2/transaction/AcsData;", "payloadJson", "Lorg/json/JSONObject;", "parsePublicKey", "Ljava/security/interfaces/ECPublicKey;", "ephemPubkey", "", "Companion", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class DefaultAcsDataParser implements AcsDataParser {
    public static final Companion Companion = new Companion(null);
    public static final String FIELD_ACS_EPHEM_PUB_KEY = "acsEphemPubKey";
    public static final String FIELD_ACS_URL = "acsURL";
    public static final String FIELD_SDK_EPHEM_PUB_KEY = "sdkEphemPubKey";
    private final ErrorReporter errorReporter;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/DefaultAcsDataParser$Companion;", "", "()V", "FIELD_ACS_EPHEM_PUB_KEY", "", "FIELD_ACS_URL", "FIELD_SDK_EPHEM_PUB_KEY", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DefaultAcsDataParser(ErrorReporter errorReporter) {
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        this.errorReporter = errorReporter;
    }

    private final ECPublicKey parsePublicKey(Object obj) {
        String str;
        Q81 m88889v;
        if (obj instanceof Map) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
            m88889v = Q81.m88888w((Map) obj);
        } else {
            if (obj != null) {
                str = obj.toString();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            m88889v = Q81.m88889v(str);
        }
        ECPublicKey m88887x = m88889v.m88887x();
        Intrinsics.checkNotNullExpressionValue(m88887x, "when (ephemPubkey) {\n   …        }.toECPublicKey()");
        return m88887x;
    }

    @Override // com.stripe.android.stripe3ds2.transaction.AcsDataParser
    public AcsData parse(JSONObject payloadJson) throws JSONException, ParseException, JOSEException {
        Object m116783constructorimpl;
        Map map;
        Intrinsics.checkNotNullParameter(payloadJson, "payloadJson");
        try {
            Result.Companion companion = Result.Companion;
            Map<String, Object> m95055m = C34477Mg2.m95055m(payloadJson.toString());
            Intrinsics.checkNotNullExpressionValue(m95055m, "parse(payloadJson.toString())");
            map = MapsKt__MapsKt.toMap(m95055m);
            m116783constructorimpl = Result.m116783constructorimpl(new AcsData(String.valueOf(map.get(FIELD_ACS_URL)), parsePublicKey(map.get(FIELD_ACS_EPHEM_PUB_KEY)), parsePublicKey(map.get(FIELD_SDK_EPHEM_PUB_KEY))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl != null) {
            ErrorReporter errorReporter = this.errorReporter;
            errorReporter.reportError(new IllegalArgumentException("Failed to parse ACS data: " + payloadJson, m116786exceptionOrNullimpl));
        }
        ResultKt.throwOnFailure(m116783constructorimpl);
        return (AcsData) m116783constructorimpl;
    }
}
