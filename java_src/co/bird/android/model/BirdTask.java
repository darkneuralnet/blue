package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.constant.BirdTaskKind;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.Source;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b7\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÛ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u001bJ\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\tHÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u00101J\u0010\u0010;\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u00101J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0014HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010$J\u0010\u0010B\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u00101J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0007HÆ\u0003J\t\u0010G\u001a\u00020\tHÆ\u0003J\t\u0010H\u001a\u00020\tHÆ\u0003J\t\u0010I\u001a\u00020\tHÆ\u0003J\t\u0010J\u001a\u00020\tHÆ\u0003J\t\u0010K\u001a\u00020\tHÆ\u0003Jæ\u0001\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0002\u0010MJ\t\u0010N\u001a\u00020\tHÖ\u0001J\u0013\u0010O\u001a\u00020P2\b\u0010Q\u001a\u0004\u0018\u00010RHÖ\u0003J\t\u0010S\u001a\u00020\tHÖ\u0001J\u0006\u0010\u000f\u001a\u00020\tJ\t\u0010T\u001a\u00020\u0003HÖ\u0001J\u0019\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020\tHÖ\u0001R\u0016\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR\u0016\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0016\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\"R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00102\u001a\u0004\b0\u00101R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00102\u001a\u0004\b3\u00101R\u001a\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00102\u001a\u0004\b4\u00101R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\"R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001f¨\u0006Z"}, m28432d2 = {"Lco/bird/android/model/BirdTask;", "Landroid/os/Parcelable;", "id", "", "birdId", "userId", "kind", "Lco/bird/android/model/constant/BirdTaskKind;", "initialBattery", "", "currentBattery", "initialDistance", "currentDistance", "battery", "distance", "price", "paidPrice", "currency", "transactionId", "startedAt", "Lorg/joda/time/DateTime;", "completedAt", "birdCode", "completedPercentage", "", "quotedPrice", "dueAt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;IIIIIILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Integer;Lorg/joda/time/DateTime;)V", "getBattery", "()I", "getBirdCode", "()Ljava/lang/String;", "getBirdId", "getCompletedAt", "()Lorg/joda/time/DateTime;", "getCompletedPercentage", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getCurrency", "getCurrentBattery", "getCurrentDistance", "getDistance", "getDueAt", "getId", "getInitialBattery", "getInitialDistance", "getKind", "()Lco/bird/android/model/constant/BirdTaskKind;", "getPaidPrice", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPrice", "getQuotedPrice", "getStartedAt", "getTransactionId", "getUserId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;IIIIIILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Integer;Lorg/joda/time/DateTime;)Lco/bird/android/model/BirdTask;", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BirdTask implements Parcelable {
    public static final Parcelable.Creator<BirdTask> CREATOR = new Creator();
    @JsonProperty("battery")
    @InterfaceC41208ft5("battery")
    private final int battery;
    @JsonProperty("bird_code")
    @InterfaceC41208ft5("bird_code")
    private final String birdCode;
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("completed_at")
    @InterfaceC41208ft5("completed_at")
    private final DateTime completedAt;
    @JsonProperty("completed_percentage")
    @InterfaceC41208ft5("completed_percentage")
    private final Float completedPercentage;
    @JsonProperty("currency")
    @InterfaceC41208ft5("currency")
    private final String currency;
    @JsonProperty("current_battery")
    @InterfaceC41208ft5("current_battery")
    private final int currentBattery;
    @JsonProperty("current_distance")
    @InterfaceC41208ft5("current_distance")
    private final int currentDistance;
    @JsonProperty("distance")
    @InterfaceC41208ft5("distance")
    private final int distance;
    @JsonProperty("due_at")
    @InterfaceC41208ft5("due_at")
    private final DateTime dueAt;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66578id;
    @JsonProperty("initial_battery")
    @InterfaceC41208ft5("initial_battery")
    private final int initialBattery;
    @JsonProperty("initial_distance")
    @InterfaceC41208ft5("initial_distance")
    private final int initialDistance;
    @JsonProperty("kind")
    @InterfaceC41208ft5("kind")
    private final BirdTaskKind kind;
    @JsonProperty("paid_price")
    @InterfaceC41208ft5("paid_price")
    private final Integer paidPrice;
    @JsonProperty("price")
    @InterfaceC41208ft5("price")
    private final Integer price;
    @JsonProperty("quoted_price")
    @InterfaceC41208ft5("quoted_price")
    private final Integer quotedPrice;
    @JsonProperty("started_at")
    @InterfaceC41208ft5("started_at")
    private final DateTime startedAt;
    @JsonProperty("transaction_id")
    @InterfaceC41208ft5("transaction_id")
    private final String transactionId;
    @JsonProperty("user_id")
    @InterfaceC41208ft5("user_id")
    private final String userId;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<BirdTask> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BirdTask createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BirdTask(parcel.readString(), parcel.readString(), parcel.readString(), BirdTaskKind.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (DateTime) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BirdTask[] newArray(int i) {
            return new BirdTask[i];
        }
    }

    public BirdTask(String id, String birdId, String userId, BirdTaskKind kind, int i, int i2, int i3, int i4, int i5, int i6, Integer num, Integer num2, String currency, String str, DateTime startedAt, DateTime dateTime, String str2, Float f, Integer num3, DateTime dateTime2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(startedAt, "startedAt");
        this.f66578id = id;
        this.birdId = birdId;
        this.userId = userId;
        this.kind = kind;
        this.initialBattery = i;
        this.currentBattery = i2;
        this.initialDistance = i3;
        this.currentDistance = i4;
        this.battery = i5;
        this.distance = i6;
        this.price = num;
        this.paidPrice = num2;
        this.currency = currency;
        this.transactionId = str;
        this.startedAt = startedAt;
        this.completedAt = dateTime;
        this.birdCode = str2;
        this.completedPercentage = f;
        this.quotedPrice = num3;
        this.dueAt = dateTime2;
    }

    public final String component1() {
        return this.f66578id;
    }

    public final int component10() {
        return this.distance;
    }

    public final Integer component11() {
        return this.price;
    }

    public final Integer component12() {
        return this.paidPrice;
    }

    public final String component13() {
        return this.currency;
    }

    public final String component14() {
        return this.transactionId;
    }

    public final DateTime component15() {
        return this.startedAt;
    }

    public final DateTime component16() {
        return this.completedAt;
    }

    public final String component17() {
        return this.birdCode;
    }

    public final Float component18() {
        return this.completedPercentage;
    }

    public final Integer component19() {
        return this.quotedPrice;
    }

    public final String component2() {
        return this.birdId;
    }

    public final DateTime component20() {
        return this.dueAt;
    }

    public final String component3() {
        return this.userId;
    }

    public final BirdTaskKind component4() {
        return this.kind;
    }

    public final int component5() {
        return this.initialBattery;
    }

    public final int component6() {
        return this.currentBattery;
    }

    public final int component7() {
        return this.initialDistance;
    }

    public final int component8() {
        return this.currentDistance;
    }

    public final int component9() {
        return this.battery;
    }

    public final BirdTask copy(String id, String birdId, String userId, BirdTaskKind kind, int i, int i2, int i3, int i4, int i5, int i6, Integer num, Integer num2, String currency, String str, DateTime startedAt, DateTime dateTime, String str2, Float f, Integer num3, DateTime dateTime2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(startedAt, "startedAt");
        return new BirdTask(id, birdId, userId, kind, i, i2, i3, i4, i5, i6, num, num2, currency, str, startedAt, dateTime, str2, f, num3, dateTime2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BirdTask) {
            BirdTask birdTask = (BirdTask) obj;
            return Intrinsics.areEqual(this.f66578id, birdTask.f66578id) && Intrinsics.areEqual(this.birdId, birdTask.birdId) && Intrinsics.areEqual(this.userId, birdTask.userId) && this.kind == birdTask.kind && this.initialBattery == birdTask.initialBattery && this.currentBattery == birdTask.currentBattery && this.initialDistance == birdTask.initialDistance && this.currentDistance == birdTask.currentDistance && this.battery == birdTask.battery && this.distance == birdTask.distance && Intrinsics.areEqual(this.price, birdTask.price) && Intrinsics.areEqual(this.paidPrice, birdTask.paidPrice) && Intrinsics.areEqual(this.currency, birdTask.currency) && Intrinsics.areEqual(this.transactionId, birdTask.transactionId) && Intrinsics.areEqual(this.startedAt, birdTask.startedAt) && Intrinsics.areEqual(this.completedAt, birdTask.completedAt) && Intrinsics.areEqual(this.birdCode, birdTask.birdCode) && Intrinsics.areEqual((Object) this.completedPercentage, (Object) birdTask.completedPercentage) && Intrinsics.areEqual(this.quotedPrice, birdTask.quotedPrice) && Intrinsics.areEqual(this.dueAt, birdTask.dueAt);
        }
        return false;
    }

    public final int getBattery() {
        return this.battery;
    }

    public final String getBirdCode() {
        return this.birdCode;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final DateTime getCompletedAt() {
        return this.completedAt;
    }

    public final Float getCompletedPercentage() {
        return this.completedPercentage;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final int getCurrentBattery() {
        return this.currentBattery;
    }

    public final int getCurrentDistance() {
        return this.currentDistance;
    }

    public final int getDistance() {
        return this.distance;
    }

    public final DateTime getDueAt() {
        return this.dueAt;
    }

    public final String getId() {
        return this.f66578id;
    }

    public final int getInitialBattery() {
        return this.initialBattery;
    }

    public final int getInitialDistance() {
        return this.initialDistance;
    }

    public final BirdTaskKind getKind() {
        return this.kind;
    }

    public final Integer getPaidPrice() {
        return this.paidPrice;
    }

    public final Integer getPrice() {
        return this.price;
    }

    public final Integer getQuotedPrice() {
        return this.quotedPrice;
    }

    public final DateTime getStartedAt() {
        return this.startedAt;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((this.f66578id.hashCode() * 31) + this.birdId.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.kind.hashCode()) * 31) + Integer.hashCode(this.initialBattery)) * 31) + Integer.hashCode(this.currentBattery)) * 31) + Integer.hashCode(this.initialDistance)) * 31) + Integer.hashCode(this.currentDistance)) * 31) + Integer.hashCode(this.battery)) * 31) + Integer.hashCode(this.distance)) * 31;
        Integer num = this.price;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.paidPrice;
        int hashCode3 = (((hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.currency.hashCode()) * 31;
        String str = this.transactionId;
        int hashCode4 = (((hashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.startedAt.hashCode()) * 31;
        DateTime dateTime = this.completedAt;
        int hashCode5 = (hashCode4 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        String str2 = this.birdCode;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f = this.completedPercentage;
        int hashCode7 = (hashCode6 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num3 = this.quotedPrice;
        int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        DateTime dateTime2 = this.dueAt;
        return hashCode8 + (dateTime2 != null ? dateTime2.hashCode() : 0);
    }

    public final int price() {
        Integer num = this.paidPrice;
        if (num == null && (num = this.price) == null) {
            return 0;
        }
        return num.intValue();
    }

    public String toString() {
        String str = this.f66578id;
        String str2 = this.birdId;
        String str3 = this.userId;
        BirdTaskKind birdTaskKind = this.kind;
        int i = this.initialBattery;
        int i2 = this.currentBattery;
        int i3 = this.initialDistance;
        int i4 = this.currentDistance;
        int i5 = this.battery;
        int i6 = this.distance;
        Integer num = this.price;
        Integer num2 = this.paidPrice;
        String str4 = this.currency;
        String str5 = this.transactionId;
        DateTime dateTime = this.startedAt;
        DateTime dateTime2 = this.completedAt;
        String str6 = this.birdCode;
        Float f = this.completedPercentage;
        Integer num3 = this.quotedPrice;
        DateTime dateTime3 = this.dueAt;
        return "BirdTask(id=" + str + ", birdId=" + str2 + ", userId=" + str3 + ", kind=" + birdTaskKind + ", initialBattery=" + i + ", currentBattery=" + i2 + ", initialDistance=" + i3 + ", currentDistance=" + i4 + ", battery=" + i5 + ", distance=" + i6 + ", price=" + num + ", paidPrice=" + num2 + ", currency=" + str4 + ", transactionId=" + str5 + ", startedAt=" + dateTime + ", completedAt=" + dateTime2 + ", birdCode=" + str6 + ", completedPercentage=" + f + ", quotedPrice=" + num3 + ", dueAt=" + dateTime3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66578id);
        out.writeString(this.birdId);
        out.writeString(this.userId);
        out.writeString(this.kind.name());
        out.writeInt(this.initialBattery);
        out.writeInt(this.currentBattery);
        out.writeInt(this.initialDistance);
        out.writeInt(this.currentDistance);
        out.writeInt(this.battery);
        out.writeInt(this.distance);
        Integer num = this.price;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        Integer num2 = this.paidPrice;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }
        out.writeString(this.currency);
        out.writeString(this.transactionId);
        out.writeSerializable(this.startedAt);
        out.writeSerializable(this.completedAt);
        out.writeString(this.birdCode);
        Float f = this.completedPercentage;
        if (f == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeFloat(f.floatValue());
        }
        Integer num3 = this.quotedPrice;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num3.intValue());
        }
        out.writeSerializable(this.dueAt);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ BirdTask(String str, String str2, String str3, BirdTaskKind birdTaskKind, int i, int i2, int i3, int i4, int i5, int i6, Integer num, Integer num2, String str4, String str5, DateTime dateTime, DateTime dateTime2, String str6, Float f, Integer num3, DateTime dateTime3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, birdTaskKind, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, (32768 & i7) != 0 ? null : dateTime2, (65536 & i7) != 0 ? null : str6, (131072 & i7) != 0 ? null : f, (262144 & i7) != 0 ? null : num3, (i7 & 524288) != 0 ? null : dateTime3);
        DateTime dateTime4;
        String str7 = (i7 & 1) != 0 ? "" : str;
        String str8 = (i7 & 2) != 0 ? "" : str2;
        String str9 = (i7 & 4) != 0 ? "" : str3;
        int i8 = (i7 & 16) != 0 ? 0 : i;
        int i9 = (i7 & 32) != 0 ? 0 : i2;
        int i10 = (i7 & 64) != 0 ? 0 : i3;
        int i11 = (i7 & 128) != 0 ? 0 : i4;
        int i12 = (i7 & 256) != 0 ? 0 : i5;
        int i13 = (i7 & 512) != 0 ? 0 : i6;
        Integer num4 = (i7 & 1024) != 0 ? null : num;
        Integer num5 = (i7 & 2048) != 0 ? null : num2;
        String str10 = (i7 & 4096) != 0 ? Source.USD : str4;
        String str11 = (i7 & 8192) != 0 ? null : str5;
        if ((i7 & 16384) != 0) {
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            dateTime4 = now;
        } else {
            dateTime4 = dateTime;
        }
    }
}
