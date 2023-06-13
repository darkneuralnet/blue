package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.RidePassViewIneligibleReason;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bC\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B«\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0002\u0010#J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010?J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\u0011\u0010T\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001aHÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010!HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010!HÆ\u0003J\t\u0010Z\u001a\u00020\u0006HÆ\u0003J\u0010\u0010[\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u00109J\u0010\u0010\\\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u00109J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J´\u0002\u0010a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!HÆ\u0001¢\u0006\u0002\u0010bJ\t\u0010c\u001a\u00020\u0013HÖ\u0001J\u0013\u0010d\u001a\u00020e2\b\u0010f\u001a\u0004\u0018\u00010gHÖ\u0003J\t\u0010h\u001a\u00020\u0013HÖ\u0001J\t\u0010i\u001a\u00020\u0003HÖ\u0001J\u0019\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020m2\u0006\u0010n\u001a\u00020\u0013HÖ\u0001R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0018\u0010 \u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010%R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010%R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010%R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010*R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010%R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010%R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010%R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010:\u001a\u0004\b8\u00109R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010:\u001a\u0004\b=\u00109R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010@\u001a\u0004\b>\u0010?R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010%R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010%R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010%¨\u0006o"}, m28432d2 = {"Lco/bird/android/model/wire/WireRidePassView;", "Landroid/os/Parcelable;", "userRidePassId", "", "linkCode", "price", "", "priceTax", "previousPrice", "currency", "bannerImageUrl", "bannerAction", "title", "zendeskArticleId", "confirmationToast", "label", "ineligibleReason", "Lco/bird/android/model/constant/RidePassViewIneligibleReason;", "remainingDeviceTransferCount", "", "cancelArticleId", "footer", "detailBody", "detailImageUrl", "detailAction", "detailBodyList", "", "detailFooter", "subscriptionPlan", "Lco/bird/android/model/wire/WireRidePassSubscriptionPlanView;", "userSubscription", "Lco/bird/android/model/wire/WireRidePassUserSubscriptionView;", "createdAt", "Lorg/joda/time/DateTime;", "expiresAt", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/RidePassViewIneligibleReason;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lco/bird/android/model/wire/WireRidePassSubscriptionPlanView;Lco/bird/android/model/wire/WireRidePassUserSubscriptionView;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "getBannerAction", "()Ljava/lang/String;", "getBannerImageUrl", "getCancelArticleId", "getConfirmationToast", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getCurrency", "getDetailAction", "getDetailBody", "getDetailBodyList", "()Ljava/util/List;", "getDetailFooter", "getDetailImageUrl", "getExpiresAt", "getFooter", "getIneligibleReason", "()Lco/bird/android/model/constant/RidePassViewIneligibleReason;", "getLabel", "getLinkCode", "getPreviousPrice", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPrice", "()J", "getPriceTax", "getRemainingDeviceTransferCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSubscriptionPlan", "()Lco/bird/android/model/wire/WireRidePassSubscriptionPlanView;", "getTitle", "getUserRidePassId", "getUserSubscription", "()Lco/bird/android/model/wire/WireRidePassUserSubscriptionView;", "getZendeskArticleId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/RidePassViewIneligibleReason;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lco/bird/android/model/wire/WireRidePassSubscriptionPlanView;Lco/bird/android/model/wire/WireRidePassUserSubscriptionView;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Lco/bird/android/model/wire/WireRidePassView;", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireRidePassView implements Parcelable {
    public static final Parcelable.Creator<WireRidePassView> CREATOR = new Creator();
    @JsonProperty("banner_action")
    @InterfaceC41208ft5("banner_action")
    private final String bannerAction;
    @JsonProperty("banner_image_url")
    @InterfaceC41208ft5("banner_image_url")
    private final String bannerImageUrl;
    @JsonProperty("cancel_article_id")
    @InterfaceC41208ft5("cancel_article_id")
    private final String cancelArticleId;
    @JsonProperty("confirmation_toast")
    @InterfaceC41208ft5("confirmation_toast")
    private final String confirmationToast;
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("currency")
    @InterfaceC41208ft5("currency")
    private final String currency;
    @JsonProperty("detail_action")
    @InterfaceC41208ft5("detail_action")
    private final String detailAction;
    @JsonProperty("detail_body")
    @InterfaceC41208ft5("detail_body")
    private final String detailBody;
    @JsonProperty("detail_body_list")
    @InterfaceC41208ft5("detail_body_list")
    private final List<String> detailBodyList;
    @JsonProperty("detail_footer")
    @InterfaceC41208ft5("detail_footer")
    private final String detailFooter;
    @JsonProperty("detail_image_url")
    @InterfaceC41208ft5("detail_image_url")
    private final String detailImageUrl;
    @JsonProperty("expires_at")
    @InterfaceC41208ft5("expires_at")
    private final DateTime expiresAt;
    @JsonProperty("footer")
    @InterfaceC41208ft5("footer")
    private final String footer;
    @JsonProperty("ineligible_reason")
    @InterfaceC41208ft5("ineligible_reason")
    private final RidePassViewIneligibleReason ineligibleReason;
    @JsonProperty("label")
    @InterfaceC41208ft5("label")
    private final String label;
    @JsonProperty("link_code")
    @InterfaceC41208ft5("link_code")
    private final String linkCode;
    @JsonProperty("previous_price")
    @InterfaceC41208ft5("previous_price")
    private final Long previousPrice;
    @JsonProperty("price")
    @InterfaceC41208ft5("price")
    private final long price;
    @JsonProperty("price_tax")
    @InterfaceC41208ft5("price_tax")
    private final Long priceTax;
    @JsonProperty("remaining_device_transfer_count")
    @InterfaceC41208ft5("remaining_device_transfer_count")
    private final Integer remainingDeviceTransferCount;
    @JsonProperty("subscription_plan")
    @InterfaceC41208ft5("subscription_plan")
    private final WireRidePassSubscriptionPlanView subscriptionPlan;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;
    @JsonProperty("user_ride_pass_id")
    @InterfaceC41208ft5("user_ride_pass_id")
    private final String userRidePassId;
    @JsonProperty("user_subscription")
    @InterfaceC41208ft5("user_subscription")
    private final WireRidePassUserSubscriptionView userSubscription;
    @JsonProperty("zendesk_article_id")
    @InterfaceC41208ft5("zendesk_article_id")
    private final String zendeskArticleId;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireRidePassView> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireRidePassView createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WireRidePassView(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : RidePassViewIneligibleReason.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readInt() == 0 ? null : WireRidePassSubscriptionPlanView.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? WireRidePassUserSubscriptionView.CREATOR.createFromParcel(parcel) : null, (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireRidePassView[] newArray(int i) {
            return new WireRidePassView[i];
        }
    }

    public WireRidePassView() {
        this(null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554431, null);
    }

    public final String component1() {
        return this.userRidePassId;
    }

    public final String component10() {
        return this.zendeskArticleId;
    }

    public final String component11() {
        return this.confirmationToast;
    }

    public final String component12() {
        return this.label;
    }

    public final RidePassViewIneligibleReason component13() {
        return this.ineligibleReason;
    }

    public final Integer component14() {
        return this.remainingDeviceTransferCount;
    }

    public final String component15() {
        return this.cancelArticleId;
    }

    public final String component16() {
        return this.footer;
    }

    public final String component17() {
        return this.detailBody;
    }

    public final String component18() {
        return this.detailImageUrl;
    }

    public final String component19() {
        return this.detailAction;
    }

    public final String component2() {
        return this.linkCode;
    }

    public final List<String> component20() {
        return this.detailBodyList;
    }

    public final String component21() {
        return this.detailFooter;
    }

    public final WireRidePassSubscriptionPlanView component22() {
        return this.subscriptionPlan;
    }

    public final WireRidePassUserSubscriptionView component23() {
        return this.userSubscription;
    }

    public final DateTime component24() {
        return this.createdAt;
    }

    public final DateTime component25() {
        return this.expiresAt;
    }

    public final long component3() {
        return this.price;
    }

    public final Long component4() {
        return this.priceTax;
    }

    public final Long component5() {
        return this.previousPrice;
    }

    public final String component6() {
        return this.currency;
    }

    public final String component7() {
        return this.bannerImageUrl;
    }

    public final String component8() {
        return this.bannerAction;
    }

    public final String component9() {
        return this.title;
    }

    public final WireRidePassView copy(String str, String linkCode, long j, Long l, Long l2, String currency, String str2, String str3, String title, String zendeskArticleId, String str4, String str5, RidePassViewIneligibleReason ridePassViewIneligibleReason, Integer num, String str6, String str7, String detailBody, String str8, String str9, List<String> list, String str10, WireRidePassSubscriptionPlanView wireRidePassSubscriptionPlanView, WireRidePassUserSubscriptionView wireRidePassUserSubscriptionView, DateTime dateTime, DateTime dateTime2) {
        Intrinsics.checkNotNullParameter(linkCode, "linkCode");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(zendeskArticleId, "zendeskArticleId");
        Intrinsics.checkNotNullParameter(detailBody, "detailBody");
        return new WireRidePassView(str, linkCode, j, l, l2, currency, str2, str3, title, zendeskArticleId, str4, str5, ridePassViewIneligibleReason, num, str6, str7, detailBody, str8, str9, list, str10, wireRidePassSubscriptionPlanView, wireRidePassUserSubscriptionView, dateTime, dateTime2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireRidePassView) {
            WireRidePassView wireRidePassView = (WireRidePassView) obj;
            return Intrinsics.areEqual(this.userRidePassId, wireRidePassView.userRidePassId) && Intrinsics.areEqual(this.linkCode, wireRidePassView.linkCode) && this.price == wireRidePassView.price && Intrinsics.areEqual(this.priceTax, wireRidePassView.priceTax) && Intrinsics.areEqual(this.previousPrice, wireRidePassView.previousPrice) && Intrinsics.areEqual(this.currency, wireRidePassView.currency) && Intrinsics.areEqual(this.bannerImageUrl, wireRidePassView.bannerImageUrl) && Intrinsics.areEqual(this.bannerAction, wireRidePassView.bannerAction) && Intrinsics.areEqual(this.title, wireRidePassView.title) && Intrinsics.areEqual(this.zendeskArticleId, wireRidePassView.zendeskArticleId) && Intrinsics.areEqual(this.confirmationToast, wireRidePassView.confirmationToast) && Intrinsics.areEqual(this.label, wireRidePassView.label) && this.ineligibleReason == wireRidePassView.ineligibleReason && Intrinsics.areEqual(this.remainingDeviceTransferCount, wireRidePassView.remainingDeviceTransferCount) && Intrinsics.areEqual(this.cancelArticleId, wireRidePassView.cancelArticleId) && Intrinsics.areEqual(this.footer, wireRidePassView.footer) && Intrinsics.areEqual(this.detailBody, wireRidePassView.detailBody) && Intrinsics.areEqual(this.detailImageUrl, wireRidePassView.detailImageUrl) && Intrinsics.areEqual(this.detailAction, wireRidePassView.detailAction) && Intrinsics.areEqual(this.detailBodyList, wireRidePassView.detailBodyList) && Intrinsics.areEqual(this.detailFooter, wireRidePassView.detailFooter) && Intrinsics.areEqual(this.subscriptionPlan, wireRidePassView.subscriptionPlan) && Intrinsics.areEqual(this.userSubscription, wireRidePassView.userSubscription) && Intrinsics.areEqual(this.createdAt, wireRidePassView.createdAt) && Intrinsics.areEqual(this.expiresAt, wireRidePassView.expiresAt);
        }
        return false;
    }

    public final String getBannerAction() {
        return this.bannerAction;
    }

    public final String getBannerImageUrl() {
        return this.bannerImageUrl;
    }

    public final String getCancelArticleId() {
        return this.cancelArticleId;
    }

    public final String getConfirmationToast() {
        return this.confirmationToast;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDetailAction() {
        return this.detailAction;
    }

    public final String getDetailBody() {
        return this.detailBody;
    }

    public final List<String> getDetailBodyList() {
        return this.detailBodyList;
    }

    public final String getDetailFooter() {
        return this.detailFooter;
    }

    public final String getDetailImageUrl() {
        return this.detailImageUrl;
    }

    public final DateTime getExpiresAt() {
        return this.expiresAt;
    }

    public final String getFooter() {
        return this.footer;
    }

    public final RidePassViewIneligibleReason getIneligibleReason() {
        return this.ineligibleReason;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getLinkCode() {
        return this.linkCode;
    }

    public final Long getPreviousPrice() {
        return this.previousPrice;
    }

    public final long getPrice() {
        return this.price;
    }

    public final Long getPriceTax() {
        return this.priceTax;
    }

    public final Integer getRemainingDeviceTransferCount() {
        return this.remainingDeviceTransferCount;
    }

    public final WireRidePassSubscriptionPlanView getSubscriptionPlan() {
        return this.subscriptionPlan;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUserRidePassId() {
        return this.userRidePassId;
    }

    public final WireRidePassUserSubscriptionView getUserSubscription() {
        return this.userSubscription;
    }

    public final String getZendeskArticleId() {
        return this.zendeskArticleId;
    }

    public int hashCode() {
        String str = this.userRidePassId;
        int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.linkCode.hashCode()) * 31) + Long.hashCode(this.price)) * 31;
        Long l = this.priceTax;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.previousPrice;
        int hashCode3 = (((hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31) + this.currency.hashCode()) * 31;
        String str2 = this.bannerImageUrl;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bannerAction;
        int hashCode5 = (((((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.title.hashCode()) * 31) + this.zendeskArticleId.hashCode()) * 31;
        String str4 = this.confirmationToast;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.label;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        RidePassViewIneligibleReason ridePassViewIneligibleReason = this.ineligibleReason;
        int hashCode8 = (hashCode7 + (ridePassViewIneligibleReason == null ? 0 : ridePassViewIneligibleReason.hashCode())) * 31;
        Integer num = this.remainingDeviceTransferCount;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.cancelArticleId;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.footer;
        int hashCode11 = (((hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.detailBody.hashCode()) * 31;
        String str8 = this.detailImageUrl;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.detailAction;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List<String> list = this.detailBodyList;
        int hashCode14 = (hashCode13 + (list == null ? 0 : list.hashCode())) * 31;
        String str10 = this.detailFooter;
        int hashCode15 = (hashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        WireRidePassSubscriptionPlanView wireRidePassSubscriptionPlanView = this.subscriptionPlan;
        int hashCode16 = (hashCode15 + (wireRidePassSubscriptionPlanView == null ? 0 : wireRidePassSubscriptionPlanView.hashCode())) * 31;
        WireRidePassUserSubscriptionView wireRidePassUserSubscriptionView = this.userSubscription;
        int hashCode17 = (hashCode16 + (wireRidePassUserSubscriptionView == null ? 0 : wireRidePassUserSubscriptionView.hashCode())) * 31;
        DateTime dateTime = this.createdAt;
        int hashCode18 = (hashCode17 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.expiresAt;
        return hashCode18 + (dateTime2 != null ? dateTime2.hashCode() : 0);
    }

    public String toString() {
        String str = this.userRidePassId;
        String str2 = this.linkCode;
        long j = this.price;
        Long l = this.priceTax;
        Long l2 = this.previousPrice;
        String str3 = this.currency;
        String str4 = this.bannerImageUrl;
        String str5 = this.bannerAction;
        String str6 = this.title;
        String str7 = this.zendeskArticleId;
        String str8 = this.confirmationToast;
        String str9 = this.label;
        RidePassViewIneligibleReason ridePassViewIneligibleReason = this.ineligibleReason;
        Integer num = this.remainingDeviceTransferCount;
        String str10 = this.cancelArticleId;
        String str11 = this.footer;
        String str12 = this.detailBody;
        String str13 = this.detailImageUrl;
        String str14 = this.detailAction;
        List<String> list = this.detailBodyList;
        String str15 = this.detailFooter;
        WireRidePassSubscriptionPlanView wireRidePassSubscriptionPlanView = this.subscriptionPlan;
        WireRidePassUserSubscriptionView wireRidePassUserSubscriptionView = this.userSubscription;
        DateTime dateTime = this.createdAt;
        DateTime dateTime2 = this.expiresAt;
        return "WireRidePassView(userRidePassId=" + str + ", linkCode=" + str2 + ", price=" + j + ", priceTax=" + l + ", previousPrice=" + l2 + ", currency=" + str3 + ", bannerImageUrl=" + str4 + ", bannerAction=" + str5 + ", title=" + str6 + ", zendeskArticleId=" + str7 + ", confirmationToast=" + str8 + ", label=" + str9 + ", ineligibleReason=" + ridePassViewIneligibleReason + ", remainingDeviceTransferCount=" + num + ", cancelArticleId=" + str10 + ", footer=" + str11 + ", detailBody=" + str12 + ", detailImageUrl=" + str13 + ", detailAction=" + str14 + ", detailBodyList=" + list + ", detailFooter=" + str15 + ", subscriptionPlan=" + wireRidePassSubscriptionPlanView + ", userSubscription=" + wireRidePassUserSubscriptionView + ", createdAt=" + dateTime + ", expiresAt=" + dateTime2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.userRidePassId);
        out.writeString(this.linkCode);
        out.writeLong(this.price);
        Long l = this.priceTax;
        if (l == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l.longValue());
        }
        Long l2 = this.previousPrice;
        if (l2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l2.longValue());
        }
        out.writeString(this.currency);
        out.writeString(this.bannerImageUrl);
        out.writeString(this.bannerAction);
        out.writeString(this.title);
        out.writeString(this.zendeskArticleId);
        out.writeString(this.confirmationToast);
        out.writeString(this.label);
        RidePassViewIneligibleReason ridePassViewIneligibleReason = this.ineligibleReason;
        if (ridePassViewIneligibleReason == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(ridePassViewIneligibleReason.name());
        }
        Integer num = this.remainingDeviceTransferCount;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeString(this.cancelArticleId);
        out.writeString(this.footer);
        out.writeString(this.detailBody);
        out.writeString(this.detailImageUrl);
        out.writeString(this.detailAction);
        out.writeStringList(this.detailBodyList);
        out.writeString(this.detailFooter);
        WireRidePassSubscriptionPlanView wireRidePassSubscriptionPlanView = this.subscriptionPlan;
        if (wireRidePassSubscriptionPlanView == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            wireRidePassSubscriptionPlanView.writeToParcel(out, i);
        }
        WireRidePassUserSubscriptionView wireRidePassUserSubscriptionView = this.userSubscription;
        if (wireRidePassUserSubscriptionView == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            wireRidePassUserSubscriptionView.writeToParcel(out, i);
        }
        out.writeSerializable(this.createdAt);
        out.writeSerializable(this.expiresAt);
    }

    public WireRidePassView(String str, String linkCode, long j, Long l, Long l2, String currency, String str2, String str3, String title, String zendeskArticleId, String str4, String str5, RidePassViewIneligibleReason ridePassViewIneligibleReason, Integer num, String str6, String str7, String detailBody, String str8, String str9, List<String> list, String str10, WireRidePassSubscriptionPlanView wireRidePassSubscriptionPlanView, WireRidePassUserSubscriptionView wireRidePassUserSubscriptionView, DateTime dateTime, DateTime dateTime2) {
        Intrinsics.checkNotNullParameter(linkCode, "linkCode");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(zendeskArticleId, "zendeskArticleId");
        Intrinsics.checkNotNullParameter(detailBody, "detailBody");
        this.userRidePassId = str;
        this.linkCode = linkCode;
        this.price = j;
        this.priceTax = l;
        this.previousPrice = l2;
        this.currency = currency;
        this.bannerImageUrl = str2;
        this.bannerAction = str3;
        this.title = title;
        this.zendeskArticleId = zendeskArticleId;
        this.confirmationToast = str4;
        this.label = str5;
        this.ineligibleReason = ridePassViewIneligibleReason;
        this.remainingDeviceTransferCount = num;
        this.cancelArticleId = str6;
        this.footer = str7;
        this.detailBody = detailBody;
        this.detailImageUrl = str8;
        this.detailAction = str9;
        this.detailBodyList = list;
        this.detailFooter = str10;
        this.subscriptionPlan = wireRidePassSubscriptionPlanView;
        this.userSubscription = wireRidePassUserSubscriptionView;
        this.createdAt = dateTime;
        this.expiresAt = dateTime2;
    }

    public /* synthetic */ WireRidePassView(String str, String str2, long j, Long l, Long l2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, RidePassViewIneligibleReason ridePassViewIneligibleReason, Integer num, String str10, String str11, String str12, String str13, String str14, List list, String str15, WireRidePassSubscriptionPlanView wireRidePassSubscriptionPlanView, WireRidePassUserSubscriptionView wireRidePassUserSubscriptionView, DateTime dateTime, DateTime dateTime2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : l2, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? "" : str7, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? null : ridePassViewIneligibleReason, (i & 8192) != 0 ? null : num, (i & 16384) != 0 ? null : str10, (i & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? null : str11, (i & 65536) != 0 ? "" : str12, (i & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? null : str13, (i & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? null : str14, (i & 524288) != 0 ? null : list, (i & 1048576) != 0 ? null : str15, (i & 2097152) != 0 ? null : wireRidePassSubscriptionPlanView, (i & 4194304) != 0 ? null : wireRidePassUserSubscriptionView, (i & 8388608) != 0 ? null : dateTime, (i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : dateTime2);
    }
}
