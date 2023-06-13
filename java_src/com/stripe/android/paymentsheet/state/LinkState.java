package com.stripe.android.paymentsheet.state;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.link.LinkPaymentLauncher;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/state/LinkState;", "Landroid/os/Parcelable;", "configuration", "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;", "loginState", "Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;", "(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;)V", "getConfiguration", "()Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;", "isReadyForUse", "", "()Z", "getLoginState", "()Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;", "component1", "component2", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "LoginState", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class LinkState implements Parcelable {
    public static final Parcelable.Creator<LinkState> CREATOR = new Creator();
    private final LinkPaymentLauncher.Configuration configuration;
    private final LoginState loginState;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<LinkState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkState createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LinkState((LinkPaymentLauncher.Configuration) parcel.readParcelable(LinkState.class.getClassLoader()), LoginState.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkState[] newArray(int i) {
            return new LinkState[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;", "", "(Ljava/lang/String;I)V", "LoggedIn", "NeedsVerification", "LoggedOut", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum LoginState {
        LoggedIn,
        NeedsVerification,
        LoggedOut
    }

    public LinkState(LinkPaymentLauncher.Configuration configuration, LoginState loginState) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(loginState, "loginState");
        this.configuration = configuration;
        this.loginState = loginState;
    }

    public static /* synthetic */ LinkState copy$default(LinkState linkState, LinkPaymentLauncher.Configuration configuration, LoginState loginState, int i, Object obj) {
        if ((i & 1) != 0) {
            configuration = linkState.configuration;
        }
        if ((i & 2) != 0) {
            loginState = linkState.loginState;
        }
        return linkState.copy(configuration, loginState);
    }

    public final LinkPaymentLauncher.Configuration component1() {
        return this.configuration;
    }

    public final LoginState component2() {
        return this.loginState;
    }

    public final LinkState copy(LinkPaymentLauncher.Configuration configuration, LoginState loginState) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(loginState, "loginState");
        return new LinkState(configuration, loginState);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LinkState) {
            LinkState linkState = (LinkState) obj;
            return Intrinsics.areEqual(this.configuration, linkState.configuration) && this.loginState == linkState.loginState;
        }
        return false;
    }

    public final LinkPaymentLauncher.Configuration getConfiguration() {
        return this.configuration;
    }

    public final LoginState getLoginState() {
        return this.loginState;
    }

    public int hashCode() {
        return (this.configuration.hashCode() * 31) + this.loginState.hashCode();
    }

    public final boolean isReadyForUse() {
        Set of;
        of = SetsKt__SetsKt.setOf((Object[]) new LoginState[]{LoginState.LoggedIn, LoginState.NeedsVerification});
        return of.contains(this.loginState);
    }

    public String toString() {
        LinkPaymentLauncher.Configuration configuration = this.configuration;
        LoginState loginState = this.loginState;
        return "LinkState(configuration=" + configuration + ", loginState=" + loginState + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeParcelable(this.configuration, i);
        out.writeString(this.loginState.name());
    }
}
