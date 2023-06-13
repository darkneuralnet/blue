package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.stripe.android.ObjectBuilder;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Token;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0003\u001b\u001c\u001dB\u001b\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÂ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u0014\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0015\u001a\u00020\tHÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0011HÖ\u0001R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m28432d2 = {"Lcom/stripe/android/model/AccountParams;", "Lcom/stripe/android/model/TokenParams;", "tosShownAndAccepted", "", "businessTypeParams", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams;", "(ZLcom/stripe/android/model/AccountParams$BusinessTypeParams;)V", "typeDataParams", "", "", "", "getTypeDataParams", "()Ljava/util/Map;", "component1", "component2", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "BusinessType", "BusinessTypeParams", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AccountParams extends TokenParams {
    public static final int $stable = 0;
    private static final String PARAM_BUSINESS_TYPE = "business_type";
    private static final String PARAM_TOS_SHOWN_AND_ACCEPTED = "tos_shown_and_accepted";
    private final BusinessTypeParams businessTypeParams;
    private final boolean tosShownAndAccepted;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AccountParams> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/model/AccountParams$BusinessType;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "Individual", "Company", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum BusinessType {
        Individual("individual"),
        Company("company");
        
        private final String code;

        BusinessType(String str) {
            this.code = str;
        }

        public final String getCode() {
            return this.code;
        }
    }

    @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0011\u0012B\u000f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0014\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0010H\u0016R&\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0002\u0013\u0014¨\u0006\u0015"}, m28432d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "type", "Lcom/stripe/android/model/AccountParams$BusinessType;", "(Lcom/stripe/android/model/AccountParams$BusinessType;)V", "paramsList", "", "Lkotlin/Pair;", "", "", "getParamsList", "()Ljava/util/List;", "getType$payments_core_release", "()Lcom/stripe/android/model/AccountParams$BusinessType;", "toParamMap", "", "Company", "Individual", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company;", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nAccountParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountParams.kt\ncom/stripe/android/model/AccountParams$BusinessTypeParams\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1006:1\n1789#2,2:1007\n1791#2:1010\n1#3:1009\n*S KotlinDebug\n*F\n+ 1 AccountParams.kt\ncom/stripe/android/model/AccountParams$BusinessTypeParams\n*L\n55#1:1007,2\n55#1:1010\n*E\n"})
    /* loaded from: classes7.dex */
    public static abstract class BusinessTypeParams implements StripeParamsModel, Parcelable {
        public static final int $stable = 0;
        private final BusinessType type;

        @Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 _2\u00020\u0001:\u0004^_`aB\u00ad\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u0015J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u0010L\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010M\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010P\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010!J¶\u0001\u0010Q\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0002\u0010RJ\t\u0010S\u001a\u00020THÖ\u0001J\u0013\u0010U\u001a\u00020\b2\b\u0010V\u001a\u0004\u0018\u000104HÖ\u0003J\t\u0010W\u001a\u00020THÖ\u0001J\t\u0010X\u001a\u00020\u000bHÖ\u0001J\u0019\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020THÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010\t\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010(\"\u0004\b,\u0010*R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b/\u0010!\"\u0004\b0\u0010#R(\u00101\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010403028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010(\"\u0004\b8\u0010*R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010(\"\u0004\b:\u0010*R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010(\"\u0004\b<\u0010*R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010(\"\u0004\b>\u0010*R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006b"}, m28432d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company;", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams;", "address", "Lcom/stripe/android/model/Address;", "addressKana", "Lcom/stripe/android/model/AddressJapanParams;", "addressKanji", "directorsProvided", "", "executivesProvided", "name", "", "nameKana", "nameKanji", "ownersProvided", "phone", "taxId", "taxIdRegistrar", "vatId", Company.PARAM_VERIFICATION, "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Verification;", "(Lcom/stripe/android/model/Address;Lcom/stripe/android/model/AddressJapanParams;Lcom/stripe/android/model/AddressJapanParams;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Verification;)V", "getAddress", "()Lcom/stripe/android/model/Address;", "setAddress", "(Lcom/stripe/android/model/Address;)V", "getAddressKana", "()Lcom/stripe/android/model/AddressJapanParams;", "setAddressKana", "(Lcom/stripe/android/model/AddressJapanParams;)V", "getAddressKanji", "setAddressKanji", "getDirectorsProvided", "()Ljava/lang/Boolean;", "setDirectorsProvided", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getExecutivesProvided", "setExecutivesProvided", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getNameKana", "setNameKana", "getNameKanji", "setNameKanji", "getOwnersProvided", "setOwnersProvided", "paramsList", "", "Lkotlin/Pair;", "", "getParamsList", "()Ljava/util/List;", "getPhone", "setPhone", "getTaxId", "setTaxId", "getTaxIdRegistrar", "setTaxIdRegistrar", "getVatId", "setVatId", "getVerification", "()Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Verification;", "setVerification", "(Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Verification;)V", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/stripe/android/model/Address;Lcom/stripe/android/model/AddressJapanParams;Lcom/stripe/android/model/AddressJapanParams;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Verification;)Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company;", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "Companion", "Document", "Verification", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Company extends BusinessTypeParams {
            @Deprecated
            private static final String PARAM_ADDRESS = "address";
            @Deprecated
            private static final String PARAM_ADDRESS_KANA = "address_kana";
            @Deprecated
            private static final String PARAM_ADDRESS_KANJI = "address_kanji";
            @Deprecated
            private static final String PARAM_DIRECTORS_PROVIDED = "directors_provided";
            @Deprecated
            private static final String PARAM_EXECUTIVES_PROVIDED = "executives_provided";
            @Deprecated
            private static final String PARAM_NAME = "name";
            @Deprecated
            private static final String PARAM_NAME_KANA = "name_kana";
            @Deprecated
            private static final String PARAM_NAME_KANJI = "name_kanji";
            @Deprecated
            private static final String PARAM_OWNERS_PROVIDED = "owners_provided";
            @Deprecated
            private static final String PARAM_PHONE = "phone";
            @Deprecated
            private static final String PARAM_TAX_ID = "tax_id";
            @Deprecated
            private static final String PARAM_TAX_ID_REGISTRAR = "tax_id_registrar";
            @Deprecated
            private static final String PARAM_VAT_ID = "vat_id";
            @Deprecated
            private static final String PARAM_VERIFICATION = "verification";
            private Address address;
            private AddressJapanParams addressKana;
            private AddressJapanParams addressKanji;
            private Boolean directorsProvided;
            private Boolean executivesProvided;
            private String name;
            private String nameKana;
            private String nameKanji;
            private Boolean ownersProvided;
            private String phone;
            private String taxId;
            private String taxIdRegistrar;
            private String vatId;
            private Verification verification;
            private static final Companion Companion = new Companion(null);
            public static final int $stable = 8;
            public static final Parcelable.Creator<Company> CREATOR = new Creator();

            @Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0018\u001a\u00020\u0002H\u0016J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u001a\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0015\u0010\u001c\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010 \u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010!\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eJ\u0015\u0010\"\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u001dJ\u0010\u0010#\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010$\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010%\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010&\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010'\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\f\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, m28432d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company;", "()V", "address", "Lcom/stripe/android/model/Address;", "addressKana", "Lcom/stripe/android/model/AddressJapanParams;", "addressKanji", "directorsProvided", "", "Ljava/lang/Boolean;", "executivesProvided", "name", "", "nameKana", "nameKanji", "ownersProvided", "phone", "taxId", "taxIdRegistrar", "vatId", Company.PARAM_VERIFICATION, "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Verification;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "setAddress", "setAddressKana", "setAddressKanji", "setDirectorsProvided", "(Ljava/lang/Boolean;)Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Builder;", "setExecutivesProvided", "setName", "setNameKana", "setNameKanji", "setOwnersProvided", "setPhone", "setTaxId", "setTaxIdRegistrar", "setVatId", "setVerification", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Builder implements ObjectBuilder<Company> {
                public static final int $stable = 8;
                private Address address;
                private AddressJapanParams addressKana;
                private AddressJapanParams addressKanji;
                private Boolean directorsProvided;
                private Boolean executivesProvided;
                private String name;
                private String nameKana;
                private String nameKanji;
                private Boolean ownersProvided;
                private String phone;
                private String taxId;
                private String taxIdRegistrar;
                private String vatId;
                private Verification verification;

                public final Builder setAddress(Address address) {
                    this.address = address;
                    return this;
                }

                public final Builder setAddressKana(AddressJapanParams addressJapanParams) {
                    this.addressKana = addressJapanParams;
                    return this;
                }

                public final Builder setAddressKanji(AddressJapanParams addressJapanParams) {
                    this.addressKanji = addressJapanParams;
                    return this;
                }

                public final Builder setDirectorsProvided(Boolean bool) {
                    this.directorsProvided = bool;
                    return this;
                }

                public final Builder setExecutivesProvided(Boolean bool) {
                    this.executivesProvided = bool;
                    return this;
                }

                public final Builder setName(String str) {
                    this.name = str;
                    return this;
                }

                public final Builder setNameKana(String str) {
                    this.nameKana = str;
                    return this;
                }

                public final Builder setNameKanji(String str) {
                    this.nameKanji = str;
                    return this;
                }

                public final Builder setOwnersProvided(Boolean bool) {
                    this.ownersProvided = bool;
                    return this;
                }

                public final Builder setPhone(String str) {
                    this.phone = str;
                    return this;
                }

                public final Builder setTaxId(String str) {
                    this.taxId = str;
                    return this;
                }

                public final Builder setTaxIdRegistrar(String str) {
                    this.taxIdRegistrar = str;
                    return this;
                }

                public final Builder setVatId(String str) {
                    this.vatId = str;
                    return this;
                }

                public final Builder setVerification(Verification verification) {
                    this.verification = verification;
                    return this;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.stripe.android.ObjectBuilder
                public Company build() {
                    return new Company(this.address, this.addressKana, this.addressKanji, this.directorsProvided, this.executivesProvided, this.name, this.nameKana, this.nameKanji, this.ownersProvided, this.phone, this.taxId, this.taxIdRegistrar, this.vatId, this.verification);
                }
            }

            @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Companion;", "", "()V", "PARAM_ADDRESS", "", "PARAM_ADDRESS_KANA", "PARAM_ADDRESS_KANJI", "PARAM_DIRECTORS_PROVIDED", "PARAM_EXECUTIVES_PROVIDED", "PARAM_NAME", "PARAM_NAME_KANA", "PARAM_NAME_KANJI", "PARAM_OWNERS_PROVIDED", "PARAM_PHONE", "PARAM_TAX_ID", "PARAM_TAX_ID_REGISTRAR", "PARAM_VAT_ID", "PARAM_VERIFICATION", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
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
            public static final class Creator implements Parcelable.Creator<Company> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Company createFromParcel(Parcel parcel) {
                    Boolean valueOf;
                    Boolean valueOf2;
                    Boolean valueOf3;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    Address createFromParcel = parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel);
                    AddressJapanParams createFromParcel2 = parcel.readInt() == 0 ? null : AddressJapanParams.CREATOR.createFromParcel(parcel);
                    AddressJapanParams createFromParcel3 = parcel.readInt() == 0 ? null : AddressJapanParams.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() == 0) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() == 0) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new Company(createFromParcel, createFromParcel2, createFromParcel3, valueOf, valueOf2, readString, readString2, readString3, valueOf3, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Verification.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Company[] newArray(int i) {
                    return new Company[i];
                }
            }

            @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u001f\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÂ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0004HÂ\u0003J!\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\u0014\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u0012H\u0016J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000bHÖ\u0001R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m28432d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Document;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", Document.PARAM_FRONT, "", Document.PARAM_BACK, "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
            @SourceDebugExtension({"SMAP\nAccountParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountParams.kt\ncom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Document\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1006:1\n1789#2,2:1007\n1791#2:1010\n1#3:1009\n*S KotlinDebug\n*F\n+ 1 AccountParams.kt\ncom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Document\n*L\n245#1:1007,2\n245#1:1010\n*E\n"})
            /* loaded from: classes7.dex */
            public static final class Document implements StripeParamsModel, Parcelable {
                public static final int $stable = 0;
                @Deprecated
                private static final String PARAM_BACK = "back";
                @Deprecated
                private static final String PARAM_FRONT = "front";
                private final String back;
                private final String front;
                private static final Companion Companion = new Companion(null);
                public static final Parcelable.Creator<Document> CREATOR = new Creator();

                @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Document$Companion;", "", "()V", "PARAM_BACK", "", "PARAM_FRONT", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
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
                public static final class Creator implements Parcelable.Creator<Document> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Document createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Document(parcel.readString(), parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Document[] newArray(int i) {
                        return new Document[i];
                    }
                }

                @JvmOverloads
                public Document() {
                    this(null, null, 3, null);
                }

                private final String component1() {
                    return this.front;
                }

                private final String component2() {
                    return this.back;
                }

                public static /* synthetic */ Document copy$default(Document document, String str, String str2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = document.front;
                    }
                    if ((i & 2) != 0) {
                        str2 = document.back;
                    }
                    return document.copy(str, str2);
                }

                public final Document copy(String str, String str2) {
                    return new Document(str, str2);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj instanceof Document) {
                        Document document = (Document) obj;
                        return Intrinsics.areEqual(this.front, document.front) && Intrinsics.areEqual(this.back, document.back);
                    }
                    return false;
                }

                public int hashCode() {
                    String str = this.front;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.back;
                    return hashCode + (str2 != null ? str2.hashCode() : 0);
                }

                @Override // com.stripe.android.model.StripeParamsModel
                public Map<String, Object> toParamMap() {
                    List<Pair> listOf;
                    Map<String, Object> emptyMap;
                    Map map;
                    listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m28425to(PARAM_FRONT, this.front), TuplesKt.m28425to(PARAM_BACK, this.back)});
                    emptyMap = MapsKt__MapsKt.emptyMap();
                    for (Pair pair : listOf) {
                        String str = (String) pair.component1();
                        String str2 = (String) pair.component2();
                        if (str2 != null) {
                            map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(str, str2));
                        } else {
                            map = null;
                        }
                        if (map == null) {
                            map = MapsKt__MapsKt.emptyMap();
                        }
                        emptyMap = MapsKt__MapsKt.plus(emptyMap, map);
                    }
                    return emptyMap;
                }

                public String toString() {
                    String str = this.front;
                    String str2 = this.back;
                    return "Document(front=" + str + ", back=" + str2 + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i) {
                    Intrinsics.checkNotNullParameter(out, "out");
                    out.writeString(this.front);
                    out.writeString(this.back);
                }

                @JvmOverloads
                public Document(String str) {
                    this(str, null, 2, null);
                }

                @JvmOverloads
                public Document(String str, String str2) {
                    this.front = str;
                    this.back = str2;
                }

                public /* synthetic */ Document(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
                }
            }

            @Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\u0014\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u0013H\u0016J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fHÖ\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u001c"}, m28432d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Verification;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", Verification.PARAM_DOCUMENT, "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Document;", "(Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Document;)V", "getDocument", "()Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Document;", "setDocument", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toParamMap", "", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Verification implements StripeParamsModel, Parcelable {
                @Deprecated
                private static final String PARAM_DOCUMENT = "document";
                private Document document;
                private static final Companion Companion = new Companion(null);
                public static final int $stable = 8;
                public static final Parcelable.Creator<Verification> CREATOR = new Creator();

                @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Verification$Companion;", "", "()V", "PARAM_DOCUMENT", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
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
                public static final class Creator implements Parcelable.Creator<Verification> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Verification createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Verification(parcel.readInt() == 0 ? null : Document.CREATOR.createFromParcel(parcel));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Verification[] newArray(int i) {
                        return new Verification[i];
                    }
                }

                public Verification() {
                    this(null, 1, null);
                }

                public static /* synthetic */ Verification copy$default(Verification verification, Document document, int i, Object obj) {
                    if ((i & 1) != 0) {
                        document = verification.document;
                    }
                    return verification.copy(document);
                }

                public final Document component1() {
                    return this.document;
                }

                public final Verification copy(Document document) {
                    return new Verification(document);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Verification) && Intrinsics.areEqual(this.document, ((Verification) obj).document);
                }

                public final Document getDocument() {
                    return this.document;
                }

                public int hashCode() {
                    Document document = this.document;
                    if (document == null) {
                        return 0;
                    }
                    return document.hashCode();
                }

                public final void setDocument(Document document) {
                    this.document = document;
                }

                @Override // com.stripe.android.model.StripeParamsModel
                public Map<String, Object> toParamMap() {
                    Map<String, Object> map;
                    Map<String, Object> emptyMap;
                    Document document = this.document;
                    if (document != null) {
                        map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_DOCUMENT, document.toParamMap()));
                    } else {
                        map = null;
                    }
                    if (map == null) {
                        emptyMap = MapsKt__MapsKt.emptyMap();
                        return emptyMap;
                    }
                    return map;
                }

                public String toString() {
                    Document document = this.document;
                    return "Verification(document=" + document + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i) {
                    Intrinsics.checkNotNullParameter(out, "out");
                    Document document = this.document;
                    if (document == null) {
                        out.writeInt(0);
                        return;
                    }
                    out.writeInt(1);
                    document.writeToParcel(out, i);
                }

                public Verification(Document document) {
                    this.document = document;
                }

                public /* synthetic */ Verification(Document document, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : document);
                }
            }

            public Company() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
            }

            public final Address component1() {
                return this.address;
            }

            public final String component10() {
                return this.phone;
            }

            public final String component11() {
                return this.taxId;
            }

            public final String component12() {
                return this.taxIdRegistrar;
            }

            public final String component13() {
                return this.vatId;
            }

            public final Verification component14() {
                return this.verification;
            }

            public final AddressJapanParams component2() {
                return this.addressKana;
            }

            public final AddressJapanParams component3() {
                return this.addressKanji;
            }

            public final Boolean component4() {
                return this.directorsProvided;
            }

            public final Boolean component5() {
                return this.executivesProvided;
            }

            public final String component6() {
                return this.name;
            }

            public final String component7() {
                return this.nameKana;
            }

            public final String component8() {
                return this.nameKanji;
            }

            public final Boolean component9() {
                return this.ownersProvided;
            }

            public final Company copy(Address address, AddressJapanParams addressJapanParams, AddressJapanParams addressJapanParams2, Boolean bool, Boolean bool2, String str, String str2, String str3, Boolean bool3, String str4, String str5, String str6, String str7, Verification verification) {
                return new Company(address, addressJapanParams, addressJapanParams2, bool, bool2, str, str2, str3, bool3, str4, str5, str6, str7, verification);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Company) {
                    Company company = (Company) obj;
                    return Intrinsics.areEqual(this.address, company.address) && Intrinsics.areEqual(this.addressKana, company.addressKana) && Intrinsics.areEqual(this.addressKanji, company.addressKanji) && Intrinsics.areEqual(this.directorsProvided, company.directorsProvided) && Intrinsics.areEqual(this.executivesProvided, company.executivesProvided) && Intrinsics.areEqual(this.name, company.name) && Intrinsics.areEqual(this.nameKana, company.nameKana) && Intrinsics.areEqual(this.nameKanji, company.nameKanji) && Intrinsics.areEqual(this.ownersProvided, company.ownersProvided) && Intrinsics.areEqual(this.phone, company.phone) && Intrinsics.areEqual(this.taxId, company.taxId) && Intrinsics.areEqual(this.taxIdRegistrar, company.taxIdRegistrar) && Intrinsics.areEqual(this.vatId, company.vatId) && Intrinsics.areEqual(this.verification, company.verification);
                }
                return false;
            }

            public final Address getAddress() {
                return this.address;
            }

            public final AddressJapanParams getAddressKana() {
                return this.addressKana;
            }

            public final AddressJapanParams getAddressKanji() {
                return this.addressKanji;
            }

            public final Boolean getDirectorsProvided() {
                return this.directorsProvided;
            }

            public final Boolean getExecutivesProvided() {
                return this.executivesProvided;
            }

            public final String getName() {
                return this.name;
            }

            public final String getNameKana() {
                return this.nameKana;
            }

            public final String getNameKanji() {
                return this.nameKanji;
            }

            public final Boolean getOwnersProvided() {
                return this.ownersProvided;
            }

            @Override // com.stripe.android.model.AccountParams.BusinessTypeParams
            public List<Pair<String, Object>> getParamsList() {
                Map<String, Object> map;
                Map<String, Object> map2;
                Map<String, Object> map3;
                List<Pair<String, Object>> listOf;
                Pair[] pairArr = new Pair[14];
                Address address = this.address;
                Map<String, Object> map4 = null;
                if (address != null) {
                    map = address.toParamMap();
                } else {
                    map = null;
                }
                pairArr[0] = TuplesKt.m28425to("address", map);
                AddressJapanParams addressJapanParams = this.addressKana;
                if (addressJapanParams != null) {
                    map2 = addressJapanParams.toParamMap();
                } else {
                    map2 = null;
                }
                pairArr[1] = TuplesKt.m28425to(PARAM_ADDRESS_KANA, map2);
                AddressJapanParams addressJapanParams2 = this.addressKanji;
                if (addressJapanParams2 != null) {
                    map3 = addressJapanParams2.toParamMap();
                } else {
                    map3 = null;
                }
                pairArr[2] = TuplesKt.m28425to(PARAM_ADDRESS_KANJI, map3);
                pairArr[3] = TuplesKt.m28425to(PARAM_DIRECTORS_PROVIDED, this.directorsProvided);
                pairArr[4] = TuplesKt.m28425to(PARAM_EXECUTIVES_PROVIDED, this.executivesProvided);
                pairArr[5] = TuplesKt.m28425to("name", this.name);
                pairArr[6] = TuplesKt.m28425to(PARAM_NAME_KANA, this.nameKana);
                pairArr[7] = TuplesKt.m28425to(PARAM_NAME_KANJI, this.nameKanji);
                pairArr[8] = TuplesKt.m28425to(PARAM_OWNERS_PROVIDED, this.ownersProvided);
                pairArr[9] = TuplesKt.m28425to("phone", this.phone);
                pairArr[10] = TuplesKt.m28425to(PARAM_TAX_ID, this.taxId);
                pairArr[11] = TuplesKt.m28425to(PARAM_TAX_ID_REGISTRAR, this.taxIdRegistrar);
                pairArr[12] = TuplesKt.m28425to(PARAM_VAT_ID, this.vatId);
                Verification verification = this.verification;
                if (verification != null) {
                    map4 = verification.toParamMap();
                }
                pairArr[13] = TuplesKt.m28425to(PARAM_VERIFICATION, map4);
                listOf = CollectionsKt__CollectionsKt.listOf((Object[]) pairArr);
                return listOf;
            }

            public final String getPhone() {
                return this.phone;
            }

            public final String getTaxId() {
                return this.taxId;
            }

            public final String getTaxIdRegistrar() {
                return this.taxIdRegistrar;
            }

            public final String getVatId() {
                return this.vatId;
            }

            public final Verification getVerification() {
                return this.verification;
            }

            public int hashCode() {
                Address address = this.address;
                int hashCode = (address == null ? 0 : address.hashCode()) * 31;
                AddressJapanParams addressJapanParams = this.addressKana;
                int hashCode2 = (hashCode + (addressJapanParams == null ? 0 : addressJapanParams.hashCode())) * 31;
                AddressJapanParams addressJapanParams2 = this.addressKanji;
                int hashCode3 = (hashCode2 + (addressJapanParams2 == null ? 0 : addressJapanParams2.hashCode())) * 31;
                Boolean bool = this.directorsProvided;
                int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.executivesProvided;
                int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                String str = this.name;
                int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.nameKana;
                int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.nameKanji;
                int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
                Boolean bool3 = this.ownersProvided;
                int hashCode9 = (hashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                String str4 = this.phone;
                int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.taxId;
                int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.taxIdRegistrar;
                int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.vatId;
                int hashCode13 = (hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
                Verification verification = this.verification;
                return hashCode13 + (verification != null ? verification.hashCode() : 0);
            }

            public final void setAddress(Address address) {
                this.address = address;
            }

            public final void setAddressKana(AddressJapanParams addressJapanParams) {
                this.addressKana = addressJapanParams;
            }

            public final void setAddressKanji(AddressJapanParams addressJapanParams) {
                this.addressKanji = addressJapanParams;
            }

            public final void setDirectorsProvided(Boolean bool) {
                this.directorsProvided = bool;
            }

            public final void setExecutivesProvided(Boolean bool) {
                this.executivesProvided = bool;
            }

            public final void setName(String str) {
                this.name = str;
            }

            public final void setNameKana(String str) {
                this.nameKana = str;
            }

            public final void setNameKanji(String str) {
                this.nameKanji = str;
            }

            public final void setOwnersProvided(Boolean bool) {
                this.ownersProvided = bool;
            }

            public final void setPhone(String str) {
                this.phone = str;
            }

            public final void setTaxId(String str) {
                this.taxId = str;
            }

            public final void setTaxIdRegistrar(String str) {
                this.taxIdRegistrar = str;
            }

            public final void setVatId(String str) {
                this.vatId = str;
            }

            public final void setVerification(Verification verification) {
                this.verification = verification;
            }

            public String toString() {
                Address address = this.address;
                AddressJapanParams addressJapanParams = this.addressKana;
                AddressJapanParams addressJapanParams2 = this.addressKanji;
                Boolean bool = this.directorsProvided;
                Boolean bool2 = this.executivesProvided;
                String str = this.name;
                String str2 = this.nameKana;
                String str3 = this.nameKanji;
                Boolean bool3 = this.ownersProvided;
                String str4 = this.phone;
                String str5 = this.taxId;
                String str6 = this.taxIdRegistrar;
                String str7 = this.vatId;
                Verification verification = this.verification;
                return "Company(address=" + address + ", addressKana=" + addressJapanParams + ", addressKanji=" + addressJapanParams2 + ", directorsProvided=" + bool + ", executivesProvided=" + bool2 + ", name=" + str + ", nameKana=" + str2 + ", nameKanji=" + str3 + ", ownersProvided=" + bool3 + ", phone=" + str4 + ", taxId=" + str5 + ", taxIdRegistrar=" + str6 + ", vatId=" + str7 + ", verification=" + verification + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                Address address = this.address;
                if (address == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    address.writeToParcel(out, i);
                }
                AddressJapanParams addressJapanParams = this.addressKana;
                if (addressJapanParams == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    addressJapanParams.writeToParcel(out, i);
                }
                AddressJapanParams addressJapanParams2 = this.addressKanji;
                if (addressJapanParams2 == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    addressJapanParams2.writeToParcel(out, i);
                }
                Boolean bool = this.directorsProvided;
                if (bool == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    out.writeInt(bool.booleanValue() ? 1 : 0);
                }
                Boolean bool2 = this.executivesProvided;
                if (bool2 == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    out.writeInt(bool2.booleanValue() ? 1 : 0);
                }
                out.writeString(this.name);
                out.writeString(this.nameKana);
                out.writeString(this.nameKanji);
                Boolean bool3 = this.ownersProvided;
                if (bool3 == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    out.writeInt(bool3.booleanValue() ? 1 : 0);
                }
                out.writeString(this.phone);
                out.writeString(this.taxId);
                out.writeString(this.taxIdRegistrar);
                out.writeString(this.vatId);
                Verification verification = this.verification;
                if (verification == null) {
                    out.writeInt(0);
                    return;
                }
                out.writeInt(1);
                verification.writeToParcel(out, i);
            }

            public /* synthetic */ Company(Address address, AddressJapanParams addressJapanParams, AddressJapanParams addressJapanParams2, Boolean bool, Boolean bool2, String str, String str2, String str3, Boolean bool3, String str4, String str5, String str6, String str7, Verification verification, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : address, (i & 2) != 0 ? null : addressJapanParams, (i & 4) != 0 ? null : addressJapanParams2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? Boolean.FALSE : bool3, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? null : str5, (i & 2048) != 0 ? null : str6, (i & 4096) != 0 ? null : str7, (i & 8192) == 0 ? verification : null);
            }

            public Company(Address address, AddressJapanParams addressJapanParams, AddressJapanParams addressJapanParams2, Boolean bool, Boolean bool2, String str, String str2, String str3, Boolean bool3, String str4, String str5, String str6, String str7, Verification verification) {
                super(BusinessType.Company, null);
                this.address = address;
                this.addressKana = addressJapanParams;
                this.addressKanji = addressJapanParams2;
                this.directorsProvided = bool;
                this.executivesProvided = bool2;
                this.name = str;
                this.nameKana = str2;
                this.nameKanji = str3;
                this.ownersProvided = bool3;
                this.phone = str4;
                this.taxId = str5;
                this.taxIdRegistrar = str6;
                this.vatId = str7;
                this.verification = verification;
            }
        }

        @Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 q2\u00020\u0001:\u0004pqrsBé\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010\u001aJ\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010W\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\nHÆ\u0003Jí\u0001\u0010c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001J\t\u0010d\u001a\u00020eHÖ\u0001J\u0013\u0010f\u001a\u00020g2\b\u0010h\u001a\u0004\u0018\u00010FHÖ\u0003J\t\u0010i\u001a\u00020eHÖ\u0001J\t\u0010j\u001a\u00020\nHÖ\u0001J\u0019\u0010k\u001a\u00020l2\u0006\u0010m\u001a\u00020n2\u0006\u0010o\u001a\u00020eHÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010*\"\u0004\b.\u0010,R\u001c\u0010\f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010*\"\u0004\b0\u0010,R\u001c\u0010\r\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010*\"\u0004\b2\u0010,R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010*\"\u0004\b4\u0010,R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010*\"\u0004\b6\u0010,R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010*\"\u0004\b8\u0010,R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010*\"\u0004\b:\u0010,R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010*\"\u0004\b<\u0010,R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010*\"\u0004\b>\u0010,R(\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR(\u0010C\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010F0E0D8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010*\"\u0004\bJ\u0010,R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010*\"\u0004\bL\u0010,R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010P¨\u0006t"}, m28432d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual;", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams;", "address", "Lcom/stripe/android/model/Address;", "addressKana", "Lcom/stripe/android/model/AddressJapanParams;", "addressKanji", "dateOfBirth", "Lcom/stripe/android/model/DateOfBirth;", "email", "", "firstName", "firstNameKana", "firstNameKanji", Individual.PARAM_GENDER, "idNumber", "lastName", "lastNameKana", "lastNameKanji", "maidenName", Individual.PARAM_METADATA, "", "phone", "ssnLast4", Individual.PARAM_VERIFICATION, "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Verification;", "(Lcom/stripe/android/model/Address;Lcom/stripe/android/model/AddressJapanParams;Lcom/stripe/android/model/AddressJapanParams;Lcom/stripe/android/model/DateOfBirth;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Verification;)V", "getAddress", "()Lcom/stripe/android/model/Address;", "setAddress", "(Lcom/stripe/android/model/Address;)V", "getAddressKana", "()Lcom/stripe/android/model/AddressJapanParams;", "setAddressKana", "(Lcom/stripe/android/model/AddressJapanParams;)V", "getAddressKanji", "setAddressKanji", "getDateOfBirth", "()Lcom/stripe/android/model/DateOfBirth;", "setDateOfBirth", "(Lcom/stripe/android/model/DateOfBirth;)V", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getFirstName", "setFirstName", "getFirstNameKana", "setFirstNameKana", "getFirstNameKanji", "setFirstNameKanji", "getGender", "setGender", "getIdNumber", "setIdNumber", "getLastName", "setLastName", "getLastNameKana", "setLastNameKana", "getLastNameKanji", "setLastNameKanji", "getMaidenName", "setMaidenName", "getMetadata", "()Ljava/util/Map;", "setMetadata", "(Ljava/util/Map;)V", "paramsList", "", "Lkotlin/Pair;", "", "getParamsList", "()Ljava/util/List;", "getPhone", "setPhone", "getSsnLast4", "setSsnLast4", "getVerification", "()Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Verification;", "setVerification", "(Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Verification;)V", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "Companion", "Document", "Verification", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Individual extends BusinessTypeParams {
            @Deprecated
            private static final String PARAM_ADDRESS = "address";
            @Deprecated
            private static final String PARAM_ADDRESS_KANA = "address_kana";
            @Deprecated
            private static final String PARAM_ADDRESS_KANJI = "address_kanji";
            @Deprecated
            private static final String PARAM_DOB = "dob";
            @Deprecated
            private static final String PARAM_EMAIL = "email";
            @Deprecated
            private static final String PARAM_FIRST_NAME = "first_name";
            @Deprecated
            private static final String PARAM_FIRST_NAME_KANA = "first_name_kana";
            @Deprecated
            private static final String PARAM_FIRST_NAME_KANJI = "first_name_kanji";
            @Deprecated
            private static final String PARAM_GENDER = "gender";
            @Deprecated
            private static final String PARAM_ID_NUMBER = "id_number";
            @Deprecated
            private static final String PARAM_LAST_NAME = "last_name";
            @Deprecated
            private static final String PARAM_LAST_NAME_KANA = "last_name_kana";
            @Deprecated
            private static final String PARAM_LAST_NAME_KANJI = "last_name_kanji";
            @Deprecated
            private static final String PARAM_MAIDEN_NAME = "maiden_name";
            @Deprecated
            private static final String PARAM_METADATA = "metadata";
            @Deprecated
            private static final String PARAM_PHONE = "phone";
            @Deprecated
            private static final String PARAM_SSN_LAST_4 = "ssn_last_4";
            @Deprecated
            private static final String PARAM_VERIFICATION = "verification";
            private Address address;
            private AddressJapanParams addressKana;
            private AddressJapanParams addressKanji;
            private DateOfBirth dateOfBirth;
            private String email;
            private String firstName;
            private String firstNameKana;
            private String firstNameKanji;
            private String gender;
            private String idNumber;
            private String lastName;
            private String lastNameKana;
            private String lastNameKanji;
            private String maidenName;
            private Map<String, String> metadata;
            private String phone;
            private String ssnLast4;
            private Verification verification;
            private static final Companion Companion = new Companion(null);
            public static final int $stable = 8;
            public static final Parcelable.Creator<Individual> CREATOR = new Creator();

            @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u001e\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u001f\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0010\u0010 \u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010!\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\"\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u0010\u0010#\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\fJ\u0010\u0010$\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\fJ\u0010\u0010%\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\fJ\u0010\u0010&\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\fJ\u0010\u0010'\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\fJ\u0010\u0010(\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\fJ\u0010\u0010)\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\fJ\u0010\u0010*\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\fJ\u001c\u0010+\u001a\u00020\u00002\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u0017J\u0010\u0010,\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\fJ\u0010\u0010-\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\fJ\u0010\u0010.\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, m28432d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual;", "()V", "address", "Lcom/stripe/android/model/Address;", "addressKana", "Lcom/stripe/android/model/AddressJapanParams;", "addressKanji", "dateOfBirth", "Lcom/stripe/android/model/DateOfBirth;", "email", "", "firstName", "firstNameKana", "firstNameKanji", Individual.PARAM_GENDER, "idNumber", "lastName", "lastNameKana", "lastNameKanji", "maidenName", Individual.PARAM_METADATA, "", "phone", "ssnLast4", Individual.PARAM_VERIFICATION, "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Verification;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "setAddress", "setAddressKana", "setAddressKanji", "setDateOfBirth", "setEmail", "setFirstName", "setFirstNameKana", "setFirstNameKanji", "setGender", "setIdNumber", "setLastName", "setLastNameKana", "setLastNameKanji", "setMaidenName", "setMetadata", "setPhone", "setSsnLast4", "setVerification", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Builder implements ObjectBuilder<Individual> {
                public static final int $stable = 8;
                private Address address;
                private AddressJapanParams addressKana;
                private AddressJapanParams addressKanji;
                private DateOfBirth dateOfBirth;
                private String email;
                private String firstName;
                private String firstNameKana;
                private String firstNameKanji;
                private String gender;
                private String idNumber;
                private String lastName;
                private String lastNameKana;
                private String lastNameKanji;
                private String maidenName;
                private Map<String, String> metadata;
                private String phone;
                private String ssnLast4;
                private Verification verification;

                public final Builder setAddress(Address address) {
                    this.address = address;
                    return this;
                }

                public final Builder setAddressKana(AddressJapanParams addressJapanParams) {
                    this.addressKana = addressJapanParams;
                    return this;
                }

                public final Builder setAddressKanji(AddressJapanParams addressJapanParams) {
                    this.addressKanji = addressJapanParams;
                    return this;
                }

                public final Builder setDateOfBirth(DateOfBirth dateOfBirth) {
                    this.dateOfBirth = dateOfBirth;
                    return this;
                }

                public final Builder setEmail(String str) {
                    this.email = str;
                    return this;
                }

                public final Builder setFirstName(String str) {
                    this.firstName = str;
                    return this;
                }

                public final Builder setFirstNameKana(String str) {
                    this.firstNameKana = str;
                    return this;
                }

                public final Builder setFirstNameKanji(String str) {
                    this.firstNameKanji = str;
                    return this;
                }

                public final Builder setGender(String str) {
                    this.gender = str;
                    return this;
                }

                public final Builder setIdNumber(String str) {
                    this.idNumber = str;
                    return this;
                }

                public final Builder setLastName(String str) {
                    this.lastName = str;
                    return this;
                }

                public final Builder setLastNameKana(String str) {
                    this.lastNameKana = str;
                    return this;
                }

                public final Builder setLastNameKanji(String str) {
                    this.lastNameKanji = str;
                    return this;
                }

                public final Builder setMaidenName(String str) {
                    this.maidenName = str;
                    return this;
                }

                public final Builder setMetadata(Map<String, String> map) {
                    this.metadata = map;
                    return this;
                }

                public final Builder setPhone(String str) {
                    this.phone = str;
                    return this;
                }

                public final Builder setSsnLast4(String str) {
                    this.ssnLast4 = str;
                    return this;
                }

                public final Builder setVerification(Verification verification) {
                    this.verification = verification;
                    return this;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.stripe.android.ObjectBuilder
                public Individual build() {
                    return new Individual(this.address, this.addressKana, this.addressKanji, this.dateOfBirth, this.email, this.firstName, this.firstNameKana, this.firstNameKanji, this.gender, this.idNumber, this.lastName, this.lastNameKana, this.lastNameKanji, this.maidenName, this.metadata, this.phone, this.ssnLast4, this.verification);
                }
            }

            @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Companion;", "", "()V", "PARAM_ADDRESS", "", "PARAM_ADDRESS_KANA", "PARAM_ADDRESS_KANJI", "PARAM_DOB", "PARAM_EMAIL", "PARAM_FIRST_NAME", "PARAM_FIRST_NAME_KANA", "PARAM_FIRST_NAME_KANJI", "PARAM_GENDER", "PARAM_ID_NUMBER", "PARAM_LAST_NAME", "PARAM_LAST_NAME_KANA", "PARAM_LAST_NAME_KANJI", "PARAM_MAIDEN_NAME", "PARAM_METADATA", "PARAM_PHONE", "PARAM_SSN_LAST_4", "PARAM_VERIFICATION", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
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
            public static final class Creator implements Parcelable.Creator<Individual> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Individual createFromParcel(Parcel parcel) {
                    String str;
                    LinkedHashMap linkedHashMap;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    Address createFromParcel = parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel);
                    AddressJapanParams createFromParcel2 = parcel.readInt() == 0 ? null : AddressJapanParams.CREATOR.createFromParcel(parcel);
                    AddressJapanParams createFromParcel3 = parcel.readInt() == 0 ? null : AddressJapanParams.CREATOR.createFromParcel(parcel);
                    DateOfBirth createFromParcel4 = parcel.readInt() == 0 ? null : DateOfBirth.CREATOR.createFromParcel(parcel);
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    String readString8 = parcel.readString();
                    String readString9 = parcel.readString();
                    String readString10 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        str = readString8;
                        linkedHashMap = null;
                    } else {
                        int readInt = parcel.readInt();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                        int i = 0;
                        while (i != readInt) {
                            linkedHashMap2.put(parcel.readString(), parcel.readString());
                            i++;
                            readInt = readInt;
                            readString8 = readString8;
                        }
                        str = readString8;
                        linkedHashMap = linkedHashMap2;
                    }
                    return new Individual(createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, readString, readString2, readString3, readString4, readString5, readString6, readString7, str, readString9, readString10, linkedHashMap, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Verification.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Individual[] newArray(int i) {
                    return new Individual[i];
                }
            }

            @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u001f\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÂ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0004HÂ\u0003J!\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\u0014\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u0012H\u0016J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000bHÖ\u0001R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m28432d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Document;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", Document.PARAM_FRONT, "", Document.PARAM_BACK, "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
            @SourceDebugExtension({"SMAP\nAccountParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountParams.kt\ncom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Document\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1006:1\n1789#2,2:1007\n1791#2:1010\n1#3:1009\n*S KotlinDebug\n*F\n+ 1 AccountParams.kt\ncom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Document\n*L\n667#1:1007,2\n667#1:1010\n*E\n"})
            /* loaded from: classes7.dex */
            public static final class Document implements StripeParamsModel, Parcelable {
                @Deprecated
                private static final String PARAM_BACK = "back";
                @Deprecated
                private static final String PARAM_FRONT = "front";
                private String back;
                private String front;
                private static final Companion Companion = new Companion(null);
                public static final int $stable = 8;
                public static final Parcelable.Creator<Document> CREATOR = new Creator();

                @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Document$Companion;", "", "()V", "PARAM_BACK", "", "PARAM_FRONT", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
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
                public static final class Creator implements Parcelable.Creator<Document> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Document createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Document(parcel.readString(), parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Document[] newArray(int i) {
                        return new Document[i];
                    }
                }

                @JvmOverloads
                public Document() {
                    this(null, null, 3, null);
                }

                private final String component1() {
                    return this.front;
                }

                private final String component2() {
                    return this.back;
                }

                public static /* synthetic */ Document copy$default(Document document, String str, String str2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = document.front;
                    }
                    if ((i & 2) != 0) {
                        str2 = document.back;
                    }
                    return document.copy(str, str2);
                }

                public final Document copy(String str, String str2) {
                    return new Document(str, str2);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj instanceof Document) {
                        Document document = (Document) obj;
                        return Intrinsics.areEqual(this.front, document.front) && Intrinsics.areEqual(this.back, document.back);
                    }
                    return false;
                }

                public int hashCode() {
                    String str = this.front;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.back;
                    return hashCode + (str2 != null ? str2.hashCode() : 0);
                }

                @Override // com.stripe.android.model.StripeParamsModel
                public Map<String, Object> toParamMap() {
                    List<Pair> listOf;
                    Map<String, Object> emptyMap;
                    Map map;
                    listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m28425to(PARAM_FRONT, this.front), TuplesKt.m28425to(PARAM_BACK, this.back)});
                    emptyMap = MapsKt__MapsKt.emptyMap();
                    for (Pair pair : listOf) {
                        String str = (String) pair.component1();
                        String str2 = (String) pair.component2();
                        if (str2 != null) {
                            map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(str, str2));
                        } else {
                            map = null;
                        }
                        if (map == null) {
                            map = MapsKt__MapsKt.emptyMap();
                        }
                        emptyMap = MapsKt__MapsKt.plus(emptyMap, map);
                    }
                    return emptyMap;
                }

                public String toString() {
                    String str = this.front;
                    String str2 = this.back;
                    return "Document(front=" + str + ", back=" + str2 + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i) {
                    Intrinsics.checkNotNullParameter(out, "out");
                    out.writeString(this.front);
                    out.writeString(this.back);
                }

                @JvmOverloads
                public Document(String str) {
                    this(str, null, 2, null);
                }

                @JvmOverloads
                public Document(String str, String str2) {
                    this.front = str;
                    this.back = str2;
                }

                public /* synthetic */ Document(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
                }
            }

            @Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001 B\u001f\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\u0014\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00150\u0018H\u0016J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006!"}, m28432d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Verification;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", Verification.PARAM_DOCUMENT, "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Document;", "additionalDocument", "(Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Document;Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Document;)V", "getAdditionalDocument", "()Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Document;", "setAdditionalDocument", "(Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Document;)V", "getDocument", "setDocument", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toParamMap", "", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
            @SourceDebugExtension({"SMAP\nAccountParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountParams.kt\ncom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Verification\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1006:1\n1789#2,2:1007\n1791#2:1010\n1#3:1009\n*S KotlinDebug\n*F\n+ 1 AccountParams.kt\ncom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Verification\n*L\n630#1:1007,2\n630#1:1010\n*E\n"})
            /* loaded from: classes7.dex */
            public static final class Verification implements StripeParamsModel, Parcelable {
                @Deprecated
                private static final String PARAM_ADDITIONAL_DOCUMENT = "additional_document";
                @Deprecated
                private static final String PARAM_DOCUMENT = "document";
                private Document additionalDocument;
                private Document document;
                private static final Companion Companion = new Companion(null);
                public static final int $stable = 8;
                public static final Parcelable.Creator<Verification> CREATOR = new Creator();

                @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Verification$Companion;", "", "()V", "PARAM_ADDITIONAL_DOCUMENT", "", "PARAM_DOCUMENT", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
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
                public static final class Creator implements Parcelable.Creator<Verification> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Verification createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Verification(parcel.readInt() == 0 ? null : Document.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Document.CREATOR.createFromParcel(parcel) : null);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Verification[] newArray(int i) {
                        return new Verification[i];
                    }
                }

                @JvmOverloads
                public Verification() {
                    this(null, null, 3, null);
                }

                public static /* synthetic */ Verification copy$default(Verification verification, Document document, Document document2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        document = verification.document;
                    }
                    if ((i & 2) != 0) {
                        document2 = verification.additionalDocument;
                    }
                    return verification.copy(document, document2);
                }

                public final Document component1() {
                    return this.document;
                }

                public final Document component2() {
                    return this.additionalDocument;
                }

                public final Verification copy(Document document, Document document2) {
                    return new Verification(document, document2);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj instanceof Verification) {
                        Verification verification = (Verification) obj;
                        return Intrinsics.areEqual(this.document, verification.document) && Intrinsics.areEqual(this.additionalDocument, verification.additionalDocument);
                    }
                    return false;
                }

                public final Document getAdditionalDocument() {
                    return this.additionalDocument;
                }

                public final Document getDocument() {
                    return this.document;
                }

                public int hashCode() {
                    Document document = this.document;
                    int hashCode = (document == null ? 0 : document.hashCode()) * 31;
                    Document document2 = this.additionalDocument;
                    return hashCode + (document2 != null ? document2.hashCode() : 0);
                }

                public final void setAdditionalDocument(Document document) {
                    this.additionalDocument = document;
                }

                public final void setDocument(Document document) {
                    this.document = document;
                }

                @Override // com.stripe.android.model.StripeParamsModel
                public Map<String, Object> toParamMap() {
                    Map<String, Object> map;
                    Map<String, Object> map2;
                    List<Pair> listOf;
                    Map<String, Object> emptyMap;
                    Map map3;
                    Pair[] pairArr = new Pair[2];
                    Document document = this.additionalDocument;
                    if (document != null) {
                        map = document.toParamMap();
                    } else {
                        map = null;
                    }
                    pairArr[0] = TuplesKt.m28425to(PARAM_ADDITIONAL_DOCUMENT, map);
                    Document document2 = this.document;
                    if (document2 != null) {
                        map2 = document2.toParamMap();
                    } else {
                        map2 = null;
                    }
                    pairArr[1] = TuplesKt.m28425to(PARAM_DOCUMENT, map2);
                    listOf = CollectionsKt__CollectionsKt.listOf((Object[]) pairArr);
                    emptyMap = MapsKt__MapsKt.emptyMap();
                    for (Pair pair : listOf) {
                        String str = (String) pair.component1();
                        Map map4 = (Map) pair.component2();
                        if (map4 != null) {
                            map3 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(str, map4));
                        } else {
                            map3 = null;
                        }
                        if (map3 == null) {
                            map3 = MapsKt__MapsKt.emptyMap();
                        }
                        emptyMap = MapsKt__MapsKt.plus(emptyMap, map3);
                    }
                    return emptyMap;
                }

                public String toString() {
                    Document document = this.document;
                    Document document2 = this.additionalDocument;
                    return "Verification(document=" + document + ", additionalDocument=" + document2 + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i) {
                    Intrinsics.checkNotNullParameter(out, "out");
                    Document document = this.document;
                    if (document == null) {
                        out.writeInt(0);
                    } else {
                        out.writeInt(1);
                        document.writeToParcel(out, i);
                    }
                    Document document2 = this.additionalDocument;
                    if (document2 == null) {
                        out.writeInt(0);
                        return;
                    }
                    out.writeInt(1);
                    document2.writeToParcel(out, i);
                }

                @JvmOverloads
                public Verification(Document document) {
                    this(document, null, 2, null);
                }

                @JvmOverloads
                public Verification(Document document, Document document2) {
                    this.document = document;
                    this.additionalDocument = document2;
                }

                public /* synthetic */ Verification(Document document, Document document2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : document, (i & 2) != 0 ? null : document2);
                }
            }

            public Individual() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
            }

            public final Address component1() {
                return this.address;
            }

            public final String component10() {
                return this.idNumber;
            }

            public final String component11() {
                return this.lastName;
            }

            public final String component12() {
                return this.lastNameKana;
            }

            public final String component13() {
                return this.lastNameKanji;
            }

            public final String component14() {
                return this.maidenName;
            }

            public final Map<String, String> component15() {
                return this.metadata;
            }

            public final String component16() {
                return this.phone;
            }

            public final String component17() {
                return this.ssnLast4;
            }

            public final Verification component18() {
                return this.verification;
            }

            public final AddressJapanParams component2() {
                return this.addressKana;
            }

            public final AddressJapanParams component3() {
                return this.addressKanji;
            }

            public final DateOfBirth component4() {
                return this.dateOfBirth;
            }

            public final String component5() {
                return this.email;
            }

            public final String component6() {
                return this.firstName;
            }

            public final String component7() {
                return this.firstNameKana;
            }

            public final String component8() {
                return this.firstNameKanji;
            }

            public final String component9() {
                return this.gender;
            }

            public final Individual copy(Address address, AddressJapanParams addressJapanParams, AddressJapanParams addressJapanParams2, DateOfBirth dateOfBirth, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Map<String, String> map, String str11, String str12, Verification verification) {
                return new Individual(address, addressJapanParams, addressJapanParams2, dateOfBirth, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, map, str11, str12, verification);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Individual) {
                    Individual individual = (Individual) obj;
                    return Intrinsics.areEqual(this.address, individual.address) && Intrinsics.areEqual(this.addressKana, individual.addressKana) && Intrinsics.areEqual(this.addressKanji, individual.addressKanji) && Intrinsics.areEqual(this.dateOfBirth, individual.dateOfBirth) && Intrinsics.areEqual(this.email, individual.email) && Intrinsics.areEqual(this.firstName, individual.firstName) && Intrinsics.areEqual(this.firstNameKana, individual.firstNameKana) && Intrinsics.areEqual(this.firstNameKanji, individual.firstNameKanji) && Intrinsics.areEqual(this.gender, individual.gender) && Intrinsics.areEqual(this.idNumber, individual.idNumber) && Intrinsics.areEqual(this.lastName, individual.lastName) && Intrinsics.areEqual(this.lastNameKana, individual.lastNameKana) && Intrinsics.areEqual(this.lastNameKanji, individual.lastNameKanji) && Intrinsics.areEqual(this.maidenName, individual.maidenName) && Intrinsics.areEqual(this.metadata, individual.metadata) && Intrinsics.areEqual(this.phone, individual.phone) && Intrinsics.areEqual(this.ssnLast4, individual.ssnLast4) && Intrinsics.areEqual(this.verification, individual.verification);
                }
                return false;
            }

            public final Address getAddress() {
                return this.address;
            }

            public final AddressJapanParams getAddressKana() {
                return this.addressKana;
            }

            public final AddressJapanParams getAddressKanji() {
                return this.addressKanji;
            }

            public final DateOfBirth getDateOfBirth() {
                return this.dateOfBirth;
            }

            public final String getEmail() {
                return this.email;
            }

            public final String getFirstName() {
                return this.firstName;
            }

            public final String getFirstNameKana() {
                return this.firstNameKana;
            }

            public final String getFirstNameKanji() {
                return this.firstNameKanji;
            }

            public final String getGender() {
                return this.gender;
            }

            public final String getIdNumber() {
                return this.idNumber;
            }

            public final String getLastName() {
                return this.lastName;
            }

            public final String getLastNameKana() {
                return this.lastNameKana;
            }

            public final String getLastNameKanji() {
                return this.lastNameKanji;
            }

            public final String getMaidenName() {
                return this.maidenName;
            }

            public final Map<String, String> getMetadata() {
                return this.metadata;
            }

            @Override // com.stripe.android.model.AccountParams.BusinessTypeParams
            public List<Pair<String, Object>> getParamsList() {
                Map<String, Object> map;
                Map<String, Object> map2;
                Map<String, Object> map3;
                Map<String, Object> map4;
                List<Pair<String, Object>> listOf;
                Pair[] pairArr = new Pair[18];
                Address address = this.address;
                Map<String, Object> map5 = null;
                if (address != null) {
                    map = address.toParamMap();
                } else {
                    map = null;
                }
                pairArr[0] = TuplesKt.m28425to("address", map);
                AddressJapanParams addressJapanParams = this.addressKana;
                if (addressJapanParams != null) {
                    map2 = addressJapanParams.toParamMap();
                } else {
                    map2 = null;
                }
                pairArr[1] = TuplesKt.m28425to(PARAM_ADDRESS_KANA, map2);
                AddressJapanParams addressJapanParams2 = this.addressKanji;
                if (addressJapanParams2 != null) {
                    map3 = addressJapanParams2.toParamMap();
                } else {
                    map3 = null;
                }
                pairArr[2] = TuplesKt.m28425to(PARAM_ADDRESS_KANJI, map3);
                DateOfBirth dateOfBirth = this.dateOfBirth;
                if (dateOfBirth != null) {
                    map4 = dateOfBirth.toParamMap();
                } else {
                    map4 = null;
                }
                pairArr[3] = TuplesKt.m28425to(PARAM_DOB, map4);
                pairArr[4] = TuplesKt.m28425to("email", this.email);
                pairArr[5] = TuplesKt.m28425to(PARAM_FIRST_NAME, this.firstName);
                pairArr[6] = TuplesKt.m28425to(PARAM_FIRST_NAME_KANA, this.firstNameKana);
                pairArr[7] = TuplesKt.m28425to(PARAM_FIRST_NAME_KANJI, this.firstNameKanji);
                pairArr[8] = TuplesKt.m28425to(PARAM_GENDER, this.gender);
                pairArr[9] = TuplesKt.m28425to(PARAM_ID_NUMBER, this.idNumber);
                pairArr[10] = TuplesKt.m28425to(PARAM_LAST_NAME, this.lastName);
                pairArr[11] = TuplesKt.m28425to(PARAM_LAST_NAME_KANA, this.lastNameKana);
                pairArr[12] = TuplesKt.m28425to(PARAM_LAST_NAME_KANJI, this.lastNameKanji);
                pairArr[13] = TuplesKt.m28425to(PARAM_MAIDEN_NAME, this.maidenName);
                pairArr[14] = TuplesKt.m28425to(PARAM_METADATA, this.metadata);
                pairArr[15] = TuplesKt.m28425to("phone", this.phone);
                pairArr[16] = TuplesKt.m28425to(PARAM_SSN_LAST_4, this.ssnLast4);
                Verification verification = this.verification;
                if (verification != null) {
                    map5 = verification.toParamMap();
                }
                pairArr[17] = TuplesKt.m28425to(PARAM_VERIFICATION, map5);
                listOf = CollectionsKt__CollectionsKt.listOf((Object[]) pairArr);
                return listOf;
            }

            public final String getPhone() {
                return this.phone;
            }

            public final String getSsnLast4() {
                return this.ssnLast4;
            }

            public final Verification getVerification() {
                return this.verification;
            }

            public int hashCode() {
                Address address = this.address;
                int hashCode = (address == null ? 0 : address.hashCode()) * 31;
                AddressJapanParams addressJapanParams = this.addressKana;
                int hashCode2 = (hashCode + (addressJapanParams == null ? 0 : addressJapanParams.hashCode())) * 31;
                AddressJapanParams addressJapanParams2 = this.addressKanji;
                int hashCode3 = (hashCode2 + (addressJapanParams2 == null ? 0 : addressJapanParams2.hashCode())) * 31;
                DateOfBirth dateOfBirth = this.dateOfBirth;
                int hashCode4 = (hashCode3 + (dateOfBirth == null ? 0 : dateOfBirth.hashCode())) * 31;
                String str = this.email;
                int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.firstName;
                int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.firstNameKana;
                int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.firstNameKanji;
                int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.gender;
                int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.idNumber;
                int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.lastName;
                int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
                String str8 = this.lastNameKana;
                int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
                String str9 = this.lastNameKanji;
                int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
                String str10 = this.maidenName;
                int hashCode14 = (hashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
                Map<String, String> map = this.metadata;
                int hashCode15 = (hashCode14 + (map == null ? 0 : map.hashCode())) * 31;
                String str11 = this.phone;
                int hashCode16 = (hashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
                String str12 = this.ssnLast4;
                int hashCode17 = (hashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
                Verification verification = this.verification;
                return hashCode17 + (verification != null ? verification.hashCode() : 0);
            }

            public final void setAddress(Address address) {
                this.address = address;
            }

            public final void setAddressKana(AddressJapanParams addressJapanParams) {
                this.addressKana = addressJapanParams;
            }

            public final void setAddressKanji(AddressJapanParams addressJapanParams) {
                this.addressKanji = addressJapanParams;
            }

            public final void setDateOfBirth(DateOfBirth dateOfBirth) {
                this.dateOfBirth = dateOfBirth;
            }

            public final void setEmail(String str) {
                this.email = str;
            }

            public final void setFirstName(String str) {
                this.firstName = str;
            }

            public final void setFirstNameKana(String str) {
                this.firstNameKana = str;
            }

            public final void setFirstNameKanji(String str) {
                this.firstNameKanji = str;
            }

            public final void setGender(String str) {
                this.gender = str;
            }

            public final void setIdNumber(String str) {
                this.idNumber = str;
            }

            public final void setLastName(String str) {
                this.lastName = str;
            }

            public final void setLastNameKana(String str) {
                this.lastNameKana = str;
            }

            public final void setLastNameKanji(String str) {
                this.lastNameKanji = str;
            }

            public final void setMaidenName(String str) {
                this.maidenName = str;
            }

            public final void setMetadata(Map<String, String> map) {
                this.metadata = map;
            }

            public final void setPhone(String str) {
                this.phone = str;
            }

            public final void setSsnLast4(String str) {
                this.ssnLast4 = str;
            }

            public final void setVerification(Verification verification) {
                this.verification = verification;
            }

            public String toString() {
                Address address = this.address;
                AddressJapanParams addressJapanParams = this.addressKana;
                AddressJapanParams addressJapanParams2 = this.addressKanji;
                DateOfBirth dateOfBirth = this.dateOfBirth;
                String str = this.email;
                String str2 = this.firstName;
                String str3 = this.firstNameKana;
                String str4 = this.firstNameKanji;
                String str5 = this.gender;
                String str6 = this.idNumber;
                String str7 = this.lastName;
                String str8 = this.lastNameKana;
                String str9 = this.lastNameKanji;
                String str10 = this.maidenName;
                Map<String, String> map = this.metadata;
                String str11 = this.phone;
                String str12 = this.ssnLast4;
                Verification verification = this.verification;
                return "Individual(address=" + address + ", addressKana=" + addressJapanParams + ", addressKanji=" + addressJapanParams2 + ", dateOfBirth=" + dateOfBirth + ", email=" + str + ", firstName=" + str2 + ", firstNameKana=" + str3 + ", firstNameKanji=" + str4 + ", gender=" + str5 + ", idNumber=" + str6 + ", lastName=" + str7 + ", lastNameKana=" + str8 + ", lastNameKanji=" + str9 + ", maidenName=" + str10 + ", metadata=" + map + ", phone=" + str11 + ", ssnLast4=" + str12 + ", verification=" + verification + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                Address address = this.address;
                if (address == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    address.writeToParcel(out, i);
                }
                AddressJapanParams addressJapanParams = this.addressKana;
                if (addressJapanParams == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    addressJapanParams.writeToParcel(out, i);
                }
                AddressJapanParams addressJapanParams2 = this.addressKanji;
                if (addressJapanParams2 == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    addressJapanParams2.writeToParcel(out, i);
                }
                DateOfBirth dateOfBirth = this.dateOfBirth;
                if (dateOfBirth == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    dateOfBirth.writeToParcel(out, i);
                }
                out.writeString(this.email);
                out.writeString(this.firstName);
                out.writeString(this.firstNameKana);
                out.writeString(this.firstNameKanji);
                out.writeString(this.gender);
                out.writeString(this.idNumber);
                out.writeString(this.lastName);
                out.writeString(this.lastNameKana);
                out.writeString(this.lastNameKanji);
                out.writeString(this.maidenName);
                Map<String, String> map = this.metadata;
                if (map == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    out.writeInt(map.size());
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        out.writeString(entry.getKey());
                        out.writeString(entry.getValue());
                    }
                }
                out.writeString(this.phone);
                out.writeString(this.ssnLast4);
                Verification verification = this.verification;
                if (verification == null) {
                    out.writeInt(0);
                    return;
                }
                out.writeInt(1);
                verification.writeToParcel(out, i);
            }

            public /* synthetic */ Individual(Address address, AddressJapanParams addressJapanParams, AddressJapanParams addressJapanParams2, DateOfBirth dateOfBirth, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Map map, String str11, String str12, Verification verification, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : address, (i & 2) != 0 ? null : addressJapanParams, (i & 4) != 0 ? null : addressJapanParams2, (i & 8) != 0 ? null : dateOfBirth, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? null : str10, (i & 16384) != 0 ? null : map, (i & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? null : str11, (i & 65536) != 0 ? null : str12, (i & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? null : verification);
            }

            public Individual(Address address, AddressJapanParams addressJapanParams, AddressJapanParams addressJapanParams2, DateOfBirth dateOfBirth, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Map<String, String> map, String str11, String str12, Verification verification) {
                super(BusinessType.Individual, null);
                this.address = address;
                this.addressKana = addressJapanParams;
                this.addressKanji = addressJapanParams2;
                this.dateOfBirth = dateOfBirth;
                this.email = str;
                this.firstName = str2;
                this.firstNameKana = str3;
                this.firstNameKanji = str4;
                this.gender = str5;
                this.idNumber = str6;
                this.lastName = str7;
                this.lastNameKana = str8;
                this.lastNameKanji = str9;
                this.maidenName = str10;
                this.metadata = map;
                this.phone = str11;
                this.ssnLast4 = str12;
                this.verification = verification;
            }
        }

        public /* synthetic */ BusinessTypeParams(BusinessType businessType, DefaultConstructorMarker defaultConstructorMarker) {
            this(businessType);
        }

        public abstract List<Pair<String, Object>> getParamsList();

        public final BusinessType getType$payments_core_release() {
            return this.type;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map<String, Object> emptyMap;
            Map map;
            emptyMap = MapsKt__MapsKt.emptyMap();
            Iterator<T> it = getParamsList().iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                String str = (String) pair.component1();
                Object component2 = pair.component2();
                if (component2 != null) {
                    map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(str, component2));
                } else {
                    map = null;
                }
                if (map == null) {
                    map = MapsKt__MapsKt.emptyMap();
                }
                emptyMap = MapsKt__MapsKt.plus(emptyMap, map);
            }
            return emptyMap;
        }

        private BusinessTypeParams(BusinessType businessType) {
            this.type = businessType;
        }
    }

    @Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/model/AccountParams$Companion;", "", "()V", "PARAM_BUSINESS_TYPE", "", "PARAM_TOS_SHOWN_AND_ACCEPTED", "create", "Lcom/stripe/android/model/AccountParams;", "tosShownAndAccepted", "", "businessType", "Lcom/stripe/android/model/AccountParams$BusinessType;", "company", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company;", "individual", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[BusinessType.values().length];
                try {
                    iArr[BusinessType.Individual.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BusinessType.Company.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final AccountParams create(boolean z, BusinessTypeParams.Individual individual) {
            Intrinsics.checkNotNullParameter(individual, "individual");
            return new AccountParams(z, individual);
        }

        private Companion() {
        }

        @JvmStatic
        public final AccountParams create(boolean z, BusinessTypeParams.Company company) {
            Intrinsics.checkNotNullParameter(company, "company");
            return new AccountParams(z, company);
        }

        @JvmStatic
        public final AccountParams create(boolean z, BusinessType businessType) {
            BusinessTypeParams individual;
            Intrinsics.checkNotNullParameter(businessType, "businessType");
            int i = WhenMappings.$EnumSwitchMapping$0[businessType.ordinal()];
            if (i == 1) {
                individual = new BusinessTypeParams.Individual(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            } else {
                individual = new BusinessTypeParams.Company(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
            }
            return new AccountParams(z, individual);
        }

        @JvmStatic
        public final AccountParams create(boolean z) {
            return new AccountParams(z, null, 2, null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<AccountParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountParams(parcel.readInt() != 0, (BusinessTypeParams) parcel.readParcelable(AccountParams.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountParams[] newArray(int i) {
            return new AccountParams[i];
        }
    }

    public /* synthetic */ AccountParams(boolean z, BusinessTypeParams businessTypeParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : businessTypeParams);
    }

    private final boolean component1() {
        return this.tosShownAndAccepted;
    }

    private final BusinessTypeParams component2() {
        return this.businessTypeParams;
    }

    public static /* synthetic */ AccountParams copy$default(AccountParams accountParams, boolean z, BusinessTypeParams businessTypeParams, int i, Object obj) {
        if ((i & 1) != 0) {
            z = accountParams.tosShownAndAccepted;
        }
        if ((i & 2) != 0) {
            businessTypeParams = accountParams.businessTypeParams;
        }
        return accountParams.copy(z, businessTypeParams);
    }

    @JvmStatic
    public static final AccountParams create(boolean z) {
        return Companion.create(z);
    }

    public final AccountParams copy(boolean z, BusinessTypeParams businessTypeParams) {
        return new AccountParams(z, businessTypeParams);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccountParams) {
            AccountParams accountParams = (AccountParams) obj;
            return this.tosShownAndAccepted == accountParams.tosShownAndAccepted && Intrinsics.areEqual(this.businessTypeParams, accountParams.businessTypeParams);
        }
        return false;
    }

    @Override // com.stripe.android.model.TokenParams
    public Map<String, Object> getTypeDataParams() {
        Map mapOf;
        Map map;
        Map<String, Object> plus;
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_TOS_SHOWN_AND_ACCEPTED, Boolean.valueOf(this.tosShownAndAccepted)));
        BusinessTypeParams businessTypeParams = this.businessTypeParams;
        if (businessTypeParams != null) {
            map = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(PARAM_BUSINESS_TYPE, businessTypeParams.getType$payments_core_release().getCode()), TuplesKt.m28425to(businessTypeParams.getType$payments_core_release().getCode(), businessTypeParams.toParamMap()));
        } else {
            map = null;
        }
        if (map == null) {
            map = MapsKt__MapsKt.emptyMap();
        }
        plus = MapsKt__MapsKt.plus(mapOf, map);
        return plus;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.tosShownAndAccepted;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        BusinessTypeParams businessTypeParams = this.businessTypeParams;
        return i + (businessTypeParams == null ? 0 : businessTypeParams.hashCode());
    }

    public String toString() {
        boolean z = this.tosShownAndAccepted;
        BusinessTypeParams businessTypeParams = this.businessTypeParams;
        return "AccountParams(tosShownAndAccepted=" + z + ", businessTypeParams=" + businessTypeParams + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.tosShownAndAccepted ? 1 : 0);
        out.writeParcelable(this.businessTypeParams, i);
    }

    public AccountParams(boolean z, BusinessTypeParams businessTypeParams) {
        super(Token.Type.Account, null, 2, null);
        this.tosShownAndAccepted = z;
        this.businessTypeParams = businessTypeParams;
    }

    @JvmStatic
    public static final AccountParams create(boolean z, BusinessType businessType) {
        return Companion.create(z, businessType);
    }

    @JvmStatic
    public static final AccountParams create(boolean z, BusinessTypeParams.Company company) {
        return Companion.create(z, company);
    }

    @JvmStatic
    public static final AccountParams create(boolean z, BusinessTypeParams.Individual individual) {
        return Companion.create(z, individual);
    }
}
