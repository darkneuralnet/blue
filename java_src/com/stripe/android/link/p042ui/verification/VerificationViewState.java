package com.stripe.android.link.p042ui.verification;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.link.p042ui.ErrorMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J=\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001b"}, m28432d2 = {"Lcom/stripe/android/link/ui/verification/VerificationViewState;", "", "isProcessing", "", "requestFocus", "errorMessage", "Lcom/stripe/android/link/ui/ErrorMessage;", "isSendingNewCode", "didSendNewCode", "(ZZLcom/stripe/android/link/ui/ErrorMessage;ZZ)V", "getDidSendNewCode", "()Z", "getErrorMessage", "()Lcom/stripe/android/link/ui/ErrorMessage;", "getRequestFocus", "component1", "component2", "component3", "component4", "component5", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.verification.VerificationViewState */
/* loaded from: classes7.dex */
public final class VerificationViewState {
    private final boolean didSendNewCode;
    private final ErrorMessage errorMessage;
    private final boolean isProcessing;
    private final boolean isSendingNewCode;
    private final boolean requestFocus;

    public VerificationViewState() {
        this(false, false, null, false, false, 31, null);
    }

    public static /* synthetic */ VerificationViewState copy$default(VerificationViewState verificationViewState, boolean z, boolean z2, ErrorMessage errorMessage, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = verificationViewState.isProcessing;
        }
        if ((i & 2) != 0) {
            z2 = verificationViewState.requestFocus;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            errorMessage = verificationViewState.errorMessage;
        }
        ErrorMessage errorMessage2 = errorMessage;
        if ((i & 8) != 0) {
            z3 = verificationViewState.isSendingNewCode;
        }
        boolean z6 = z3;
        if ((i & 16) != 0) {
            z4 = verificationViewState.didSendNewCode;
        }
        return verificationViewState.copy(z, z5, errorMessage2, z6, z4);
    }

    public final boolean component1() {
        return this.isProcessing;
    }

    public final boolean component2() {
        return this.requestFocus;
    }

    public final ErrorMessage component3() {
        return this.errorMessage;
    }

    public final boolean component4() {
        return this.isSendingNewCode;
    }

    public final boolean component5() {
        return this.didSendNewCode;
    }

    public final VerificationViewState copy(boolean z, boolean z2, ErrorMessage errorMessage, boolean z3, boolean z4) {
        return new VerificationViewState(z, z2, errorMessage, z3, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VerificationViewState) {
            VerificationViewState verificationViewState = (VerificationViewState) obj;
            return this.isProcessing == verificationViewState.isProcessing && this.requestFocus == verificationViewState.requestFocus && Intrinsics.areEqual(this.errorMessage, verificationViewState.errorMessage) && this.isSendingNewCode == verificationViewState.isSendingNewCode && this.didSendNewCode == verificationViewState.didSendNewCode;
        }
        return false;
    }

    public final boolean getDidSendNewCode() {
        return this.didSendNewCode;
    }

    public final ErrorMessage getErrorMessage() {
        return this.errorMessage;
    }

    public final boolean getRequestFocus() {
        return this.requestFocus;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean] */
    public int hashCode() {
        boolean z = this.isProcessing;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.requestFocus;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ErrorMessage errorMessage = this.errorMessage;
        int hashCode = (i3 + (errorMessage == null ? 0 : errorMessage.hashCode())) * 31;
        ?? r22 = this.isSendingNewCode;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (hashCode + i4) * 31;
        boolean z2 = this.didSendNewCode;
        return i5 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean isProcessing() {
        return this.isProcessing;
    }

    public final boolean isSendingNewCode() {
        return this.isSendingNewCode;
    }

    public String toString() {
        boolean z = this.isProcessing;
        boolean z2 = this.requestFocus;
        ErrorMessage errorMessage = this.errorMessage;
        boolean z3 = this.isSendingNewCode;
        boolean z4 = this.didSendNewCode;
        return "VerificationViewState(isProcessing=" + z + ", requestFocus=" + z2 + ", errorMessage=" + errorMessage + ", isSendingNewCode=" + z3 + ", didSendNewCode=" + z4 + ")";
    }

    public VerificationViewState(boolean z, boolean z2, ErrorMessage errorMessage, boolean z3, boolean z4) {
        this.isProcessing = z;
        this.requestFocus = z2;
        this.errorMessage = errorMessage;
        this.isSendingNewCode = z3;
        this.didSendNewCode = z4;
    }

    public /* synthetic */ VerificationViewState(boolean z, boolean z2, ErrorMessage errorMessage, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? null : errorMessage, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4);
    }
}
