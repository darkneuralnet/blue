package com.stripe.android.paymentsheet.p047ui;

import android.content.res.Resources;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.C19159R;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.TransformToBankIcon;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0001\u001a\u0016\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006*\u00020\tH\u0000¢\u0006\u0002\u0010\u000b\u001a\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006*\u00020\tH\u0001¢\u0006\u0002\u0010\u000b¨\u0006\r"}, m28432d2 = {"createCardLabel", "", "resources", "Landroid/content/res/Resources;", "last4", "getCardBrandIcon", "", "Lcom/stripe/android/model/CardBrand;", "getLabel", "Lcom/stripe/android/model/PaymentMethod;", "getLabelIcon", "(Lcom/stripe/android/model/PaymentMethod;)Ljava/lang/Integer;", "getSavedPaymentMethodIcon", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPaymentMethodsUiExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodsUiExtension.kt\ncom/stripe/android/paymentsheet/ui/PaymentMethodsUiExtensionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentMethodsUiExtensionKt */
/* loaded from: classes7.dex */
public final class PaymentMethodsUiExtensionKt {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.ui.PaymentMethodsUiExtensionKt$WhenMappings */
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PaymentMethod.Type.values().length];
            try {
                iArr[PaymentMethod.Type.Card.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentMethod.Type.SepaDebit.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentMethod.Type.USBankAccount.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CardBrand.values().length];
            try {
                iArr2[CardBrand.Visa.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CardBrand.AmericanExpress.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CardBrand.Discover.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CardBrand.JCB.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CardBrand.DinersClub.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CardBrand.MasterCard.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CardBrand.UnionPay.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CardBrand.CartesBancaires.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[CardBrand.Unknown.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final String createCardLabel(Resources resources, String str) {
        String str2;
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (str != null) {
            str2 = resources.getString(C19159R.string.paymentsheet_payment_method_item_card_number, str);
        } else {
            str2 = null;
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public static final int getCardBrandIcon(CardBrand cardBrand) {
        Intrinsics.checkNotNullParameter(cardBrand, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$1[cardBrand.ordinal()]) {
            case 1:
                return C19159R.C19160drawable.stripe_ic_paymentsheet_card_visa;
            case 2:
                return C19159R.C19160drawable.stripe_ic_paymentsheet_card_amex;
            case 3:
                return C19159R.C19160drawable.stripe_ic_paymentsheet_card_discover;
            case 4:
                return C19159R.C19160drawable.stripe_ic_paymentsheet_card_jcb;
            case 5:
                return C19159R.C19160drawable.stripe_ic_paymentsheet_card_dinersclub;
            case 6:
                return C19159R.C19160drawable.stripe_ic_paymentsheet_card_mastercard;
            case 7:
                return C19159R.C19160drawable.stripe_ic_paymentsheet_card_unionpay;
            case 8:
                return C19159R.C19160drawable.stripe_ic_cartebancaire;
            case 9:
                return C19159R.C19160drawable.stripe_ic_paymentsheet_card_unknown;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String getLabel(PaymentMethod paymentMethod, Resources resources) {
        int i;
        Intrinsics.checkNotNullParameter(paymentMethod, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        PaymentMethod.Type type = paymentMethod.type;
        if (type == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        }
        String str = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                int i2 = C19159R.string.paymentsheet_payment_method_item_card_number;
                Object[] objArr = new Object[1];
                PaymentMethod.USBankAccount uSBankAccount = paymentMethod.usBankAccount;
                if (uSBankAccount != null) {
                    str = uSBankAccount.last4;
                }
                objArr[0] = str;
                return resources.getString(i2, objArr);
            }
            int i3 = C19159R.string.paymentsheet_payment_method_item_card_number;
            Object[] objArr2 = new Object[1];
            PaymentMethod.SepaDebit sepaDebit = paymentMethod.sepaDebit;
            if (sepaDebit != null) {
                str = sepaDebit.last4;
            }
            objArr2[0] = str;
            return resources.getString(i3, objArr2);
        }
        PaymentMethod.Card card = paymentMethod.card;
        if (card != null) {
            str = card.last4;
        }
        return createCardLabel(resources, str);
    }

    public static final Integer getLabelIcon(PaymentMethod paymentMethod) {
        int i;
        Intrinsics.checkNotNullParameter(paymentMethod, "<this>");
        PaymentMethod.Type type = paymentMethod.type;
        if (type == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        }
        if (i == 3) {
            return Integer.valueOf(C19159R.C19160drawable.stripe_ic_bank);
        }
        return null;
    }

    public static final Integer getSavedPaymentMethodIcon(PaymentMethod paymentMethod) {
        int i;
        int i2;
        CardBrand cardBrand;
        PaymentMethod.USBankAccount uSBankAccount;
        String str;
        Intrinsics.checkNotNullParameter(paymentMethod, "<this>");
        PaymentMethod.Type type = paymentMethod.type;
        if (type == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3 || (uSBankAccount = paymentMethod.usBankAccount) == null || (str = uSBankAccount.bankName) == null) {
                    return null;
                }
                return Integer.valueOf(TransformToBankIcon.Companion.invoke(str));
            }
            return Integer.valueOf(C19159R.C19160drawable.stripe_ic_paymentsheet_pm_sepa_debit);
        }
        PaymentMethod.Card card = paymentMethod.card;
        if (card != null && (cardBrand = card.brand) != null) {
            i2 = getCardBrandIcon(cardBrand);
        } else {
            i2 = C19159R.C19160drawable.stripe_ic_paymentsheet_card_unknown;
        }
        return Integer.valueOf(i2);
    }
}
