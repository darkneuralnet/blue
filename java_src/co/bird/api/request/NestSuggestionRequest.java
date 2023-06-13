package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireLocation;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001e"}, m28432d2 = {"Lco/bird/api/request/NestSuggestionRequest;", "", "location", "Lco/bird/android/model/wire/WireLocation;", "name", "", "notes", "capacity", "", "assetId", "(Lco/bird/android/model/wire/WireLocation;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getAssetId", "()Ljava/lang/String;", "getCapacity", "()I", "getLocation", "()Lco/bird/android/model/wire/WireLocation;", "getName", "getNotes", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class NestSuggestionRequest {
    @JsonProperty("asset_id")
    @InterfaceC41208ft5("asset_id")
    private final String assetId;
    @JsonProperty("capacity")
    @InterfaceC41208ft5("capacity")
    private final int capacity;
    @JsonProperty("location")
    @InterfaceC41208ft5("location")
    private final WireLocation location;
    @JsonProperty("name")
    @InterfaceC41208ft5("name")
    private final String name;
    @JsonProperty("notes")
    @InterfaceC41208ft5("notes")
    private final String notes;

    public NestSuggestionRequest(WireLocation location, String str, String str2, int i, String str3) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.location = location;
        this.name = str;
        this.notes = str2;
        this.capacity = i;
        this.assetId = str3;
    }

    public static /* synthetic */ NestSuggestionRequest copy$default(NestSuggestionRequest nestSuggestionRequest, WireLocation wireLocation, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            wireLocation = nestSuggestionRequest.location;
        }
        if ((i2 & 2) != 0) {
            str = nestSuggestionRequest.name;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = nestSuggestionRequest.notes;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            i = nestSuggestionRequest.capacity;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str3 = nestSuggestionRequest.assetId;
        }
        return nestSuggestionRequest.copy(wireLocation, str4, str5, i3, str3);
    }

    public final WireLocation component1() {
        return this.location;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.notes;
    }

    public final int component4() {
        return this.capacity;
    }

    public final String component5() {
        return this.assetId;
    }

    public final NestSuggestionRequest copy(WireLocation location, String str, String str2, int i, String str3) {
        Intrinsics.checkNotNullParameter(location, "location");
        return new NestSuggestionRequest(location, str, str2, i, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NestSuggestionRequest) {
            NestSuggestionRequest nestSuggestionRequest = (NestSuggestionRequest) obj;
            return Intrinsics.areEqual(this.location, nestSuggestionRequest.location) && Intrinsics.areEqual(this.name, nestSuggestionRequest.name) && Intrinsics.areEqual(this.notes, nestSuggestionRequest.notes) && this.capacity == nestSuggestionRequest.capacity && Intrinsics.areEqual(this.assetId, nestSuggestionRequest.assetId);
        }
        return false;
    }

    public final String getAssetId() {
        return this.assetId;
    }

    public final int getCapacity() {
        return this.capacity;
    }

    public final WireLocation getLocation() {
        return this.location;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNotes() {
        return this.notes;
    }

    public int hashCode() {
        int hashCode = this.location.hashCode() * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.notes;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.capacity)) * 31;
        String str3 = this.assetId;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        WireLocation wireLocation = this.location;
        String str = this.name;
        String str2 = this.notes;
        int i = this.capacity;
        String str3 = this.assetId;
        return "NestSuggestionRequest(location=" + wireLocation + ", name=" + str + ", notes=" + str2 + ", capacity=" + i + ", assetId=" + str3 + ")";
    }
}
