package com.stripe.android.payments.core.authentication;

import com.stripe.android.PaymentBrowserAuthStarter;
import com.stripe.android.StripePaymentController;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.Source;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.payments.core.authentication.SourceAuthenticator$startSourceAuth$2", m28418f = "SourceAuthenticator.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class SourceAuthenticator$startSourceAuth$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ PaymentBrowserAuthStarter $paymentBrowserAuthStarter;
    final /* synthetic */ ApiRequest.Options $requestOptions;
    final /* synthetic */ Source $source;
    int label;
    final /* synthetic */ SourceAuthenticator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourceAuthenticator$startSourceAuth$2(SourceAuthenticator sourceAuthenticator, PaymentBrowserAuthStarter paymentBrowserAuthStarter, Source source, ApiRequest.Options options, Continuation<SourceAuthenticator$startSourceAuth$2> continuation) {
        super(2, continuation);
        this.this$0 = sourceAuthenticator;
        this.$paymentBrowserAuthStarter = paymentBrowserAuthStarter;
        this.$source = source;
        this.$requestOptions = options;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SourceAuthenticator$startSourceAuth$2(this.this$0, this.$paymentBrowserAuthStarter, this.$source, this.$requestOptions, continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(ZC0 zc0, Continuation<Unit> continuation) {
        return ((SourceAuthenticator$startSourceAuth$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AnalyticsRequestExecutor analyticsRequestExecutor;
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        Function0 function0;
        boolean z2;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            analyticsRequestExecutor = this.this$0.analyticsRequestExecutor;
            paymentAnalyticsRequestFactory = this.this$0.paymentAnalyticsRequestFactory;
            analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.AuthSourceRedirect, null, null, null, null, 30, null));
            PaymentBrowserAuthStarter paymentBrowserAuthStarter = this.$paymentBrowserAuthStarter;
            String id = this.$source.getId();
            if (id == null) {
                str = "";
            } else {
                str = id;
            }
            String clientSecret = this.$source.getClientSecret();
            if (clientSecret == null) {
                str2 = "";
            } else {
                str2 = clientSecret;
            }
            Source.Redirect redirect = this.$source.getRedirect();
            String str5 = null;
            if (redirect != null) {
                str3 = redirect.getUrl();
            } else {
                str3 = null;
            }
            if (str3 == null) {
                str4 = "";
            } else {
                str4 = str3;
            }
            Source.Redirect redirect2 = this.$source.getRedirect();
            if (redirect2 != null) {
                str5 = redirect2.getReturnUrl();
            }
            z = this.this$0.enableLogging;
            String stripeAccount = this.$requestOptions.getStripeAccount();
            function0 = this.this$0.publishableKeyProvider;
            String str6 = (String) function0.invoke();
            z2 = this.this$0.isInstantApp;
            paymentBrowserAuthStarter.start(new PaymentBrowserAuthContract.Args(str, StripePaymentController.SOURCE_REQUEST_CODE, str2, str4, str5, z, null, stripeAccount, false, false, null, str6, z2, 1856, null));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return invoke2(zc0, (Continuation<Unit>) continuation);
    }
}
