package com.stripe.android.link.p042ui.wallet;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.link.C18975R;
import com.stripe.android.link.p042ui.menus.LinkMenuItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem;", "Lcom/stripe/android/link/ui/menus/LinkMenuItem;", "textResId", "", "isDestructive", "", "(IZ)V", "()Z", "getTextResId", "()I", "Cancel", "EditCard", "RemoveItem", "SetAsDefault", "Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$Cancel;", "Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$EditCard;", "Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$RemoveItem;", "Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$SetAsDefault;", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.wallet.WalletPaymentMethodMenuItem */
/* loaded from: classes7.dex */
public abstract class WalletPaymentMethodMenuItem implements LinkMenuItem {
    private final boolean isDestructive;
    private final int textResId;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$Cancel;", "Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem;", "()V", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.ui.wallet.WalletPaymentMethodMenuItem$Cancel */
    /* loaded from: classes7.dex */
    public static final class Cancel extends WalletPaymentMethodMenuItem {
        public static final int $stable = 0;
        public static final Cancel INSTANCE = new Cancel();

        private Cancel() {
            super(C18975R.string.cancel, false, 2, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$EditCard;", "Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem;", "()V", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.ui.wallet.WalletPaymentMethodMenuItem$EditCard */
    /* loaded from: classes7.dex */
    public static final class EditCard extends WalletPaymentMethodMenuItem {
        public static final int $stable = 0;
        public static final EditCard INSTANCE = new EditCard();

        private EditCard() {
            super(C18975R.string.wallet_update_card, false, 2, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$RemoveItem;", "Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem;", "textResId", "", "(I)V", "getTextResId", "()I", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.ui.wallet.WalletPaymentMethodMenuItem$RemoveItem */
    /* loaded from: classes7.dex */
    public static final class RemoveItem extends WalletPaymentMethodMenuItem {
        public static final int $stable = 0;
        private final int textResId;

        public RemoveItem(int i) {
            super(i, true, null);
            this.textResId = i;
        }

        public static /* synthetic */ RemoveItem copy$default(RemoveItem removeItem, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = removeItem.getTextResId();
            }
            return removeItem.copy(i);
        }

        public final int component1() {
            return getTextResId();
        }

        public final RemoveItem copy(int i) {
            return new RemoveItem(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoveItem) && getTextResId() == ((RemoveItem) obj).getTextResId();
        }

        @Override // com.stripe.android.link.p042ui.wallet.WalletPaymentMethodMenuItem, com.stripe.android.link.p042ui.menus.LinkMenuItem
        public int getTextResId() {
            return this.textResId;
        }

        public int hashCode() {
            return Integer.hashCode(getTextResId());
        }

        public String toString() {
            int textResId = getTextResId();
            return "RemoveItem(textResId=" + textResId + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$SetAsDefault;", "Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem;", "()V", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.ui.wallet.WalletPaymentMethodMenuItem$SetAsDefault */
    /* loaded from: classes7.dex */
    public static final class SetAsDefault extends WalletPaymentMethodMenuItem {
        public static final int $stable = 0;
        public static final SetAsDefault INSTANCE = new SetAsDefault();

        private SetAsDefault() {
            super(C18975R.string.wallet_set_as_default, false, 2, null);
        }
    }

    public /* synthetic */ WalletPaymentMethodMenuItem(int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z);
    }

    @Override // com.stripe.android.link.p042ui.menus.LinkMenuItem
    public int getTextResId() {
        return this.textResId;
    }

    @Override // com.stripe.android.link.p042ui.menus.LinkMenuItem
    public boolean isDestructive() {
        return this.isDestructive;
    }

    private WalletPaymentMethodMenuItem(int i, boolean z) {
        this.textResId = i;
        this.isDestructive = z;
    }

    public /* synthetic */ WalletPaymentMethodMenuItem(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? false : z, null);
    }
}
