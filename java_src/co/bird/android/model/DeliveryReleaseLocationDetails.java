package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.ReleaseLocationDetails;
import co.bird.android.model.constant.NestPurpose;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.configs.DeliveryConfig;
import com.stripe.android.model.PaymentMethod;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010B\u001a\u00020\tHÆ\u0003J\t\u0010C\u001a\u00020\u000bHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010E\u001a\u00020\tHÆ\u0003J\u0011\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000fHÆ\u0003Je\u0010G\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\t2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000fHÆ\u0001J\t\u0010H\u001a\u00020\u001cHÖ\u0001J\u0013\u0010I\u001a\u00020\t2\b\u0010J\u001a\u0004\u0018\u00010KHÖ\u0003J\n\u0010L\u001a\u0004\u0018\u00010MH\u0016J\t\u0010N\u001a\u00020\u001cHÖ\u0001J\t\u0010O\u001a\u00020\u0007HÖ\u0001J\u0019\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020\u001cHÖ\u0001R\u001a\u0010\u0011\u001a\u00020\tX\u0096D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0015R\u0016\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0014\u0010'\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0018R\u0016\u0010)\u001a\u0004\u0018\u00010*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0015R\u0016\u0010.\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0018R\u0014\u0010\r\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0015R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u001aR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0014\u00105\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u00109\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00108R\u0014\u0010;\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u00108R\u0014\u0010=\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u0015¨\u0006U"}, m28432d2 = {"Lco/bird/android/model/DeliveryReleaseLocationDetails;", "Lco/bird/android/model/ReleaseLocationDetails;", "config", "Lco/bird/android/model/wire/configs/DeliveryConfig;", "delivery", "Lco/bird/android/model/Delivery;", "claimedBy", "", "mustClaimToRelease", "", "purpose", "Lco/bird/android/model/constant/NestPurpose;", "hours", "open", "brandNames", "", "(Lco/bird/android/model/wire/configs/DeliveryConfig;Lco/bird/android/model/Delivery;Ljava/lang/String;ZLco/bird/android/model/constant/NestPurpose;Ljava/lang/String;ZLjava/util/List;)V", "active", "getActive$annotations", "()V", "getActive", "()Z", PaymentMethod.BillingDetails.PARAM_ADDRESS, "getAddress", "()Ljava/lang/String;", "getBrandNames", "()Ljava/util/List;", "capacity", "", "getCapacity", "()I", "getClaimedBy", "getConfig", "()Lco/bird/android/model/wire/configs/DeliveryConfig;", "getDelivery", "()Lco/bird/android/model/Delivery;", "enforceReleaseWindow", "getEnforceReleaseWindow", "getHours", "id", "getId", "location", "Lco/bird/android/model/wire/WireLocation;", "getLocation", "()Lco/bird/android/model/wire/WireLocation;", "getMustClaimToRelease", "notes", "getNotes", "getOpen", "photos", "getPhotos", "getPurpose", "()Lco/bird/android/model/constant/NestPurpose;", "radius", "", "getRadius", "()D", "releaseWindowEndHour", "getReleaseWindowEndHour", "releaseWindowStartHour", "getReleaseWindowStartHour", "requireReleasePhoto", "getRequireReleasePhoto", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", LegacyRepairType.OTHER_KEY, "", "expiresAt", "Lorg/joda/time/DateTime;", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class DeliveryReleaseLocationDetails implements ReleaseLocationDetails {
    public static final Parcelable.Creator<DeliveryReleaseLocationDetails> CREATOR = new Creator();
    private final boolean active;
    private final List<String> brandNames;
    private final String claimedBy;
    private final DeliveryConfig config;
    private final Delivery delivery;
    private final String hours;
    private final boolean mustClaimToRelease;
    private final boolean open;
    private final NestPurpose purpose;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<DeliveryReleaseLocationDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeliveryReleaseLocationDetails createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeliveryReleaseLocationDetails((DeliveryConfig) parcel.readParcelable(DeliveryReleaseLocationDetails.class.getClassLoader()), Delivery.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, NestPurpose.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeliveryReleaseLocationDetails[] newArray(int i) {
            return new DeliveryReleaseLocationDetails[i];
        }
    }

    public DeliveryReleaseLocationDetails(DeliveryConfig config, Delivery delivery, String str, boolean z, NestPurpose purpose, String str2, boolean z2, List<String> list) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(delivery, "delivery");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        this.config = config;
        this.delivery = delivery;
        this.claimedBy = str;
        this.mustClaimToRelease = z;
        this.purpose = purpose;
        this.hours = str2;
        this.open = z2;
        this.brandNames = list;
        this.active = true;
    }

    public static /* synthetic */ void getActive$annotations() {
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public boolean canReleaseNow(Calendar calendar) {
        return ReleaseLocationDetails.DefaultImpls.canReleaseNow(this, calendar);
    }

    public final DeliveryConfig component1() {
        return this.config;
    }

    public final Delivery component2() {
        return this.delivery;
    }

    public final String component3() {
        return this.claimedBy;
    }

    public final boolean component4() {
        return this.mustClaimToRelease;
    }

    public final NestPurpose component5() {
        return this.purpose;
    }

    public final String component6() {
        return this.hours;
    }

    public final boolean component7() {
        return this.open;
    }

    public final List<String> component8() {
        return this.brandNames;
    }

    public final DeliveryReleaseLocationDetails copy(DeliveryConfig config, Delivery delivery, String str, boolean z, NestPurpose purpose, String str2, boolean z2, List<String> list) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(delivery, "delivery");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        return new DeliveryReleaseLocationDetails(config, delivery, str, z, purpose, str2, z2, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeliveryReleaseLocationDetails) {
            DeliveryReleaseLocationDetails deliveryReleaseLocationDetails = (DeliveryReleaseLocationDetails) obj;
            return Intrinsics.areEqual(this.config, deliveryReleaseLocationDetails.config) && Intrinsics.areEqual(this.delivery, deliveryReleaseLocationDetails.delivery) && Intrinsics.areEqual(this.claimedBy, deliveryReleaseLocationDetails.claimedBy) && this.mustClaimToRelease == deliveryReleaseLocationDetails.mustClaimToRelease && this.purpose == deliveryReleaseLocationDetails.purpose && Intrinsics.areEqual(this.hours, deliveryReleaseLocationDetails.hours) && this.open == deliveryReleaseLocationDetails.open && Intrinsics.areEqual(this.brandNames, deliveryReleaseLocationDetails.brandNames);
        }
        return false;
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public DateTime expiresAt() {
        return this.delivery.getDropAt();
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public boolean getActive() {
        return this.active;
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public String getAddress() {
        return this.delivery.getAddress();
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public String getBrandNameToDisplay() {
        return ReleaseLocationDetails.DefaultImpls.getBrandNameToDisplay(this);
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public List<String> getBrandNames() {
        return this.brandNames;
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public int getCapacity() {
        return 1;
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public String getClaimedBy() {
        return this.claimedBy;
    }

    public final DeliveryConfig getConfig() {
        return this.config;
    }

    public final Delivery getDelivery() {
        return this.delivery;
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public boolean getEnforceReleaseWindow() {
        return false;
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public String getHours() {
        return this.hours;
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public String getId() {
        return this.delivery.getId();
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public WireLocation getLocation() {
        return this.delivery.getLocation();
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public boolean getMustClaimToRelease() {
        return this.mustClaimToRelease;
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public String getNestId() {
        return ReleaseLocationDetails.DefaultImpls.getNestId(this);
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public String getNotes() {
        return this.delivery.getNotes();
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public boolean getOpen() {
        return this.open;
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public List<String> getPhotos() {
        List<String> listOfNotNull;
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(this.delivery.getPhotoUrl());
        return listOfNotNull;
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public NestPurpose getPurpose() {
        return this.purpose;
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public double getRadius() {
        return this.config.getReleaseRadius();
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public double getReleaseWindowEndHour() {
        return this.config.getReleaseWindowEndHour();
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public double getReleaseWindowStartHour() {
        return this.config.getReleaseWindowStartHour();
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public boolean getRequireReleasePhoto() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.config.hashCode() * 31) + this.delivery.hashCode()) * 31;
        String str = this.claimedBy;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.mustClaimToRelease;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode3 = (((hashCode2 + i) * 31) + this.purpose.hashCode()) * 31;
        String str2 = this.hours;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z2 = this.open;
        int i2 = (hashCode4 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        List<String> list = this.brandNames;
        return i2 + (list != null ? list.hashCode() : 0);
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public boolean isClaimed(User user) {
        return ReleaseLocationDetails.DefaultImpls.isClaimed(this, user);
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public Pair<Integer, Integer> releaseWindow() {
        return ReleaseLocationDetails.DefaultImpls.releaseWindow(this);
    }

    public String toString() {
        DeliveryConfig deliveryConfig = this.config;
        Delivery delivery = this.delivery;
        String str = this.claimedBy;
        boolean z = this.mustClaimToRelease;
        NestPurpose nestPurpose = this.purpose;
        String str2 = this.hours;
        boolean z2 = this.open;
        List<String> list = this.brandNames;
        return "DeliveryReleaseLocationDetails(config=" + deliveryConfig + ", delivery=" + delivery + ", claimedBy=" + str + ", mustClaimToRelease=" + z + ", purpose=" + nestPurpose + ", hours=" + str2 + ", open=" + z2 + ", brandNames=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeParcelable(this.config, i);
        this.delivery.writeToParcel(out, i);
        out.writeString(this.claimedBy);
        out.writeInt(this.mustClaimToRelease ? 1 : 0);
        out.writeString(this.purpose.name());
        out.writeString(this.hours);
        out.writeInt(this.open ? 1 : 0);
        out.writeStringList(this.brandNames);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ DeliveryReleaseLocationDetails(DeliveryConfig deliveryConfig, Delivery delivery, String str, boolean z, NestPurpose nestPurpose, String str2, boolean z2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(deliveryConfig, delivery, r6, r7, r8, r9, r10, r11);
        List list2;
        List emptyList;
        String str3 = (i & 4) != 0 ? null : str;
        boolean z3 = (i & 8) != 0 ? false : z;
        NestPurpose nestPurpose2 = (i & 16) != 0 ? NestPurpose.DELIVERY : nestPurpose;
        String str4 = (i & 32) != 0 ? null : str2;
        boolean z4 = (i & 64) != 0 ? true : z2;
        if ((i & 128) != 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            list2 = emptyList;
        } else {
            list2 = list;
        }
    }
}
