package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.CouponDisplayActivatedStatus;
import co.bird.android.model.constant.CouponDisplayIcon;
import co.bird.android.model.constant.CouponDisplayTag;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0012J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jz\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016¨\u00066"}, m28432d2 = {"Lco/bird/android/model/wire/WireCouponDisplayView;", "", "couponId", "", "title", "body", "icon", "Lco/bird/android/model/constant/CouponDisplayIcon;", "tag", "Lco/bird/android/model/constant/CouponDisplayTag;", "activatedStatus", "Lco/bird/android/model/constant/CouponDisplayActivatedStatus;", "expiresAt", "Lorg/joda/time/DateTime;", "timerThreshold", "", "flagText", "ridePassId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/CouponDisplayIcon;Lco/bird/android/model/constant/CouponDisplayTag;Lco/bird/android/model/constant/CouponDisplayActivatedStatus;Lorg/joda/time/DateTime;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "getActivatedStatus", "()Lco/bird/android/model/constant/CouponDisplayActivatedStatus;", "getBody", "()Ljava/lang/String;", "getCouponId", "getExpiresAt", "()Lorg/joda/time/DateTime;", "getFlagText", "getIcon", "()Lco/bird/android/model/constant/CouponDisplayIcon;", "getRidePassId", "getTag", "()Lco/bird/android/model/constant/CouponDisplayTag;", "getTimerThreshold", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getTitle", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/CouponDisplayIcon;Lco/bird/android/model/constant/CouponDisplayTag;Lco/bird/android/model/constant/CouponDisplayActivatedStatus;Lorg/joda/time/DateTime;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lco/bird/android/model/wire/WireCouponDisplayView;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireCouponDisplayView {
    @JsonProperty("activated_status")
    @InterfaceC41208ft5("activated_status")
    private final CouponDisplayActivatedStatus activatedStatus;
    @JsonProperty("body")
    @InterfaceC41208ft5("body")
    private final String body;
    @JsonProperty("coupon_id")
    @InterfaceC41208ft5("coupon_id")
    private final String couponId;
    @JsonProperty("expires_at")
    @InterfaceC41208ft5("expires_at")
    private final DateTime expiresAt;
    @JsonProperty("flag_text")
    @InterfaceC41208ft5("flag_text")
    private final String flagText;
    @JsonProperty("icon")
    @InterfaceC41208ft5("icon")
    private final CouponDisplayIcon icon;
    @JsonProperty("ride_pass_id")
    @InterfaceC41208ft5("ride_pass_id")
    private final String ridePassId;
    @JsonProperty("tag")
    @InterfaceC41208ft5("tag")
    private final CouponDisplayTag tag;
    @JsonProperty("timer_threshold")
    @InterfaceC41208ft5("timer_threshold")
    private final Double timerThreshold;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public WireCouponDisplayView(String couponId, String title, String body, CouponDisplayIcon icon, CouponDisplayTag tag, CouponDisplayActivatedStatus activatedStatus, DateTime dateTime, Double d, String str, String str2) {
        Intrinsics.checkNotNullParameter(couponId, "couponId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(activatedStatus, "activatedStatus");
        this.couponId = couponId;
        this.title = title;
        this.body = body;
        this.icon = icon;
        this.tag = tag;
        this.activatedStatus = activatedStatus;
        this.expiresAt = dateTime;
        this.timerThreshold = d;
        this.flagText = str;
        this.ridePassId = str2;
    }

    public final String component1() {
        return this.couponId;
    }

    public final String component10() {
        return this.ridePassId;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.body;
    }

    public final CouponDisplayIcon component4() {
        return this.icon;
    }

    public final CouponDisplayTag component5() {
        return this.tag;
    }

    public final CouponDisplayActivatedStatus component6() {
        return this.activatedStatus;
    }

    public final DateTime component7() {
        return this.expiresAt;
    }

    public final Double component8() {
        return this.timerThreshold;
    }

    public final String component9() {
        return this.flagText;
    }

    public final WireCouponDisplayView copy(String couponId, String title, String body, CouponDisplayIcon icon, CouponDisplayTag tag, CouponDisplayActivatedStatus activatedStatus, DateTime dateTime, Double d, String str, String str2) {
        Intrinsics.checkNotNullParameter(couponId, "couponId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(activatedStatus, "activatedStatus");
        return new WireCouponDisplayView(couponId, title, body, icon, tag, activatedStatus, dateTime, d, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireCouponDisplayView) {
            WireCouponDisplayView wireCouponDisplayView = (WireCouponDisplayView) obj;
            return Intrinsics.areEqual(this.couponId, wireCouponDisplayView.couponId) && Intrinsics.areEqual(this.title, wireCouponDisplayView.title) && Intrinsics.areEqual(this.body, wireCouponDisplayView.body) && this.icon == wireCouponDisplayView.icon && this.tag == wireCouponDisplayView.tag && this.activatedStatus == wireCouponDisplayView.activatedStatus && Intrinsics.areEqual(this.expiresAt, wireCouponDisplayView.expiresAt) && Intrinsics.areEqual((Object) this.timerThreshold, (Object) wireCouponDisplayView.timerThreshold) && Intrinsics.areEqual(this.flagText, wireCouponDisplayView.flagText) && Intrinsics.areEqual(this.ridePassId, wireCouponDisplayView.ridePassId);
        }
        return false;
    }

    public final CouponDisplayActivatedStatus getActivatedStatus() {
        return this.activatedStatus;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getCouponId() {
        return this.couponId;
    }

    public final DateTime getExpiresAt() {
        return this.expiresAt;
    }

    public final String getFlagText() {
        return this.flagText;
    }

    public final CouponDisplayIcon getIcon() {
        return this.icon;
    }

    public final String getRidePassId() {
        return this.ridePassId;
    }

    public final CouponDisplayTag getTag() {
        return this.tag;
    }

    public final Double getTimerThreshold() {
        return this.timerThreshold;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.couponId.hashCode() * 31) + this.title.hashCode()) * 31) + this.body.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.tag.hashCode()) * 31) + this.activatedStatus.hashCode()) * 31;
        DateTime dateTime = this.expiresAt;
        int hashCode2 = (hashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        Double d = this.timerThreshold;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.flagText;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.ridePassId;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.couponId;
        String str2 = this.title;
        String str3 = this.body;
        CouponDisplayIcon couponDisplayIcon = this.icon;
        CouponDisplayTag couponDisplayTag = this.tag;
        CouponDisplayActivatedStatus couponDisplayActivatedStatus = this.activatedStatus;
        DateTime dateTime = this.expiresAt;
        Double d = this.timerThreshold;
        String str4 = this.flagText;
        String str5 = this.ridePassId;
        return "WireCouponDisplayView(couponId=" + str + ", title=" + str2 + ", body=" + str3 + ", icon=" + couponDisplayIcon + ", tag=" + couponDisplayTag + ", activatedStatus=" + couponDisplayActivatedStatus + ", expiresAt=" + dateTime + ", timerThreshold=" + d + ", flagText=" + str4 + ", ridePassId=" + str5 + ")";
    }

    public /* synthetic */ WireCouponDisplayView(String str, String str2, String str3, CouponDisplayIcon couponDisplayIcon, CouponDisplayTag couponDisplayTag, CouponDisplayActivatedStatus couponDisplayActivatedStatus, DateTime dateTime, Double d, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, couponDisplayIcon, couponDisplayTag, couponDisplayActivatedStatus, (i & 64) != 0 ? null : dateTime, (i & 128) != 0 ? null : d, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : str5);
    }
}
