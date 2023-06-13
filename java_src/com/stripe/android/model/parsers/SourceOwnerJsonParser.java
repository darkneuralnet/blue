package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.Address;
import com.stripe.android.model.Source;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/SourceOwnerJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Source$Owner;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class SourceOwnerJsonParser implements ModelJsonParser<Source.Owner> {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String FIELD_ADDRESS = "address";
    @Deprecated
    private static final String FIELD_EMAIL = "email";
    @Deprecated
    private static final String FIELD_NAME = "name";
    @Deprecated
    private static final String FIELD_PHONE = "phone";
    @Deprecated
    private static final String FIELD_VERIFIED_ADDRESS = "verified_address";
    @Deprecated
    private static final String FIELD_VERIFIED_EMAIL = "verified_email";
    @Deprecated
    private static final String FIELD_VERIFIED_NAME = "verified_name";
    @Deprecated
    private static final String FIELD_VERIFIED_PHONE = "verified_phone";

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/model/parsers/SourceOwnerJsonParser$Companion;", "", "()V", "FIELD_ADDRESS", "", "FIELD_EMAIL", "FIELD_NAME", "FIELD_PHONE", "FIELD_VERIFIED_ADDRESS", "FIELD_VERIFIED_EMAIL", "FIELD_VERIFIED_NAME", "FIELD_VERIFIED_PHONE", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public Source.Owner parse(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        JSONObject optJSONObject = json.optJSONObject("address");
        Address parse = optJSONObject != null ? new AddressJsonParser().parse(optJSONObject) : null;
        String optString = StripeJsonUtils.optString(json, "email");
        String optString2 = StripeJsonUtils.optString(json, "name");
        String optString3 = StripeJsonUtils.optString(json, "phone");
        JSONObject optJSONObject2 = json.optJSONObject(FIELD_VERIFIED_ADDRESS);
        return new Source.Owner(parse, optString, optString2, optString3, optJSONObject2 != null ? new AddressJsonParser().parse(optJSONObject2) : null, StripeJsonUtils.optString(json, FIELD_VERIFIED_EMAIL), StripeJsonUtils.optString(json, FIELD_VERIFIED_NAME), StripeJsonUtils.optString(json, FIELD_VERIFIED_PHONE));
    }
}
