package com.stripe.android.p049ui.core.elements;

import com.stripe.android.model.CardBrand;
import com.stripe.android.stripecardscan.cardscan.CardScanSheetResult;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.SectionFieldElement;
import com.stripe.android.uicore.elements.SectionFieldErrorController;
import com.stripe.android.uicore.elements.TextFieldController;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0017\u0010\rJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003R \u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0001\u0002\u0018\u0019¨\u0006\u001a"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/CardNumberController;", "Lcom/stripe/android/uicore/elements/TextFieldController;", "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;", "Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;", "cardScanSheetResult", "", "onCardScanResult", "LRu;", "autofillType", "LRu;", "getAutofillType", "()LRu;", "getAutofillType$annotations", "()V", "LEu1;", "Lcom/stripe/android/model/CardBrand;", "getCardBrandFlow", "()LEu1;", "cardBrandFlow", "", "getCardScanEnabled", "()Z", "cardScanEnabled", "<init>", "Lcom/stripe/android/ui/core/elements/CardNumberEditableController;", "Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.ui.core.elements.CardNumberController */
/* loaded from: classes7.dex */
public abstract class CardNumberController implements TextFieldController, SectionFieldErrorController {
    private final EnumC7283Ru autofillType;

    public /* synthetic */ CardNumberController(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void getAutofillType$annotations() {
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController, com.stripe.android.uicore.elements.SectionFieldComposable
    /* renamed from: ComposeUI-MxjM1cc */
    public void mo116658ComposeUIMxjM1cc(boolean z, SectionFieldElement sectionFieldElement, InterfaceC41563gV2 interfaceC41563gV2, Set<IdentifierSpec> set, IdentifierSpec identifierSpec, int i, int i2, InterfaceC32720Et0 interfaceC32720Et0, int i3) {
        TextFieldController.DefaultImpls.m116749ComposeUIMxjM1cc(this, z, sectionFieldElement, interfaceC41563gV2, set, identifierSpec, i, i2, interfaceC32720Et0, i3);
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public EnumC7283Ru getAutofillType() {
        return this.autofillType;
    }

    public abstract InterfaceC32730Eu1<CardBrand> getCardBrandFlow();

    public abstract boolean getCardScanEnabled();

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public boolean getEnabled() {
        return TextFieldController.DefaultImpls.getEnabled(this);
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public InterfaceC32730Eu1<String> getPlaceHolder() {
        return TextFieldController.DefaultImpls.getPlaceHolder(this);
    }

    public final void onCardScanResult(CardScanSheetResult cardScanSheetResult) {
        Intrinsics.checkNotNullParameter(cardScanSheetResult, "cardScanSheetResult");
        if (cardScanSheetResult instanceof CardScanSheetResult.Completed) {
            onRawValueChange(((CardScanSheetResult.Completed) cardScanSheetResult).getScannedCard().getPan());
        }
    }

    private CardNumberController() {
        this.autofillType = EnumC7283Ru.CreditCardNumber;
    }
}
