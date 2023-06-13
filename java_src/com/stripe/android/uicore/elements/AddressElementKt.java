package com.stripe.android.uicore.elements;

import com.stripe.android.uicore.C19423R;
import com.stripe.android.uicore.address.AutocompleteCapableAddressType;
import com.stripe.android.uicore.elements.TextFieldIcon;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a3\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m28432d2 = {"updateLine1ConfigForAutocompleteAffordance", "", "textConfig", "Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;", "countryCode", "", "addressType", "Lcom/stripe/android/uicore/elements/AddressType;", "isPlacesAvailable", "Lcom/stripe/android/uicore/elements/IsPlacesAvailable;", "(Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;Ljava/lang/String;Lcom/stripe/android/uicore/elements/AddressType;Lcom/stripe/android/uicore/elements/IsPlacesAvailable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateLine1WithAutocompleteAffordance", "field", "Lcom/stripe/android/uicore/elements/SectionFieldElement;", "(Lcom/stripe/android/uicore/elements/SectionFieldElement;Ljava/lang/String;Lcom/stripe/android/uicore/elements/AddressType;Lcom/stripe/android/uicore/elements/IsPlacesAvailable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stripe-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AddressElementKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Object updateLine1ConfigForAutocompleteAffordance(SimpleTextFieldConfig simpleTextFieldConfig, String str, AddressType addressType, IsPlacesAvailable isPlacesAvailable, Continuation<? super Unit> continuation) {
        AutocompleteCapableAddressType autocompleteCapableAddressType;
        Boolean bool;
        Object coroutine_suspended;
        TextFieldIcon.Trailing trailing = null;
        if (addressType instanceof AutocompleteCapableAddressType) {
            autocompleteCapableAddressType = (AutocompleteCapableAddressType) addressType;
        } else {
            autocompleteCapableAddressType = null;
        }
        if (autocompleteCapableAddressType != null) {
            bool = Boxing.boxBoolean(autocompleteCapableAddressType.supportsAutoComplete(str, isPlacesAvailable));
        } else {
            bool = null;
        }
        if (Intrinsics.areEqual(bool, Boxing.boxBoolean(true))) {
            trailing = new TextFieldIcon.Trailing(C19423R.C19424drawable.stripe_ic_search, Boxing.boxInt(C19423R.string.address_search_content_description), true, new C19441x85d2742d(addressType));
        }
        Object emit = simpleTextFieldConfig.getTrailingIcon().emit(trailing, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (emit == coroutine_suspended) {
            return emit;
        }
        return Unit.INSTANCE;
    }

    public static final Object updateLine1WithAutocompleteAffordance(SectionFieldElement sectionFieldElement, String str, AddressType addressType, IsPlacesAvailable isPlacesAvailable, Continuation<? super Unit> continuation) {
        SimpleTextElement simpleTextElement;
        TextFieldController textFieldController;
        SimpleTextFieldController simpleTextFieldController;
        TextFieldConfig textFieldConfig;
        Object coroutine_suspended;
        if (Intrinsics.areEqual(sectionFieldElement.getIdentifier(), IdentifierSpec.Companion.getLine1())) {
            SimpleTextFieldConfig simpleTextFieldConfig = null;
            if (sectionFieldElement instanceof SimpleTextElement) {
                simpleTextElement = (SimpleTextElement) sectionFieldElement;
            } else {
                simpleTextElement = null;
            }
            if (simpleTextElement != null) {
                textFieldController = simpleTextElement.getController();
            } else {
                textFieldController = null;
            }
            if (textFieldController instanceof SimpleTextFieldController) {
                simpleTextFieldController = (SimpleTextFieldController) textFieldController;
            } else {
                simpleTextFieldController = null;
            }
            if (simpleTextFieldController != null) {
                textFieldConfig = simpleTextFieldController.getTextFieldConfig();
            } else {
                textFieldConfig = null;
            }
            if (textFieldConfig instanceof SimpleTextFieldConfig) {
                simpleTextFieldConfig = textFieldConfig;
            }
            if (simpleTextFieldConfig != null) {
                Object updateLine1ConfigForAutocompleteAffordance = updateLine1ConfigForAutocompleteAffordance(simpleTextFieldConfig, str, addressType, isPlacesAvailable, continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (updateLine1ConfigForAutocompleteAffordance == coroutine_suspended) {
                    return updateLine1ConfigForAutocompleteAffordance;
                }
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }
}
