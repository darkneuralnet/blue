package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/wire/configs/RentalSupportConfig;", "", "supportArticleId", "", "planArticleId", "windowArticleId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPlanArticleId", "()Ljava/lang/String;", "getSupportArticleId", "getWindowArticleId", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RentalSupportConfig {
    private final String planArticleId;
    private final String supportArticleId;
    private final String windowArticleId;

    public RentalSupportConfig() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ RentalSupportConfig copy$default(RentalSupportConfig rentalSupportConfig, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rentalSupportConfig.supportArticleId;
        }
        if ((i & 2) != 0) {
            str2 = rentalSupportConfig.planArticleId;
        }
        if ((i & 4) != 0) {
            str3 = rentalSupportConfig.windowArticleId;
        }
        return rentalSupportConfig.copy(str, str2, str3);
    }

    public final String component1() {
        return this.supportArticleId;
    }

    public final String component2() {
        return this.planArticleId;
    }

    public final String component3() {
        return this.windowArticleId;
    }

    public final RentalSupportConfig copy(String supportArticleId, String str, String str2) {
        Intrinsics.checkNotNullParameter(supportArticleId, "supportArticleId");
        return new RentalSupportConfig(supportArticleId, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RentalSupportConfig) {
            RentalSupportConfig rentalSupportConfig = (RentalSupportConfig) obj;
            return Intrinsics.areEqual(this.supportArticleId, rentalSupportConfig.supportArticleId) && Intrinsics.areEqual(this.planArticleId, rentalSupportConfig.planArticleId) && Intrinsics.areEqual(this.windowArticleId, rentalSupportConfig.windowArticleId);
        }
        return false;
    }

    public final String getPlanArticleId() {
        return this.planArticleId;
    }

    public final String getSupportArticleId() {
        return this.supportArticleId;
    }

    public final String getWindowArticleId() {
        return this.windowArticleId;
    }

    public int hashCode() {
        int hashCode = this.supportArticleId.hashCode() * 31;
        String str = this.planArticleId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.windowArticleId;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.supportArticleId;
        String str2 = this.planArticleId;
        String str3 = this.windowArticleId;
        return "RentalSupportConfig(supportArticleId=" + str + ", planArticleId=" + str2 + ", windowArticleId=" + str3 + ")";
    }

    public RentalSupportConfig(String supportArticleId, String str, String str2) {
        Intrinsics.checkNotNullParameter(supportArticleId, "supportArticleId");
        this.supportArticleId = supportArticleId;
        this.planArticleId = str;
        this.windowArticleId = str2;
    }

    public /* synthetic */ RentalSupportConfig(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
