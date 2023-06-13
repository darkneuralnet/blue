package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.Function;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingFragment$onViewCreated$2", m28418f = "PollingFragment.kt", m28417i = {}, m28416l = {71}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class PollingFragment$onViewCreated$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ PollingFragment this$0;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingFragment$onViewCreated$2$1", m28418f = "PollingFragment.kt", m28417i = {}, m28416l = {72}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingFragment$onViewCreated$2$1 */
    /* loaded from: classes7.dex */
    public static final class C192791 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ PollingFragment this$0;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingFragment$onViewCreated$2$1$1 */
        /* loaded from: classes7.dex */
        public /* synthetic */ class C192801 implements InterfaceC33198Gu1, FunctionAdapter {
            final /* synthetic */ PollingFragment $tmp0;

            public C192801(PollingFragment pollingFragment) {
                this.$tmp0 = pollingFragment;
            }

            public final Object emit(PollingUiState pollingUiState, Continuation<? super Unit> continuation) {
                Object coroutine_suspended;
                Object invokeSuspend$handleUiState = C192791.invokeSuspend$handleUiState(this.$tmp0, pollingUiState, continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                return invokeSuspend$handleUiState == coroutine_suspended ? invokeSuspend$handleUiState : Unit.INSTANCE;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof InterfaceC33198Gu1) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, PollingFragment.class, "handleUiState", "handleUiState(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            @Override // p000.InterfaceC33198Gu1
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((PollingUiState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192791(PollingFragment pollingFragment, Continuation<? super C192791> continuation) {
            super(2, continuation);
            this.this$0 = pollingFragment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleUiState(PollingFragment pollingFragment, PollingUiState pollingUiState, Continuation continuation) {
            pollingFragment.handleUiState(pollingUiState);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C192791(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C192791) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            PollingViewModel viewModel;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                viewModel = this.this$0.getViewModel();
                InterfaceC49220tP5<PollingUiState> uiState = viewModel.getUiState();
                C192801 c192801 = new C192801(this.this$0);
                this.label = 1;
                if (uiState.collect(c192801, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollingFragment$onViewCreated$2(PollingFragment pollingFragment, Continuation<? super PollingFragment$onViewCreated$2> continuation) {
        super(2, continuation);
        this.this$0 = pollingFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PollingFragment$onViewCreated$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((PollingFragment$onViewCreated$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
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
            LifecycleOwner viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
            AbstractC11719f.EnumC11724b enumC11724b = AbstractC11719f.EnumC11724b.STARTED;
            C192791 c192791 = new C192791(this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.m67039a(viewLifecycleOwner, enumC11724b, c192791, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
