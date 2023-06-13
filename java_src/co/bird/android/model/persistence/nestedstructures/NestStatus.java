package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.NestIcon;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003JU\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010$\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0018R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013¨\u0006)"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/NestStatus;", "Lco/bird/android/model/persistence/nestedstructures/NestFlightSheetSection;", "idx", "", "title", "", "details", "nestIcon", "Lco/bird/android/model/constant/NestIcon;", "iconBackgroundColor", "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "isRecommended", "", "claimExpiresAt", "Lorg/joda/time/DateTime;", "(ILjava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/NestIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;ZLorg/joda/time/DateTime;)V", "getClaimExpiresAt", "()Lorg/joda/time/DateTime;", "getDetails", "()Ljava/lang/String;", "getIconBackgroundColor", "()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "getIdx", "()I", "()Z", "getNestIcon", "()Lco/bird/android/model/constant/NestIcon;", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class NestStatus implements NestFlightSheetSection {
    @JsonProperty("claim_expires_at")
    @InterfaceC41208ft5("claim_expires_at")
    private final DateTime claimExpiresAt;
    @JsonProperty("details")
    @InterfaceC41208ft5("details")
    private final String details;
    @JsonProperty("icon_background_color")
    @InterfaceC41208ft5("icon_background_color")
    private final ThemedColors iconBackgroundColor;
    @JsonProperty("idx")
    @InterfaceC41208ft5("idx")
    private final int idx;
    @JsonProperty("is_recommended")
    @InterfaceC41208ft5("is_recommended")
    private final boolean isRecommended;
    @JsonProperty("nest_icon")
    @InterfaceC41208ft5("nest_icon")
    private final NestIcon nestIcon;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public NestStatus(int i, String title, String details, NestIcon nestIcon, ThemedColors themedColors, boolean z, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(details, "details");
        this.idx = i;
        this.title = title;
        this.details = details;
        this.nestIcon = nestIcon;
        this.iconBackgroundColor = themedColors;
        this.isRecommended = z;
        this.claimExpiresAt = dateTime;
    }

    public static /* synthetic */ NestStatus copy$default(NestStatus nestStatus, int i, String str, String str2, NestIcon nestIcon, ThemedColors themedColors, boolean z, DateTime dateTime, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = nestStatus.idx;
        }
        if ((i2 & 2) != 0) {
            str = nestStatus.title;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = nestStatus.details;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            nestIcon = nestStatus.nestIcon;
        }
        NestIcon nestIcon2 = nestIcon;
        if ((i2 & 16) != 0) {
            themedColors = nestStatus.iconBackgroundColor;
        }
        ThemedColors themedColors2 = themedColors;
        if ((i2 & 32) != 0) {
            z = nestStatus.isRecommended;
        }
        boolean z2 = z;
        if ((i2 & 64) != 0) {
            dateTime = nestStatus.claimExpiresAt;
        }
        return nestStatus.copy(i, str3, str4, nestIcon2, themedColors2, z2, dateTime);
    }

    public final int component1() {
        return this.idx;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.details;
    }

    public final NestIcon component4() {
        return this.nestIcon;
    }

    public final ThemedColors component5() {
        return this.iconBackgroundColor;
    }

    public final boolean component6() {
        return this.isRecommended;
    }

    public final DateTime component7() {
        return this.claimExpiresAt;
    }

    public final NestStatus copy(int i, String title, String details, NestIcon nestIcon, ThemedColors themedColors, boolean z, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(details, "details");
        return new NestStatus(i, title, details, nestIcon, themedColors, z, dateTime);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NestStatus) {
            NestStatus nestStatus = (NestStatus) obj;
            return this.idx == nestStatus.idx && Intrinsics.areEqual(this.title, nestStatus.title) && Intrinsics.areEqual(this.details, nestStatus.details) && this.nestIcon == nestStatus.nestIcon && Intrinsics.areEqual(this.iconBackgroundColor, nestStatus.iconBackgroundColor) && this.isRecommended == nestStatus.isRecommended && Intrinsics.areEqual(this.claimExpiresAt, nestStatus.claimExpiresAt);
        }
        return false;
    }

    public final DateTime getClaimExpiresAt() {
        return this.claimExpiresAt;
    }

    public final String getDetails() {
        return this.details;
    }

    public final ThemedColors getIconBackgroundColor() {
        return this.iconBackgroundColor;
    }

    @Override // co.bird.android.model.persistence.nestedstructures.NestFlightSheetSection
    public int getIdx() {
        return this.idx;
    }

    public final NestIcon getNestIcon() {
        return this.nestIcon;
    }

    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.idx) * 31) + this.title.hashCode()) * 31) + this.details.hashCode()) * 31;
        NestIcon nestIcon = this.nestIcon;
        int hashCode2 = (hashCode + (nestIcon == null ? 0 : nestIcon.hashCode())) * 31;
        ThemedColors themedColors = this.iconBackgroundColor;
        int hashCode3 = (hashCode2 + (themedColors == null ? 0 : themedColors.hashCode())) * 31;
        boolean z = this.isRecommended;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode3 + i) * 31;
        DateTime dateTime = this.claimExpiresAt;
        return i2 + (dateTime != null ? dateTime.hashCode() : 0);
    }

    public final boolean isRecommended() {
        return this.isRecommended;
    }

    public String toString() {
        int i = this.idx;
        String str = this.title;
        String str2 = this.details;
        NestIcon nestIcon = this.nestIcon;
        ThemedColors themedColors = this.iconBackgroundColor;
        boolean z = this.isRecommended;
        DateTime dateTime = this.claimExpiresAt;
        return "NestStatus(idx=" + i + ", title=" + str + ", details=" + str2 + ", nestIcon=" + nestIcon + ", iconBackgroundColor=" + themedColors + ", isRecommended=" + z + ", claimExpiresAt=" + dateTime + ")";
    }
}
