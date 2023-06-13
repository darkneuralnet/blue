package com.stripe.android.uicore.elements;

import com.stripe.android.uicore.elements.AddressType;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function5;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u008a@"}, m28432d2 = {"", "country", "", "Lcom/stripe/android/uicore/elements/SectionFieldElement;", "otherFields", "", "<anonymous parameter 2>", "<anonymous parameter 3>", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.uicore.elements.AddressElement$fields$1", m28418f = "AddressElement.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class AddressElement$fields$1 extends SuspendLambda implements Function5<String, List<? extends SectionFieldElement>, Unit, Unit, Continuation<? super List<? extends SectionFieldElement>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ AddressElement this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressElement$fields$1(AddressElement addressElement, Continuation<? super AddressElement$fields$1> continuation) {
        super(5, continuation);
        this.this$0 = addressElement;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x006e, code lost:
        if (((com.stripe.android.uicore.elements.AddressType.ShippingCondensed) r0).supportsAutoComplete(r7, r3) != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SimpleTextElement simpleTextElement;
        AddressTextFieldElement addressTextFieldElement;
        List listOf;
        SimpleTextElement simpleTextElement2;
        List listOf2;
        List plus;
        AddressType addressType;
        List listOf3;
        AddressType addressType2;
        PhoneNumberElement phoneNumberElement;
        List plus2;
        AddressType addressType3;
        IsPlacesAvailable isPlacesAvailable;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            String str = (String) this.L$0;
            simpleTextElement = this.this$0.nameElement;
            addressTextFieldElement = this.this$0.addressAutoCompleteElement;
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new SectionSingleFieldElement[]{simpleTextElement, this.this$0.getCountryElement(), addressTextFieldElement});
            simpleTextElement2 = this.this$0.nameElement;
            listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new SectionSingleFieldElement[]{simpleTextElement2, this.this$0.getCountryElement()});
            List list = (List) this.L$1;
            plus = CollectionsKt___CollectionsKt.plus((Collection) listOf2, (Iterable) list);
            addressType = this.this$0.addressType;
            if (addressType instanceof AddressType.ShippingCondensed) {
                addressType3 = this.this$0.addressType;
                isPlacesAvailable = this.this$0.isPlacesAvailable;
            } else {
                if (!(addressType instanceof AddressType.ShippingExpanded)) {
                    listOf3 = CollectionsKt__CollectionsJVMKt.listOf(this.this$0.getCountryElement());
                    listOf = CollectionsKt___CollectionsKt.plus((Collection) listOf3, (Iterable) list);
                    addressType2 = this.this$0.addressType;
                    if (addressType2.getPhoneNumberState() == PhoneNumberState.HIDDEN) {
                        phoneNumberElement = this.this$0.phoneNumberElement;
                        plus2 = CollectionsKt___CollectionsKt.plus((Collection<? extends PhoneNumberElement>) ((Collection<? extends Object>) listOf), phoneNumberElement);
                        return plus2;
                    }
                    return listOf;
                }
                listOf = plus;
                addressType2 = this.this$0.addressType;
                if (addressType2.getPhoneNumberState() == PhoneNumberState.HIDDEN) {
                }
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(String str, List<? extends SectionFieldElement> list, Unit unit, Unit unit2, Continuation<? super List<? extends SectionFieldElement>> continuation) {
        AddressElement$fields$1 addressElement$fields$1 = new AddressElement$fields$1(this.this$0, continuation);
        addressElement$fields$1.L$0 = str;
        addressElement$fields$1.L$1 = list;
        return addressElement$fields$1.invokeSuspend(Unit.INSTANCE);
    }
}
