package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.constant.NestIcon;
import co.bird.android.model.constant.NestProminence;
import co.bird.android.model.constant.NestViewState;
import co.bird.android.model.persistence.nestedstructures.Coordinate;
import co.bird.android.model.persistence.nestedstructures.NestAvailableSpaceDetail;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0002\u0010\u0018J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0014HÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0089\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016HÆ\u0001J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\t\u0010=\u001a\u00020\u0007HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u0006?"}, m28432d2 = {"Lco/bird/android/model/persistence/NestMarker;", "", "id", "", "location", "Lco/bird/android/model/persistence/nestedstructures/Coordinate;", "capacity", "", TransferTable.COLUMN_STATE, "Lco/bird/android/model/constant/NestViewState;", "icon", "Lco/bird/android/model/constant/NestIcon;", "secondaryIcon", "Lco/bird/android/model/constant/ClientIcon;", "secondaryIconColor", "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "secondaryIconBackgroundColor", "prominence", "Lco/bird/android/model/constant/NestProminence;", "updatedAt", "Lorg/joda/time/DateTime;", "availableSpaceDetails", "", "Lco/bird/android/model/persistence/nestedstructures/NestAvailableSpaceDetail;", "(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/Coordinate;ILco/bird/android/model/constant/NestViewState;Lco/bird/android/model/constant/NestIcon;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/constant/NestProminence;Lorg/joda/time/DateTime;Ljava/util/List;)V", "getAvailableSpaceDetails", "()Ljava/util/List;", "getCapacity", "()I", "getIcon", "()Lco/bird/android/model/constant/NestIcon;", "getId", "()Ljava/lang/String;", "getLocation", "()Lco/bird/android/model/persistence/nestedstructures/Coordinate;", "getProminence", "()Lco/bird/android/model/constant/NestProminence;", "getSecondaryIcon", "()Lco/bird/android/model/constant/ClientIcon;", "getSecondaryIconBackgroundColor", "()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "getSecondaryIconColor", "getState", "()Lco/bird/android/model/constant/NestViewState;", "getUpdatedAt", "()Lorg/joda/time/DateTime;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class NestMarker {
    private final List<NestAvailableSpaceDetail> availableSpaceDetails;
    private final int capacity;
    private final NestIcon icon;

    /* renamed from: id */
    private final String f66680id;
    private final Coordinate location;
    private final NestProminence prominence;
    private final ClientIcon secondaryIcon;
    private final ThemedColors secondaryIconBackgroundColor;
    private final ThemedColors secondaryIconColor;
    private final NestViewState state;
    private final DateTime updatedAt;

    public NestMarker(String id, Coordinate location, int i, NestViewState nestViewState, NestIcon nestIcon, ClientIcon clientIcon, ThemedColors themedColors, ThemedColors themedColors2, NestProminence nestProminence, DateTime updatedAt, List<NestAvailableSpaceDetail> availableSpaceDetails) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(availableSpaceDetails, "availableSpaceDetails");
        this.f66680id = id;
        this.location = location;
        this.capacity = i;
        this.state = nestViewState;
        this.icon = nestIcon;
        this.secondaryIcon = clientIcon;
        this.secondaryIconColor = themedColors;
        this.secondaryIconBackgroundColor = themedColors2;
        this.prominence = nestProminence;
        this.updatedAt = updatedAt;
        this.availableSpaceDetails = availableSpaceDetails;
    }

    public final String component1() {
        return this.f66680id;
    }

    public final DateTime component10() {
        return this.updatedAt;
    }

    public final List<NestAvailableSpaceDetail> component11() {
        return this.availableSpaceDetails;
    }

    public final Coordinate component2() {
        return this.location;
    }

    public final int component3() {
        return this.capacity;
    }

    public final NestViewState component4() {
        return this.state;
    }

    public final NestIcon component5() {
        return this.icon;
    }

    public final ClientIcon component6() {
        return this.secondaryIcon;
    }

    public final ThemedColors component7() {
        return this.secondaryIconColor;
    }

    public final ThemedColors component8() {
        return this.secondaryIconBackgroundColor;
    }

    public final NestProminence component9() {
        return this.prominence;
    }

    public final NestMarker copy(String id, Coordinate location, int i, NestViewState nestViewState, NestIcon nestIcon, ClientIcon clientIcon, ThemedColors themedColors, ThemedColors themedColors2, NestProminence nestProminence, DateTime updatedAt, List<NestAvailableSpaceDetail> availableSpaceDetails) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(availableSpaceDetails, "availableSpaceDetails");
        return new NestMarker(id, location, i, nestViewState, nestIcon, clientIcon, themedColors, themedColors2, nestProminence, updatedAt, availableSpaceDetails);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof NestMarker)) {
            return false;
        }
        if (obj != this) {
            NestMarker nestMarker = (NestMarker) obj;
            if (!Intrinsics.areEqual(this.f66680id, nestMarker.f66680id) || !Intrinsics.areEqual(this.location, nestMarker.location) || this.capacity != nestMarker.capacity || this.state != nestMarker.state || this.icon != nestMarker.icon || !Intrinsics.areEqual(this.availableSpaceDetails, nestMarker.availableSpaceDetails) || this.secondaryIcon != nestMarker.secondaryIcon) {
                return false;
            }
        }
        return true;
    }

    public final List<NestAvailableSpaceDetail> getAvailableSpaceDetails() {
        return this.availableSpaceDetails;
    }

    public final int getCapacity() {
        return this.capacity;
    }

    public final NestIcon getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.f66680id;
    }

    public final Coordinate getLocation() {
        return this.location;
    }

    public final NestProminence getProminence() {
        return this.prominence;
    }

    public final ClientIcon getSecondaryIcon() {
        return this.secondaryIcon;
    }

    public final ThemedColors getSecondaryIconBackgroundColor() {
        return this.secondaryIconBackgroundColor;
    }

    public final ThemedColors getSecondaryIconColor() {
        return this.secondaryIconColor;
    }

    public final NestViewState getState() {
        return this.state;
    }

    public final DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int hashCode = ((((this.f66680id.hashCode() * 31) + this.location.hashCode()) * 31) + Integer.hashCode(this.capacity)) * 31;
        NestViewState nestViewState = this.state;
        int hashCode2 = (hashCode + (nestViewState == null ? 0 : nestViewState.hashCode())) * 31;
        NestIcon nestIcon = this.icon;
        int hashCode3 = (hashCode2 + (nestIcon == null ? 0 : nestIcon.hashCode())) * 31;
        ClientIcon clientIcon = this.secondaryIcon;
        int hashCode4 = (hashCode3 + (clientIcon == null ? 0 : clientIcon.hashCode())) * 31;
        ThemedColors themedColors = this.secondaryIconColor;
        int hashCode5 = (hashCode4 + (themedColors == null ? 0 : themedColors.hashCode())) * 31;
        ThemedColors themedColors2 = this.secondaryIconBackgroundColor;
        int hashCode6 = (hashCode5 + (themedColors2 == null ? 0 : themedColors2.hashCode())) * 31;
        NestProminence nestProminence = this.prominence;
        return ((((hashCode6 + (nestProminence != null ? nestProminence.hashCode() : 0)) * 31) + this.updatedAt.hashCode()) * 31) + this.availableSpaceDetails.hashCode();
    }

    public String toString() {
        String str = this.f66680id;
        Coordinate coordinate = this.location;
        int i = this.capacity;
        NestViewState nestViewState = this.state;
        NestIcon nestIcon = this.icon;
        ClientIcon clientIcon = this.secondaryIcon;
        ThemedColors themedColors = this.secondaryIconColor;
        ThemedColors themedColors2 = this.secondaryIconBackgroundColor;
        NestProminence nestProminence = this.prominence;
        DateTime dateTime = this.updatedAt;
        List<NestAvailableSpaceDetail> list = this.availableSpaceDetails;
        return "NestMarker(id=" + str + ", location=" + coordinate + ", capacity=" + i + ", state=" + nestViewState + ", icon=" + nestIcon + ", secondaryIcon=" + clientIcon + ", secondaryIconColor=" + themedColors + ", secondaryIconBackgroundColor=" + themedColors2 + ", prominence=" + nestProminence + ", updatedAt=" + dateTime + ", availableSpaceDetails=" + list + ")";
    }
}
