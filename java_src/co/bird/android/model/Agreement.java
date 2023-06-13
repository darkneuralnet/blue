package co.bird.android.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/model/Agreement;", "", "needsToAccept", "", "id", "", "content", "role", "Lco/bird/android/model/AgreementRole;", "(ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/AgreementRole;)V", "getContent", "()Ljava/lang/String;", "getId", "getNeedsToAccept", "()Z", "getRole", "()Lco/bird/android/model/AgreementRole;", "component1", "component2", "component3", "component4", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class Agreement {
    @JsonProperty("content")
    @InterfaceC41208ft5("content")
    private final String content;
    @JsonProperty("agreement_content_id")
    @InterfaceC41208ft5("agreement_content_id")

    /* renamed from: id */
    private final String f66567id;
    @JsonProperty("needs_to_accept")
    @InterfaceC41208ft5("needs_to_accept")
    private final boolean needsToAccept;
    @JsonProperty("role")
    @InterfaceC41208ft5("role")
    private final AgreementRole role;

    public Agreement() {
        this(false, null, null, null, 15, null);
    }

    public static /* synthetic */ Agreement copy$default(Agreement agreement, boolean z, String str, String str2, AgreementRole agreementRole, int i, Object obj) {
        if ((i & 1) != 0) {
            z = agreement.needsToAccept;
        }
        if ((i & 2) != 0) {
            str = agreement.f66567id;
        }
        if ((i & 4) != 0) {
            str2 = agreement.content;
        }
        if ((i & 8) != 0) {
            agreementRole = agreement.role;
        }
        return agreement.copy(z, str, str2, agreementRole);
    }

    public final boolean component1() {
        return this.needsToAccept;
    }

    public final String component2() {
        return this.f66567id;
    }

    public final String component3() {
        return this.content;
    }

    public final AgreementRole component4() {
        return this.role;
    }

    public final Agreement copy(boolean z, String id, String content, AgreementRole agreementRole) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(content, "content");
        return new Agreement(z, id, content, agreementRole);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Agreement) {
            Agreement agreement = (Agreement) obj;
            return this.needsToAccept == agreement.needsToAccept && Intrinsics.areEqual(this.f66567id, agreement.f66567id) && Intrinsics.areEqual(this.content, agreement.content) && this.role == agreement.role;
        }
        return false;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getId() {
        return this.f66567id;
    }

    public final boolean getNeedsToAccept() {
        return this.needsToAccept;
    }

    public final AgreementRole getRole() {
        return this.role;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z = this.needsToAccept;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = ((((r0 * 31) + this.f66567id.hashCode()) * 31) + this.content.hashCode()) * 31;
        AgreementRole agreementRole = this.role;
        return hashCode + (agreementRole == null ? 0 : agreementRole.hashCode());
    }

    public String toString() {
        boolean z = this.needsToAccept;
        String str = this.f66567id;
        String str2 = this.content;
        AgreementRole agreementRole = this.role;
        return "Agreement(needsToAccept=" + z + ", id=" + str + ", content=" + str2 + ", role=" + agreementRole + ")";
    }

    public Agreement(boolean z, String id, String content, AgreementRole agreementRole) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(content, "content");
        this.needsToAccept = z;
        this.f66567id = id;
        this.content = content;
        this.role = agreementRole;
    }

    public /* synthetic */ Agreement(boolean z, String str, String str2, AgreementRole agreementRole, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : agreementRole);
    }
}
