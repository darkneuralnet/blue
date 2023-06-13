package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ClientIcon;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003JI\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\tHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006%"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/NestVehicle;", "", "title", "", "statusIcon", "Lco/bird/android/model/constant/ClientIcon;", "statusBackgroundColor", "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "battery", "", "birdId", "expiresAt", "Lorg/joda/time/DateTime;", "(Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;ILjava/lang/String;Lorg/joda/time/DateTime;)V", "getBattery", "()I", "getBirdId", "()Ljava/lang/String;", "getExpiresAt", "()Lorg/joda/time/DateTime;", "getStatusBackgroundColor", "()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "getStatusIcon", "()Lco/bird/android/model/constant/ClientIcon;", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class NestVehicle {
    @JsonProperty("battery")
    @InterfaceC41208ft5("battery")
    private final int battery;
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("expires_at")
    @InterfaceC41208ft5("expires_at")
    private final DateTime expiresAt;
    @JsonProperty("status_background_color")
    @InterfaceC41208ft5("status_background_color")
    private final ThemedColors statusBackgroundColor;
    @JsonProperty("status_icon")
    @InterfaceC41208ft5("status_icon")
    private final ClientIcon statusIcon;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public NestVehicle(String title, ClientIcon clientIcon, ThemedColors statusBackgroundColor, int i, String birdId, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(statusBackgroundColor, "statusBackgroundColor");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        this.title = title;
        this.statusIcon = clientIcon;
        this.statusBackgroundColor = statusBackgroundColor;
        this.battery = i;
        this.birdId = birdId;
        this.expiresAt = dateTime;
    }

    public static /* synthetic */ NestVehicle copy$default(NestVehicle nestVehicle, String str, ClientIcon clientIcon, ThemedColors themedColors, int i, String str2, DateTime dateTime, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = nestVehicle.title;
        }
        if ((i2 & 2) != 0) {
            clientIcon = nestVehicle.statusIcon;
        }
        ClientIcon clientIcon2 = clientIcon;
        if ((i2 & 4) != 0) {
            themedColors = nestVehicle.statusBackgroundColor;
        }
        ThemedColors themedColors2 = themedColors;
        if ((i2 & 8) != 0) {
            i = nestVehicle.battery;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str2 = nestVehicle.birdId;
        }
        String str3 = str2;
        if ((i2 & 32) != 0) {
            dateTime = nestVehicle.expiresAt;
        }
        return nestVehicle.copy(str, clientIcon2, themedColors2, i3, str3, dateTime);
    }

    public final String component1() {
        return this.title;
    }

    public final ClientIcon component2() {
        return this.statusIcon;
    }

    public final ThemedColors component3() {
        return this.statusBackgroundColor;
    }

    public final int component4() {
        return this.battery;
    }

    public final String component5() {
        return this.birdId;
    }

    public final DateTime component6() {
        return this.expiresAt;
    }

    public final NestVehicle copy(String title, ClientIcon clientIcon, ThemedColors statusBackgroundColor, int i, String birdId, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(statusBackgroundColor, "statusBackgroundColor");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        return new NestVehicle(title, clientIcon, statusBackgroundColor, i, birdId, dateTime);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NestVehicle) {
            NestVehicle nestVehicle = (NestVehicle) obj;
            return Intrinsics.areEqual(this.title, nestVehicle.title) && this.statusIcon == nestVehicle.statusIcon && Intrinsics.areEqual(this.statusBackgroundColor, nestVehicle.statusBackgroundColor) && this.battery == nestVehicle.battery && Intrinsics.areEqual(this.birdId, nestVehicle.birdId) && Intrinsics.areEqual(this.expiresAt, nestVehicle.expiresAt);
        }
        return false;
    }

    public final int getBattery() {
        return this.battery;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final DateTime getExpiresAt() {
        return this.expiresAt;
    }

    public final ThemedColors getStatusBackgroundColor() {
        return this.statusBackgroundColor;
    }

    public final ClientIcon getStatusIcon() {
        return this.statusIcon;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        ClientIcon clientIcon = this.statusIcon;
        int hashCode2 = (((((((hashCode + (clientIcon == null ? 0 : clientIcon.hashCode())) * 31) + this.statusBackgroundColor.hashCode()) * 31) + Integer.hashCode(this.battery)) * 31) + this.birdId.hashCode()) * 31;
        DateTime dateTime = this.expiresAt;
        return hashCode2 + (dateTime != null ? dateTime.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        ClientIcon clientIcon = this.statusIcon;
        ThemedColors themedColors = this.statusBackgroundColor;
        int i = this.battery;
        String str2 = this.birdId;
        DateTime dateTime = this.expiresAt;
        return "NestVehicle(title=" + str + ", statusIcon=" + clientIcon + ", statusBackgroundColor=" + themedColors + ", battery=" + i + ", birdId=" + str2 + ", expiresAt=" + dateTime + ")";
    }
}
