package com.stripe.android.payments.core.authentication;

import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.StripeIntentKtxKt;
import com.stripe.android.view.AuthActivityStarterHost;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u001b\b\u0007\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\u0010\u0007J)\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0094@ø\u0001\u0000¢\u0006\u0002\u0010\u000eR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/payments/core/authentication/UnsupportedAuthenticator;", "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;", "Lcom/stripe/android/model/StripeIntent;", "paymentRelayStarterFactory", "Lkotlin/Function1;", "Lcom/stripe/android/view/AuthActivityStarterHost;", "Lcom/stripe/android/PaymentRelayStarter;", "(Lkotlin/jvm/functions/Function1;)V", "performAuthentication", "", "host", "authenticatable", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@JvmSuppressWildcards
/* loaded from: classes7.dex */
public final class UnsupportedAuthenticator extends PaymentAuthenticator<StripeIntent> {
    private static final Map<Class<? extends StripeIntent.NextActionData>, String> ACTION_DEPENDENCY_MAP;
    public static final Companion Companion = new Companion(null);
    private final Function1<AuthActivityStarterHost, PaymentRelayStarter> paymentRelayStarterFactory;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R%\u0010\u0003\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/payments/core/authentication/UnsupportedAuthenticator$Companion;", "", "()V", "ACTION_DEPENDENCY_MAP", "", "Ljava/lang/Class;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "", "getACTION_DEPENDENCY_MAP", "()Ljava/util/Map;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Map<Class<? extends StripeIntent.NextActionData>, String> getACTION_DEPENDENCY_MAP() {
            return UnsupportedAuthenticator.ACTION_DEPENDENCY_MAP;
        }

        private Companion() {
        }
    }

    static {
        Map<Class<? extends StripeIntent.NextActionData>, String> mapOf;
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(StripeIntent.NextActionData.WeChatPayRedirect.class, "com.stripe:stripe-wechatpay:20.21.0"));
        ACTION_DEPENDENCY_MAP = mapOf;
    }

    public UnsupportedAuthenticator(Function1<AuthActivityStarterHost, PaymentRelayStarter> paymentRelayStarterFactory) {
        Intrinsics.checkNotNullParameter(paymentRelayStarterFactory, "paymentRelayStarterFactory");
        this.paymentRelayStarterFactory = paymentRelayStarterFactory;
    }

    @Override // com.stripe.android.payments.core.authentication.PaymentAuthenticator
    public /* bridge */ /* synthetic */ Object performAuthentication(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, ApiRequest.Options options, Continuation continuation) {
        return performAuthentication2(authActivityStarterHost, stripeIntent, options, (Continuation<Unit>) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0038, code lost:
        if (r6 == null) goto L8;
     */
    /* renamed from: performAuthentication  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object performAuthentication2(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, ApiRequest.Options options, Continuation<Unit> continuation) {
        StripeException create;
        StripeIntent.NextActionData nextActionData = stripeIntent.getNextActionData();
        if (nextActionData != null) {
            Class<?> cls = nextActionData.getClass();
            StripeException.Companion companion = StripeException.Companion;
            String simpleName = cls.getSimpleName();
            String str = ACTION_DEPENDENCY_MAP.get(cls);
            create = companion.create(new IllegalArgumentException(simpleName + " type is not supported, add " + ((Object) str) + " in build.gradle to support it"));
        }
        create = StripeException.Companion.create(new IllegalArgumentException("stripeIntent.nextActionData is null"));
        this.paymentRelayStarterFactory.invoke(authActivityStarterHost).start(new PaymentRelayStarter.Args.ErrorArgs(create, StripeIntentKtxKt.getRequestCode(stripeIntent)));
        return Unit.INSTANCE;
    }
}
