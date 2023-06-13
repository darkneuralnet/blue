package com.stripe.android.link.repositories;

import androidx.recyclerview.widget.C11925l;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.networking.StripeRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "Lkotlin/Result;", "Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.link.repositories.LinkApiRepository$createBankAccountPaymentDetails$2", m28418f = "LinkApiRepository.kt", m28417i = {}, m28416l = {C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class LinkApiRepository$createBankAccountPaymentDetails$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super Result<? extends ConsumerPaymentDetails.BankAccount>>, Object> {
    final /* synthetic */ String $consumerPublishableKey;
    final /* synthetic */ String $consumerSessionClientSecret;
    final /* synthetic */ String $financialConnectionsAccountId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LinkApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkApiRepository$createBankAccountPaymentDetails$2(LinkApiRepository linkApiRepository, String str, String str2, String str3, Continuation<? super LinkApiRepository$createBankAccountPaymentDetails$2> continuation) {
        super(2, continuation);
        this.this$0 = linkApiRepository;
        this.$consumerSessionClientSecret = str;
        this.$financialConnectionsAccountId = str2;
        this.$consumerPublishableKey = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LinkApiRepository$createBankAccountPaymentDetails$2 linkApiRepository$createBankAccountPaymentDetails$2 = new LinkApiRepository$createBankAccountPaymentDetails$2(this.this$0, this.$consumerSessionClientSecret, this.$financialConnectionsAccountId, this.$consumerPublishableKey, continuation);
        linkApiRepository$createBankAccountPaymentDetails$2.L$0 = obj;
        return linkApiRepository$createBankAccountPaymentDetails$2;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(ZC0 zc0, Continuation<? super Result<ConsumerPaymentDetails.BankAccount>> continuation) {
        return ((LinkApiRepository$createBankAccountPaymentDetails$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Object m116783constructorimpl;
        StripeRepository stripeRepository;
        Function0 function0;
        Function0 function02;
        ApiRequest.Options options;
        ConsumerPaymentDetails.BankAccount bankAccount;
        List<ConsumerPaymentDetails.PaymentDetails> paymentDetails;
        Object first;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                ZC0 zc0 = (ZC0) this.L$0;
                LinkApiRepository linkApiRepository = this.this$0;
                String str = this.$consumerSessionClientSecret;
                String str2 = this.$financialConnectionsAccountId;
                String str3 = this.$consumerPublishableKey;
                Result.Companion companion = Result.Companion;
                stripeRepository = linkApiRepository.stripeRepository;
                if (str3 != null) {
                    options = new ApiRequest.Options(str3, null, null, 6, null);
                } else {
                    function0 = linkApiRepository.publishableKeyProvider;
                    function02 = linkApiRepository.stripeAccountIdProvider;
                    options = new ApiRequest.Options((String) function0.invoke(), (String) function02.invoke(), null, 4, null);
                }
                this.label = 1;
                obj = stripeRepository.createPaymentDetails(str, str2, options, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            ConsumerPaymentDetails consumerPaymentDetails = (ConsumerPaymentDetails) obj;
            bankAccount = null;
            if (consumerPaymentDetails != null && (paymentDetails = consumerPaymentDetails.getPaymentDetails()) != null) {
                first = CollectionsKt___CollectionsKt.first((List<? extends Object>) paymentDetails);
                ConsumerPaymentDetails.PaymentDetails paymentDetails2 = (ConsumerPaymentDetails.PaymentDetails) first;
                if (paymentDetails2 != null && (paymentDetails2 instanceof ConsumerPaymentDetails.BankAccount)) {
                    bankAccount = (ConsumerPaymentDetails.BankAccount) paymentDetails2;
                }
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        if (bankAccount != null) {
            m116783constructorimpl = Result.m116783constructorimpl(bankAccount);
            return Result.m116782boximpl(m116783constructorimpl);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, Continuation<? super Result<? extends ConsumerPaymentDetails.BankAccount>> continuation) {
        return invoke2(zc0, (Continuation<? super Result<ConsumerPaymentDetails.BankAccount>>) continuation);
    }
}
