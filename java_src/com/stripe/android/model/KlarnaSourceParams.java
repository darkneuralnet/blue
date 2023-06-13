package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.google.android.gms.location.places.Place;
import com.stripe.android.model.KlarnaSourceParams;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0004@ABCB\u0081\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u0015J\t\u0010&\u001a\u00020\u0004HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0087\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÆ\u0001J\t\u00101\u001a\u000202HÖ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u000202HÖ\u0001J\u0014\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020609H\u0016J\t\u0010:\u001a\u00020\u0004HÖ\u0001J\u0019\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u000202HÖ\u0001R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001b¨\u0006D"}, m28432d2 = {"Lcom/stripe/android/model/KlarnaSourceParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "purchaseCountry", "", "lineItems", "", "Lcom/stripe/android/model/KlarnaSourceParams$LineItem;", "customPaymentMethods", "", "Lcom/stripe/android/model/KlarnaSourceParams$CustomPaymentMethods;", "billingEmail", "billingPhone", "billingAddress", "Lcom/stripe/android/model/Address;", "billingFirstName", "billingLastName", "billingDob", "Lcom/stripe/android/model/DateOfBirth;", "pageOptions", "Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions;", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/DateOfBirth;Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions;)V", "getBillingAddress", "()Lcom/stripe/android/model/Address;", "getBillingDob", "()Lcom/stripe/android/model/DateOfBirth;", "getBillingEmail", "()Ljava/lang/String;", "getBillingFirstName", "getBillingLastName", "getBillingPhone", "getCustomPaymentMethods", "()Ljava/util/Set;", "getLineItems", "()Ljava/util/List;", "getPageOptions", "()Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions;", "getPurchaseCountry", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "CustomPaymentMethods", "LineItem", "PaymentPageOptions", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nKlarnaSourceParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KlarnaSourceParams.kt\ncom/stripe/android/model/KlarnaSourceParams\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,253:1\n1#2:254\n1045#3:255\n*S KotlinDebug\n*F\n+ 1 KlarnaSourceParams.kt\ncom/stripe/android/model/KlarnaSourceParams\n*L\n103#1:255\n*E\n"})
/* loaded from: classes7.dex */
public final class KlarnaSourceParams implements StripeParamsModel, Parcelable {
    @Deprecated
    private static final String PARAM_CUSTOM_PAYMENT_METHODS = "custom_payment_methods";
    @Deprecated
    private static final String PARAM_DOB_DAY = "owner_dob_day";
    @Deprecated
    private static final String PARAM_DOB_MONTH = "owner_dob_month";
    @Deprecated
    private static final String PARAM_DOB_YEAR = "owner_dob_year";
    @Deprecated
    private static final String PARAM_FIRST_NAME = "first_name";
    @Deprecated
    private static final String PARAM_LAST_NAME = "last_name";
    @Deprecated
    private static final String PARAM_PRODUCT = "product";
    @Deprecated
    private static final String PARAM_PURCHASE_COUNTRY = "purchase_country";
    private final Address billingAddress;
    private final DateOfBirth billingDob;
    private final String billingEmail;
    private final String billingFirstName;
    private final String billingLastName;
    private final String billingPhone;
    private final Set<CustomPaymentMethods> customPaymentMethods;
    private final List<LineItem> lineItems;
    private final PaymentPageOptions pageOptions;
    private final String purchaseCountry;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<KlarnaSourceParams> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/model/KlarnaSourceParams$Companion;", "", "()V", "PARAM_CUSTOM_PAYMENT_METHODS", "", "PARAM_DOB_DAY", "PARAM_DOB_MONTH", "PARAM_DOB_YEAR", "PARAM_FIRST_NAME", "PARAM_LAST_NAME", "PARAM_PRODUCT", "PARAM_PURCHASE_COUNTRY", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<KlarnaSourceParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KlarnaSourceParams createFromParcel(Parcel parcel) {
            String readString;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            for (int i2 = 0; i2 != readInt; i2++) {
                arrayList.add(LineItem.CREATOR.createFromParcel(parcel));
            }
            int readInt2 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt2);
            while (true) {
                readString = parcel.readString();
                if (i == readInt2) {
                    break;
                }
                linkedHashSet.add(CustomPaymentMethods.valueOf(readString));
                i++;
            }
            return new KlarnaSourceParams(readString2, arrayList, linkedHashSet, readString, parcel.readString(), parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : DateOfBirth.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PaymentPageOptions.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KlarnaSourceParams[] newArray(int i) {
            return new KlarnaSourceParams[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/model/KlarnaSourceParams$CustomPaymentMethods;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_release", "()Ljava/lang/String;", "PayIn4", "Installments", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum CustomPaymentMethods {
        PayIn4("payin4"),
        Installments("installments");
        
        private final String code;

        CustomPaymentMethods(String str) {
            this.code = str;
        }

        public final String getCode$payments_core_release() {
            return this.code;
        }
    }

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001%B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0018J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, m28432d2 = {"Lcom/stripe/android/model/KlarnaSourceParams$LineItem;", "Landroid/os/Parcelable;", "itemType", "Lcom/stripe/android/model/KlarnaSourceParams$LineItem$Type;", "itemDescription", "", "totalAmount", "", "quantity", "(Lcom/stripe/android/model/KlarnaSourceParams$LineItem$Type;Ljava/lang/String;ILjava/lang/Integer;)V", "getItemDescription", "()Ljava/lang/String;", "getItemType", "()Lcom/stripe/android/model/KlarnaSourceParams$LineItem$Type;", "getQuantity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTotalAmount", "()I", "component1", "component2", "component3", "component4", "copy", "(Lcom/stripe/android/model/KlarnaSourceParams$LineItem$Type;Ljava/lang/String;ILjava/lang/Integer;)Lcom/stripe/android/model/KlarnaSourceParams$LineItem;", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Type", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class LineItem implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<LineItem> CREATOR = new Creator();
        private final String itemDescription;
        private final Type itemType;
        private final Integer quantity;
        private final int totalAmount;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<LineItem> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LineItem createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LineItem(Type.valueOf(parcel.readString()), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LineItem[] newArray(int i) {
                return new LineItem[i];
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/model/KlarnaSourceParams$LineItem$Type;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_release", "()Ljava/lang/String;", "Sku", "Tax", "Shipping", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public enum Type {
            Sku("sku"),
            Tax("tax"),
            Shipping("shipping");
            
            private final String code;

            Type(String str) {
                this.code = str;
            }

            public final String getCode$payments_core_release() {
                return this.code;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public LineItem(Type itemType, String itemDescription, int i) {
            this(itemType, itemDescription, i, null, 8, null);
            Intrinsics.checkNotNullParameter(itemType, "itemType");
            Intrinsics.checkNotNullParameter(itemDescription, "itemDescription");
        }

        public static /* synthetic */ LineItem copy$default(LineItem lineItem, Type type, String str, int i, Integer num, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                type = lineItem.itemType;
            }
            if ((i2 & 2) != 0) {
                str = lineItem.itemDescription;
            }
            if ((i2 & 4) != 0) {
                i = lineItem.totalAmount;
            }
            if ((i2 & 8) != 0) {
                num = lineItem.quantity;
            }
            return lineItem.copy(type, str, i, num);
        }

        public final Type component1() {
            return this.itemType;
        }

        public final String component2() {
            return this.itemDescription;
        }

        public final int component3() {
            return this.totalAmount;
        }

        public final Integer component4() {
            return this.quantity;
        }

        public final LineItem copy(Type itemType, String itemDescription, int i, Integer num) {
            Intrinsics.checkNotNullParameter(itemType, "itemType");
            Intrinsics.checkNotNullParameter(itemDescription, "itemDescription");
            return new LineItem(itemType, itemDescription, i, num);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof LineItem) {
                LineItem lineItem = (LineItem) obj;
                return this.itemType == lineItem.itemType && Intrinsics.areEqual(this.itemDescription, lineItem.itemDescription) && this.totalAmount == lineItem.totalAmount && Intrinsics.areEqual(this.quantity, lineItem.quantity);
            }
            return false;
        }

        public final String getItemDescription() {
            return this.itemDescription;
        }

        public final Type getItemType() {
            return this.itemType;
        }

        public final Integer getQuantity() {
            return this.quantity;
        }

        public final int getTotalAmount() {
            return this.totalAmount;
        }

        public int hashCode() {
            int hashCode = ((((this.itemType.hashCode() * 31) + this.itemDescription.hashCode()) * 31) + Integer.hashCode(this.totalAmount)) * 31;
            Integer num = this.quantity;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            Type type = this.itemType;
            String str = this.itemDescription;
            int i = this.totalAmount;
            Integer num = this.quantity;
            return "LineItem(itemType=" + type + ", itemDescription=" + str + ", totalAmount=" + i + ", quantity=" + num + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            int intValue;
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.itemType.name());
            out.writeString(this.itemDescription);
            out.writeInt(this.totalAmount);
            Integer num = this.quantity;
            if (num == null) {
                intValue = 0;
            } else {
                out.writeInt(1);
                intValue = num.intValue();
            }
            out.writeInt(intValue);
        }

        @JvmOverloads
        public LineItem(Type itemType, String itemDescription, int i, Integer num) {
            Intrinsics.checkNotNullParameter(itemType, "itemType");
            Intrinsics.checkNotNullParameter(itemDescription, "itemDescription");
            this.itemType = itemType;
            this.itemDescription = itemDescription;
            this.totalAmount = i;
            this.quantity = num;
        }

        public /* synthetic */ LineItem(Type type, String str, int i, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(type, str, i, (i2 & 8) != 0 ? null : num);
        }
    }

    @Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0002$%B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\u0014\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001a0\u001dH\u0016J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006&"}, m28432d2 = {"Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "logoUrl", "", "backgroundImageUrl", "pageTitle", "purchaseType", "Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;)V", "getBackgroundImageUrl", "()Ljava/lang/String;", "getLogoUrl", "getPageTitle", "getPurchaseType", "()Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "PurchaseType", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class PaymentPageOptions implements StripeParamsModel, Parcelable {
        public static final int $stable = 0;
        @Deprecated
        private static final String PARAM_BACKGROUND_IMAGE_URL = "background_image_url";
        @Deprecated
        private static final String PARAM_LOGO_URL = "logo_url";
        @Deprecated
        private static final String PARAM_PAGE_TITLE = "page_title";
        @Deprecated
        private static final String PARAM_PURCHASE_TYPE = "purchase_type";
        private final String backgroundImageUrl;
        private final String logoUrl;
        private final String pageTitle;
        private final PurchaseType purchaseType;
        private static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<PaymentPageOptions> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$Companion;", "", "()V", "PARAM_BACKGROUND_IMAGE_URL", "", "PARAM_LOGO_URL", "PARAM_PAGE_TITLE", "PARAM_PURCHASE_TYPE", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<PaymentPageOptions> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentPageOptions createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentPageOptions(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PurchaseType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentPageOptions[] newArray(int i) {
                return new PaymentPageOptions[i];
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "Buy", "Rent", "Book", "Subscribe", "Download", "Order", "Continue", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public enum PurchaseType {
            Buy("buy"),
            Rent("rent"),
            Book("book"),
            Subscribe("subscribe"),
            Download("download"),
            Order("order"),
            Continue("continue");
            
            private final String code;

            PurchaseType(String str) {
                this.code = str;
            }

            public final String getCode() {
                return this.code;
            }
        }

        public PaymentPageOptions() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ PaymentPageOptions copy$default(PaymentPageOptions paymentPageOptions, String str, String str2, String str3, PurchaseType purchaseType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = paymentPageOptions.logoUrl;
            }
            if ((i & 2) != 0) {
                str2 = paymentPageOptions.backgroundImageUrl;
            }
            if ((i & 4) != 0) {
                str3 = paymentPageOptions.pageTitle;
            }
            if ((i & 8) != 0) {
                purchaseType = paymentPageOptions.purchaseType;
            }
            return paymentPageOptions.copy(str, str2, str3, purchaseType);
        }

        public final String component1() {
            return this.logoUrl;
        }

        public final String component2() {
            return this.backgroundImageUrl;
        }

        public final String component3() {
            return this.pageTitle;
        }

        public final PurchaseType component4() {
            return this.purchaseType;
        }

        public final PaymentPageOptions copy(String str, String str2, String str3, PurchaseType purchaseType) {
            return new PaymentPageOptions(str, str2, str3, purchaseType);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PaymentPageOptions) {
                PaymentPageOptions paymentPageOptions = (PaymentPageOptions) obj;
                return Intrinsics.areEqual(this.logoUrl, paymentPageOptions.logoUrl) && Intrinsics.areEqual(this.backgroundImageUrl, paymentPageOptions.backgroundImageUrl) && Intrinsics.areEqual(this.pageTitle, paymentPageOptions.pageTitle) && this.purchaseType == paymentPageOptions.purchaseType;
            }
            return false;
        }

        public final String getBackgroundImageUrl() {
            return this.backgroundImageUrl;
        }

        public final String getLogoUrl() {
            return this.logoUrl;
        }

        public final String getPageTitle() {
            return this.pageTitle;
        }

        public final PurchaseType getPurchaseType() {
            return this.purchaseType;
        }

        public int hashCode() {
            String str = this.logoUrl;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.backgroundImageUrl;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.pageTitle;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            PurchaseType purchaseType = this.purchaseType;
            return hashCode3 + (purchaseType != null ? purchaseType.hashCode() : 0);
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map emptyMap;
            Map map;
            Map plus;
            Map map2;
            Map plus2;
            Map map3;
            Map plus3;
            Map<String, Object> plus4;
            emptyMap = MapsKt__MapsKt.emptyMap();
            String str = this.logoUrl;
            Map map4 = null;
            if (str != null) {
                map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_LOGO_URL, str));
            } else {
                map = null;
            }
            if (map == null) {
                map = MapsKt__MapsKt.emptyMap();
            }
            plus = MapsKt__MapsKt.plus(emptyMap, map);
            String str2 = this.backgroundImageUrl;
            if (str2 != null) {
                map2 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_BACKGROUND_IMAGE_URL, str2));
            } else {
                map2 = null;
            }
            if (map2 == null) {
                map2 = MapsKt__MapsKt.emptyMap();
            }
            plus2 = MapsKt__MapsKt.plus(plus, map2);
            String str3 = this.pageTitle;
            if (str3 != null) {
                map3 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_PAGE_TITLE, str3));
            } else {
                map3 = null;
            }
            if (map3 == null) {
                map3 = MapsKt__MapsKt.emptyMap();
            }
            plus3 = MapsKt__MapsKt.plus(plus2, map3);
            PurchaseType purchaseType = this.purchaseType;
            if (purchaseType != null) {
                map4 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_PURCHASE_TYPE, purchaseType.getCode()));
            }
            if (map4 == null) {
                map4 = MapsKt__MapsKt.emptyMap();
            }
            plus4 = MapsKt__MapsKt.plus(plus3, map4);
            return plus4;
        }

        public String toString() {
            String str = this.logoUrl;
            String str2 = this.backgroundImageUrl;
            String str3 = this.pageTitle;
            PurchaseType purchaseType = this.purchaseType;
            return "PaymentPageOptions(logoUrl=" + str + ", backgroundImageUrl=" + str2 + ", pageTitle=" + str3 + ", purchaseType=" + purchaseType + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.logoUrl);
            out.writeString(this.backgroundImageUrl);
            out.writeString(this.pageTitle);
            PurchaseType purchaseType = this.purchaseType;
            if (purchaseType == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeString(purchaseType.name());
        }

        public PaymentPageOptions(String str, String str2, String str3, PurchaseType purchaseType) {
            this.logoUrl = str;
            this.backgroundImageUrl = str2;
            this.pageTitle = str3;
            this.purchaseType = purchaseType;
        }

        public /* synthetic */ PaymentPageOptions(String str, String str2, String str3, PurchaseType purchaseType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : purchaseType);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KlarnaSourceParams(String purchaseCountry, List<LineItem> lineItems) {
        this(purchaseCountry, lineItems, null, null, null, null, null, null, null, null, Place.TYPE_ROUTE, null);
        Intrinsics.checkNotNullParameter(purchaseCountry, "purchaseCountry");
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
    }

    public final String component1() {
        return this.purchaseCountry;
    }

    public final PaymentPageOptions component10() {
        return this.pageOptions;
    }

    public final List<LineItem> component2() {
        return this.lineItems;
    }

    public final Set<CustomPaymentMethods> component3() {
        return this.customPaymentMethods;
    }

    public final String component4() {
        return this.billingEmail;
    }

    public final String component5() {
        return this.billingPhone;
    }

    public final Address component6() {
        return this.billingAddress;
    }

    public final String component7() {
        return this.billingFirstName;
    }

    public final String component8() {
        return this.billingLastName;
    }

    public final DateOfBirth component9() {
        return this.billingDob;
    }

    public final KlarnaSourceParams copy(String purchaseCountry, List<LineItem> lineItems, Set<? extends CustomPaymentMethods> customPaymentMethods, String str, String str2, Address address, String str3, String str4, DateOfBirth dateOfBirth, PaymentPageOptions paymentPageOptions) {
        Intrinsics.checkNotNullParameter(purchaseCountry, "purchaseCountry");
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
        Intrinsics.checkNotNullParameter(customPaymentMethods, "customPaymentMethods");
        return new KlarnaSourceParams(purchaseCountry, lineItems, customPaymentMethods, str, str2, address, str3, str4, dateOfBirth, paymentPageOptions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KlarnaSourceParams) {
            KlarnaSourceParams klarnaSourceParams = (KlarnaSourceParams) obj;
            return Intrinsics.areEqual(this.purchaseCountry, klarnaSourceParams.purchaseCountry) && Intrinsics.areEqual(this.lineItems, klarnaSourceParams.lineItems) && Intrinsics.areEqual(this.customPaymentMethods, klarnaSourceParams.customPaymentMethods) && Intrinsics.areEqual(this.billingEmail, klarnaSourceParams.billingEmail) && Intrinsics.areEqual(this.billingPhone, klarnaSourceParams.billingPhone) && Intrinsics.areEqual(this.billingAddress, klarnaSourceParams.billingAddress) && Intrinsics.areEqual(this.billingFirstName, klarnaSourceParams.billingFirstName) && Intrinsics.areEqual(this.billingLastName, klarnaSourceParams.billingLastName) && Intrinsics.areEqual(this.billingDob, klarnaSourceParams.billingDob) && Intrinsics.areEqual(this.pageOptions, klarnaSourceParams.pageOptions);
        }
        return false;
    }

    public final Address getBillingAddress() {
        return this.billingAddress;
    }

    public final DateOfBirth getBillingDob() {
        return this.billingDob;
    }

    public final String getBillingEmail() {
        return this.billingEmail;
    }

    public final String getBillingFirstName() {
        return this.billingFirstName;
    }

    public final String getBillingLastName() {
        return this.billingLastName;
    }

    public final String getBillingPhone() {
        return this.billingPhone;
    }

    public final Set<CustomPaymentMethods> getCustomPaymentMethods() {
        return this.customPaymentMethods;
    }

    public final List<LineItem> getLineItems() {
        return this.lineItems;
    }

    public final PaymentPageOptions getPageOptions() {
        return this.pageOptions;
    }

    public final String getPurchaseCountry() {
        return this.purchaseCountry;
    }

    public int hashCode() {
        int hashCode = ((((this.purchaseCountry.hashCode() * 31) + this.lineItems.hashCode()) * 31) + this.customPaymentMethods.hashCode()) * 31;
        String str = this.billingEmail;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.billingPhone;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Address address = this.billingAddress;
        int hashCode4 = (hashCode3 + (address == null ? 0 : address.hashCode())) * 31;
        String str3 = this.billingFirstName;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.billingLastName;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        DateOfBirth dateOfBirth = this.billingDob;
        int hashCode7 = (hashCode6 + (dateOfBirth == null ? 0 : dateOfBirth.hashCode())) * 31;
        PaymentPageOptions paymentPageOptions = this.pageOptions;
        return hashCode7 + (paymentPageOptions != null ? paymentPageOptions.hashCode() : 0);
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        Map mapOf;
        Map map;
        Map plus;
        Map map2;
        Map plus2;
        Map map3;
        Map plus3;
        Map<String, Object> plus4;
        String padStart;
        String padStart2;
        List list;
        List sortedWith;
        String joinToString$default;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(PARAM_PRODUCT, "payment"), TuplesKt.m28425to(PARAM_PURCHASE_COUNTRY, this.purchaseCountry));
        Set<CustomPaymentMethods> set = this.customPaymentMethods;
        Map map4 = null;
        if (!(!set.isEmpty())) {
            set = null;
        }
        if (set != null) {
            list = CollectionsKt___CollectionsKt.toList(set);
            sortedWith = CollectionsKt___CollectionsKt.sortedWith(list, new Comparator() { // from class: com.stripe.android.model.KlarnaSourceParams$toParamMap$lambda$2$$inlined$sortedBy$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    int compareValues;
                    compareValues = ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((KlarnaSourceParams.CustomPaymentMethods) t).ordinal()), Integer.valueOf(((KlarnaSourceParams.CustomPaymentMethods) t2).ordinal()));
                    return compareValues;
                }
            });
            joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(sortedWith, ",", null, null, 0, null, KlarnaSourceParams$toParamMap$2$2.INSTANCE, 30, null);
            map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_CUSTOM_PAYMENT_METHODS, joinToString$default));
        } else {
            map = null;
        }
        if (map == null) {
            map = MapsKt__MapsKt.emptyMap();
        }
        plus = MapsKt__MapsKt.plus(mapOf, map);
        String str = this.billingFirstName;
        if (str != null) {
            map2 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_FIRST_NAME, str));
        } else {
            map2 = null;
        }
        if (map2 == null) {
            map2 = MapsKt__MapsKt.emptyMap();
        }
        plus2 = MapsKt__MapsKt.plus(plus, map2);
        String str2 = this.billingLastName;
        if (str2 != null) {
            map3 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_LAST_NAME, str2));
        } else {
            map3 = null;
        }
        if (map3 == null) {
            map3 = MapsKt__MapsKt.emptyMap();
        }
        plus3 = MapsKt__MapsKt.plus(plus2, map3);
        DateOfBirth dateOfBirth = this.billingDob;
        if (dateOfBirth != null) {
            padStart = StringsKt__StringsKt.padStart(String.valueOf(dateOfBirth.getDay()), 2, '0');
            padStart2 = StringsKt__StringsKt.padStart(String.valueOf(dateOfBirth.getMonth()), 2, '0');
            map4 = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(PARAM_DOB_DAY, padStart), TuplesKt.m28425to(PARAM_DOB_MONTH, padStart2), TuplesKt.m28425to(PARAM_DOB_YEAR, String.valueOf(dateOfBirth.getYear())));
        }
        if (map4 == null) {
            map4 = MapsKt__MapsKt.emptyMap();
        }
        plus4 = MapsKt__MapsKt.plus(plus3, map4);
        return plus4;
    }

    public String toString() {
        String str = this.purchaseCountry;
        List<LineItem> list = this.lineItems;
        Set<CustomPaymentMethods> set = this.customPaymentMethods;
        String str2 = this.billingEmail;
        String str3 = this.billingPhone;
        Address address = this.billingAddress;
        String str4 = this.billingFirstName;
        String str5 = this.billingLastName;
        DateOfBirth dateOfBirth = this.billingDob;
        PaymentPageOptions paymentPageOptions = this.pageOptions;
        return "KlarnaSourceParams(purchaseCountry=" + str + ", lineItems=" + list + ", customPaymentMethods=" + set + ", billingEmail=" + str2 + ", billingPhone=" + str3 + ", billingAddress=" + address + ", billingFirstName=" + str4 + ", billingLastName=" + str5 + ", billingDob=" + dateOfBirth + ", pageOptions=" + paymentPageOptions + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.purchaseCountry);
        List<LineItem> list = this.lineItems;
        out.writeInt(list.size());
        for (LineItem lineItem : list) {
            lineItem.writeToParcel(out, i);
        }
        Set<CustomPaymentMethods> set = this.customPaymentMethods;
        out.writeInt(set.size());
        for (CustomPaymentMethods customPaymentMethods : set) {
            out.writeString(customPaymentMethods.name());
        }
        out.writeString(this.billingEmail);
        out.writeString(this.billingPhone);
        Address address = this.billingAddress;
        if (address == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            address.writeToParcel(out, i);
        }
        out.writeString(this.billingFirstName);
        out.writeString(this.billingLastName);
        DateOfBirth dateOfBirth = this.billingDob;
        if (dateOfBirth == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dateOfBirth.writeToParcel(out, i);
        }
        PaymentPageOptions paymentPageOptions = this.pageOptions;
        if (paymentPageOptions == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        paymentPageOptions.writeToParcel(out, i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KlarnaSourceParams(String purchaseCountry, List<LineItem> lineItems, Set<? extends CustomPaymentMethods> customPaymentMethods) {
        this(purchaseCountry, lineItems, customPaymentMethods, null, null, null, null, null, null, null, Place.TYPE_POSTAL_CODE_PREFIX, null);
        Intrinsics.checkNotNullParameter(purchaseCountry, "purchaseCountry");
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
        Intrinsics.checkNotNullParameter(customPaymentMethods, "customPaymentMethods");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KlarnaSourceParams(String purchaseCountry, List<LineItem> lineItems, Set<? extends CustomPaymentMethods> customPaymentMethods, String str) {
        this(purchaseCountry, lineItems, customPaymentMethods, str, null, null, null, null, null, null, Place.TYPE_INTERSECTION, null);
        Intrinsics.checkNotNullParameter(purchaseCountry, "purchaseCountry");
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
        Intrinsics.checkNotNullParameter(customPaymentMethods, "customPaymentMethods");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KlarnaSourceParams(String purchaseCountry, List<LineItem> lineItems, Set<? extends CustomPaymentMethods> customPaymentMethods, String str, String str2) {
        this(purchaseCountry, lineItems, customPaymentMethods, str, str2, null, null, null, null, null, 992, null);
        Intrinsics.checkNotNullParameter(purchaseCountry, "purchaseCountry");
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
        Intrinsics.checkNotNullParameter(customPaymentMethods, "customPaymentMethods");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KlarnaSourceParams(String purchaseCountry, List<LineItem> lineItems, Set<? extends CustomPaymentMethods> customPaymentMethods, String str, String str2, Address address) {
        this(purchaseCountry, lineItems, customPaymentMethods, str, str2, address, null, null, null, null, 960, null);
        Intrinsics.checkNotNullParameter(purchaseCountry, "purchaseCountry");
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
        Intrinsics.checkNotNullParameter(customPaymentMethods, "customPaymentMethods");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KlarnaSourceParams(String purchaseCountry, List<LineItem> lineItems, Set<? extends CustomPaymentMethods> customPaymentMethods, String str, String str2, Address address, String str3) {
        this(purchaseCountry, lineItems, customPaymentMethods, str, str2, address, str3, null, null, null, 896, null);
        Intrinsics.checkNotNullParameter(purchaseCountry, "purchaseCountry");
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
        Intrinsics.checkNotNullParameter(customPaymentMethods, "customPaymentMethods");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KlarnaSourceParams(String purchaseCountry, List<LineItem> lineItems, Set<? extends CustomPaymentMethods> customPaymentMethods, String str, String str2, Address address, String str3, String str4) {
        this(purchaseCountry, lineItems, customPaymentMethods, str, str2, address, str3, str4, null, null, 768, null);
        Intrinsics.checkNotNullParameter(purchaseCountry, "purchaseCountry");
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
        Intrinsics.checkNotNullParameter(customPaymentMethods, "customPaymentMethods");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KlarnaSourceParams(String purchaseCountry, List<LineItem> lineItems, Set<? extends CustomPaymentMethods> customPaymentMethods, String str, String str2, Address address, String str3, String str4, DateOfBirth dateOfBirth) {
        this(purchaseCountry, lineItems, customPaymentMethods, str, str2, address, str3, str4, dateOfBirth, null, 512, null);
        Intrinsics.checkNotNullParameter(purchaseCountry, "purchaseCountry");
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
        Intrinsics.checkNotNullParameter(customPaymentMethods, "customPaymentMethods");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public KlarnaSourceParams(String purchaseCountry, List<LineItem> lineItems, Set<? extends CustomPaymentMethods> customPaymentMethods, String str, String str2, Address address, String str3, String str4, DateOfBirth dateOfBirth, PaymentPageOptions paymentPageOptions) {
        Intrinsics.checkNotNullParameter(purchaseCountry, "purchaseCountry");
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
        Intrinsics.checkNotNullParameter(customPaymentMethods, "customPaymentMethods");
        this.purchaseCountry = purchaseCountry;
        this.lineItems = lineItems;
        this.customPaymentMethods = customPaymentMethods;
        this.billingEmail = str;
        this.billingPhone = str2;
        this.billingAddress = address;
        this.billingFirstName = str3;
        this.billingLastName = str4;
        this.billingDob = dateOfBirth;
        this.pageOptions = paymentPageOptions;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ KlarnaSourceParams(String str, List list, Set set, String str2, String str3, Address address, String str4, String str5, DateOfBirth dateOfBirth, PaymentPageOptions paymentPageOptions, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, r5, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : address, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : dateOfBirth, (i & 512) != 0 ? null : paymentPageOptions);
        Set set2;
        Set emptySet;
        if ((i & 4) != 0) {
            emptySet = SetsKt__SetsKt.emptySet();
            set2 = emptySet;
        } else {
            set2 = set;
        }
    }
}
