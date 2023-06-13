package com.stripe.android.p049ui.core.elements;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.SectionSingleFieldElement;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u001e\u0010\u0014\u001a\u00020\u00152\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017H\u0016J\t\u0010\u0019\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/CardNumberElement;", "Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;", "_identifier", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "controller", "Lcom/stripe/android/ui/core/elements/CardNumberController;", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/ui/core/elements/CardNumberController;)V", "get_identifier", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getController", "()Lcom/stripe/android/ui/core/elements/CardNumberController;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "setRawValue", "", "rawValuesMap", "", "", "toString", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.elements.CardNumberElement */
/* loaded from: classes7.dex */
public final class CardNumberElement extends SectionSingleFieldElement {
    private final IdentifierSpec _identifier;
    private final CardNumberController controller;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardNumberElement(IdentifierSpec _identifier, CardNumberController controller) {
        super(_identifier);
        Intrinsics.checkNotNullParameter(_identifier, "_identifier");
        Intrinsics.checkNotNullParameter(controller, "controller");
        this._identifier = _identifier;
        this.controller = controller;
    }

    public static /* synthetic */ CardNumberElement copy$default(CardNumberElement cardNumberElement, IdentifierSpec identifierSpec, CardNumberController cardNumberController, int i, Object obj) {
        if ((i & 1) != 0) {
            identifierSpec = cardNumberElement._identifier;
        }
        if ((i & 2) != 0) {
            cardNumberController = cardNumberElement.getController();
        }
        return cardNumberElement.copy(identifierSpec, cardNumberController);
    }

    public final IdentifierSpec component1() {
        return this._identifier;
    }

    public final CardNumberController component2() {
        return getController();
    }

    public final CardNumberElement copy(IdentifierSpec _identifier, CardNumberController controller) {
        Intrinsics.checkNotNullParameter(_identifier, "_identifier");
        Intrinsics.checkNotNullParameter(controller, "controller");
        return new CardNumberElement(_identifier, controller);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CardNumberElement) {
            CardNumberElement cardNumberElement = (CardNumberElement) obj;
            return Intrinsics.areEqual(this._identifier, cardNumberElement._identifier) && Intrinsics.areEqual(getController(), cardNumberElement.getController());
        }
        return false;
    }

    public final IdentifierSpec get_identifier() {
        return this._identifier;
    }

    public int hashCode() {
        return (this._identifier.hashCode() * 31) + getController().hashCode();
    }

    @Override // com.stripe.android.uicore.elements.SectionSingleFieldElement, com.stripe.android.uicore.elements.SectionFieldElement
    public void setRawValue(Map<IdentifierSpec, String> rawValuesMap) {
        Intrinsics.checkNotNullParameter(rawValuesMap, "rawValuesMap");
    }

    public String toString() {
        IdentifierSpec identifierSpec = this._identifier;
        CardNumberController controller = getController();
        return "CardNumberElement(_identifier=" + identifierSpec + ", controller=" + controller + ")";
    }

    @Override // com.stripe.android.uicore.elements.SectionSingleFieldElement
    public CardNumberController getController() {
        return this.controller;
    }
}
