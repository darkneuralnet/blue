package com.stripe.android.paymentsheet.forms;

import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function5;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u008a@"}, m28432d2 = {"", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "idFieldSnapshotMap", "", "hiddenIdentifiers", "", "showingMandate", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "userRequestedReuse", "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.forms.CompleteFormFieldValueFilter$filterFlow$1", m28418f = "CompleteFormFieldValueFilter.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class CompleteFormFieldValueFilter$filterFlow$1 extends SuspendLambda implements Function5<Map<IdentifierSpec, ? extends FormFieldEntry>, Set<? extends IdentifierSpec>, Boolean, PaymentSelection.CustomerRequestedSave, Continuation<? super FormFieldValues>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ CompleteFormFieldValueFilter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompleteFormFieldValueFilter$filterFlow$1(CompleteFormFieldValueFilter completeFormFieldValueFilter, Continuation<? super CompleteFormFieldValueFilter$filterFlow$1> continuation) {
        super(5, continuation);
        this.this$0 = completeFormFieldValueFilter;
    }

    @Override // kotlin.jvm.functions.Function5
    public /* bridge */ /* synthetic */ Object invoke(Map<IdentifierSpec, ? extends FormFieldEntry> map, Set<? extends IdentifierSpec> set, Boolean bool, PaymentSelection.CustomerRequestedSave customerRequestedSave, Continuation<? super FormFieldValues> continuation) {
        return invoke((Map<IdentifierSpec, FormFieldEntry>) map, (Set<IdentifierSpec>) set, bool.booleanValue(), customerRequestedSave, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FormFieldValues filterFlow;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            filterFlow = this.this$0.filterFlow((Map) this.L$0, (Set) this.L$1, this.Z$0, (PaymentSelection.CustomerRequestedSave) this.L$2);
            return filterFlow;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(Map<IdentifierSpec, FormFieldEntry> map, Set<IdentifierSpec> set, boolean z, PaymentSelection.CustomerRequestedSave customerRequestedSave, Continuation<? super FormFieldValues> continuation) {
        CompleteFormFieldValueFilter$filterFlow$1 completeFormFieldValueFilter$filterFlow$1 = new CompleteFormFieldValueFilter$filterFlow$1(this.this$0, continuation);
        completeFormFieldValueFilter$filterFlow$1.L$0 = map;
        completeFormFieldValueFilter$filterFlow$1.L$1 = set;
        completeFormFieldValueFilter$filterFlow$1.Z$0 = z;
        completeFormFieldValueFilter$filterFlow$1.L$2 = customerRequestedSave;
        return completeFormFieldValueFilter$filterFlow$1.invokeSuspend(Unit.INSTANCE);
    }
}
