package com.stripe.android.paymentsheet.p047ui;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001e"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;", "", "icon", "", "contentDescription", "showTestModeLabel", "", "showEditMenu", "editMenuLabel", "isEnabled", "(IIZZIZ)V", "getContentDescription", "()I", "getEditMenuLabel", "getIcon", "()Z", "getShowEditMenu", "getShowTestModeLabel", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentSheetTopBarState */
/* loaded from: classes7.dex */
public final class PaymentSheetTopBarState {
    private final int contentDescription;
    private final int editMenuLabel;
    private final int icon;
    private final boolean isEnabled;
    private final boolean showEditMenu;
    private final boolean showTestModeLabel;

    public PaymentSheetTopBarState(int i, int i2, boolean z, boolean z2, int i3, boolean z3) {
        this.icon = i;
        this.contentDescription = i2;
        this.showTestModeLabel = z;
        this.showEditMenu = z2;
        this.editMenuLabel = i3;
        this.isEnabled = z3;
    }

    public static /* synthetic */ PaymentSheetTopBarState copy$default(PaymentSheetTopBarState paymentSheetTopBarState, int i, int i2, boolean z, boolean z2, int i3, boolean z3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = paymentSheetTopBarState.icon;
        }
        if ((i4 & 2) != 0) {
            i2 = paymentSheetTopBarState.contentDescription;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            z = paymentSheetTopBarState.showTestModeLabel;
        }
        boolean z4 = z;
        if ((i4 & 8) != 0) {
            z2 = paymentSheetTopBarState.showEditMenu;
        }
        boolean z5 = z2;
        if ((i4 & 16) != 0) {
            i3 = paymentSheetTopBarState.editMenuLabel;
        }
        int i6 = i3;
        if ((i4 & 32) != 0) {
            z3 = paymentSheetTopBarState.isEnabled;
        }
        return paymentSheetTopBarState.copy(i, i5, z4, z5, i6, z3);
    }

    public final int component1() {
        return this.icon;
    }

    public final int component2() {
        return this.contentDescription;
    }

    public final boolean component3() {
        return this.showTestModeLabel;
    }

    public final boolean component4() {
        return this.showEditMenu;
    }

    public final int component5() {
        return this.editMenuLabel;
    }

    public final boolean component6() {
        return this.isEnabled;
    }

    public final PaymentSheetTopBarState copy(int i, int i2, boolean z, boolean z2, int i3, boolean z3) {
        return new PaymentSheetTopBarState(i, i2, z, z2, i3, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentSheetTopBarState) {
            PaymentSheetTopBarState paymentSheetTopBarState = (PaymentSheetTopBarState) obj;
            return this.icon == paymentSheetTopBarState.icon && this.contentDescription == paymentSheetTopBarState.contentDescription && this.showTestModeLabel == paymentSheetTopBarState.showTestModeLabel && this.showEditMenu == paymentSheetTopBarState.showEditMenu && this.editMenuLabel == paymentSheetTopBarState.editMenuLabel && this.isEnabled == paymentSheetTopBarState.isEnabled;
        }
        return false;
    }

    public final int getContentDescription() {
        return this.contentDescription;
    }

    public final int getEditMenuLabel() {
        return this.editMenuLabel;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final boolean getShowEditMenu() {
        return this.showEditMenu;
    }

    public final boolean getShowTestModeLabel() {
        return this.showTestModeLabel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.icon) * 31) + Integer.hashCode(this.contentDescription)) * 31;
        boolean z = this.showTestModeLabel;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.showEditMenu;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int hashCode2 = (((i2 + i3) * 31) + Integer.hashCode(this.editMenuLabel)) * 31;
        boolean z3 = this.isEnabled;
        return hashCode2 + (z3 ? 1 : z3 ? 1 : 0);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        int i = this.icon;
        int i2 = this.contentDescription;
        boolean z = this.showTestModeLabel;
        boolean z2 = this.showEditMenu;
        int i3 = this.editMenuLabel;
        boolean z3 = this.isEnabled;
        return "PaymentSheetTopBarState(icon=" + i + ", contentDescription=" + i2 + ", showTestModeLabel=" + z + ", showEditMenu=" + z2 + ", editMenuLabel=" + i3 + ", isEnabled=" + z3 + ")";
    }
}
