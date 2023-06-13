package com.stripe.android.paymentsheet;

import android.content.res.Resources;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000f\u0010\u0011\u0012¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsItem;", "", "()V", "isEnabledDuringEditing", "", "()Z", "viewType", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;", "getViewType", "()Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;", "AddCard", "GooglePay", "Link", "SavedPaymentMethod", "ViewType", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem$AddCard;", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem$GooglePay;", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem$Link;", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class PaymentOptionsItem {

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsItem$AddCard;", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;", "()V", "isEnabledDuringEditing", "", "()Z", "viewType", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;", "getViewType", "()Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class AddCard extends PaymentOptionsItem {
        public static final int $stable = 0;
        private static final boolean isEnabledDuringEditing = false;
        public static final AddCard INSTANCE = new AddCard();
        private static final ViewType viewType = ViewType.AddCard;

        private AddCard() {
            super(null);
        }

        @Override // com.stripe.android.paymentsheet.PaymentOptionsItem
        public ViewType getViewType() {
            return viewType;
        }

        @Override // com.stripe.android.paymentsheet.PaymentOptionsItem
        public boolean isEnabledDuringEditing() {
            return isEnabledDuringEditing;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsItem$GooglePay;", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;", "()V", "isEnabledDuringEditing", "", "()Z", "viewType", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;", "getViewType", "()Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class GooglePay extends PaymentOptionsItem {
        public static final int $stable = 0;
        private static final boolean isEnabledDuringEditing = false;
        public static final GooglePay INSTANCE = new GooglePay();
        private static final ViewType viewType = ViewType.GooglePay;

        private GooglePay() {
            super(null);
        }

        @Override // com.stripe.android.paymentsheet.PaymentOptionsItem
        public ViewType getViewType() {
            return viewType;
        }

        @Override // com.stripe.android.paymentsheet.PaymentOptionsItem
        public boolean isEnabledDuringEditing() {
            return isEnabledDuringEditing;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsItem$Link;", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;", "()V", "isEnabledDuringEditing", "", "()Z", "viewType", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;", "getViewType", "()Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Link extends PaymentOptionsItem {
        public static final int $stable = 0;
        private static final boolean isEnabledDuringEditing = false;
        public static final Link INSTANCE = new Link();
        private static final ViewType viewType = ViewType.Link;

        private Link() {
            super(null);
        }

        @Override // com.stripe.android.paymentsheet.PaymentOptionsItem
        public ViewType getViewType() {
            return viewType;
        }

        @Override // com.stripe.android.paymentsheet.PaymentOptionsItem
        public boolean isEnabledDuringEditing() {
            return isEnabledDuringEditing;
        }
    }

    @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\u000e\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aJ\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;", "displayName", "", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod;)V", "getDisplayName", "()Ljava/lang/String;", "isEnabledDuringEditing", "", "()Z", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "viewType", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;", "getViewType", "()Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;", "component1", "component2", "copy", "equals", LegacyRepairType.OTHER_KEY, "", "getDescription", "resources", "Landroid/content/res/Resources;", "getRemoveDescription", "hashCode", "", "toString", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class SavedPaymentMethod extends PaymentOptionsItem {
        public static final int $stable = PaymentMethod.$stable;
        private final String displayName;
        private final boolean isEnabledDuringEditing;
        private final PaymentMethod paymentMethod;
        private final ViewType viewType;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedPaymentMethod(String displayName, PaymentMethod paymentMethod) {
            super(null);
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            this.displayName = displayName;
            this.paymentMethod = paymentMethod;
            this.viewType = ViewType.SavedPaymentMethod;
            this.isEnabledDuringEditing = true;
        }

        public static /* synthetic */ SavedPaymentMethod copy$default(SavedPaymentMethod savedPaymentMethod, String str, PaymentMethod paymentMethod, int i, Object obj) {
            if ((i & 1) != 0) {
                str = savedPaymentMethod.displayName;
            }
            if ((i & 2) != 0) {
                paymentMethod = savedPaymentMethod.paymentMethod;
            }
            return savedPaymentMethod.copy(str, paymentMethod);
        }

        public final String component1() {
            return this.displayName;
        }

        public final PaymentMethod component2() {
            return this.paymentMethod;
        }

        public final SavedPaymentMethod copy(String displayName, PaymentMethod paymentMethod) {
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            return new SavedPaymentMethod(displayName, paymentMethod);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SavedPaymentMethod) {
                SavedPaymentMethod savedPaymentMethod = (SavedPaymentMethod) obj;
                return Intrinsics.areEqual(this.displayName, savedPaymentMethod.displayName) && Intrinsics.areEqual(this.paymentMethod, savedPaymentMethod.paymentMethod);
            }
            return false;
        }

        public final String getDescription(Resources resources) {
            int i;
            CardBrand cardBrand;
            String string;
            Intrinsics.checkNotNullParameter(resources, "resources");
            PaymentMethod.Type type = this.paymentMethod.type;
            if (type == null) {
                i = -1;
            } else {
                i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            }
            String str = null;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        string = "";
                    } else {
                        int i2 = C19159R.string.bank_account_ending_in;
                        Object[] objArr = new Object[1];
                        PaymentMethod.USBankAccount uSBankAccount = this.paymentMethod.usBankAccount;
                        if (uSBankAccount != null) {
                            str = uSBankAccount.last4;
                        }
                        objArr[0] = str;
                        string = resources.getString(i2, objArr);
                    }
                } else {
                    int i3 = C19159R.string.bank_account_ending_in;
                    Object[] objArr2 = new Object[1];
                    PaymentMethod.SepaDebit sepaDebit = this.paymentMethod.sepaDebit;
                    if (sepaDebit != null) {
                        str = sepaDebit.last4;
                    }
                    objArr2[0] = str;
                    string = resources.getString(i3, objArr2);
                }
            } else {
                int i4 = C19159R.string.card_ending_in;
                Object[] objArr3 = new Object[2];
                PaymentMethod.Card card = this.paymentMethod.card;
                if (card != null) {
                    cardBrand = card.brand;
                } else {
                    cardBrand = null;
                }
                objArr3[0] = cardBrand;
                if (card != null) {
                    str = card.last4;
                }
                objArr3[1] = str;
                string = resources.getString(i4, objArr3);
            }
            Intrinsics.checkNotNullExpressionValue(string, "when (paymentMethod.type…     else -> \"\"\n        }");
            return string;
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public final String getRemoveDescription(Resources resources) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            String string = resources.getString(C19159R.string.stripe_paymentsheet_remove_pm, getDescription(resources));
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …tion(resources)\n        )");
            return string;
        }

        @Override // com.stripe.android.paymentsheet.PaymentOptionsItem
        public ViewType getViewType() {
            return this.viewType;
        }

        public int hashCode() {
            return (this.displayName.hashCode() * 31) + this.paymentMethod.hashCode();
        }

        @Override // com.stripe.android.paymentsheet.PaymentOptionsItem
        public boolean isEnabledDuringEditing() {
            return this.isEnabledDuringEditing;
        }

        public String toString() {
            String str = this.displayName;
            PaymentMethod paymentMethod = this.paymentMethod;
            return "SavedPaymentMethod(displayName=" + str + ", paymentMethod=" + paymentMethod + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;", "", "(Ljava/lang/String;I)V", "SavedPaymentMethod", "AddCard", "GooglePay", "Link", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum ViewType {
        SavedPaymentMethod,
        AddCard,
        GooglePay,
        Link
    }

    public /* synthetic */ PaymentOptionsItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract ViewType getViewType();

    public abstract boolean isEnabledDuringEditing();

    private PaymentOptionsItem() {
    }
}
