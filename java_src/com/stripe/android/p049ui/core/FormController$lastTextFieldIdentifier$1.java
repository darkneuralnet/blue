package com.stripe.android.p049ui.core;

import com.stripe.android.uicore.elements.IdentifierSpec;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u008a@"}, m28432d2 = {"", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "hiddenIds", "", "textFieldControllerIds", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.ui.core.FormController$lastTextFieldIdentifier$1", m28418f = "FormController.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
@SourceDebugExtension({"SMAP\nFormController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FormController.kt\ncom/stripe/android/ui/core/FormController$lastTextFieldIdentifier$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,107:1\n533#2,6:108\n*S KotlinDebug\n*F\n+ 1 FormController.kt\ncom/stripe/android/ui/core/FormController$lastTextFieldIdentifier$1\n*L\n102#1:108,6\n*E\n"})
/* renamed from: com.stripe.android.ui.core.FormController$lastTextFieldIdentifier$1 */
/* loaded from: classes7.dex */
public final class FormController$lastTextFieldIdentifier$1 extends SuspendLambda implements Function3<Set<? extends IdentifierSpec>, List<? extends IdentifierSpec>, Continuation<? super IdentifierSpec>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public FormController$lastTextFieldIdentifier$1(Continuation<? super FormController$lastTextFieldIdentifier$1> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Set<? extends IdentifierSpec> set, List<? extends IdentifierSpec> list, Continuation<? super IdentifierSpec> continuation) {
        return invoke2((Set<IdentifierSpec>) set, (List<IdentifierSpec>) list, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Set set = (Set) this.L$0;
            List list = (List) this.L$1;
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                Object previous = listIterator.previous();
                if (!set.contains((IdentifierSpec) previous)) {
                    return previous;
                }
            }
            return null;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(Set<IdentifierSpec> set, List<IdentifierSpec> list, Continuation<? super IdentifierSpec> continuation) {
        FormController$lastTextFieldIdentifier$1 formController$lastTextFieldIdentifier$1 = new FormController$lastTextFieldIdentifier$1(continuation);
        formController$lastTextFieldIdentifier$1.L$0 = set;
        formController$lastTextFieldIdentifier$1.L$1 = list;
        return formController$lastTextFieldIdentifier$1.invokeSuspend(Unit.INSTANCE);
    }
}
