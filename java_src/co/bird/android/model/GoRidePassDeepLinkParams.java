package co.bird.android.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/model/GoRidePassDeepLinkParams;", "Lco/bird/android/model/GoDeepLinkParams;", "linkCode", "", "(Ljava/lang/String;)V", "getLinkCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class GoRidePassDeepLinkParams implements GoDeepLinkParams {
    private final String linkCode;

    public GoRidePassDeepLinkParams(String str) {
        this.linkCode = str;
    }

    public static /* synthetic */ GoRidePassDeepLinkParams copy$default(GoRidePassDeepLinkParams goRidePassDeepLinkParams, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goRidePassDeepLinkParams.linkCode;
        }
        return goRidePassDeepLinkParams.copy(str);
    }

    public final String component1() {
        return this.linkCode;
    }

    public final GoRidePassDeepLinkParams copy(String str) {
        return new GoRidePassDeepLinkParams(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GoRidePassDeepLinkParams) && Intrinsics.areEqual(this.linkCode, ((GoRidePassDeepLinkParams) obj).linkCode);
    }

    public final String getLinkCode() {
        return this.linkCode;
    }

    public int hashCode() {
        String str = this.linkCode;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        String str = this.linkCode;
        return "GoRidePassDeepLinkParams(linkCode=" + str + ")";
    }
}
