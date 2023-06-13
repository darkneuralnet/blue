package com.stripe.android.financialconnections.p041ui;

import com.stripe.android.financialconnections.navigation.NavigationCommand;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$NavigationEffect$1", m28418f = "FinancialConnectionsSheetNativeActivity.kt", m28417i = {}, m28416l = {239}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$NavigationEffect$1 */
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetNativeActivity$NavigationEffect$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ OY2 $navController;
    int label;
    final /* synthetic */ FinancialConnectionsSheetNativeActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetNativeActivity$NavigationEffect$1(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity, OY2 oy2, Continuation<? super FinancialConnectionsSheetNativeActivity$NavigationEffect$1> continuation) {
        super(2, continuation);
        this.this$0 = financialConnectionsSheetNativeActivity;
        this.$navController = oy2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FinancialConnectionsSheetNativeActivity$NavigationEffect$1(this.this$0, this.$navController, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((FinancialConnectionsSheetNativeActivity$NavigationEffect$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            BX2<NavigationCommand> commands = this.this$0.getNavigationManager().getCommands();
            final OY2 oy2 = this.$navController;
            final FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity = this.this$0;
            InterfaceC33198Gu1<NavigationCommand> interfaceC33198Gu1 = new InterfaceC33198Gu1<NavigationCommand>() { // from class: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$NavigationEffect$1.1
                @Override // p000.InterfaceC33198Gu1
                public /* bridge */ /* synthetic */ Object emit(NavigationCommand navigationCommand, Continuation continuation) {
                    return emit2(navigationCommand, (Continuation<? super Unit>) continuation);
                }

                /* renamed from: emit  reason: avoid collision after fix types in other method */
                public final Object emit2(NavigationCommand navigationCommand, Continuation<? super Unit> continuation) {
                    if (navigationCommand.getDestination().length() > 0) {
                        OY2.this.m110247O(navigationCommand.getDestination(), new C18923x83bf5c3b(financialConnectionsSheetNativeActivity, OY2.this));
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (commands.collect(interfaceC33198Gu1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        throw new KotlinNothingValueException();
    }
}
