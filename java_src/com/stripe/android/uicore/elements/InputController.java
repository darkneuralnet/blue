package com.stripe.android.uicore.elements;

import com.stripe.android.uicore.forms.FormFieldEntry;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\tR\u0014\u0010\u0013\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/InputController;", "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;", "", "rawValue", "", "onRawValueChange", "LEu1;", "", "getLabel", "()LEu1;", "label", "getFieldValue", "fieldValue", "getRawFieldValue", "rawFieldValue", "", "isComplete", "getShowOptionalLabel", "()Z", "showOptionalLabel", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "getFormFieldValue", "formFieldValue", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public interface InputController extends SectionFieldErrorController {
    InterfaceC32730Eu1<String> getFieldValue();

    InterfaceC32730Eu1<FormFieldEntry> getFormFieldValue();

    InterfaceC32730Eu1<Integer> getLabel();

    InterfaceC32730Eu1<String> getRawFieldValue();

    boolean getShowOptionalLabel();

    InterfaceC32730Eu1<Boolean> isComplete();

    void onRawValueChange(String str);
}
