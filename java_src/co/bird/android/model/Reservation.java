package co.bird.android.model;

import co.bird.android.model.wire.WireBird;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.Source;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b)\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0013J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010+\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u001fJ\t\u0010,\u001a\u00020\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00101\u001a\u00020\fHÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u000fHÆ\u0003J\u0088\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u00020\u000f2\b\u00107\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\t\u00108\u001a\u00020\u0011HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0011\u0010\"\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001a¨\u0006:"}, m28432d2 = {"Lco/bird/android/model/Reservation;", "", "id", "", "bird", "Lco/bird/android/model/wire/WireBird;", "startedAt", "Lorg/joda/time/DateTime;", "expireAt", "completedAt", "rideId", "price", "", "currency", "refunded", "", "billedMinutes", "", "fromPromotion", "(Ljava/lang/String;Lco/bird/android/model/wire/WireBird;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;JLjava/lang/String;ZLjava/lang/Integer;Ljava/lang/Boolean;)V", "getBilledMinutes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBird", "()Lco/bird/android/model/wire/WireBird;", "getCompletedAt", "()Lorg/joda/time/DateTime;", "getCurrency", "()Ljava/lang/String;", "getExpireAt", "getFromPromotion", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getId", "isExpired", "()Z", "getPrice", "()J", "getRefunded", "getRideId", "getStartedAt", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lco/bird/android/model/wire/WireBird;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;JLjava/lang/String;ZLjava/lang/Integer;Ljava/lang/Boolean;)Lco/bird/android/model/Reservation;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class Reservation {
    @JsonProperty("billed_minutes")
    @InterfaceC41208ft5("billed_minutes")
    private final Integer billedMinutes;
    @JsonProperty("bird")
    @InterfaceC41208ft5("bird")
    private final WireBird bird;
    @JsonProperty("completed_at")
    @InterfaceC41208ft5("completed_at")
    private final DateTime completedAt;
    @JsonProperty("currency")
    @InterfaceC41208ft5("currency")
    private final String currency;
    @JsonProperty("expire_at")
    @InterfaceC41208ft5("expire_at")
    private final DateTime expireAt;
    @JsonProperty("from_promotion")
    @InterfaceC41208ft5("from_promotion")
    private final Boolean fromPromotion;
    @JsonProperty("reservation_id")
    @InterfaceC41208ft5("reservation_id")

    /* renamed from: id */
    private final String f66625id;
    @JsonProperty("price")
    @InterfaceC41208ft5("price")
    private final long price;
    @JsonProperty("refunded")
    @InterfaceC41208ft5("refunded")
    private final boolean refunded;
    @JsonProperty("ride_id")
    @InterfaceC41208ft5("ride_id")
    private final String rideId;
    @JsonProperty("started_at")
    @InterfaceC41208ft5("started_at")
    private final DateTime startedAt;

    public Reservation(String id, WireBird bird, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, String str, long j, String currency, boolean z, Integer num, Boolean bool) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f66625id = id;
        this.bird = bird;
        this.startedAt = dateTime;
        this.expireAt = dateTime2;
        this.completedAt = dateTime3;
        this.rideId = str;
        this.price = j;
        this.currency = currency;
        this.refunded = z;
        this.billedMinutes = num;
        this.fromPromotion = bool;
    }

    public final String component1() {
        return this.f66625id;
    }

    public final Integer component10() {
        return this.billedMinutes;
    }

    public final Boolean component11() {
        return this.fromPromotion;
    }

    public final WireBird component2() {
        return this.bird;
    }

    public final DateTime component3() {
        return this.startedAt;
    }

    public final DateTime component4() {
        return this.expireAt;
    }

    public final DateTime component5() {
        return this.completedAt;
    }

    public final String component6() {
        return this.rideId;
    }

    public final long component7() {
        return this.price;
    }

    public final String component8() {
        return this.currency;
    }

    public final boolean component9() {
        return this.refunded;
    }

    public final Reservation copy(String id, WireBird bird, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, String str, long j, String currency, boolean z, Integer num, Boolean bool) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new Reservation(id, bird, dateTime, dateTime2, dateTime3, str, j, currency, z, num, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Reservation)) {
            return false;
        }
        return Intrinsics.areEqual(this.f66625id, ((Reservation) obj).f66625id);
    }

    public final Integer getBilledMinutes() {
        return this.billedMinutes;
    }

    public final WireBird getBird() {
        return this.bird;
    }

    public final DateTime getCompletedAt() {
        return this.completedAt;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final DateTime getExpireAt() {
        return this.expireAt;
    }

    public final Boolean getFromPromotion() {
        return this.fromPromotion;
    }

    public final String getId() {
        return this.f66625id;
    }

    public final long getPrice() {
        return this.price;
    }

    public final boolean getRefunded() {
        return this.refunded;
    }

    public final String getRideId() {
        return this.rideId;
    }

    public final DateTime getStartedAt() {
        return this.startedAt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f66625id.hashCode() * 31) + this.bird.hashCode()) * 31;
        DateTime dateTime = this.startedAt;
        int hashCode2 = (hashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.expireAt;
        int hashCode3 = (hashCode2 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        DateTime dateTime3 = this.completedAt;
        int hashCode4 = (hashCode3 + (dateTime3 == null ? 0 : dateTime3.hashCode())) * 31;
        String str = this.rideId;
        int hashCode5 = (((((hashCode4 + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.price)) * 31) + this.currency.hashCode()) * 31;
        boolean z = this.refunded;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode5 + i) * 31;
        Integer num = this.billedMinutes;
        int hashCode6 = (i2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.fromPromotion;
        return hashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public final boolean isExpired() {
        if (this.startedAt == null) {
            DateTime dateTime = this.expireAt;
            return dateTime != null ? dateTime.isBeforeNow() : false;
        }
        return false;
    }

    public String toString() {
        String str = this.f66625id;
        WireBird wireBird = this.bird;
        DateTime dateTime = this.startedAt;
        DateTime dateTime2 = this.expireAt;
        DateTime dateTime3 = this.completedAt;
        String str2 = this.rideId;
        long j = this.price;
        String str3 = this.currency;
        boolean z = this.refunded;
        Integer num = this.billedMinutes;
        Boolean bool = this.fromPromotion;
        return "Reservation(id=" + str + ", bird=" + wireBird + ", startedAt=" + dateTime + ", expireAt=" + dateTime2 + ", completedAt=" + dateTime3 + ", rideId=" + str2 + ", price=" + j + ", currency=" + str3 + ", refunded=" + z + ", billedMinutes=" + num + ", fromPromotion=" + bool + ")";
    }

    public /* synthetic */ Reservation(String str, WireBird wireBird, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, String str2, long j, String str3, boolean z, Integer num, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, wireBird, (i & 4) != 0 ? null : dateTime, (i & 8) != 0 ? null : dateTime2, (i & 16) != 0 ? null : dateTime3, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? 0L : j, (i & 128) != 0 ? Source.USD : str3, (i & 256) != 0 ? false : z, (i & 512) != 0 ? null : num, (i & 1024) != 0 ? Boolean.FALSE : bool);
    }
}
