package com.stripe.android.link.confirmation;

import com.stripe.android.link.confirmation.ConfirmationManager;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.paymentlauncher.PaymentLauncher;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import com.stripe.android.payments.paymentlauncher.PaymentResult;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u000e\b\u0001\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a\u0012\u0010\b\u0001\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u001a¢\u0006\u0004\b#\u0010$J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u0004J/\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u001c\u0010\u0010\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000e\u0012\u0004\u0012\u00020\u00040\rj\u0002`\u000fø\u0001\u0000J7\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u001c\u0010\u0010\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000e\u0012\u0004\u0012\u00020\u00040\rj\u0002`\u000fø\u0001\u0000R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R3\u0010!\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000e\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rj\u0004\u0018\u0001`\u000f8\u0002@\u0002X\u0082\u000eø\u0001\u0000¢\u0006\u0006\n\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, m28432d2 = {"Lcom/stripe/android/link/confirmation/ConfirmationManager;", "", "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;", "paymentResult", "", "onPaymentResult", "(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)Lkotlin/Unit;", "Lu5;", "activityResultCaller", "setupPaymentLauncher", "invalidatePaymentLauncher", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "confirmStripeIntentParams", "Lkotlin/Function1;", "Lkotlin/Result;", "Lcom/stripe/android/link/confirmation/PaymentConfirmationCallback;", "onResult", "confirmStripeIntent", "", "clientSecret", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "handleNextAction", "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;", "paymentLauncherFactory", "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;", "Lkotlin/Function0;", "publishableKeyProvider", "Lkotlin/jvm/functions/Function0;", "stripeAccountIdProvider", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;", "paymentLauncher", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;", "completionCallback", "Lkotlin/jvm/functions/Function1;", "<init>", "(Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class ConfirmationManager {
    private Function1<? super Result<? extends PaymentResult>, Unit> completionCallback;
    private PaymentLauncher paymentLauncher;
    private final StripePaymentLauncherAssistedFactory paymentLauncherFactory;
    private final Function0<String> publishableKeyProvider;
    private final Function0<String> stripeAccountIdProvider;

    public ConfirmationManager(StripePaymentLauncherAssistedFactory paymentLauncherFactory, Function0<String> publishableKeyProvider, Function0<String> stripeAccountIdProvider) {
        Intrinsics.checkNotNullParameter(paymentLauncherFactory, "paymentLauncherFactory");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(stripeAccountIdProvider, "stripeAccountIdProvider");
        this.paymentLauncherFactory = paymentLauncherFactory;
        this.publishableKeyProvider = publishableKeyProvider;
        this.stripeAccountIdProvider = stripeAccountIdProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Unit onPaymentResult(PaymentResult paymentResult) {
        Function1<? super Result<? extends PaymentResult>, Unit> function1 = this.completionCallback;
        if (function1 != null) {
            function1.invoke(Result.m116782boximpl(Result.m116783constructorimpl(paymentResult)));
            return Unit.INSTANCE;
        }
        return null;
    }

    public final void confirmStripeIntent(ConfirmStripeIntentParams confirmStripeIntentParams, Function1<? super Result<? extends PaymentResult>, Unit> onResult) {
        Object m116783constructorimpl;
        PaymentLauncher paymentLauncher;
        Intrinsics.checkNotNullParameter(confirmStripeIntentParams, "confirmStripeIntentParams");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        this.completionCallback = onResult;
        try {
            Result.Companion companion = Result.Companion;
            paymentLauncher = this.paymentLauncher;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        if (paymentLauncher != null) {
            m116783constructorimpl = Result.m116783constructorimpl(paymentLauncher);
            Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
            if (m116786exceptionOrNullimpl == null) {
                PaymentLauncher paymentLauncher2 = (PaymentLauncher) m116783constructorimpl;
                if (confirmStripeIntentParams instanceof ConfirmPaymentIntentParams) {
                    paymentLauncher2.confirm((ConfirmPaymentIntentParams) confirmStripeIntentParams);
                    return;
                } else if (confirmStripeIntentParams instanceof ConfirmSetupIntentParams) {
                    paymentLauncher2.confirm((ConfirmSetupIntentParams) confirmStripeIntentParams);
                    return;
                } else {
                    return;
                }
            }
            onResult.invoke(Result.m116782boximpl(Result.m116783constructorimpl(ResultKt.createFailure(m116786exceptionOrNullimpl))));
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void handleNextAction(String clientSecret, StripeIntent stripeIntent, Function1<? super Result<? extends PaymentResult>, Unit> onResult) {
        Object m116783constructorimpl;
        PaymentLauncher paymentLauncher;
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        this.completionCallback = onResult;
        try {
            Result.Companion companion = Result.Companion;
            paymentLauncher = this.paymentLauncher;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        if (paymentLauncher != null) {
            m116783constructorimpl = Result.m116783constructorimpl(paymentLauncher);
            Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
            if (m116786exceptionOrNullimpl == null) {
                PaymentLauncher paymentLauncher2 = (PaymentLauncher) m116783constructorimpl;
                if (stripeIntent instanceof PaymentIntent) {
                    paymentLauncher2.handleNextActionForPaymentIntent(clientSecret);
                    return;
                } else if (stripeIntent instanceof SetupIntent) {
                    paymentLauncher2.handleNextActionForSetupIntent(clientSecret);
                    return;
                } else {
                    return;
                }
            }
            onResult.invoke(Result.m116782boximpl(Result.m116783constructorimpl(ResultKt.createFailure(m116786exceptionOrNullimpl))));
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void invalidatePaymentLauncher() {
        this.paymentLauncher = null;
    }

    public final void setupPaymentLauncher(InterfaceC29050u5 activityResultCaller) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        StripePaymentLauncherAssistedFactory stripePaymentLauncherAssistedFactory = this.paymentLauncherFactory;
        Function0<String> function0 = this.publishableKeyProvider;
        Function0<String> function02 = this.stripeAccountIdProvider;
        AbstractC0407B5<PaymentLauncherContract.Args> registerForActivityResult = activityResultCaller.registerForActivityResult(new PaymentLauncherContract(), new InterfaceC28515t5() { // from class: Xx0
            @Override // p000.InterfaceC28515t5
            /* renamed from: a */
            public final void mo1514a(Object obj) {
                ConfirmationManager.this.onPaymentResult((PaymentResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "activityResultCaller.reg…ymentResult\n            )");
        this.paymentLauncher = stripePaymentLauncherAssistedFactory.create(function0, function02, registerForActivityResult);
    }
}
