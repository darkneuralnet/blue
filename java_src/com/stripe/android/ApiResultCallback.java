package com.stripe.android;

import com.stripe.android.core.model.StripeModel;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u00022\u00020\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH&J\u0015\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/ApiResultCallback;", "ResultType", "Lcom/stripe/android/core/model/StripeModel;", "", "onError", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "(Lcom/stripe/android/core/model/StripeModel;)V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public interface ApiResultCallback<ResultType extends StripeModel> {
    void onError(Exception exc);

    void onSuccess(ResultType resulttype);
}
