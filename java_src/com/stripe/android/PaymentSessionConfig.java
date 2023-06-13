package com.stripe.android;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.ShippingMethod;
import com.stripe.android.view.BillingAddressFields;
import com.stripe.android.view.ShippingInfoWidget;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Settings;
@Metadata(m28433d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 X2\u00020\u0001:\u0005WXYZ[BÅ\u0001\b\u0000\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0003\u0010\u000b\u001a\u00020\f\u0012\b\b\u0003\u0010\r\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u001dJ\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003J\t\u00108\u001a\u00020\u0015HÆ\u0003J\t\u00109\u001a\u00020\tHÆ\u0003J\u000e\u0010:\u001a\u00020\tHÀ\u0003¢\u0006\u0002\b;J\u000e\u0010<\u001a\u00020\u0019HÀ\u0003¢\u0006\u0002\b=J\u0010\u0010>\u001a\u0004\u0018\u00010\u001bHÀ\u0003¢\u0006\u0002\b?J\u0012\u0010@\u001a\u0004\u0018\u00010\fHÀ\u0003¢\u0006\u0004\bA\u00104J\u000f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010D\u001a\u00020\tHÆ\u0003J\t\u0010E\u001a\u00020\tHÆ\u0003J\t\u0010F\u001a\u00020\fHÆ\u0003J\t\u0010G\u001a\u00020\fHÆ\u0003J\u000f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003HÆ\u0003J\t\u0010I\u001a\u00020\tHÆ\u0003JÌ\u0001\u0010J\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0002\u0010\u0010\u001a\u00020\t2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010KJ\t\u0010L\u001a\u00020\fHÖ\u0001J\u0013\u0010M\u001a\u00020\t2\b\u0010N\u001a\u0004\u0018\u00010OHÖ\u0003J\t\u0010P\u001a\u00020\fHÖ\u0001J\t\u0010Q\u001a\u00020\u0013HÖ\u0001J\u0019\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020\fHÖ\u0001R\u0013\u0010\r\u001a\u00020\f8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0016\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010%R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010%R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'R\u0013\u0010\u000b\u001a\u00020\f8\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0014\u0010\u0018\u001a\u00020\u0019X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0014\u0010\u0017\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010%R\u0011\u0010\u0010\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b2\u0010%R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\fX\u0080\u0004¢\u0006\n\n\u0002\u00105\u001a\u0004\b3\u00104¨\u0006\\"}, m28432d2 = {"Lcom/stripe/android/PaymentSessionConfig;", "Landroid/os/Parcelable;", "hiddenShippingInfoFields", "", "Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;", "optionalShippingInfoFields", "prepopulatedShippingInfo", "Lcom/stripe/android/model/ShippingInformation;", "isShippingInfoRequired", "", "isShippingMethodRequired", "paymentMethodsFooterLayoutId", "", "addPaymentMethodFooterLayoutId", "paymentMethodTypes", "Lcom/stripe/android/model/PaymentMethod$Type;", "shouldShowGooglePay", "allowedShippingCountryCodes", "", "", "billingAddressFields", "Lcom/stripe/android/view/BillingAddressFields;", "canDeletePaymentMethods", "shouldPrefetchCustomer", "shippingInformationValidator", "Lcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;", "shippingMethodsFactory", "Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;", "windowFlags", "(Ljava/util/List;Ljava/util/List;Lcom/stripe/android/model/ShippingInformation;ZZIILjava/util/List;ZLjava/util/Set;Lcom/stripe/android/view/BillingAddressFields;ZZLcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;Ljava/lang/Integer;)V", "getAddPaymentMethodFooterLayoutId", "()I", "getAllowedShippingCountryCodes", "()Ljava/util/Set;", "getBillingAddressFields", "()Lcom/stripe/android/view/BillingAddressFields;", "getCanDeletePaymentMethods", "()Z", "getHiddenShippingInfoFields", "()Ljava/util/List;", "getOptionalShippingInfoFields", "getPaymentMethodTypes", "getPaymentMethodsFooterLayoutId", "getPrepopulatedShippingInfo", "()Lcom/stripe/android/model/ShippingInformation;", "getShippingInformationValidator$payments_core_release", "()Lcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;", "getShippingMethodsFactory$payments_core_release", "()Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;", "getShouldPrefetchCustomer$payments_core_release", "getShouldShowGooglePay", "getWindowFlags$payments_core_release", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component10", "component11", "component12", "component13", "component13$payments_core_release", "component14", "component14$payments_core_release", "component15", "component15$payments_core_release", "component16", "component16$payments_core_release", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/List;Ljava/util/List;Lcom/stripe/android/model/ShippingInformation;ZZIILjava/util/List;ZLjava/util/Set;Lcom/stripe/android/view/BillingAddressFields;ZZLcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;Ljava/lang/Integer;)Lcom/stripe/android/PaymentSessionConfig;", "describeContents", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "Companion", "DefaultShippingInfoValidator", "ShippingInformationValidator", "ShippingMethodsFactory", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPaymentSessionConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSessionConfig.kt\ncom/stripe/android/PaymentSessionConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,321:1\n1855#2:322\n1856#2:325\n12744#3,2:323\n*S KotlinDebug\n*F\n+ 1 PaymentSessionConfig.kt\ncom/stripe/android/PaymentSessionConfig\n*L\n53#1:322\n53#1:325\n55#1:323,2\n*E\n"})
/* loaded from: classes6.dex */
public final class PaymentSessionConfig implements Parcelable {
    private final int addPaymentMethodFooterLayoutId;
    private final Set<String> allowedShippingCountryCodes;
    private final BillingAddressFields billingAddressFields;
    private final boolean canDeletePaymentMethods;
    private final List<ShippingInfoWidget.CustomizableShippingField> hiddenShippingInfoFields;
    private final boolean isShippingInfoRequired;
    private final boolean isShippingMethodRequired;
    private final List<ShippingInfoWidget.CustomizableShippingField> optionalShippingInfoFields;
    private final List<PaymentMethod.Type> paymentMethodTypes;
    private final int paymentMethodsFooterLayoutId;
    private final ShippingInformation prepopulatedShippingInfo;
    private final ShippingInformationValidator shippingInformationValidator;
    private final ShippingMethodsFactory shippingMethodsFactory;
    private final boolean shouldPrefetchCustomer;
    private final boolean shouldShowGooglePay;
    private final Integer windowFlags;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PaymentSessionConfig> CREATOR = new Creator();
    @Deprecated
    private static final BillingAddressFields DEFAULT_BILLING_ADDRESS_FIELDS = BillingAddressFields.PostalCode;

    @Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u000f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010 \u001a\u00020\u0002H\u0016J\u0010\u0010!\u001a\u00020\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u0005J\u0014\u0010\"\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010$\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u001f\u0010%\u001a\u00020\u00002\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0&\"\u00020\u000f¢\u0006\u0002\u0010'J\u001f\u0010(\u001a\u00020\u00002\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0&\"\u00020\u000f¢\u0006\u0002\u0010'J\u0014\u0010)\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eJ\u0010\u0010*\u001a\u00020\u00002\b\b\u0001\u0010\u0013\u001a\u00020\u0005J\u0010\u0010+\u001a\u00020\u00002\b\u0010,\u001a\u0004\u0018\u00010\u0016J\u000e\u0010-\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\fJ\u0010\u0010.\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0010\u0010/\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u000e\u00100\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\fJ\u000e\u00101\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\fJ\u000e\u00102\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\fJ\u0015\u00103\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u00104R\u0012\u0010\u0004\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001f¨\u00065"}, m28432d2 = {"Lcom/stripe/android/PaymentSessionConfig$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/PaymentSessionConfig;", "()V", "addPaymentMethodFooterLayoutId", "", "allowedShippingCountryCodes", "", "", "billingAddressFields", "Lcom/stripe/android/view/BillingAddressFields;", "canDeletePaymentMethods", "", "hiddenShippingInfoFields", "", "Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;", "optionalShippingInfoFields", "paymentMethodTypes", "Lcom/stripe/android/model/PaymentMethod$Type;", "paymentMethodsFooterLayoutId", "shippingInfoRequired", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "shippingInformationValidator", "Lcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;", "shippingMethodsFactory", "Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;", "shippingMethodsRequired", "shouldPrefetchCustomer", "shouldShowGooglePay", "windowFlags", "Ljava/lang/Integer;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "setAddPaymentMethodFooter", "setAllowedShippingCountryCodes", "setBillingAddressFields", "setCanDeletePaymentMethods", "setHiddenShippingInfoFields", "", "([Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;)Lcom/stripe/android/PaymentSessionConfig$Builder;", "setOptionalShippingInfoFields", "setPaymentMethodTypes", "setPaymentMethodsFooter", "setPrepopulatedShippingInfo", "shippingInfo", "setShippingInfoRequired", "setShippingInformationValidator", "setShippingMethodsFactory", "setShippingMethodsRequired", "setShouldPrefetchCustomer", "setShouldShowGooglePay", "setWindowFlags", "(Ljava/lang/Integer;)Lcom/stripe/android/PaymentSessionConfig$Builder;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Builder implements ObjectBuilder<PaymentSessionConfig> {
        public static final int $stable = 8;
        private int addPaymentMethodFooterLayoutId;
        private Set<String> allowedShippingCountryCodes;
        private boolean canDeletePaymentMethods;
        private List<? extends ShippingInfoWidget.CustomizableShippingField> hiddenShippingInfoFields;
        private List<? extends ShippingInfoWidget.CustomizableShippingField> optionalShippingInfoFields;
        private List<? extends PaymentMethod.Type> paymentMethodTypes;
        private int paymentMethodsFooterLayoutId;
        private ShippingInformation shippingInformation;
        private ShippingInformationValidator shippingInformationValidator;
        private ShippingMethodsFactory shippingMethodsFactory;
        private boolean shouldPrefetchCustomer;
        private boolean shouldShowGooglePay;
        private Integer windowFlags;
        private BillingAddressFields billingAddressFields = PaymentSessionConfig.DEFAULT_BILLING_ADDRESS_FIELDS;
        private boolean shippingInfoRequired = true;
        private boolean shippingMethodsRequired = true;

        public Builder() {
            List<? extends PaymentMethod.Type> listOf;
            Set<String> emptySet;
            listOf = CollectionsKt__CollectionsJVMKt.listOf(PaymentMethod.Type.Card);
            this.paymentMethodTypes = listOf;
            emptySet = SetsKt__SetsKt.emptySet();
            this.allowedShippingCountryCodes = emptySet;
            this.shouldPrefetchCustomer = true;
            this.canDeletePaymentMethods = true;
        }

        public final Builder setAddPaymentMethodFooter(int i) {
            this.addPaymentMethodFooterLayoutId = i;
            return this;
        }

        public final Builder setAllowedShippingCountryCodes(Set<String> allowedShippingCountryCodes) {
            Intrinsics.checkNotNullParameter(allowedShippingCountryCodes, "allowedShippingCountryCodes");
            this.allowedShippingCountryCodes = allowedShippingCountryCodes;
            return this;
        }

        public final Builder setBillingAddressFields(BillingAddressFields billingAddressFields) {
            Intrinsics.checkNotNullParameter(billingAddressFields, "billingAddressFields");
            this.billingAddressFields = billingAddressFields;
            return this;
        }

        public final Builder setCanDeletePaymentMethods(boolean z) {
            this.canDeletePaymentMethods = z;
            return this;
        }

        public final Builder setHiddenShippingInfoFields(ShippingInfoWidget.CustomizableShippingField... hiddenShippingInfoFields) {
            List<? extends ShippingInfoWidget.CustomizableShippingField> listOf;
            Intrinsics.checkNotNullParameter(hiddenShippingInfoFields, "hiddenShippingInfoFields");
            listOf = CollectionsKt__CollectionsKt.listOf(Arrays.copyOf(hiddenShippingInfoFields, hiddenShippingInfoFields.length));
            this.hiddenShippingInfoFields = listOf;
            return this;
        }

        public final Builder setOptionalShippingInfoFields(ShippingInfoWidget.CustomizableShippingField... optionalShippingInfoFields) {
            List<? extends ShippingInfoWidget.CustomizableShippingField> listOf;
            Intrinsics.checkNotNullParameter(optionalShippingInfoFields, "optionalShippingInfoFields");
            listOf = CollectionsKt__CollectionsKt.listOf(Arrays.copyOf(optionalShippingInfoFields, optionalShippingInfoFields.length));
            this.optionalShippingInfoFields = listOf;
            return this;
        }

        public final Builder setPaymentMethodTypes(List<? extends PaymentMethod.Type> paymentMethodTypes) {
            Intrinsics.checkNotNullParameter(paymentMethodTypes, "paymentMethodTypes");
            this.paymentMethodTypes = paymentMethodTypes;
            return this;
        }

        public final Builder setPaymentMethodsFooter(int i) {
            this.paymentMethodsFooterLayoutId = i;
            return this;
        }

        public final Builder setPrepopulatedShippingInfo(ShippingInformation shippingInformation) {
            this.shippingInformation = shippingInformation;
            return this;
        }

        public final Builder setShippingInfoRequired(boolean z) {
            this.shippingInfoRequired = z;
            return this;
        }

        public final Builder setShippingInformationValidator(ShippingInformationValidator shippingInformationValidator) {
            this.shippingInformationValidator = shippingInformationValidator;
            return this;
        }

        public final Builder setShippingMethodsFactory(ShippingMethodsFactory shippingMethodsFactory) {
            this.shippingMethodsFactory = shippingMethodsFactory;
            return this;
        }

        public final Builder setShippingMethodsRequired(boolean z) {
            this.shippingMethodsRequired = z;
            return this;
        }

        public final Builder setShouldPrefetchCustomer(boolean z) {
            this.shouldPrefetchCustomer = z;
            return this;
        }

        public final Builder setShouldShowGooglePay(boolean z) {
            this.shouldShowGooglePay = z;
            return this;
        }

        public final Builder setWindowFlags(Integer num) {
            this.windowFlags = num;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.stripe.android.ObjectBuilder
        public PaymentSessionConfig build() {
            List<? extends ShippingInfoWidget.CustomizableShippingField> list = this.hiddenShippingInfoFields;
            if (list == null) {
                list = CollectionsKt__CollectionsKt.emptyList();
            }
            List<? extends ShippingInfoWidget.CustomizableShippingField> list2 = list;
            List<? extends ShippingInfoWidget.CustomizableShippingField> list3 = this.optionalShippingInfoFields;
            if (list3 == null) {
                list3 = CollectionsKt__CollectionsKt.emptyList();
            }
            List<? extends ShippingInfoWidget.CustomizableShippingField> list4 = list3;
            ShippingInformation shippingInformation = this.shippingInformation;
            boolean z = this.shippingInfoRequired;
            boolean z2 = this.shippingMethodsRequired;
            int i = this.paymentMethodsFooterLayoutId;
            int i2 = this.addPaymentMethodFooterLayoutId;
            List<? extends PaymentMethod.Type> list5 = this.paymentMethodTypes;
            boolean z3 = this.shouldShowGooglePay;
            Set<String> set = this.allowedShippingCountryCodes;
            ShippingInformationValidator shippingInformationValidator = this.shippingInformationValidator;
            if (shippingInformationValidator == null) {
                shippingInformationValidator = new DefaultShippingInfoValidator();
            }
            ShippingInformationValidator shippingInformationValidator2 = shippingInformationValidator;
            ShippingMethodsFactory shippingMethodsFactory = this.shippingMethodsFactory;
            Integer num = this.windowFlags;
            return new PaymentSessionConfig(list2, list4, shippingInformation, z, z2, i, i2, list5, z3, set, this.billingAddressFields, this.canDeletePaymentMethods, this.shouldPrefetchCustomer, shippingInformationValidator2, shippingMethodsFactory, num);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/PaymentSessionConfig$Companion;", "", "()V", "DEFAULT_BILLING_ADDRESS_FIELDS", "Lcom/stripe/android/view/BillingAddressFields;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<PaymentSessionConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentSessionConfig createFromParcel(Parcel parcel) {
            String readString;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(ShippingInfoWidget.CustomizableShippingField.valueOf(parcel.readString()));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList2.add(ShippingInfoWidget.CustomizableShippingField.valueOf(parcel.readString()));
            }
            ShippingInformation createFromParcel = parcel.readInt() == 0 ? null : ShippingInformation.CREATOR.createFromParcel(parcel);
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            int readInt5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt5);
            for (int i3 = 0; i3 != readInt5; i3++) {
                arrayList3.add(PaymentMethod.Type.CREATOR.createFromParcel(parcel));
            }
            boolean z3 = parcel.readInt() != 0;
            int readInt6 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt6);
            int i4 = 0;
            while (true) {
                readString = parcel.readString();
                if (i4 == readInt6) {
                    break;
                }
                linkedHashSet.add(readString);
                i4++;
            }
            return new PaymentSessionConfig(arrayList, arrayList2, createFromParcel, z, z2, readInt3, readInt4, arrayList3, z3, linkedHashSet, BillingAddressFields.valueOf(readString), parcel.readInt() != 0, parcel.readInt() != 0, (ShippingInformationValidator) parcel.readSerializable(), (ShippingMethodsFactory) parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentSessionConfig[] newArray(int i) {
            return new PaymentSessionConfig[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/PaymentSessionConfig$DefaultShippingInfoValidator;", "Lcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;", "()V", "getErrorMessage", "", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "isValid", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultShippingInfoValidator implements ShippingInformationValidator {
        @Override // com.stripe.android.PaymentSessionConfig.ShippingInformationValidator
        public String getErrorMessage(ShippingInformation shippingInformation) {
            Intrinsics.checkNotNullParameter(shippingInformation, "shippingInformation");
            return "";
        }

        @Override // com.stripe.android.PaymentSessionConfig.ShippingInformationValidator
        public boolean isValid(ShippingInformation shippingInformation) {
            Intrinsics.checkNotNullParameter(shippingInformation, "shippingInformation");
            return true;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;", "Ljava/io/Serializable;", "getErrorMessage", "", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "isValid", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public interface ShippingInformationValidator extends Serializable {
        String getErrorMessage(ShippingInformation shippingInformation);

        boolean isValid(ShippingInformation shippingInformation);
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H'¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;", "Ljava/io/Serializable;", "create", "", "Lcom/stripe/android/model/ShippingMethod;", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public interface ShippingMethodsFactory extends Serializable {
        List<ShippingMethod> create(ShippingInformation shippingInformation);
    }

    public PaymentSessionConfig() {
        this(null, null, null, false, false, 0, 0, null, false, null, null, false, false, null, null, null, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null);
    }

    public final List<ShippingInfoWidget.CustomizableShippingField> component1() {
        return this.hiddenShippingInfoFields;
    }

    public final Set<String> component10() {
        return this.allowedShippingCountryCodes;
    }

    public final BillingAddressFields component11() {
        return this.billingAddressFields;
    }

    public final boolean component12() {
        return this.canDeletePaymentMethods;
    }

    public final boolean component13$payments_core_release() {
        return this.shouldPrefetchCustomer;
    }

    public final ShippingInformationValidator component14$payments_core_release() {
        return this.shippingInformationValidator;
    }

    public final ShippingMethodsFactory component15$payments_core_release() {
        return this.shippingMethodsFactory;
    }

    public final Integer component16$payments_core_release() {
        return this.windowFlags;
    }

    public final List<ShippingInfoWidget.CustomizableShippingField> component2() {
        return this.optionalShippingInfoFields;
    }

    public final ShippingInformation component3() {
        return this.prepopulatedShippingInfo;
    }

    public final boolean component4() {
        return this.isShippingInfoRequired;
    }

    public final boolean component5() {
        return this.isShippingMethodRequired;
    }

    public final int component6() {
        return this.paymentMethodsFooterLayoutId;
    }

    public final int component7() {
        return this.addPaymentMethodFooterLayoutId;
    }

    public final List<PaymentMethod.Type> component8() {
        return this.paymentMethodTypes;
    }

    public final boolean component9() {
        return this.shouldShowGooglePay;
    }

    public final PaymentSessionConfig copy(List<? extends ShippingInfoWidget.CustomizableShippingField> hiddenShippingInfoFields, List<? extends ShippingInfoWidget.CustomizableShippingField> optionalShippingInfoFields, ShippingInformation shippingInformation, boolean z, boolean z2, int i, int i2, List<? extends PaymentMethod.Type> paymentMethodTypes, boolean z3, Set<String> allowedShippingCountryCodes, BillingAddressFields billingAddressFields, boolean z4, boolean z5, ShippingInformationValidator shippingInformationValidator, ShippingMethodsFactory shippingMethodsFactory, Integer num) {
        Intrinsics.checkNotNullParameter(hiddenShippingInfoFields, "hiddenShippingInfoFields");
        Intrinsics.checkNotNullParameter(optionalShippingInfoFields, "optionalShippingInfoFields");
        Intrinsics.checkNotNullParameter(paymentMethodTypes, "paymentMethodTypes");
        Intrinsics.checkNotNullParameter(allowedShippingCountryCodes, "allowedShippingCountryCodes");
        Intrinsics.checkNotNullParameter(billingAddressFields, "billingAddressFields");
        Intrinsics.checkNotNullParameter(shippingInformationValidator, "shippingInformationValidator");
        return new PaymentSessionConfig(hiddenShippingInfoFields, optionalShippingInfoFields, shippingInformation, z, z2, i, i2, paymentMethodTypes, z3, allowedShippingCountryCodes, billingAddressFields, z4, z5, shippingInformationValidator, shippingMethodsFactory, num);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentSessionConfig) {
            PaymentSessionConfig paymentSessionConfig = (PaymentSessionConfig) obj;
            return Intrinsics.areEqual(this.hiddenShippingInfoFields, paymentSessionConfig.hiddenShippingInfoFields) && Intrinsics.areEqual(this.optionalShippingInfoFields, paymentSessionConfig.optionalShippingInfoFields) && Intrinsics.areEqual(this.prepopulatedShippingInfo, paymentSessionConfig.prepopulatedShippingInfo) && this.isShippingInfoRequired == paymentSessionConfig.isShippingInfoRequired && this.isShippingMethodRequired == paymentSessionConfig.isShippingMethodRequired && this.paymentMethodsFooterLayoutId == paymentSessionConfig.paymentMethodsFooterLayoutId && this.addPaymentMethodFooterLayoutId == paymentSessionConfig.addPaymentMethodFooterLayoutId && Intrinsics.areEqual(this.paymentMethodTypes, paymentSessionConfig.paymentMethodTypes) && this.shouldShowGooglePay == paymentSessionConfig.shouldShowGooglePay && Intrinsics.areEqual(this.allowedShippingCountryCodes, paymentSessionConfig.allowedShippingCountryCodes) && this.billingAddressFields == paymentSessionConfig.billingAddressFields && this.canDeletePaymentMethods == paymentSessionConfig.canDeletePaymentMethods && this.shouldPrefetchCustomer == paymentSessionConfig.shouldPrefetchCustomer && Intrinsics.areEqual(this.shippingInformationValidator, paymentSessionConfig.shippingInformationValidator) && Intrinsics.areEqual(this.shippingMethodsFactory, paymentSessionConfig.shippingMethodsFactory) && Intrinsics.areEqual(this.windowFlags, paymentSessionConfig.windowFlags);
        }
        return false;
    }

    public final int getAddPaymentMethodFooterLayoutId() {
        return this.addPaymentMethodFooterLayoutId;
    }

    public final Set<String> getAllowedShippingCountryCodes() {
        return this.allowedShippingCountryCodes;
    }

    public final BillingAddressFields getBillingAddressFields() {
        return this.billingAddressFields;
    }

    public final boolean getCanDeletePaymentMethods() {
        return this.canDeletePaymentMethods;
    }

    public final List<ShippingInfoWidget.CustomizableShippingField> getHiddenShippingInfoFields() {
        return this.hiddenShippingInfoFields;
    }

    public final List<ShippingInfoWidget.CustomizableShippingField> getOptionalShippingInfoFields() {
        return this.optionalShippingInfoFields;
    }

    public final List<PaymentMethod.Type> getPaymentMethodTypes() {
        return this.paymentMethodTypes;
    }

    public final int getPaymentMethodsFooterLayoutId() {
        return this.paymentMethodsFooterLayoutId;
    }

    public final ShippingInformation getPrepopulatedShippingInfo() {
        return this.prepopulatedShippingInfo;
    }

    public final ShippingInformationValidator getShippingInformationValidator$payments_core_release() {
        return this.shippingInformationValidator;
    }

    public final ShippingMethodsFactory getShippingMethodsFactory$payments_core_release() {
        return this.shippingMethodsFactory;
    }

    public final boolean getShouldPrefetchCustomer$payments_core_release() {
        return this.shouldPrefetchCustomer;
    }

    public final boolean getShouldShowGooglePay() {
        return this.shouldShowGooglePay;
    }

    public final Integer getWindowFlags$payments_core_release() {
        return this.windowFlags;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.hiddenShippingInfoFields.hashCode() * 31) + this.optionalShippingInfoFields.hashCode()) * 31;
        ShippingInformation shippingInformation = this.prepopulatedShippingInfo;
        int hashCode2 = (hashCode + (shippingInformation == null ? 0 : shippingInformation.hashCode())) * 31;
        boolean z = this.isShippingInfoRequired;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z2 = this.isShippingMethodRequired;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int hashCode3 = (((((((i2 + i3) * 31) + Integer.hashCode(this.paymentMethodsFooterLayoutId)) * 31) + Integer.hashCode(this.addPaymentMethodFooterLayoutId)) * 31) + this.paymentMethodTypes.hashCode()) * 31;
        boolean z3 = this.shouldShowGooglePay;
        int i4 = z3;
        if (z3 != 0) {
            i4 = 1;
        }
        int hashCode4 = (((((hashCode3 + i4) * 31) + this.allowedShippingCountryCodes.hashCode()) * 31) + this.billingAddressFields.hashCode()) * 31;
        boolean z4 = this.canDeletePaymentMethods;
        int i5 = z4;
        if (z4 != 0) {
            i5 = 1;
        }
        int i6 = (hashCode4 + i5) * 31;
        boolean z5 = this.shouldPrefetchCustomer;
        int hashCode5 = (((i6 + (z5 ? 1 : z5 ? 1 : 0)) * 31) + this.shippingInformationValidator.hashCode()) * 31;
        ShippingMethodsFactory shippingMethodsFactory = this.shippingMethodsFactory;
        int hashCode6 = (hashCode5 + (shippingMethodsFactory == null ? 0 : shippingMethodsFactory.hashCode())) * 31;
        Integer num = this.windowFlags;
        return hashCode6 + (num != null ? num.hashCode() : 0);
    }

    public final boolean isShippingInfoRequired() {
        return this.isShippingInfoRequired;
    }

    public final boolean isShippingMethodRequired() {
        return this.isShippingMethodRequired;
    }

    public String toString() {
        List<ShippingInfoWidget.CustomizableShippingField> list = this.hiddenShippingInfoFields;
        List<ShippingInfoWidget.CustomizableShippingField> list2 = this.optionalShippingInfoFields;
        ShippingInformation shippingInformation = this.prepopulatedShippingInfo;
        boolean z = this.isShippingInfoRequired;
        boolean z2 = this.isShippingMethodRequired;
        int i = this.paymentMethodsFooterLayoutId;
        int i2 = this.addPaymentMethodFooterLayoutId;
        List<PaymentMethod.Type> list3 = this.paymentMethodTypes;
        boolean z3 = this.shouldShowGooglePay;
        Set<String> set = this.allowedShippingCountryCodes;
        BillingAddressFields billingAddressFields = this.billingAddressFields;
        boolean z4 = this.canDeletePaymentMethods;
        boolean z5 = this.shouldPrefetchCustomer;
        ShippingInformationValidator shippingInformationValidator = this.shippingInformationValidator;
        ShippingMethodsFactory shippingMethodsFactory = this.shippingMethodsFactory;
        Integer num = this.windowFlags;
        return "PaymentSessionConfig(hiddenShippingInfoFields=" + list + ", optionalShippingInfoFields=" + list2 + ", prepopulatedShippingInfo=" + shippingInformation + ", isShippingInfoRequired=" + z + ", isShippingMethodRequired=" + z2 + ", paymentMethodsFooterLayoutId=" + i + ", addPaymentMethodFooterLayoutId=" + i2 + ", paymentMethodTypes=" + list3 + ", shouldShowGooglePay=" + z3 + ", allowedShippingCountryCodes=" + set + ", billingAddressFields=" + billingAddressFields + ", canDeletePaymentMethods=" + z4 + ", shouldPrefetchCustomer=" + z5 + ", shippingInformationValidator=" + shippingInformationValidator + ", shippingMethodsFactory=" + shippingMethodsFactory + ", windowFlags=" + num + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        List<ShippingInfoWidget.CustomizableShippingField> list = this.hiddenShippingInfoFields;
        out.writeInt(list.size());
        for (ShippingInfoWidget.CustomizableShippingField customizableShippingField : list) {
            out.writeString(customizableShippingField.name());
        }
        List<ShippingInfoWidget.CustomizableShippingField> list2 = this.optionalShippingInfoFields;
        out.writeInt(list2.size());
        for (ShippingInfoWidget.CustomizableShippingField customizableShippingField2 : list2) {
            out.writeString(customizableShippingField2.name());
        }
        ShippingInformation shippingInformation = this.prepopulatedShippingInfo;
        if (shippingInformation == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            shippingInformation.writeToParcel(out, i);
        }
        out.writeInt(this.isShippingInfoRequired ? 1 : 0);
        out.writeInt(this.isShippingMethodRequired ? 1 : 0);
        out.writeInt(this.paymentMethodsFooterLayoutId);
        out.writeInt(this.addPaymentMethodFooterLayoutId);
        List<PaymentMethod.Type> list3 = this.paymentMethodTypes;
        out.writeInt(list3.size());
        for (PaymentMethod.Type type : list3) {
            type.writeToParcel(out, i);
        }
        out.writeInt(this.shouldShowGooglePay ? 1 : 0);
        Set<String> set = this.allowedShippingCountryCodes;
        out.writeInt(set.size());
        for (String str : set) {
            out.writeString(str);
        }
        out.writeString(this.billingAddressFields.name());
        out.writeInt(this.canDeletePaymentMethods ? 1 : 0);
        out.writeInt(this.shouldPrefetchCustomer ? 1 : 0);
        out.writeSerializable(this.shippingInformationValidator);
        out.writeSerializable(this.shippingMethodsFactory);
        Integer num = this.windowFlags;
        if (num == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(num.intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentSessionConfig(List<? extends ShippingInfoWidget.CustomizableShippingField> hiddenShippingInfoFields, List<? extends ShippingInfoWidget.CustomizableShippingField> optionalShippingInfoFields, ShippingInformation shippingInformation, boolean z, boolean z2, int i, int i2, List<? extends PaymentMethod.Type> paymentMethodTypes, boolean z3, Set<String> allowedShippingCountryCodes, BillingAddressFields billingAddressFields, boolean z4, boolean z5, ShippingInformationValidator shippingInformationValidator, ShippingMethodsFactory shippingMethodsFactory, Integer num) {
        boolean equals;
        Intrinsics.checkNotNullParameter(hiddenShippingInfoFields, "hiddenShippingInfoFields");
        Intrinsics.checkNotNullParameter(optionalShippingInfoFields, "optionalShippingInfoFields");
        Intrinsics.checkNotNullParameter(paymentMethodTypes, "paymentMethodTypes");
        Intrinsics.checkNotNullParameter(allowedShippingCountryCodes, "allowedShippingCountryCodes");
        Intrinsics.checkNotNullParameter(billingAddressFields, "billingAddressFields");
        Intrinsics.checkNotNullParameter(shippingInformationValidator, "shippingInformationValidator");
        this.hiddenShippingInfoFields = hiddenShippingInfoFields;
        this.optionalShippingInfoFields = optionalShippingInfoFields;
        this.prepopulatedShippingInfo = shippingInformation;
        this.isShippingInfoRequired = z;
        this.isShippingMethodRequired = z2;
        this.paymentMethodsFooterLayoutId = i;
        this.addPaymentMethodFooterLayoutId = i2;
        this.paymentMethodTypes = paymentMethodTypes;
        this.shouldShowGooglePay = z3;
        this.allowedShippingCountryCodes = allowedShippingCountryCodes;
        this.billingAddressFields = billingAddressFields;
        this.canDeletePaymentMethods = z4;
        this.shouldPrefetchCustomer = z5;
        this.shippingInformationValidator = shippingInformationValidator;
        this.shippingMethodsFactory = shippingMethodsFactory;
        this.windowFlags = num;
        String[] countryCodes = Locale.getISOCountries();
        for (String str : allowedShippingCountryCodes) {
            Intrinsics.checkNotNullExpressionValue(countryCodes, "countryCodes");
            int length = countryCodes.length;
            boolean z6 = false;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    equals = StringsKt__StringsJVMKt.equals(str, countryCodes[i3], true);
                    if (equals) {
                        z6 = true;
                        continue;
                        break;
                    }
                    i3++;
                }
            }
            if (!z6) {
                throw new IllegalArgumentException(("'" + str + "' is not a valid country code").toString());
            }
        }
        if (this.isShippingMethodRequired && this.shippingMethodsFactory == null) {
            throw new IllegalArgumentException("If isShippingMethodRequired is true a ShippingMethodsFactory must also be provided.".toString());
        }
    }

    public /* synthetic */ PaymentSessionConfig(List list, List list2, ShippingInformation shippingInformation, boolean z, boolean z2, int i, int i2, List list3, boolean z3, Set set, BillingAddressFields billingAddressFields, boolean z4, boolean z5, ShippingInformationValidator shippingInformationValidator, ShippingMethodsFactory shippingMethodsFactory, Integer num, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i3 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i3 & 4) != 0 ? null : shippingInformation, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? 0 : i, (i3 & 64) != 0 ? 0 : i2, (i3 & 128) != 0 ? CollectionsKt__CollectionsJVMKt.listOf(PaymentMethod.Type.Card) : list3, (i3 & 256) == 0 ? z3 : false, (i3 & 512) != 0 ? SetsKt__SetsKt.emptySet() : set, (i3 & 1024) != 0 ? DEFAULT_BILLING_ADDRESS_FIELDS : billingAddressFields, (i3 & 2048) != 0 ? true : z4, (i3 & 4096) == 0 ? z5 : true, (i3 & 8192) != 0 ? new DefaultShippingInfoValidator() : shippingInformationValidator, (i3 & 16384) != 0 ? null : shippingMethodsFactory, (i3 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? null : num);
    }
}
