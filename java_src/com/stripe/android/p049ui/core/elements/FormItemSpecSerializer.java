package com.stripe.android.p049ui.core.elements;

import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/FormItemSpecSerializer;", "Lki2;", "Lcom/stripe/android/ui/core/elements/FormItemSpec;", "Lxi2;", "element", "LE01;", "selectDeserializer", "<init>", "()V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.ui.core.elements.FormItemSpecSerializer */
/* loaded from: classes7.dex */
public final class FormItemSpecSerializer extends AbstractC44060ki2<FormItemSpec> {
    public static final int $stable = 0;
    public static final FormItemSpecSerializer INSTANCE = new FormItemSpecSerializer();

    private FormItemSpecSerializer() {
        super(Reflection.getOrCreateKotlinClass(FormItemSpec.class));
    }

    @Override // p000.AbstractC44060ki2
    public E01<FormItemSpec> selectDeserializer(AbstractC51767xi2 element) {
        String str;
        AbstractC37303Yi2 m521l;
        Intrinsics.checkNotNullParameter(element, "element");
        AbstractC51767xi2 abstractC51767xi2 = (AbstractC51767xi2) C52953zi2.m522k(element).get("type");
        if (abstractC51767xi2 != null && (m521l = C52953zi2.m521l(abstractC51767xi2)) != null) {
            str = m521l.mo74434a();
        } else {
            str = null;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -1922029177:
                    if (str.equals("klarna_header")) {
                        return KlarnaHeaderStaticTextSpec.Companion.serializer();
                    }
                    break;
                case -1884659095:
                    if (str.equals("affirm_header")) {
                        return AffirmTextSpec.Companion.serializer();
                    }
                    break;
                case -1647430580:
                    if (str.equals("card_billing")) {
                        return CardBillingSpec.Companion.serializer();
                    }
                    break;
                case -910686504:
                    if (str.equals("au_becs_bsb_number")) {
                        return BsbSpec.Companion.serializer();
                    }
                    break;
                case -516244944:
                    if (str.equals("billing_address")) {
                        return AddressSpec.Companion.serializer();
                    }
                    break;
                case -185531168:
                    if (str.equals("afterpay_header")) {
                        return AfterpayClearpayTextSpec.Companion.serializer();
                    }
                    break;
                case -9348212:
                    if (str.equals("sepa_mandate")) {
                        return SepaMandateTextSpec.Companion.serializer();
                    }
                    break;
                case 116014:
                    if (str.equals("upi")) {
                        return UpiSpec.Companion.serializer();
                    }
                    break;
                case 3225350:
                    if (str.equals("iban")) {
                        return IbanSpec.Companion.serializer();
                    }
                    break;
                case 3373707:
                    if (str.equals("name")) {
                        return NameSpec.Companion.serializer();
                    }
                    break;
                case 3556653:
                    if (str.equals(Entry.TYPE_TEXT)) {
                        return SimpleTextSpec.Companion.serializer();
                    }
                    break;
                case 20120595:
                    if (str.equals("card_details")) {
                        return CardDetailsSectionSpec.Companion.serializer();
                    }
                    break;
                case 40435420:
                    if (str.equals("au_becs_account_number")) {
                        return AuBankAccountNumberSpec.Companion.serializer();
                    }
                    break;
                case 96619420:
                    if (str.equals("email")) {
                        return EmailSpec.Companion.serializer();
                    }
                    break;
                case 709160924:
                    if (str.equals("klarna_country")) {
                        return KlarnaCountrySpec.Companion.serializer();
                    }
                    break;
                case 835344392:
                    if (str.equals("mandate")) {
                        return MandateTextSpec.Companion.serializer();
                    }
                    break;
                case 885589086:
                    if (str.equals("static_text")) {
                        return StaticTextSpec.Companion.serializer();
                    }
                    break;
                case 957831062:
                    if (str.equals("country")) {
                        return CountrySpec.Companion.serializer();
                    }
                    break;
                case 1191572447:
                    if (str.equals("selector")) {
                        return DropdownSpec.Companion.serializer();
                    }
                    break;
                case 1255817703:
                    if (str.equals("au_becs_mandate")) {
                        return AuBecsDebitMandateTextSpec.Companion.serializer();
                    }
                    break;
            }
        }
        return EmptyFormSpec.INSTANCE.serializer();
    }
}
