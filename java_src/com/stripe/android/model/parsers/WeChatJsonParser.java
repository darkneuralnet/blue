package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.WeChat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/WeChatJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/WeChat;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class WeChatJsonParser implements ModelJsonParser<WeChat> {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String FIELD_APPID = "android_appId";
    @Deprecated
    private static final String FIELD_NONCE = "android_nonceStr";
    @Deprecated
    private static final String FIELD_PACKAGE = "android_package";
    @Deprecated
    private static final String FIELD_PARTNERID = "android_partnerId";
    @Deprecated
    private static final String FIELD_PREPAYID = "android_prepayId";
    @Deprecated
    private static final String FIELD_QR_CODE_URL = "qr_code_url";
    @Deprecated
    private static final String FIELD_SIGN = "android_sign";
    @Deprecated
    private static final String FIELD_STATEMENT_DESCRIPTOR = "statement_descriptor";
    @Deprecated
    private static final String FIELD_TIMESTAMP = "android_timeStamp";

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/model/parsers/WeChatJsonParser$Companion;", "", "()V", "FIELD_APPID", "", "FIELD_NONCE", "FIELD_PACKAGE", "FIELD_PARTNERID", "FIELD_PREPAYID", "FIELD_QR_CODE_URL", "FIELD_SIGN", "FIELD_STATEMENT_DESCRIPTOR", "FIELD_TIMESTAMP", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public WeChat parse(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return new WeChat(StripeJsonUtils.optString(json, FIELD_STATEMENT_DESCRIPTOR), StripeJsonUtils.optString(json, FIELD_APPID), StripeJsonUtils.optString(json, FIELD_NONCE), StripeJsonUtils.optString(json, FIELD_PACKAGE), StripeJsonUtils.optString(json, FIELD_PARTNERID), StripeJsonUtils.optString(json, FIELD_PREPAYID), StripeJsonUtils.optString(json, FIELD_SIGN), StripeJsonUtils.optString(json, FIELD_TIMESTAMP), StripeJsonUtils.optString(json, FIELD_QR_CODE_URL));
    }
}
