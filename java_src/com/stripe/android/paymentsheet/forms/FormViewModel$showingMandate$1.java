package com.stripe.android.paymentsheet.forms;

import com.stripe.android.p049ui.core.elements.MandateTextElement;
import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0007\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"}, m28432d2 = {"", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "hiddenIdentifiers", "", "Lcom/stripe/android/uicore/elements/FormElement;", "formElements", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.forms.FormViewModel$showingMandate$1", m28418f = "FormViewModel.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
@SourceDebugExtension({"SMAP\nFormViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FormViewModel.kt\ncom/stripe/android/paymentsheet/forms/FormViewModel$showingMandate$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,194:1\n800#2,11:195\n*S KotlinDebug\n*F\n+ 1 FormViewModel.kt\ncom/stripe/android/paymentsheet/forms/FormViewModel$showingMandate$1\n*L\n131#1:195,11\n*E\n"})
/* loaded from: classes7.dex */
public final class FormViewModel$showingMandate$1 extends SuspendLambda implements Function3<Set<? extends IdentifierSpec>, List<? extends FormElement>, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public FormViewModel$showingMandate$1(Continuation<? super FormViewModel$showingMandate$1> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Set<? extends IdentifierSpec> set, List<? extends FormElement> list, Continuation<? super Boolean> continuation) {
        return invoke2((Set<IdentifierSpec>) set, list, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object firstOrNull;
        MandateTextElement mandateTextElement;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Set set = (Set) this.L$0;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (List) this.L$1) {
                if (obj2 instanceof MandateTextElement) {
                    arrayList.add(obj2);
                }
            }
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) arrayList);
            boolean z = false;
            if (((MandateTextElement) firstOrNull) != null && (!set.contains(mandateTextElement.getIdentifier()))) {
                z = true;
            }
            return Boxing.boxBoolean(z);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(Set<IdentifierSpec> set, List<? extends FormElement> list, Continuation<? super Boolean> continuation) {
        FormViewModel$showingMandate$1 formViewModel$showingMandate$1 = new FormViewModel$showingMandate$1(continuation);
        formViewModel$showingMandate$1.L$0 = set;
        formViewModel$showingMandate$1.L$1 = list;
        return formViewModel$showingMandate$1.invokeSuspend(Unit.INSTANCE);
    }
}
