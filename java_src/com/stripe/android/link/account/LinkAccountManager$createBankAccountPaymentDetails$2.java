package com.stripe.android.link.account;

import com.stripe.android.link.repositories.LinkRepository;
import com.stripe.android.model.ConsumerPaymentDetails;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"", "clientSecret", "Lkotlin/Result;", "Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.link.account.LinkAccountManager$createBankAccountPaymentDetails$2", m28418f = "LinkAccountManager.kt", m28417i = {}, m28416l = {253}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class LinkAccountManager$createBankAccountPaymentDetails$2 extends SuspendLambda implements Function2<String, Continuation<? super Result<? extends ConsumerPaymentDetails.BankAccount>>, Object> {
    final /* synthetic */ String $financialConnectionsAccountId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LinkAccountManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkAccountManager$createBankAccountPaymentDetails$2(LinkAccountManager linkAccountManager, String str, Continuation<? super LinkAccountManager$createBankAccountPaymentDetails$2> continuation) {
        super(2, continuation);
        this.this$0 = linkAccountManager;
        this.$financialConnectionsAccountId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LinkAccountManager$createBankAccountPaymentDetails$2 linkAccountManager$createBankAccountPaymentDetails$2 = new LinkAccountManager$createBankAccountPaymentDetails$2(this.this$0, this.$financialConnectionsAccountId, continuation);
        linkAccountManager$createBankAccountPaymentDetails$2.L$0 = obj;
        return linkAccountManager$createBankAccountPaymentDetails$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(String str, Continuation<? super Result<? extends ConsumerPaymentDetails.BankAccount>> continuation) {
        return invoke2(str, (Continuation<? super Result<ConsumerPaymentDetails.BankAccount>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        LinkRepository linkRepository;
        Object mo116502createBankAccountPaymentDetailsBWLJW6A;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                mo116502createBankAccountPaymentDetailsBWLJW6A = ((Result) obj).m116792unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            linkRepository = this.this$0.linkRepository;
            String str = this.$financialConnectionsAccountId;
            String consumerPublishableKey = this.this$0.getConsumerPublishableKey();
            this.label = 1;
            mo116502createBankAccountPaymentDetailsBWLJW6A = linkRepository.mo116502createBankAccountPaymentDetailsBWLJW6A(str, (String) this.L$0, consumerPublishableKey, this);
            if (mo116502createBankAccountPaymentDetailsBWLJW6A == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Result.m116782boximpl(mo116502createBankAccountPaymentDetailsBWLJW6A);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(String str, Continuation<? super Result<ConsumerPaymentDetails.BankAccount>> continuation) {
        return ((LinkAccountManager$createBankAccountPaymentDetails$2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
