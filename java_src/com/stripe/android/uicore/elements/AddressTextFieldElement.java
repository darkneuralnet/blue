package com.stripe.android.uicore.elements;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/AddressTextFieldElement;", "Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;", "identifier", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "config", "Lcom/stripe/android/uicore/elements/TextFieldConfig;", "onNavigation", "Lkotlin/Function0;", "", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/TextFieldConfig;Lkotlin/jvm/functions/Function0;)V", "controller", "Lcom/stripe/android/uicore/elements/AddressTextFieldController;", "getController", "()Lcom/stripe/android/uicore/elements/AddressTextFieldController;", "getIdentifier", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AddressTextFieldElement extends SectionSingleFieldElement {
    public static final int $stable = 8;
    private final AddressTextFieldController controller;
    private final IdentifierSpec identifier;

    public /* synthetic */ AddressTextFieldElement(IdentifierSpec identifierSpec, TextFieldConfig textFieldConfig, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(identifierSpec, textFieldConfig, (i & 4) != 0 ? null : function0);
    }

    @Override // com.stripe.android.uicore.elements.SectionSingleFieldElement, com.stripe.android.uicore.elements.SectionFieldElement
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressTextFieldElement(IdentifierSpec identifier, TextFieldConfig config, Function0<Unit> function0) {
        super(identifier);
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(config, "config");
        this.identifier = identifier;
        this.controller = new AddressTextFieldController(config, function0, null, 4, null);
    }

    @Override // com.stripe.android.uicore.elements.SectionSingleFieldElement
    public AddressTextFieldController getController() {
        return this.controller;
    }
}
