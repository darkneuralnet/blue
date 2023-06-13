package com.stripe.android.p049ui.core.elements;

import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, m28432d2 = {"", "complete", "", "fieldValue", "", "Lkotlin/Pair;", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.ui.core.elements.BsbElement$getFormFieldValueFlow$1", m28418f = "BsbElement.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* renamed from: com.stripe.android.ui.core.elements.BsbElement$getFormFieldValueFlow$1 */
/* loaded from: classes7.dex */
public final class BsbElement$getFormFieldValueFlow$1 extends SuspendLambda implements Function3<Boolean, String, Continuation<? super List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ BsbElement this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BsbElement$getFormFieldValueFlow$1(BsbElement bsbElement, Continuation<? super BsbElement$getFormFieldValueFlow$1> continuation) {
        super(3, continuation);
        this.this$0 = bsbElement;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, String str, Continuation<? super List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> continuation) {
        return invoke(bool.booleanValue(), str, (Continuation<? super List<Pair<IdentifierSpec, FormFieldEntry>>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List listOf;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            listOf = CollectionsKt__CollectionsJVMKt.listOf(TuplesKt.m28425to(this.this$0.getIdentifier(), new FormFieldEntry((String) this.L$0, this.Z$0)));
            return listOf;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(boolean z, String str, Continuation<? super List<Pair<IdentifierSpec, FormFieldEntry>>> continuation) {
        BsbElement$getFormFieldValueFlow$1 bsbElement$getFormFieldValueFlow$1 = new BsbElement$getFormFieldValueFlow$1(this.this$0, continuation);
        bsbElement$getFormFieldValueFlow$1.Z$0 = z;
        bsbElement$getFormFieldValueFlow$1.L$0 = str;
        return bsbElement$getFormFieldValueFlow$1.invokeSuspend(Unit.INSTANCE);
    }
}
