package com.stripe.android.p049ui.core.elements;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.SectionFieldErrorController;
import com.stripe.android.uicore.elements.SectionMultiFieldElement;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0012\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u001d\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001e\u0010\t\u001a\u00020\b2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0016J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\nH\u0016J \u0010\u000f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\r0\u000b0\nH\u0016R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006!"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/CardDetailsElement;", "Lcom/stripe/android/uicore/elements/SectionMultiFieldElement;", "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;", "sectionFieldErrorController", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "", "rawValuesMap", "", "setRawValue", "LEu1;", "", "getTextFieldIdentifiers", "Lkotlin/Pair;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "getFormFieldValueFlow", "Lcom/stripe/android/ui/core/elements/CardDetailsController;", "controller", "Lcom/stripe/android/ui/core/elements/CardDetailsController;", "getController", "()Lcom/stripe/android/ui/core/elements/CardDetailsController;", "", "isCardScanEnabled", "Z", "()Z", "identifier", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, NamedConstantsKt.INITIAL_VALUES, "", "viewOnlyFields", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroid/content/Context;Ljava/util/Map;Ljava/util/Set;Lcom/stripe/android/ui/core/elements/CardDetailsController;)V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.ui.core.elements.CardDetailsElement */
/* loaded from: classes7.dex */
public final class CardDetailsElement extends SectionMultiFieldElement {
    private final CardDetailsController controller;
    private final boolean isCardScanEnabled;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CardDetailsElement(IdentifierSpec identifierSpec, Context context, Map map, Set set, CardDetailsController cardDetailsController, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(identifierSpec, context, map, r4, (i & 16) != 0 ? new CardDetailsController(context, map, r4.contains(IdentifierSpec.Companion.getCardNumber())) : cardDetailsController);
        Set emptySet = (i & 8) != 0 ? SetsKt__SetsKt.emptySet() : set;
    }

    public final CardDetailsController getController() {
        return this.controller;
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public InterfaceC32730Eu1<List<Pair<IdentifierSpec, FormFieldEntry>>> getFormFieldValueFlow() {
        return C36708Vu1.m79259l(this.controller.getNumberElement().getController().getFormFieldValue(), this.controller.getCvcElement().getController().getFormFieldValue(), this.controller.getExpirationDateElement().getController().getFormFieldValue(), this.controller.getNumberElement().getController().getCardBrandFlow(), new CardDetailsElement$getFormFieldValueFlow$1(this, null));
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public InterfaceC32730Eu1<List<IdentifierSpec>> getTextFieldIdentifiers() {
        List listOf;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new IdentifierSpec[]{this.controller.getNumberElement().getIdentifier(), this.controller.getExpirationDateElement().getIdentifier(), this.controller.getCvcElement().getIdentifier()});
        return C50405vP5.m8742a(listOf);
    }

    public final boolean isCardScanEnabled() {
        return this.isCardScanEnabled;
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public SectionFieldErrorController sectionFieldErrorController() {
        return this.controller;
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public void setRawValue(Map<IdentifierSpec, String> rawValuesMap) {
        Intrinsics.checkNotNullParameter(rawValuesMap, "rawValuesMap");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDetailsElement(IdentifierSpec identifier, Context context, Map<IdentifierSpec, String> initialValues, Set<IdentifierSpec> viewOnlyFields, CardDetailsController controller) {
        super(identifier);
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initialValues, "initialValues");
        Intrinsics.checkNotNullParameter(viewOnlyFields, "viewOnlyFields");
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.controller = controller;
        this.isCardScanEnabled = controller.getNumberElement().getController().getCardScanEnabled();
    }
}
