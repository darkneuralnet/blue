package com.stripe.android.p049ui.core.elements;

import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.SectionElement;
import com.stripe.android.uicore.elements.SectionFieldElement;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@InterfaceC36928Ws5(with = FormItemSpecSerializer.class)
@Metadata(m28433d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J#\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\b\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00112\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u000e\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00048&X§\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0017\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*¨\u0006+"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/FormItemSpec;", "", "()V", "apiPath", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getApiPath$annotations", "getApiPath", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "createSectionElement", "Lcom/stripe/android/uicore/elements/SectionElement;", "sectionFieldElement", "Lcom/stripe/android/uicore/elements/SectionFieldElement;", "label", "", "createSectionElement$payments_ui_core_release", "(Lcom/stripe/android/uicore/elements/SectionFieldElement;Ljava/lang/Integer;)Lcom/stripe/android/uicore/elements/SectionElement;", "sectionFieldElements", "", "(Ljava/util/List;Ljava/lang/Integer;)Lcom/stripe/android/uicore/elements/SectionElement;", "Companion", "Lcom/stripe/android/ui/core/elements/AddressSpec;", "Lcom/stripe/android/ui/core/elements/AffirmTextSpec;", "Lcom/stripe/android/ui/core/elements/AfterpayClearpayTextSpec;", "Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec;", "Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateTextSpec;", "Lcom/stripe/android/ui/core/elements/BsbSpec;", "Lcom/stripe/android/ui/core/elements/CardBillingSpec;", "Lcom/stripe/android/ui/core/elements/CardDetailsSectionSpec;", "Lcom/stripe/android/ui/core/elements/CountrySpec;", "Lcom/stripe/android/ui/core/elements/DropdownSpec;", "Lcom/stripe/android/ui/core/elements/EmailSpec;", "Lcom/stripe/android/ui/core/elements/EmptyFormSpec;", "Lcom/stripe/android/ui/core/elements/IbanSpec;", "Lcom/stripe/android/ui/core/elements/KlarnaCountrySpec;", "Lcom/stripe/android/ui/core/elements/KlarnaHeaderStaticTextSpec;", "Lcom/stripe/android/ui/core/elements/MandateTextSpec;", "Lcom/stripe/android/ui/core/elements/NameSpec;", "Lcom/stripe/android/ui/core/elements/OTPSpec;", "Lcom/stripe/android/ui/core/elements/SaveForFutureUseSpec;", "Lcom/stripe/android/ui/core/elements/SepaMandateTextSpec;", "Lcom/stripe/android/ui/core/elements/SimpleTextSpec;", "Lcom/stripe/android/ui/core/elements/StaticTextSpec;", "Lcom/stripe/android/ui/core/elements/UpiSpec;", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.elements.FormItemSpec */
/* loaded from: classes7.dex */
public abstract class FormItemSpec {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/FormItemSpec$Companion;", "", "LKj2;", "Lcom/stripe/android/ui/core/elements/FormItemSpec;", "serializer", "<init>", "()V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.ui.core.elements.FormItemSpec$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<FormItemSpec> serializer() {
            return FormItemSpecSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ FormItemSpec(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ SectionElement createSectionElement$payments_ui_core_release$default(FormItemSpec formItemSpec, SectionFieldElement sectionFieldElement, Integer num, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                num = null;
            }
            return formItemSpec.createSectionElement$payments_ui_core_release(sectionFieldElement, num);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSectionElement");
    }

    @InterfaceC36694Vs5("api_path")
    public static /* synthetic */ void getApiPath$annotations() {
    }

    public final SectionElement createSectionElement$payments_ui_core_release(SectionFieldElement sectionFieldElement, Integer num) {
        Intrinsics.checkNotNullParameter(sectionFieldElement, "sectionFieldElement");
        return SectionElement.Companion.wrap(sectionFieldElement, num);
    }

    public abstract IdentifierSpec getApiPath();

    private FormItemSpec() {
    }

    public static /* synthetic */ SectionElement createSectionElement$payments_ui_core_release$default(FormItemSpec formItemSpec, List list, Integer num, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                num = null;
            }
            return formItemSpec.createSectionElement$payments_ui_core_release(list, num);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSectionElement");
    }

    public final SectionElement createSectionElement$payments_ui_core_release(List<? extends SectionFieldElement> sectionFieldElements, Integer num) {
        Intrinsics.checkNotNullParameter(sectionFieldElements, "sectionFieldElements");
        return SectionElement.Companion.wrap(sectionFieldElements, num);
    }
}
