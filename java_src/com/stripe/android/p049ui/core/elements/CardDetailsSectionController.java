package com.stripe.android.p049ui.core.elements;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.p049ui.core.DefaultIsStripeCardScanAvailable;
import com.stripe.android.uicore.elements.FieldError;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.SectionFieldErrorController;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;", "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;", "Lcom/stripe/android/ui/core/elements/CardDetailsElement;", "cardDetailsElement", "Lcom/stripe/android/ui/core/elements/CardDetailsElement;", "getCardDetailsElement$payments_ui_core_release", "()Lcom/stripe/android/ui/core/elements/CardDetailsElement;", "", "isCardScanEnabled", "Z", "isCardScanEnabled$payments_ui_core_release", "()Z", "Lcom/stripe/android/ui/core/DefaultIsStripeCardScanAvailable;", "isStripeCardScanAvailable", "Lcom/stripe/android/ui/core/DefaultIsStripeCardScanAvailable;", "isStripeCardScanAvailable$payments_ui_core_release", "()Lcom/stripe/android/ui/core/DefaultIsStripeCardScanAvailable;", "LEu1;", "Lcom/stripe/android/uicore/elements/FieldError;", "error", "LEu1;", "getError", "()LEu1;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "", NamedConstantsKt.INITIAL_VALUES, "", "viewOnlyFields", "<init>", "(Landroid/content/Context;Ljava/util/Map;Ljava/util/Set;)V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.ui.core.elements.CardDetailsSectionController */
/* loaded from: classes7.dex */
public final class CardDetailsSectionController implements SectionFieldErrorController {
    public static final int $stable = 8;
    private final CardDetailsElement cardDetailsElement;
    private final InterfaceC32730Eu1<FieldError> error;
    private final boolean isCardScanEnabled;
    private final DefaultIsStripeCardScanAvailable isStripeCardScanAvailable;

    public CardDetailsSectionController(Context context, Map<IdentifierSpec, String> initialValues, Set<IdentifierSpec> viewOnlyFields) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initialValues, "initialValues");
        Intrinsics.checkNotNullParameter(viewOnlyFields, "viewOnlyFields");
        CardDetailsElement cardDetailsElement = new CardDetailsElement(IdentifierSpec.Companion.Generic("card_detail"), context, initialValues, viewOnlyFields, null, 16, null);
        this.cardDetailsElement = cardDetailsElement;
        this.isCardScanEnabled = cardDetailsElement.isCardScanEnabled();
        this.isStripeCardScanAvailable = new DefaultIsStripeCardScanAvailable();
        this.error = cardDetailsElement.getController().getError();
    }

    public final CardDetailsElement getCardDetailsElement$payments_ui_core_release() {
        return this.cardDetailsElement;
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldErrorController
    public InterfaceC32730Eu1<FieldError> getError() {
        return this.error;
    }

    public final boolean isCardScanEnabled$payments_ui_core_release() {
        return this.isCardScanEnabled;
    }

    public final DefaultIsStripeCardScanAvailable isStripeCardScanAvailable$payments_ui_core_release() {
        return this.isStripeCardScanAvailable;
    }
}
