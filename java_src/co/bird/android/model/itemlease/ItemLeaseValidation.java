package co.bird.android.model.itemlease;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.itemlease.p022enum.ItemLeaseValidationType;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JG\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0013\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001fHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\u0019\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006*"}, m28432d2 = {"Lco/bird/android/model/itemlease/ItemLeaseValidation;", "Landroid/os/Parcelable;", "id", "", "leaseId", "validationType", "Lco/bird/android/model/itemlease/enum/ItemLeaseValidationType;", "validatorId", "createdAt", "Lorg/joda/time/DateTime;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/itemlease/enum/ItemLeaseValidationType;Ljava/lang/String;Lorg/joda/time/DateTime;Z)V", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getId", "()Ljava/lang/String;", "getLeaseId", "getResult", "()Z", "getValidationType", "()Lco/bird/android/model/itemlease/enum/ItemLeaseValidationType;", "getValidatorId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ItemLeaseValidation implements Parcelable {
    public static final Parcelable.Creator<ItemLeaseValidation> CREATOR = new Creator();
    private final DateTime createdAt;

    /* renamed from: id */
    private final String f66661id;
    private final String leaseId;
    private final boolean result;
    private final ItemLeaseValidationType validationType;
    private final String validatorId;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<ItemLeaseValidation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ItemLeaseValidation createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ItemLeaseValidation(parcel.readString(), parcel.readString(), ItemLeaseValidationType.CREATOR.createFromParcel(parcel), parcel.readString(), (DateTime) parcel.readSerializable(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ItemLeaseValidation[] newArray(int i) {
            return new ItemLeaseValidation[i];
        }
    }

    public ItemLeaseValidation(String id, String leaseId, ItemLeaseValidationType validationType, String validatorId, DateTime dateTime, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(leaseId, "leaseId");
        Intrinsics.checkNotNullParameter(validationType, "validationType");
        Intrinsics.checkNotNullParameter(validatorId, "validatorId");
        this.f66661id = id;
        this.leaseId = leaseId;
        this.validationType = validationType;
        this.validatorId = validatorId;
        this.createdAt = dateTime;
        this.result = z;
    }

    public static /* synthetic */ ItemLeaseValidation copy$default(ItemLeaseValidation itemLeaseValidation, String str, String str2, ItemLeaseValidationType itemLeaseValidationType, String str3, DateTime dateTime, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = itemLeaseValidation.f66661id;
        }
        if ((i & 2) != 0) {
            str2 = itemLeaseValidation.leaseId;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            itemLeaseValidationType = itemLeaseValidation.validationType;
        }
        ItemLeaseValidationType itemLeaseValidationType2 = itemLeaseValidationType;
        if ((i & 8) != 0) {
            str3 = itemLeaseValidation.validatorId;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            dateTime = itemLeaseValidation.createdAt;
        }
        DateTime dateTime2 = dateTime;
        if ((i & 32) != 0) {
            z = itemLeaseValidation.result;
        }
        return itemLeaseValidation.copy(str, str4, itemLeaseValidationType2, str5, dateTime2, z);
    }

    public final String component1() {
        return this.f66661id;
    }

    public final String component2() {
        return this.leaseId;
    }

    public final ItemLeaseValidationType component3() {
        return this.validationType;
    }

    public final String component4() {
        return this.validatorId;
    }

    public final DateTime component5() {
        return this.createdAt;
    }

    public final boolean component6() {
        return this.result;
    }

    public final ItemLeaseValidation copy(String id, String leaseId, ItemLeaseValidationType validationType, String validatorId, DateTime dateTime, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(leaseId, "leaseId");
        Intrinsics.checkNotNullParameter(validationType, "validationType");
        Intrinsics.checkNotNullParameter(validatorId, "validatorId");
        return new ItemLeaseValidation(id, leaseId, validationType, validatorId, dateTime, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ItemLeaseValidation) {
            ItemLeaseValidation itemLeaseValidation = (ItemLeaseValidation) obj;
            return Intrinsics.areEqual(this.f66661id, itemLeaseValidation.f66661id) && Intrinsics.areEqual(this.leaseId, itemLeaseValidation.leaseId) && this.validationType == itemLeaseValidation.validationType && Intrinsics.areEqual(this.validatorId, itemLeaseValidation.validatorId) && Intrinsics.areEqual(this.createdAt, itemLeaseValidation.createdAt) && this.result == itemLeaseValidation.result;
        }
        return false;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.f66661id;
    }

    public final String getLeaseId() {
        return this.leaseId;
    }

    public final boolean getResult() {
        return this.result;
    }

    public final ItemLeaseValidationType getValidationType() {
        return this.validationType;
    }

    public final String getValidatorId() {
        return this.validatorId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f66661id.hashCode() * 31) + this.leaseId.hashCode()) * 31) + this.validationType.hashCode()) * 31) + this.validatorId.hashCode()) * 31;
        DateTime dateTime = this.createdAt;
        int hashCode2 = (hashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        boolean z = this.result;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.f66661id;
        String str2 = this.leaseId;
        ItemLeaseValidationType itemLeaseValidationType = this.validationType;
        String str3 = this.validatorId;
        DateTime dateTime = this.createdAt;
        boolean z = this.result;
        return "ItemLeaseValidation(id=" + str + ", leaseId=" + str2 + ", validationType=" + itemLeaseValidationType + ", validatorId=" + str3 + ", createdAt=" + dateTime + ", result=" + z + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66661id);
        out.writeString(this.leaseId);
        this.validationType.writeToParcel(out, i);
        out.writeString(this.validatorId);
        out.writeSerializable(this.createdAt);
        out.writeInt(this.result ? 1 : 0);
    }

    public /* synthetic */ ItemLeaseValidation(String str, String str2, ItemLeaseValidationType itemLeaseValidationType, String str3, DateTime dateTime, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, itemLeaseValidationType, str3, (i & 16) != 0 ? null : dateTime, z);
    }
}
