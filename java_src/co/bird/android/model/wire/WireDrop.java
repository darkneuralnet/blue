package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.NestPurpose;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.PaymentMethod;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b/\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÍ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001a¢\u0006\u0002\u0010\u001bJ\t\u00105\u001a\u00020\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u0010<\u001a\u00020\u0018HÆ\u0003J\u0011\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001aHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010A\u001a\u00020\tHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010C\u001a\u00020\fHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\fHÆ\u0003JÑ\u0001\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001aHÆ\u0001J\t\u0010G\u001a\u00020\tHÖ\u0001J\u0013\u0010H\u001a\u00020\u00182\b\u0010I\u001a\u0004\u0018\u00010JHÖ\u0003J\t\u0010K\u001a\u00020\tHÖ\u0001J\t\u0010L\u001a\u00020\u0003HÖ\u0001J\u0019\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020\tHÖ\u0001R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0016\u0010\u0017\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010&R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010!R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010!R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001d¨\u0006R"}, m28432d2 = {"Lco/bird/android/model/wire/WireDrop;", "Landroid/os/Parcelable;", "id", "", "userId", "nestId", "releaseLocation", "Lco/bird/android/model/wire/WireLocation;", "quantity", "", "photoUrl", "createdAt", "Lorg/joda/time/DateTime;", "releasedAt", "expireAt", "claimedAt", "unclaimAt", "nest", "Lco/bird/android/model/wire/WireLegacyNest;", "location", PaymentMethod.BillingDetails.PARAM_ADDRESS, "purpose", "Lco/bird/android/model/constant/NestPurpose;", "open", "", "brandNames", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;ILjava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lco/bird/android/model/wire/WireLegacyNest;Lco/bird/android/model/wire/WireLocation;Ljava/lang/String;Lco/bird/android/model/constant/NestPurpose;ZLjava/util/List;)V", "getAddress", "()Ljava/lang/String;", "getBrandNames", "()Ljava/util/List;", "getClaimedAt", "()Lorg/joda/time/DateTime;", "getCreatedAt", "getExpireAt", "getId", "getLocation", "()Lco/bird/android/model/wire/WireLocation;", "getNest", "()Lco/bird/android/model/wire/WireLegacyNest;", "getNestId", "getOpen", "()Z", "getPhotoUrl", "getPurpose", "()Lco/bird/android/model/constant/NestPurpose;", "getQuantity", "()I", "getReleaseLocation", "getReleasedAt", "getUnclaimAt", "getUserId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireDrop implements Parcelable {
    public static final Parcelable.Creator<WireDrop> CREATOR = new Creator();
    @JsonProperty(PaymentMethod.BillingDetails.PARAM_ADDRESS)
    @InterfaceC41208ft5(PaymentMethod.BillingDetails.PARAM_ADDRESS)
    private final String address;
    @JsonProperty("brand_names")
    @InterfaceC41208ft5("brand_names")
    private final List<String> brandNames;
    @JsonProperty("claimed_at")
    @InterfaceC41208ft5("claimed_at")
    private final DateTime claimedAt;
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("expire_at")
    @InterfaceC41208ft5("expire_at")
    private final DateTime expireAt;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66724id;
    @JsonProperty("location")
    @InterfaceC41208ft5("location")
    private final WireLocation location;
    @JsonProperty("nest")
    @InterfaceC41208ft5("nest")
    private final WireLegacyNest nest;
    @JsonProperty("nest_id")
    @InterfaceC41208ft5("nest_id")
    private final String nestId;
    @JsonProperty("open")
    @InterfaceC41208ft5("open")
    private final boolean open;
    @JsonProperty("photo_url")
    @InterfaceC41208ft5("photo_url")
    private final String photoUrl;
    @JsonProperty("purpose")
    @InterfaceC41208ft5("purpose")
    private final NestPurpose purpose;
    @JsonProperty("quantity")
    @InterfaceC41208ft5("quantity")
    private final int quantity;
    @JsonProperty("release_location")
    @InterfaceC41208ft5("release_location")
    private final WireLocation releaseLocation;
    @JsonProperty("released_at")
    @InterfaceC41208ft5("released_at")
    private final DateTime releasedAt;
    @JsonProperty("unclaim_at")
    @InterfaceC41208ft5("unclaim_at")
    private final DateTime unclaimAt;
    @JsonProperty("user_id")
    @InterfaceC41208ft5("user_id")
    private final String userId;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireDrop> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireDrop createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WireDrop(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : WireLocation.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), parcel.readInt() == 0 ? null : WireLegacyNest.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : WireLocation.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : NestPurpose.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireDrop[] newArray(int i) {
            return new WireDrop[i];
        }
    }

    public WireDrop() {
        this(null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, false, null, 131071, null);
    }

    public final String component1() {
        return this.f66724id;
    }

    public final DateTime component10() {
        return this.claimedAt;
    }

    public final DateTime component11() {
        return this.unclaimAt;
    }

    public final WireLegacyNest component12() {
        return this.nest;
    }

    public final WireLocation component13() {
        return this.location;
    }

    public final String component14() {
        return this.address;
    }

    public final NestPurpose component15() {
        return this.purpose;
    }

    public final boolean component16() {
        return this.open;
    }

    public final List<String> component17() {
        return this.brandNames;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.nestId;
    }

    public final WireLocation component4() {
        return this.releaseLocation;
    }

    public final int component5() {
        return this.quantity;
    }

    public final String component6() {
        return this.photoUrl;
    }

    public final DateTime component7() {
        return this.createdAt;
    }

    public final DateTime component8() {
        return this.releasedAt;
    }

    public final DateTime component9() {
        return this.expireAt;
    }

    public final WireDrop copy(String id, String str, String nestId, WireLocation wireLocation, int i, String str2, DateTime createdAt, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, WireLegacyNest wireLegacyNest, WireLocation wireLocation2, String str3, NestPurpose nestPurpose, boolean z, List<String> list) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(nestId, "nestId");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new WireDrop(id, str, nestId, wireLocation, i, str2, createdAt, dateTime, dateTime2, dateTime3, dateTime4, wireLegacyNest, wireLocation2, str3, nestPurpose, z, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireDrop) {
            WireDrop wireDrop = (WireDrop) obj;
            return Intrinsics.areEqual(this.f66724id, wireDrop.f66724id) && Intrinsics.areEqual(this.userId, wireDrop.userId) && Intrinsics.areEqual(this.nestId, wireDrop.nestId) && Intrinsics.areEqual(this.releaseLocation, wireDrop.releaseLocation) && this.quantity == wireDrop.quantity && Intrinsics.areEqual(this.photoUrl, wireDrop.photoUrl) && Intrinsics.areEqual(this.createdAt, wireDrop.createdAt) && Intrinsics.areEqual(this.releasedAt, wireDrop.releasedAt) && Intrinsics.areEqual(this.expireAt, wireDrop.expireAt) && Intrinsics.areEqual(this.claimedAt, wireDrop.claimedAt) && Intrinsics.areEqual(this.unclaimAt, wireDrop.unclaimAt) && Intrinsics.areEqual(this.nest, wireDrop.nest) && Intrinsics.areEqual(this.location, wireDrop.location) && Intrinsics.areEqual(this.address, wireDrop.address) && this.purpose == wireDrop.purpose && this.open == wireDrop.open && Intrinsics.areEqual(this.brandNames, wireDrop.brandNames);
        }
        return false;
    }

    public final String getAddress() {
        return this.address;
    }

    public final List<String> getBrandNames() {
        return this.brandNames;
    }

    public final DateTime getClaimedAt() {
        return this.claimedAt;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final DateTime getExpireAt() {
        return this.expireAt;
    }

    public final String getId() {
        return this.f66724id;
    }

    public final WireLocation getLocation() {
        return this.location;
    }

    public final WireLegacyNest getNest() {
        return this.nest;
    }

    public final String getNestId() {
        return this.nestId;
    }

    public final boolean getOpen() {
        return this.open;
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final NestPurpose getPurpose() {
        return this.purpose;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final WireLocation getReleaseLocation() {
        return this.releaseLocation;
    }

    public final DateTime getReleasedAt() {
        return this.releasedAt;
    }

    public final DateTime getUnclaimAt() {
        return this.unclaimAt;
    }

    public final String getUserId() {
        return this.userId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f66724id.hashCode() * 31;
        String str = this.userId;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.nestId.hashCode()) * 31;
        WireLocation wireLocation = this.releaseLocation;
        int hashCode3 = (((hashCode2 + (wireLocation == null ? 0 : wireLocation.hashCode())) * 31) + Integer.hashCode(this.quantity)) * 31;
        String str2 = this.photoUrl;
        int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.createdAt.hashCode()) * 31;
        DateTime dateTime = this.releasedAt;
        int hashCode5 = (hashCode4 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.expireAt;
        int hashCode6 = (hashCode5 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        DateTime dateTime3 = this.claimedAt;
        int hashCode7 = (hashCode6 + (dateTime3 == null ? 0 : dateTime3.hashCode())) * 31;
        DateTime dateTime4 = this.unclaimAt;
        int hashCode8 = (hashCode7 + (dateTime4 == null ? 0 : dateTime4.hashCode())) * 31;
        WireLegacyNest wireLegacyNest = this.nest;
        int hashCode9 = (hashCode8 + (wireLegacyNest == null ? 0 : wireLegacyNest.hashCode())) * 31;
        WireLocation wireLocation2 = this.location;
        int hashCode10 = (hashCode9 + (wireLocation2 == null ? 0 : wireLocation2.hashCode())) * 31;
        String str3 = this.address;
        int hashCode11 = (hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        NestPurpose nestPurpose = this.purpose;
        int hashCode12 = (hashCode11 + (nestPurpose == null ? 0 : nestPurpose.hashCode())) * 31;
        boolean z = this.open;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode12 + i) * 31;
        List<String> list = this.brandNames;
        return i2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66724id;
        String str2 = this.userId;
        String str3 = this.nestId;
        WireLocation wireLocation = this.releaseLocation;
        int i = this.quantity;
        String str4 = this.photoUrl;
        DateTime dateTime = this.createdAt;
        DateTime dateTime2 = this.releasedAt;
        DateTime dateTime3 = this.expireAt;
        DateTime dateTime4 = this.claimedAt;
        DateTime dateTime5 = this.unclaimAt;
        WireLegacyNest wireLegacyNest = this.nest;
        WireLocation wireLocation2 = this.location;
        String str5 = this.address;
        NestPurpose nestPurpose = this.purpose;
        boolean z = this.open;
        List<String> list = this.brandNames;
        return "WireDrop(id=" + str + ", userId=" + str2 + ", nestId=" + str3 + ", releaseLocation=" + wireLocation + ", quantity=" + i + ", photoUrl=" + str4 + ", createdAt=" + dateTime + ", releasedAt=" + dateTime2 + ", expireAt=" + dateTime3 + ", claimedAt=" + dateTime4 + ", unclaimAt=" + dateTime5 + ", nest=" + wireLegacyNest + ", location=" + wireLocation2 + ", address=" + str5 + ", purpose=" + nestPurpose + ", open=" + z + ", brandNames=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66724id);
        out.writeString(this.userId);
        out.writeString(this.nestId);
        WireLocation wireLocation = this.releaseLocation;
        if (wireLocation == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            wireLocation.writeToParcel(out, i);
        }
        out.writeInt(this.quantity);
        out.writeString(this.photoUrl);
        out.writeSerializable(this.createdAt);
        out.writeSerializable(this.releasedAt);
        out.writeSerializable(this.expireAt);
        out.writeSerializable(this.claimedAt);
        out.writeSerializable(this.unclaimAt);
        WireLegacyNest wireLegacyNest = this.nest;
        if (wireLegacyNest == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            wireLegacyNest.writeToParcel(out, i);
        }
        WireLocation wireLocation2 = this.location;
        if (wireLocation2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            wireLocation2.writeToParcel(out, i);
        }
        out.writeString(this.address);
        NestPurpose nestPurpose = this.purpose;
        if (nestPurpose == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(nestPurpose.name());
        }
        out.writeInt(this.open ? 1 : 0);
        out.writeStringList(this.brandNames);
    }

    public WireDrop(String id, String str, String nestId, WireLocation wireLocation, int i, String str2, DateTime createdAt, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, WireLegacyNest wireLegacyNest, WireLocation wireLocation2, String str3, NestPurpose nestPurpose, boolean z, List<String> list) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(nestId, "nestId");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.f66724id = id;
        this.userId = str;
        this.nestId = nestId;
        this.releaseLocation = wireLocation;
        this.quantity = i;
        this.photoUrl = str2;
        this.createdAt = createdAt;
        this.releasedAt = dateTime;
        this.expireAt = dateTime2;
        this.claimedAt = dateTime3;
        this.unclaimAt = dateTime4;
        this.nest = wireLegacyNest;
        this.location = wireLocation2;
        this.address = str3;
        this.purpose = nestPurpose;
        this.open = z;
        this.brandNames = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ WireDrop(String str, String str2, String str3, WireLocation wireLocation, int i, String str4, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, DateTime dateTime5, WireLegacyNest wireLegacyNest, WireLocation wireLocation2, String str5, NestPurpose nestPurpose, boolean z, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r3, r2, r5, r6, r7, r8, (i2 & 128) != 0 ? null : dateTime2, (i2 & 256) != 0 ? null : dateTime3, (i2 & 512) != 0 ? null : dateTime4, (i2 & 1024) != 0 ? null : dateTime5, (i2 & 2048) != 0 ? null : wireLegacyNest, (i2 & 4096) != 0 ? null : wireLocation2, (i2 & 8192) != 0 ? null : str5, (i2 & 16384) != 0 ? null : nestPurpose, (i2 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? true : z, (i2 & 65536) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
        DateTime dateTime6;
        String str6 = (i2 & 1) != 0 ? "" : str;
        String str7 = (i2 & 2) != 0 ? null : str2;
        String str8 = (i2 & 4) == 0 ? str3 : "";
        WireLocation wireLocation3 = (i2 & 8) != 0 ? null : wireLocation;
        int i3 = (i2 & 16) != 0 ? 3 : i;
        String str9 = (i2 & 32) != 0 ? null : str4;
        if ((i2 & 64) != 0) {
            dateTime6 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime6, "now()");
        } else {
            dateTime6 = dateTime;
        }
    }
}
