package com.stripe.android.payments.core.injection;

import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.core.authentication.PaymentAuthenticator;
import com.stripe.android.payments.core.authentication.UnsupportedAuthenticator;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\b\b¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/payments/core/injection/WeChatPayAuthenticatorModule;", "", "()V", "provideWeChatAuthenticator", "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;", "Lcom/stripe/android/model/StripeIntent;", "unsupportedAuthenticator", "Lcom/stripe/android/payments/core/authentication/UnsupportedAuthenticator;", "provideWeChatAuthenticator$payments_core_release", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@Module
/* loaded from: classes7.dex */
public final class WeChatPayAuthenticatorModule {
    /* JADX WARN: Multi-variable type inference failed */
    @Provides
    @IntentAuthenticatorMap
    @IntentAuthenticatorKey(StripeIntent.NextActionData.WeChatPayRedirect.class)
    public final PaymentAuthenticator<StripeIntent> provideWeChatAuthenticator$payments_core_release(UnsupportedAuthenticator unsupportedAuthenticator) {
        UnsupportedAuthenticator unsupportedAuthenticator2;
        Intrinsics.checkNotNullParameter(unsupportedAuthenticator, "unsupportedAuthenticator");
        try {
            Result.Companion companion = Result.Companion;
            Object newInstance = Class.forName("com.stripe.android.payments.wechatpay.WeChatPayAuthenticator").getConstructor(new Class[0]).newInstance(new Object[0]);
            Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type com.stripe.android.payments.core.authentication.PaymentAuthenticator<com.stripe.android.model.StripeIntent>");
            unsupportedAuthenticator2 = Result.m116783constructorimpl((PaymentAuthenticator) newInstance);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            unsupportedAuthenticator2 = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        if (!Result.m116789isFailureimpl(unsupportedAuthenticator2)) {
            unsupportedAuthenticator = unsupportedAuthenticator2;
        }
        return unsupportedAuthenticator;
    }
}
