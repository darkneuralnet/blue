package co.bird.android.model;

import co.bird.android.model.wire.WireArPolygon;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.WireNestPhoto;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.PaymentMethod;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b*\b\u0086\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010\u0018J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010-J\u0010\u00102\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00106\u001a\u00020\nHÆ\u0003J\t\u00107\u001a\u00020\fHÆ\u0003J\t\u00108\u001a\u00020\u000eHÆ\u0003J\u0011\u00109\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0006HÆ\u0003J\t\u0010:\u001a\u00020\u0012HÆ\u0003J\u009e\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020\u00152\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020\u0017HÖ\u0001J\b\u0010@\u001a\u00020\u0003H\u0016R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-¨\u0006A"}, m28432d2 = {"Lco/bird/android/model/ParkingNest;", "", "id", "", "name", "photos", "", "Lco/bird/android/model/wire/WireNestPhoto;", "notes", "location", "Lco/bird/android/model/wire/WireLocation;", "radius", "", "shape", "Lco/bird/android/model/Polygon;", "arPolygons", "Lco/bird/android/model/wire/WireArPolygon;", "parkingIncentiveValue", "", PaymentMethod.BillingDetails.PARAM_ADDRESS, "showsInventoryToRiders", "", "availableParkingCapacity", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;DLco/bird/android/model/Polygon;Ljava/util/List;JLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getAddress", "()Ljava/lang/String;", "getArPolygons", "()Ljava/util/List;", "getAvailableParkingCapacity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getId", "getLocation", "()Lco/bird/android/model/wire/WireLocation;", "getName", "getNotes", "getParkingIncentiveValue", "()J", "getPhotos", "getRadius", "()D", "getShape", "()Lco/bird/android/model/Polygon;", "getShowsInventoryToRiders", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;DLco/bird/android/model/Polygon;Ljava/util/List;JLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)Lco/bird/android/model/ParkingNest;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ParkingNest {
    @JsonProperty(PaymentMethod.BillingDetails.PARAM_ADDRESS)
    @InterfaceC41208ft5(PaymentMethod.BillingDetails.PARAM_ADDRESS)
    private final String address;
    @JsonProperty("ar_polygons")
    @InterfaceC41208ft5("ar_polygons")
    private final List<WireArPolygon> arPolygons;
    @JsonProperty("available_parking_capacity")
    @InterfaceC41208ft5("available_parking_capacity")
    private final Integer availableParkingCapacity;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66609id;
    @JsonProperty("location")
    @InterfaceC41208ft5("location")
    private final WireLocation location;
    @JsonProperty("name")
    @InterfaceC41208ft5("name")
    private final String name;
    @JsonProperty("notes")
    @InterfaceC41208ft5("notes")
    private final String notes;
    @JsonProperty("parking_incentive_value")
    @InterfaceC41208ft5("parking_incentive_value")
    private final long parkingIncentiveValue;
    @JsonProperty("photos")
    @InterfaceC41208ft5("photos")
    private final List<WireNestPhoto> photos;
    @JsonProperty("radius")
    @InterfaceC41208ft5("radius")
    private final double radius;
    @JsonProperty("shape")
    @InterfaceC41208ft5("shape")
    private final Polygon shape;
    @JsonProperty("shows_inventory_to_riders")
    @InterfaceC41208ft5("shows_inventory_to_riders")
    private final Boolean showsInventoryToRiders;

    public ParkingNest() {
        this(null, null, null, null, null, 0.0d, null, null, 0L, null, null, null, 4095, null);
    }

    public final String component1() {
        return this.f66609id;
    }

    public final String component10() {
        return this.address;
    }

    public final Boolean component11() {
        return this.showsInventoryToRiders;
    }

    public final Integer component12() {
        return this.availableParkingCapacity;
    }

    public final String component2() {
        return this.name;
    }

    public final List<WireNestPhoto> component3() {
        return this.photos;
    }

    public final String component4() {
        return this.notes;
    }

    public final WireLocation component5() {
        return this.location;
    }

    public final double component6() {
        return this.radius;
    }

    public final Polygon component7() {
        return this.shape;
    }

    public final List<WireArPolygon> component8() {
        return this.arPolygons;
    }

    public final long component9() {
        return this.parkingIncentiveValue;
    }

    public final ParkingNest copy(String id, String str, List<WireNestPhoto> photos, String str2, WireLocation location, double d, Polygon shape, List<WireArPolygon> list, long j, String str3, Boolean bool, Integer num) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(photos, "photos");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return new ParkingNest(id, str, photos, str2, location, d, shape, list, j, str3, bool, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ParkingNest) {
            ParkingNest parkingNest = (ParkingNest) obj;
            return Intrinsics.areEqual(this.f66609id, parkingNest.f66609id) && Intrinsics.areEqual(this.name, parkingNest.name) && Intrinsics.areEqual(this.photos, parkingNest.photos) && Intrinsics.areEqual(this.notes, parkingNest.notes) && Intrinsics.areEqual(this.location, parkingNest.location) && Double.compare(this.radius, parkingNest.radius) == 0 && Intrinsics.areEqual(this.shape, parkingNest.shape) && Intrinsics.areEqual(this.arPolygons, parkingNest.arPolygons) && this.parkingIncentiveValue == parkingNest.parkingIncentiveValue && Intrinsics.areEqual(this.address, parkingNest.address) && Intrinsics.areEqual(this.showsInventoryToRiders, parkingNest.showsInventoryToRiders) && Intrinsics.areEqual(this.availableParkingCapacity, parkingNest.availableParkingCapacity);
        }
        return false;
    }

    public final String getAddress() {
        return this.address;
    }

    public final List<WireArPolygon> getArPolygons() {
        return this.arPolygons;
    }

    public final Integer getAvailableParkingCapacity() {
        return this.availableParkingCapacity;
    }

    public final String getId() {
        return this.f66609id;
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

    public final long getParkingIncentiveValue() {
        return this.parkingIncentiveValue;
    }

    public final List<WireNestPhoto> getPhotos() {
        return this.photos;
    }

    public final double getRadius() {
        return this.radius;
    }

    public final Polygon getShape() {
        return this.shape;
    }

    public final Boolean getShowsInventoryToRiders() {
        return this.showsInventoryToRiders;
    }

    public int hashCode() {
        int hashCode = this.f66609id.hashCode() * 31;
        String str = this.name;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.photos.hashCode()) * 31;
        String str2 = this.notes;
        int hashCode3 = (((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.location.hashCode()) * 31) + Double.hashCode(this.radius)) * 31) + this.shape.hashCode()) * 31;
        List<WireArPolygon> list = this.arPolygons;
        int hashCode4 = (((hashCode3 + (list == null ? 0 : list.hashCode())) * 31) + Long.hashCode(this.parkingIncentiveValue)) * 31;
        String str3 = this.address;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.showsInventoryToRiders;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.availableParkingCapacity;
        return hashCode6 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66609id;
        String str2 = this.name;
        WireLocation wireLocation = this.location;
        double d = this.radius;
        boolean z = this.shape.numPoints() > 0;
        return "ParkingNest(id=" + str + ", name=" + str2 + ", location=" + wireLocation + ", radius=" + d + ", hasPolygon=" + z + ")";
    }

    public ParkingNest(String id, String str, List<WireNestPhoto> photos, String str2, WireLocation location, double d, Polygon shape, List<WireArPolygon> list, long j, String str3, Boolean bool, Integer num) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(photos, "photos");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.f66609id = id;
        this.name = str;
        this.photos = photos;
        this.notes = str2;
        this.location = location;
        this.radius = d;
        this.shape = shape;
        this.arPolygons = list;
        this.parkingIncentiveValue = j;
        this.address = str3;
        this.showsInventoryToRiders = bool;
        this.availableParkingCapacity = num;
    }

    public /* synthetic */ ParkingNest(String str, String str2, List list, String str3, WireLocation wireLocation, double d, Polygon polygon, List list2, long j, String str4, Boolean bool, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? new WireLocation(0.0d, 0.0d, null, null, null, null, false, null, null, 511, null) : wireLocation, (i & 32) != 0 ? 30.0d : d, (i & 64) != 0 ? new Polygon() : polygon, (i & 128) != 0 ? null : list2, (i & 256) != 0 ? 0L : j, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? null : bool, (i & 2048) == 0 ? num : null);
    }
}
