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
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b&\u0010'J \u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00030\u0002H\u0016J\t\u0010\b\u001a\u00020\u0005HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\rHÆ\u0001J\t\u0010\u0014\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0015\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003R\u001a\u0010\u000f\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010#\u001a\u0004\b$\u0010%¨\u0006("}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/MandateTextElement;", "Lcom/stripe/android/uicore/elements/FormElement;", "LEu1;", "", "Lkotlin/Pair;", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "getFormFieldValueFlow", "component1", "", "component2", "", "component3", "Lcom/stripe/android/uicore/elements/InputController;", "component4", "identifier", "stringResId", "merchantName", "controller", "copy", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getIdentifier", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "I", "getStringResId", "()I", "Ljava/lang/String;", "getMerchantName", "()Ljava/lang/String;", "Lcom/stripe/android/uicore/elements/InputController;", "getController", "()Lcom/stripe/android/uicore/elements/InputController;", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;ILjava/lang/String;Lcom/stripe/android/uicore/elements/InputController;)V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.ui.core.elements.MandateTextElement */
/* loaded from: classes7.dex */
public final class MandateTextElement implements FormElement {
    public static final int $stable = 8;
    private final InputController controller;
    private final IdentifierSpec identifier;
    private final String merchantName;
    private final int stringResId;

    public MandateTextElement(IdentifierSpec identifier, int i, String str, InputController inputController) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.identifier = identifier;
        this.stringResId = i;
        this.merchantName = str;
        this.controller = inputController;
    }

    public static /* synthetic */ MandateTextElement copy$default(MandateTextElement mandateTextElement, IdentifierSpec identifierSpec, int i, String str, InputController inputController, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            identifierSpec = mandateTextElement.getIdentifier();
        }
        if ((i2 & 2) != 0) {
            i = mandateTextElement.stringResId;
        }
        if ((i2 & 4) != 0) {
            str = mandateTextElement.merchantName;
        }
        if ((i2 & 8) != 0) {
            inputController = mandateTextElement.getController();
        }
        return mandateTextElement.copy(identifierSpec, i, str, inputController);
    }

    public final IdentifierSpec component1() {
        return getIdentifier();
    }

    public final int component2() {
        return this.stringResId;
    }

    public final String component3() {
        return this.merchantName;
    }

    public final InputController component4() {
        return getController();
    }

    public final MandateTextElement copy(IdentifierSpec identifier, int i, String str, InputController inputController) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return new MandateTextElement(identifier, i, str, inputController);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MandateTextElement) {
            MandateTextElement mandateTextElement = (MandateTextElement) obj;
            return Intrinsics.areEqual(getIdentifier(), mandateTextElement.getIdentifier()) && this.stringResId == mandateTextElement.stringResId && Intrinsics.areEqual(this.merchantName, mandateTextElement.merchantName) && Intrinsics.areEqual(getController(), mandateTextElement.getController());
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

    public final int getStringResId() {
        return this.stringResId;
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public InterfaceC32730Eu1<List<IdentifierSpec>> getTextFieldIdentifiers() {
        return FormElement.DefaultImpls.getTextFieldIdentifiers(this);
    }

    public int hashCode() {
        int hashCode = ((getIdentifier().hashCode() * 31) + Integer.hashCode(this.stringResId)) * 31;
        String str = this.merchantName;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + (getController() != null ? getController().hashCode() : 0);
    }

    public String toString() {
        IdentifierSpec identifier = getIdentifier();
        int i = this.stringResId;
        String str = this.merchantName;
        InputController controller = getController();
        return "MandateTextElement(identifier=" + identifier + ", stringResId=" + i + ", merchantName=" + str + ", controller=" + controller + ")";
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public InputController getController() {
        return this.controller;
    }

    public /* synthetic */ MandateTextElement(IdentifierSpec identifierSpec, int i, String str, InputController inputController, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(identifierSpec, i, str, (i2 & 8) != 0 ? null : inputController);
    }
}
