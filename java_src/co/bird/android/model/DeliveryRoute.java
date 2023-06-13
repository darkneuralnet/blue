package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001eHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\u0019\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001eHÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006*"}, m28432d2 = {"Lco/bird/android/model/DeliveryRoute;", "Landroid/os/Parcelable;", "id", "", "userId", "createdAt", "Lorg/joda/time/DateTime;", "finishedAt", "canceledAt", "deliveries", "", "Lco/bird/android/model/Delivery;", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/util/List;)V", "getCanceledAt", "()Lorg/joda/time/DateTime;", "getCreatedAt", "getDeliveries", "()Ljava/util/List;", "getFinishedAt", "getId", "()Ljava/lang/String;", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class DeliveryRoute implements Parcelable {
    public static final Parcelable.Creator<DeliveryRoute> CREATOR = new Creator();
    @JsonProperty("canceled_at")
    @InterfaceC41208ft5("canceled_at")
    private final DateTime canceledAt;
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("deliveries")
    @InterfaceC41208ft5("deliveries")
    private final List<Delivery> deliveries;
    @JsonProperty("finished_at")
    @InterfaceC41208ft5("finished_at")
    private final DateTime finishedAt;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66587id;
    @JsonProperty("user_id")
    @InterfaceC41208ft5("user_id")
    private final String userId;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<DeliveryRoute> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeliveryRoute createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            DateTime dateTime = (DateTime) parcel.readSerializable();
            DateTime dateTime2 = (DateTime) parcel.readSerializable();
            DateTime dateTime3 = (DateTime) parcel.readSerializable();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(Delivery.CREATOR.createFromParcel(parcel));
            }
            return new DeliveryRoute(readString, readString2, dateTime, dateTime2, dateTime3, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeliveryRoute[] newArray(int i) {
            return new DeliveryRoute[i];
        }
    }

    public DeliveryRoute() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ DeliveryRoute copy$default(DeliveryRoute deliveryRoute, String str, String str2, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deliveryRoute.f66587id;
        }
        if ((i & 2) != 0) {
            str2 = deliveryRoute.userId;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            dateTime = deliveryRoute.createdAt;
        }
        DateTime dateTime4 = dateTime;
        if ((i & 8) != 0) {
            dateTime2 = deliveryRoute.finishedAt;
        }
        DateTime dateTime5 = dateTime2;
        if ((i & 16) != 0) {
            dateTime3 = deliveryRoute.canceledAt;
        }
        DateTime dateTime6 = dateTime3;
        List<Delivery> list2 = list;
        if ((i & 32) != 0) {
            list2 = deliveryRoute.deliveries;
        }
        return deliveryRoute.copy(str, str3, dateTime4, dateTime5, dateTime6, list2);
    }

    public final String component1() {
        return this.f66587id;
    }

    public final String component2() {
        return this.userId;
    }

    public final DateTime component3() {
        return this.createdAt;
    }

    public final DateTime component4() {
        return this.finishedAt;
    }

    public final DateTime component5() {
        return this.canceledAt;
    }

    public final List<Delivery> component6() {
        return this.deliveries;
    }

    public final DeliveryRoute copy(String id, String userId, DateTime createdAt, DateTime dateTime, DateTime dateTime2, List<Delivery> deliveries) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(deliveries, "deliveries");
        return new DeliveryRoute(id, userId, createdAt, dateTime, dateTime2, deliveries);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeliveryRoute) {
            DeliveryRoute deliveryRoute = (DeliveryRoute) obj;
            return Intrinsics.areEqual(this.f66587id, deliveryRoute.f66587id) && Intrinsics.areEqual(this.userId, deliveryRoute.userId) && Intrinsics.areEqual(this.createdAt, deliveryRoute.createdAt) && Intrinsics.areEqual(this.finishedAt, deliveryRoute.finishedAt) && Intrinsics.areEqual(this.canceledAt, deliveryRoute.canceledAt) && Intrinsics.areEqual(this.deliveries, deliveryRoute.deliveries);
        }
        return false;
    }

    public final DateTime getCanceledAt() {
        return this.canceledAt;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final List<Delivery> getDeliveries() {
        return this.deliveries;
    }

    public final DateTime getFinishedAt() {
        return this.finishedAt;
    }

    public final String getId() {
        return this.f66587id;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode = ((((this.f66587id.hashCode() * 31) + this.userId.hashCode()) * 31) + this.createdAt.hashCode()) * 31;
        DateTime dateTime = this.finishedAt;
        int hashCode2 = (hashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.canceledAt;
        return ((hashCode2 + (dateTime2 != null ? dateTime2.hashCode() : 0)) * 31) + this.deliveries.hashCode();
    }

    public String toString() {
        String str = this.f66587id;
        String str2 = this.userId;
        DateTime dateTime = this.createdAt;
        DateTime dateTime2 = this.finishedAt;
        DateTime dateTime3 = this.canceledAt;
        List<Delivery> list = this.deliveries;
        return "DeliveryRoute(id=" + str + ", userId=" + str2 + ", createdAt=" + dateTime + ", finishedAt=" + dateTime2 + ", canceledAt=" + dateTime3 + ", deliveries=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66587id);
        out.writeString(this.userId);
        out.writeSerializable(this.createdAt);
        out.writeSerializable(this.finishedAt);
        out.writeSerializable(this.canceledAt);
        List<Delivery> list = this.deliveries;
        out.writeInt(list.size());
        for (Delivery delivery : list) {
            delivery.writeToParcel(out, i);
        }
    }

    public DeliveryRoute(String id, String userId, DateTime createdAt, DateTime dateTime, DateTime dateTime2, List<Delivery> deliveries) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(deliveries, "deliveries");
        this.f66587id = id;
        this.userId = userId;
        this.createdAt = createdAt;
        this.finishedAt = dateTime;
        this.canceledAt = dateTime2;
        this.deliveries = deliveries;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ DeliveryRoute(String str, String str2, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r12, r0, dateTime, (i & 8) != 0 ? null : dateTime2, (i & 16) != 0 ? null : dateTime3, (i & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
        String str3 = (i & 1) != 0 ? "" : str;
        String str4 = (i & 2) == 0 ? str2 : "";
        if ((i & 4) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
    }
}
