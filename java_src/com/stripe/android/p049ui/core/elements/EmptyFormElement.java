package com.stripe.android.p049ui.core.elements;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.uicore.elements.Controller;
import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00030\u0002H\u0016J\t\u0010\b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u001a\u0010\u000b\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/EmptyFormElement;", "Lcom/stripe/android/uicore/elements/FormElement;", "LEu1;", "", "Lkotlin/Pair;", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "getFormFieldValueFlow", "component1", "Lcom/stripe/android/uicore/elements/Controller;", "component2", "identifier", "controller", "copy", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getIdentifier", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/elements/Controller;", "getController", "()Lcom/stripe/android/uicore/elements/Controller;", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/Controller;)V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.ui.core.elements.EmptyFormElement */
/* loaded from: classes7.dex */
public final class EmptyFormElement implements FormElement {
    public static final int $stable = 8;
    private final Controller controller;
    private final IdentifierSpec identifier;

    public EmptyFormElement() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ EmptyFormElement copy$default(EmptyFormElement emptyFormElement, IdentifierSpec identifierSpec, Controller controller, int i, Object obj) {
        if ((i & 1) != 0) {
            identifierSpec = emptyFormElement.getIdentifier();
        }
        if ((i & 2) != 0) {
            controller = emptyFormElement.getController();
        }
        return emptyFormElement.copy(identifierSpec, controller);
    }

    public final IdentifierSpec component1() {
        return getIdentifier();
    }

    public final Controller component2() {
        return getController();
    }

    public final EmptyFormElement copy(IdentifierSpec identifier, Controller controller) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return new EmptyFormElement(identifier, controller);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmptyFormElement) {
            EmptyFormElement emptyFormElement = (EmptyFormElement) obj;
            return Intrinsics.areEqual(getIdentifier(), emptyFormElement.getIdentifier()) && Intrinsics.areEqual(getController(), emptyFormElement.getController());
        }
        return false;
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public Controller getController() {
        return this.controller;
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public InterfaceC32730Eu1<List<Pair<IdentifierSpec, FormFieldEntry>>> getFormFieldValueFlow() {
        List emptyList;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return C50405vP5.m8742a(emptyList);
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public InterfaceC32730Eu1<List<IdentifierSpec>> getTextFieldIdentifiers() {
        return FormElement.DefaultImpls.getTextFieldIdentifiers(this);
    }

    public int hashCode() {
        return (getIdentifier().hashCode() * 31) + (getController() == null ? 0 : getController().hashCode());
    }

    public String toString() {
        IdentifierSpec identifier = getIdentifier();
        Controller controller = getController();
        return "EmptyFormElement(identifier=" + identifier + ", controller=" + controller + ")";
    }

    public EmptyFormElement(IdentifierSpec identifier, Controller controller) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.identifier = identifier;
        this.controller = controller;
    }

    public /* synthetic */ EmptyFormElement(IdentifierSpec identifierSpec, Controller controller, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? IdentifierSpec.Companion.Generic("empty_form") : identifierSpec, (i & 2) != 0 ? null : controller);
    }
}
