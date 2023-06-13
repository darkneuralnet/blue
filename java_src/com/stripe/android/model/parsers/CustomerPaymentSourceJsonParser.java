package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.Card;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.CustomerBankAccount;
import com.stripe.android.model.CustomerCard;
import com.stripe.android.model.CustomerPaymentSource;
import com.stripe.android.model.CustomerSource;
import com.stripe.android.model.Source;
import com.stripe.android.model.Stripe3ds2AuthParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/parsers/CustomerPaymentSourceJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/CustomerPaymentSource;", "()V", "parse", "json", "Lorg/json/JSONObject;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class CustomerPaymentSourceJsonParser implements ModelJsonParser<CustomerPaymentSource> {
    public static final int $stable = 0;

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public CustomerPaymentSource parse(JSONObject json) {
        Source parse;
        CustomerPaymentSource customerSource;
        Card parse2;
        Intrinsics.checkNotNullParameter(json, "json");
        String optString = StripeJsonUtils.optString(json, "object");
        if (optString != null) {
            int hashCode = optString.hashCode();
            if (hashCode == -1825227990) {
                if (optString.equals(ConsumerPaymentDetails.BankAccount.type)) {
                    return new CustomerBankAccount(new BankAccountJsonParser().parse(json));
                }
                return null;
            }
            if (hashCode != -896505829) {
                if (hashCode != 3046160 || !optString.equals("card") || (parse2 = new CardJsonParser().parse(json)) == null) {
                    return null;
                }
                customerSource = new CustomerCard(parse2);
            } else if (!optString.equals(Stripe3ds2AuthParams.FIELD_SOURCE) || (parse = new SourceJsonParser().parse(json)) == null) {
                return null;
            } else {
                customerSource = new CustomerSource(parse);
            }
            return customerSource;
        }
        return null;
    }
}
