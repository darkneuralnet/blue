package com.stripe.android.networking;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.C18606R;
import com.stripe.android.core.StripeError;
import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0000¨\u0006\u0007"}, m28432d2 = {"mapErrorCodeToLocalizedMessage", "", "Landroid/content/Context;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "withLocalizedMessage", "Lcom/stripe/android/core/StripeError;", CoreConstants.CONTEXT_SCOPE_VALUE, "payments-core_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nStripeErrorMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeErrorMapping.kt\ncom/stripe/android/networking/StripeErrorMappingKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n1#2:32\n*E\n"})
/* loaded from: classes7.dex */
public final class StripeErrorMappingKt {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String mapErrorCodeToLocalizedMessage(Context context, String str) {
        Integer num;
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (str != null) {
            switch (str.hashCode()) {
                case -2011738994:
                    if (str.equals("generic_decline")) {
                        num = Integer.valueOf(C18606R.string.generic_decline);
                        break;
                    }
                    break;
                case -1109249604:
                    if (str.equals("invalid_expiry_month")) {
                        num = Integer.valueOf(C18606R.string.invalid_expiry_month);
                        break;
                    }
                    break;
                case -952840184:
                    if (str.equals("invalid_cvc")) {
                        num = Integer.valueOf(C18606R.string.invalid_cvc);
                        break;
                    }
                    break;
                case -857379549:
                    if (str.equals("incorrect_number")) {
                        num = Integer.valueOf(C18606R.string.invalid_card_number);
                        break;
                    }
                    break;
                case -822522913:
                    if (str.equals("invalid_owner_name")) {
                        num = Integer.valueOf(C18606R.string.invalid_owner_name);
                        break;
                    }
                    break;
                case -343766564:
                    if (str.equals("processing_error")) {
                        num = Integer.valueOf(C18606R.string.processing_error);
                        break;
                    }
                    break;
                case -308669807:
                    if (str.equals("invalid_number")) {
                        num = Integer.valueOf(C18606R.string.invalid_card_number);
                        break;
                    }
                    break;
                case 147203197:
                    if (str.equals("card_declined")) {
                        num = Integer.valueOf(C18606R.string.card_declined);
                        break;
                    }
                    break;
                case 657301889:
                    if (str.equals("invalid_expiry_year")) {
                        num = Integer.valueOf(C18606R.string.invalid_expiry_year);
                        break;
                    }
                    break;
                case 1436957674:
                    if (str.equals("expired_card")) {
                        num = Integer.valueOf(C18606R.string.expired_card);
                        break;
                    }
                    break;
                case 1737231027:
                    if (str.equals("invalid_bank_account_iban")) {
                        num = Integer.valueOf(C18606R.string.invalid_bank_account_iban);
                        break;
                    }
                    break;
                case 2037370550:
                    if (str.equals("incorrect_cvc")) {
                        num = Integer.valueOf(C18606R.string.invalid_cvc);
                        break;
                    }
                    break;
            }
            if (num != null) {
                return null;
            }
            return context.getString(num.intValue());
        }
        num = null;
        if (num != null) {
        }
    }

    public static final StripeError withLocalizedMessage(StripeError stripeError, Context context) {
        StripeError copy;
        Intrinsics.checkNotNullParameter(stripeError, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        String mapErrorCodeToLocalizedMessage = mapErrorCodeToLocalizedMessage(context, stripeError.getCode());
        if (mapErrorCodeToLocalizedMessage == null) {
            mapErrorCodeToLocalizedMessage = stripeError.getMessage();
        }
        copy = stripeError.copy((r18 & 1) != 0 ? stripeError.type : null, (r18 & 2) != 0 ? stripeError.message : mapErrorCodeToLocalizedMessage, (r18 & 4) != 0 ? stripeError.code : null, (r18 & 8) != 0 ? stripeError.param : null, (r18 & 16) != 0 ? stripeError.declineCode : null, (r18 & 32) != 0 ? stripeError.charge : null, (r18 & 64) != 0 ? stripeError.docUrl : null, (r18 & 128) != 0 ? stripeError.extraFields : null);
        return copy;
    }
}
