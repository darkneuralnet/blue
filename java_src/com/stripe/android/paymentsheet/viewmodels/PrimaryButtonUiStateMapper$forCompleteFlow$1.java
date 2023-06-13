package com.stripe.android.paymentsheet.viewmodels;

import com.stripe.android.p049ui.core.Amount;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.navigation.PaymentSheetScreen;
import com.stripe.android.paymentsheet.p047ui.PrimaryButton;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u008a@"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;", "screen", "", "buttonsEnabled", "Lcom/stripe/android/ui/core/Amount;", "amount", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", BaseSheetViewModel.SAVE_SELECTION, "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;", "customPrimaryButton", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.viewmodels.PrimaryButtonUiStateMapper$forCompleteFlow$1", m28418f = "PrimaryButtonUiStateMapper.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
@SourceDebugExtension({"SMAP\nPrimaryButtonUiStateMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimaryButtonUiStateMapper.kt\ncom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$forCompleteFlow$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"})
/* loaded from: classes7.dex */
public final class PrimaryButtonUiStateMapper$forCompleteFlow$1 extends SuspendLambda implements Function6<PaymentSheetScreen, Boolean, Amount, PaymentSelection, PrimaryButton.UIState, Continuation<? super PrimaryButton.UIState>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ PrimaryButtonUiStateMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimaryButtonUiStateMapper$forCompleteFlow$1(PrimaryButtonUiStateMapper primaryButtonUiStateMapper, Continuation<? super PrimaryButtonUiStateMapper$forCompleteFlow$1> continuation) {
        super(6, continuation);
        this.this$0 = primaryButtonUiStateMapper;
    }

    public final Object invoke(PaymentSheetScreen paymentSheetScreen, boolean z, Amount amount, PaymentSelection paymentSelection, PrimaryButton.UIState uIState, Continuation<? super PrimaryButton.UIState> continuation) {
        PrimaryButtonUiStateMapper$forCompleteFlow$1 primaryButtonUiStateMapper$forCompleteFlow$1 = new PrimaryButtonUiStateMapper$forCompleteFlow$1(this.this$0, continuation);
        primaryButtonUiStateMapper$forCompleteFlow$1.L$0 = paymentSheetScreen;
        primaryButtonUiStateMapper$forCompleteFlow$1.Z$0 = z;
        primaryButtonUiStateMapper$forCompleteFlow$1.L$1 = amount;
        primaryButtonUiStateMapper$forCompleteFlow$1.L$2 = paymentSelection;
        primaryButtonUiStateMapper$forCompleteFlow$1.L$3 = uIState;
        return primaryButtonUiStateMapper$forCompleteFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String buyButtonLabel;
        Function0 function0;
        boolean z;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            PaymentSheetScreen paymentSheetScreen = (PaymentSheetScreen) this.L$0;
            boolean z2 = this.Z$0;
            Amount amount = (Amount) this.L$1;
            PaymentSelection paymentSelection = (PaymentSelection) this.L$2;
            PrimaryButton.UIState uIState = (PrimaryButton.UIState) this.L$3;
            if (uIState == null) {
                buyButtonLabel = this.this$0.buyButtonLabel(amount);
                function0 = this.this$0.onClick;
                if (z2 && paymentSelection != null) {
                    z = true;
                } else {
                    z = false;
                }
                PrimaryButton.UIState uIState2 = new PrimaryButton.UIState(buyButtonLabel, function0, z, true);
                if (!paymentSheetScreen.getShowsBuyButton()) {
                    return null;
                }
                return uIState2;
            }
            return uIState;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function6
    public /* bridge */ /* synthetic */ Object invoke(PaymentSheetScreen paymentSheetScreen, Boolean bool, Amount amount, PaymentSelection paymentSelection, PrimaryButton.UIState uIState, Continuation<? super PrimaryButton.UIState> continuation) {
        return invoke(paymentSheetScreen, bool.booleanValue(), amount, paymentSelection, uIState, continuation);
    }
}
