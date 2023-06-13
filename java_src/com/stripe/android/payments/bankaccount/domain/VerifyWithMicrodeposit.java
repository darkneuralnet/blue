package com.stripe.android.payments.bankaccount.domain;

import com.stripe.android.core.networking.ApiRequest;
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
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JB\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ:\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0011\u0010\u0012JB\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0015\u0010\u000fJ:\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0016\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, m28432d2 = {"Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit;", "", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "(Lcom/stripe/android/networking/StripeRepository;)V", "forPaymentIntent", "Lkotlin/Result;", "Lcom/stripe/android/model/PaymentIntent;", "publishableKey", "", "clientSecret", "firstAmount", "", "secondAmount", "forPaymentIntent-yxL6bBk", "(Ljava/lang/String;Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "descriptorCode", "forPaymentIntent-BWLJW6A", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forSetupIntent", "Lcom/stripe/android/model/SetupIntent;", "forSetupIntent-yxL6bBk", "forSetupIntent-BWLJW6A", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nVerifyWithMicrodeposit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerifyWithMicrodeposit.kt\ncom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1#2:89\n*E\n"})
/* loaded from: classes7.dex */
public final class VerifyWithMicrodeposit {
    private final StripeRepository stripeRepository;

    public VerifyWithMicrodeposit(StripeRepository stripeRepository) {
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        this.stripeRepository = stripeRepository;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:10)(2:27|28))(3:29|30|(1:32))|11|12|(3:17|18|(2:20|21)(2:22|23))|14|15))|35|6|7|(0)(0)|11|12|(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
        r12 = kotlin.Result.Companion;
        r11 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r11));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: forPaymentIntent-BWLJW6A  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116585forPaymentIntentBWLJW6A(String str, String str2, String str3, Continuation<? super Result<PaymentIntent>> continuation) {
        VerifyWithMicrodeposit$forPaymentIntent$4 verifyWithMicrodeposit$forPaymentIntent$4;
        Object coroutine_suspended;
        int i;
        Object m116783constructorimpl;
        if (continuation instanceof VerifyWithMicrodeposit$forPaymentIntent$4) {
            verifyWithMicrodeposit$forPaymentIntent$4 = (VerifyWithMicrodeposit$forPaymentIntent$4) continuation;
            int i2 = verifyWithMicrodeposit$forPaymentIntent$4.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verifyWithMicrodeposit$forPaymentIntent$4.label = i2 - Integer.MIN_VALUE;
                Object obj = verifyWithMicrodeposit$forPaymentIntent$4.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = verifyWithMicrodeposit$forPaymentIntent$4.label;
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
                    ApiRequest.Options options = new ApiRequest.Options(str, null, null, 6, null);
                    verifyWithMicrodeposit$forPaymentIntent$4.label = 1;
                    obj = stripeRepository.verifyPaymentIntentWithMicrodeposits(str2, str3, options, verifyWithMicrodeposit$forPaymentIntent$4);
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
                        throw new InternalError("Error verifying PaymentIntent with microdeposits");
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        m116783constructorimpl = ResultKt.createFailure(th);
                    }
                }
                return Result.m116783constructorimpl(m116783constructorimpl);
            }
        }
        verifyWithMicrodeposit$forPaymentIntent$4 = new VerifyWithMicrodeposit$forPaymentIntent$4(this, continuation);
        Object obj2 = verifyWithMicrodeposit$forPaymentIntent$4.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = verifyWithMicrodeposit$forPaymentIntent$4.label;
        if (i == 0) {
        }
        m116783constructorimpl = Result.m116783constructorimpl((PaymentIntent) obj2);
        if (Result.m116790isSuccessimpl(m116783constructorimpl)) {
        }
        return Result.m116783constructorimpl(m116783constructorimpl);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:10)(2:27|28))(3:29|30|(1:32))|11|12|(3:17|18|(2:20|21)(2:22|23))|14|15))|35|6|7|(0)(0)|11|12|(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
        r2 = kotlin.Result.Companion;
        r0 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: forPaymentIntent-yxL6bBk  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116586forPaymentIntentyxL6bBk(String str, String str2, int i, int i2, Continuation<? super Result<PaymentIntent>> continuation) {
        VerifyWithMicrodeposit$forPaymentIntent$1 verifyWithMicrodeposit$forPaymentIntent$1;
        Object coroutine_suspended;
        int i3;
        Object m116783constructorimpl;
        if (continuation instanceof VerifyWithMicrodeposit$forPaymentIntent$1) {
            verifyWithMicrodeposit$forPaymentIntent$1 = (VerifyWithMicrodeposit$forPaymentIntent$1) continuation;
            int i4 = verifyWithMicrodeposit$forPaymentIntent$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                verifyWithMicrodeposit$forPaymentIntent$1.label = i4 - Integer.MIN_VALUE;
                VerifyWithMicrodeposit$forPaymentIntent$1 verifyWithMicrodeposit$forPaymentIntent$12 = verifyWithMicrodeposit$forPaymentIntent$1;
                Object obj = verifyWithMicrodeposit$forPaymentIntent$12.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i3 = verifyWithMicrodeposit$forPaymentIntent$12.label;
                if (i3 == 0) {
                    if (i3 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    StripeRepository stripeRepository = this.stripeRepository;
                    ApiRequest.Options options = new ApiRequest.Options(str, null, null, 6, null);
                    verifyWithMicrodeposit$forPaymentIntent$12.label = 1;
                    obj = stripeRepository.verifyPaymentIntentWithMicrodeposits(str2, i, i2, options, verifyWithMicrodeposit$forPaymentIntent$12);
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
                        throw new InternalError("Error verifying PaymentIntent with microdeposits");
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        m116783constructorimpl = ResultKt.createFailure(th);
                    }
                }
                return Result.m116783constructorimpl(m116783constructorimpl);
            }
        }
        verifyWithMicrodeposit$forPaymentIntent$1 = new VerifyWithMicrodeposit$forPaymentIntent$1(this, continuation);
        VerifyWithMicrodeposit$forPaymentIntent$1 verifyWithMicrodeposit$forPaymentIntent$122 = verifyWithMicrodeposit$forPaymentIntent$1;
        Object obj2 = verifyWithMicrodeposit$forPaymentIntent$122.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = verifyWithMicrodeposit$forPaymentIntent$122.label;
        if (i3 == 0) {
        }
        m116783constructorimpl = Result.m116783constructorimpl((PaymentIntent) obj2);
        if (Result.m116790isSuccessimpl(m116783constructorimpl)) {
        }
        return Result.m116783constructorimpl(m116783constructorimpl);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:10)(2:27|28))(3:29|30|(1:32))|11|12|(3:17|18|(2:20|21)(2:22|23))|14|15))|35|6|7|(0)(0)|11|12|(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
        r12 = kotlin.Result.Companion;
        r11 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r11));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: forSetupIntent-BWLJW6A  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116587forSetupIntentBWLJW6A(String str, String str2, String str3, Continuation<? super Result<SetupIntent>> continuation) {
        VerifyWithMicrodeposit$forSetupIntent$4 verifyWithMicrodeposit$forSetupIntent$4;
        Object coroutine_suspended;
        int i;
        Object m116783constructorimpl;
        if (continuation instanceof VerifyWithMicrodeposit$forSetupIntent$4) {
            verifyWithMicrodeposit$forSetupIntent$4 = (VerifyWithMicrodeposit$forSetupIntent$4) continuation;
            int i2 = verifyWithMicrodeposit$forSetupIntent$4.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verifyWithMicrodeposit$forSetupIntent$4.label = i2 - Integer.MIN_VALUE;
                Object obj = verifyWithMicrodeposit$forSetupIntent$4.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = verifyWithMicrodeposit$forSetupIntent$4.label;
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
                    ApiRequest.Options options = new ApiRequest.Options(str, null, null, 6, null);
                    verifyWithMicrodeposit$forSetupIntent$4.label = 1;
                    obj = stripeRepository.verifySetupIntentWithMicrodeposits(str2, str3, options, verifyWithMicrodeposit$forSetupIntent$4);
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
                        throw new InternalError("Error verifying SetupIntent with microdeposits");
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        m116783constructorimpl = ResultKt.createFailure(th);
                    }
                }
                return Result.m116783constructorimpl(m116783constructorimpl);
            }
        }
        verifyWithMicrodeposit$forSetupIntent$4 = new VerifyWithMicrodeposit$forSetupIntent$4(this, continuation);
        Object obj2 = verifyWithMicrodeposit$forSetupIntent$4.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = verifyWithMicrodeposit$forSetupIntent$4.label;
        if (i == 0) {
        }
        m116783constructorimpl = Result.m116783constructorimpl((SetupIntent) obj2);
        if (Result.m116790isSuccessimpl(m116783constructorimpl)) {
        }
        return Result.m116783constructorimpl(m116783constructorimpl);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:10)(2:27|28))(3:29|30|(1:32))|11|12|(3:17|18|(2:20|21)(2:22|23))|14|15))|35|6|7|(0)(0)|11|12|(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
        r2 = kotlin.Result.Companion;
        r0 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: forSetupIntent-yxL6bBk  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116588forSetupIntentyxL6bBk(String str, String str2, int i, int i2, Continuation<? super Result<SetupIntent>> continuation) {
        VerifyWithMicrodeposit$forSetupIntent$1 verifyWithMicrodeposit$forSetupIntent$1;
        Object coroutine_suspended;
        int i3;
        Object m116783constructorimpl;
        if (continuation instanceof VerifyWithMicrodeposit$forSetupIntent$1) {
            verifyWithMicrodeposit$forSetupIntent$1 = (VerifyWithMicrodeposit$forSetupIntent$1) continuation;
            int i4 = verifyWithMicrodeposit$forSetupIntent$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                verifyWithMicrodeposit$forSetupIntent$1.label = i4 - Integer.MIN_VALUE;
                VerifyWithMicrodeposit$forSetupIntent$1 verifyWithMicrodeposit$forSetupIntent$12 = verifyWithMicrodeposit$forSetupIntent$1;
                Object obj = verifyWithMicrodeposit$forSetupIntent$12.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i3 = verifyWithMicrodeposit$forSetupIntent$12.label;
                if (i3 == 0) {
                    if (i3 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    StripeRepository stripeRepository = this.stripeRepository;
                    ApiRequest.Options options = new ApiRequest.Options(str, null, null, 6, null);
                    verifyWithMicrodeposit$forSetupIntent$12.label = 1;
                    obj = stripeRepository.verifySetupIntentWithMicrodeposits(str2, i, i2, options, verifyWithMicrodeposit$forSetupIntent$12);
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
                        throw new InternalError("Error verifying SetupIntent with microdeposits");
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        m116783constructorimpl = ResultKt.createFailure(th);
                    }
                }
                return Result.m116783constructorimpl(m116783constructorimpl);
            }
        }
        verifyWithMicrodeposit$forSetupIntent$1 = new VerifyWithMicrodeposit$forSetupIntent$1(this, continuation);
        VerifyWithMicrodeposit$forSetupIntent$1 verifyWithMicrodeposit$forSetupIntent$122 = verifyWithMicrodeposit$forSetupIntent$1;
        Object obj2 = verifyWithMicrodeposit$forSetupIntent$122.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = verifyWithMicrodeposit$forSetupIntent$122.label;
        if (i3 == 0) {
        }
        m116783constructorimpl = Result.m116783constructorimpl((SetupIntent) obj2);
        if (Result.m116790isSuccessimpl(m116783constructorimpl)) {
        }
        return Result.m116783constructorimpl(m116783constructorimpl);
    }
}
