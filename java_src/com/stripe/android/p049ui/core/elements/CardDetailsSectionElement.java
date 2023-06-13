package com.stripe.android.p049ui.core.elements;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00030\u0002H\u0016J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\u0016R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/CardDetailsSectionElement;", "Lcom/stripe/android/uicore/elements/FormElement;", "LEu1;", "", "Lkotlin/Pair;", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "getFormFieldValueFlow", "getTextFieldIdentifiers", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "identifier", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getIdentifier", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;", "controller", "Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;", "getController", "()Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;", "", "", NamedConstantsKt.INITIAL_VALUES, "", "viewOnlyFields", "<init>", "(Landroid/content/Context;Ljava/util/Map;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;)V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.ui.core.elements.CardDetailsSectionElement */
/* loaded from: classes7.dex */
public final class CardDetailsSectionElement implements FormElement {
    public static final int $stable = 8;
    private final Context context;
    private final CardDetailsSectionController controller;
    private final IdentifierSpec identifier;

    public CardDetailsSectionElement(Context context, Map<IdentifierSpec, String> initialValues, Set<IdentifierSpec> viewOnlyFields, IdentifierSpec identifier, CardDetailsSectionController controller) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initialValues, "initialValues");
        Intrinsics.checkNotNullParameter(viewOnlyFields, "viewOnlyFields");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.context = context;
        this.identifier = identifier;
        this.controller = controller;
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public InterfaceC32730Eu1<List<Pair<IdentifierSpec, FormFieldEntry>>> getFormFieldValueFlow() {
        return getController().getCardDetailsElement$payments_ui_core_release().getFormFieldValueFlow();
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public InterfaceC32730Eu1<List<IdentifierSpec>> getTextFieldIdentifiers() {
        return getController().getCardDetailsElement$payments_ui_core_release().getTextFieldIdentifiers();
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public CardDetailsSectionController getController() {
        return this.controller;
    }

    public /* synthetic */ CardDetailsSectionElement(Context context, Map map, Set set, IdentifierSpec identifierSpec, CardDetailsSectionController cardDetailsSectionController, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, map, set, identifierSpec, (i & 16) != 0 ? new CardDetailsSectionController(context, map, set) : cardDetailsSectionController);
    }
}
