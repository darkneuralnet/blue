package com.stripe.android.paymentsheet.state;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.paymentsheet.C19159R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/state/WalletsContainerState;", "", "showLink", "", "showGooglePay", "dividerTextResource", "", "(ZZI)V", "getDividerTextResource", "()I", "shouldShow", "getShouldShow", "()Z", "getShowGooglePay", "getShowLink", "component1", "component2", "component3", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class WalletsContainerState {
    private final int dividerTextResource;
    private final boolean showGooglePay;
    private final boolean showLink;

    public WalletsContainerState() {
        this(false, false, 0, 7, null);
    }

    public static /* synthetic */ WalletsContainerState copy$default(WalletsContainerState walletsContainerState, boolean z, boolean z2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = walletsContainerState.showLink;
        }
        if ((i2 & 2) != 0) {
            z2 = walletsContainerState.showGooglePay;
        }
        if ((i2 & 4) != 0) {
            i = walletsContainerState.dividerTextResource;
        }
        return walletsContainerState.copy(z, z2, i);
    }

    public final boolean component1() {
        return this.showLink;
    }

    public final boolean component2() {
        return this.showGooglePay;
    }

    public final int component3() {
        return this.dividerTextResource;
    }

    public final WalletsContainerState copy(boolean z, boolean z2, int i) {
        return new WalletsContainerState(z, z2, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WalletsContainerState) {
            WalletsContainerState walletsContainerState = (WalletsContainerState) obj;
            return this.showLink == walletsContainerState.showLink && this.showGooglePay == walletsContainerState.showGooglePay && this.dividerTextResource == walletsContainerState.dividerTextResource;
        }
        return false;
    }

    public final int getDividerTextResource() {
        return this.dividerTextResource;
    }

    public final boolean getShouldShow() {
        return this.showLink || this.showGooglePay;
    }

    public final boolean getShowGooglePay() {
        return this.showGooglePay;
    }

    public final boolean getShowLink() {
        return this.showLink;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.showLink;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.showGooglePay;
        return ((i + (z2 ? 1 : z2 ? 1 : 0)) * 31) + Integer.hashCode(this.dividerTextResource);
    }

    public String toString() {
        boolean z = this.showLink;
        boolean z2 = this.showGooglePay;
        int i = this.dividerTextResource;
        return "WalletsContainerState(showLink=" + z + ", showGooglePay=" + z2 + ", dividerTextResource=" + i + ")";
    }

    public WalletsContainerState(boolean z, boolean z2, int i) {
        this.showLink = z;
        this.showGooglePay = z2;
        this.dividerTextResource = i;
    }

    public /* synthetic */ WalletsContainerState(boolean z, boolean z2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? C19159R.string.stripe_paymentsheet_or_pay_using : i);
    }
}
