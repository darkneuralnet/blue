package com.stripe.android.uicore.elements;

import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00030\u0002H&J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\u0016R\u0014\u0010\u000b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/FormElement;", "", "LEu1;", "", "Lkotlin/Pair;", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "getFormFieldValueFlow", "getTextFieldIdentifiers", "getIdentifier", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "identifier", "Lcom/stripe/android/uicore/elements/Controller;", "getController", "()Lcom/stripe/android/uicore/elements/Controller;", "controller", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public interface FormElement {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static InterfaceC32730Eu1<List<IdentifierSpec>> getTextFieldIdentifiers(FormElement formElement) {
            List emptyList;
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return C50405vP5.m8742a(emptyList);
        }
    }

    Controller getController();

    InterfaceC32730Eu1<List<Pair<IdentifierSpec, FormFieldEntry>>> getFormFieldValueFlow();

    IdentifierSpec getIdentifier();

    InterfaceC32730Eu1<List<IdentifierSpec>> getTextFieldIdentifiers();
}
