package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.PaymentMethod;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\bI\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bá\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%¢\u0006\u0002\u0010'J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\tHÆ\u0003J\u0017\u0010Q\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bHÆ\u0003J\t\u0010R\u001a\u00020\tHÆ\u0003J\t\u0010S\u001a\u00020\u0013HÆ\u0003J\t\u0010T\u001a\u00020\u0013HÆ\u0003J\t\u0010U\u001a\u00020\u0013HÆ\u0003J\t\u0010V\u001a\u00020\u0013HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010[\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u00105J\u0010\u0010\\\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u00105J\u0010\u0010]\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u00105J\u000b\u0010^\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010c\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010g\u001a\u00020\tHÆ\u0003J\u0015\u0010h\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jê\u0002\u0010k\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\t2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%HÆ\u0001¢\u0006\u0002\u0010lJ\t\u0010m\u001a\u00020\tHÖ\u0001J\u0013\u0010n\u001a\u00020\u00132\b\u0010o\u001a\u0004\u0018\u00010pHÖ\u0003J\t\u0010q\u001a\u00020\tHÖ\u0001J\t\u0010r\u001a\u00020\u0003HÖ\u0001J\u0019\u0010s\u001a\u00020t2\u0006\u0010u\u001a\u00020v2\u0006\u0010w\u001a\u00020\tHÖ\u0001R\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\"\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00106\u001a\u0004\b4\u00105R\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00106\u001a\u0004\b7\u00105R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010+R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010:R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010:R\u0018\u0010 \u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010+R\u001c\u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b>\u0010-\u001a\u0004\b?\u0010/R$\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u00101R\u0016\u0010\u0016\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010)R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010:R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010:R\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00106\u001a\u0004\b\u001d\u00105R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010:R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010:R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010:R\u0016\u0010\u0015\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010)R\u0016\u0010\u0011\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010/R\u0018\u0010!\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010:R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010+R\u0016\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010)R\u0018\u0010#\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010:¨\u0006x"}, m28432d2 = {"Lco/bird/android/model/User;", "Landroid/os/Parcelable;", "id", "", "name", "email", PaymentMethod.BillingDetails.PARAM_PHONE, "imageUrl", "balance", "", "balances", "", "", "customerId", "customerToken", "freeRides", "freeRidesByCurrency", "rideCount", "admin", "", "tester", "receivedSignupCoupon", "hasSignupCode", "createdAt", "Lorg/joda/time/DateTime;", "agreedAt", "suspendedAt", "canCharge", "canDeliver", "isCashPay", "birthdate", "Lorg/joda/time/LocalDateTime;", "emailVerifiedAt", "stripePublicKey", "locale", "warehouseId", "operatorRoles", "", "Lco/bird/android/model/OperatorRole;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;IZZZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lorg/joda/time/LocalDateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAdmin", "()Z", "getAgreedAt", "()Lorg/joda/time/DateTime;", "getBalance$annotations", "()V", "getBalance", "()I", "getBalances", "()Ljava/util/Map;", "getBirthdate", "()Lorg/joda/time/LocalDateTime;", "getCanCharge", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCanDeliver", "getCreatedAt", "getCustomerId", "()Ljava/lang/String;", "getCustomerToken", "getEmail", "getEmailVerifiedAt", "getFreeRides$annotations", "getFreeRides", "getFreeRidesByCurrency", "getHasSignupCode", "getId", "getImageUrl", "getLocale", "getName", "getOperatorRoles", "()Ljava/util/List;", "getPhone", "getReceivedSignupCoupon", "getRideCount", "getStripePublicKey", "getSuspendedAt", "getTester", "getWarehouseId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;IZZZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lorg/joda/time/LocalDateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lco/bird/android/model/User;", "describeContents", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class User implements Parcelable {
    public static final Parcelable.Creator<User> CREATOR = new Creator();
    @JsonProperty("admin")
    @InterfaceC41208ft5("admin")
    private final boolean admin;
    @JsonProperty("agreed_at")
    @InterfaceC41208ft5("agreed_at")
    private final DateTime agreedAt;
    @JsonProperty("balance")
    @InterfaceC41208ft5("balance")
    private final int balance;
    @JsonProperty("balances")
    @InterfaceC41208ft5("balances")
    private final Map<String, Long> balances;
    @JsonProperty("birthdate")
    @InterfaceC41208ft5("birthdate")
    private final LocalDateTime birthdate;
    @JsonProperty("can_charge")
    @InterfaceC41208ft5("can_charge")
    private final Boolean canCharge;
    @JsonProperty("can_deliver")
    @InterfaceC41208ft5("can_deliver")
    private final Boolean canDeliver;
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("customer_id")
    @InterfaceC41208ft5("customer_id")
    private final String customerId;
    @JsonProperty("customer_token")
    @InterfaceC41208ft5("customer_token")
    private final String customerToken;
    @JsonProperty("email")
    @InterfaceC41208ft5("email")
    private final String email;
    @JsonProperty("email_verified_at")
    @InterfaceC41208ft5("email_verified_at")
    private final DateTime emailVerifiedAt;
    @JsonProperty("free_rides")
    @InterfaceC41208ft5("free_rides")
    private final int freeRides;
    @JsonProperty("free_rides_by_currency")
    @InterfaceC41208ft5("free_rides_by_currency")
    private final Map<String, Integer> freeRidesByCurrency;
    @JsonProperty("has_signup_code")
    @InterfaceC41208ft5("has_signup_code")
    private final boolean hasSignupCode;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66632id;
    @JsonProperty("image_url")
    @InterfaceC41208ft5("image_url")
    private final String imageUrl;
    @JsonProperty("can_bypass_credit_card")
    @InterfaceC41208ft5("can_bypass_credit_card")
    private final Boolean isCashPay;
    @JsonProperty("locale")
    @InterfaceC41208ft5("locale")
    private final String locale;
    @JsonProperty("name")
    @InterfaceC41208ft5("name")
    private final String name;
    @JsonProperty("operator_roles")
    @InterfaceC41208ft5("operator_roles")
    private final List<OperatorRole> operatorRoles;
    @JsonProperty(PaymentMethod.BillingDetails.PARAM_PHONE)
    @InterfaceC41208ft5(PaymentMethod.BillingDetails.PARAM_PHONE)
    private final String phone;
    @JsonProperty("received_signup_coupon")
    @InterfaceC41208ft5("received_signup_coupon")
    private final boolean receivedSignupCoupon;
    @JsonProperty("ride_count")
    @InterfaceC41208ft5("ride_count")
    private final int rideCount;
    @JsonProperty("stripe_public_key")
    @InterfaceC41208ft5("stripe_public_key")
    private final String stripePublicKey;
    @JsonProperty("suspended_at")
    @InterfaceC41208ft5("suspended_at")
    private final DateTime suspendedAt;
    @JsonProperty("tester")
    @InterfaceC41208ft5("tester")
    private final boolean tester;
    @JsonProperty("warehouse_id")
    @InterfaceC41208ft5("warehouse_id")
    private final String warehouseId;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<User> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final User createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            boolean z;
            ArrayList arrayList;
            boolean z2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
            for (int i = 0; i != readInt2; i++) {
                linkedHashMap2.put(parcel.readString(), Long.valueOf(parcel.readLong()));
            }
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            int readInt3 = parcel.readInt();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt4 = parcel.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(readInt4);
                for (int i2 = 0; i2 != readInt4; i2++) {
                    linkedHashMap3.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
                }
                linkedHashMap = linkedHashMap3;
            }
            int readInt5 = parcel.readInt();
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            boolean z5 = parcel.readInt() != 0;
            boolean z6 = parcel.readInt() != 0;
            DateTime dateTime = (DateTime) parcel.readSerializable();
            DateTime dateTime2 = (DateTime) parcel.readSerializable();
            DateTime dateTime3 = (DateTime) parcel.readSerializable();
            Boolean valueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean valueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean valueOf3 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            LocalDateTime localDateTime = (LocalDateTime) parcel.readSerializable();
            DateTime dateTime4 = (DateTime) parcel.readSerializable();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            if (parcel.readInt() == 0) {
                z = z4;
                z2 = z3;
                arrayList = null;
            } else {
                int readInt6 = parcel.readInt();
                z = z4;
                arrayList = new ArrayList(readInt6);
                z2 = z3;
                int i3 = 0;
                while (i3 != readInt6) {
                    arrayList.add(OperatorRole.CREATOR.createFromParcel(parcel));
                    i3++;
                    readInt6 = readInt6;
                }
            }
            return new User(readString, readString2, readString3, readString4, readString5, readInt, linkedHashMap2, readString6, readString7, readInt3, linkedHashMap, readInt5, z2, z, z5, z6, dateTime, dateTime2, dateTime3, valueOf, valueOf2, valueOf3, localDateTime, dateTime4, readString8, readString9, readString10, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final User[] newArray(int i) {
            return new User[i];
        }
    }

    public User() {
        this(null, null, null, null, null, 0, null, null, null, 0, null, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, 268435455, null);
    }

    @Deprecated(message = "Use the User.balances map instead.")
    public static /* synthetic */ void getBalance$annotations() {
    }

    @Deprecated(message = "Use freeRidesByCurrency once its API implementation is in production.")
    public static /* synthetic */ void getFreeRides$annotations() {
    }

    public final String component1() {
        return this.f66632id;
    }

    public final int component10() {
        return this.freeRides;
    }

    public final Map<String, Integer> component11() {
        return this.freeRidesByCurrency;
    }

    public final int component12() {
        return this.rideCount;
    }

    public final boolean component13() {
        return this.admin;
    }

    public final boolean component14() {
        return this.tester;
    }

    public final boolean component15() {
        return this.receivedSignupCoupon;
    }

    public final boolean component16() {
        return this.hasSignupCode;
    }

    public final DateTime component17() {
        return this.createdAt;
    }

    public final DateTime component18() {
        return this.agreedAt;
    }

    public final DateTime component19() {
        return this.suspendedAt;
    }

    public final String component2() {
        return this.name;
    }

    public final Boolean component20() {
        return this.canCharge;
    }

    public final Boolean component21() {
        return this.canDeliver;
    }

    public final Boolean component22() {
        return this.isCashPay;
    }

    public final LocalDateTime component23() {
        return this.birthdate;
    }

    public final DateTime component24() {
        return this.emailVerifiedAt;
    }

    public final String component25() {
        return this.stripePublicKey;
    }

    public final String component26() {
        return this.locale;
    }

    public final String component27() {
        return this.warehouseId;
    }

    public final List<OperatorRole> component28() {
        return this.operatorRoles;
    }

    public final String component3() {
        return this.email;
    }

    public final String component4() {
        return this.phone;
    }

    public final String component5() {
        return this.imageUrl;
    }

    public final int component6() {
        return this.balance;
    }

    public final Map<String, Long> component7() {
        return this.balances;
    }

    public final String component8() {
        return this.customerId;
    }

    public final String component9() {
        return this.customerToken;
    }

    public final User copy(String id, String str, String str2, String str3, String str4, int i, Map<String, Long> balances, String str5, String str6, int i2, Map<String, Integer> map, int i3, boolean z, boolean z2, boolean z3, boolean z4, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, Boolean bool, Boolean bool2, Boolean bool3, LocalDateTime localDateTime, DateTime dateTime4, String str7, String str8, String str9, List<OperatorRole> list) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(balances, "balances");
        return new User(id, str, str2, str3, str4, i, balances, str5, str6, i2, map, i3, z, z2, z3, z4, dateTime, dateTime2, dateTime3, bool, bool2, bool3, localDateTime, dateTime4, str7, str8, str9, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof User) {
            User user = (User) obj;
            return Intrinsics.areEqual(this.f66632id, user.f66632id) && Intrinsics.areEqual(this.name, user.name) && Intrinsics.areEqual(this.email, user.email) && Intrinsics.areEqual(this.phone, user.phone) && Intrinsics.areEqual(this.imageUrl, user.imageUrl) && this.balance == user.balance && Intrinsics.areEqual(this.balances, user.balances) && Intrinsics.areEqual(this.customerId, user.customerId) && Intrinsics.areEqual(this.customerToken, user.customerToken) && this.freeRides == user.freeRides && Intrinsics.areEqual(this.freeRidesByCurrency, user.freeRidesByCurrency) && this.rideCount == user.rideCount && this.admin == user.admin && this.tester == user.tester && this.receivedSignupCoupon == user.receivedSignupCoupon && this.hasSignupCode == user.hasSignupCode && Intrinsics.areEqual(this.createdAt, user.createdAt) && Intrinsics.areEqual(this.agreedAt, user.agreedAt) && Intrinsics.areEqual(this.suspendedAt, user.suspendedAt) && Intrinsics.areEqual(this.canCharge, user.canCharge) && Intrinsics.areEqual(this.canDeliver, user.canDeliver) && Intrinsics.areEqual(this.isCashPay, user.isCashPay) && Intrinsics.areEqual(this.birthdate, user.birthdate) && Intrinsics.areEqual(this.emailVerifiedAt, user.emailVerifiedAt) && Intrinsics.areEqual(this.stripePublicKey, user.stripePublicKey) && Intrinsics.areEqual(this.locale, user.locale) && Intrinsics.areEqual(this.warehouseId, user.warehouseId) && Intrinsics.areEqual(this.operatorRoles, user.operatorRoles);
        }
        return false;
    }

    public final boolean getAdmin() {
        return this.admin;
    }

    public final DateTime getAgreedAt() {
        return this.agreedAt;
    }

    public final int getBalance() {
        return this.balance;
    }

    public final Map<String, Long> getBalances() {
        return this.balances;
    }

    public final LocalDateTime getBirthdate() {
        return this.birthdate;
    }

    public final Boolean getCanCharge() {
        return this.canCharge;
    }

    public final Boolean getCanDeliver() {
        return this.canDeliver;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    public final String getCustomerToken() {
        return this.customerToken;
    }

    public final String getEmail() {
        return this.email;
    }

    public final DateTime getEmailVerifiedAt() {
        return this.emailVerifiedAt;
    }

    public final int getFreeRides() {
        return this.freeRides;
    }

    public final Map<String, Integer> getFreeRidesByCurrency() {
        return this.freeRidesByCurrency;
    }

    public final boolean getHasSignupCode() {
        return this.hasSignupCode;
    }

    public final String getId() {
        return this.f66632id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getName() {
        return this.name;
    }

    public final List<OperatorRole> getOperatorRoles() {
        return this.operatorRoles;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final boolean getReceivedSignupCoupon() {
        return this.receivedSignupCoupon;
    }

    public final int getRideCount() {
        return this.rideCount;
    }

    public final String getStripePublicKey() {
        return this.stripePublicKey;
    }

    public final DateTime getSuspendedAt() {
        return this.suspendedAt;
    }

    public final boolean getTester() {
        return this.tester;
    }

    public final String getWarehouseId() {
        return this.warehouseId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f66632id.hashCode() * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.email;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phone;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.imageUrl;
        int hashCode5 = (((((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + Integer.hashCode(this.balance)) * 31) + this.balances.hashCode()) * 31;
        String str5 = this.customerId;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.customerToken;
        int hashCode7 = (((hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + Integer.hashCode(this.freeRides)) * 31;
        Map<String, Integer> map = this.freeRidesByCurrency;
        int hashCode8 = (((hashCode7 + (map == null ? 0 : map.hashCode())) * 31) + Integer.hashCode(this.rideCount)) * 31;
        boolean z = this.admin;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode8 + i) * 31;
        boolean z2 = this.tester;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.receivedSignupCoupon;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.hasSignupCode;
        int i7 = (i6 + (z4 ? 1 : z4 ? 1 : 0)) * 31;
        DateTime dateTime = this.createdAt;
        int hashCode9 = (i7 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.agreedAt;
        int hashCode10 = (hashCode9 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        DateTime dateTime3 = this.suspendedAt;
        int hashCode11 = (hashCode10 + (dateTime3 == null ? 0 : dateTime3.hashCode())) * 31;
        Boolean bool = this.canCharge;
        int hashCode12 = (hashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canDeliver;
        int hashCode13 = (hashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isCashPay;
        int hashCode14 = (hashCode13 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        LocalDateTime localDateTime = this.birthdate;
        int hashCode15 = (hashCode14 + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
        DateTime dateTime4 = this.emailVerifiedAt;
        int hashCode16 = (hashCode15 + (dateTime4 == null ? 0 : dateTime4.hashCode())) * 31;
        String str7 = this.stripePublicKey;
        int hashCode17 = (hashCode16 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.locale;
        int hashCode18 = (hashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.warehouseId;
        int hashCode19 = (hashCode18 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List<OperatorRole> list = this.operatorRoles;
        return hashCode19 + (list != null ? list.hashCode() : 0);
    }

    public final Boolean isCashPay() {
        return this.isCashPay;
    }

    public String toString() {
        String str = this.f66632id;
        String str2 = this.name;
        String str3 = this.email;
        String str4 = this.phone;
        String str5 = this.imageUrl;
        int i = this.balance;
        Map<String, Long> map = this.balances;
        String str6 = this.customerId;
        String str7 = this.customerToken;
        int i2 = this.freeRides;
        Map<String, Integer> map2 = this.freeRidesByCurrency;
        int i3 = this.rideCount;
        boolean z = this.admin;
        boolean z2 = this.tester;
        boolean z3 = this.receivedSignupCoupon;
        boolean z4 = this.hasSignupCode;
        DateTime dateTime = this.createdAt;
        DateTime dateTime2 = this.agreedAt;
        DateTime dateTime3 = this.suspendedAt;
        Boolean bool = this.canCharge;
        Boolean bool2 = this.canDeliver;
        Boolean bool3 = this.isCashPay;
        LocalDateTime localDateTime = this.birthdate;
        DateTime dateTime4 = this.emailVerifiedAt;
        String str8 = this.stripePublicKey;
        String str9 = this.locale;
        String str10 = this.warehouseId;
        List<OperatorRole> list = this.operatorRoles;
        return "User(id=" + str + ", name=" + str2 + ", email=" + str3 + ", phone=" + str4 + ", imageUrl=" + str5 + ", balance=" + i + ", balances=" + map + ", customerId=" + str6 + ", customerToken=" + str7 + ", freeRides=" + i2 + ", freeRidesByCurrency=" + map2 + ", rideCount=" + i3 + ", admin=" + z + ", tester=" + z2 + ", receivedSignupCoupon=" + z3 + ", hasSignupCode=" + z4 + ", createdAt=" + dateTime + ", agreedAt=" + dateTime2 + ", suspendedAt=" + dateTime3 + ", canCharge=" + bool + ", canDeliver=" + bool2 + ", isCashPay=" + bool3 + ", birthdate=" + localDateTime + ", emailVerifiedAt=" + dateTime4 + ", stripePublicKey=" + str8 + ", locale=" + str9 + ", warehouseId=" + str10 + ", operatorRoles=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66632id);
        out.writeString(this.name);
        out.writeString(this.email);
        out.writeString(this.phone);
        out.writeString(this.imageUrl);
        out.writeInt(this.balance);
        Map<String, Long> map = this.balances;
        out.writeInt(map.size());
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeLong(entry.getValue().longValue());
        }
        out.writeString(this.customerId);
        out.writeString(this.customerToken);
        out.writeInt(this.freeRides);
        Map<String, Integer> map2 = this.freeRidesByCurrency;
        if (map2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map2.size());
            for (Map.Entry<String, Integer> entry2 : map2.entrySet()) {
                out.writeString(entry2.getKey());
                out.writeInt(entry2.getValue().intValue());
            }
        }
        out.writeInt(this.rideCount);
        out.writeInt(this.admin ? 1 : 0);
        out.writeInt(this.tester ? 1 : 0);
        out.writeInt(this.receivedSignupCoupon ? 1 : 0);
        out.writeInt(this.hasSignupCode ? 1 : 0);
        out.writeSerializable(this.createdAt);
        out.writeSerializable(this.agreedAt);
        out.writeSerializable(this.suspendedAt);
        Boolean bool = this.canCharge;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.canDeliver;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.isCashPay;
        if (bool3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        out.writeSerializable(this.birthdate);
        out.writeSerializable(this.emailVerifiedAt);
        out.writeString(this.stripePublicKey);
        out.writeString(this.locale);
        out.writeString(this.warehouseId);
        List<OperatorRole> list = this.operatorRoles;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(list.size());
        for (OperatorRole operatorRole : list) {
            operatorRole.writeToParcel(out, i);
        }
    }

    public User(String id, String str, String str2, String str3, String str4, int i, Map<String, Long> balances, String str5, String str6, int i2, Map<String, Integer> map, int i3, boolean z, boolean z2, boolean z3, boolean z4, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, Boolean bool, Boolean bool2, Boolean bool3, LocalDateTime localDateTime, DateTime dateTime4, String str7, String str8, String str9, List<OperatorRole> list) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(balances, "balances");
        this.f66632id = id;
        this.name = str;
        this.email = str2;
        this.phone = str3;
        this.imageUrl = str4;
        this.balance = i;
        this.balances = balances;
        this.customerId = str5;
        this.customerToken = str6;
        this.freeRides = i2;
        this.freeRidesByCurrency = map;
        this.rideCount = i3;
        this.admin = z;
        this.tester = z2;
        this.receivedSignupCoupon = z3;
        this.hasSignupCode = z4;
        this.createdAt = dateTime;
        this.agreedAt = dateTime2;
        this.suspendedAt = dateTime3;
        this.canCharge = bool;
        this.canDeliver = bool2;
        this.isCashPay = bool3;
        this.birthdate = localDateTime;
        this.emailVerifiedAt = dateTime4;
        this.stripePublicKey = str7;
        this.locale = str8;
        this.warehouseId = str9;
        this.operatorRoles = list;
    }

    public /* synthetic */ User(String str, String str2, String str3, String str4, String str5, int i, Map map, String str6, String str7, int i2, Map map2, int i3, boolean z, boolean z2, boolean z3, boolean z4, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, Boolean bool, Boolean bool2, Boolean bool3, LocalDateTime localDateTime, DateTime dateTime4, String str8, String str9, String str10, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? null : str2, (i4 & 4) != 0 ? null : str3, (i4 & 8) != 0 ? null : str4, (i4 & 16) != 0 ? null : str5, (i4 & 32) != 0 ? 0 : i, (i4 & 64) != 0 ? MapsKt__MapsKt.emptyMap() : map, (i4 & 128) != 0 ? null : str6, (i4 & 256) != 0 ? null : str7, (i4 & 512) != 0 ? 0 : i2, (i4 & 1024) != 0 ? null : map2, (i4 & 2048) != 0 ? 0 : i3, (i4 & 4096) != 0 ? false : z, (i4 & 8192) != 0 ? false : z2, (i4 & 16384) != 0 ? false : z3, (i4 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? false : z4, (i4 & 65536) != 0 ? null : dateTime, (i4 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? null : dateTime2, (i4 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? null : dateTime3, (i4 & 524288) != 0 ? Boolean.FALSE : bool, (i4 & 1048576) != 0 ? Boolean.FALSE : bool2, (i4 & 2097152) != 0 ? Boolean.FALSE : bool3, (i4 & 4194304) != 0 ? null : localDateTime, (i4 & 8388608) != 0 ? null : dateTime4, (i4 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : str8, (i4 & 33554432) != 0 ? null : str9, (i4 & 67108864) != 0 ? null : str10, (i4 & 134217728) != 0 ? null : list);
    }
}
