package co.bird.android.model;

import com.auth0.android.jwt.JWT;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/model/TokenPair;", "", "accessJwt", "Lcom/auth0/android/jwt/JWT;", "refreshJwt", "(Lcom/auth0/android/jwt/JWT;Lcom/auth0/android/jwt/JWT;)V", "getAccessJwt", "()Lcom/auth0/android/jwt/JWT;", "getRefreshJwt", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class TokenPair {
    @JsonProperty("access")
    @InterfaceC41208ft5("access")
    private final JWT accessJwt;
    @JsonProperty("refresh")
    @InterfaceC41208ft5("refresh")
    private final JWT refreshJwt;

    public TokenPair(JWT accessJwt, JWT refreshJwt) {
        Intrinsics.checkNotNullParameter(accessJwt, "accessJwt");
        Intrinsics.checkNotNullParameter(refreshJwt, "refreshJwt");
        this.accessJwt = accessJwt;
        this.refreshJwt = refreshJwt;
    }

    public static /* synthetic */ TokenPair copy$default(TokenPair tokenPair, JWT jwt, JWT jwt2, int i, Object obj) {
        if ((i & 1) != 0) {
            jwt = tokenPair.accessJwt;
        }
        if ((i & 2) != 0) {
            jwt2 = tokenPair.refreshJwt;
        }
        return tokenPair.copy(jwt, jwt2);
    }

    public final JWT component1() {
        return this.accessJwt;
    }

    public final JWT component2() {
        return this.refreshJwt;
    }

    public final TokenPair copy(JWT accessJwt, JWT refreshJwt) {
        Intrinsics.checkNotNullParameter(accessJwt, "accessJwt");
        Intrinsics.checkNotNullParameter(refreshJwt, "refreshJwt");
        return new TokenPair(accessJwt, refreshJwt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TokenPair) {
            TokenPair tokenPair = (TokenPair) obj;
            return Intrinsics.areEqual(this.accessJwt, tokenPair.accessJwt) && Intrinsics.areEqual(this.refreshJwt, tokenPair.refreshJwt);
        }
        return false;
    }

    public final JWT getAccessJwt() {
        return this.accessJwt;
    }

    public final JWT getRefreshJwt() {
        return this.refreshJwt;
    }

    public int hashCode() {
        return (this.accessJwt.hashCode() * 31) + this.refreshJwt.hashCode();
    }

    public String toString() {
        JWT jwt = this.accessJwt;
        JWT jwt2 = this.refreshJwt;
        return "TokenPair(accessJwt=" + jwt + ", refreshJwt=" + jwt2 + ")";
    }
}
