package co.bird.android.model.itemlease;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.AssetTaskKt;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.itemlease.p022enum.ItemLeaseType;
import co.bird.android.model.wire.WireBird;
import com.stripe.android.model.Source;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B½\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a¢\u0006\u0002\u0010\u001bJ\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0010HÆ\u0003J\t\u00109\u001a\u00020\u0010HÆ\u0003J\t\u0010:\u001a\u00020\u0010HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015HÆ\u0003J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015HÆ\u0003J\t\u0010>\u001a\u00020\u001aHÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0006HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010C\u001a\u00020\nHÆ\u0003J\t\u0010D\u001a\u00020\nHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\nHÆ\u0003JÉ\u0001\u0010G\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u001aHÆ\u0001J\t\u0010H\u001a\u00020\u0010HÖ\u0001J\u0013\u0010I\u001a\u00020*2\b\u0010J\u001a\u0004\u0018\u00010KHÖ\u0003J\t\u0010L\u001a\u00020\u0010HÖ\u0001J\u0016\u0010M\u001a\u00020*2\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020\u0006J\u0016\u0010Q\u001a\u00020*2\u0006\u0010R\u001a\u00020\u00032\u0006\u0010P\u001a\u00020\u0006J\t\u0010S\u001a\u00020\u0003HÖ\u0001J\u0019\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0012\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0013\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0011\u0010)\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b)\u0010+R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b2\u0010$R\u0013\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\"R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\"R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001d¨\u0006Y"}, m28432d2 = {"Lco/bird/android/model/itemlease/ItemLease;", "Landroid/os/Parcelable;", "id", "", "principalId", "leaseType", "Lco/bird/android/model/itemlease/enum/ItemLeaseType;", "leasedItemId", "associatedItemId", "startedAt", "Lorg/joda/time/DateTime;", "dueAt", "returnedAt", "finalizedAt", "currency", "initialChargeAmount", "", "returnRefundAmount", "delinquentFeeAmount", "delinquencySettledAt", "validations", "", "Lco/bird/android/model/itemlease/ItemLeaseValidation;", AssetTaskKt.ASSET_PATH, "Lco/bird/android/model/itemlease/ItemLeaseAsset;", "metadata", "Lco/bird/android/model/itemlease/ItemLeaseMetadata;", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/itemlease/enum/ItemLeaseType;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;IIILorg/joda/time/DateTime;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/itemlease/ItemLeaseMetadata;)V", "getAssets", "()Ljava/util/List;", "getAssociatedItemId", "()Ljava/lang/String;", "getCurrency", "getDelinquencySettledAt", "()Lorg/joda/time/DateTime;", "getDelinquentFeeAmount", "()I", "getDueAt", "getFinalizedAt", "getId", "getInitialChargeAmount", "isActive", "", "()Z", "getLeaseType", "()Lco/bird/android/model/itemlease/enum/ItemLeaseType;", "getLeasedItemId", "getMetadata", "()Lco/bird/android/model/itemlease/ItemLeaseMetadata;", "getPrincipalId", "getReturnRefundAmount", "getReturnedAt", "getStartedAt", "getValidations", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "isLeaseForBird", "bird", "Lco/bird/android/model/wire/WireBird;", "type", "isLeaseForBirdId", "birdId", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ItemLease implements Parcelable {
    public static final Parcelable.Creator<ItemLease> CREATOR = new Creator();
    private final List<ItemLeaseAsset> assets;
    private final String associatedItemId;
    private final String currency;
    private final DateTime delinquencySettledAt;
    private final int delinquentFeeAmount;
    private final DateTime dueAt;
    private final DateTime finalizedAt;

    /* renamed from: id */
    private final String f66659id;
    private final int initialChargeAmount;
    private final ItemLeaseType leaseType;
    private final String leasedItemId;
    private final ItemLeaseMetadata metadata;
    private final String principalId;
    private final int returnRefundAmount;
    private final DateTime returnedAt;
    private final DateTime startedAt;
    private final List<ItemLeaseValidation> validations;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<ItemLease> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ItemLease createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ItemLeaseType createFromParcel = ItemLeaseType.CREATOR.createFromParcel(parcel);
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            DateTime dateTime = (DateTime) parcel.readSerializable();
            DateTime dateTime2 = (DateTime) parcel.readSerializable();
            DateTime dateTime3 = (DateTime) parcel.readSerializable();
            DateTime dateTime4 = (DateTime) parcel.readSerializable();
            String readString5 = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            DateTime dateTime5 = (DateTime) parcel.readSerializable();
            int readInt4 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt4);
            int i = 0;
            while (i != readInt4) {
                arrayList.add(ItemLeaseValidation.CREATOR.createFromParcel(parcel));
                i++;
                readInt4 = readInt4;
            }
            int readInt5 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt5);
            int i2 = 0;
            while (i2 != readInt5) {
                arrayList2.add(ItemLeaseAsset.CREATOR.createFromParcel(parcel));
                i2++;
                readInt5 = readInt5;
            }
            return new ItemLease(readString, readString2, createFromParcel, readString3, readString4, dateTime, dateTime2, dateTime3, dateTime4, readString5, readInt, readInt2, readInt3, dateTime5, arrayList, arrayList2, ItemLeaseMetadata.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ItemLease[] newArray(int i) {
            return new ItemLease[i];
        }
    }

    public ItemLease(String id, String principalId, ItemLeaseType leaseType, String str, String str2, DateTime startedAt, DateTime dueAt, DateTime dateTime, DateTime dateTime2, String currency, int i, int i2, int i3, DateTime dateTime3, List<ItemLeaseValidation> validations, List<ItemLeaseAsset> assets, ItemLeaseMetadata metadata) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(principalId, "principalId");
        Intrinsics.checkNotNullParameter(leaseType, "leaseType");
        Intrinsics.checkNotNullParameter(startedAt, "startedAt");
        Intrinsics.checkNotNullParameter(dueAt, "dueAt");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(validations, "validations");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.f66659id = id;
        this.principalId = principalId;
        this.leaseType = leaseType;
        this.leasedItemId = str;
        this.associatedItemId = str2;
        this.startedAt = startedAt;
        this.dueAt = dueAt;
        this.returnedAt = dateTime;
        this.finalizedAt = dateTime2;
        this.currency = currency;
        this.initialChargeAmount = i;
        this.returnRefundAmount = i2;
        this.delinquentFeeAmount = i3;
        this.delinquencySettledAt = dateTime3;
        this.validations = validations;
        this.assets = assets;
        this.metadata = metadata;
    }

    public final String component1() {
        return this.f66659id;
    }

    public final String component10() {
        return this.currency;
    }

    public final int component11() {
        return this.initialChargeAmount;
    }

    public final int component12() {
        return this.returnRefundAmount;
    }

    public final int component13() {
        return this.delinquentFeeAmount;
    }

    public final DateTime component14() {
        return this.delinquencySettledAt;
    }

    public final List<ItemLeaseValidation> component15() {
        return this.validations;
    }

    public final List<ItemLeaseAsset> component16() {
        return this.assets;
    }

    public final ItemLeaseMetadata component17() {
        return this.metadata;
    }

    public final String component2() {
        return this.principalId;
    }

    public final ItemLeaseType component3() {
        return this.leaseType;
    }

    public final String component4() {
        return this.leasedItemId;
    }

    public final String component5() {
        return this.associatedItemId;
    }

    public final DateTime component6() {
        return this.startedAt;
    }

    public final DateTime component7() {
        return this.dueAt;
    }

    public final DateTime component8() {
        return this.returnedAt;
    }

    public final DateTime component9() {
        return this.finalizedAt;
    }

    public final ItemLease copy(String id, String principalId, ItemLeaseType leaseType, String str, String str2, DateTime startedAt, DateTime dueAt, DateTime dateTime, DateTime dateTime2, String currency, int i, int i2, int i3, DateTime dateTime3, List<ItemLeaseValidation> validations, List<ItemLeaseAsset> assets, ItemLeaseMetadata metadata) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(principalId, "principalId");
        Intrinsics.checkNotNullParameter(leaseType, "leaseType");
        Intrinsics.checkNotNullParameter(startedAt, "startedAt");
        Intrinsics.checkNotNullParameter(dueAt, "dueAt");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(validations, "validations");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new ItemLease(id, principalId, leaseType, str, str2, startedAt, dueAt, dateTime, dateTime2, currency, i, i2, i3, dateTime3, validations, assets, metadata);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ItemLease) {
            ItemLease itemLease = (ItemLease) obj;
            return Intrinsics.areEqual(this.f66659id, itemLease.f66659id) && Intrinsics.areEqual(this.principalId, itemLease.principalId) && this.leaseType == itemLease.leaseType && Intrinsics.areEqual(this.leasedItemId, itemLease.leasedItemId) && Intrinsics.areEqual(this.associatedItemId, itemLease.associatedItemId) && Intrinsics.areEqual(this.startedAt, itemLease.startedAt) && Intrinsics.areEqual(this.dueAt, itemLease.dueAt) && Intrinsics.areEqual(this.returnedAt, itemLease.returnedAt) && Intrinsics.areEqual(this.finalizedAt, itemLease.finalizedAt) && Intrinsics.areEqual(this.currency, itemLease.currency) && this.initialChargeAmount == itemLease.initialChargeAmount && this.returnRefundAmount == itemLease.returnRefundAmount && this.delinquentFeeAmount == itemLease.delinquentFeeAmount && Intrinsics.areEqual(this.delinquencySettledAt, itemLease.delinquencySettledAt) && Intrinsics.areEqual(this.validations, itemLease.validations) && Intrinsics.areEqual(this.assets, itemLease.assets) && Intrinsics.areEqual(this.metadata, itemLease.metadata);
        }
        return false;
    }

    public final List<ItemLeaseAsset> getAssets() {
        return this.assets;
    }

    public final String getAssociatedItemId() {
        return this.associatedItemId;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final DateTime getDelinquencySettledAt() {
        return this.delinquencySettledAt;
    }

    public final int getDelinquentFeeAmount() {
        return this.delinquentFeeAmount;
    }

    public final DateTime getDueAt() {
        return this.dueAt;
    }

    public final DateTime getFinalizedAt() {
        return this.finalizedAt;
    }

    public final String getId() {
        return this.f66659id;
    }

    public final int getInitialChargeAmount() {
        return this.initialChargeAmount;
    }

    public final ItemLeaseType getLeaseType() {
        return this.leaseType;
    }

    public final String getLeasedItemId() {
        return this.leasedItemId;
    }

    public final ItemLeaseMetadata getMetadata() {
        return this.metadata;
    }

    public final String getPrincipalId() {
        return this.principalId;
    }

    public final int getReturnRefundAmount() {
        return this.returnRefundAmount;
    }

    public final DateTime getReturnedAt() {
        return this.returnedAt;
    }

    public final DateTime getStartedAt() {
        return this.startedAt;
    }

    public final List<ItemLeaseValidation> getValidations() {
        return this.validations;
    }

    public int hashCode() {
        int hashCode = ((((this.f66659id.hashCode() * 31) + this.principalId.hashCode()) * 31) + this.leaseType.hashCode()) * 31;
        String str = this.leasedItemId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.associatedItemId;
        int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.startedAt.hashCode()) * 31) + this.dueAt.hashCode()) * 31;
        DateTime dateTime = this.returnedAt;
        int hashCode4 = (hashCode3 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.finalizedAt;
        int hashCode5 = (((((((((hashCode4 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31) + this.currency.hashCode()) * 31) + Integer.hashCode(this.initialChargeAmount)) * 31) + Integer.hashCode(this.returnRefundAmount)) * 31) + Integer.hashCode(this.delinquentFeeAmount)) * 31;
        DateTime dateTime3 = this.delinquencySettledAt;
        return ((((((hashCode5 + (dateTime3 != null ? dateTime3.hashCode() : 0)) * 31) + this.validations.hashCode()) * 31) + this.assets.hashCode()) * 31) + this.metadata.hashCode();
    }

    public final boolean isActive() {
        return this.returnedAt == null && this.finalizedAt == null;
    }

    public final boolean isLeaseForBird(WireBird bird, ItemLeaseType type) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(type, "type");
        return isLeaseForBirdId(bird.getId(), type);
    }

    public final boolean isLeaseForBirdId(String birdId, ItemLeaseType type) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(type, "type");
        if (Intrinsics.areEqual(this.associatedItemId, birdId) && this.leaseType == type) {
            return true;
        }
        return false;
    }

    public String toString() {
        String str = this.f66659id;
        String str2 = this.principalId;
        ItemLeaseType itemLeaseType = this.leaseType;
        String str3 = this.leasedItemId;
        String str4 = this.associatedItemId;
        DateTime dateTime = this.startedAt;
        DateTime dateTime2 = this.dueAt;
        DateTime dateTime3 = this.returnedAt;
        DateTime dateTime4 = this.finalizedAt;
        String str5 = this.currency;
        int i = this.initialChargeAmount;
        int i2 = this.returnRefundAmount;
        int i3 = this.delinquentFeeAmount;
        DateTime dateTime5 = this.delinquencySettledAt;
        List<ItemLeaseValidation> list = this.validations;
        List<ItemLeaseAsset> list2 = this.assets;
        ItemLeaseMetadata itemLeaseMetadata = this.metadata;
        return "ItemLease(id=" + str + ", principalId=" + str2 + ", leaseType=" + itemLeaseType + ", leasedItemId=" + str3 + ", associatedItemId=" + str4 + ", startedAt=" + dateTime + ", dueAt=" + dateTime2 + ", returnedAt=" + dateTime3 + ", finalizedAt=" + dateTime4 + ", currency=" + str5 + ", initialChargeAmount=" + i + ", returnRefundAmount=" + i2 + ", delinquentFeeAmount=" + i3 + ", delinquencySettledAt=" + dateTime5 + ", validations=" + list + ", assets=" + list2 + ", metadata=" + itemLeaseMetadata + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66659id);
        out.writeString(this.principalId);
        this.leaseType.writeToParcel(out, i);
        out.writeString(this.leasedItemId);
        out.writeString(this.associatedItemId);
        out.writeSerializable(this.startedAt);
        out.writeSerializable(this.dueAt);
        out.writeSerializable(this.returnedAt);
        out.writeSerializable(this.finalizedAt);
        out.writeString(this.currency);
        out.writeInt(this.initialChargeAmount);
        out.writeInt(this.returnRefundAmount);
        out.writeInt(this.delinquentFeeAmount);
        out.writeSerializable(this.delinquencySettledAt);
        List<ItemLeaseValidation> list = this.validations;
        out.writeInt(list.size());
        for (ItemLeaseValidation itemLeaseValidation : list) {
            itemLeaseValidation.writeToParcel(out, i);
        }
        List<ItemLeaseAsset> list2 = this.assets;
        out.writeInt(list2.size());
        for (ItemLeaseAsset itemLeaseAsset : list2) {
            itemLeaseAsset.writeToParcel(out, i);
        }
        this.metadata.writeToParcel(out, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ItemLease(String str, String str2, ItemLeaseType itemLeaseType, String str3, String str4, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, String str5, int i, int i2, int i3, DateTime dateTime5, List list, List list2, ItemLeaseMetadata itemLeaseMetadata, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, r5, r6, r7, dateTime, dateTime2, r10, r11, r12, r13, r14, r15, r16, r17, r18, (i4 & 65536) != 0 ? new ItemLeaseMetadata(null, null, 3, null) : itemLeaseMetadata);
        List list3;
        List list4;
        List emptyList;
        List emptyList2;
        ItemLeaseType itemLeaseType2 = (i4 & 4) != 0 ? ItemLeaseType.UNKNOWN : itemLeaseType;
        String str6 = (i4 & 8) != 0 ? null : str3;
        String str7 = (i4 & 16) != 0 ? null : str4;
        DateTime dateTime6 = (i4 & 128) != 0 ? null : dateTime3;
        DateTime dateTime7 = (i4 & 256) != 0 ? null : dateTime4;
        String str8 = (i4 & 512) != 0 ? Source.USD : str5;
        int i5 = (i4 & 1024) != 0 ? 0 : i;
        int i6 = (i4 & 2048) != 0 ? 0 : i2;
        int i7 = (i4 & 4096) != 0 ? 0 : i3;
        DateTime dateTime8 = (i4 & 8192) != 0 ? null : dateTime5;
        if ((i4 & 16384) != 0) {
            emptyList2 = CollectionsKt__CollectionsKt.emptyList();
            list3 = emptyList2;
        } else {
            list3 = list;
        }
        if ((32768 & i4) != 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            list4 = emptyList;
        } else {
            list4 = list2;
        }
    }
}
