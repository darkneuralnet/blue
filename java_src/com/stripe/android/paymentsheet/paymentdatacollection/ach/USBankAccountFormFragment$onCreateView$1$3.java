package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import android.content.Context;
import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.stripe.android.paymentsheet.C19159R;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormScreenState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$onCreateView$1$3", m28418f = "USBankAccountFormFragment.kt", m28417i = {}, m28416l = {183}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class USBankAccountFormFragment$onCreateView$1$3 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ USBankAccountFormFragment this$0;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$onCreateView$1$3$1", m28418f = "USBankAccountFormFragment.kt", m28417i = {}, m28416l = {186}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    @SourceDebugExtension({"SMAP\nUSBankAccountFormFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 USBankAccountFormFragment.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$onCreateView$1$3$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,486:1\n27#2:487\n29#2:491\n50#3:488\n55#3:490\n106#4:489\n*S KotlinDebug\n*F\n+ 1 USBankAccountFormFragment.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$onCreateView$1$3$1\n*L\n185#1:487\n185#1:491\n185#1:488\n185#1:490\n185#1:489\n*E\n"})
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$onCreateView$1$3$1 */
    /* loaded from: classes7.dex */
    public static final class C192521 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ USBankAccountFormFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192521(USBankAccountFormFragment uSBankAccountFormFragment, Continuation<? super C192521> continuation) {
            super(2, continuation);
            this.this$0 = uSBankAccountFormFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C192521(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C192521) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            USBankAccountFormViewModel viewModel;
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
                viewModel = this.this$0.getViewModel();
                final InterfaceC49220tP5<Boolean> saveForFutureUse = viewModel.getSaveForFutureUse();
                final USBankAccountFormFragment uSBankAccountFormFragment = this.this$0;
                InterfaceC32730Eu1<Boolean> interfaceC32730Eu1 = new InterfaceC32730Eu1<Boolean>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$onCreateView$1$3$1$invokeSuspend$$inlined$filterNot$1

                    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 USBankAccountFormFragment.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$onCreateView$1$3$1\n*L\n1#1,222:1\n28#2:223\n29#2:225\n185#3:224\n*E\n"})
                    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$onCreateView$1$3$1$invokeSuspend$$inlined$filterNot$1$2 */
                    /* loaded from: classes7.dex */
                    public static final class C192382<T> implements InterfaceC33198Gu1 {
                        final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;
                        final /* synthetic */ USBankAccountFormFragment this$0;

                        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                        @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$onCreateView$1$3$1$invokeSuspend$$inlined$filterNot$1$2", m28418f = "USBankAccountFormFragment.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                        /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$onCreateView$1$3$1$invokeSuspend$$inlined$filterNot$1$2$1 */
                        /* loaded from: classes7.dex */
                        public static final class C192391 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public C192391(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C192382.this.emit(null, this);
                            }
                        }

                        public C192382(InterfaceC33198Gu1 interfaceC33198Gu1, USBankAccountFormFragment uSBankAccountFormFragment) {
                            this.$this_unsafeFlow = interfaceC33198Gu1;
                            this.this$0 = uSBankAccountFormFragment;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                        @Override // p000.InterfaceC33198Gu1
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            C192391 c192391;
                            Object coroutine_suspended;
                            int i;
                            USBankAccountFormViewModel viewModel;
                            if (continuation instanceof C192391) {
                                c192391 = (C192391) continuation;
                                int i2 = c192391.label;
                                if ((i2 & Integer.MIN_VALUE) != 0) {
                                    c192391.label = i2 - Integer.MIN_VALUE;
                                    Object obj2 = c192391.result;
                                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = c192391.label;
                                    if (i == 0) {
                                        if (i == 1) {
                                            ResultKt.throwOnFailure(obj2);
                                        } else {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                    } else {
                                        ResultKt.throwOnFailure(obj2);
                                        InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                        ((Boolean) obj).booleanValue();
                                        viewModel = this.this$0.getViewModel();
                                        if (!(viewModel.getCurrentScreenState().getValue() instanceof USBankAccountFormScreenState.NameAndEmailCollection)) {
                                            c192391.label = 1;
                                            if (interfaceC33198Gu1.emit(obj, c192391) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                            c192391 = new C192391(continuation);
                            Object obj22 = c192391.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c192391.label;
                            if (i == 0) {
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // p000.InterfaceC32730Eu1
                    public Object collect(InterfaceC33198Gu1<? super Boolean> interfaceC33198Gu1, Continuation continuation) {
                        Object coroutine_suspended2;
                        Object collect = InterfaceC32730Eu1.this.collect(new C192382(interfaceC33198Gu1, uSBankAccountFormFragment), continuation);
                        coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (collect == coroutine_suspended2) {
                            return collect;
                        }
                        return Unit.INSTANCE;
                    }
                };
                final USBankAccountFormFragment uSBankAccountFormFragment2 = this.this$0;
                InterfaceC33198Gu1<Boolean> interfaceC33198Gu1 = new InterfaceC33198Gu1<Boolean>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment.onCreateView.1.3.1.2
                    @Override // p000.InterfaceC33198Gu1
                    public /* bridge */ /* synthetic */ Object emit(Boolean bool, Continuation continuation) {
                        return emit(bool.booleanValue(), continuation);
                    }

                    public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                        String continueMandateText;
                        USBankAccountFormViewModel viewModel2;
                        USBankAccountFormFragment uSBankAccountFormFragment3 = USBankAccountFormFragment.this;
                        if (z) {
                            int i2 = C19159R.string.stripe_paymentsheet_ach_save_mandate;
                            viewModel2 = uSBankAccountFormFragment3.getViewModel();
                            continueMandateText = uSBankAccountFormFragment3.getString(i2, viewModel2.formattedMerchantName());
                        } else {
                            ACHText aCHText = ACHText.INSTANCE;
                            Context requireContext = uSBankAccountFormFragment3.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
                            continueMandateText = aCHText.getContinueMandateText(requireContext);
                        }
                        uSBankAccountFormFragment3.updateMandateText(continueMandateText);
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
    public USBankAccountFormFragment$onCreateView$1$3(USBankAccountFormFragment uSBankAccountFormFragment, Continuation<? super USBankAccountFormFragment$onCreateView$1$3> continuation) {
        super(2, continuation);
        this.this$0 = uSBankAccountFormFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new USBankAccountFormFragment$onCreateView$1$3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((USBankAccountFormFragment$onCreateView$1$3) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            C192521 c192521 = new C192521(this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.m67039a(viewLifecycleOwner, enumC11724b, c192521, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
