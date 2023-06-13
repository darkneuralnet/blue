package com.stripe.android.p049ui.core.elements;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.uicore.elements.EmailConfig;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.SectionSingleFieldElement;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import com.stripe.android.uicore.elements.TextFieldController;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/EmailElement;", "Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;", "identifier", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "initialValue", "", "controller", "Lcom/stripe/android/uicore/elements/TextFieldController;", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/lang/String;Lcom/stripe/android/uicore/elements/TextFieldController;)V", "getController", "()Lcom/stripe/android/uicore/elements/TextFieldController;", "getIdentifier", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getInitialValue", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.elements.EmailElement */
/* loaded from: classes7.dex */
public final class EmailElement extends SectionSingleFieldElement {
    public static final int $stable = 8;
    private final TextFieldController controller;
    private final IdentifierSpec identifier;
    private final String initialValue;

    public EmailElement() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ EmailElement copy$default(EmailElement emailElement, IdentifierSpec identifierSpec, String str, TextFieldController textFieldController, int i, Object obj) {
        if ((i & 1) != 0) {
            identifierSpec = emailElement.getIdentifier();
        }
        if ((i & 2) != 0) {
            str = emailElement.initialValue;
        }
        if ((i & 4) != 0) {
            textFieldController = emailElement.getController();
        }
        return emailElement.copy(identifierSpec, str, textFieldController);
    }

    public final IdentifierSpec component1() {
        return getIdentifier();
    }

    public final String component2() {
        return this.initialValue;
    }

    public final TextFieldController component3() {
        return getController();
    }

    public final EmailElement copy(IdentifierSpec identifier, String str, TextFieldController controller) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(controller, "controller");
        return new EmailElement(identifier, str, controller);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmailElement) {
            EmailElement emailElement = (EmailElement) obj;
            return Intrinsics.areEqual(getIdentifier(), emailElement.getIdentifier()) && Intrinsics.areEqual(this.initialValue, emailElement.initialValue) && Intrinsics.areEqual(getController(), emailElement.getController());
        }
        return false;
    }

    @Override // com.stripe.android.uicore.elements.SectionSingleFieldElement, com.stripe.android.uicore.elements.SectionFieldElement
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    public final String getInitialValue() {
        return this.initialValue;
    }

    public int hashCode() {
        int hashCode = getIdentifier().hashCode() * 31;
        String str = this.initialValue;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + getController().hashCode();
    }

    public String toString() {
        IdentifierSpec identifier = getIdentifier();
        String str = this.initialValue;
        TextFieldController controller = getController();
        return "EmailElement(identifier=" + identifier + ", initialValue=" + str + ", controller=" + controller + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ EmailElement(IdentifierSpec identifierSpec, String str, TextFieldController textFieldController, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(identifierSpec, str, (i & 4) != 0 ? new SimpleTextFieldController(new EmailConfig(), false, str, 2, null) : textFieldController);
        identifierSpec = (i & 1) != 0 ? IdentifierSpec.Companion.getEmail() : identifierSpec;
        str = (i & 2) != 0 ? "" : str;
    }

    @Override // com.stripe.android.uicore.elements.SectionSingleFieldElement
    public TextFieldController getController() {
        return this.controller;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailElement(IdentifierSpec identifier, String str, TextFieldController controller) {
        super(identifier);
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.identifier = identifier;
        this.initialValue = str;
        this.controller = controller;
    }
}
