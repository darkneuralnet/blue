package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.CouponKind;
import co.bird.android.model.constant.CouponOrigin;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.model.Source;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\bC\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÏ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018¢\u0006\u0002\u0010\u001aJ\t\u0010F\u001a\u00020\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010K\u001a\u00020\u0014HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018HÆ\u0003J\u000f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010S\u001a\u00020\tHÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\u0010\u0010U\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010;J\t\u0010V\u001a\u00020\rHÆ\u0003JØ\u0001\u0010W\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018HÆ\u0001¢\u0006\u0002\u0010XJ\t\u0010Y\u001a\u00020\tHÖ\u0001J\u0013\u0010Z\u001a\u00020\u00142\b\u0010[\u001a\u0004\u0018\u00010\\HÖ\u0003J\t\u0010]\u001a\u00020\tHÖ\u0001J\t\u0010^\u001a\u00020\u0003HÖ\u0001J\u0019\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020\tHÖ\u0001R \u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R \u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010$\"\u0004\b+\u0010&R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010$\"\u0004\b1\u0010&R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\"\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010>\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R \u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001c\"\u0004\b@\u0010\u001eR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010$\"\u0004\bB\u0010&R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u00107R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010$\"\u0004\bE\u0010&¨\u0006d"}, m28432d2 = {"Lco/bird/android/model/wire/WireCoupon;", "Landroid/os/Parcelable;", "id", "", "userId", "rideId", "linkId", "inviteeId", "maxAmount", "", "currency", "redeemedAmount", "kind", "Lco/bird/android/model/constant/CouponKind;", "createdAt", "Lorg/joda/time/DateTime;", "activatedAt", "expiresAt", "redeemedAt", "canSkipPreload", "", AnalyticsRequestV2.HEADER_ORIGIN, "Lco/bird/android/model/constant/CouponOrigin;", "storeIds", "", "merchantIds", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Lco/bird/android/model/constant/CouponKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLco/bird/android/model/constant/CouponOrigin;Ljava/util/List;Ljava/util/List;)V", "getActivatedAt", "()Lorg/joda/time/DateTime;", "setActivatedAt", "(Lorg/joda/time/DateTime;)V", "getCanSkipPreload", "()Z", "getCreatedAt", "setCreatedAt", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getExpiresAt", "getId", "setId", "getInviteeId", "setInviteeId", "getKind", "()Lco/bird/android/model/constant/CouponKind;", "setKind", "(Lco/bird/android/model/constant/CouponKind;)V", "getLinkId", "setLinkId", "getMaxAmount", "()I", "setMaxAmount", "(I)V", "getMerchantIds", "()Ljava/util/List;", "getOrigin", "()Lco/bird/android/model/constant/CouponOrigin;", "getRedeemedAmount", "()Ljava/lang/Integer;", "setRedeemedAmount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getRedeemedAt", "setRedeemedAt", "getRideId", "setRideId", "getStoreIds", "getUserId", "setUserId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Lco/bird/android/model/constant/CouponKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLco/bird/android/model/constant/CouponOrigin;Ljava/util/List;Ljava/util/List;)Lco/bird/android/model/wire/WireCoupon;", "describeContents", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireCoupon implements Parcelable {
    public static final Parcelable.Creator<WireCoupon> CREATOR = new Creator();
    @JsonProperty("activated_at")
    @InterfaceC41208ft5("activated_at")
    private DateTime activatedAt;
    @JsonProperty("can_skip_preload")
    @InterfaceC41208ft5("can_skip_preload")
    private final boolean canSkipPreload;
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private DateTime createdAt;
    @JsonProperty("currency")
    @InterfaceC41208ft5("currency")
    private String currency;
    @JsonProperty("expires_at")
    @InterfaceC41208ft5("expires_at")
    private final DateTime expiresAt;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private String f66723id;
    @JsonProperty("invitee_id")
    @InterfaceC41208ft5("invitee_id")
    private String inviteeId;
    @JsonProperty("kind")
    @InterfaceC41208ft5("kind")
    private CouponKind kind;
    @JsonProperty("link_id")
    @InterfaceC41208ft5("link_id")
    private String linkId;
    @JsonProperty("max_amount")
    @InterfaceC41208ft5("max_amount")
    private int maxAmount;
    @InterfaceC52952zi1(deserialize = true, serialize = false)
    private final List<String> merchantIds;
    @JsonProperty(AnalyticsRequestV2.HEADER_ORIGIN)
    @InterfaceC41208ft5(AnalyticsRequestV2.HEADER_ORIGIN)
    private final CouponOrigin origin;
    @JsonProperty("redeemed_amount")
    @InterfaceC41208ft5("redeemed_amount")
    private Integer redeemedAmount;
    @JsonProperty("redeemed_at")
    @InterfaceC41208ft5("redeemed_at")
    private DateTime redeemedAt;
    @JsonProperty("ride_id")
    @InterfaceC41208ft5("ride_id")
    private String rideId;
    @InterfaceC52952zi1(deserialize = true, serialize = false)
    private final List<String> storeIds;
    @JsonProperty("user_id")
    @InterfaceC41208ft5("user_id")
    private String userId;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireCoupon> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireCoupon createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WireCoupon(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), CouponKind.valueOf(parcel.readString()), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : CouponOrigin.valueOf(parcel.readString()), parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireCoupon[] newArray(int i) {
            return new WireCoupon[i];
        }
    }

    public WireCoupon() {
        this(null, null, null, null, null, 0, null, null, null, null, null, null, null, false, null, null, null, 131071, null);
    }

    public final String component1() {
        return this.f66723id;
    }

    public final DateTime component10() {
        return this.createdAt;
    }

    public final DateTime component11() {
        return this.activatedAt;
    }

    public final DateTime component12() {
        return this.expiresAt;
    }

    public final DateTime component13() {
        return this.redeemedAt;
    }

    public final boolean component14() {
        return this.canSkipPreload;
    }

    public final CouponOrigin component15() {
        return this.origin;
    }

    public final List<String> component16() {
        return this.storeIds;
    }

    public final List<String> component17() {
        return this.merchantIds;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.rideId;
    }

    public final String component4() {
        return this.linkId;
    }

    public final String component5() {
        return this.inviteeId;
    }

    public final int component6() {
        return this.maxAmount;
    }

    public final String component7() {
        return this.currency;
    }

    public final Integer component8() {
        return this.redeemedAmount;
    }

    public final CouponKind component9() {
        return this.kind;
    }

    public final WireCoupon copy(String id, String str, String str2, String str3, String str4, int i, String currency, Integer num, CouponKind kind, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, boolean z, CouponOrigin couponOrigin, List<String> storeIds, List<String> merchantIds) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(storeIds, "storeIds");
        Intrinsics.checkNotNullParameter(merchantIds, "merchantIds");
        return new WireCoupon(id, str, str2, str3, str4, i, currency, num, kind, dateTime, dateTime2, dateTime3, dateTime4, z, couponOrigin, storeIds, merchantIds);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireCoupon) {
            WireCoupon wireCoupon = (WireCoupon) obj;
            return Intrinsics.areEqual(this.f66723id, wireCoupon.f66723id) && Intrinsics.areEqual(this.userId, wireCoupon.userId) && Intrinsics.areEqual(this.rideId, wireCoupon.rideId) && Intrinsics.areEqual(this.linkId, wireCoupon.linkId) && Intrinsics.areEqual(this.inviteeId, wireCoupon.inviteeId) && this.maxAmount == wireCoupon.maxAmount && Intrinsics.areEqual(this.currency, wireCoupon.currency) && Intrinsics.areEqual(this.redeemedAmount, wireCoupon.redeemedAmount) && this.kind == wireCoupon.kind && Intrinsics.areEqual(this.createdAt, wireCoupon.createdAt) && Intrinsics.areEqual(this.activatedAt, wireCoupon.activatedAt) && Intrinsics.areEqual(this.expiresAt, wireCoupon.expiresAt) && Intrinsics.areEqual(this.redeemedAt, wireCoupon.redeemedAt) && this.canSkipPreload == wireCoupon.canSkipPreload && this.origin == wireCoupon.origin && Intrinsics.areEqual(this.storeIds, wireCoupon.storeIds) && Intrinsics.areEqual(this.merchantIds, wireCoupon.merchantIds);
        }
        return false;
    }

    public final DateTime getActivatedAt() {
        return this.activatedAt;
    }

    public final boolean getCanSkipPreload() {
        return this.canSkipPreload;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final DateTime getExpiresAt() {
        return this.expiresAt;
    }

    public final String getId() {
        return this.f66723id;
    }

    public final String getInviteeId() {
        return this.inviteeId;
    }

    public final CouponKind getKind() {
        return this.kind;
    }

    public final String getLinkId() {
        return this.linkId;
    }

    public final int getMaxAmount() {
        return this.maxAmount;
    }

    public final List<String> getMerchantIds() {
        return this.merchantIds;
    }

    public final CouponOrigin getOrigin() {
        return this.origin;
    }

    public final Integer getRedeemedAmount() {
        return this.redeemedAmount;
    }

    public final DateTime getRedeemedAt() {
        return this.redeemedAt;
    }

    public final String getRideId() {
        return this.rideId;
    }

    public final List<String> getStoreIds() {
        return this.storeIds;
    }

    public final String getUserId() {
        return this.userId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f66723id.hashCode() * 31;
        String str = this.userId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.rideId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.linkId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.inviteeId;
        int hashCode5 = (((((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + Integer.hashCode(this.maxAmount)) * 31) + this.currency.hashCode()) * 31;
        Integer num = this.redeemedAmount;
        int hashCode6 = (((hashCode5 + (num == null ? 0 : num.hashCode())) * 31) + this.kind.hashCode()) * 31;
        DateTime dateTime = this.createdAt;
        int hashCode7 = (hashCode6 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.activatedAt;
        int hashCode8 = (hashCode7 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        DateTime dateTime3 = this.expiresAt;
        int hashCode9 = (hashCode8 + (dateTime3 == null ? 0 : dateTime3.hashCode())) * 31;
        DateTime dateTime4 = this.redeemedAt;
        int hashCode10 = (hashCode9 + (dateTime4 == null ? 0 : dateTime4.hashCode())) * 31;
        boolean z = this.canSkipPreload;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode10 + i) * 31;
        CouponOrigin couponOrigin = this.origin;
        return ((((i2 + (couponOrigin != null ? couponOrigin.hashCode() : 0)) * 31) + this.storeIds.hashCode()) * 31) + this.merchantIds.hashCode();
    }

    public final void setActivatedAt(DateTime dateTime) {
        this.activatedAt = dateTime;
    }

    public final void setCreatedAt(DateTime dateTime) {
        this.createdAt = dateTime;
    }

    public final void setCurrency(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currency = str;
    }

    public final void setId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f66723id = str;
    }

    public final void setInviteeId(String str) {
        this.inviteeId = str;
    }

    public final void setKind(CouponKind couponKind) {
        Intrinsics.checkNotNullParameter(couponKind, "<set-?>");
        this.kind = couponKind;
    }

    public final void setLinkId(String str) {
        this.linkId = str;
    }

    public final void setMaxAmount(int i) {
        this.maxAmount = i;
    }

    public final void setRedeemedAmount(Integer num) {
        this.redeemedAmount = num;
    }

    public final void setRedeemedAt(DateTime dateTime) {
        this.redeemedAt = dateTime;
    }

    public final void setRideId(String str) {
        this.rideId = str;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    public String toString() {
        String str = this.f66723id;
        String str2 = this.userId;
        String str3 = this.rideId;
        String str4 = this.linkId;
        String str5 = this.inviteeId;
        int i = this.maxAmount;
        String str6 = this.currency;
        Integer num = this.redeemedAmount;
        CouponKind couponKind = this.kind;
        DateTime dateTime = this.createdAt;
        DateTime dateTime2 = this.activatedAt;
        DateTime dateTime3 = this.expiresAt;
        DateTime dateTime4 = this.redeemedAt;
        boolean z = this.canSkipPreload;
        CouponOrigin couponOrigin = this.origin;
        List<String> list = this.storeIds;
        List<String> list2 = this.merchantIds;
        return "WireCoupon(id=" + str + ", userId=" + str2 + ", rideId=" + str3 + ", linkId=" + str4 + ", inviteeId=" + str5 + ", maxAmount=" + i + ", currency=" + str6 + ", redeemedAmount=" + num + ", kind=" + couponKind + ", createdAt=" + dateTime + ", activatedAt=" + dateTime2 + ", expiresAt=" + dateTime3 + ", redeemedAt=" + dateTime4 + ", canSkipPreload=" + z + ", origin=" + couponOrigin + ", storeIds=" + list + ", merchantIds=" + list2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66723id);
        out.writeString(this.userId);
        out.writeString(this.rideId);
        out.writeString(this.linkId);
        out.writeString(this.inviteeId);
        out.writeInt(this.maxAmount);
        out.writeString(this.currency);
        Integer num = this.redeemedAmount;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeString(this.kind.name());
        out.writeSerializable(this.createdAt);
        out.writeSerializable(this.activatedAt);
        out.writeSerializable(this.expiresAt);
        out.writeSerializable(this.redeemedAt);
        out.writeInt(this.canSkipPreload ? 1 : 0);
        CouponOrigin couponOrigin = this.origin;
        if (couponOrigin == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(couponOrigin.name());
        }
        out.writeStringList(this.storeIds);
        out.writeStringList(this.merchantIds);
    }

    public WireCoupon(String id, String str, String str2, String str3, String str4, int i, String currency, Integer num, CouponKind kind, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, boolean z, CouponOrigin couponOrigin, List<String> storeIds, List<String> merchantIds) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(storeIds, "storeIds");
        Intrinsics.checkNotNullParameter(merchantIds, "merchantIds");
        this.f66723id = id;
        this.userId = str;
        this.rideId = str2;
        this.linkId = str3;
        this.inviteeId = str4;
        this.maxAmount = i;
        this.currency = currency;
        this.redeemedAmount = num;
        this.kind = kind;
        this.createdAt = dateTime;
        this.activatedAt = dateTime2;
        this.expiresAt = dateTime3;
        this.redeemedAt = dateTime4;
        this.canSkipPreload = z;
        this.origin = couponOrigin;
        this.storeIds = storeIds;
        this.merchantIds = merchantIds;
    }

    public /* synthetic */ WireCoupon(String str, String str2, String str3, String str4, String str5, int i, String str6, Integer num, CouponKind couponKind, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, boolean z, CouponOrigin couponOrigin, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? Source.USD : str6, (i2 & 128) != 0 ? 0 : num, (i2 & 256) != 0 ? CouponKind.PROMO : couponKind, (i2 & 512) != 0 ? null : dateTime, (i2 & 1024) != 0 ? null : dateTime2, (i2 & 2048) != 0 ? null : dateTime3, (i2 & 4096) != 0 ? null : dateTime4, (i2 & 8192) == 0 ? z : false, (i2 & 16384) != 0 ? null : couponOrigin, (i2 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 65536) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }
}
