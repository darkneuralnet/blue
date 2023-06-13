package com.stripe.android.financialconnections.presentation;

import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$onBackClick$1", m28418f = "FinancialConnectionsSheetNativeViewModel.kt", m28417i = {}, m28416l = {192}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetNativeViewModel$onBackClick$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ FinancialConnectionsSessionManifest.Pane $pane;
    int label;
    final /* synthetic */ FinancialConnectionsSheetNativeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetNativeViewModel$onBackClick$1(FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel, FinancialConnectionsSessionManifest.Pane pane, Continuation<? super FinancialConnectionsSheetNativeViewModel$onBackClick$1> continuation) {
        super(2, continuation);
        this.this$0 = financialConnectionsSheetNativeViewModel;
        this.$pane = pane;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FinancialConnectionsSheetNativeViewModel$onBackClick$1(this.this$0, this.$pane, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((FinancialConnectionsSheetNativeViewModel$onBackClick$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                ((Result) obj).m116792unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            financialConnectionsAnalyticsTracker = this.this$0.eventTracker;
            FinancialConnectionsEvent.ClickNavBarBack clickNavBarBack = new FinancialConnectionsEvent.ClickNavBarBack(this.$pane);
            this.label = 1;
            if (financialConnectionsAnalyticsTracker.mo116345trackgIAlus(clickNavBarBack, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
