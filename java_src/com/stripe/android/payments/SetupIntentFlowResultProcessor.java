package com.stripe.android.payments;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.SetupIntentResult;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.SetupIntentFlowResultProcessor;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ+\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\bH\u0094@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J\"\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\bH\u0014J1\u0010\u001b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u001eH\u0094@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ1\u0010 \u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u001eH\u0094@ø\u0001\u0000¢\u0006\u0002\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, m28432d2 = {"Lcom/stripe/android/payments/SetupIntentFlowResultProcessor;", "Lcom/stripe/android/payments/PaymentFlowResultProcessor;", "Lcom/stripe/android/model/SetupIntent;", "Lcom/stripe/android/SetupIntentResult;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "publishableKeyProvider", "Lkotlin/Function0;", "", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "logger", "Lcom/stripe/android/core/Logger;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;)V", "cancelStripeIntentSource", "stripeIntentId", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "sourceId", "(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createStripeIntentResult", "stripeIntent", "outcomeFromFlow", "", "failureMessage", "refreshStripeIntent", "clientSecret", "expandFields", "", "(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveStripeIntent", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class SetupIntentFlowResultProcessor extends PaymentFlowResultProcessor<SetupIntent, SetupIntentResult> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetupIntentFlowResultProcessor(Context context, final Function0<String> publishableKeyProvider, StripeRepository stripeRepository, Logger logger, @IOContext CoroutineContext workContext) {
        super(context, new Y94() { // from class: ox5
            @Override // p000.Y94
            public final Object get() {
                String _init_$lambda$0;
                _init_$lambda$0 = SetupIntentFlowResultProcessor._init_$lambda$0(Function0.this);
                return _init_$lambda$0;
            }
        }, stripeRepository, logger, workContext, null, 32, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke();
    }

    @Override // com.stripe.android.payments.PaymentFlowResultProcessor
    public Object cancelStripeIntentSource(String str, ApiRequest.Options options, String str2, Continuation<? super SetupIntent> continuation) {
        return getStripeRepository().cancelSetupIntentSource$payments_core_release(str, str2, options, continuation);
    }

    @Override // com.stripe.android.payments.PaymentFlowResultProcessor
    public Object refreshStripeIntent(String str, ApiRequest.Options options, List<String> list, Continuation<? super SetupIntent> continuation) {
        return getStripeRepository().retrieveSetupIntent(str, options, list, continuation);
    }

    @Override // com.stripe.android.payments.PaymentFlowResultProcessor
    public Object retrieveStripeIntent(String str, ApiRequest.Options options, List<String> list, Continuation<? super SetupIntent> continuation) {
        return getStripeRepository().retrieveSetupIntent(str, options, list, continuation);
    }

    @Override // com.stripe.android.payments.PaymentFlowResultProcessor
    public SetupIntentResult createStripeIntentResult(SetupIntent stripeIntent, int i, String str) {
        Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
        return new SetupIntentResult(stripeIntent, i, str);
    }
}
