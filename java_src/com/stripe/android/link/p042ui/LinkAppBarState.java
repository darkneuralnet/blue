package com.stripe.android.link.p042ui;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.link.model.AccountStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\bHÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u001f"}, m28432d2 = {"Lcom/stripe/android/link/ui/LinkAppBarState;", "", "navigationIcon", "", "showHeader", "", "showOverflowMenu", "email", "", "accountStatus", "Lcom/stripe/android/link/model/AccountStatus;", "(IZZLjava/lang/String;Lcom/stripe/android/link/model/AccountStatus;)V", "getAccountStatus", "()Lcom/stripe/android/link/model/AccountStatus;", "getEmail", "()Ljava/lang/String;", "getNavigationIcon", "()I", "getShowHeader", "()Z", "getShowOverflowMenu", "component1", "component2", "component3", "component4", "component5", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.LinkAppBarState */
/* loaded from: classes7.dex */
public final class LinkAppBarState {
    private final AccountStatus accountStatus;
    private final String email;
    private final int navigationIcon;
    private final boolean showHeader;
    private final boolean showOverflowMenu;

    public LinkAppBarState(int i, boolean z, boolean z2, String str, AccountStatus accountStatus) {
        this.navigationIcon = i;
        this.showHeader = z;
        this.showOverflowMenu = z2;
        this.email = str;
        this.accountStatus = accountStatus;
    }

    public static /* synthetic */ LinkAppBarState copy$default(LinkAppBarState linkAppBarState, int i, boolean z, boolean z2, String str, AccountStatus accountStatus, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = linkAppBarState.navigationIcon;
        }
        if ((i2 & 2) != 0) {
            z = linkAppBarState.showHeader;
        }
        boolean z3 = z;
        if ((i2 & 4) != 0) {
            z2 = linkAppBarState.showOverflowMenu;
        }
        boolean z4 = z2;
        if ((i2 & 8) != 0) {
            str = linkAppBarState.email;
        }
        String str2 = str;
        if ((i2 & 16) != 0) {
            accountStatus = linkAppBarState.accountStatus;
        }
        return linkAppBarState.copy(i, z3, z4, str2, accountStatus);
    }

    public final int component1() {
        return this.navigationIcon;
    }

    public final boolean component2() {
        return this.showHeader;
    }

    public final boolean component3() {
        return this.showOverflowMenu;
    }

    public final String component4() {
        return this.email;
    }

    public final AccountStatus component5() {
        return this.accountStatus;
    }

    public final LinkAppBarState copy(int i, boolean z, boolean z2, String str, AccountStatus accountStatus) {
        return new LinkAppBarState(i, z, z2, str, accountStatus);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LinkAppBarState) {
            LinkAppBarState linkAppBarState = (LinkAppBarState) obj;
            return this.navigationIcon == linkAppBarState.navigationIcon && this.showHeader == linkAppBarState.showHeader && this.showOverflowMenu == linkAppBarState.showOverflowMenu && Intrinsics.areEqual(this.email, linkAppBarState.email) && this.accountStatus == linkAppBarState.accountStatus;
        }
        return false;
    }

    public final AccountStatus getAccountStatus() {
        return this.accountStatus;
    }

    public final String getEmail() {
        return this.email;
    }

    public final int getNavigationIcon() {
        return this.navigationIcon;
    }

    public final boolean getShowHeader() {
        return this.showHeader;
    }

    public final boolean getShowOverflowMenu() {
        return this.showOverflowMenu;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Integer.hashCode(this.navigationIcon) * 31;
        boolean z = this.showHeader;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.showOverflowMenu;
        int i3 = (i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        String str = this.email;
        int hashCode2 = (i3 + (str == null ? 0 : str.hashCode())) * 31;
        AccountStatus accountStatus = this.accountStatus;
        return hashCode2 + (accountStatus != null ? accountStatus.hashCode() : 0);
    }

    public String toString() {
        int i = this.navigationIcon;
        boolean z = this.showHeader;
        boolean z2 = this.showOverflowMenu;
        String str = this.email;
        AccountStatus accountStatus = this.accountStatus;
        return "LinkAppBarState(navigationIcon=" + i + ", showHeader=" + z + ", showOverflowMenu=" + z2 + ", email=" + str + ", accountStatus=" + accountStatus + ")";
    }
}
