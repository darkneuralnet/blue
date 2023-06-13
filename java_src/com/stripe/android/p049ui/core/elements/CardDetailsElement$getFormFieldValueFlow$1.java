package com.stripe.android.p049ui.core.elements;

import com.stripe.android.model.CardBrand;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt___MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function5;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00000\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@"}, m28432d2 = {"Lcom/stripe/android/uicore/forms/FormFieldEntry;", "number", "cvc", "expirationDate", "Lcom/stripe/android/model/CardBrand;", AccountRangeJsonParser.FIELD_BRAND, "", "Lkotlin/Pair;", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.ui.core.elements.CardDetailsElement$getFormFieldValueFlow$1", m28418f = "CardDetailsElement.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* renamed from: com.stripe.android.ui.core.elements.CardDetailsElement$getFormFieldValueFlow$1 */
/* loaded from: classes7.dex */
public final class CardDetailsElement$getFormFieldValueFlow$1 extends SuspendLambda implements Function5<FormFieldEntry, FormFieldEntry, FormFieldEntry, CardBrand, Continuation<? super List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;
    final /* synthetic */ CardDetailsElement this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDetailsElement$getFormFieldValueFlow$1(CardDetailsElement cardDetailsElement, Continuation<? super CardDetailsElement$getFormFieldValueFlow$1> continuation) {
        super(5, continuation);
        this.this$0 = cardDetailsElement;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(FormFieldEntry formFieldEntry, FormFieldEntry formFieldEntry2, FormFieldEntry formFieldEntry3, CardBrand cardBrand, Continuation<? super List<Pair<IdentifierSpec, FormFieldEntry>>> continuation) {
        CardDetailsElement$getFormFieldValueFlow$1 cardDetailsElement$getFormFieldValueFlow$1 = new CardDetailsElement$getFormFieldValueFlow$1(this.this$0, continuation);
        cardDetailsElement$getFormFieldValueFlow$1.L$0 = formFieldEntry;
        cardDetailsElement$getFormFieldValueFlow$1.L$1 = formFieldEntry2;
        cardDetailsElement$getFormFieldValueFlow$1.L$2 = formFieldEntry3;
        cardDetailsElement$getFormFieldValueFlow$1.L$3 = cardBrand;
        return cardDetailsElement$getFormFieldValueFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List listOf;
        List list;
        List plus;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m28425to(this.this$0.getController().getNumberElement().getIdentifier(), (FormFieldEntry) this.L$0), TuplesKt.m28425to(this.this$0.getController().getCvcElement().getIdentifier(), (FormFieldEntry) this.L$1), TuplesKt.m28425to(IdentifierSpec.Companion.getCardBrand(), new FormFieldEntry(((CardBrand) this.L$3).getCode(), true))});
            list = MapsKt___MapsKt.toList(CardDetailsElementKt.createExpiryDateFormFieldValues((FormFieldEntry) this.L$2));
            plus = CollectionsKt___CollectionsKt.plus((Collection) listOf, (Iterable) list);
            return plus;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function5
    public /* bridge */ /* synthetic */ Object invoke(FormFieldEntry formFieldEntry, FormFieldEntry formFieldEntry2, FormFieldEntry formFieldEntry3, CardBrand cardBrand, Continuation<? super List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> continuation) {
        return invoke2(formFieldEntry, formFieldEntry2, formFieldEntry3, cardBrand, (Continuation<? super List<Pair<IdentifierSpec, FormFieldEntry>>>) continuation);
    }
}
