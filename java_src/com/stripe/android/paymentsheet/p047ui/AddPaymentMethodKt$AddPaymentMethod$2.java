package com.stripe.android.paymentsheet.p047ui;

import com.stripe.android.link.p042ui.inline.InlineSignupViewState;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.ui.AddPaymentMethodKt$AddPaymentMethod$2", m28418f = "AddPaymentMethod.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* renamed from: com.stripe.android.paymentsheet.ui.AddPaymentMethodKt$AddPaymentMethod$2 */
/* loaded from: classes7.dex */
public final class AddPaymentMethodKt$AddPaymentMethod$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC48627sP5<PaymentSelection.New.LinkInline> $linkInlineSelection$delegate;
    final /* synthetic */ EX2<InlineSignupViewState> $linkSignupState$delegate;
    final /* synthetic */ InterfaceC48627sP5<PaymentSelection> $paymentSelection$delegate;
    final /* synthetic */ BaseSheetViewModel $sheetViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AddPaymentMethodKt$AddPaymentMethod$2(BaseSheetViewModel baseSheetViewModel, EX2<InlineSignupViewState> ex2, InterfaceC48627sP5<PaymentSelection.New.LinkInline> interfaceC48627sP5, InterfaceC48627sP5<? extends PaymentSelection> interfaceC48627sP52, Continuation<? super AddPaymentMethodKt$AddPaymentMethod$2> continuation) {
        super(2, continuation);
        this.$sheetViewModel = baseSheetViewModel;
        this.$linkSignupState$delegate = ex2;
        this.$linkInlineSelection$delegate = interfaceC48627sP5;
        this.$paymentSelection$delegate = interfaceC48627sP52;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddPaymentMethodKt$AddPaymentMethod$2(this.$sheetViewModel, this.$linkSignupState$delegate, this.$linkInlineSelection$delegate, this.$paymentSelection$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((AddPaymentMethodKt$AddPaymentMethod$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InlineSignupViewState AddPaymentMethod$lambda$13;
        PaymentSelection.New.LinkInline AddPaymentMethod$lambda$11;
        boolean z;
        PaymentSelection AddPaymentMethod$lambda$10;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            AddPaymentMethod$lambda$13 = AddPaymentMethodKt.AddPaymentMethod$lambda$13(this.$linkSignupState$delegate);
            AddPaymentMethod$lambda$11 = AddPaymentMethodKt.AddPaymentMethod$lambda$11(this.$linkInlineSelection$delegate);
            if (AddPaymentMethod$lambda$11 != null) {
                AddPaymentMethod$lambda$10 = AddPaymentMethodKt.AddPaymentMethod$lambda$10(this.$paymentSelection$delegate);
                if (AddPaymentMethod$lambda$10 instanceof PaymentSelection.New.Card) {
                    z = true;
                    if (AddPaymentMethod$lambda$13 == null) {
                        this.$sheetViewModel.updatePrimaryButtonForLinkSignup(AddPaymentMethod$lambda$13);
                    } else if (z) {
                        this.$sheetViewModel.updatePrimaryButtonForLinkInline();
                    }
                    return Unit.INSTANCE;
                }
            }
            z = false;
            if (AddPaymentMethod$lambda$13 == null) {
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
