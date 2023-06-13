package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0014J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0010HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\t\u00102\u001a\u00020\nHÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u00105\u001a\u00020\u000eHÆ\u0003J\u009c\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u00107J\u0013\u00108\u001a\u00020\u000e2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020\bHÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001b¨\u0006<"}, m28432d2 = {"Lco/bird/android/model/persistence/Ride;", "", "id", "", "birdId", "privateBirdId", "partnerId", "cost", "", "distance", "", "currency", "billedMinutes", "payAsYouGo", "", "startedAt", "Lorg/joda/time/DateTime;", "completedAt", "continuedAt", "canceledAt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;Ljava/lang/Integer;ZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "getBilledMinutes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBirdId", "()Ljava/lang/String;", "getCanceledAt", "()Lorg/joda/time/DateTime;", "getCompletedAt", "getContinuedAt", "getCost", "()I", "getCurrency", "getDistance", "()D", "getId", "getPartnerId", "getPayAsYouGo", "()Z", "getPrivateBirdId", "getStartedAt", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;Ljava/lang/Integer;ZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Lco/bird/android/model/persistence/Ride;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class Ride {
    private final Integer billedMinutes;
    private final String birdId;
    private final DateTime canceledAt;
    private final DateTime completedAt;
    private final DateTime continuedAt;
    private final int cost;
    private final String currency;
    private final double distance;

    /* renamed from: id */
    private final String f66686id;
    private final String partnerId;
    private final boolean payAsYouGo;
    private final String privateBirdId;
    private final DateTime startedAt;

    public Ride(String id, String birdId, String str, String str2, int i, double d, String currency, Integer num, boolean z, DateTime startedAt, DateTime dateTime, DateTime dateTime2, DateTime dateTime3) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(startedAt, "startedAt");
        this.f66686id = id;
        this.birdId = birdId;
        this.privateBirdId = str;
        this.partnerId = str2;
        this.cost = i;
        this.distance = d;
        this.currency = currency;
        this.billedMinutes = num;
        this.payAsYouGo = z;
        this.startedAt = startedAt;
        this.completedAt = dateTime;
        this.continuedAt = dateTime2;
        this.canceledAt = dateTime3;
    }

    public final String component1() {
        return this.f66686id;
    }

    public final DateTime component10() {
        return this.startedAt;
    }

    public final DateTime component11() {
        return this.completedAt;
    }

    public final DateTime component12() {
        return this.continuedAt;
    }

    public final DateTime component13() {
        return this.canceledAt;
    }

    public final String component2() {
        return this.birdId;
    }

    public final String component3() {
        return this.privateBirdId;
    }

    public final String component4() {
        return this.partnerId;
    }

    public final int component5() {
        return this.cost;
    }

    public final double component6() {
        return this.distance;
    }

    public final String component7() {
        return this.currency;
    }

    public final Integer component8() {
        return this.billedMinutes;
    }

    public final boolean component9() {
        return this.payAsYouGo;
    }

    public final Ride copy(String id, String birdId, String str, String str2, int i, double d, String currency, Integer num, boolean z, DateTime startedAt, DateTime dateTime, DateTime dateTime2, DateTime dateTime3) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(startedAt, "startedAt");
        return new Ride(id, birdId, str, str2, i, d, currency, num, z, startedAt, dateTime, dateTime2, dateTime3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Ride) {
            Ride ride = (Ride) obj;
            return Intrinsics.areEqual(this.f66686id, ride.f66686id) && Intrinsics.areEqual(this.birdId, ride.birdId) && Intrinsics.areEqual(this.privateBirdId, ride.privateBirdId) && Intrinsics.areEqual(this.partnerId, ride.partnerId) && this.cost == ride.cost && Double.compare(this.distance, ride.distance) == 0 && Intrinsics.areEqual(this.currency, ride.currency) && Intrinsics.areEqual(this.billedMinutes, ride.billedMinutes) && this.payAsYouGo == ride.payAsYouGo && Intrinsics.areEqual(this.startedAt, ride.startedAt) && Intrinsics.areEqual(this.completedAt, ride.completedAt) && Intrinsics.areEqual(this.continuedAt, ride.continuedAt) && Intrinsics.areEqual(this.canceledAt, ride.canceledAt);
        }
        return false;
    }

    public final Integer getBilledMinutes() {
        return this.billedMinutes;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final DateTime getCanceledAt() {
        return this.canceledAt;
    }

    public final DateTime getCompletedAt() {
        return this.completedAt;
    }

    public final DateTime getContinuedAt() {
        return this.continuedAt;
    }

    public final int getCost() {
        return this.cost;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final double getDistance() {
        return this.distance;
    }

    public final String getId() {
        return this.f66686id;
    }

    public final String getPartnerId() {
        return this.partnerId;
    }

    public final boolean getPayAsYouGo() {
        return this.payAsYouGo;
    }

    public final String getPrivateBirdId() {
        return this.privateBirdId;
    }

    public final DateTime getStartedAt() {
        return this.startedAt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f66686id.hashCode() * 31) + this.birdId.hashCode()) * 31;
        String str = this.privateBirdId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.partnerId;
        int hashCode3 = (((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.cost)) * 31) + Double.hashCode(this.distance)) * 31) + this.currency.hashCode()) * 31;
        Integer num = this.billedMinutes;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z = this.payAsYouGo;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode5 = (((hashCode4 + i) * 31) + this.startedAt.hashCode()) * 31;
        DateTime dateTime = this.completedAt;
        int hashCode6 = (hashCode5 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.continuedAt;
        int hashCode7 = (hashCode6 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        DateTime dateTime3 = this.canceledAt;
        return hashCode7 + (dateTime3 != null ? dateTime3.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66686id;
        String str2 = this.birdId;
        String str3 = this.privateBirdId;
        String str4 = this.partnerId;
        int i = this.cost;
        double d = this.distance;
        String str5 = this.currency;
        Integer num = this.billedMinutes;
        boolean z = this.payAsYouGo;
        DateTime dateTime = this.startedAt;
        DateTime dateTime2 = this.completedAt;
        DateTime dateTime3 = this.continuedAt;
        DateTime dateTime4 = this.canceledAt;
        return "Ride(id=" + str + ", birdId=" + str2 + ", privateBirdId=" + str3 + ", partnerId=" + str4 + ", cost=" + i + ", distance=" + d + ", currency=" + str5 + ", billedMinutes=" + num + ", payAsYouGo=" + z + ", startedAt=" + dateTime + ", completedAt=" + dateTime2 + ", continuedAt=" + dateTime3 + ", canceledAt=" + dateTime4 + ")";
    }

    public /* synthetic */ Ride(String str, String str2, String str3, String str4, int i, double d, String str5, Integer num, boolean z, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, i, d, str5, (i2 & 128) != 0 ? null : num, (i2 & 256) != 0 ? false : z, dateTime, (i2 & 1024) != 0 ? null : dateTime2, (i2 & 2048) != 0 ? null : dateTime3, (i2 & 4096) != 0 ? null : dateTime4);
    }
}
