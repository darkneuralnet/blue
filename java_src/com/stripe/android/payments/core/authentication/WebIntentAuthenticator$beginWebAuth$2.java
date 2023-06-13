package com.stripe.android.payments.core.authentication;

import com.stripe.android.PaymentBrowserAuthStarter;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.view.AuthActivityStarterHost;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.payments.core.authentication.WebIntentAuthenticator$beginWebAuth$2", m28418f = "WebIntentAuthenticator.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class WebIntentAuthenticator$beginWebAuth$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $authUrl;
    final /* synthetic */ String $clientSecret;
    final /* synthetic */ AuthActivityStarterHost $host;
    final /* synthetic */ int $requestCode;
    final /* synthetic */ String $returnUrl;
    final /* synthetic */ boolean $shouldCancelIntentOnUserNavigation;
    final /* synthetic */ boolean $shouldCancelSource;
    final /* synthetic */ String $stripeAccount;
    final /* synthetic */ StripeIntent $stripeIntent;
    int label;
    final /* synthetic */ WebIntentAuthenticator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebIntentAuthenticator$beginWebAuth$2(WebIntentAuthenticator webIntentAuthenticator, AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, int i, String str, String str2, String str3, String str4, boolean z, boolean z2, Continuation<WebIntentAuthenticator$beginWebAuth$2> continuation) {
        super(2, continuation);
        this.this$0 = webIntentAuthenticator;
        this.$host = authActivityStarterHost;
        this.$stripeIntent = stripeIntent;
        this.$requestCode = i;
        this.$clientSecret = str;
        this.$authUrl = str2;
        this.$returnUrl = str3;
        this.$stripeAccount = str4;
        this.$shouldCancelSource = z;
        this.$shouldCancelIntentOnUserNavigation = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WebIntentAuthenticator$beginWebAuth$2(this.this$0, this.$host, this.$stripeIntent, this.$requestCode, this.$clientSecret, this.$authUrl, this.$returnUrl, this.$stripeAccount, this.$shouldCancelSource, this.$shouldCancelIntentOnUserNavigation, continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(ZC0 zc0, Continuation<Unit> continuation) {
        return ((WebIntentAuthenticator$beginWebAuth$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Function1 function1;
        boolean z;
        Function0 function0;
        boolean z2;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            function1 = this.this$0.paymentBrowserAuthStarterFactory;
            PaymentBrowserAuthStarter paymentBrowserAuthStarter = (PaymentBrowserAuthStarter) function1.invoke(this.$host);
            String id = this.$stripeIntent.getId();
            if (id == null) {
                id = "";
            }
            String str = id;
            int i = this.$requestCode;
            String str2 = this.$clientSecret;
            String str3 = this.$authUrl;
            String str4 = this.$returnUrl;
            z = this.this$0.enableLogging;
            String str5 = this.$stripeAccount;
            boolean z3 = this.$shouldCancelSource;
            boolean z4 = this.$shouldCancelIntentOnUserNavigation;
            function0 = this.this$0.publishableKeyProvider;
            String str6 = (String) function0.invoke();
            z2 = this.this$0.isInstantApp;
            paymentBrowserAuthStarter.start(new PaymentBrowserAuthContract.Args(str, i, str2, str3, str4, z, null, str5, z3, z4, null, str6, z2, 1088, null));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return invoke2(zc0, (Continuation<Unit>) continuation);
    }
}
