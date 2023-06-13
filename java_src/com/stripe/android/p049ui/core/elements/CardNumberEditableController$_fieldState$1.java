package com.stripe.android.p049ui.core.elements;

import com.stripe.android.model.AccountRange;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import com.stripe.android.uicore.elements.TextFieldState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, m28432d2 = {"Lcom/stripe/android/model/CardBrand;", AccountRangeJsonParser.FIELD_BRAND, "", "fieldValue", "Lcom/stripe/android/uicore/elements/TextFieldState;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.ui.core.elements.CardNumberEditableController$_fieldState$1", m28418f = "CardNumberController.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* renamed from: com.stripe.android.ui.core.elements.CardNumberEditableController$_fieldState$1 */
/* loaded from: classes7.dex */
public final class CardNumberEditableController$_fieldState$1 extends SuspendLambda implements Function3<CardBrand, String, Continuation<? super TextFieldState>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ CardNumberEditableController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardNumberEditableController$_fieldState$1(CardNumberEditableController cardNumberEditableController, Continuation<? super CardNumberEditableController$_fieldState$1> continuation) {
        super(3, continuation);
        this.this$0 = cardNumberEditableController;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(CardBrand cardBrand, String str, Continuation<? super TextFieldState> continuation) {
        CardNumberEditableController$_fieldState$1 cardNumberEditableController$_fieldState$1 = new CardNumberEditableController$_fieldState$1(this.this$0, continuation);
        cardNumberEditableController$_fieldState$1.L$0 = cardBrand;
        cardNumberEditableController$_fieldState$1.L$1 = str;
        return cardNumberEditableController$_fieldState$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CardNumberConfig cardNumberConfig;
        int maxLengthForCardNumber;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            CardBrand cardBrand = (CardBrand) this.L$0;
            String str = (String) this.L$1;
            cardNumberConfig = this.this$0.cardTextFieldConfig;
            AccountRange accountRange = this.this$0.getAccountRangeService().getAccountRange();
            if (accountRange != null) {
                maxLengthForCardNumber = accountRange.getPanLength();
            } else {
                maxLengthForCardNumber = cardBrand.getMaxLengthForCardNumber(str);
            }
            return cardNumberConfig.determineState(cardBrand, str, maxLengthForCardNumber);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
