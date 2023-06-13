package com.stripe.android.paymentsheet.p047ui;

import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.stripe.android.paymentsheet.databinding.FragmentPrimaryButtonContainerBinding;
import com.stripe.android.paymentsheet.model.PaymentSheetViewState;
import com.stripe.android.paymentsheet.p047ui.PrimaryButton;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¨\u0006\u0003"}, m28432d2 = {"T", "LZC0;", "", "com/stripe/android/paymentsheet/utils/UiUtilsKt$launchAndCollectIn$1", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.ui.PaymentSheetPrimaryButtonContainerFragment$onViewCreated$$inlined$launchAndCollectIn$default$1", m28418f = "PrimaryButtonContainerFragment.kt", m28417i = {}, m28416l = {21}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
@SourceDebugExtension({"SMAP\nUiUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UiUtils.kt\ncom/stripe/android/paymentsheet/utils/UiUtilsKt$launchAndCollectIn$1\n*L\n1#1,27:1\n*E\n"})
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentSheetPrimaryButtonContainerFragment$onViewCreated$$inlined$launchAndCollectIn$default$1 */
/* loaded from: classes7.dex */
public final class C19315xde32b864 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC11719f.EnumC11724b $minActiveState;
    final /* synthetic */ LifecycleOwner $owner;
    final /* synthetic */ InterfaceC32730Eu1 $this_launchAndCollectIn;
    int label;
    final /* synthetic */ PaymentSheetPrimaryButtonContainerFragment this$0;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¨\u0006\u0003"}, m28432d2 = {"T", "LZC0;", "", "com/stripe/android/paymentsheet/utils/UiUtilsKt$launchAndCollectIn$1$1", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.ui.PaymentSheetPrimaryButtonContainerFragment$onViewCreated$$inlined$launchAndCollectIn$default$1$1", m28418f = "PrimaryButtonContainerFragment.kt", m28417i = {}, m28416l = {22}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    @SourceDebugExtension({"SMAP\nUiUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UiUtils.kt\ncom/stripe/android/paymentsheet/utils/UiUtilsKt$launchAndCollectIn$1$1\n*L\n1#1,27:1\n*E\n"})
    /* renamed from: com.stripe.android.paymentsheet.ui.PaymentSheetPrimaryButtonContainerFragment$onViewCreated$$inlined$launchAndCollectIn$default$1$1 */
    /* loaded from: classes7.dex */
    public static final class C193161 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        final /* synthetic */ InterfaceC32730Eu1 $this_launchAndCollectIn;
        int label;
        final /* synthetic */ PaymentSheetPrimaryButtonContainerFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C193161(InterfaceC32730Eu1 interfaceC32730Eu1, Continuation continuation, PaymentSheetPrimaryButtonContainerFragment paymentSheetPrimaryButtonContainerFragment) {
            super(2, continuation);
            this.$this_launchAndCollectIn = interfaceC32730Eu1;
            this.this$0 = paymentSheetPrimaryButtonContainerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C193161(this.$this_launchAndCollectIn, continuation, this.this$0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C193161) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC32730Eu1 interfaceC32730Eu1 = this.$this_launchAndCollectIn;
                final PaymentSheetPrimaryButtonContainerFragment paymentSheetPrimaryButtonContainerFragment = this.this$0;
                InterfaceC33198Gu1<PaymentSheetViewState> interfaceC33198Gu1 = new InterfaceC33198Gu1<PaymentSheetViewState>() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetPrimaryButtonContainerFragment$onViewCreated$.inlined.launchAndCollectIn.default.1.1.1
                    @Override // p000.InterfaceC33198Gu1
                    public final Object emit(PaymentSheetViewState paymentSheetViewState, Continuation<? super Unit> continuation) {
                        PrimaryButton primaryButton;
                        PrimaryButton.State state;
                        PaymentSheetViewState paymentSheetViewState2 = paymentSheetViewState;
                        FragmentPrimaryButtonContainerBinding viewBinding = PaymentSheetPrimaryButtonContainerFragment.this.getViewBinding();
                        if (viewBinding != null && (primaryButton = viewBinding.primaryButton) != null) {
                            if (paymentSheetViewState2 != null) {
                                state = PrimaryButtonContainerFragmentKt.convert(paymentSheetViewState2);
                            } else {
                                state = null;
                            }
                            primaryButton.updateState(state);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (interfaceC32730Eu1.collect(interfaceC33198Gu1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19315xde32b864(LifecycleOwner lifecycleOwner, AbstractC11719f.EnumC11724b enumC11724b, InterfaceC32730Eu1 interfaceC32730Eu1, Continuation continuation, PaymentSheetPrimaryButtonContainerFragment paymentSheetPrimaryButtonContainerFragment) {
        super(2, continuation);
        this.$owner = lifecycleOwner;
        this.$minActiveState = enumC11724b;
        this.$this_launchAndCollectIn = interfaceC32730Eu1;
        this.this$0 = paymentSheetPrimaryButtonContainerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C19315xde32b864(this.$owner, this.$minActiveState, this.$this_launchAndCollectIn, continuation, this.this$0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((C19315xde32b864) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            LifecycleOwner lifecycleOwner = this.$owner;
            AbstractC11719f.EnumC11724b enumC11724b = this.$minActiveState;
            C193161 c193161 = new C193161(this.$this_launchAndCollectIn, null, this.this$0);
            this.label = 1;
            if (RepeatOnLifecycleKt.m67039a(lifecycleOwner, enumC11724b, c193161, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
