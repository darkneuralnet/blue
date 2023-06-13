package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.BirdBadgeType;
import co.bird.android.model.constant.ChargerBirdBadgeType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J=\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006 "}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/BirdLabel;", "", "name", "", "color", "", "marker", "badgeType", "Lco/bird/android/model/constant/BirdBadgeType;", "chargerBadgeType", "Lco/bird/android/model/constant/ChargerBirdBadgeType;", "(Ljava/lang/String;ILjava/lang/String;Lco/bird/android/model/constant/BirdBadgeType;Lco/bird/android/model/constant/ChargerBirdBadgeType;)V", "getBadgeType", "()Lco/bird/android/model/constant/BirdBadgeType;", "getChargerBadgeType", "()Lco/bird/android/model/constant/ChargerBirdBadgeType;", "getColor", "()I", "getMarker", "()Ljava/lang/String;", "getName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BirdLabel {
    @JsonProperty("badge_type")
    @InterfaceC41208ft5("badge_type")
    private final BirdBadgeType badgeType;
    @JsonProperty("bird_badge_type")
    @InterfaceC41208ft5("bird_badge_type")
    private final ChargerBirdBadgeType chargerBadgeType;
    @JsonProperty("color")
    @InterfaceC41208ft5("color")
    private final int color;
    @JsonProperty("marker")
    @InterfaceC41208ft5("marker")
    private final String marker;
    @JsonProperty("name")
    @InterfaceC41208ft5("name")
    private final String name;

    public BirdLabel(String name, int i, String str, BirdBadgeType badgeType, ChargerBirdBadgeType chargerBadgeType) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(badgeType, "badgeType");
        Intrinsics.checkNotNullParameter(chargerBadgeType, "chargerBadgeType");
        this.name = name;
        this.color = i;
        this.marker = str;
        this.badgeType = badgeType;
        this.chargerBadgeType = chargerBadgeType;
    }

    public static /* synthetic */ BirdLabel copy$default(BirdLabel birdLabel, String str, int i, String str2, BirdBadgeType birdBadgeType, ChargerBirdBadgeType chargerBirdBadgeType, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = birdLabel.name;
        }
        if ((i2 & 2) != 0) {
            i = birdLabel.color;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str2 = birdLabel.marker;
        }
        String str3 = str2;
        if ((i2 & 8) != 0) {
            birdBadgeType = birdLabel.badgeType;
        }
        BirdBadgeType birdBadgeType2 = birdBadgeType;
        if ((i2 & 16) != 0) {
            chargerBirdBadgeType = birdLabel.chargerBadgeType;
        }
        return birdLabel.copy(str, i3, str3, birdBadgeType2, chargerBirdBadgeType);
    }

    public final String component1() {
        return this.name;
    }

    public final int component2() {
        return this.color;
    }

    public final String component3() {
        return this.marker;
    }

    public final BirdBadgeType component4() {
        return this.badgeType;
    }

    public final ChargerBirdBadgeType component5() {
        return this.chargerBadgeType;
    }

    public final BirdLabel copy(String name, int i, String str, BirdBadgeType badgeType, ChargerBirdBadgeType chargerBadgeType) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(badgeType, "badgeType");
        Intrinsics.checkNotNullParameter(chargerBadgeType, "chargerBadgeType");
        return new BirdLabel(name, i, str, badgeType, chargerBadgeType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BirdLabel) {
            BirdLabel birdLabel = (BirdLabel) obj;
            return Intrinsics.areEqual(this.name, birdLabel.name) && this.color == birdLabel.color && Intrinsics.areEqual(this.marker, birdLabel.marker) && this.badgeType == birdLabel.badgeType && this.chargerBadgeType == birdLabel.chargerBadgeType;
        }
        return false;
    }

    public final BirdBadgeType getBadgeType() {
        return this.badgeType;
    }

    public final ChargerBirdBadgeType getChargerBadgeType() {
        return this.chargerBadgeType;
    }

    public final int getColor() {
        return this.color;
    }

    public final String getMarker() {
        return this.marker;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int hashCode = ((this.name.hashCode() * 31) + Integer.hashCode(this.color)) * 31;
        String str = this.marker;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.badgeType.hashCode()) * 31) + this.chargerBadgeType.hashCode();
    }

    public String toString() {
        String str = this.name;
        int i = this.color;
        String str2 = this.marker;
        BirdBadgeType birdBadgeType = this.badgeType;
        ChargerBirdBadgeType chargerBirdBadgeType = this.chargerBadgeType;
        return "BirdLabel(name=" + str + ", color=" + i + ", marker=" + str2 + ", badgeType=" + birdBadgeType + ", chargerBadgeType=" + chargerBirdBadgeType + ")";
    }

    public /* synthetic */ BirdLabel(String str, int i, String str2, BirdBadgeType birdBadgeType, ChargerBirdBadgeType chargerBirdBadgeType, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str2, birdBadgeType, chargerBirdBadgeType);
    }
}
