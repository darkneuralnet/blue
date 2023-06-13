package com.stripe.android.uicore.elements;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/CountryElement;", "Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;", "identifier", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "controller", "Lcom/stripe/android/uicore/elements/DropdownFieldController;", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/DropdownFieldController;)V", "getController", "()Lcom/stripe/android/uicore/elements/DropdownFieldController;", "getIdentifier", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class CountryElement extends SectionSingleFieldElement {
    public static final int $stable = 8;
    private final DropdownFieldController controller;
    private final IdentifierSpec identifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountryElement(IdentifierSpec identifier, DropdownFieldController controller) {
        super(identifier);
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.identifier = identifier;
        this.controller = controller;
    }

    public static /* synthetic */ CountryElement copy$default(CountryElement countryElement, IdentifierSpec identifierSpec, DropdownFieldController dropdownFieldController, int i, Object obj) {
        if ((i & 1) != 0) {
            identifierSpec = countryElement.getIdentifier();
        }
        if ((i & 2) != 0) {
            dropdownFieldController = countryElement.getController();
        }
        return countryElement.copy(identifierSpec, dropdownFieldController);
    }

    public final IdentifierSpec component1() {
        return getIdentifier();
    }

    public final DropdownFieldController component2() {
        return getController();
    }

    public final CountryElement copy(IdentifierSpec identifier, DropdownFieldController controller) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(controller, "controller");
        return new CountryElement(identifier, controller);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CountryElement) {
            CountryElement countryElement = (CountryElement) obj;
            return Intrinsics.areEqual(getIdentifier(), countryElement.getIdentifier()) && Intrinsics.areEqual(getController(), countryElement.getController());
        }
        return false;
    }

    @Override // com.stripe.android.uicore.elements.SectionSingleFieldElement, com.stripe.android.uicore.elements.SectionFieldElement
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    public int hashCode() {
        return (getIdentifier().hashCode() * 31) + getController().hashCode();
    }

    public String toString() {
        IdentifierSpec identifier = getIdentifier();
        DropdownFieldController controller = getController();
        return "CountryElement(identifier=" + identifier + ", controller=" + controller + ")";
    }

    @Override // com.stripe.android.uicore.elements.SectionSingleFieldElement
    public DropdownFieldController getController() {
        return this.controller;
    }
}
