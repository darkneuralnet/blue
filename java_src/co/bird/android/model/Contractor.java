package co.bird.android.model;

import co.bird.android.model.wire.configs.Config;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.Source;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\bN\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bí\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0006\u0012\b\b\u0002\u0010 \u001a\u00020\u0006\u0012\b\b\u0002\u0010!\u001a\u00020\u0006\u0012\b\b\u0002\u0010\"\u001a\u00020\u001c\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010$\u001a\u00020\u001c\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&¢\u0006\u0002\u0010'J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0014HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010^\u001a\u00020\u001cHÆ\u0003J\t\u0010_\u001a\u00020\u001cHÆ\u0003J\t\u0010`\u001a\u00020\u0006HÆ\u0003J\t\u0010a\u001a\u00020\u0006HÆ\u0003J\t\u0010b\u001a\u00020\u0006HÆ\u0003J\t\u0010c\u001a\u00020\u0006HÆ\u0003J\t\u0010d\u001a\u00020\u001cHÆ\u0003J\t\u0010e\u001a\u00020\u0006HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010g\u001a\u00020\u001cHÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010&HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010j\u001a\u00020\u0003HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jñ\u0002\u0010o\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010 \u001a\u00020\u00062\b\b\u0002\u0010!\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020\u001c2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010$\u001a\u00020\u001c2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&HÆ\u0001J\u0013\u0010p\u001a\u00020\u001c2\b\u0010q\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010r\u001a\u00020\u0006HÖ\u0001J\u000e\u0010s\u001a\u00020\u001c2\u0006\u0010t\u001a\u00020uJ\t\u0010v\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010)R\u0016\u0010\u001f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010.R\u0016\u0010\u001e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010.R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010)R\u0018\u0010%\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010)R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010+R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010)R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010+R\u0016\u0010!\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010.R\u0016\u0010 \u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010.R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010+R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010)R\u001c\u0010\u001d\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001c\u0010\u001b\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bA\u0010>\u001a\u0004\bB\u0010@R\u0016\u0010$\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010@R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010)R\u0016\u0010\"\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010@R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010)R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010)R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010)R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010)R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010)R\u0018\u0010#\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010)R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010+R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010+R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010)R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010)¨\u0006w"}, m28432d2 = {"Lco/bird/android/model/Contractor;", "", "id", "", "userId", "balance", "", "stripeId", "currency", "firstName", "lastName", PaymentMethod.BillingDetails.PARAM_PHONE, "birthdate", PaymentMethod.BillingDetails.PARAM_ADDRESS, "unitIdentifier", "city", TransferTable.COLUMN_STATE, "country", "postalCode", "createdAt", "Lorg/joda/time/DateTime;", "taxIdAt", "externalAccountAt", "agreedAt", "tutorialCompletedAt", "depositAgreedAt", "addressConfirmedAt", "hasTaxId", "", "hasExternalAccount", "chargesPerWeek", "chargesGoalPerWeek", "dropsPercentPerWeek", "dropsPercentGoalPerWeek", "isAllowedToOrderPowerSupplies", "stripePublicKey", "hourly", "contractorLevel", "Lco/bird/android/model/ContractorLevel;", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZZIIIIZLjava/lang/String;ZLco/bird/android/model/ContractorLevel;)V", "getAddress", "()Ljava/lang/String;", "getAddressConfirmedAt", "()Lorg/joda/time/DateTime;", "getAgreedAt", "getBalance", "()I", "getBirthdate", "getChargesGoalPerWeek", "getChargesPerWeek", "getCity", "getContractorLevel", "()Lco/bird/android/model/ContractorLevel;", "getCountry", "getCreatedAt", "getCurrency", "getDepositAgreedAt", "getDropsPercentGoalPerWeek", "getDropsPercentPerWeek", "getExternalAccountAt", "getFirstName", "getHasExternalAccount$annotations", "()V", "getHasExternalAccount", "()Z", "getHasTaxId$annotations", "getHasTaxId", "getHourly", "getId", "getLastName", "getPhone", "getPostalCode", "getState", "getStripeId", "getStripePublicKey", "getTaxIdAt", "getTutorialCompletedAt", "getUnitIdentifier", "getUserId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "isHourly", "config", "Lco/bird/android/model/wire/configs/Config;", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class Contractor {
    @JsonProperty(PaymentMethod.BillingDetails.PARAM_ADDRESS)
    @InterfaceC41208ft5(PaymentMethod.BillingDetails.PARAM_ADDRESS)
    private final String address;
    @JsonProperty("address_confirmed_at")
    @InterfaceC41208ft5("address_confirmed_at")
    private final DateTime addressConfirmedAt;
    @JsonProperty("agreed_at")
    @InterfaceC41208ft5("agreed_at")
    private final DateTime agreedAt;
    @JsonProperty("balance")
    @InterfaceC41208ft5("balance")
    private final int balance;
    @JsonProperty("birthdate")
    @InterfaceC41208ft5("birthdate")
    private final String birthdate;
    @JsonProperty("charges_goal_per_week")
    @InterfaceC41208ft5("charges_goal_per_week")
    private final int chargesGoalPerWeek;
    @JsonProperty("charges_per_week")
    @InterfaceC41208ft5("charges_per_week")
    private final int chargesPerWeek;
    @JsonProperty("city")
    @InterfaceC41208ft5("city")
    private final String city;
    @JsonProperty("contractor_level")
    @InterfaceC41208ft5("contractor_level")
    private final ContractorLevel contractorLevel;
    @JsonProperty("country")
    @InterfaceC41208ft5("country")
    private final String country;
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("currency")
    @InterfaceC41208ft5("currency")
    private final String currency;
    @JsonProperty("deposit_agreed_at")
    @InterfaceC41208ft5("deposit_agreed_at")
    private final DateTime depositAgreedAt;
    @JsonProperty("drops_percent_goal_per_week")
    @InterfaceC41208ft5("drops_percent_goal_per_week")
    private final int dropsPercentGoalPerWeek;
    @JsonProperty("drops_percent_per_week")
    @InterfaceC41208ft5("drops_percent_per_week")
    private final int dropsPercentPerWeek;
    @JsonProperty("external_account_at")
    @InterfaceC41208ft5("external_account_at")
    private final DateTime externalAccountAt;
    @JsonProperty("first_name")
    @InterfaceC41208ft5("first_name")
    private final String firstName;
    @JsonProperty("has_external_account")
    @InterfaceC41208ft5("has_external_account")
    private final boolean hasExternalAccount;
    @JsonProperty("has_tax_id")
    @InterfaceC41208ft5("has_tax_id")
    private final boolean hasTaxId;
    @JsonProperty("hourly")
    @InterfaceC41208ft5("hourly")
    private final boolean hourly;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66579id;
    @JsonProperty("can_order_power_supplies")
    @InterfaceC41208ft5("can_order_power_supplies")
    private final boolean isAllowedToOrderPowerSupplies;
    @JsonProperty("last_name")
    @InterfaceC41208ft5("last_name")
    private final String lastName;
    @JsonProperty(PaymentMethod.BillingDetails.PARAM_PHONE)
    @InterfaceC41208ft5(PaymentMethod.BillingDetails.PARAM_PHONE)
    private final String phone;
    @JsonProperty("postal_code")
    @InterfaceC41208ft5("postal_code")
    private final String postalCode;
    @JsonProperty(TransferTable.COLUMN_STATE)
    @InterfaceC41208ft5(TransferTable.COLUMN_STATE)
    private final String state;
    @JsonProperty("stripe_id")
    @InterfaceC41208ft5("stripe_id")
    private final String stripeId;
    @JsonProperty("stripe_public_key")
    @InterfaceC41208ft5("stripe_public_key")
    private final String stripePublicKey;
    @JsonProperty("tax_id_at")
    @InterfaceC41208ft5("tax_id_at")
    private final DateTime taxIdAt;
    @JsonProperty("tutorial_completed_at")
    @InterfaceC41208ft5("tutorial_completed_at")
    private final DateTime tutorialCompletedAt;
    @JsonProperty("unit_identifier")
    @InterfaceC41208ft5("unit_identifier")
    private final String unitIdentifier;
    @JsonProperty("user_id")
    @InterfaceC41208ft5("user_id")
    private final String userId;

    public Contractor() {
        this(null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, 0, 0, 0, false, null, false, null, -1, null);
    }

    @Deprecated(message = "Use externalAccountAt")
    public static /* synthetic */ void getHasExternalAccount$annotations() {
    }

    @Deprecated(message = "Use taxIdAt")
    public static /* synthetic */ void getHasTaxId$annotations() {
    }

    public final String component1() {
        return this.f66579id;
    }

    public final String component10() {
        return this.address;
    }

    public final String component11() {
        return this.unitIdentifier;
    }

    public final String component12() {
        return this.city;
    }

    public final String component13() {
        return this.state;
    }

    public final String component14() {
        return this.country;
    }

    public final String component15() {
        return this.postalCode;
    }

    public final DateTime component16() {
        return this.createdAt;
    }

    public final DateTime component17() {
        return this.taxIdAt;
    }

    public final DateTime component18() {
        return this.externalAccountAt;
    }

    public final DateTime component19() {
        return this.agreedAt;
    }

    public final String component2() {
        return this.userId;
    }

    public final DateTime component20() {
        return this.tutorialCompletedAt;
    }

    public final DateTime component21() {
        return this.depositAgreedAt;
    }

    public final DateTime component22() {
        return this.addressConfirmedAt;
    }

    public final boolean component23() {
        return this.hasTaxId;
    }

    public final boolean component24() {
        return this.hasExternalAccount;
    }

    public final int component25() {
        return this.chargesPerWeek;
    }

    public final int component26() {
        return this.chargesGoalPerWeek;
    }

    public final int component27() {
        return this.dropsPercentPerWeek;
    }

    public final int component28() {
        return this.dropsPercentGoalPerWeek;
    }

    public final boolean component29() {
        return this.isAllowedToOrderPowerSupplies;
    }

    public final int component3() {
        return this.balance;
    }

    public final String component30() {
        return this.stripePublicKey;
    }

    public final boolean component31() {
        return this.hourly;
    }

    public final ContractorLevel component32() {
        return this.contractorLevel;
    }

    public final String component4() {
        return this.stripeId;
    }

    public final String component5() {
        return this.currency;
    }

    public final String component6() {
        return this.firstName;
    }

    public final String component7() {
        return this.lastName;
    }

    public final String component8() {
        return this.phone;
    }

    public final String component9() {
        return this.birthdate;
    }

    public final Contractor copy(String id, String str, int i, String str2, String currency, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, DateTime createdAt, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, DateTime dateTime5, DateTime dateTime6, boolean z, boolean z2, int i2, int i3, int i4, int i5, boolean z3, String str13, boolean z4, ContractorLevel contractorLevel) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new Contractor(id, str, i, str2, currency, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, createdAt, dateTime, dateTime2, dateTime3, dateTime4, dateTime5, dateTime6, z, z2, i2, i3, i4, i5, z3, str13, z4, contractorLevel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Contractor) {
            Contractor contractor = (Contractor) obj;
            return Intrinsics.areEqual(this.f66579id, contractor.f66579id) && Intrinsics.areEqual(this.userId, contractor.userId) && this.balance == contractor.balance && Intrinsics.areEqual(this.stripeId, contractor.stripeId) && Intrinsics.areEqual(this.currency, contractor.currency) && Intrinsics.areEqual(this.firstName, contractor.firstName) && Intrinsics.areEqual(this.lastName, contractor.lastName) && Intrinsics.areEqual(this.phone, contractor.phone) && Intrinsics.areEqual(this.birthdate, contractor.birthdate) && Intrinsics.areEqual(this.address, contractor.address) && Intrinsics.areEqual(this.unitIdentifier, contractor.unitIdentifier) && Intrinsics.areEqual(this.city, contractor.city) && Intrinsics.areEqual(this.state, contractor.state) && Intrinsics.areEqual(this.country, contractor.country) && Intrinsics.areEqual(this.postalCode, contractor.postalCode) && Intrinsics.areEqual(this.createdAt, contractor.createdAt) && Intrinsics.areEqual(this.taxIdAt, contractor.taxIdAt) && Intrinsics.areEqual(this.externalAccountAt, contractor.externalAccountAt) && Intrinsics.areEqual(this.agreedAt, contractor.agreedAt) && Intrinsics.areEqual(this.tutorialCompletedAt, contractor.tutorialCompletedAt) && Intrinsics.areEqual(this.depositAgreedAt, contractor.depositAgreedAt) && Intrinsics.areEqual(this.addressConfirmedAt, contractor.addressConfirmedAt) && this.hasTaxId == contractor.hasTaxId && this.hasExternalAccount == contractor.hasExternalAccount && this.chargesPerWeek == contractor.chargesPerWeek && this.chargesGoalPerWeek == contractor.chargesGoalPerWeek && this.dropsPercentPerWeek == contractor.dropsPercentPerWeek && this.dropsPercentGoalPerWeek == contractor.dropsPercentGoalPerWeek && this.isAllowedToOrderPowerSupplies == contractor.isAllowedToOrderPowerSupplies && Intrinsics.areEqual(this.stripePublicKey, contractor.stripePublicKey) && this.hourly == contractor.hourly && this.contractorLevel == contractor.contractorLevel;
        }
        return false;
    }

    public final String getAddress() {
        return this.address;
    }

    public final DateTime getAddressConfirmedAt() {
        return this.addressConfirmedAt;
    }

    public final DateTime getAgreedAt() {
        return this.agreedAt;
    }

    public final int getBalance() {
        return this.balance;
    }

    public final String getBirthdate() {
        return this.birthdate;
    }

    public final int getChargesGoalPerWeek() {
        return this.chargesGoalPerWeek;
    }

    public final int getChargesPerWeek() {
        return this.chargesPerWeek;
    }

    public final String getCity() {
        return this.city;
    }

    public final ContractorLevel getContractorLevel() {
        return this.contractorLevel;
    }

    public final String getCountry() {
        return this.country;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final DateTime getDepositAgreedAt() {
        return this.depositAgreedAt;
    }

    public final int getDropsPercentGoalPerWeek() {
        return this.dropsPercentGoalPerWeek;
    }

    public final int getDropsPercentPerWeek() {
        return this.dropsPercentPerWeek;
    }

    public final DateTime getExternalAccountAt() {
        return this.externalAccountAt;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final boolean getHasExternalAccount() {
        return this.hasExternalAccount;
    }

    public final boolean getHasTaxId() {
        return this.hasTaxId;
    }

    public final boolean getHourly() {
        return this.hourly;
    }

    public final String getId() {
        return this.f66579id;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getState() {
        return this.state;
    }

    public final String getStripeId() {
        return this.stripeId;
    }

    public final String getStripePublicKey() {
        return this.stripePublicKey;
    }

    public final DateTime getTaxIdAt() {
        return this.taxIdAt;
    }

    public final DateTime getTutorialCompletedAt() {
        return this.tutorialCompletedAt;
    }

    public final String getUnitIdentifier() {
        return this.unitIdentifier;
    }

    public final String getUserId() {
        return this.userId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f66579id.hashCode() * 31;
        String str = this.userId;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.balance)) * 31;
        String str2 = this.stripeId;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.currency.hashCode()) * 31;
        String str3 = this.firstName;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lastName;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.phone;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.birthdate;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.address;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.unitIdentifier;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.city;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.state;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.country;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.postalCode;
        int hashCode13 = (((hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31) + this.createdAt.hashCode()) * 31;
        DateTime dateTime = this.taxIdAt;
        int hashCode14 = (hashCode13 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.externalAccountAt;
        int hashCode15 = (hashCode14 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        DateTime dateTime3 = this.agreedAt;
        int hashCode16 = (hashCode15 + (dateTime3 == null ? 0 : dateTime3.hashCode())) * 31;
        DateTime dateTime4 = this.tutorialCompletedAt;
        int hashCode17 = (hashCode16 + (dateTime4 == null ? 0 : dateTime4.hashCode())) * 31;
        DateTime dateTime5 = this.depositAgreedAt;
        int hashCode18 = (hashCode17 + (dateTime5 == null ? 0 : dateTime5.hashCode())) * 31;
        DateTime dateTime6 = this.addressConfirmedAt;
        int hashCode19 = (hashCode18 + (dateTime6 == null ? 0 : dateTime6.hashCode())) * 31;
        boolean z = this.hasTaxId;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode19 + i) * 31;
        boolean z2 = this.hasExternalAccount;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int hashCode20 = (((((((((i2 + i3) * 31) + Integer.hashCode(this.chargesPerWeek)) * 31) + Integer.hashCode(this.chargesGoalPerWeek)) * 31) + Integer.hashCode(this.dropsPercentPerWeek)) * 31) + Integer.hashCode(this.dropsPercentGoalPerWeek)) * 31;
        boolean z3 = this.isAllowedToOrderPowerSupplies;
        int i4 = z3;
        if (z3 != 0) {
            i4 = 1;
        }
        int i5 = (hashCode20 + i4) * 31;
        String str13 = this.stripePublicKey;
        int hashCode21 = (i5 + (str13 == null ? 0 : str13.hashCode())) * 31;
        boolean z4 = this.hourly;
        int i6 = (hashCode21 + (z4 ? 1 : z4 ? 1 : 0)) * 31;
        ContractorLevel contractorLevel = this.contractorLevel;
        return i6 + (contractorLevel != null ? contractorLevel.hashCode() : 0);
    }

    public final boolean isAllowedToOrderPowerSupplies() {
        return this.isAllowedToOrderPowerSupplies;
    }

    public final boolean isHourly(Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (this.hourly && config.getEnableHourlyContractor()) {
            return true;
        }
        return false;
    }

    public String toString() {
        String str = this.f66579id;
        String str2 = this.userId;
        int i = this.balance;
        String str3 = this.stripeId;
        String str4 = this.currency;
        String str5 = this.firstName;
        String str6 = this.lastName;
        String str7 = this.phone;
        String str8 = this.birthdate;
        String str9 = this.address;
        String str10 = this.unitIdentifier;
        String str11 = this.city;
        String str12 = this.state;
        String str13 = this.country;
        String str14 = this.postalCode;
        DateTime dateTime = this.createdAt;
        DateTime dateTime2 = this.taxIdAt;
        DateTime dateTime3 = this.externalAccountAt;
        DateTime dateTime4 = this.agreedAt;
        DateTime dateTime5 = this.tutorialCompletedAt;
        DateTime dateTime6 = this.depositAgreedAt;
        DateTime dateTime7 = this.addressConfirmedAt;
        boolean z = this.hasTaxId;
        boolean z2 = this.hasExternalAccount;
        int i2 = this.chargesPerWeek;
        int i3 = this.chargesGoalPerWeek;
        int i4 = this.dropsPercentPerWeek;
        int i5 = this.dropsPercentGoalPerWeek;
        boolean z3 = this.isAllowedToOrderPowerSupplies;
        String str15 = this.stripePublicKey;
        boolean z4 = this.hourly;
        ContractorLevel contractorLevel = this.contractorLevel;
        return "Contractor(id=" + str + ", userId=" + str2 + ", balance=" + i + ", stripeId=" + str3 + ", currency=" + str4 + ", firstName=" + str5 + ", lastName=" + str6 + ", phone=" + str7 + ", birthdate=" + str8 + ", address=" + str9 + ", unitIdentifier=" + str10 + ", city=" + str11 + ", state=" + str12 + ", country=" + str13 + ", postalCode=" + str14 + ", createdAt=" + dateTime + ", taxIdAt=" + dateTime2 + ", externalAccountAt=" + dateTime3 + ", agreedAt=" + dateTime4 + ", tutorialCompletedAt=" + dateTime5 + ", depositAgreedAt=" + dateTime6 + ", addressConfirmedAt=" + dateTime7 + ", hasTaxId=" + z + ", hasExternalAccount=" + z2 + ", chargesPerWeek=" + i2 + ", chargesGoalPerWeek=" + i3 + ", dropsPercentPerWeek=" + i4 + ", dropsPercentGoalPerWeek=" + i5 + ", isAllowedToOrderPowerSupplies=" + z3 + ", stripePublicKey=" + str15 + ", hourly=" + z4 + ", contractorLevel=" + contractorLevel + ")";
    }

    public Contractor(String id, String str, int i, String str2, String currency, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, DateTime createdAt, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, DateTime dateTime5, DateTime dateTime6, boolean z, boolean z2, int i2, int i3, int i4, int i5, boolean z3, String str13, boolean z4, ContractorLevel contractorLevel) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.f66579id = id;
        this.userId = str;
        this.balance = i;
        this.stripeId = str2;
        this.currency = currency;
        this.firstName = str3;
        this.lastName = str4;
        this.phone = str5;
        this.birthdate = str6;
        this.address = str7;
        this.unitIdentifier = str8;
        this.city = str9;
        this.state = str10;
        this.country = str11;
        this.postalCode = str12;
        this.createdAt = createdAt;
        this.taxIdAt = dateTime;
        this.externalAccountAt = dateTime2;
        this.agreedAt = dateTime3;
        this.tutorialCompletedAt = dateTime4;
        this.depositAgreedAt = dateTime5;
        this.addressConfirmedAt = dateTime6;
        this.hasTaxId = z;
        this.hasExternalAccount = z2;
        this.chargesPerWeek = i2;
        this.chargesGoalPerWeek = i3;
        this.dropsPercentPerWeek = i4;
        this.dropsPercentGoalPerWeek = i5;
        this.isAllowedToOrderPowerSupplies = z3;
        this.stripePublicKey = str13;
        this.hourly = z4;
        this.contractorLevel = contractorLevel;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Contractor(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, DateTime dateTime5, DateTime dateTime6, DateTime dateTime7, boolean z, boolean z2, int i2, int i3, int i4, int i5, boolean z3, String str15, boolean z4, ContractorLevel contractorLevel, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r66, r5, (65536 & i6) != 0 ? null : dateTime2, (i6 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? null : dateTime3, (i6 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? null : dateTime4, (i6 & 524288) != 0 ? null : dateTime5, (i6 & 1048576) != 0 ? null : dateTime6, (i6 & 2097152) != 0 ? null : dateTime7, (i6 & 4194304) != 0 ? false : z, (i6 & 8388608) != 0 ? false : z2, (i6 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? 0 : i2, (i6 & 33554432) != 0 ? 0 : i3, (i6 & 67108864) != 0 ? 0 : i4, (i6 & 134217728) != 0 ? 0 : i5, (i6 & 268435456) != 0 ? false : z3, (i6 & 536870912) != 0 ? null : str15, (i6 & 1073741824) != 0 ? false : z4, (i6 & Integer.MIN_VALUE) != 0 ? null : contractorLevel);
        String str16;
        String str17;
        DateTime dateTime8;
        String str18 = (i6 & 1) != 0 ? "" : str;
        String str19 = (i6 & 2) != 0 ? null : str2;
        int i7 = (i6 & 4) != 0 ? 0 : i;
        String str20 = (i6 & 8) != 0 ? null : str3;
        String str21 = (i6 & 16) != 0 ? Source.USD : str4;
        String str22 = (i6 & 32) != 0 ? null : str5;
        String str23 = (i6 & 64) != 0 ? null : str6;
        String str24 = (i6 & 128) != 0 ? null : str7;
        String str25 = (i6 & 256) != 0 ? null : str8;
        String str26 = (i6 & 512) != 0 ? null : str9;
        String str27 = (i6 & 1024) != 0 ? null : str10;
        String str28 = (i6 & 2048) != 0 ? null : str11;
        String str29 = (i6 & 4096) != 0 ? null : str12;
        String str30 = (i6 & 8192) != 0 ? null : str13;
        String str31 = (i6 & 16384) != 0 ? null : str14;
        if ((i6 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0) {
            str17 = str31;
            dateTime8 = DateTime.now();
            str16 = str30;
            Intrinsics.checkNotNullExpressionValue(dateTime8, "now()");
        } else {
            str16 = str30;
            str17 = str31;
            dateTime8 = dateTime;
        }
    }
}
