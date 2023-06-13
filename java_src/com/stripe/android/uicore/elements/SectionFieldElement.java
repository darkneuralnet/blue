package com.stripe.android.uicore.elements;

import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00030\u0002H&J\b\u0010\t\u001a\u00020\bH&J\u001e\u0010\u000e\u001a\u00020\r2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH&J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00030\u0002H&R\u0014\u0010\u0012\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/SectionFieldElement;", "", "LEu1;", "", "Lkotlin/Pair;", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "getFormFieldValueFlow", "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;", "sectionFieldErrorController", "", "", "rawValuesMap", "", "setRawValue", "getTextFieldIdentifiers", "getIdentifier", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "identifier", "", "getShouldRenderOutsideCard", "()Z", "shouldRenderOutsideCard", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public interface SectionFieldElement {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static boolean getShouldRenderOutsideCard(SectionFieldElement sectionFieldElement) {
            return false;
        }
    }

    InterfaceC32730Eu1<List<Pair<IdentifierSpec, FormFieldEntry>>> getFormFieldValueFlow();

    IdentifierSpec getIdentifier();

    boolean getShouldRenderOutsideCard();

    InterfaceC32730Eu1<List<IdentifierSpec>> getTextFieldIdentifiers();

    SectionFieldErrorController sectionFieldErrorController();

    void setRawValue(Map<IdentifierSpec, String> map);
}
