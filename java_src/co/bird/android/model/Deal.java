package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.Source;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0012J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u0095\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\nHÆ\u0001J\t\u00103\u001a\u00020\u0006HÖ\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u00020\u0006HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001J\u0019\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010!R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0014R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0014¨\u0006?"}, m28432d2 = {"Lco/bird/android/model/Deal;", "Landroid/os/Parcelable;", "type", "", "id", "addAmount", "", "duration", "currency", "expiresAt", "Lorg/joda/time/DateTime;", "bannerTitle", "bannerSubtitle", "title", "subtitle", "accept", "reject", "shownAt", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;)V", "getAccept", "()Ljava/lang/String;", "getAddAmount", "()I", "getBannerSubtitle", "getBannerTitle", "getCurrency", "getDuration", "getExpiresAt", "()Lorg/joda/time/DateTime;", "getId", "getReject", "getShownAt", "setShownAt", "(Lorg/joda/time/DateTime;)V", "getSubtitle", "getTitle", "getType", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class Deal implements Parcelable {
    public static final Parcelable.Creator<Deal> CREATOR = new Creator();
    @JsonProperty("accept")
    @InterfaceC41208ft5("accept")
    private final String accept;
    @JsonProperty("add_amount")
    @InterfaceC41208ft5("add_amount")
    private final int addAmount;
    @JsonProperty("banner_subtitle")
    @InterfaceC41208ft5("banner_subtitle")
    private final String bannerSubtitle;
    @JsonProperty("banner_title")
    @InterfaceC41208ft5("banner_title")
    private final String bannerTitle;
    @JsonProperty("currency")
    @InterfaceC41208ft5("currency")
    private final String currency;
    @JsonProperty("duration")
    @InterfaceC41208ft5("duration")
    private final int duration;
    @JsonProperty("expires_at")
    @InterfaceC41208ft5("expires_at")
    private final DateTime expiresAt;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66584id;
    @JsonProperty("reject")
    @InterfaceC41208ft5("reject")
    private final String reject;
    private DateTime shownAt;
    @JsonProperty("subtitle")
    @InterfaceC41208ft5("subtitle")
    private final String subtitle;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;
    @JsonProperty("type")
    @InterfaceC41208ft5("type")
    private final String type;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<Deal> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Deal createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Deal(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), (DateTime) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (DateTime) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Deal[] newArray(int i) {
            return new Deal[i];
        }
    }

    public Deal() {
        this(null, null, 0, 0, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public final String component1() {
        return this.type;
    }

    public final String component10() {
        return this.subtitle;
    }

    public final String component11() {
        return this.accept;
    }

    public final String component12() {
        return this.reject;
    }

    public final DateTime component13() {
        return this.shownAt;
    }

    public final String component2() {
        return this.f66584id;
    }

    public final int component3() {
        return this.addAmount;
    }

    public final int component4() {
        return this.duration;
    }

    public final String component5() {
        return this.currency;
    }

    public final DateTime component6() {
        return this.expiresAt;
    }

    public final String component7() {
        return this.bannerTitle;
    }

    public final String component8() {
        return this.bannerSubtitle;
    }

    public final String component9() {
        return this.title;
    }

    public final Deal copy(String str, String id, int i, int i2, String currency, DateTime dateTime, String bannerTitle, String str2, String title, String str3, String accept, String reject, DateTime dateTime2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(bannerTitle, "bannerTitle");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(accept, "accept");
        Intrinsics.checkNotNullParameter(reject, "reject");
        return new Deal(str, id, i, i2, currency, dateTime, bannerTitle, str2, title, str3, accept, reject, dateTime2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Deal) {
            Deal deal = (Deal) obj;
            return Intrinsics.areEqual(this.type, deal.type) && Intrinsics.areEqual(this.f66584id, deal.f66584id) && this.addAmount == deal.addAmount && this.duration == deal.duration && Intrinsics.areEqual(this.currency, deal.currency) && Intrinsics.areEqual(this.expiresAt, deal.expiresAt) && Intrinsics.areEqual(this.bannerTitle, deal.bannerTitle) && Intrinsics.areEqual(this.bannerSubtitle, deal.bannerSubtitle) && Intrinsics.areEqual(this.title, deal.title) && Intrinsics.areEqual(this.subtitle, deal.subtitle) && Intrinsics.areEqual(this.accept, deal.accept) && Intrinsics.areEqual(this.reject, deal.reject) && Intrinsics.areEqual(this.shownAt, deal.shownAt);
        }
        return false;
    }

    public final String getAccept() {
        return this.accept;
    }

    public final int getAddAmount() {
        return this.addAmount;
    }

    public final String getBannerSubtitle() {
        return this.bannerSubtitle;
    }

    public final String getBannerTitle() {
        return this.bannerTitle;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final DateTime getExpiresAt() {
        return this.expiresAt;
    }

    public final String getId() {
        return this.f66584id;
    }

    public final String getReject() {
        return this.reject;
    }

    public final DateTime getShownAt() {
        return this.shownAt;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int hashCode = (((((((((str == null ? 0 : str.hashCode()) * 31) + this.f66584id.hashCode()) * 31) + Integer.hashCode(this.addAmount)) * 31) + Integer.hashCode(this.duration)) * 31) + this.currency.hashCode()) * 31;
        DateTime dateTime = this.expiresAt;
        int hashCode2 = (((hashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31) + this.bannerTitle.hashCode()) * 31;
        String str2 = this.bannerSubtitle;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.title.hashCode()) * 31;
        String str3 = this.subtitle;
        int hashCode4 = (((((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.accept.hashCode()) * 31) + this.reject.hashCode()) * 31;
        DateTime dateTime2 = this.shownAt;
        return hashCode4 + (dateTime2 != null ? dateTime2.hashCode() : 0);
    }

    public final void setShownAt(DateTime dateTime) {
        this.shownAt = dateTime;
    }

    public String toString() {
        String str = this.type;
        String str2 = this.f66584id;
        int i = this.addAmount;
        int i2 = this.duration;
        String str3 = this.currency;
        DateTime dateTime = this.expiresAt;
        String str4 = this.bannerTitle;
        String str5 = this.bannerSubtitle;
        String str6 = this.title;
        String str7 = this.subtitle;
        String str8 = this.accept;
        String str9 = this.reject;
        DateTime dateTime2 = this.shownAt;
        return "Deal(type=" + str + ", id=" + str2 + ", addAmount=" + i + ", duration=" + i2 + ", currency=" + str3 + ", expiresAt=" + dateTime + ", bannerTitle=" + str4 + ", bannerSubtitle=" + str5 + ", title=" + str6 + ", subtitle=" + str7 + ", accept=" + str8 + ", reject=" + str9 + ", shownAt=" + dateTime2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.type);
        out.writeString(this.f66584id);
        out.writeInt(this.addAmount);
        out.writeInt(this.duration);
        out.writeString(this.currency);
        out.writeSerializable(this.expiresAt);
        out.writeString(this.bannerTitle);
        out.writeString(this.bannerSubtitle);
        out.writeString(this.title);
        out.writeString(this.subtitle);
        out.writeString(this.accept);
        out.writeString(this.reject);
        out.writeSerializable(this.shownAt);
    }

    public Deal(String str, String id, int i, int i2, String currency, DateTime dateTime, String bannerTitle, String str2, String title, String str3, String accept, String reject, DateTime dateTime2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(bannerTitle, "bannerTitle");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(accept, "accept");
        Intrinsics.checkNotNullParameter(reject, "reject");
        this.type = str;
        this.f66584id = id;
        this.addAmount = i;
        this.duration = i2;
        this.currency = currency;
        this.expiresAt = dateTime;
        this.bannerTitle = bannerTitle;
        this.bannerSubtitle = str2;
        this.title = title;
        this.subtitle = str3;
        this.accept = accept;
        this.reject = reject;
        this.shownAt = dateTime2;
    }

    public /* synthetic */ Deal(String str, String str2, int i, int i2, String str3, DateTime dateTime, String str4, String str5, String str6, String str7, String str8, String str9, DateTime dateTime2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) == 0 ? i2 : 0, (i3 & 16) != 0 ? Source.USD : str3, (i3 & 32) != 0 ? null : dateTime, (i3 & 64) != 0 ? "" : str4, (i3 & 128) != 0 ? null : str5, (i3 & 256) != 0 ? "" : str6, (i3 & 512) != 0 ? null : str7, (i3 & 1024) != 0 ? "" : str8, (i3 & 2048) == 0 ? str9 : "", (i3 & 4096) == 0 ? dateTime2 : null);
    }
}
