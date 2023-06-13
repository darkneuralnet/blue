package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.IssuingCardPin;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/parsers/IssuingCardPinJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/IssuingCardPin;", "()V", "parse", "json", "Lorg/json/JSONObject;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class IssuingCardPinJsonParser implements ModelJsonParser<IssuingCardPin> {
    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public IssuingCardPin parse(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        String optString = StripeJsonUtils.optString(json, "pin");
        if (optString != null) {
            return new IssuingCardPin(optString);
        }
        return null;
    }
}
