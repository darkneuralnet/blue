package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003J\t\u0010%\u001a\u00020\rHÆ\u0003Jm\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001J\u0013\u0010'\u001a\u00020\n2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0016\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013¨\u0006,"}, m28432d2 = {"Lco/bird/android/model/wire/WireSuccessfulScannedItem;", "", "id", "", "itemId", "itemDisplayName", "itemDisplayCaption", "bird", "Lco/bird/android/model/wire/WireSkuVehicle;", "received", "", "scrapReason", "createdAt", "Lorg/joda/time/DateTime;", "updatedAt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireSkuVehicle;ZLjava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "getBird", "()Lco/bird/android/model/wire/WireSkuVehicle;", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getId", "()Ljava/lang/String;", "getItemDisplayCaption", "getItemDisplayName", "getItemId", "getReceived", "()Z", "getScrapReason", "getUpdatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireSuccessfulScannedItem {
    @JsonProperty("bird")
    @InterfaceC41208ft5("bird")
    private final WireSkuVehicle bird;
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66766id;
    @JsonProperty("item_display_caption")
    @InterfaceC41208ft5("item_display_caption")
    private final String itemDisplayCaption;
    @JsonProperty("item_display_name")
    @InterfaceC41208ft5("item_display_name")
    private final String itemDisplayName;
    @JsonProperty("item_id")
    @InterfaceC41208ft5("item_id")
    private final String itemId;
    @JsonProperty("received")
    @InterfaceC41208ft5("received")
    private final boolean received;
    @JsonProperty("scrap_reason")
    @InterfaceC41208ft5("scrap_reason")
    private final String scrapReason;
    @JsonProperty("updated_at")
    @InterfaceC41208ft5("updated_at")
    private final DateTime updatedAt;

    public WireSuccessfulScannedItem() {
        this(null, null, null, null, null, false, null, null, null, 511, null);
    }

    public final String component1() {
        return this.f66766id;
    }

    public final String component2() {
        return this.itemId;
    }

    public final String component3() {
        return this.itemDisplayName;
    }

    public final String component4() {
        return this.itemDisplayCaption;
    }

    public final WireSkuVehicle component5() {
        return this.bird;
    }

    public final boolean component6() {
        return this.received;
    }

    public final String component7() {
        return this.scrapReason;
    }

    public final DateTime component8() {
        return this.createdAt;
    }

    public final DateTime component9() {
        return this.updatedAt;
    }

    public final WireSuccessfulScannedItem copy(String id, String str, String str2, String str3, WireSkuVehicle wireSkuVehicle, boolean z, String str4, DateTime createdAt, DateTime updatedAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        return new WireSuccessfulScannedItem(id, str, str2, str3, wireSkuVehicle, z, str4, createdAt, updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireSuccessfulScannedItem) {
            WireSuccessfulScannedItem wireSuccessfulScannedItem = (WireSuccessfulScannedItem) obj;
            return Intrinsics.areEqual(this.f66766id, wireSuccessfulScannedItem.f66766id) && Intrinsics.areEqual(this.itemId, wireSuccessfulScannedItem.itemId) && Intrinsics.areEqual(this.itemDisplayName, wireSuccessfulScannedItem.itemDisplayName) && Intrinsics.areEqual(this.itemDisplayCaption, wireSuccessfulScannedItem.itemDisplayCaption) && Intrinsics.areEqual(this.bird, wireSuccessfulScannedItem.bird) && this.received == wireSuccessfulScannedItem.received && Intrinsics.areEqual(this.scrapReason, wireSuccessfulScannedItem.scrapReason) && Intrinsics.areEqual(this.createdAt, wireSuccessfulScannedItem.createdAt) && Intrinsics.areEqual(this.updatedAt, wireSuccessfulScannedItem.updatedAt);
        }
        return false;
    }

    public final WireSkuVehicle getBird() {
        return this.bird;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.f66766id;
    }

    public final String getItemDisplayCaption() {
        return this.itemDisplayCaption;
    }

    public final String getItemDisplayName() {
        return this.itemDisplayName;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final boolean getReceived() {
        return this.received;
    }

    public final String getScrapReason() {
        return this.scrapReason;
    }

    public final DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f66766id.hashCode() * 31;
        String str = this.itemId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.itemDisplayName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.itemDisplayCaption;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        WireSkuVehicle wireSkuVehicle = this.bird;
        int hashCode5 = (hashCode4 + (wireSkuVehicle == null ? 0 : wireSkuVehicle.hashCode())) * 31;
        boolean z = this.received;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode5 + i) * 31;
        String str4 = this.scrapReason;
        return ((((i2 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.createdAt.hashCode()) * 31) + this.updatedAt.hashCode();
    }

    public String toString() {
        String str = this.f66766id;
        String str2 = this.itemId;
        String str3 = this.itemDisplayName;
        String str4 = this.itemDisplayCaption;
        WireSkuVehicle wireSkuVehicle = this.bird;
        boolean z = this.received;
        String str5 = this.scrapReason;
        DateTime dateTime = this.createdAt;
        DateTime dateTime2 = this.updatedAt;
        return "WireSuccessfulScannedItem(id=" + str + ", itemId=" + str2 + ", itemDisplayName=" + str3 + ", itemDisplayCaption=" + str4 + ", bird=" + wireSkuVehicle + ", received=" + z + ", scrapReason=" + str5 + ", createdAt=" + dateTime + ", updatedAt=" + dateTime2 + ")";
    }

    public WireSuccessfulScannedItem(String id, String str, String str2, String str3, WireSkuVehicle wireSkuVehicle, boolean z, String str4, DateTime createdAt, DateTime updatedAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        this.f66766id = id;
        this.itemId = str;
        this.itemDisplayName = str2;
        this.itemDisplayCaption = str3;
        this.bird = wireSkuVehicle;
        this.received = z;
        this.scrapReason = str4;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ WireSuccessfulScannedItem(String str, String str2, String str3, String str4, WireSkuVehicle wireSkuVehicle, boolean z, String str5, DateTime dateTime, DateTime dateTime2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, r4, r5, r6, r7, r3, r8, r0);
        DateTime dateTime3;
        DateTime dateTime4;
        String str6 = (i & 1) != 0 ? "" : str;
        String str7 = (i & 2) != 0 ? null : str2;
        String str8 = (i & 4) != 0 ? null : str3;
        String str9 = (i & 8) != 0 ? null : str4;
        WireSkuVehicle wireSkuVehicle2 = (i & 16) != 0 ? null : wireSkuVehicle;
        boolean z2 = (i & 32) != 0 ? false : z;
        String str10 = (i & 64) == 0 ? str5 : null;
        if ((i & 128) != 0) {
            dateTime3 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime3, "now()");
        } else {
            dateTime3 = dateTime;
        }
        if ((i & 256) != 0) {
            dateTime4 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime4, "now()");
        } else {
            dateTime4 = dateTime2;
        }
    }
}
