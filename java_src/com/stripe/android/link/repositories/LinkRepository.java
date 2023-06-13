package com.stripe.android.link.repositories;

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
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
@Metadata(m28433d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JF\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJV\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u0012H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0014J<\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0018\u0010\u0019JL\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b!\u0010\"J4\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b%\u0010&J<\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00032\u0006\u0010)\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b*\u0010\u0019J4\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b-\u0010&J>\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b/\u0010\u0019J6\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b2\u0010&J>\u00103\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b4\u0010\u0019J<\u00105\u001a\b\u0012\u0004\u0012\u00020,0\u00032\u0006\u00106\u001a\u0002072\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b8\u00109\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006:"}, m28432d2 = {"Lcom/stripe/android/link/repositories/LinkRepository;", "", "confirmVerification", "Lkotlin/Result;", "Lcom/stripe/android/model/ConsumerSession;", "verificationCode", "", "consumerSessionClientSecret", "consumerPublishableKey", "authSessionCookie", "confirmVerification-yxL6bBk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumerSignUp", "email", PaymentMethod.BillingDetails.PARAM_PHONE, "country", "name", "consentAction", "Lcom/stripe/android/model/ConsumerSignUpConsentAction;", "consumerSignUp-bMdYcbs", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConsumerSignUpConsentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createBankAccountPaymentDetails", "Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;", "financialConnectionsAccountId", "createBankAccountPaymentDetails-BWLJW6A", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCardPaymentDetails", "Lcom/stripe/android/link/LinkPaymentDetails$New;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "userEmail", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "createCardPaymentDetails-hUnOzRk", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createFinancialConnectionsSession", "Lcom/stripe/android/model/FinancialConnectionsSession;", "createFinancialConnectionsSession-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePaymentDetails", "", "paymentDetailsId", "deletePaymentDetails-BWLJW6A", "listPaymentDetails", "Lcom/stripe/android/model/ConsumerPaymentDetails;", "listPaymentDetails-0E7RQCE", "logout", "logout-BWLJW6A", "lookupConsumer", "Lcom/stripe/android/model/ConsumerSessionLookup;", "lookupConsumer-0E7RQCE", "startVerification", "startVerification-BWLJW6A", "updatePaymentDetails", "updateParams", "Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;", "updatePaymentDetails-BWLJW6A", "(Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public interface LinkRepository {
    /* renamed from: confirmVerification-yxL6bBk */
    Object mo116500confirmVerificationyxL6bBk(String str, String str2, String str3, String str4, Continuation<? super Result<ConsumerSession>> continuation);

    /* renamed from: consumerSignUp-bMdYcbs */
    Object mo116501consumerSignUpbMdYcbs(String str, String str2, String str3, String str4, String str5, ConsumerSignUpConsentAction consumerSignUpConsentAction, Continuation<? super Result<ConsumerSession>> continuation);

    /* renamed from: createBankAccountPaymentDetails-BWLJW6A */
    Object mo116502createBankAccountPaymentDetailsBWLJW6A(String str, String str2, String str3, Continuation<? super Result<ConsumerPaymentDetails.BankAccount>> continuation);

    /* renamed from: createCardPaymentDetails-hUnOzRk */
    Object mo116503createCardPaymentDetailshUnOzRk(PaymentMethodCreateParams paymentMethodCreateParams, String str, StripeIntent stripeIntent, String str2, String str3, Continuation<? super Result<LinkPaymentDetails.New>> continuation);

    /* renamed from: createFinancialConnectionsSession-0E7RQCE */
    Object mo116504createFinancialConnectionsSession0E7RQCE(String str, String str2, Continuation<? super Result<FinancialConnectionsSession>> continuation);

    /* renamed from: deletePaymentDetails-BWLJW6A */
    Object mo116505deletePaymentDetailsBWLJW6A(String str, String str2, String str3, Continuation<? super Result<Unit>> continuation);

    /* renamed from: listPaymentDetails-0E7RQCE */
    Object mo116506listPaymentDetails0E7RQCE(String str, String str2, Continuation<? super Result<ConsumerPaymentDetails>> continuation);

    /* renamed from: logout-BWLJW6A */
    Object mo116507logoutBWLJW6A(String str, String str2, String str3, Continuation<? super Result<ConsumerSession>> continuation);

    /* renamed from: lookupConsumer-0E7RQCE */
    Object mo116508lookupConsumer0E7RQCE(String str, String str2, Continuation<? super Result<ConsumerSessionLookup>> continuation);

    /* renamed from: startVerification-BWLJW6A */
    Object mo116509startVerificationBWLJW6A(String str, String str2, String str3, Continuation<? super Result<ConsumerSession>> continuation);

    /* renamed from: updatePaymentDetails-BWLJW6A */
    Object mo116510updatePaymentDetailsBWLJW6A(ConsumerPaymentDetailsUpdateParams consumerPaymentDetailsUpdateParams, String str, String str2, Continuation<? super Result<ConsumerPaymentDetails>> continuation);
}
