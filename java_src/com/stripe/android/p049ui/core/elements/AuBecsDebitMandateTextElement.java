package com.stripe.android.p049ui.core.elements;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.InputController;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b!\u0010\"J \u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00030\u0002H\u0016J\t\u0010\b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\t\u0010\u0011\u001a\u00020\tHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateTextElement;", "Lcom/stripe/android/uicore/elements/FormElement;", "LEu1;", "", "Lkotlin/Pair;", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "getFormFieldValueFlow", "component1", "", "component2", "Lcom/stripe/android/uicore/elements/InputController;", "component3", "identifier", "merchantName", "controller", "copy", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getIdentifier", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Ljava/lang/String;", "getMerchantName", "()Ljava/lang/String;", "Lcom/stripe/android/uicore/elements/InputController;", "getController", "()Lcom/stripe/android/uicore/elements/InputController;", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/lang/String;Lcom/stripe/android/uicore/elements/InputController;)V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.ui.core.elements.AuBecsDebitMandateTextElement */
/* loaded from: classes7.dex */
public final class AuBecsDebitMandateTextElement implements FormElement {
    public static final int $stable = 8;
    private final InputController controller;
    private final IdentifierSpec identifier;
    private final String merchantName;

    public AuBecsDebitMandateTextElement(IdentifierSpec identifier, String str, InputController inputController) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.identifier = identifier;
        this.merchantName = str;
        this.controller = inputController;
    }

    public static /* synthetic */ AuBecsDebitMandateTextElement copy$default(AuBecsDebitMandateTextElement auBecsDebitMandateTextElement, IdentifierSpec identifierSpec, String str, InputController inputController, int i, Object obj) {
        if ((i & 1) != 0) {
            identifierSpec = auBecsDebitMandateTextElement.getIdentifier();
        }
        if ((i & 2) != 0) {
            str = auBecsDebitMandateTextElement.merchantName;
        }
        if ((i & 4) != 0) {
            inputController = auBecsDebitMandateTextElement.getController();
        }
        return auBecsDebitMandateTextElement.copy(identifierSpec, str, inputController);
    }

    public final IdentifierSpec component1() {
        return getIdentifier();
    }

    public final String component2() {
        return this.merchantName;
    }

    public final InputController component3() {
        return getController();
    }

    public final AuBecsDebitMandateTextElement copy(IdentifierSpec identifier, String str, InputController inputController) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return new AuBecsDebitMandateTextElement(identifier, str, inputController);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AuBecsDebitMandateTextElement) {
            AuBecsDebitMandateTextElement auBecsDebitMandateTextElement = (AuBecsDebitMandateTextElement) obj;
            return Intrinsics.areEqual(getIdentifier(), auBecsDebitMandateTextElement.getIdentifier()) && Intrinsics.areEqual(this.merchantName, auBecsDebitMandateTextElement.merchantName) && Intrinsics.areEqual(getController(), auBecsDebitMandateTextElement.getController());
        }
        return false;
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

    public final String getMerchantName() {
        return this.merchantName;
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public InterfaceC32730Eu1<List<IdentifierSpec>> getTextFieldIdentifiers() {
        return FormElement.DefaultImpls.getTextFieldIdentifiers(this);
    }

    public int hashCode() {
        int hashCode = getIdentifier().hashCode() * 31;
        String str = this.merchantName;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + (getController() != null ? getController().hashCode() : 0);
    }

    public String toString() {
        IdentifierSpec identifier = getIdentifier();
        String str = this.merchantName;
        InputController controller = getController();
        return "AuBecsDebitMandateTextElement(identifier=" + identifier + ", merchantName=" + str + ", controller=" + controller + ")";
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public InputController getController() {
        return this.controller;
    }

    public /* synthetic */ AuBecsDebitMandateTextElement(IdentifierSpec identifierSpec, String str, InputController inputController, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(identifierSpec, str, (i & 4) != 0 ? null : inputController);
    }
}
