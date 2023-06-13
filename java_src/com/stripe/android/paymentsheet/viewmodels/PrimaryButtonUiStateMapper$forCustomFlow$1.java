package com.stripe.android.paymentsheet.viewmodels;

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
import kotlin.jvm.functions.Function5;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u008a@"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;", "screen", "", "buttonsEnabled", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", BaseSheetViewModel.SAVE_SELECTION, "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;", "customPrimaryButton", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.viewmodels.PrimaryButtonUiStateMapper$forCustomFlow$1", m28418f = "PrimaryButtonUiStateMapper.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class PrimaryButtonUiStateMapper$forCustomFlow$1 extends SuspendLambda implements Function5<PaymentSheetScreen, Boolean, PaymentSelection, PrimaryButton.UIState, Continuation<? super PrimaryButton.UIState>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ PrimaryButtonUiStateMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimaryButtonUiStateMapper$forCustomFlow$1(PrimaryButtonUiStateMapper primaryButtonUiStateMapper, Continuation<? super PrimaryButtonUiStateMapper$forCustomFlow$1> continuation) {
        super(5, continuation);
        this.this$0 = primaryButtonUiStateMapper;
    }

    public final Object invoke(PaymentSheetScreen paymentSheetScreen, boolean z, PaymentSelection paymentSelection, PrimaryButton.UIState uIState, Continuation<? super PrimaryButton.UIState> continuation) {
        PrimaryButtonUiStateMapper$forCustomFlow$1 primaryButtonUiStateMapper$forCustomFlow$1 = new PrimaryButtonUiStateMapper$forCustomFlow$1(this.this$0, continuation);
        primaryButtonUiStateMapper$forCustomFlow$1.L$0 = paymentSheetScreen;
        primaryButtonUiStateMapper$forCustomFlow$1.Z$0 = z;
        primaryButtonUiStateMapper$forCustomFlow$1.L$1 = paymentSelection;
        primaryButtonUiStateMapper$forCustomFlow$1.L$2 = uIState;
        return primaryButtonUiStateMapper$forCustomFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String continueButtonLabel;
        Function0 function0;
        boolean z;
        boolean z2;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            PaymentSheetScreen paymentSheetScreen = (PaymentSheetScreen) this.L$0;
            boolean z3 = this.Z$0;
            PaymentSelection paymentSelection = (PaymentSelection) this.L$1;
            PrimaryButton.UIState uIState = (PrimaryButton.UIState) this.L$2;
            if (uIState == null) {
                continueButtonLabel = this.this$0.continueButtonLabel();
                function0 = this.this$0.onClick;
                boolean z4 = true;
                if (z3 && paymentSelection != null) {
                    z = true;
                } else {
                    z = false;
                }
                PrimaryButton.UIState uIState2 = new PrimaryButton.UIState(continueButtonLabel, function0, z, false);
                if (!paymentSheetScreen.getShowsContinueButton()) {
                    if (paymentSelection != null && paymentSelection.getRequiresConfirmation()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        z4 = false;
                    }
                }
                if (!z4) {
                    return null;
                }
                return uIState2;
            }
            return uIState;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function5
    public /* bridge */ /* synthetic */ Object invoke(PaymentSheetScreen paymentSheetScreen, Boolean bool, PaymentSelection paymentSelection, PrimaryButton.UIState uIState, Continuation<? super PrimaryButton.UIState> continuation) {
        return invoke(paymentSheetScreen, bool.booleanValue(), paymentSelection, uIState, continuation);
    }
}
