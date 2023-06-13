package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/NestFavoritePartner;", "", "partnerId", "", "displayName", "(Ljava/lang/String;Ljava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "getPartnerId", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class NestFavoritePartner {
    @JsonProperty("display_name")
    @InterfaceC41208ft5("display_name")
    private final String displayName;
    @JsonProperty("partner_id")
    @InterfaceC41208ft5("partner_id")
    private final String partnerId;

    public NestFavoritePartner(String partnerId, String displayName) {
        Intrinsics.checkNotNullParameter(partnerId, "partnerId");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        this.partnerId = partnerId;
        this.displayName = displayName;
    }

    public static /* synthetic */ NestFavoritePartner copy$default(NestFavoritePartner nestFavoritePartner, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nestFavoritePartner.partnerId;
        }
        if ((i & 2) != 0) {
            str2 = nestFavoritePartner.displayName;
        }
        return nestFavoritePartner.copy(str, str2);
    }

    public final String component1() {
        return this.partnerId;
    }

    public final String component2() {
        return this.displayName;
    }

    public final NestFavoritePartner copy(String partnerId, String displayName) {
        Intrinsics.checkNotNullParameter(partnerId, "partnerId");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        return new NestFavoritePartner(partnerId, displayName);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NestFavoritePartner) {
            NestFavoritePartner nestFavoritePartner = (NestFavoritePartner) obj;
            return Intrinsics.areEqual(this.partnerId, nestFavoritePartner.partnerId) && Intrinsics.areEqual(this.displayName, nestFavoritePartner.displayName);
        }
        return false;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getPartnerId() {
        return this.partnerId;
    }

    public int hashCode() {
        return (this.partnerId.hashCode() * 31) + this.displayName.hashCode();
    }

    public String toString() {
        String str = this.partnerId;
        String str2 = this.displayName;
        return "NestFavoritePartner(partnerId=" + str + ", displayName=" + str2 + ")";
    }
}
