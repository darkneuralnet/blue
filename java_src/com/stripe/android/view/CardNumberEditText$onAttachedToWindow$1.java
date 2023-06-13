package com.stripe.android.view;

import com.stripe.android.cards.CardAccountRangeRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.view.CardNumberEditText$onAttachedToWindow$1", m28418f = "CardNumberEditText.kt", m28417i = {}, m28416l = {173}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class CardNumberEditText$onAttachedToWindow$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CardNumberEditText this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardNumberEditText$onAttachedToWindow$1(CardNumberEditText cardNumberEditText, Continuation<? super CardNumberEditText$onAttachedToWindow$1> continuation) {
        super(2, continuation);
        this.this$0 = cardNumberEditText;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CardNumberEditText$onAttachedToWindow$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((CardNumberEditText$onAttachedToWindow$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        CardAccountRangeRepository cardAccountRangeRepository;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            cardAccountRangeRepository = this.this$0.cardAccountRangeRepository;
            InterfaceC32730Eu1<Boolean> loading = cardAccountRangeRepository.getLoading();
            final CardNumberEditText cardNumberEditText = this.this$0;
            InterfaceC33198Gu1<Boolean> interfaceC33198Gu1 = new InterfaceC33198Gu1<Boolean>() { // from class: com.stripe.android.view.CardNumberEditText$onAttachedToWindow$1.1
                @Override // p000.InterfaceC33198Gu1
                public /* bridge */ /* synthetic */ Object emit(Boolean bool, Continuation continuation) {
                    return emit(bool.booleanValue(), continuation);
                }

                public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                    Object coroutine_suspended2;
                    Object m77504g = X30.m77504g(T41.m84376c(), new CardNumberEditText$onAttachedToWindow$1$1$emit$2(CardNumberEditText.this, z, null), continuation);
                    coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    return m77504g == coroutine_suspended2 ? m77504g : Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (loading.collect(interfaceC33198Gu1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
