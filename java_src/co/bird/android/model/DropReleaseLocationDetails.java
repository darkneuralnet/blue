package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.ReleaseLocationDetails;
import co.bird.android.model.constant.NestPurpose;
import co.bird.android.model.wire.WireDrop;
import co.bird.android.model.wire.WireLegacyNest;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.WireNestPhoto;
import co.bird.android.model.wire.configs.Config;
import com.stripe.android.model.PaymentMethod;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB'\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\fJ\t\u0010>\u001a\u00020\nHÆ\u0003J\t\u0010?\u001a\u00020\nHÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0007HÆ\u0003J1\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010C\u001a\u00020\u0018HÖ\u0001J\u0013\u0010D\u001a\u00020\u00072\b\u0010E\u001a\u0004\u0018\u00010FHÖ\u0003J\n\u0010G\u001a\u0004\u0018\u00010HH\u0016J\t\u0010I\u001a\u00020\u0018HÖ\u0001J\u0010\u0010J\u001a\u00020\u00072\u0006\u0010K\u001a\u00020LH\u0016J\t\u0010M\u001a\u00020\u0010HÖ\u0001J\u0019\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020\u0018HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u000eR\u0016\u0010!\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0012R\u0014\u0010#\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0012R\u0016\u0010%\u001a\u0004\u0018\u00010&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u000eR\u0016\u0010+\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0012R\u0016\u0010-\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0012R\u0014\u0010/\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u000eR\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00100\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0016R\u0014\u00103\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00107\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010\u000b\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u00109R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u00109R\u0014\u0010<\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u000e¨\u0006S"}, m28432d2 = {"Lco/bird/android/model/DropReleaseLocationDetails;", "Lco/bird/android/model/ReleaseLocationDetails;", "config", "Lco/bird/android/model/wire/configs/Config;", "drop", "Lco/bird/android/model/wire/WireDrop;", "active", "", "(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/wire/WireDrop;Z)V", "releaseWindowStartHour", "", "releaseWindowEndHour", "(DDLco/bird/android/model/wire/WireDrop;Z)V", "getActive", "()Z", PaymentMethod.BillingDetails.PARAM_ADDRESS, "", "getAddress", "()Ljava/lang/String;", "brandNames", "", "getBrandNames", "()Ljava/util/List;", "capacity", "", "getCapacity", "()I", "claimedBy", "getClaimedBy", "getDrop", "()Lco/bird/android/model/wire/WireDrop;", "enforceReleaseWindow", "getEnforceReleaseWindow", "hours", "getHours", "id", "getId", "location", "Lco/bird/android/model/wire/WireLocation;", "getLocation", "()Lco/bird/android/model/wire/WireLocation;", "mustClaimToRelease", "getMustClaimToRelease", "nestId", "getNestId", "notes", "getNotes", "open", "getOpen", "photos", "getPhotos", "purpose", "Lco/bird/android/model/constant/NestPurpose;", "getPurpose", "()Lco/bird/android/model/constant/NestPurpose;", "radius", "getRadius", "()D", "getReleaseWindowEndHour", "getReleaseWindowStartHour", "requireReleasePhoto", "getRequireReleasePhoto", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", LegacyRepairType.OTHER_KEY, "", "expiresAt", "Lorg/joda/time/DateTime;", "hashCode", "isClaimed", "by", "Lco/bird/android/model/User;", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nReleaseLocationDetails.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseLocationDetails.kt\nco/bird/android/model/DropReleaseLocationDetails\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,206:1\n1549#2:207\n1620#2,3:208\n*S KotlinDebug\n*F\n+ 1 ReleaseLocationDetails.kt\nco/bird/android/model/DropReleaseLocationDetails\n*L\n132#1:207\n132#1:208,3\n*E\n"})
/* loaded from: classes4.dex */
public final class DropReleaseLocationDetails implements ReleaseLocationDetails {
    public static final Parcelable.Creator<DropReleaseLocationDetails> CREATOR = new Creator();
    private final boolean active;
    private final WireDrop drop;
    private final double releaseWindowEndHour;
    private final double releaseWindowStartHour;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<DropReleaseLocationDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DropReleaseLocationDetails createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DropReleaseLocationDetails(parcel.readDouble(), parcel.readDouble(), (WireDrop) parcel.readParcelable(DropReleaseLocationDetails.class.getClassLoader()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DropReleaseLocationDetails[] newArray(int i) {
            return new DropReleaseLocationDetails[i];
        }
    }

    public DropReleaseLocationDetails(double d, double d2, WireDrop drop, boolean z) {
        Intrinsics.checkNotNullParameter(drop, "drop");
        this.releaseWindowStartHour = d;
        this.releaseWindowEndHour = d2;
        this.drop = drop;
        this.active = z;
    }

    public static /* synthetic */ DropReleaseLocationDetails copy$default(DropReleaseLocationDetails dropReleaseLocationDetails, double d, double d2, WireDrop wireDrop, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            d = dropReleaseLocationDetails.releaseWindowStartHour;
        }
        double d3 = d;
        if ((i & 2) != 0) {
            d2 = dropReleaseLocationDetails.releaseWindowEndHour;
        }
        double d4 = d2;
        if ((i & 4) != 0) {
            wireDrop = dropReleaseLocationDetails.drop;
        }
        WireDrop wireDrop2 = wireDrop;
        if ((i & 8) != 0) {
            z = dropReleaseLocationDetails.active;
        }
        return dropReleaseLocationDetails.copy(d3, d4, wireDrop2, z);
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public boolean canReleaseNow(Calendar calendar) {
        return ReleaseLocationDetails.DefaultImpls.canReleaseNow(this, calendar);
    }

    public final double component1() {
        return this.releaseWindowStartHour;
    }

    public final double component2() {
        return this.releaseWindowEndHour;
    }

    public final WireDrop component3() {
        return this.drop;
    }

    public final boolean component4() {
        return this.active;
    }

    public final DropReleaseLocationDetails copy(double d, double d2, WireDrop drop, boolean z) {
        Intrinsics.checkNotNullParameter(drop, "drop");
        return new DropReleaseLocationDetails(d, d2, drop, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DropReleaseLocationDetails) {
            DropReleaseLocationDetails dropReleaseLocationDetails = (DropReleaseLocationDetails) obj;
            return Double.compare(this.releaseWindowStartHour, dropReleaseLocationDetails.releaseWindowStartHour) == 0 && Double.compare(this.releaseWindowEndHour, dropReleaseLocationDetails.releaseWindowEndHour) == 0 && Intrinsics.areEqual(this.drop, dropReleaseLocationDetails.drop) && this.active == dropReleaseLocationDetails.active;
        }
        return false;
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public DateTime expiresAt() {
        return this.drop.getUnclaimAt();
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public boolean getActive() {
        return this.active;
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public String getAddress() {
        WireLegacyNest nest = this.drop.getNest();
        if (nest != null) {
            return nest.getAddress();
        }
        return null;
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public String getBrandNameToDisplay() {
        return ReleaseLocationDetails.DefaultImpls.getBrandNameToDisplay(this);
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public List<String> getBrandNames() {
        return this.drop.getBrandNames();
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public int getCapacity() {
        return this.drop.getQuantity();
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public String getClaimedBy() {
        return this.drop.getUserId();
    }

    public final WireDrop getDrop() {
        return this.drop;
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public boolean getEnforceReleaseWindow() {
        return this.drop.getPurpose() == NestPurpose.RIDER;
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public String getHours() {
        WireLegacyNest nest = this.drop.getNest();
        if (nest != null) {
            return nest.getFormattedHours();
        }
        return null;
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public String getId() {
        return this.drop.getId();
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public WireLocation getLocation() {
        WireLegacyNest nest = this.drop.getNest();
        if (nest != null) {
            return nest.getLocation();
        }
        return null;
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public boolean getMustClaimToRelease() {
        return false;
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public String getNestId() {
        return this.drop.getNestId();
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public String getNotes() {
        WireLegacyNest nest = this.drop.getNest();
        if (nest != null) {
            return nest.getNotes();
        }
        return null;
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public boolean getOpen() {
        return this.drop.getOpen();
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public List<String> getPhotos() {
        List<String> emptyList;
        List<WireNestPhoto> photos;
        int collectionSizeOrDefault;
        WireLegacyNest nest = this.drop.getNest();
        if (nest != null && (photos = nest.getPhotos()) != null) {
            List<WireNestPhoto> list = photos;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireNestPhoto wireNestPhoto : list) {
                arrayList.add(wireNestPhoto.getUrl());
            }
            return arrayList;
        }
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return emptyList;
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public NestPurpose getPurpose() {
        NestPurpose purpose = this.drop.getPurpose();
        return purpose == null ? NestPurpose.RIDER : purpose;
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public double getRadius() {
        WireLegacyNest nest = this.drop.getNest();
        if (nest != null) {
            return nest.getRadius();
        }
        return 9.33d;
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public double getReleaseWindowEndHour() {
        return this.releaseWindowEndHour;
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public double getReleaseWindowStartHour() {
        return this.releaseWindowStartHour;
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public boolean getRequireReleasePhoto() {
        WireLegacyNest nest = this.drop.getNest();
        if (nest != null) {
            return nest.getEnabled();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((Double.hashCode(this.releaseWindowStartHour) * 31) + Double.hashCode(this.releaseWindowEndHour)) * 31) + this.drop.hashCode()) * 31;
        boolean z = this.active;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public boolean isClaimed(User by) {
        boolean z;
        Intrinsics.checkNotNullParameter(by, "by");
        if (!Intrinsics.areEqual(getClaimedBy(), by.getId())) {
            return false;
        }
        DateTime unclaimAt = this.drop.getUnclaimAt();
        if (unclaimAt != null && !unclaimAt.isAfterNow()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        return true;
    }

    @Override // co.bird.android.model.ReleaseLocationDetails
    public Pair<Integer, Integer> releaseWindow() {
        return ReleaseLocationDetails.DefaultImpls.releaseWindow(this);
    }

    public String toString() {
        double d = this.releaseWindowStartHour;
        double d2 = this.releaseWindowEndHour;
        WireDrop wireDrop = this.drop;
        boolean z = this.active;
        return "DropReleaseLocationDetails(releaseWindowStartHour=" + d + ", releaseWindowEndHour=" + d2 + ", drop=" + wireDrop + ", active=" + z + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeDouble(this.releaseWindowStartHour);
        out.writeDouble(this.releaseWindowEndHour);
        out.writeParcelable(this.drop, i);
        out.writeInt(this.active ? 1 : 0);
    }

    public /* synthetic */ DropReleaseLocationDetails(double d, double d2, WireDrop wireDrop, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, wireDrop, (i & 8) != 0 ? true : z);
    }

    public /* synthetic */ DropReleaseLocationDetails(Config config, WireDrop wireDrop, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(config, wireDrop, (i & 4) != 0 ? true : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DropReleaseLocationDetails(Config config, WireDrop drop, boolean z) {
        this(config.getReleaseStartHour(), config.getReleaseEndHour(), drop, z);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(drop, "drop");
    }
}
