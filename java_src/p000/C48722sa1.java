package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.TokenPair;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m28432d2 = {"Lsa1;", "", "", "validationRequired", "Lco/bird/android/model/TokenPair;", "tokens", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Z", "c", "()Z", "Lco/bird/android/model/TokenPair;", "b", "()Lco/bird/android/model/TokenPair;", "<init>", "(ZLco/bird/android/model/TokenPair;)V", "auth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: sa1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48722sa1 {
    @JsonProperty("tokens")
    @InterfaceC41208ft5("tokens")
    private final TokenPair tokens;
    @JsonProperty("validation_required")
    @InterfaceC41208ft5("validation_required")
    private final boolean validationRequired;

    public C48722sa1() {
        this(false, null, 3, null);
    }

    public static /* synthetic */ C48722sa1 copy$default(C48722sa1 c48722sa1, boolean z, TokenPair tokenPair, int i, Object obj) {
        if ((i & 1) != 0) {
            z = c48722sa1.validationRequired;
        }
        if ((i & 2) != 0) {
            tokenPair = c48722sa1.tokens;
        }
        return c48722sa1.m13991a(z, tokenPair);
    }

    /* renamed from: a */
    public final C48722sa1 m13991a(boolean z, TokenPair tokenPair) {
        return new C48722sa1(z, tokenPair);
    }

    /* renamed from: b */
    public final TokenPair m13990b() {
        return this.tokens;
    }

    /* renamed from: c */
    public final boolean m13989c() {
        return this.validationRequired;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C48722sa1) {
            C48722sa1 c48722sa1 = (C48722sa1) obj;
            return this.validationRequired == c48722sa1.validationRequired && Intrinsics.areEqual(this.tokens, c48722sa1.tokens);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.validationRequired;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        TokenPair tokenPair = this.tokens;
        return i + (tokenPair == null ? 0 : tokenPair.hashCode());
    }

    public String toString() {
        boolean z = this.validationRequired;
        TokenPair tokenPair = this.tokens;
        return "EmailMagicLinkResponse(validationRequired=" + z + ", tokens=" + tokenPair + ")";
    }

    public C48722sa1(boolean z, TokenPair tokenPair) {
        this.validationRequired = z;
        this.tokens = tokenPair;
    }

    public /* synthetic */ C48722sa1(boolean z, TokenPair tokenPair, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : tokenPair);
    }
}
