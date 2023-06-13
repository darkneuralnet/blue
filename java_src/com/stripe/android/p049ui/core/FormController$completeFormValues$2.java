package com.stripe.android.p049ui.core;

import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.LinkedHashMap;
import java.util.Map;
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
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u008a@"}, m28432d2 = {"", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "elementsList", "", "hiddenIdentifiers", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.ui.core.FormController$completeFormValues$2", m28418f = "FormController.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
@SourceDebugExtension({"SMAP\nFormController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FormController.kt\ncom/stripe/android/ui/core/FormController$completeFormValues$2\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,107:1\n515#2:108\n500#2,6:109\n*S KotlinDebug\n*F\n+ 1 FormController.kt\ncom/stripe/android/ui/core/FormController$completeFormValues$2\n*L\n63#1:108\n63#1:109,6\n*E\n"})
/* renamed from: com.stripe.android.ui.core.FormController$completeFormValues$2 */
/* loaded from: classes7.dex */
public final class FormController$completeFormValues$2 extends SuspendLambda implements Function3<Map<IdentifierSpec, ? extends FormFieldEntry>, Set<? extends IdentifierSpec>, Continuation<? super Map<IdentifierSpec, ? extends FormFieldEntry>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public FormController$completeFormValues$2(Continuation<? super FormController$completeFormValues$2> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Map<IdentifierSpec, ? extends FormFieldEntry> map, Set<? extends IdentifierSpec> set, Continuation<? super Map<IdentifierSpec, ? extends FormFieldEntry>> continuation) {
        return invoke2((Map<IdentifierSpec, FormFieldEntry>) map, (Set<IdentifierSpec>) set, (Continuation<? super Map<IdentifierSpec, FormFieldEntry>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Set set = (Set) this.L$1;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((Map) this.L$0).entrySet()) {
                if (!set.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return linkedHashMap;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(Map<IdentifierSpec, FormFieldEntry> map, Set<IdentifierSpec> set, Continuation<? super Map<IdentifierSpec, FormFieldEntry>> continuation) {
        FormController$completeFormValues$2 formController$completeFormValues$2 = new FormController$completeFormValues$2(continuation);
        formController$completeFormValues$2.L$0 = map;
        formController$completeFormValues$2.L$1 = set;
        return formController$completeFormValues$2.invokeSuspend(Unit.INSTANCE);
    }
}
