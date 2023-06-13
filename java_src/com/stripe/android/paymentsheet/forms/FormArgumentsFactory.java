package com.stripe.android.paymentsheet.forms;

import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.p049ui.core.Amount;
import com.stripe.android.p049ui.core.elements.LayoutFormDescriptor;
import com.stripe.android.p049ui.core.forms.resources.LpmRepository;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.addresselement.AddressDetails;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.SupportedPaymentMethodKtxKt;
import com.stripe.android.paymentsheet.paymentdatacollection.FormArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JH\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/forms/FormArgumentsFactory;", "", "()V", "create", "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;", "paymentMethod", "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "config", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "merchantName", "", "amount", "Lcom/stripe/android/ui/core/Amount;", "newLpm", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "isShowingLinkInlineSignup", "", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class FormArgumentsFactory {
    public static final FormArgumentsFactory INSTANCE = new FormArgumentsFactory();

    private FormArgumentsFactory() {
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FormArguments create(LpmRepository.SupportedPaymentMethod paymentMethod, StripeIntent stripeIntent, PaymentSheet.Configuration configuration, String merchantName, Amount amount, PaymentSelection.New r18, boolean z) {
        PaymentMethodCreateParams paymentMethodCreateParams;
        PaymentMethodCreateParams paymentMethodCreateParams2;
        String typeCode;
        PaymentMethodCreateParams paymentMethodCreateParams3;
        boolean z2;
        boolean showCheckboxControlledFields;
        PaymentSheet.BillingDetails billingDetails;
        AddressDetails addressDetails;
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        LayoutFormDescriptor pMAddForm = SupportedPaymentMethodKtxKt.getPMAddForm(paymentMethod, stripeIntent, configuration);
        if (r18 instanceof PaymentSelection.New.LinkInline) {
            paymentMethodCreateParams3 = ((PaymentSelection.New.LinkInline) r18).getLinkPaymentDetails().getOriginalParams();
        } else {
            if (r18 != null && (paymentMethodCreateParams2 = r18.getPaymentMethodCreateParams()) != null && (typeCode = paymentMethodCreateParams2.getTypeCode()) != null) {
                if (!Intrinsics.areEqual(typeCode, paymentMethod.getCode())) {
                    typeCode = null;
                }
                if (typeCode != null) {
                    if (r18 instanceof PaymentSelection.New.GenericPaymentMethod) {
                        paymentMethodCreateParams3 = ((PaymentSelection.New.GenericPaymentMethod) r18).getPaymentMethodCreateParams();
                    } else if (r18 instanceof PaymentSelection.New.Card) {
                        paymentMethodCreateParams3 = ((PaymentSelection.New.Card) r18).getPaymentMethodCreateParams();
                    } else {
                        paymentMethodCreateParams3 = null;
                    }
                }
            }
            paymentMethodCreateParams = null;
            z2 = false;
            if (r18 == null) {
                if (r18.getCustomerRequestedSave() == PaymentSelection.CustomerRequestedSave.RequestReuse) {
                    showCheckboxControlledFields = true;
                } else {
                    showCheckboxControlledFields = false;
                }
            } else {
                showCheckboxControlledFields = pMAddForm.getShowCheckboxControlledFields();
            }
            String code = paymentMethod.getCode();
            if (pMAddForm.getShowCheckbox() && !z) {
                z2 = true;
            }
            if (configuration == null) {
                billingDetails = configuration.getDefaultBillingDetails();
            } else {
                billingDetails = null;
            }
            if (configuration == null) {
                addressDetails = configuration.getShippingDetails();
            } else {
                addressDetails = null;
            }
            return new FormArguments(code, z2, showCheckboxControlledFields, merchantName, amount, billingDetails, addressDetails, paymentMethodCreateParams);
        }
        paymentMethodCreateParams = paymentMethodCreateParams3;
        z2 = false;
        if (r18 == null) {
        }
        String code2 = paymentMethod.getCode();
        if (pMAddForm.getShowCheckbox()) {
            z2 = true;
        }
        if (configuration == null) {
        }
        if (configuration == null) {
        }
        return new FormArguments(code2, z2, showCheckboxControlledFields, merchantName, amount, billingDetails, addressDetails, paymentMethodCreateParams);
    }
}
