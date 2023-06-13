package co.bird.android.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/model/TokenPairState;", "", "tokenPair", "Lco/bird/android/model/TokenPair;", "refreshRequested", "", "(Lco/bird/android/model/TokenPair;Z)V", "getRefreshRequested", "()Z", "getTokenPair", "()Lco/bird/android/model/TokenPair;", "component1", "component2", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class TokenPairState {
    @JsonProperty("refresh_requested")
    @InterfaceC41208ft5("refresh_requested")
    private final boolean refreshRequested;
    @JsonProperty("token_pair")
    @InterfaceC41208ft5("token_pair")
    private final TokenPair tokenPair;

    public TokenPairState(TokenPair tokenPair, boolean z) {
        Intrinsics.checkNotNullParameter(tokenPair, "tokenPair");
        this.tokenPair = tokenPair;
        this.refreshRequested = z;
    }

    public static /* synthetic */ TokenPairState copy$default(TokenPairState tokenPairState, TokenPair tokenPair, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            tokenPair = tokenPairState.tokenPair;
        }
        if ((i & 2) != 0) {
            z = tokenPairState.refreshRequested;
        }
        return tokenPairState.copy(tokenPair, z);
    }

    public final TokenPair component1() {
        return this.tokenPair;
    }

    public final boolean component2() {
        return this.refreshRequested;
    }

    public final TokenPairState copy(TokenPair tokenPair, boolean z) {
        Intrinsics.checkNotNullParameter(tokenPair, "tokenPair");
        return new TokenPairState(tokenPair, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TokenPairState) {
            TokenPairState tokenPairState = (TokenPairState) obj;
            return Intrinsics.areEqual(this.tokenPair, tokenPairState.tokenPair) && this.refreshRequested == tokenPairState.refreshRequested;
        }
        return false;
    }

    public final boolean getRefreshRequested() {
        return this.refreshRequested;
    }

    public final TokenPair getTokenPair() {
        return this.tokenPair;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.tokenPair.hashCode() * 31;
        boolean z = this.refreshRequested;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        TokenPair tokenPair = this.tokenPair;
        boolean z = this.refreshRequested;
        return "TokenPairState(tokenPair=" + tokenPair + ", refreshRequested=" + z + ")";
    }

    public /* synthetic */ TokenPairState(TokenPair tokenPair, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tokenPair, (i & 2) != 0 ? false : z);
    }
}
