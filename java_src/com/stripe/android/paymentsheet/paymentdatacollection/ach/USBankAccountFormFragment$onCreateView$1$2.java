package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$onCreateView$1$2", m28418f = "USBankAccountFormFragment.kt", m28417i = {}, m28416l = {173}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class USBankAccountFormFragment$onCreateView$1$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ USBankAccountFormFragment this$0;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$onCreateView$1$2$1", m28418f = "USBankAccountFormFragment.kt", m28417i = {}, m28416l = {174}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$onCreateView$1$2$1 */
    /* loaded from: classes7.dex */
    public static final class C192501 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ USBankAccountFormFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192501(USBankAccountFormFragment uSBankAccountFormFragment, Continuation<? super C192501> continuation) {
            super(2, continuation);
            this.this$0 = uSBankAccountFormFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C192501(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C192501) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            USBankAccountFormViewModel viewModel;
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
                InterfaceC49220tP5<Boolean> requiredFields = viewModel.getRequiredFields();
                final USBankAccountFormFragment uSBankAccountFormFragment = this.this$0;
                InterfaceC33198Gu1<Boolean> interfaceC33198Gu1 = new InterfaceC33198Gu1<Boolean>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment.onCreateView.1.2.1.1
                    @Override // p000.InterfaceC33198Gu1
                    public /* bridge */ /* synthetic */ Object emit(Boolean bool, Continuation continuation) {
                        return emit(bool.booleanValue(), continuation);
                    }

                    public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                        BaseSheetViewModel sheetViewModel;
                        sheetViewModel = USBankAccountFormFragment.this.getSheetViewModel();
                        if (sheetViewModel != null) {
                            sheetViewModel.updateCustomPrimaryButtonUiState(new USBankAccountFormFragment$onCreateView$1$2$1$1$emit$2(z));
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (requiredFields.collect(interfaceC33198Gu1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USBankAccountFormFragment$onCreateView$1$2(USBankAccountFormFragment uSBankAccountFormFragment, Continuation<? super USBankAccountFormFragment$onCreateView$1$2> continuation) {
        super(2, continuation);
        this.this$0 = uSBankAccountFormFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new USBankAccountFormFragment$onCreateView$1$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((USBankAccountFormFragment$onCreateView$1$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            C192501 c192501 = new C192501(this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.m67039a(viewLifecycleOwner, enumC11724b, c192501, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
