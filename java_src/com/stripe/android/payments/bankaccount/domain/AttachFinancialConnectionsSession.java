package com.stripe.android.payments.bankaccount.domain;

import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.networking.StripeRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JD\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000eJD\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0011\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;", "", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "(Lcom/stripe/android/networking/StripeRepository;)V", "forPaymentIntent", "Lkotlin/Result;", "Lcom/stripe/android/model/PaymentIntent;", "publishableKey", "", "linkedAccountSessionId", "clientSecret", NamedConstantsKt.STRIPE_ACCOUNT_ID, "forPaymentIntent-yxL6bBk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forSetupIntent", "Lcom/stripe/android/model/SetupIntent;", "forSetupIntent-yxL6bBk", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nAttachFinancialConnectionsSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttachFinancialConnectionsSession.kt\ncom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n1#2:66\n*E\n"})
/* loaded from: classes7.dex */
public final class AttachFinancialConnectionsSession {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final List<String> EXPAND_PAYMENT_METHOD;
    private final StripeRepository stripeRepository;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession$Companion;", "", "()V", "EXPAND_PAYMENT_METHOD", "", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        List<String> listOf;
        listOf = CollectionsKt__CollectionsJVMKt.listOf("payment_method");
        EXPAND_PAYMENT_METHOD = listOf;
    }

    public AttachFinancialConnectionsSession(StripeRepository stripeRepository) {
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        this.stripeRepository = stripeRepository;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:10)(2:27|28))(3:29|30|(1:32))|11|12|(3:17|18|(2:20|21)(2:22|23))|14|15))|35|6|7|(0)(0)|11|12|(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
        r2 = kotlin.Result.Companion;
        r0 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: forPaymentIntent-yxL6bBk  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116580forPaymentIntentyxL6bBk(String str, String str2, String str3, String str4, Continuation<? super Result<PaymentIntent>> continuation) {
        AttachFinancialConnectionsSession$forPaymentIntent$1 attachFinancialConnectionsSession$forPaymentIntent$1;
        Object coroutine_suspended;
        int i;
        Object m116783constructorimpl;
        if (continuation instanceof AttachFinancialConnectionsSession$forPaymentIntent$1) {
            attachFinancialConnectionsSession$forPaymentIntent$1 = (AttachFinancialConnectionsSession$forPaymentIntent$1) continuation;
            int i2 = attachFinancialConnectionsSession$forPaymentIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                attachFinancialConnectionsSession$forPaymentIntent$1.label = i2 - Integer.MIN_VALUE;
                AttachFinancialConnectionsSession$forPaymentIntent$1 attachFinancialConnectionsSession$forPaymentIntent$12 = attachFinancialConnectionsSession$forPaymentIntent$1;
                Object obj = attachFinancialConnectionsSession$forPaymentIntent$12.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = attachFinancialConnectionsSession$forPaymentIntent$12.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    StripeRepository stripeRepository = this.stripeRepository;
                    String paymentIntentId$payments_core_release = new PaymentIntent.ClientSecret(str3).getPaymentIntentId$payments_core_release();
                    ApiRequest.Options options = new ApiRequest.Options(str, str4, null, 4, null);
                    List<String> list = EXPAND_PAYMENT_METHOD;
                    attachFinancialConnectionsSession$forPaymentIntent$12.label = 1;
                    obj = stripeRepository.attachFinancialConnectionsSessionToPaymentIntent(str3, paymentIntentId$payments_core_release, str2, options, list, attachFinancialConnectionsSession$forPaymentIntent$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                m116783constructorimpl = Result.m116783constructorimpl((PaymentIntent) obj);
                if (Result.m116790isSuccessimpl(m116783constructorimpl)) {
                    try {
                        PaymentIntent paymentIntent = (PaymentIntent) m116783constructorimpl;
                        if (paymentIntent != null) {
                            return Result.m116783constructorimpl(paymentIntent);
                        }
                        throw new InternalError("Error attaching session to PaymentIntent");
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        m116783constructorimpl = ResultKt.createFailure(th);
                    }
                }
                return Result.m116783constructorimpl(m116783constructorimpl);
            }
        }
        attachFinancialConnectionsSession$forPaymentIntent$1 = new AttachFinancialConnectionsSession$forPaymentIntent$1(this, continuation);
        AttachFinancialConnectionsSession$forPaymentIntent$1 attachFinancialConnectionsSession$forPaymentIntent$122 = attachFinancialConnectionsSession$forPaymentIntent$1;
        Object obj2 = attachFinancialConnectionsSession$forPaymentIntent$122.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = attachFinancialConnectionsSession$forPaymentIntent$122.label;
        if (i == 0) {
        }
        m116783constructorimpl = Result.m116783constructorimpl((PaymentIntent) obj2);
        if (Result.m116790isSuccessimpl(m116783constructorimpl)) {
        }
        return Result.m116783constructorimpl(m116783constructorimpl);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:10)(2:27|28))(3:29|30|(1:32))|11|12|(3:17|18|(2:20|21)(2:22|23))|14|15))|35|6|7|(0)(0)|11|12|(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
        r2 = kotlin.Result.Companion;
        r0 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: forSetupIntent-yxL6bBk  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116581forSetupIntentyxL6bBk(String str, String str2, String str3, String str4, Continuation<? super Result<SetupIntent>> continuation) {
        AttachFinancialConnectionsSession$forSetupIntent$1 attachFinancialConnectionsSession$forSetupIntent$1;
        Object coroutine_suspended;
        int i;
        Object m116783constructorimpl;
        if (continuation instanceof AttachFinancialConnectionsSession$forSetupIntent$1) {
            attachFinancialConnectionsSession$forSetupIntent$1 = (AttachFinancialConnectionsSession$forSetupIntent$1) continuation;
            int i2 = attachFinancialConnectionsSession$forSetupIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                attachFinancialConnectionsSession$forSetupIntent$1.label = i2 - Integer.MIN_VALUE;
                AttachFinancialConnectionsSession$forSetupIntent$1 attachFinancialConnectionsSession$forSetupIntent$12 = attachFinancialConnectionsSession$forSetupIntent$1;
                Object obj = attachFinancialConnectionsSession$forSetupIntent$12.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = attachFinancialConnectionsSession$forSetupIntent$12.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    StripeRepository stripeRepository = this.stripeRepository;
                    String setupIntentId$payments_core_release = new SetupIntent.ClientSecret(str3).getSetupIntentId$payments_core_release();
                    ApiRequest.Options options = new ApiRequest.Options(str, str4, null, 4, null);
                    List<String> list = EXPAND_PAYMENT_METHOD;
                    attachFinancialConnectionsSession$forSetupIntent$12.label = 1;
                    obj = stripeRepository.attachFinancialConnectionsSessionToSetupIntent(str3, setupIntentId$payments_core_release, str2, options, list, attachFinancialConnectionsSession$forSetupIntent$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                m116783constructorimpl = Result.m116783constructorimpl((SetupIntent) obj);
                if (Result.m116790isSuccessimpl(m116783constructorimpl)) {
                    try {
                        SetupIntent setupIntent = (SetupIntent) m116783constructorimpl;
                        if (setupIntent != null) {
                            return Result.m116783constructorimpl(setupIntent);
                        }
                        throw new InternalError("Error attaching session to SetupIntent");
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        m116783constructorimpl = ResultKt.createFailure(th);
                    }
                }
                return Result.m116783constructorimpl(m116783constructorimpl);
            }
        }
        attachFinancialConnectionsSession$forSetupIntent$1 = new AttachFinancialConnectionsSession$forSetupIntent$1(this, continuation);
        AttachFinancialConnectionsSession$forSetupIntent$1 attachFinancialConnectionsSession$forSetupIntent$122 = attachFinancialConnectionsSession$forSetupIntent$1;
        Object obj2 = attachFinancialConnectionsSession$forSetupIntent$122.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = attachFinancialConnectionsSession$forSetupIntent$122.label;
        if (i == 0) {
        }
        m116783constructorimpl = Result.m116783constructorimpl((SetupIntent) obj2);
        if (Result.m116790isSuccessimpl(m116783constructorimpl)) {
        }
        return Result.m116783constructorimpl(m116783constructorimpl);
    }
}
