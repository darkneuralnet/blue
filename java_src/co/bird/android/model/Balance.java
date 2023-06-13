package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.Source;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0012J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010-\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010.\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010/\u001a\u0004\u0018\u00010\tHÆ\u0003J\u008a\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00101J\t\u00102\u001a\u00020\u000bHÖ\u0001J\u0013\u00103\u001a\u00020\r2\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u00020\u000bHÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001J\u0019\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u000bHÖ\u0001R\u001a\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001c\u0010\u0019R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 ¨\u0006="}, m28432d2 = {"Lco/bird/android/model/Balance;", "Landroid/os/Parcelable;", "id", "", "userId", "balance", "", "currency", "autoPayAskedAt", "Lorg/joda/time/DateTime;", "autoPayRefillAmount", "", "autoPayActive", "", "autoPayIncentiveAmount", "autoPayIncentiveRewardedAt", "intentId", "clientSecret", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;)V", "getAutoPayActive", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAutoPayAskedAt", "()Lorg/joda/time/DateTime;", "getAutoPayIncentiveAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAutoPayIncentiveRewardedAt", "getAutoPayRefillAmount", "getBalance", "()J", "getClientSecret", "()Ljava/lang/String;", "getCurrency", "getId", "getIntentId", "getUserId", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;)Lco/bird/android/model/Balance;", "describeContents", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class Balance implements Parcelable {
    public static final Parcelable.Creator<Balance> CREATOR = new Creator();
    @JsonProperty("auto_pay_active")
    @InterfaceC41208ft5("auto_pay_active")
    private final Boolean autoPayActive;
    @JsonProperty("auto_pay_asked_at")
    @InterfaceC41208ft5("auto_pay_asked_at")
    private final DateTime autoPayAskedAt;
    @JsonProperty("auto_pay_incentive_amount")
    @InterfaceC41208ft5("auto_pay_incentive_amount")
    private final Integer autoPayIncentiveAmount;
    @JsonProperty("auto_pay_incentive_rewarded_at")
    @InterfaceC41208ft5("auto_pay_incentive_rewarded_at")
    private final DateTime autoPayIncentiveRewardedAt;
    @JsonProperty("auto_pay_refill_amount")
    @InterfaceC41208ft5("auto_pay_refill_amount")
    private final Integer autoPayRefillAmount;
    @JsonProperty("balance")
    @InterfaceC41208ft5("balance")
    private final long balance;
    @JsonProperty("client_secret")
    @InterfaceC41208ft5("client_secret")
    private final String clientSecret;
    @JsonProperty("currency")
    @InterfaceC41208ft5("currency")
    private final String currency;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66568id;
    @JsonProperty("intent_id")
    @InterfaceC41208ft5("intent_id")
    private final String intentId;
    @JsonProperty("user_id")
    @InterfaceC41208ft5("user_id")
    private final String userId;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<Balance> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Balance createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            long readLong = parcel.readLong();
            String readString3 = parcel.readString();
            DateTime dateTime = (DateTime) parcel.readSerializable();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Balance(readString, readString2, readLong, readString3, dateTime, valueOf2, valueOf, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (DateTime) parcel.readSerializable(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Balance[] newArray(int i) {
            return new Balance[i];
        }
    }

    public Balance() {
        this(null, null, 0L, null, null, null, null, null, null, null, null, 2047, null);
    }

    public final String component1() {
        return this.f66568id;
    }

    public final String component10() {
        return this.intentId;
    }

    public final String component11() {
        return this.clientSecret;
    }

    public final String component2() {
        return this.userId;
    }

    public final long component3() {
        return this.balance;
    }

    public final String component4() {
        return this.currency;
    }

    public final DateTime component5() {
        return this.autoPayAskedAt;
    }

    public final Integer component6() {
        return this.autoPayRefillAmount;
    }

    public final Boolean component7() {
        return this.autoPayActive;
    }

    public final Integer component8() {
        return this.autoPayIncentiveAmount;
    }

    public final DateTime component9() {
        return this.autoPayIncentiveRewardedAt;
    }

    public final Balance copy(String id, String userId, long j, String currency, DateTime dateTime, Integer num, Boolean bool, Integer num2, DateTime dateTime2, String str, String str2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new Balance(id, userId, j, currency, dateTime, num, bool, num2, dateTime2, str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Balance) {
            Balance balance = (Balance) obj;
            return Intrinsics.areEqual(this.f66568id, balance.f66568id) && Intrinsics.areEqual(this.userId, balance.userId) && this.balance == balance.balance && Intrinsics.areEqual(this.currency, balance.currency) && Intrinsics.areEqual(this.autoPayAskedAt, balance.autoPayAskedAt) && Intrinsics.areEqual(this.autoPayRefillAmount, balance.autoPayRefillAmount) && Intrinsics.areEqual(this.autoPayActive, balance.autoPayActive) && Intrinsics.areEqual(this.autoPayIncentiveAmount, balance.autoPayIncentiveAmount) && Intrinsics.areEqual(this.autoPayIncentiveRewardedAt, balance.autoPayIncentiveRewardedAt) && Intrinsics.areEqual(this.intentId, balance.intentId) && Intrinsics.areEqual(this.clientSecret, balance.clientSecret);
        }
        return false;
    }

    public final Boolean getAutoPayActive() {
        return this.autoPayActive;
    }

    public final DateTime getAutoPayAskedAt() {
        return this.autoPayAskedAt;
    }

    public final Integer getAutoPayIncentiveAmount() {
        return this.autoPayIncentiveAmount;
    }

    public final DateTime getAutoPayIncentiveRewardedAt() {
        return this.autoPayIncentiveRewardedAt;
    }

    public final Integer getAutoPayRefillAmount() {
        return this.autoPayRefillAmount;
    }

    public final long getBalance() {
        return this.balance;
    }

    public final String getClientSecret() {
        return this.clientSecret;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getId() {
        return this.f66568id;
    }

    public final String getIntentId() {
        return this.intentId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode = ((((((this.f66568id.hashCode() * 31) + this.userId.hashCode()) * 31) + Long.hashCode(this.balance)) * 31) + this.currency.hashCode()) * 31;
        DateTime dateTime = this.autoPayAskedAt;
        int hashCode2 = (hashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        Integer num = this.autoPayRefillAmount;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.autoPayActive;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.autoPayIncentiveAmount;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        DateTime dateTime2 = this.autoPayIncentiveRewardedAt;
        int hashCode6 = (hashCode5 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        String str = this.intentId;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.clientSecret;
        return hashCode7 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66568id;
        String str2 = this.userId;
        long j = this.balance;
        String str3 = this.currency;
        DateTime dateTime = this.autoPayAskedAt;
        Integer num = this.autoPayRefillAmount;
        Boolean bool = this.autoPayActive;
        Integer num2 = this.autoPayIncentiveAmount;
        DateTime dateTime2 = this.autoPayIncentiveRewardedAt;
        String str4 = this.intentId;
        String str5 = this.clientSecret;
        return "Balance(id=" + str + ", userId=" + str2 + ", balance=" + j + ", currency=" + str3 + ", autoPayAskedAt=" + dateTime + ", autoPayRefillAmount=" + num + ", autoPayActive=" + bool + ", autoPayIncentiveAmount=" + num2 + ", autoPayIncentiveRewardedAt=" + dateTime2 + ", intentId=" + str4 + ", clientSecret=" + str5 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66568id);
        out.writeString(this.userId);
        out.writeLong(this.balance);
        out.writeString(this.currency);
        out.writeSerializable(this.autoPayAskedAt);
        Integer num = this.autoPayRefillAmount;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        Boolean bool = this.autoPayActive;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num2 = this.autoPayIncentiveAmount;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }
        out.writeSerializable(this.autoPayIncentiveRewardedAt);
        out.writeString(this.intentId);
        out.writeString(this.clientSecret);
    }

    public Balance(String id, String userId, long j, String currency, DateTime dateTime, Integer num, Boolean bool, Integer num2, DateTime dateTime2, String str, String str2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f66568id = id;
        this.userId = userId;
        this.balance = j;
        this.currency = currency;
        this.autoPayAskedAt = dateTime;
        this.autoPayRefillAmount = num;
        this.autoPayActive = bool;
        this.autoPayIncentiveAmount = num2;
        this.autoPayIncentiveRewardedAt = dateTime2;
        this.intentId = str;
        this.clientSecret = str2;
    }

    public /* synthetic */ Balance(String str, String str2, long j, String str3, DateTime dateTime, Integer num, Boolean bool, Integer num2, DateTime dateTime2, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? Source.USD : str3, (i & 16) != 0 ? null : dateTime, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : dateTime2, (i & 512) != 0 ? null : str4, (i & 1024) == 0 ? str5 : null);
    }
}
