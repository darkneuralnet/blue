package com.stripe.android.link.p042ui.inline;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.link.p042ui.signup.SignUpState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000e\u0010\u0019\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b\u001aJ\u000e\u0010\u001b\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b\u001cJ\u000e\u0010\u001d\u001a\u00020\nHÀ\u0003¢\u0006\u0002\b\u001eJ=\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010 \u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\b\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\t\u001a\u00020\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, m28432d2 = {"Lcom/stripe/android/link/ui/inline/InlineSignupViewState;", "", "userInput", "Lcom/stripe/android/link/ui/inline/UserInput;", "merchantName", "", "isExpanded", "", "apiFailed", "signUpState", "Lcom/stripe/android/link/ui/signup/SignUpState;", "(Lcom/stripe/android/link/ui/inline/UserInput;Ljava/lang/String;ZZLcom/stripe/android/link/ui/signup/SignUpState;)V", "getApiFailed$link_release", "()Z", "isExpanded$link_release", "getMerchantName", "()Ljava/lang/String;", "getSignUpState$link_release", "()Lcom/stripe/android/link/ui/signup/SignUpState;", "useLink", "getUseLink", "getUserInput", "()Lcom/stripe/android/link/ui/inline/UserInput;", "component1", "component2", "component3", "component3$link_release", "component4", "component4$link_release", "component5", "component5$link_release", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.inline.InlineSignupViewState */
/* loaded from: classes7.dex */
public final class InlineSignupViewState {
    public static final int $stable = 0;
    private final boolean apiFailed;
    private final boolean isExpanded;
    private final String merchantName;
    private final SignUpState signUpState;
    private final boolean useLink;
    private final UserInput userInput;

    public InlineSignupViewState(UserInput userInput, String merchantName, boolean z, boolean z2, SignUpState signUpState) {
        boolean z3;
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(signUpState, "signUpState");
        this.userInput = userInput;
        this.merchantName = merchantName;
        this.isExpanded = z;
        this.apiFailed = z2;
        this.signUpState = signUpState;
        if (z && !z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.useLink = z3;
    }

    public static /* synthetic */ InlineSignupViewState copy$default(InlineSignupViewState inlineSignupViewState, UserInput userInput, String str, boolean z, boolean z2, SignUpState signUpState, int i, Object obj) {
        if ((i & 1) != 0) {
            userInput = inlineSignupViewState.userInput;
        }
        if ((i & 2) != 0) {
            str = inlineSignupViewState.merchantName;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            z = inlineSignupViewState.isExpanded;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = inlineSignupViewState.apiFailed;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            signUpState = inlineSignupViewState.signUpState;
        }
        return inlineSignupViewState.copy(userInput, str2, z3, z4, signUpState);
    }

    public final UserInput component1() {
        return this.userInput;
    }

    public final String component2() {
        return this.merchantName;
    }

    public final boolean component3$link_release() {
        return this.isExpanded;
    }

    public final boolean component4$link_release() {
        return this.apiFailed;
    }

    public final SignUpState component5$link_release() {
        return this.signUpState;
    }

    public final InlineSignupViewState copy(UserInput userInput, String merchantName, boolean z, boolean z2, SignUpState signUpState) {
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(signUpState, "signUpState");
        return new InlineSignupViewState(userInput, merchantName, z, z2, signUpState);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InlineSignupViewState) {
            InlineSignupViewState inlineSignupViewState = (InlineSignupViewState) obj;
            return Intrinsics.areEqual(this.userInput, inlineSignupViewState.userInput) && Intrinsics.areEqual(this.merchantName, inlineSignupViewState.merchantName) && this.isExpanded == inlineSignupViewState.isExpanded && this.apiFailed == inlineSignupViewState.apiFailed && this.signUpState == inlineSignupViewState.signUpState;
        }
        return false;
    }

    public final boolean getApiFailed$link_release() {
        return this.apiFailed;
    }

    public final String getMerchantName() {
        return this.merchantName;
    }

    public final SignUpState getSignUpState$link_release() {
        return this.signUpState;
    }

    public final boolean getUseLink() {
        return this.useLink;
    }

    public final UserInput getUserInput() {
        return this.userInput;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        UserInput userInput = this.userInput;
        int hashCode = (((userInput == null ? 0 : userInput.hashCode()) * 31) + this.merchantName.hashCode()) * 31;
        boolean z = this.isExpanded;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.apiFailed;
        return ((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.signUpState.hashCode();
    }

    public final boolean isExpanded$link_release() {
        return this.isExpanded;
    }

    public String toString() {
        UserInput userInput = this.userInput;
        String str = this.merchantName;
        boolean z = this.isExpanded;
        boolean z2 = this.apiFailed;
        SignUpState signUpState = this.signUpState;
        return "InlineSignupViewState(userInput=" + userInput + ", merchantName=" + str + ", isExpanded=" + z + ", apiFailed=" + z2 + ", signUpState=" + signUpState + ")";
    }
}
