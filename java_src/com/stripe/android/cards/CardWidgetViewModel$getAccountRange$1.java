package com.stripe.android.cards;

import com.stripe.android.cards.CardNumber;
import com.stripe.android.model.AccountRange;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, m28432d2 = {"LVs2;", "Lcom/stripe/android/model/AccountRange;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.cards.CardWidgetViewModel$getAccountRange$1", m28418f = "CardWidgetViewModel.kt", m28417i = {}, m28416l = {29, 29}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes6.dex */
public final class CardWidgetViewModel$getAccountRange$1 extends SuspendLambda implements Function2<InterfaceC36691Vs2<AccountRange>, Continuation<? super Unit>, Object> {
    final /* synthetic */ CardNumber.Unvalidated $cardNumber;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CardWidgetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardWidgetViewModel$getAccountRange$1(CardWidgetViewModel cardWidgetViewModel, CardNumber.Unvalidated unvalidated, Continuation<? super CardWidgetViewModel$getAccountRange$1> continuation) {
        super(2, continuation);
        this.this$0 = cardWidgetViewModel;
        this.$cardNumber = unvalidated;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CardWidgetViewModel$getAccountRange$1 cardWidgetViewModel$getAccountRange$1 = new CardWidgetViewModel$getAccountRange$1(this.this$0, this.$cardNumber, continuation);
        cardWidgetViewModel$getAccountRange$1.L$0 = obj;
        return cardWidgetViewModel$getAccountRange$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC36691Vs2<AccountRange> interfaceC36691Vs2, Continuation<? super Unit> continuation) {
        return ((CardWidgetViewModel$getAccountRange$1) create(interfaceC36691Vs2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        InterfaceC36691Vs2 interfaceC36691Vs2;
        CardAccountRangeRepository cardAccountRangeRepository;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC36691Vs2 = (InterfaceC36691Vs2) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            interfaceC36691Vs2 = (InterfaceC36691Vs2) this.L$0;
            cardAccountRangeRepository = this.this$0.getCardAccountRangeRepository();
            CardNumber.Unvalidated unvalidated = this.$cardNumber;
            this.L$0 = interfaceC36691Vs2;
            this.label = 1;
            obj = cardAccountRangeRepository.getAccountRange(unvalidated, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        this.L$0 = null;
        this.label = 2;
        if (interfaceC36691Vs2.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
