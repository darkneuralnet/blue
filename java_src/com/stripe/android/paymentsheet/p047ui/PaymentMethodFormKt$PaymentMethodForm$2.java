package com.stripe.android.paymentsheet.p047ui;

import com.stripe.android.paymentsheet.forms.FormFieldValues;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.ui.PaymentMethodFormKt$PaymentMethodForm$2", m28418f = "PaymentMethodForm.kt", m28417i = {}, m28416l = {65}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentMethodFormKt$PaymentMethodForm$2 */
/* loaded from: classes7.dex */
public final class PaymentMethodFormKt$PaymentMethodForm$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC32730Eu1<FormFieldValues> $completeFormValues;
    final /* synthetic */ Function1<FormFieldValues, Unit> $onFormFieldValuesChanged;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodFormKt$PaymentMethodForm$2(InterfaceC32730Eu1<FormFieldValues> interfaceC32730Eu1, Function1<? super FormFieldValues, Unit> function1, Continuation<? super PaymentMethodFormKt$PaymentMethodForm$2> continuation) {
        super(2, continuation);
        this.$completeFormValues = interfaceC32730Eu1;
        this.$onFormFieldValuesChanged = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PaymentMethodFormKt$PaymentMethodForm$2(this.$completeFormValues, this.$onFormFieldValuesChanged, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((PaymentMethodFormKt$PaymentMethodForm$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC32730Eu1<FormFieldValues> interfaceC32730Eu1 = this.$completeFormValues;
            final Function1<FormFieldValues, Unit> function1 = this.$onFormFieldValuesChanged;
            InterfaceC33198Gu1<FormFieldValues> interfaceC33198Gu1 = new InterfaceC33198Gu1<FormFieldValues>() { // from class: com.stripe.android.paymentsheet.ui.PaymentMethodFormKt$PaymentMethodForm$2.1
                @Override // p000.InterfaceC33198Gu1
                public /* bridge */ /* synthetic */ Object emit(FormFieldValues formFieldValues, Continuation continuation) {
                    return emit2(formFieldValues, (Continuation<? super Unit>) continuation);
                }

                /* renamed from: emit  reason: avoid collision after fix types in other method */
                public final Object emit2(FormFieldValues formFieldValues, Continuation<? super Unit> continuation) {
                    function1.invoke(formFieldValues);
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
