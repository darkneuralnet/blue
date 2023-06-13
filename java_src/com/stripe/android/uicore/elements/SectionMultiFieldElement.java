package com.stripe.android.uicore.elements;

import com.stripe.android.uicore.elements.SectionFieldElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/SectionMultiFieldElement;", "Lcom/stripe/android/uicore/elements/SectionFieldElement;", "identifier", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;)V", "getIdentifier", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class SectionMultiFieldElement implements SectionFieldElement {
    public static final int $stable = 0;
    private final IdentifierSpec identifier;

    public SectionMultiFieldElement(IdentifierSpec identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.identifier = identifier;
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public boolean getShouldRenderOutsideCard() {
        return SectionFieldElement.DefaultImpls.getShouldRenderOutsideCard(this);
    }
}
