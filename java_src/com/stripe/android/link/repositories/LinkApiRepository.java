package com.stripe.android.link.repositories;

import com.stripe.android.core.injection.IOContext;
import com.stripe.android.link.LinkPaymentDetails;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.ConsumerPaymentDetailsUpdateParams;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.model.ConsumerSignUpConsentAction;
import com.stripe.android.model.FinancialConnectionsSession;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.repository.ConsumersApiService;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 F2\u00020\u0001:\u0001FBM\b\u0007\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJF\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0016\u0010\u0017JV\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001d\u001a\u00020\u001eH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u001f\u0010 J<\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00102\u0006\u0010#\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b$\u0010%JL\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u00102\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020,2\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b-\u0010.J4\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u00102\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b1\u00102J<\u00103\u001a\b\u0012\u0004\u0012\u0002040\u00102\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b6\u0010%J4\u00107\u001a\b\u0012\u0004\u0012\u0002080\u00102\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b9\u00102J>\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b;\u0010%J6\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b>\u00102J>\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b@\u0010%J<\u0010A\u001a\b\u0012\u0004\u0012\u0002080\u00102\u0006\u0010B\u001a\u00020C2\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\bD\u0010ER\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006G"}, m28432d2 = {"Lcom/stripe/android/link/repositories/LinkApiRepository;", "Lcom/stripe/android/link/repositories/LinkRepository;", "publishableKeyProvider", "Lkotlin/Function0;", "", "stripeAccountIdProvider", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "consumersApiService", "Lcom/stripe/android/repository/ConsumersApiService;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "locale", "Ljava/util/Locale;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/repository/ConsumersApiService;Lkotlin/coroutines/CoroutineContext;Ljava/util/Locale;)V", "confirmVerification", "Lkotlin/Result;", "Lcom/stripe/android/model/ConsumerSession;", "verificationCode", "consumerSessionClientSecret", "consumerPublishableKey", "authSessionCookie", "confirmVerification-yxL6bBk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumerSignUp", "email", PaymentMethod.BillingDetails.PARAM_PHONE, "country", "name", "consentAction", "Lcom/stripe/android/model/ConsumerSignUpConsentAction;", "consumerSignUp-bMdYcbs", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConsumerSignUpConsentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createBankAccountPaymentDetails", "Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;", "financialConnectionsAccountId", "createBankAccountPaymentDetails-BWLJW6A", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCardPaymentDetails", "Lcom/stripe/android/link/LinkPaymentDetails$New;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "userEmail", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "createCardPaymentDetails-hUnOzRk", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createFinancialConnectionsSession", "Lcom/stripe/android/model/FinancialConnectionsSession;", "createFinancialConnectionsSession-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePaymentDetails", "", "paymentDetailsId", "deletePaymentDetails-BWLJW6A", "listPaymentDetails", "Lcom/stripe/android/model/ConsumerPaymentDetails;", "listPaymentDetails-0E7RQCE", "logout", "logout-BWLJW6A", "lookupConsumer", "Lcom/stripe/android/model/ConsumerSessionLookup;", "lookupConsumer-0E7RQCE", "startVerification", "startVerification-BWLJW6A", "updatePaymentDetails", "updateParams", "Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;", "updatePaymentDetails-BWLJW6A", "(Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class LinkApiRepository implements LinkRepository {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    public static final String REQUEST_SURFACE = "android_payment_element";
    private final ConsumersApiService consumersApiService;
    private final Locale locale;
    private final Function0<String> publishableKeyProvider;
    private final Function0<String> stripeAccountIdProvider;
    private final StripeRepository stripeRepository;
    private final CoroutineContext workContext;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/link/repositories/LinkApiRepository$Companion;", "", "()V", "REQUEST_SURFACE", "", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public LinkApiRepository(Function0<String> publishableKeyProvider, Function0<String> stripeAccountIdProvider, StripeRepository stripeRepository, ConsumersApiService consumersApiService, @IOContext CoroutineContext workContext, Locale locale) {
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(stripeAccountIdProvider, "stripeAccountIdProvider");
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(consumersApiService, "consumersApiService");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.publishableKeyProvider = publishableKeyProvider;
        this.stripeAccountIdProvider = stripeAccountIdProvider;
        this.stripeRepository = stripeRepository;
        this.consumersApiService = consumersApiService;
        this.workContext = workContext;
        this.locale = locale;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // com.stripe.android.link.repositories.LinkRepository
    /* renamed from: confirmVerification-yxL6bBk  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo116500confirmVerificationyxL6bBk(String str, String str2, String str3, String str4, Continuation<? super Result<ConsumerSession>> continuation) {
        LinkApiRepository$confirmVerification$1 linkApiRepository$confirmVerification$1;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof LinkApiRepository$confirmVerification$1) {
            linkApiRepository$confirmVerification$1 = (LinkApiRepository$confirmVerification$1) continuation;
            int i2 = linkApiRepository$confirmVerification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkApiRepository$confirmVerification$1.label = i2 - Integer.MIN_VALUE;
                LinkApiRepository$confirmVerification$1 linkApiRepository$confirmVerification$12 = linkApiRepository$confirmVerification$1;
                Object obj = linkApiRepository$confirmVerification$12.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = linkApiRepository$confirmVerification$12.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    CoroutineContext coroutineContext = this.workContext;
                    LinkApiRepository$confirmVerification$2 linkApiRepository$confirmVerification$2 = new LinkApiRepository$confirmVerification$2(this, str2, str, str4, str3, null);
                    linkApiRepository$confirmVerification$12.label = 1;
                    obj = X30.m77504g(coroutineContext, linkApiRepository$confirmVerification$2, linkApiRepository$confirmVerification$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return ((Result) obj).m116792unboximpl();
            }
        }
        linkApiRepository$confirmVerification$1 = new LinkApiRepository$confirmVerification$1(this, continuation);
        LinkApiRepository$confirmVerification$1 linkApiRepository$confirmVerification$122 = linkApiRepository$confirmVerification$1;
        Object obj2 = linkApiRepository$confirmVerification$122.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = linkApiRepository$confirmVerification$122.label;
        if (i == 0) {
        }
        return ((Result) obj2).m116792unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // com.stripe.android.link.repositories.LinkRepository
    /* renamed from: consumerSignUp-bMdYcbs  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo116501consumerSignUpbMdYcbs(String str, String str2, String str3, String str4, String str5, ConsumerSignUpConsentAction consumerSignUpConsentAction, Continuation<? super Result<ConsumerSession>> continuation) {
        LinkApiRepository$consumerSignUp$1 linkApiRepository$consumerSignUp$1;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof LinkApiRepository$consumerSignUp$1) {
            linkApiRepository$consumerSignUp$1 = (LinkApiRepository$consumerSignUp$1) continuation;
            int i2 = linkApiRepository$consumerSignUp$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkApiRepository$consumerSignUp$1.label = i2 - Integer.MIN_VALUE;
                LinkApiRepository$consumerSignUp$1 linkApiRepository$consumerSignUp$12 = linkApiRepository$consumerSignUp$1;
                Object obj = linkApiRepository$consumerSignUp$12.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = linkApiRepository$consumerSignUp$12.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    CoroutineContext coroutineContext = this.workContext;
                    LinkApiRepository$consumerSignUp$2 linkApiRepository$consumerSignUp$2 = new LinkApiRepository$consumerSignUp$2(this, str, str2, str3, str4, str5, consumerSignUpConsentAction, null);
                    linkApiRepository$consumerSignUp$12.label = 1;
                    obj = X30.m77504g(coroutineContext, linkApiRepository$consumerSignUp$2, linkApiRepository$consumerSignUp$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return ((Result) obj).m116792unboximpl();
            }
        }
        linkApiRepository$consumerSignUp$1 = new LinkApiRepository$consumerSignUp$1(this, continuation);
        LinkApiRepository$consumerSignUp$1 linkApiRepository$consumerSignUp$122 = linkApiRepository$consumerSignUp$1;
        Object obj2 = linkApiRepository$consumerSignUp$122.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = linkApiRepository$consumerSignUp$122.label;
        if (i == 0) {
        }
        return ((Result) obj2).m116792unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // com.stripe.android.link.repositories.LinkRepository
    /* renamed from: createBankAccountPaymentDetails-BWLJW6A  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo116502createBankAccountPaymentDetailsBWLJW6A(String str, String str2, String str3, Continuation<? super Result<ConsumerPaymentDetails.BankAccount>> continuation) {
        LinkApiRepository$createBankAccountPaymentDetails$1 linkApiRepository$createBankAccountPaymentDetails$1;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof LinkApiRepository$createBankAccountPaymentDetails$1) {
            linkApiRepository$createBankAccountPaymentDetails$1 = (LinkApiRepository$createBankAccountPaymentDetails$1) continuation;
            int i2 = linkApiRepository$createBankAccountPaymentDetails$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkApiRepository$createBankAccountPaymentDetails$1.label = i2 - Integer.MIN_VALUE;
                Object obj = linkApiRepository$createBankAccountPaymentDetails$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = linkApiRepository$createBankAccountPaymentDetails$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    CoroutineContext coroutineContext = this.workContext;
                    LinkApiRepository$createBankAccountPaymentDetails$2 linkApiRepository$createBankAccountPaymentDetails$2 = new LinkApiRepository$createBankAccountPaymentDetails$2(this, str2, str, str3, null);
                    linkApiRepository$createBankAccountPaymentDetails$1.label = 1;
                    obj = X30.m77504g(coroutineContext, linkApiRepository$createBankAccountPaymentDetails$2, linkApiRepository$createBankAccountPaymentDetails$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return ((Result) obj).m116792unboximpl();
            }
        }
        linkApiRepository$createBankAccountPaymentDetails$1 = new LinkApiRepository$createBankAccountPaymentDetails$1(this, continuation);
        Object obj2 = linkApiRepository$createBankAccountPaymentDetails$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = linkApiRepository$createBankAccountPaymentDetails$1.label;
        if (i == 0) {
        }
        return ((Result) obj2).m116792unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // com.stripe.android.link.repositories.LinkRepository
    /* renamed from: createCardPaymentDetails-hUnOzRk  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo116503createCardPaymentDetailshUnOzRk(PaymentMethodCreateParams paymentMethodCreateParams, String str, StripeIntent stripeIntent, String str2, String str3, Continuation<? super Result<LinkPaymentDetails.New>> continuation) {
        LinkApiRepository$createCardPaymentDetails$1 linkApiRepository$createCardPaymentDetails$1;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof LinkApiRepository$createCardPaymentDetails$1) {
            linkApiRepository$createCardPaymentDetails$1 = (LinkApiRepository$createCardPaymentDetails$1) continuation;
            int i2 = linkApiRepository$createCardPaymentDetails$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkApiRepository$createCardPaymentDetails$1.label = i2 - Integer.MIN_VALUE;
                LinkApiRepository$createCardPaymentDetails$1 linkApiRepository$createCardPaymentDetails$12 = linkApiRepository$createCardPaymentDetails$1;
                Object obj = linkApiRepository$createCardPaymentDetails$12.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = linkApiRepository$createCardPaymentDetails$12.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    CoroutineContext coroutineContext = this.workContext;
                    LinkApiRepository$createCardPaymentDetails$2 linkApiRepository$createCardPaymentDetails$2 = new LinkApiRepository$createCardPaymentDetails$2(this, str2, paymentMethodCreateParams, str, str3, null);
                    linkApiRepository$createCardPaymentDetails$12.label = 1;
                    obj = X30.m77504g(coroutineContext, linkApiRepository$createCardPaymentDetails$2, linkApiRepository$createCardPaymentDetails$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return ((Result) obj).m116792unboximpl();
            }
        }
        linkApiRepository$createCardPaymentDetails$1 = new LinkApiRepository$createCardPaymentDetails$1(this, continuation);
        LinkApiRepository$createCardPaymentDetails$1 linkApiRepository$createCardPaymentDetails$122 = linkApiRepository$createCardPaymentDetails$1;
        Object obj2 = linkApiRepository$createCardPaymentDetails$122.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = linkApiRepository$createCardPaymentDetails$122.label;
        if (i == 0) {
        }
        return ((Result) obj2).m116792unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // com.stripe.android.link.repositories.LinkRepository
    /* renamed from: createFinancialConnectionsSession-0E7RQCE  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo116504createFinancialConnectionsSession0E7RQCE(String str, String str2, Continuation<? super Result<FinancialConnectionsSession>> continuation) {
        LinkApiRepository$createFinancialConnectionsSession$1 linkApiRepository$createFinancialConnectionsSession$1;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof LinkApiRepository$createFinancialConnectionsSession$1) {
            linkApiRepository$createFinancialConnectionsSession$1 = (LinkApiRepository$createFinancialConnectionsSession$1) continuation;
            int i2 = linkApiRepository$createFinancialConnectionsSession$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkApiRepository$createFinancialConnectionsSession$1.label = i2 - Integer.MIN_VALUE;
                Object obj = linkApiRepository$createFinancialConnectionsSession$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = linkApiRepository$createFinancialConnectionsSession$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    CoroutineContext coroutineContext = this.workContext;
                    LinkApiRepository$createFinancialConnectionsSession$2 linkApiRepository$createFinancialConnectionsSession$2 = new LinkApiRepository$createFinancialConnectionsSession$2(this, str, str2, null);
                    linkApiRepository$createFinancialConnectionsSession$1.label = 1;
                    obj = X30.m77504g(coroutineContext, linkApiRepository$createFinancialConnectionsSession$2, linkApiRepository$createFinancialConnectionsSession$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return ((Result) obj).m116792unboximpl();
            }
        }
        linkApiRepository$createFinancialConnectionsSession$1 = new LinkApiRepository$createFinancialConnectionsSession$1(this, continuation);
        Object obj2 = linkApiRepository$createFinancialConnectionsSession$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = linkApiRepository$createFinancialConnectionsSession$1.label;
        if (i == 0) {
        }
        return ((Result) obj2).m116792unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // com.stripe.android.link.repositories.LinkRepository
    /* renamed from: deletePaymentDetails-BWLJW6A  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo116505deletePaymentDetailsBWLJW6A(String str, String str2, String str3, Continuation<? super Result<Unit>> continuation) {
        LinkApiRepository$deletePaymentDetails$1 linkApiRepository$deletePaymentDetails$1;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof LinkApiRepository$deletePaymentDetails$1) {
            linkApiRepository$deletePaymentDetails$1 = (LinkApiRepository$deletePaymentDetails$1) continuation;
            int i2 = linkApiRepository$deletePaymentDetails$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkApiRepository$deletePaymentDetails$1.label = i2 - Integer.MIN_VALUE;
                Object obj = linkApiRepository$deletePaymentDetails$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = linkApiRepository$deletePaymentDetails$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    CoroutineContext coroutineContext = this.workContext;
                    LinkApiRepository$deletePaymentDetails$2 linkApiRepository$deletePaymentDetails$2 = new LinkApiRepository$deletePaymentDetails$2(this, str2, str, str3, null);
                    linkApiRepository$deletePaymentDetails$1.label = 1;
                    obj = X30.m77504g(coroutineContext, linkApiRepository$deletePaymentDetails$2, linkApiRepository$deletePaymentDetails$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return ((Result) obj).m116792unboximpl();
            }
        }
        linkApiRepository$deletePaymentDetails$1 = new LinkApiRepository$deletePaymentDetails$1(this, continuation);
        Object obj2 = linkApiRepository$deletePaymentDetails$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = linkApiRepository$deletePaymentDetails$1.label;
        if (i == 0) {
        }
        return ((Result) obj2).m116792unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // com.stripe.android.link.repositories.LinkRepository
    /* renamed from: listPaymentDetails-0E7RQCE  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo116506listPaymentDetails0E7RQCE(String str, String str2, Continuation<? super Result<ConsumerPaymentDetails>> continuation) {
        LinkApiRepository$listPaymentDetails$1 linkApiRepository$listPaymentDetails$1;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof LinkApiRepository$listPaymentDetails$1) {
            linkApiRepository$listPaymentDetails$1 = (LinkApiRepository$listPaymentDetails$1) continuation;
            int i2 = linkApiRepository$listPaymentDetails$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkApiRepository$listPaymentDetails$1.label = i2 - Integer.MIN_VALUE;
                Object obj = linkApiRepository$listPaymentDetails$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = linkApiRepository$listPaymentDetails$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    CoroutineContext coroutineContext = this.workContext;
                    LinkApiRepository$listPaymentDetails$2 linkApiRepository$listPaymentDetails$2 = new LinkApiRepository$listPaymentDetails$2(this, str, str2, null);
                    linkApiRepository$listPaymentDetails$1.label = 1;
                    obj = X30.m77504g(coroutineContext, linkApiRepository$listPaymentDetails$2, linkApiRepository$listPaymentDetails$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return ((Result) obj).m116792unboximpl();
            }
        }
        linkApiRepository$listPaymentDetails$1 = new LinkApiRepository$listPaymentDetails$1(this, continuation);
        Object obj2 = linkApiRepository$listPaymentDetails$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = linkApiRepository$listPaymentDetails$1.label;
        if (i == 0) {
        }
        return ((Result) obj2).m116792unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // com.stripe.android.link.repositories.LinkRepository
    /* renamed from: logout-BWLJW6A  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo116507logoutBWLJW6A(String str, String str2, String str3, Continuation<? super Result<ConsumerSession>> continuation) {
        LinkApiRepository$logout$1 linkApiRepository$logout$1;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof LinkApiRepository$logout$1) {
            linkApiRepository$logout$1 = (LinkApiRepository$logout$1) continuation;
            int i2 = linkApiRepository$logout$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkApiRepository$logout$1.label = i2 - Integer.MIN_VALUE;
                Object obj = linkApiRepository$logout$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = linkApiRepository$logout$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    CoroutineContext coroutineContext = this.workContext;
                    LinkApiRepository$logout$2 linkApiRepository$logout$2 = new LinkApiRepository$logout$2(this, str, str3, str2, null);
                    linkApiRepository$logout$1.label = 1;
                    obj = X30.m77504g(coroutineContext, linkApiRepository$logout$2, linkApiRepository$logout$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return ((Result) obj).m116792unboximpl();
            }
        }
        linkApiRepository$logout$1 = new LinkApiRepository$logout$1(this, continuation);
        Object obj2 = linkApiRepository$logout$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = linkApiRepository$logout$1.label;
        if (i == 0) {
        }
        return ((Result) obj2).m116792unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // com.stripe.android.link.repositories.LinkRepository
    /* renamed from: lookupConsumer-0E7RQCE  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo116508lookupConsumer0E7RQCE(String str, String str2, Continuation<? super Result<ConsumerSessionLookup>> continuation) {
        LinkApiRepository$lookupConsumer$1 linkApiRepository$lookupConsumer$1;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof LinkApiRepository$lookupConsumer$1) {
            linkApiRepository$lookupConsumer$1 = (LinkApiRepository$lookupConsumer$1) continuation;
            int i2 = linkApiRepository$lookupConsumer$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkApiRepository$lookupConsumer$1.label = i2 - Integer.MIN_VALUE;
                Object obj = linkApiRepository$lookupConsumer$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = linkApiRepository$lookupConsumer$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    CoroutineContext coroutineContext = this.workContext;
                    LinkApiRepository$lookupConsumer$2 linkApiRepository$lookupConsumer$2 = new LinkApiRepository$lookupConsumer$2(this, str, str2, null);
                    linkApiRepository$lookupConsumer$1.label = 1;
                    obj = X30.m77504g(coroutineContext, linkApiRepository$lookupConsumer$2, linkApiRepository$lookupConsumer$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return ((Result) obj).m116792unboximpl();
            }
        }
        linkApiRepository$lookupConsumer$1 = new LinkApiRepository$lookupConsumer$1(this, continuation);
        Object obj2 = linkApiRepository$lookupConsumer$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = linkApiRepository$lookupConsumer$1.label;
        if (i == 0) {
        }
        return ((Result) obj2).m116792unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // com.stripe.android.link.repositories.LinkRepository
    /* renamed from: startVerification-BWLJW6A  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo116509startVerificationBWLJW6A(String str, String str2, String str3, Continuation<? super Result<ConsumerSession>> continuation) {
        LinkApiRepository$startVerification$1 linkApiRepository$startVerification$1;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof LinkApiRepository$startVerification$1) {
            linkApiRepository$startVerification$1 = (LinkApiRepository$startVerification$1) continuation;
            int i2 = linkApiRepository$startVerification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkApiRepository$startVerification$1.label = i2 - Integer.MIN_VALUE;
                Object obj = linkApiRepository$startVerification$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = linkApiRepository$startVerification$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    CoroutineContext coroutineContext = this.workContext;
                    LinkApiRepository$startVerification$2 linkApiRepository$startVerification$2 = new LinkApiRepository$startVerification$2(this, str, str3, str2, null);
                    linkApiRepository$startVerification$1.label = 1;
                    obj = X30.m77504g(coroutineContext, linkApiRepository$startVerification$2, linkApiRepository$startVerification$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return ((Result) obj).m116792unboximpl();
            }
        }
        linkApiRepository$startVerification$1 = new LinkApiRepository$startVerification$1(this, continuation);
        Object obj2 = linkApiRepository$startVerification$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = linkApiRepository$startVerification$1.label;
        if (i == 0) {
        }
        return ((Result) obj2).m116792unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // com.stripe.android.link.repositories.LinkRepository
    /* renamed from: updatePaymentDetails-BWLJW6A  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo116510updatePaymentDetailsBWLJW6A(ConsumerPaymentDetailsUpdateParams consumerPaymentDetailsUpdateParams, String str, String str2, Continuation<? super Result<ConsumerPaymentDetails>> continuation) {
        LinkApiRepository$updatePaymentDetails$1 linkApiRepository$updatePaymentDetails$1;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof LinkApiRepository$updatePaymentDetails$1) {
            linkApiRepository$updatePaymentDetails$1 = (LinkApiRepository$updatePaymentDetails$1) continuation;
            int i2 = linkApiRepository$updatePaymentDetails$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkApiRepository$updatePaymentDetails$1.label = i2 - Integer.MIN_VALUE;
                Object obj = linkApiRepository$updatePaymentDetails$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = linkApiRepository$updatePaymentDetails$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    CoroutineContext coroutineContext = this.workContext;
                    LinkApiRepository$updatePaymentDetails$2 linkApiRepository$updatePaymentDetails$2 = new LinkApiRepository$updatePaymentDetails$2(this, str, consumerPaymentDetailsUpdateParams, str2, null);
                    linkApiRepository$updatePaymentDetails$1.label = 1;
                    obj = X30.m77504g(coroutineContext, linkApiRepository$updatePaymentDetails$2, linkApiRepository$updatePaymentDetails$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return ((Result) obj).m116792unboximpl();
            }
        }
        linkApiRepository$updatePaymentDetails$1 = new LinkApiRepository$updatePaymentDetails$1(this, continuation);
        Object obj2 = linkApiRepository$updatePaymentDetails$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = linkApiRepository$updatePaymentDetails$1.label;
        if (i == 0) {
        }
        return ((Result) obj2).m116792unboximpl();
    }
}
