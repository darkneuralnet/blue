package co.bird.android.model.wire;

import co.bird.android.model.AssetTaskKt;
import co.bird.android.model.LegacyRepairType;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.PaymentMethod;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b<\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0003_`aBý\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u000e¢\u0006\u0002\u0010!J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0011HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\t\u0010L\u001a\u00020\u0011HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010O\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010)J\u0011\u0010P\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u000eHÆ\u0003J\t\u0010Q\u001a\u00020\u0006HÆ\u0003J\t\u0010R\u001a\u00020\bHÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\fHÂ\u0003J\u0011\u0010U\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eHÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0011HÆ\u0003J\u008a\u0002\u0010X\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00112\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010YJ\u0013\u0010Z\u001a\u00020\u00112\b\u0010[\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\\\u001a\u00020]HÖ\u0001J\t\u0010^\u001a\u00020\u0003HÖ\u0001R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u001b\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010%R\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0011\u0010/\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010%R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010'R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010%R\u0016\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010'R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010%R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010%R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010%¨\u0006b"}, m28432d2 = {"Lco/bird/android/model/wire/WireMerchantSite;", "", "id", "", "name", "location", "Lco/bird/android/model/wire/WireLocation;", "merchant", "Lco/bird/android/model/wire/WireMerchantDescription;", "photos", "Lco/bird/android/model/wire/WireMerchantSite$Photos;", "_icon", "Lco/bird/android/model/wire/WireMerchantSite$Icon;", "hoursText", "", "description", "mobile", "", "open", PaymentMethod.BillingDetails.PARAM_PHONE, PaymentMethod.BillingDetails.PARAM_ADDRESS, "city", TransferTable.COLUMN_STATE, "zip", "country", "tipSettings", "Lco/bird/android/model/wire/WireMerchantSite$TipSettings;", "autoLocationUpdatesEnabled", "prominence", "Lco/bird/android/model/wire/WireMerchantSiteProminence;", "birdPayEnabled", "actions", "Lco/bird/android/model/wire/WireMerchantAction;", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;Lco/bird/android/model/wire/WireMerchantDescription;Lco/bird/android/model/wire/WireMerchantSite$Photos;Lco/bird/android/model/wire/WireMerchantSite$Icon;Ljava/util/List;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireMerchantSite$TipSettings;ZLco/bird/android/model/wire/WireMerchantSiteProminence;Ljava/lang/Boolean;Ljava/util/List;)V", "getActions", "()Ljava/util/List;", "getAddress", "()Ljava/lang/String;", "getAutoLocationUpdatesEnabled", "()Z", "getBirdPayEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCity", "getCountry", "getDescription", "getHoursText", "icon", "getIcon", "()Lco/bird/android/model/wire/WireMerchantSite$Icon;", "getId", "getLocation", "()Lco/bird/android/model/wire/WireLocation;", "getMerchant", "()Lco/bird/android/model/wire/WireMerchantDescription;", "getMobile", "getName", "getOpen", "getPhone", "getPhotos", "()Lco/bird/android/model/wire/WireMerchantSite$Photos;", "getProminence", "()Lco/bird/android/model/wire/WireMerchantSiteProminence;", "getState", "getTipSettings", "()Lco/bird/android/model/wire/WireMerchantSite$TipSettings;", "getZip", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;Lco/bird/android/model/wire/WireMerchantDescription;Lco/bird/android/model/wire/WireMerchantSite$Photos;Lco/bird/android/model/wire/WireMerchantSite$Icon;Ljava/util/List;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireMerchantSite$TipSettings;ZLco/bird/android/model/wire/WireMerchantSiteProminence;Ljava/lang/Boolean;Ljava/util/List;)Lco/bird/android/model/wire/WireMerchantSite;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "Icon", "Photos", "TipSettings", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireMerchantSite {
    @JsonProperty("icon")
    @InterfaceC41208ft5("icon")
    private final Icon _icon;
    @JsonProperty("actions")
    @InterfaceC41208ft5("actions")
    private final List<WireMerchantAction> actions;
    @JsonProperty(PaymentMethod.BillingDetails.PARAM_ADDRESS)
    @InterfaceC41208ft5(PaymentMethod.BillingDetails.PARAM_ADDRESS)
    private final String address;
    @JsonProperty("auto_location_updates_enabled")
    @InterfaceC41208ft5("auto_location_updates_enabled")
    private final boolean autoLocationUpdatesEnabled;
    @JsonProperty("bird_pay_enabled")
    @InterfaceC41208ft5("bird_pay_enabled")
    private final Boolean birdPayEnabled;
    @JsonProperty("city")
    @InterfaceC41208ft5("city")
    private final String city;
    @JsonProperty("country")
    @InterfaceC41208ft5("country")
    private final String country;
    @JsonProperty("description")
    @InterfaceC41208ft5("description")
    private final String description;
    @JsonProperty("business_hours")
    @InterfaceC41208ft5("business_hours")
    private final List<String> hoursText;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66737id;
    @JsonProperty("location")
    @InterfaceC41208ft5("location")
    private final WireLocation location;
    @JsonProperty("merchant")
    @InterfaceC41208ft5("merchant")
    private final WireMerchantDescription merchant;
    @JsonProperty("mobile")
    @InterfaceC41208ft5("mobile")
    private final boolean mobile;
    @JsonProperty("name")
    @InterfaceC41208ft5("name")
    private final String name;
    @JsonProperty("open")
    @InterfaceC41208ft5("open")
    private final boolean open;
    @JsonProperty(PaymentMethod.BillingDetails.PARAM_PHONE)
    @InterfaceC41208ft5(PaymentMethod.BillingDetails.PARAM_PHONE)
    private final String phone;
    @JsonProperty("photos")
    @InterfaceC41208ft5("photos")
    private final Photos photos;
    @JsonProperty("prominence")
    @InterfaceC41208ft5("prominence")
    private final WireMerchantSiteProminence prominence;
    @JsonProperty(TransferTable.COLUMN_STATE)
    @InterfaceC41208ft5(TransferTable.COLUMN_STATE)
    private final String state;
    @JsonProperty("tip_settings")
    @InterfaceC41208ft5("tip_settings")
    private final TipSettings tipSettings;
    @JsonProperty("zip")
    @JsonAlias({"zip_code"})
    @InterfaceC41208ft5(alternate = {"zip_code"}, value = "zip")
    private final String zip;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/wire/WireMerchantSite$Icon;", "", "(Ljava/lang/String;I)V", "STORE", "CART", "EVENT", "FOOD_TRUCK", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public enum Icon {
        STORE,
        CART,
        EVENT,
        FOOD_TRUCK
    }

    @Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\bHÆ\u0003J?\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\bHÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/model/wire/WireMerchantSite$Photos;", "", "places", "", "", AssetTaskKt.ASSET_PATH, "Lco/bird/android/model/wire/WireLegacyAsset;", "attributions", "", "(Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V", "getAssets", "()Ljava/util/List;", "getAttributions", "()Ljava/util/Map;", "getPlaces", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Photos {
        @JsonProperty(AssetTaskKt.ASSET_PATH)
        @InterfaceC41208ft5(AssetTaskKt.ASSET_PATH)
        private final List<WireLegacyAsset> assets;
        @JsonProperty("attributions")
        @InterfaceC41208ft5("attributions")
        private final Map<String, String> attributions;
        @JsonProperty("places")
        @InterfaceC41208ft5("places")
        private final List<String> places;

        public Photos() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Photos copy$default(Photos photos, List list, List list2, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                list = photos.places;
            }
            if ((i & 2) != 0) {
                list2 = photos.assets;
            }
            if ((i & 4) != 0) {
                map = photos.attributions;
            }
            return photos.copy(list, list2, map);
        }

        public final List<String> component1() {
            return this.places;
        }

        public final List<WireLegacyAsset> component2() {
            return this.assets;
        }

        public final Map<String, String> component3() {
            return this.attributions;
        }

        public final Photos copy(List<String> places, List<WireLegacyAsset> assets, Map<String, String> attributions) {
            Intrinsics.checkNotNullParameter(places, "places");
            Intrinsics.checkNotNullParameter(assets, "assets");
            Intrinsics.checkNotNullParameter(attributions, "attributions");
            return new Photos(places, assets, attributions);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Photos) {
                Photos photos = (Photos) obj;
                return Intrinsics.areEqual(this.places, photos.places) && Intrinsics.areEqual(this.assets, photos.assets) && Intrinsics.areEqual(this.attributions, photos.attributions);
            }
            return false;
        }

        public final List<WireLegacyAsset> getAssets() {
            return this.assets;
        }

        public final Map<String, String> getAttributions() {
            return this.attributions;
        }

        public final List<String> getPlaces() {
            return this.places;
        }

        public int hashCode() {
            return (((this.places.hashCode() * 31) + this.assets.hashCode()) * 31) + this.attributions.hashCode();
        }

        public String toString() {
            List<String> list = this.places;
            List<WireLegacyAsset> list2 = this.assets;
            Map<String, String> map = this.attributions;
            return "Photos(places=" + list + ", assets=" + list2 + ", attributions=" + map + ")";
        }

        public Photos(List<String> places, List<WireLegacyAsset> assets, Map<String, String> attributions) {
            Intrinsics.checkNotNullParameter(places, "places");
            Intrinsics.checkNotNullParameter(assets, "assets");
            Intrinsics.checkNotNullParameter(attributions, "attributions");
            this.places = places;
            this.assets = assets;
            this.attributions = attributions;
        }

        public /* synthetic */ Photos(List list, List list2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i & 4) != 0 ? MapsKt__MapsKt.emptyMap() : map);
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\bHÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/model/wire/WireMerchantSite$TipSettings;", "", "enableManualEntry", "", "percentageOptions", "", "", "fixedOptions", "", "(ZLjava/util/List;Ljava/util/List;)V", "getEnableManualEntry", "()Z", "getFixedOptions", "()Ljava/util/List;", "getPercentageOptions", "component1", "component2", "component3", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class TipSettings {
        @JsonProperty("enable_manual_entry")
        @InterfaceC41208ft5("enable_manual_entry")
        private final boolean enableManualEntry;
        @JsonProperty("fixed_options")
        @InterfaceC41208ft5("fixed_options")
        private final List<Integer> fixedOptions;
        @JsonProperty("percentage_options")
        @InterfaceC41208ft5("percentage_options")
        private final List<Double> percentageOptions;

        public TipSettings() {
            this(false, null, null, 7, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TipSettings copy$default(TipSettings tipSettings, boolean z, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = tipSettings.enableManualEntry;
            }
            if ((i & 2) != 0) {
                list = tipSettings.percentageOptions;
            }
            if ((i & 4) != 0) {
                list2 = tipSettings.fixedOptions;
            }
            return tipSettings.copy(z, list, list2);
        }

        public final boolean component1() {
            return this.enableManualEntry;
        }

        public final List<Double> component2() {
            return this.percentageOptions;
        }

        public final List<Integer> component3() {
            return this.fixedOptions;
        }

        public final TipSettings copy(boolean z, List<Double> list, List<Integer> list2) {
            return new TipSettings(z, list, list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof TipSettings) {
                TipSettings tipSettings = (TipSettings) obj;
                return this.enableManualEntry == tipSettings.enableManualEntry && Intrinsics.areEqual(this.percentageOptions, tipSettings.percentageOptions) && Intrinsics.areEqual(this.fixedOptions, tipSettings.fixedOptions);
            }
            return false;
        }

        public final boolean getEnableManualEntry() {
            return this.enableManualEntry;
        }

        public final List<Integer> getFixedOptions() {
            return this.fixedOptions;
        }

        public final List<Double> getPercentageOptions() {
            return this.percentageOptions;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        public int hashCode() {
            boolean z = this.enableManualEntry;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            List<Double> list = this.percentageOptions;
            int hashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
            List<Integer> list2 = this.fixedOptions;
            return hashCode + (list2 != null ? list2.hashCode() : 0);
        }

        public String toString() {
            boolean z = this.enableManualEntry;
            List<Double> list = this.percentageOptions;
            List<Integer> list2 = this.fixedOptions;
            return "TipSettings(enableManualEntry=" + z + ", percentageOptions=" + list + ", fixedOptions=" + list2 + ")";
        }

        public TipSettings(boolean z, List<Double> list, List<Integer> list2) {
            this.enableManualEntry = z;
            this.percentageOptions = list;
            this.fixedOptions = list2;
        }

        public /* synthetic */ TipSettings(boolean z, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
        }
    }

    public WireMerchantSite(String id, String str, WireLocation location, WireMerchantDescription merchant, Photos photos, Icon icon, List<String> list, String str2, boolean z, boolean z2, String str3, String str4, String str5, String str6, String str7, String str8, TipSettings tipSettings, boolean z3, WireMerchantSiteProminence wireMerchantSiteProminence, Boolean bool, List<WireMerchantAction> list2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(merchant, "merchant");
        this.f66737id = id;
        this.name = str;
        this.location = location;
        this.merchant = merchant;
        this.photos = photos;
        this._icon = icon;
        this.hoursText = list;
        this.description = str2;
        this.mobile = z;
        this.open = z2;
        this.phone = str3;
        this.address = str4;
        this.city = str5;
        this.state = str6;
        this.zip = str7;
        this.country = str8;
        this.tipSettings = tipSettings;
        this.autoLocationUpdatesEnabled = z3;
        this.prominence = wireMerchantSiteProminence;
        this.birdPayEnabled = bool;
        this.actions = list2;
    }

    private final Icon component6() {
        return this._icon;
    }

    public final String component1() {
        return this.f66737id;
    }

    public final boolean component10() {
        return this.open;
    }

    public final String component11() {
        return this.phone;
    }

    public final String component12() {
        return this.address;
    }

    public final String component13() {
        return this.city;
    }

    public final String component14() {
        return this.state;
    }

    public final String component15() {
        return this.zip;
    }

    public final String component16() {
        return this.country;
    }

    public final TipSettings component17() {
        return this.tipSettings;
    }

    public final boolean component18() {
        return this.autoLocationUpdatesEnabled;
    }

    public final WireMerchantSiteProminence component19() {
        return this.prominence;
    }

    public final String component2() {
        return this.name;
    }

    public final Boolean component20() {
        return this.birdPayEnabled;
    }

    public final List<WireMerchantAction> component21() {
        return this.actions;
    }

    public final WireLocation component3() {
        return this.location;
    }

    public final WireMerchantDescription component4() {
        return this.merchant;
    }

    public final Photos component5() {
        return this.photos;
    }

    public final List<String> component7() {
        return this.hoursText;
    }

    public final String component8() {
        return this.description;
    }

    public final boolean component9() {
        return this.mobile;
    }

    public final WireMerchantSite copy(String id, String str, WireLocation location, WireMerchantDescription merchant, Photos photos, Icon icon, List<String> list, String str2, boolean z, boolean z2, String str3, String str4, String str5, String str6, String str7, String str8, TipSettings tipSettings, boolean z3, WireMerchantSiteProminence wireMerchantSiteProminence, Boolean bool, List<WireMerchantAction> list2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(merchant, "merchant");
        return new WireMerchantSite(id, str, location, merchant, photos, icon, list, str2, z, z2, str3, str4, str5, str6, str7, str8, tipSettings, z3, wireMerchantSiteProminence, bool, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireMerchantSite) {
            WireMerchantSite wireMerchantSite = (WireMerchantSite) obj;
            return Intrinsics.areEqual(this.f66737id, wireMerchantSite.f66737id) && Intrinsics.areEqual(this.name, wireMerchantSite.name) && Intrinsics.areEqual(this.location, wireMerchantSite.location) && Intrinsics.areEqual(this.merchant, wireMerchantSite.merchant) && Intrinsics.areEqual(this.photos, wireMerchantSite.photos) && this._icon == wireMerchantSite._icon && Intrinsics.areEqual(this.hoursText, wireMerchantSite.hoursText) && Intrinsics.areEqual(this.description, wireMerchantSite.description) && this.mobile == wireMerchantSite.mobile && this.open == wireMerchantSite.open && Intrinsics.areEqual(this.phone, wireMerchantSite.phone) && Intrinsics.areEqual(this.address, wireMerchantSite.address) && Intrinsics.areEqual(this.city, wireMerchantSite.city) && Intrinsics.areEqual(this.state, wireMerchantSite.state) && Intrinsics.areEqual(this.zip, wireMerchantSite.zip) && Intrinsics.areEqual(this.country, wireMerchantSite.country) && Intrinsics.areEqual(this.tipSettings, wireMerchantSite.tipSettings) && this.autoLocationUpdatesEnabled == wireMerchantSite.autoLocationUpdatesEnabled && Intrinsics.areEqual(this.prominence, wireMerchantSite.prominence) && Intrinsics.areEqual(this.birdPayEnabled, wireMerchantSite.birdPayEnabled) && Intrinsics.areEqual(this.actions, wireMerchantSite.actions);
        }
        return false;
    }

    public final List<WireMerchantAction> getActions() {
        return this.actions;
    }

    public final String getAddress() {
        return this.address;
    }

    public final boolean getAutoLocationUpdatesEnabled() {
        return this.autoLocationUpdatesEnabled;
    }

    public final Boolean getBirdPayEnabled() {
        return this.birdPayEnabled;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<String> getHoursText() {
        return this.hoursText;
    }

    public final Icon getIcon() {
        Icon icon = this._icon;
        return icon == null ? Icon.STORE : icon;
    }

    public final String getId() {
        return this.f66737id;
    }

    public final WireLocation getLocation() {
        return this.location;
    }

    public final WireMerchantDescription getMerchant() {
        return this.merchant;
    }

    public final boolean getMobile() {
        return this.mobile;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getOpen() {
        return this.open;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final Photos getPhotos() {
        return this.photos;
    }

    public final WireMerchantSiteProminence getProminence() {
        return this.prominence;
    }

    public final String getState() {
        return this.state;
    }

    public final TipSettings getTipSettings() {
        return this.tipSettings;
    }

    public final String getZip() {
        return this.zip;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f66737id.hashCode() * 31;
        String str = this.name;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.location.hashCode()) * 31) + this.merchant.hashCode()) * 31;
        Photos photos = this.photos;
        int hashCode3 = (hashCode2 + (photos == null ? 0 : photos.hashCode())) * 31;
        Icon icon = this._icon;
        int hashCode4 = (hashCode3 + (icon == null ? 0 : icon.hashCode())) * 31;
        List<String> list = this.hoursText;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.description;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.mobile;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode6 + i) * 31;
        boolean z2 = this.open;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        String str3 = this.phone;
        int hashCode7 = (i4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.address;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.city;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.state;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.zip;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.country;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        TipSettings tipSettings = this.tipSettings;
        int hashCode13 = (hashCode12 + (tipSettings == null ? 0 : tipSettings.hashCode())) * 31;
        boolean z3 = this.autoLocationUpdatesEnabled;
        int i5 = (hashCode13 + (z3 ? 1 : z3 ? 1 : 0)) * 31;
        WireMerchantSiteProminence wireMerchantSiteProminence = this.prominence;
        int hashCode14 = (i5 + (wireMerchantSiteProminence == null ? 0 : wireMerchantSiteProminence.hashCode())) * 31;
        Boolean bool = this.birdPayEnabled;
        int hashCode15 = (hashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<WireMerchantAction> list2 = this.actions;
        return hashCode15 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66737id;
        String str2 = this.name;
        WireLocation wireLocation = this.location;
        WireMerchantDescription wireMerchantDescription = this.merchant;
        Photos photos = this.photos;
        Icon icon = this._icon;
        List<String> list = this.hoursText;
        String str3 = this.description;
        boolean z = this.mobile;
        boolean z2 = this.open;
        String str4 = this.phone;
        String str5 = this.address;
        String str6 = this.city;
        String str7 = this.state;
        String str8 = this.zip;
        String str9 = this.country;
        TipSettings tipSettings = this.tipSettings;
        boolean z3 = this.autoLocationUpdatesEnabled;
        WireMerchantSiteProminence wireMerchantSiteProminence = this.prominence;
        Boolean bool = this.birdPayEnabled;
        List<WireMerchantAction> list2 = this.actions;
        return "WireMerchantSite(id=" + str + ", name=" + str2 + ", location=" + wireLocation + ", merchant=" + wireMerchantDescription + ", photos=" + photos + ", _icon=" + icon + ", hoursText=" + list + ", description=" + str3 + ", mobile=" + z + ", open=" + z2 + ", phone=" + str4 + ", address=" + str5 + ", city=" + str6 + ", state=" + str7 + ", zip=" + str8 + ", country=" + str9 + ", tipSettings=" + tipSettings + ", autoLocationUpdatesEnabled=" + z3 + ", prominence=" + wireMerchantSiteProminence + ", birdPayEnabled=" + bool + ", actions=" + list2 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ WireMerchantSite(String str, String str2, WireLocation wireLocation, WireMerchantDescription wireMerchantDescription, Photos photos, Icon icon, List list, String str3, boolean z, boolean z2, String str4, String str5, String str6, String str7, String str8, String str9, TipSettings tipSettings, boolean z3, WireMerchantSiteProminence wireMerchantSiteProminence, Boolean bool, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, wireLocation, wireMerchantDescription, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23);
        List list3;
        List emptyList;
        String str10 = (i & 1) != 0 ? "" : str;
        String str11 = (i & 2) != 0 ? null : str2;
        Photos photos2 = (i & 16) != 0 ? null : photos;
        Icon icon2 = (i & 32) != 0 ? null : icon;
        List list4 = (i & 64) != 0 ? null : list;
        String str12 = (i & 128) != 0 ? null : str3;
        boolean z4 = (i & 256) != 0 ? false : z;
        boolean z5 = (i & 512) != 0 ? false : z2;
        String str13 = (i & 1024) != 0 ? null : str4;
        String str14 = (i & 2048) != 0 ? null : str5;
        String str15 = (i & 4096) != 0 ? null : str6;
        String str16 = (i & 8192) != 0 ? null : str7;
        String str17 = (i & 16384) != 0 ? null : str8;
        String str18 = (32768 & i) != 0 ? null : str9;
        TipSettings tipSettings2 = (65536 & i) != 0 ? null : tipSettings;
        boolean z6 = (131072 & i) != 0 ? false : z3;
        WireMerchantSiteProminence wireMerchantSiteProminence2 = (262144 & i) != 0 ? null : wireMerchantSiteProminence;
        Boolean bool2 = (524288 & i) != 0 ? null : bool;
        if ((i & 1048576) != 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            list3 = emptyList;
        } else {
            list3 = list2;
        }
    }
}
