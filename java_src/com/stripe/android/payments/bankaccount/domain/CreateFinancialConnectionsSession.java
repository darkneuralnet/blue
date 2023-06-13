package com.stripe.android.payments.bankaccount.domain;

import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.CreateFinancialConnectionsSessionParams;
import com.stripe.android.model.FinancialConnectionsSession;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.networking.StripeRepository;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JN\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000fJN\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0011\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;", "", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "(Lcom/stripe/android/networking/StripeRepository;)V", "forPaymentIntent", "Lkotlin/Result;", "Lcom/stripe/android/model/FinancialConnectionsSession;", "publishableKey", "", "clientSecret", "customerName", "customerEmail", NamedConstantsKt.STRIPE_ACCOUNT_ID, "forPaymentIntent-hUnOzRk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forSetupIntent", "forSetupIntent-hUnOzRk", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nCreateFinancialConnectionsSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateFinancialConnectionsSession.kt\ncom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n1#2:64\n*E\n"})
/* loaded from: classes7.dex */
public final class CreateFinancialConnectionsSession {
    private final StripeRepository stripeRepository;

    public CreateFinancialConnectionsSession(StripeRepository stripeRepository) {
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        this.stripeRepository = stripeRepository;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:10)(2:27|28))(3:29|30|(1:32))|11|12|(3:17|18|(2:20|21)(2:22|23))|14|15))|35|6|7|(0)(0)|11|12|(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
        r2 = kotlin.Result.Companion;
        r0 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: forPaymentIntent-hUnOzRk  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116582forPaymentIntenthUnOzRk(String str, String str2, String str3, String str4, String str5, Continuation<? super Result<FinancialConnectionsSession>> continuation) {
        CreateFinancialConnectionsSession$forPaymentIntent$1 createFinancialConnectionsSession$forPaymentIntent$1;
        Object coroutine_suspended;
        int i;
        Object m116783constructorimpl;
        if (continuation instanceof CreateFinancialConnectionsSession$forPaymentIntent$1) {
            createFinancialConnectionsSession$forPaymentIntent$1 = (CreateFinancialConnectionsSession$forPaymentIntent$1) continuation;
            int i2 = createFinancialConnectionsSession$forPaymentIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                createFinancialConnectionsSession$forPaymentIntent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = createFinancialConnectionsSession$forPaymentIntent$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = createFinancialConnectionsSession$forPaymentIntent$1.label;
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
                    String paymentIntentId$payments_core_release = new PaymentIntent.ClientSecret(str2).getPaymentIntentId$payments_core_release();
                    CreateFinancialConnectionsSessionParams createFinancialConnectionsSessionParams = new CreateFinancialConnectionsSessionParams(str2, str3, str4);
                    ApiRequest.Options options = new ApiRequest.Options(str, str5, null, 4, null);
                    createFinancialConnectionsSession$forPaymentIntent$1.label = 1;
                    obj = stripeRepository.mo45462x3a63d1f9(paymentIntentId$payments_core_release, createFinancialConnectionsSessionParams, options, createFinancialConnectionsSession$forPaymentIntent$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                m116783constructorimpl = Result.m116783constructorimpl((FinancialConnectionsSession) obj);
                if (Result.m116790isSuccessimpl(m116783constructorimpl)) {
                    try {
                        FinancialConnectionsSession financialConnectionsSession = (FinancialConnectionsSession) m116783constructorimpl;
                        if (financialConnectionsSession != null) {
                            return Result.m116783constructorimpl(financialConnectionsSession);
                        }
                        throw new InternalError("Error creating session for PaymentIntent");
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        m116783constructorimpl = ResultKt.createFailure(th);
                    }
                }
                return Result.m116783constructorimpl(m116783constructorimpl);
            }
        }
        createFinancialConnectionsSession$forPaymentIntent$1 = new CreateFinancialConnectionsSession$forPaymentIntent$1(this, continuation);
        Object obj2 = createFinancialConnectionsSession$forPaymentIntent$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = createFinancialConnectionsSession$forPaymentIntent$1.label;
        if (i == 0) {
        }
        m116783constructorimpl = Result.m116783constructorimpl((FinancialConnectionsSession) obj2);
        if (Result.m116790isSuccessimpl(m116783constructorimpl)) {
        }
        return Result.m116783constructorimpl(m116783constructorimpl);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:10)(2:27|28))(3:29|30|(1:32))|11|12|(3:17|18|(2:20|21)(2:22|23))|14|15))|35|6|7|(0)(0)|11|12|(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
        r2 = kotlin.Result.Companion;
        r0 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: forSetupIntent-hUnOzRk  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116583forSetupIntenthUnOzRk(String str, String str2, String str3, String str4, String str5, Continuation<? super Result<FinancialConnectionsSession>> continuation) {
        CreateFinancialConnectionsSession$forSetupIntent$1 createFinancialConnectionsSession$forSetupIntent$1;
        Object coroutine_suspended;
        int i;
        Object m116783constructorimpl;
        if (continuation instanceof CreateFinancialConnectionsSession$forSetupIntent$1) {
            createFinancialConnectionsSession$forSetupIntent$1 = (CreateFinancialConnectionsSession$forSetupIntent$1) continuation;
            int i2 = createFinancialConnectionsSession$forSetupIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                createFinancialConnectionsSession$forSetupIntent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = createFinancialConnectionsSession$forSetupIntent$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = createFinancialConnectionsSession$forSetupIntent$1.label;
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
                    String setupIntentId$payments_core_release = new SetupIntent.ClientSecret(str2).getSetupIntentId$payments_core_release();
                    CreateFinancialConnectionsSessionParams createFinancialConnectionsSessionParams = new CreateFinancialConnectionsSessionParams(str2, str3, str4);
                    ApiRequest.Options options = new ApiRequest.Options(str, str5, null, 4, null);
                    createFinancialConnectionsSession$forSetupIntent$1.label = 1;
                    obj = stripeRepository.mo45461x9b93a6a2(setupIntentId$payments_core_release, createFinancialConnectionsSessionParams, options, createFinancialConnectionsSession$forSetupIntent$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                m116783constructorimpl = Result.m116783constructorimpl((FinancialConnectionsSession) obj);
                if (Result.m116790isSuccessimpl(m116783constructorimpl)) {
                    try {
                        FinancialConnectionsSession financialConnectionsSession = (FinancialConnectionsSession) m116783constructorimpl;
                        if (financialConnectionsSession != null) {
                            return Result.m116783constructorimpl(financialConnectionsSession);
                        }
                        throw new InternalError("Error creating session for SetupIntent");
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        m116783constructorimpl = ResultKt.createFailure(th);
                    }
                }
                return Result.m116783constructorimpl(m116783constructorimpl);
            }
        }
        createFinancialConnectionsSession$forSetupIntent$1 = new CreateFinancialConnectionsSession$forSetupIntent$1(this, continuation);
        Object obj2 = createFinancialConnectionsSession$forSetupIntent$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = createFinancialConnectionsSession$forSetupIntent$1.label;
        if (i == 0) {
        }
        m116783constructorimpl = Result.m116783constructorimpl((FinancialConnectionsSession) obj2);
        if (Result.m116790isSuccessimpl(m116783constructorimpl)) {
        }
        return Result.m116783constructorimpl(m116783constructorimpl);
    }
}
