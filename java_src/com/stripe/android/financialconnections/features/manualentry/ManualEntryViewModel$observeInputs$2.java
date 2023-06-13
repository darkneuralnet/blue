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
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel$observeInputs$2", m28418f = "ManualEntryViewModel.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class ManualEntryViewModel$observeInputs$2 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ManualEntryViewModel this$0;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel$observeInputs$2$1 */
    /* loaded from: classes7.dex */
    public static final class C188361 extends Lambda implements Function1<ManualEntryState, Unit> {
        final /* synthetic */ String $input;
        final /* synthetic */ ManualEntryViewModel this$0;

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel$observeInputs$2$1$1 */
        /* loaded from: classes7.dex */
        public static final class C188371 extends Lambda implements Function1<ManualEntryState, ManualEntryState> {
            final /* synthetic */ Integer $error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C188371(Integer num) {
                super(1);
                this.$error = num;
            }

            @Override // kotlin.jvm.functions.Function1
            public final ManualEntryState invoke(ManualEntryState setState) {
                ManualEntryState copy;
                Intrinsics.checkNotNullParameter(setState, "$this$setState");
                copy = setState.copy((r18 & 1) != 0 ? setState.payload : null, (r18 & 2) != 0 ? setState.routing : null, (r18 & 4) != 0 ? setState.account : null, (r18 & 8) != 0 ? setState.accountConfirm : null, (r18 & 16) != 0 ? setState.routingError : null, (r18 & 32) != 0 ? setState.accountError : null, (r18 & 64) != 0 ? setState.accountConfirmError : this.$error, (r18 & 128) != 0 ? setState.linkPaymentAccount : null);
                return copy;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C188361(String str, ManualEntryViewModel manualEntryViewModel) {
            super(1);
            this.$input = str;
            this.this$0 = manualEntryViewModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ManualEntryState manualEntryState) {
            invoke2(manualEntryState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(ManualEntryState it) {
            Intrinsics.checkNotNullParameter(it, "it");
            ManualEntryInputValidator manualEntryInputValidator = ManualEntryInputValidator.INSTANCE;
            String account = it.getAccount();
            if (account == null) {
                account = "";
            }
            this.this$0.setState(new C188371(manualEntryInputValidator.getAccountConfirmIdOrNull(account, this.$input)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManualEntryViewModel$observeInputs$2(ManualEntryViewModel manualEntryViewModel, Continuation<? super ManualEntryViewModel$observeInputs$2> continuation) {
        super(2, continuation);
        this.this$0 = manualEntryViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ManualEntryViewModel$observeInputs$2 manualEntryViewModel$observeInputs$2 = new ManualEntryViewModel$observeInputs$2(this.this$0, continuation);
        manualEntryViewModel$observeInputs$2.L$0 = obj;
        return manualEntryViewModel$observeInputs$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            String str = (String) this.L$0;
            if (str != null) {
                ManualEntryViewModel manualEntryViewModel = this.this$0;
                manualEntryViewModel.withState(new C188361(str, manualEntryViewModel));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((ManualEntryViewModel$observeInputs$2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
