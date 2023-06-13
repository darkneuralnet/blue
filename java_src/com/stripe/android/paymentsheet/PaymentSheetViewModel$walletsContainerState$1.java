package com.stripe.android.paymentsheet;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.state.GooglePayState;
import com.stripe.android.paymentsheet.state.WalletsContainerState;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\t\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0004H\u008a@"}, m28432d2 = {"", "isLinkAvailable", "Lcom/stripe/android/paymentsheet/state/GooglePayState;", "googlePayState", "", "", "Lcom/stripe/android/model/PaymentMethodCode;", "paymentMethodTypes", "Lcom/stripe/android/paymentsheet/state/WalletsContainerState;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.PaymentSheetViewModel$walletsContainerState$1", m28418f = "PaymentSheetViewModel.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class PaymentSheetViewModel$walletsContainerState$1 extends SuspendLambda implements Function4<Boolean, GooglePayState, List<? extends String>, Continuation<? super WalletsContainerState>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    public PaymentSheetViewModel$walletsContainerState$1(Continuation<? super PaymentSheetViewModel$walletsContainerState$1> continuation) {
        super(4, continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(Boolean bool, GooglePayState googlePayState, List<String> list, Continuation<? super WalletsContainerState> continuation) {
        PaymentSheetViewModel$walletsContainerState$1 paymentSheetViewModel$walletsContainerState$1 = new PaymentSheetViewModel$walletsContainerState$1(continuation);
        paymentSheetViewModel$walletsContainerState$1.L$0 = bool;
        paymentSheetViewModel$walletsContainerState$1.L$1 = googlePayState;
        paymentSheetViewModel$walletsContainerState$1.L$2 = list;
        return paymentSheetViewModel$walletsContainerState$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object singleOrNull;
        int i;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            boolean areEqual = Intrinsics.areEqual((Boolean) this.L$0, Boxing.boxBoolean(true));
            boolean isReadyForUse = ((GooglePayState) this.L$1).isReadyForUse();
            singleOrNull = CollectionsKt___CollectionsKt.singleOrNull((List<? extends Object>) this.L$2);
            if (Intrinsics.areEqual(singleOrNull, PaymentMethod.Type.Card.code)) {
                i = C19159R.string.stripe_paymentsheet_or_pay_with_card;
            } else {
                i = C19159R.string.stripe_paymentsheet_or_pay_using;
            }
            return new WalletsContainerState(areEqual, isReadyForUse, i);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, GooglePayState googlePayState, List<? extends String> list, Continuation<? super WalletsContainerState> continuation) {
        return invoke2(bool, googlePayState, (List<String>) list, continuation);
    }
}
