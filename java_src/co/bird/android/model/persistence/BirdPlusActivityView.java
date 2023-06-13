package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\r¨\u0006\u001c"}, m28432d2 = {"Lco/bird/android/model/persistence/BirdPlusActivityView;", "", "rangeStart", "Lorg/joda/time/DateTime;", "rangeEnd", "ridesTaken", "", "savedAmount", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getRangeEnd", "()Lorg/joda/time/DateTime;", "getRangeStart", "getRidesTaken", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSavedAmount", "component1", "component2", "component3", "component4", "copy", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Integer;Ljava/lang/Integer;)Lco/bird/android/model/persistence/BirdPlusActivityView;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BirdPlusActivityView {
    @JsonProperty("range_end")
    @InterfaceC41208ft5("range_end")
    private final DateTime rangeEnd;
    @JsonProperty(TransferTable.COLUMN_DATA_RANGE_START)
    @InterfaceC41208ft5(TransferTable.COLUMN_DATA_RANGE_START)
    private final DateTime rangeStart;
    @JsonProperty("rides_taken")
    @InterfaceC41208ft5("rides_taken")
    private final Integer ridesTaken;
    @JsonProperty("saved_amount")
    @InterfaceC41208ft5("saved_amount")
    private final Integer savedAmount;

    public BirdPlusActivityView() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ BirdPlusActivityView copy$default(BirdPlusActivityView birdPlusActivityView, DateTime dateTime, DateTime dateTime2, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            dateTime = birdPlusActivityView.rangeStart;
        }
        if ((i & 2) != 0) {
            dateTime2 = birdPlusActivityView.rangeEnd;
        }
        if ((i & 4) != 0) {
            num = birdPlusActivityView.ridesTaken;
        }
        if ((i & 8) != 0) {
            num2 = birdPlusActivityView.savedAmount;
        }
        return birdPlusActivityView.copy(dateTime, dateTime2, num, num2);
    }

    public final DateTime component1() {
        return this.rangeStart;
    }

    public final DateTime component2() {
        return this.rangeEnd;
    }

    public final Integer component3() {
        return this.ridesTaken;
    }

    public final Integer component4() {
        return this.savedAmount;
    }

    public final BirdPlusActivityView copy(DateTime dateTime, DateTime dateTime2, Integer num, Integer num2) {
        return new BirdPlusActivityView(dateTime, dateTime2, num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BirdPlusActivityView) {
            BirdPlusActivityView birdPlusActivityView = (BirdPlusActivityView) obj;
            return Intrinsics.areEqual(this.rangeStart, birdPlusActivityView.rangeStart) && Intrinsics.areEqual(this.rangeEnd, birdPlusActivityView.rangeEnd) && Intrinsics.areEqual(this.ridesTaken, birdPlusActivityView.ridesTaken) && Intrinsics.areEqual(this.savedAmount, birdPlusActivityView.savedAmount);
        }
        return false;
    }

    public final DateTime getRangeEnd() {
        return this.rangeEnd;
    }

    public final DateTime getRangeStart() {
        return this.rangeStart;
    }

    public final Integer getRidesTaken() {
        return this.ridesTaken;
    }

    public final Integer getSavedAmount() {
        return this.savedAmount;
    }

    public int hashCode() {
        DateTime dateTime = this.rangeStart;
        int hashCode = (dateTime == null ? 0 : dateTime.hashCode()) * 31;
        DateTime dateTime2 = this.rangeEnd;
        int hashCode2 = (hashCode + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        Integer num = this.ridesTaken;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.savedAmount;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        DateTime dateTime = this.rangeStart;
        DateTime dateTime2 = this.rangeEnd;
        Integer num = this.ridesTaken;
        Integer num2 = this.savedAmount;
        return "BirdPlusActivityView(rangeStart=" + dateTime + ", rangeEnd=" + dateTime2 + ", ridesTaken=" + num + ", savedAmount=" + num2 + ")";
    }

    public BirdPlusActivityView(DateTime dateTime, DateTime dateTime2, Integer num, Integer num2) {
        this.rangeStart = dateTime;
        this.rangeEnd = dateTime2;
        this.ridesTaken = num;
        this.savedAmount = num2;
    }

    public /* synthetic */ BirdPlusActivityView(DateTime dateTime, DateTime dateTime2, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : dateTime, (i & 2) != 0 ? null : dateTime2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2);
    }
}
