package com.stripe.android.financialconnections.features.manualentry;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m28432d2 = {"", "input", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel$observeInputs$6", m28418f = "ManualEntryViewModel.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class ManualEntryViewModel$observeInputs$6 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ManualEntryViewModel this$0;

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel$observeInputs$6$1 */
    /* loaded from: classes7.dex */
    public static final class C188391 extends Lambda implements Function1<ManualEntryState, ManualEntryState> {
        final /* synthetic */ String $input;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C188391(String str) {
            super(1);
            this.$input = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final ManualEntryState invoke(ManualEntryState setState) {
            ManualEntryState copy;
            Intrinsics.checkNotNullParameter(setState, "$this$setState");
            copy = setState.copy((r18 & 1) != 0 ? setState.payload : null, (r18 & 2) != 0 ? setState.routing : null, (r18 & 4) != 0 ? setState.account : null, (r18 & 8) != 0 ? setState.accountConfirm : null, (r18 & 16) != 0 ? setState.routingError : ManualEntryInputValidator.INSTANCE.getRoutingErrorIdOrNull(this.$input), (r18 & 32) != 0 ? setState.accountError : null, (r18 & 64) != 0 ? setState.accountConfirmError : null, (r18 & 128) != 0 ? setState.linkPaymentAccount : null);
            return copy;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManualEntryViewModel$observeInputs$6(ManualEntryViewModel manualEntryViewModel, Continuation<? super ManualEntryViewModel$observeInputs$6> continuation) {
        super(2, continuation);
        this.this$0 = manualEntryViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ManualEntryViewModel$observeInputs$6 manualEntryViewModel$observeInputs$6 = new ManualEntryViewModel$observeInputs$6(this.this$0, continuation);
        manualEntryViewModel$observeInputs$6.L$0 = obj;
        return manualEntryViewModel$observeInputs$6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            String str = (String) this.L$0;
            if (str != null) {
                this.this$0.setState(new C188391(str));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((ManualEntryViewModel$observeInputs$6) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
