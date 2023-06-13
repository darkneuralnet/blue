package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.adyen.checkout.components.model.payments.request.BlikPaymentMethod;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.stripe.android.ObjectBuilder;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import com.stripe.android.model.parsers.PaymentMethodJsonParser;
import com.stripe.android.model.wallets.Wallet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u0000 P2\u00020\u0001:\u0010JKLMNOPQRSTUVWXYBÙ\u0001\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$¢\u0006\u0002\u0010%J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010 HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\"HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010$HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u00102J\t\u00103\u001a\u00020\u0007HÆ\u0003J\u0016\u00104\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\tHÀ\u0003¢\u0006\u0002\b5J\u000b\u00106\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0012HÆ\u0003Jê\u0001\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$HÆ\u0001¢\u0006\u0002\u0010<J\t\u0010=\u001a\u00020>HÖ\u0001J\u0013\u0010?\u001a\u00020\u00072\b\u0010@\u001a\u0004\u0018\u00010AHÖ\u0003J\b\u0010B\u001a\u00020\u0007H\u0007J\t\u0010C\u001a\u00020>HÖ\u0001J\t\u0010D\u001a\u00020\u0003HÖ\u0001J\u0019\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020>HÖ\u0001R\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\t8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010&R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010#\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006Z"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethod;", "Lcom/stripe/android/core/model/StripeModel;", "id", "", AnalyticsRequestV2.PARAM_CREATED, "", "liveMode", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "Lcom/stripe/android/model/PaymentMethodCode;", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "billingDetails", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "customerId", "card", "Lcom/stripe/android/model/PaymentMethod$Card;", "cardPresent", "Lcom/stripe/android/model/PaymentMethod$CardPresent;", "fpx", "Lcom/stripe/android/model/PaymentMethod$Fpx;", "ideal", "Lcom/stripe/android/model/PaymentMethod$Ideal;", "sepaDebit", "Lcom/stripe/android/model/PaymentMethod$SepaDebit;", "auBecsDebit", "Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;", "bacsDebit", "Lcom/stripe/android/model/PaymentMethod$BacsDebit;", "sofort", "Lcom/stripe/android/model/PaymentMethod$Sofort;", "upi", "Lcom/stripe/android/model/PaymentMethod$Upi;", "netbanking", "Lcom/stripe/android/model/PaymentMethod$Netbanking;", "usBankAccount", "Lcom/stripe/android/model/PaymentMethod$USBankAccount;", "(Ljava/lang/String;Ljava/lang/Long;ZLjava/lang/String;Lcom/stripe/android/model/PaymentMethod$Type;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$Card;Lcom/stripe/android/model/PaymentMethod$CardPresent;Lcom/stripe/android/model/PaymentMethod$Fpx;Lcom/stripe/android/model/PaymentMethod$Ideal;Lcom/stripe/android/model/PaymentMethod$SepaDebit;Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;Lcom/stripe/android/model/PaymentMethod$BacsDebit;Lcom/stripe/android/model/PaymentMethod$Sofort;Lcom/stripe/android/model/PaymentMethod$Upi;Lcom/stripe/android/model/PaymentMethod$Netbanking;Lcom/stripe/android/model/PaymentMethod$USBankAccount;)V", "Ljava/lang/Long;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "()Ljava/lang/Long;", "component3", "component4", "component4$payments_core_release", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Long;ZLjava/lang/String;Lcom/stripe/android/model/PaymentMethod$Type;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$Card;Lcom/stripe/android/model/PaymentMethod$CardPresent;Lcom/stripe/android/model/PaymentMethod$Fpx;Lcom/stripe/android/model/PaymentMethod$Ideal;Lcom/stripe/android/model/PaymentMethod$SepaDebit;Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;Lcom/stripe/android/model/PaymentMethod$BacsDebit;Lcom/stripe/android/model/PaymentMethod$Sofort;Lcom/stripe/android/model/PaymentMethod$Upi;Lcom/stripe/android/model/PaymentMethod$Netbanking;Lcom/stripe/android/model/PaymentMethod$USBankAccount;)Lcom/stripe/android/model/PaymentMethod;", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hasExpectedDetails", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "AuBecsDebit", "BacsDebit", "BillingDetails", "Builder", "Card", "CardPresent", "Companion", "Fpx", "Ideal", "Netbanking", "SepaDebit", "Sofort", "Type", "TypeData", "USBankAccount", "Upi", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PaymentMethod implements StripeModel {
    @JvmField
    public final AuBecsDebit auBecsDebit;
    @JvmField
    public final BacsDebit bacsDebit;
    @JvmField
    public final BillingDetails billingDetails;
    @JvmField
    public final Card card;
    @JvmField
    public final CardPresent cardPresent;
    @JvmField
    public final String code;
    @JvmField
    public final Long created;
    @JvmField
    public final String customerId;
    @JvmField
    public final Fpx fpx;
    @JvmField

    /* renamed from: id */
    public final String f75358id;
    @JvmField
    public final Ideal ideal;
    @JvmField
    public final boolean liveMode;
    @JvmField
    public final Netbanking netbanking;
    @JvmField
    public final SepaDebit sepaDebit;
    @JvmField
    public final Sofort sofort;
    @JvmField
    public final Type type;
    @JvmField
    public final Upi upi;
    @JvmField
    public final USBankAccount usBankAccount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PaymentMethod> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "bsbNumber", "", "fingerprint", "last4", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class AuBecsDebit extends TypeData {
        public static final int $stable = 0;
        public static final Parcelable.Creator<AuBecsDebit> CREATOR = new Creator();
        @JvmField
        public final String bsbNumber;
        @JvmField
        public final String fingerprint;
        @JvmField
        public final String last4;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<AuBecsDebit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AuBecsDebit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AuBecsDebit(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AuBecsDebit[] newArray(int i) {
                return new AuBecsDebit[i];
            }
        }

        public AuBecsDebit(String str, String str2, String str3) {
            super(null);
            this.bsbNumber = str;
            this.fingerprint = str2;
            this.last4 = str3;
        }

        public static /* synthetic */ AuBecsDebit copy$default(AuBecsDebit auBecsDebit, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = auBecsDebit.bsbNumber;
            }
            if ((i & 2) != 0) {
                str2 = auBecsDebit.fingerprint;
            }
            if ((i & 4) != 0) {
                str3 = auBecsDebit.last4;
            }
            return auBecsDebit.copy(str, str2, str3);
        }

        public final String component1() {
            return this.bsbNumber;
        }

        public final String component2() {
            return this.fingerprint;
        }

        public final String component3() {
            return this.last4;
        }

        public final AuBecsDebit copy(String str, String str2, String str3) {
            return new AuBecsDebit(str, str2, str3);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AuBecsDebit) {
                AuBecsDebit auBecsDebit = (AuBecsDebit) obj;
                return Intrinsics.areEqual(this.bsbNumber, auBecsDebit.bsbNumber) && Intrinsics.areEqual(this.fingerprint, auBecsDebit.fingerprint) && Intrinsics.areEqual(this.last4, auBecsDebit.last4);
            }
            return false;
        }

        @Override // com.stripe.android.model.PaymentMethod.TypeData
        public Type getType() {
            return Type.AuBecsDebit;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.bsbNumber;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.fingerprint;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.last4;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            String str = this.bsbNumber;
            String str2 = this.fingerprint;
            String str3 = this.last4;
            return "AuBecsDebit(bsbNumber=" + str + ", fingerprint=" + str2 + ", last4=" + str3 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.bsbNumber);
            out.writeString(this.fingerprint);
            out.writeString(this.last4);
        }
    }

    @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethod$BacsDebit;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "fingerprint", "", "last4", "sortCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class BacsDebit extends TypeData {
        public static final int $stable = 0;
        public static final Parcelable.Creator<BacsDebit> CREATOR = new Creator();
        @JvmField
        public final String fingerprint;
        @JvmField
        public final String last4;
        @JvmField
        public final String sortCode;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<BacsDebit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BacsDebit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BacsDebit(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BacsDebit[] newArray(int i) {
                return new BacsDebit[i];
            }
        }

        public BacsDebit(String str, String str2, String str3) {
            super(null);
            this.fingerprint = str;
            this.last4 = str2;
            this.sortCode = str3;
        }

        public static /* synthetic */ BacsDebit copy$default(BacsDebit bacsDebit, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bacsDebit.fingerprint;
            }
            if ((i & 2) != 0) {
                str2 = bacsDebit.last4;
            }
            if ((i & 4) != 0) {
                str3 = bacsDebit.sortCode;
            }
            return bacsDebit.copy(str, str2, str3);
        }

        public final String component1() {
            return this.fingerprint;
        }

        public final String component2() {
            return this.last4;
        }

        public final String component3() {
            return this.sortCode;
        }

        public final BacsDebit copy(String str, String str2, String str3) {
            return new BacsDebit(str, str2, str3);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BacsDebit) {
                BacsDebit bacsDebit = (BacsDebit) obj;
                return Intrinsics.areEqual(this.fingerprint, bacsDebit.fingerprint) && Intrinsics.areEqual(this.last4, bacsDebit.last4) && Intrinsics.areEqual(this.sortCode, bacsDebit.sortCode);
            }
            return false;
        }

        @Override // com.stripe.android.model.PaymentMethod.TypeData
        public Type getType() {
            return Type.BacsDebit;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.fingerprint;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.last4;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.sortCode;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            String str = this.fingerprint;
            String str2 = this.last4;
            String str3 = this.sortCode;
            return "BacsDebit(fingerprint=" + str + ", last4=" + str2 + ", sortCode=" + str3 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.fingerprint);
            out.writeString(this.last4);
            out.writeString(this.sortCode);
        }
    }

    @Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0002 !B7\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\u000b\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J9\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0014\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00140\u0019H\u0016J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0010HÖ\u0001R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "Lcom/stripe/android/core/model/StripeModel;", "Lcom/stripe/android/model/StripeParamsModel;", BillingDetails.PARAM_ADDRESS, "Lcom/stripe/android/model/Address;", "email", "", "name", BillingDetails.PARAM_PHONE, "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toBuilder", "Lcom/stripe/android/model/PaymentMethod$BillingDetails$Builder;", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class BillingDetails implements StripeModel, StripeParamsModel {
        public static final int $stable = 0;
        public static final String PARAM_ADDRESS = "address";
        public static final String PARAM_EMAIL = "email";
        public static final String PARAM_NAME = "name";
        public static final String PARAM_PHONE = "phone";
        @JvmField
        public final Address address;
        @JvmField
        public final String email;
        @JvmField
        public final String name;
        @JvmField
        public final String phone;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<BillingDetails> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethod$BillingDetails$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "()V", BillingDetails.PARAM_ADDRESS, "Lcom/stripe/android/model/Address;", "email", "", "name", BillingDetails.PARAM_PHONE, JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "setAddress", "setEmail", "setName", "setPhone", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Builder implements ObjectBuilder<BillingDetails> {
            public static final int $stable = 8;
            private Address address;
            private String email;
            private String name;
            private String phone;

            public final Builder setAddress(Address address) {
                this.address = address;
                return this;
            }

            public final Builder setEmail(String str) {
                this.email = str;
                return this;
            }

            public final Builder setName(String str) {
                this.name = str;
                return this;
            }

            public final Builder setPhone(String str) {
                this.phone = str;
                return this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.stripe.android.ObjectBuilder
            public BillingDetails build() {
                return new BillingDetails(this.address, this.email, this.name, this.phone);
            }
        }

        @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethod$BillingDetails$Companion;", "", "()V", "PARAM_ADDRESS", "", "PARAM_EMAIL", "PARAM_NAME", "PARAM_PHONE", "create", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final BillingDetails create(ShippingInformation shippingInformation) {
                Intrinsics.checkNotNullParameter(shippingInformation, "shippingInformation");
                return new BillingDetails(shippingInformation.getAddress(), null, shippingInformation.getName(), shippingInformation.getPhone(), 2, null);
            }

            private Companion() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<BillingDetails> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BillingDetails createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BillingDetails(parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BillingDetails[] newArray(int i) {
                return new BillingDetails[i];
            }
        }

        @JvmOverloads
        public BillingDetails() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ BillingDetails copy$default(BillingDetails billingDetails, Address address, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                address = billingDetails.address;
            }
            if ((i & 2) != 0) {
                str = billingDetails.email;
            }
            if ((i & 4) != 0) {
                str2 = billingDetails.name;
            }
            if ((i & 8) != 0) {
                str3 = billingDetails.phone;
            }
            return billingDetails.copy(address, str, str2, str3);
        }

        public final Address component1() {
            return this.address;
        }

        public final String component2() {
            return this.email;
        }

        public final String component3() {
            return this.name;
        }

        public final String component4() {
            return this.phone;
        }

        public final BillingDetails copy(Address address, String str, String str2, String str3) {
            return new BillingDetails(address, str, str2, str3);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BillingDetails) {
                BillingDetails billingDetails = (BillingDetails) obj;
                return Intrinsics.areEqual(this.address, billingDetails.address) && Intrinsics.areEqual(this.email, billingDetails.email) && Intrinsics.areEqual(this.name, billingDetails.name) && Intrinsics.areEqual(this.phone, billingDetails.phone);
            }
            return false;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            Address address = this.address;
            int hashCode = (address == null ? 0 : address.hashCode()) * 31;
            String str = this.email;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phone;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final Builder toBuilder() {
            return new Builder().setAddress(this.address).setEmail(this.email).setName(this.name).setPhone(this.phone);
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
            Address address = this.address;
            Map map4 = null;
            if (address != null) {
                map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_ADDRESS, address.toParamMap()));
            } else {
                map = null;
            }
            if (map == null) {
                map = MapsKt__MapsKt.emptyMap();
            }
            plus = MapsKt__MapsKt.plus(emptyMap, map);
            String str = this.email;
            if (str != null) {
                map2 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("email", str));
            } else {
                map2 = null;
            }
            if (map2 == null) {
                map2 = MapsKt__MapsKt.emptyMap();
            }
            plus2 = MapsKt__MapsKt.plus(plus, map2);
            String str2 = this.name;
            if (str2 != null) {
                map3 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("name", str2));
            } else {
                map3 = null;
            }
            if (map3 == null) {
                map3 = MapsKt__MapsKt.emptyMap();
            }
            plus3 = MapsKt__MapsKt.plus(plus2, map3);
            String str3 = this.phone;
            if (str3 != null) {
                map4 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_PHONE, str3));
            }
            if (map4 == null) {
                map4 = MapsKt__MapsKt.emptyMap();
            }
            plus4 = MapsKt__MapsKt.plus(plus3, map4);
            return plus4;
        }

        public String toString() {
            Address address = this.address;
            String str = this.email;
            String str2 = this.name;
            String str3 = this.phone;
            return "BillingDetails(address=" + address + ", email=" + str + ", name=" + str2 + ", phone=" + str3 + ")";
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
            out.writeString(this.email);
            out.writeString(this.name);
            out.writeString(this.phone);
        }

        @JvmOverloads
        public BillingDetails(Address address) {
            this(address, null, null, null, 14, null);
        }

        @JvmOverloads
        public BillingDetails(Address address, String str) {
            this(address, str, null, null, 12, null);
        }

        @JvmOverloads
        public BillingDetails(Address address, String str, String str2) {
            this(address, str, str2, null, 8, null);
        }

        @JvmOverloads
        public BillingDetails(Address address, String str, String str2, String str3) {
            this.address = address;
            this.email = str;
            this.name = str2;
            this.phone = str3;
        }

        public /* synthetic */ BillingDetails(Address address, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : address, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010*\u001a\u00020\u0002H\u0016J\u0010\u0010+\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0010\u0010,\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010-\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010.\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010/\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u00100\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0015\u00101\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u00102J\u0010\u00103\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fJ\u0010\u00104\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0010\u00105\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u000fJ\u0010\u00106\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u000e\u00107\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001bJ\u001c\u00108\u001a\u00020\u00002\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001dJ\u0010\u00109\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u0010\u0010:\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010!J\u0010\u0010;\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010#J\u0010\u0010<\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010%J\u0010\u0010=\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010)J\u0010\u0010>\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010'R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006?"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethod$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/model/PaymentMethod;", "()V", "auBecsDebit", "Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;", "bacsDebit", "Lcom/stripe/android/model/PaymentMethod$BacsDebit;", "billingDetails", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "card", "Lcom/stripe/android/model/PaymentMethod$Card;", "cardPresent", "Lcom/stripe/android/model/PaymentMethod$CardPresent;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "Lcom/stripe/android/model/PaymentMethodCode;", AnalyticsRequestV2.PARAM_CREATED, "", "Ljava/lang/Long;", "customerId", "fpx", "Lcom/stripe/android/model/PaymentMethod$Fpx;", "id", "ideal", "Lcom/stripe/android/model/PaymentMethod$Ideal;", "liveMode", "", "metadata", "", "netbanking", "Lcom/stripe/android/model/PaymentMethod$Netbanking;", "sepaDebit", "Lcom/stripe/android/model/PaymentMethod$SepaDebit;", "sofort", "Lcom/stripe/android/model/PaymentMethod$Sofort;", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "upi", "Lcom/stripe/android/model/PaymentMethod$Upi;", "usBankAccount", "Lcom/stripe/android/model/PaymentMethod$USBankAccount;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "setAuBecsDebit", "setBacsDebit", "setBillingDetails", "setCard", "setCardPresent", "setCode", "setCreated", "(Ljava/lang/Long;)Lcom/stripe/android/model/PaymentMethod$Builder;", "setCustomerId", "setFpx", "setId", "setIdeal", "setLiveMode", "setMetadata", "setNetbanking", "setSepaDebit", "setSofort", "setType", "setUSBankAccount", "setUpi", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder implements ObjectBuilder<PaymentMethod> {
        public static final int $stable = 8;
        private AuBecsDebit auBecsDebit;
        private BacsDebit bacsDebit;
        private BillingDetails billingDetails;
        private Card card;
        private CardPresent cardPresent;
        private String code;
        private Long created;
        private String customerId;
        private Fpx fpx;

        /* renamed from: id */
        private String f75359id;
        private Ideal ideal;
        private boolean liveMode;
        private Map<String, String> metadata;
        private Netbanking netbanking;
        private SepaDebit sepaDebit;
        private Sofort sofort;
        private Type type;
        private Upi upi;
        private USBankAccount usBankAccount;

        public final Builder setAuBecsDebit(AuBecsDebit auBecsDebit) {
            this.auBecsDebit = auBecsDebit;
            return this;
        }

        public final Builder setBacsDebit(BacsDebit bacsDebit) {
            this.bacsDebit = bacsDebit;
            return this;
        }

        public final Builder setBillingDetails(BillingDetails billingDetails) {
            this.billingDetails = billingDetails;
            return this;
        }

        public final Builder setCard(Card card) {
            this.card = card;
            return this;
        }

        public final Builder setCardPresent(CardPresent cardPresent) {
            this.cardPresent = cardPresent;
            return this;
        }

        public final Builder setCode(String str) {
            this.code = str;
            return this;
        }

        public final Builder setCreated(Long l) {
            this.created = l;
            return this;
        }

        public final Builder setCustomerId(String str) {
            this.customerId = str;
            return this;
        }

        public final Builder setFpx(Fpx fpx) {
            this.fpx = fpx;
            return this;
        }

        public final Builder setId(String str) {
            this.f75359id = str;
            return this;
        }

        public final Builder setIdeal(Ideal ideal) {
            this.ideal = ideal;
            return this;
        }

        public final Builder setLiveMode(boolean z) {
            this.liveMode = z;
            return this;
        }

        public final Builder setMetadata(Map<String, String> map) {
            this.metadata = map;
            return this;
        }

        public final Builder setNetbanking(Netbanking netbanking) {
            this.netbanking = netbanking;
            return this;
        }

        public final Builder setSepaDebit(SepaDebit sepaDebit) {
            this.sepaDebit = sepaDebit;
            return this;
        }

        public final Builder setSofort(Sofort sofort) {
            this.sofort = sofort;
            return this;
        }

        public final Builder setType(Type type) {
            this.type = type;
            return this;
        }

        public final Builder setUSBankAccount(USBankAccount uSBankAccount) {
            this.usBankAccount = uSBankAccount;
            return this;
        }

        public final Builder setUpi(Upi upi) {
            this.upi = upi;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.stripe.android.ObjectBuilder
        public PaymentMethod build() {
            return new PaymentMethod(this.f75359id, this.created, this.liveMode, this.code, this.type, this.billingDetails, this.customerId, this.card, this.cardPresent, this.fpx, this.ideal, this.sepaDebit, this.auBecsDebit, this.bacsDebit, this.sofort, null, this.netbanking, this.usBankAccount, DateUtils.FORMAT_ABBREV_WEEKDAY, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003456B\u0089\u0001\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0090\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u0010'J\t\u0010(\u001a\u00020\tHÖ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\tHÖ\u0001J\t\u0010.\u001a\u00020\u0007HÖ\u0001J\u0019\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\tHÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u0014\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u00067"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethod$Card;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", AccountRangeJsonParser.FIELD_BRAND, "Lcom/stripe/android/model/CardBrand;", "checks", "Lcom/stripe/android/model/PaymentMethod$Card$Checks;", "country", "", "expiryMonth", "", "expiryYear", "fingerprint", "funding", "last4", "threeDSecureUsage", "Lcom/stripe/android/model/PaymentMethod$Card$ThreeDSecureUsage;", "wallet", "Lcom/stripe/android/model/wallets/Wallet;", "networks", "Lcom/stripe/android/model/PaymentMethod$Card$Networks;", "(Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/model/PaymentMethod$Card$Checks;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$Card$ThreeDSecureUsage;Lcom/stripe/android/model/wallets/Wallet;Lcom/stripe/android/model/PaymentMethod$Card$Networks;)V", "Ljava/lang/Integer;", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "component1", "component10", "component11", "component2", "component3", "component4", "()Ljava/lang/Integer;", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/model/PaymentMethod$Card$Checks;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$Card$ThreeDSecureUsage;Lcom/stripe/android/model/wallets/Wallet;Lcom/stripe/android/model/PaymentMethod$Card$Networks;)Lcom/stripe/android/model/PaymentMethod$Card;", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Checks", "Networks", "ThreeDSecureUsage", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Card extends TypeData {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Card> CREATOR = new Creator();
        @JvmField
        public final CardBrand brand;
        @JvmField
        public final Checks checks;
        @JvmField
        public final String country;
        @JvmField
        public final Integer expiryMonth;
        @JvmField
        public final Integer expiryYear;
        @JvmField
        public final String fingerprint;
        @JvmField
        public final String funding;
        @JvmField
        public final String last4;
        @JvmField
        public final Networks networks;
        @JvmField
        public final ThreeDSecureUsage threeDSecureUsage;
        @JvmField
        public final Wallet wallet;

        @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethod$Card$Checks;", "Lcom/stripe/android/core/model/StripeModel;", "addressLine1Check", "", "addressPostalCodeCheck", "cvcCheck", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Checks implements StripeModel {
            public static final int $stable = 0;
            public static final Parcelable.Creator<Checks> CREATOR = new Creator();
            @JvmField
            public final String addressLine1Check;
            @JvmField
            public final String addressPostalCodeCheck;
            @JvmField
            public final String cvcCheck;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<Checks> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Checks createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Checks(parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Checks[] newArray(int i) {
                    return new Checks[i];
                }
            }

            public Checks(String str, String str2, String str3) {
                this.addressLine1Check = str;
                this.addressPostalCodeCheck = str2;
                this.cvcCheck = str3;
            }

            public static /* synthetic */ Checks copy$default(Checks checks, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = checks.addressLine1Check;
                }
                if ((i & 2) != 0) {
                    str2 = checks.addressPostalCodeCheck;
                }
                if ((i & 4) != 0) {
                    str3 = checks.cvcCheck;
                }
                return checks.copy(str, str2, str3);
            }

            public final String component1() {
                return this.addressLine1Check;
            }

            public final String component2() {
                return this.addressPostalCodeCheck;
            }

            public final String component3() {
                return this.cvcCheck;
            }

            public final Checks copy(String str, String str2, String str3) {
                return new Checks(str, str2, str3);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Checks) {
                    Checks checks = (Checks) obj;
                    return Intrinsics.areEqual(this.addressLine1Check, checks.addressLine1Check) && Intrinsics.areEqual(this.addressPostalCodeCheck, checks.addressPostalCodeCheck) && Intrinsics.areEqual(this.cvcCheck, checks.cvcCheck);
                }
                return false;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public int hashCode() {
                String str = this.addressLine1Check;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.addressPostalCodeCheck;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.cvcCheck;
                return hashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                String str = this.addressLine1Check;
                String str2 = this.addressPostalCodeCheck;
                String str3 = this.cvcCheck;
                return "Checks(addressLine1Check=" + str + ", addressPostalCodeCheck=" + str2 + ", cvcCheck=" + str3 + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(this.addressLine1Check);
                out.writeString(this.addressPostalCodeCheck);
                out.writeString(this.cvcCheck);
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Card> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Card(CardBrand.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Checks.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ThreeDSecureUsage.CREATOR.createFromParcel(parcel), (Wallet) parcel.readParcelable(Card.class.getClassLoader()), parcel.readInt() != 0 ? Networks.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card[] newArray(int i) {
                return new Card[i];
            }
        }

        @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\bJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J/\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001f"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethod$Card$Networks;", "Lcom/stripe/android/core/model/StripeModel;", "available", "", "", "selectionMandatory", "", "preferred", "(Ljava/util/Set;ZLjava/lang/String;)V", "getAvailable", "()Ljava/util/Set;", "getPreferred", "()Ljava/lang/String;", "getSelectionMandatory", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Networks implements StripeModel {
            public static final int $stable = 8;
            public static final Parcelable.Creator<Networks> CREATOR = new Creator();
            private final Set<String> available;
            private final String preferred;
            private final boolean selectionMandatory;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<Networks> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Networks createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i = 0; i != readInt; i++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new Networks(linkedHashSet, parcel.readInt() != 0, parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Networks[] newArray(int i) {
                    return new Networks[i];
                }
            }

            public Networks() {
                this(null, false, null, 7, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Networks copy$default(Networks networks, Set set, boolean z, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    set = networks.available;
                }
                if ((i & 2) != 0) {
                    z = networks.selectionMandatory;
                }
                if ((i & 4) != 0) {
                    str = networks.preferred;
                }
                return networks.copy(set, z, str);
            }

            public final Set<String> component1() {
                return this.available;
            }

            public final boolean component2() {
                return this.selectionMandatory;
            }

            public final String component3() {
                return this.preferred;
            }

            public final Networks copy(Set<String> available, boolean z, String str) {
                Intrinsics.checkNotNullParameter(available, "available");
                return new Networks(available, z, str);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Networks) {
                    Networks networks = (Networks) obj;
                    return Intrinsics.areEqual(this.available, networks.available) && this.selectionMandatory == networks.selectionMandatory && Intrinsics.areEqual(this.preferred, networks.preferred);
                }
                return false;
            }

            public final Set<String> getAvailable() {
                return this.available;
            }

            public final String getPreferred() {
                return this.preferred;
            }

            public final boolean getSelectionMandatory() {
                return this.selectionMandatory;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.stripe.android.core.model.StripeModel
            public int hashCode() {
                int hashCode = this.available.hashCode() * 31;
                boolean z = this.selectionMandatory;
                int i = z;
                if (z != 0) {
                    i = 1;
                }
                int i2 = (hashCode + i) * 31;
                String str = this.preferred;
                return i2 + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                Set<String> set = this.available;
                boolean z = this.selectionMandatory;
                String str = this.preferred;
                return "Networks(available=" + set + ", selectionMandatory=" + z + ", preferred=" + str + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                Set<String> set = this.available;
                out.writeInt(set.size());
                for (String str : set) {
                    out.writeString(str);
                }
                out.writeInt(this.selectionMandatory ? 1 : 0);
                out.writeString(this.preferred);
            }

            public Networks(Set<String> available, boolean z, String str) {
                Intrinsics.checkNotNullParameter(available, "available");
                this.available = available;
                this.selectionMandatory = z;
                this.preferred = str;
            }

            public /* synthetic */ Networks(Set set, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? SetsKt__SetsKt.emptySet() : set, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str);
            }
        }

        @Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\bHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bHÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethod$Card$ThreeDSecureUsage;", "Lcom/stripe/android/core/model/StripeModel;", "isSupported", "", "(Z)V", "component1", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class ThreeDSecureUsage implements StripeModel {
            public static final int $stable = 0;
            public static final Parcelable.Creator<ThreeDSecureUsage> CREATOR = new Creator();
            @JvmField
            public final boolean isSupported;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<ThreeDSecureUsage> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ThreeDSecureUsage createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ThreeDSecureUsage(parcel.readInt() != 0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ThreeDSecureUsage[] newArray(int i) {
                    return new ThreeDSecureUsage[i];
                }
            }

            public ThreeDSecureUsage(boolean z) {
                this.isSupported = z;
            }

            public static /* synthetic */ ThreeDSecureUsage copy$default(ThreeDSecureUsage threeDSecureUsage, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = threeDSecureUsage.isSupported;
                }
                return threeDSecureUsage.copy(z);
            }

            public final boolean component1() {
                return this.isSupported;
            }

            public final ThreeDSecureUsage copy(boolean z) {
                return new ThreeDSecureUsage(z);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ThreeDSecureUsage) && this.isSupported == ((ThreeDSecureUsage) obj).isSupported;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public int hashCode() {
                boolean z = this.isSupported;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            public String toString() {
                boolean z = this.isSupported;
                return "ThreeDSecureUsage(isSupported=" + z + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeInt(this.isSupported ? 1 : 0);
            }
        }

        public Card() {
            this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        }

        public final CardBrand component1() {
            return this.brand;
        }

        public final Wallet component10() {
            return this.wallet;
        }

        public final Networks component11() {
            return this.networks;
        }

        public final Checks component2() {
            return this.checks;
        }

        public final String component3() {
            return this.country;
        }

        public final Integer component4() {
            return this.expiryMonth;
        }

        public final Integer component5() {
            return this.expiryYear;
        }

        public final String component6() {
            return this.fingerprint;
        }

        public final String component7() {
            return this.funding;
        }

        public final String component8() {
            return this.last4;
        }

        public final ThreeDSecureUsage component9() {
            return this.threeDSecureUsage;
        }

        public final Card copy(CardBrand brand, Checks checks, String str, Integer num, Integer num2, String str2, String str3, String str4, ThreeDSecureUsage threeDSecureUsage, Wallet wallet, Networks networks) {
            Intrinsics.checkNotNullParameter(brand, "brand");
            return new Card(brand, checks, str, num, num2, str2, str3, str4, threeDSecureUsage, wallet, networks);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Card) {
                Card card = (Card) obj;
                return this.brand == card.brand && Intrinsics.areEqual(this.checks, card.checks) && Intrinsics.areEqual(this.country, card.country) && Intrinsics.areEqual(this.expiryMonth, card.expiryMonth) && Intrinsics.areEqual(this.expiryYear, card.expiryYear) && Intrinsics.areEqual(this.fingerprint, card.fingerprint) && Intrinsics.areEqual(this.funding, card.funding) && Intrinsics.areEqual(this.last4, card.last4) && Intrinsics.areEqual(this.threeDSecureUsage, card.threeDSecureUsage) && Intrinsics.areEqual(this.wallet, card.wallet) && Intrinsics.areEqual(this.networks, card.networks);
            }
            return false;
        }

        @Override // com.stripe.android.model.PaymentMethod.TypeData
        public Type getType() {
            return Type.Card;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            int hashCode = this.brand.hashCode() * 31;
            Checks checks = this.checks;
            int hashCode2 = (hashCode + (checks == null ? 0 : checks.hashCode())) * 31;
            String str = this.country;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.expiryMonth;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.expiryYear;
            int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str2 = this.fingerprint;
            int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.funding;
            int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.last4;
            int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            ThreeDSecureUsage threeDSecureUsage = this.threeDSecureUsage;
            int hashCode9 = (hashCode8 + (threeDSecureUsage == null ? 0 : threeDSecureUsage.hashCode())) * 31;
            Wallet wallet = this.wallet;
            int hashCode10 = (hashCode9 + (wallet == null ? 0 : wallet.hashCode())) * 31;
            Networks networks = this.networks;
            return hashCode10 + (networks != null ? networks.hashCode() : 0);
        }

        public String toString() {
            CardBrand cardBrand = this.brand;
            Checks checks = this.checks;
            String str = this.country;
            Integer num = this.expiryMonth;
            Integer num2 = this.expiryYear;
            String str2 = this.fingerprint;
            String str3 = this.funding;
            String str4 = this.last4;
            ThreeDSecureUsage threeDSecureUsage = this.threeDSecureUsage;
            Wallet wallet = this.wallet;
            Networks networks = this.networks;
            return "Card(brand=" + cardBrand + ", checks=" + checks + ", country=" + str + ", expiryMonth=" + num + ", expiryYear=" + num2 + ", fingerprint=" + str2 + ", funding=" + str3 + ", last4=" + str4 + ", threeDSecureUsage=" + threeDSecureUsage + ", wallet=" + wallet + ", networks=" + networks + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.brand.name());
            Checks checks = this.checks;
            if (checks == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                checks.writeToParcel(out, i);
            }
            out.writeString(this.country);
            Integer num = this.expiryMonth;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            Integer num2 = this.expiryYear;
            if (num2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num2.intValue());
            }
            out.writeString(this.fingerprint);
            out.writeString(this.funding);
            out.writeString(this.last4);
            ThreeDSecureUsage threeDSecureUsage = this.threeDSecureUsage;
            if (threeDSecureUsage == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                threeDSecureUsage.writeToParcel(out, i);
            }
            out.writeParcelable(this.wallet, i);
            Networks networks = this.networks;
            if (networks == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            networks.writeToParcel(out, i);
        }

        public /* synthetic */ Card(CardBrand cardBrand, Checks checks, String str, Integer num, Integer num2, String str2, String str3, String str4, ThreeDSecureUsage threeDSecureUsage, Wallet wallet, Networks networks, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CardBrand.Unknown : cardBrand, (i & 2) != 0 ? null : checks, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : threeDSecureUsage, (i & 512) != 0 ? null : wallet, (i & 1024) == 0 ? networks : null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Card(CardBrand brand, Checks checks, String str, Integer num, Integer num2, String str2, String str3, String str4, ThreeDSecureUsage threeDSecureUsage, Wallet wallet, Networks networks) {
            super(null);
            Intrinsics.checkNotNullParameter(brand, "brand");
            this.brand = brand;
            this.checks = checks;
            this.country = str;
            this.expiryMonth = num;
            this.expiryYear = num2;
            this.fingerprint = str2;
            this.funding = str3;
            this.last4 = str4;
            this.threeDSecureUsage = threeDSecureUsage;
            this.wallet = wallet;
            this.networks = networks;
        }
    }

    @Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0011\b\u0000\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\t\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\fHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethod$CardPresent;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "ignore", "", "(Z)V", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "component1", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class CardPresent extends TypeData {
        public static final int $stable = 0;
        private final boolean ignore;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<CardPresent> CREATOR = new Creator();
        private static final /* synthetic */ CardPresent EMPTY = new CardPresent(false, 1, null);

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethod$CardPresent$Companion;", "", "()V", "EMPTY", "Lcom/stripe/android/model/PaymentMethod$CardPresent;", "getEMPTY$payments_core_release", "()Lcom/stripe/android/model/PaymentMethod$CardPresent;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final CardPresent getEMPTY$payments_core_release() {
                return CardPresent.EMPTY;
            }

            private Companion() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<CardPresent> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardPresent createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardPresent(parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardPresent[] newArray(int i) {
                return new CardPresent[i];
            }
        }

        public CardPresent() {
            this(false, 1, null);
        }

        private final boolean component1() {
            return this.ignore;
        }

        public static /* synthetic */ CardPresent copy$default(CardPresent cardPresent, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = cardPresent.ignore;
            }
            return cardPresent.copy(z);
        }

        public final CardPresent copy(boolean z) {
            return new CardPresent(z);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CardPresent) && this.ignore == ((CardPresent) obj).ignore;
        }

        @Override // com.stripe.android.model.PaymentMethod.TypeData
        public Type getType() {
            return Type.CardPresent;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            boolean z = this.ignore;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            boolean z = this.ignore;
            return "CardPresent(ignore=" + z + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeInt(this.ignore ? 1 : 0);
        }

        public /* synthetic */ CardPresent(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z);
        }

        public CardPresent(boolean z) {
            super(null);
            this.ignore = z;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethod$Companion;", "", "()V", "fromJson", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethod", "Lorg/json/JSONObject;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final PaymentMethod fromJson(JSONObject jSONObject) {
            if (jSONObject != null) {
                return new PaymentMethodJsonParser().parse(jSONObject);
            }
            return null;
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<PaymentMethod> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentMethod createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentMethod(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Type.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BillingDetails.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Card.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CardPresent.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Fpx.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Ideal.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SepaDebit.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AuBecsDebit.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BacsDebit.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Sofort.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Upi.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Netbanking.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? USBankAccount.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentMethod[] newArray(int i) {
            return new PaymentMethod[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u001a"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethod$Fpx;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "bank", "", "accountHolderType", "(Ljava/lang/String;Ljava/lang/String;)V", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Fpx extends TypeData {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Fpx> CREATOR = new Creator();
        @JvmField
        public final String accountHolderType;
        @JvmField
        public final String bank;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Fpx> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Fpx createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Fpx(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Fpx[] newArray(int i) {
                return new Fpx[i];
            }
        }

        public Fpx(String str, String str2) {
            super(null);
            this.bank = str;
            this.accountHolderType = str2;
        }

        public static /* synthetic */ Fpx copy$default(Fpx fpx, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fpx.bank;
            }
            if ((i & 2) != 0) {
                str2 = fpx.accountHolderType;
            }
            return fpx.copy(str, str2);
        }

        public final String component1() {
            return this.bank;
        }

        public final String component2() {
            return this.accountHolderType;
        }

        public final Fpx copy(String str, String str2) {
            return new Fpx(str, str2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Fpx) {
                Fpx fpx = (Fpx) obj;
                return Intrinsics.areEqual(this.bank, fpx.bank) && Intrinsics.areEqual(this.accountHolderType, fpx.accountHolderType);
            }
            return false;
        }

        @Override // com.stripe.android.model.PaymentMethod.TypeData
        public Type getType() {
            return Type.Fpx;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.bank;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.accountHolderType;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.bank;
            String str2 = this.accountHolderType;
            return "Fpx(bank=" + str + ", accountHolderType=" + str2 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.bank);
            out.writeString(this.accountHolderType);
        }
    }

    @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u001a"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethod$Ideal;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "bank", "", "bankIdentifierCode", "(Ljava/lang/String;Ljava/lang/String;)V", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Ideal extends TypeData {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Ideal> CREATOR = new Creator();
        @JvmField
        public final String bank;
        @JvmField
        public final String bankIdentifierCode;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Ideal> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ideal createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Ideal(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ideal[] newArray(int i) {
                return new Ideal[i];
            }
        }

        public Ideal(String str, String str2) {
            super(null);
            this.bank = str;
            this.bankIdentifierCode = str2;
        }

        public static /* synthetic */ Ideal copy$default(Ideal ideal, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ideal.bank;
            }
            if ((i & 2) != 0) {
                str2 = ideal.bankIdentifierCode;
            }
            return ideal.copy(str, str2);
        }

        public final String component1() {
            return this.bank;
        }

        public final String component2() {
            return this.bankIdentifierCode;
        }

        public final Ideal copy(String str, String str2) {
            return new Ideal(str, str2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Ideal) {
                Ideal ideal = (Ideal) obj;
                return Intrinsics.areEqual(this.bank, ideal.bank) && Intrinsics.areEqual(this.bankIdentifierCode, ideal.bankIdentifierCode);
            }
            return false;
        }

        @Override // com.stripe.android.model.PaymentMethod.TypeData
        public Type getType() {
            return Type.Ideal;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.bank;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.bankIdentifierCode;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.bank;
            String str2 = this.bankIdentifierCode;
            return "Ideal(bank=" + str + ", bankIdentifierCode=" + str2 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.bank);
            out.writeString(this.bankIdentifierCode);
        }
    }

    @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethod$Netbanking;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "bank", "", "(Ljava/lang/String;)V", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Netbanking extends TypeData {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Netbanking> CREATOR = new Creator();
        @JvmField
        public final String bank;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Netbanking> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Netbanking createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Netbanking(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Netbanking[] newArray(int i) {
                return new Netbanking[i];
            }
        }

        public Netbanking(String str) {
            super(null);
            this.bank = str;
        }

        public static /* synthetic */ Netbanking copy$default(Netbanking netbanking, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = netbanking.bank;
            }
            return netbanking.copy(str);
        }

        public final String component1() {
            return this.bank;
        }

        public final Netbanking copy(String str) {
            return new Netbanking(str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Netbanking) && Intrinsics.areEqual(this.bank, ((Netbanking) obj).bank);
        }

        @Override // com.stripe.android.model.PaymentMethod.TypeData
        public Type getType() {
            return Type.Netbanking;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.bank;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.bank;
            return "Netbanking(bank=" + str + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.bank);
        }
    }

    @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006 "}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethod$SepaDebit;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "bankCode", "", "branchCode", "country", "fingerprint", "last4", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class SepaDebit extends TypeData {
        public static final int $stable = 0;
        public static final Parcelable.Creator<SepaDebit> CREATOR = new Creator();
        @JvmField
        public final String bankCode;
        @JvmField
        public final String branchCode;
        @JvmField
        public final String country;
        @JvmField
        public final String fingerprint;
        @JvmField
        public final String last4;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<SepaDebit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SepaDebit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SepaDebit(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SepaDebit[] newArray(int i) {
                return new SepaDebit[i];
            }
        }

        public SepaDebit(String str, String str2, String str3, String str4, String str5) {
            super(null);
            this.bankCode = str;
            this.branchCode = str2;
            this.country = str3;
            this.fingerprint = str4;
            this.last4 = str5;
        }

        public static /* synthetic */ SepaDebit copy$default(SepaDebit sepaDebit, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sepaDebit.bankCode;
            }
            if ((i & 2) != 0) {
                str2 = sepaDebit.branchCode;
            }
            String str6 = str2;
            if ((i & 4) != 0) {
                str3 = sepaDebit.country;
            }
            String str7 = str3;
            if ((i & 8) != 0) {
                str4 = sepaDebit.fingerprint;
            }
            String str8 = str4;
            if ((i & 16) != 0) {
                str5 = sepaDebit.last4;
            }
            return sepaDebit.copy(str, str6, str7, str8, str5);
        }

        public final String component1() {
            return this.bankCode;
        }

        public final String component2() {
            return this.branchCode;
        }

        public final String component3() {
            return this.country;
        }

        public final String component4() {
            return this.fingerprint;
        }

        public final String component5() {
            return this.last4;
        }

        public final SepaDebit copy(String str, String str2, String str3, String str4, String str5) {
            return new SepaDebit(str, str2, str3, str4, str5);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SepaDebit) {
                SepaDebit sepaDebit = (SepaDebit) obj;
                return Intrinsics.areEqual(this.bankCode, sepaDebit.bankCode) && Intrinsics.areEqual(this.branchCode, sepaDebit.branchCode) && Intrinsics.areEqual(this.country, sepaDebit.country) && Intrinsics.areEqual(this.fingerprint, sepaDebit.fingerprint) && Intrinsics.areEqual(this.last4, sepaDebit.last4);
            }
            return false;
        }

        @Override // com.stripe.android.model.PaymentMethod.TypeData
        public Type getType() {
            return Type.SepaDebit;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.bankCode;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.branchCode;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.country;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.fingerprint;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.last4;
            return hashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            String str = this.bankCode;
            String str2 = this.branchCode;
            String str3 = this.country;
            String str4 = this.fingerprint;
            String str5 = this.last4;
            return "SepaDebit(bankCode=" + str + ", branchCode=" + str2 + ", country=" + str3 + ", fingerprint=" + str4 + ", last4=" + str5 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.bankCode);
            out.writeString(this.branchCode);
            out.writeString(this.country);
            out.writeString(this.fingerprint);
            out.writeString(this.last4);
        }
    }

    @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethod$Sofort;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "country", "", "(Ljava/lang/String;)V", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Sofort extends TypeData {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Sofort> CREATOR = new Creator();
        @JvmField
        public final String country;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Sofort> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Sofort createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Sofort(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Sofort[] newArray(int i) {
                return new Sofort[i];
            }
        }

        public Sofort(String str) {
            super(null);
            this.country = str;
        }

        public static /* synthetic */ Sofort copy$default(Sofort sofort, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sofort.country;
            }
            return sofort.copy(str);
        }

        public final String component1() {
            return this.country;
        }

        public final Sofort copy(String str) {
            return new Sofort(str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Sofort) && Intrinsics.areEqual(this.country, ((Sofort) obj).country);
        }

        @Override // com.stripe.android.model.PaymentMethod.TypeData
        public Type getType() {
            return Type.Sofort;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.country;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.country;
            return "Sofort(country=" + str + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.country);
        }
    }

    @Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\u0001\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u00010B/\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\b\u0010\t\u001a\u00020\u0006H\u0007J\b\u0010\r\u001a\u00020\u0004H\u0016J\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\fHÖ\u0001R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/¨\u00061"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethod$Type;", "", "Landroid/os/Parcelable;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "isReusable", "", "isVoucher", "requiresMandate", "hasDelayedSettlement", "(Ljava/lang/String;ILjava/lang/String;ZZZZ)V", "describeContents", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Link", "Card", "CardPresent", "Fpx", "Ideal", "SepaDebit", "AuBecsDebit", "BacsDebit", "Sofort", "Upi", "P24", "Bancontact", "Giropay", "Eps", "Oxxo", "Alipay", "GrabPay", "PayPal", "AfterpayClearpay", "Netbanking", "Blik", "WeChatPay", "Klarna", "Affirm", "RevolutPay", "MobilePay", "Zip", "USBankAccount", "CashAppPay", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum Type implements Parcelable {
        Link("link", false, false, true, false),
        Card("card", true, false, false, false),
        CardPresent("card_present", false, false, false, false),
        Fpx("fpx", false, false, false, false),
        Ideal("ideal", false, false, true, false),
        SepaDebit("sepa_debit", false, false, true, true),
        AuBecsDebit("au_becs_debit", true, false, true, true),
        BacsDebit("bacs_debit", true, false, true, true),
        Sofort("sofort", false, false, true, true),
        Upi("upi", false, false, false, false),
        P24("p24", false, false, false, false),
        Bancontact("bancontact", false, false, true, false),
        Giropay("giropay", false, false, false, false),
        Eps("eps", false, false, true, false),
        Oxxo("oxxo", false, true, false, true),
        Alipay("alipay", false, false, false, false),
        GrabPay("grabpay", false, false, false, false),
        PayPal("paypal", false, false, false, false),
        AfterpayClearpay("afterpay_clearpay", false, false, false, false),
        Netbanking("netbanking", false, false, false, false),
        Blik(BlikPaymentMethod.PAYMENT_METHOD_TYPE, false, false, false, false),
        WeChatPay("wechat_pay", false, false, false, false),
        Klarna("klarna", false, false, false, false),
        Affirm("affirm", false, false, false, false),
        RevolutPay("revolut_pay", false, false, false, false),
        MobilePay("mobilepay", false, false, false, false),
        Zip("zip", false, false, false, false),
        USBankAccount("us_bank_account", true, false, true, true),
        CashAppPay("cashapp", false, false, false, false);
        
        @JvmField
        public final String code;
        private final boolean hasDelayedSettlement;
        @JvmField
        public final boolean isReusable;
        @JvmField
        public final boolean isVoucher;
        @JvmField
        public final boolean requiresMandate;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Type> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethod$Type$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/PaymentMethod$Type;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nPaymentMethod.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethod.kt\ncom/stripe/android/model/PaymentMethod$Type$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1017:1\n1282#2,2:1018\n*S KotlinDebug\n*F\n+ 1 PaymentMethod.kt\ncom/stripe/android/model/PaymentMethod$Type$Companion\n*L\n387#1:1018,2\n*E\n"})
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Type fromCode(String str) {
                Type[] values;
                for (Type type : Type.values()) {
                    if (Intrinsics.areEqual(type.code, str)) {
                        return type;
                    }
                }
                return null;
            }

            private Companion() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Type> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Type createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return Type.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Type[] newArray(int i) {
                return new Type[i];
            }
        }

        Type(String str, boolean z, boolean z2, boolean z3, boolean z4) {
            this.code = str;
            this.isReusable = z;
            this.isVoucher = z2;
            this.requiresMandate = z3;
            this.hasDelayedSettlement = z4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final boolean hasDelayedSettlement() {
            return this.hasDelayedSettlement;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(name());
        }
    }

    @Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u000b\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethod$TypeData;", "Lcom/stripe/android/core/model/StripeModel;", "()V", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;", "Lcom/stripe/android/model/PaymentMethod$BacsDebit;", "Lcom/stripe/android/model/PaymentMethod$Card;", "Lcom/stripe/android/model/PaymentMethod$CardPresent;", "Lcom/stripe/android/model/PaymentMethod$Fpx;", "Lcom/stripe/android/model/PaymentMethod$Ideal;", "Lcom/stripe/android/model/PaymentMethod$Netbanking;", "Lcom/stripe/android/model/PaymentMethod$SepaDebit;", "Lcom/stripe/android/model/PaymentMethod$Sofort;", "Lcom/stripe/android/model/PaymentMethod$USBankAccount;", "Lcom/stripe/android/model/PaymentMethod$Upi;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static abstract class TypeData implements StripeModel {
        public static final int $stable = 0;

        public /* synthetic */ TypeData(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract Type getType();

        private TypeData() {
        }
    }

    @Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003)*+BS\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000eJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003Je\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020\u0007HÖ\u0001J\u0019\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dHÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006,"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethod$USBankAccount;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "accountHolderType", "Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;", "accountType", "Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;", "bankName", "", "fingerprint", "last4", "linkedAccount", "networks", "Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankNetworks;", "routingNumber", "(Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankNetworks;Ljava/lang/String;)V", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "USBankAccountHolderType", "USBankAccountType", "USBankNetworks", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class USBankAccount extends TypeData {
        public static final int $stable = 8;
        public static final Parcelable.Creator<USBankAccount> CREATOR = new Creator();
        @JvmField
        public final USBankAccountHolderType accountHolderType;
        @JvmField
        public final USBankAccountType accountType;
        @JvmField
        public final String bankName;
        @JvmField
        public final String fingerprint;
        @JvmField
        public final String last4;
        @JvmField
        public final String linkedAccount;
        @JvmField
        public final USBankNetworks networks;
        @JvmField
        public final String routingNumber;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<USBankAccount> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final USBankAccount createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new USBankAccount(USBankAccountHolderType.CREATOR.createFromParcel(parcel), USBankAccountType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : USBankNetworks.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final USBankAccount[] newArray(int i) {
                return new USBankAccount[i];
            }
        }

        @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\tHÖ\u0001J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;", "", "Lcom/stripe/android/core/model/StripeModel;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "UNKNOWN", "INDIVIDUAL", "COMPANY", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public enum USBankAccountHolderType implements StripeModel {
            UNKNOWN("unknown"),
            INDIVIDUAL("individual"),
            COMPANY("company");
            
            public static final Parcelable.Creator<USBankAccountHolderType> CREATOR = new Creator();
            private final String value;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<USBankAccountHolderType> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final USBankAccountHolderType createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return USBankAccountHolderType.valueOf(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final USBankAccountHolderType[] newArray(int i) {
                    return new USBankAccountHolderType[i];
                }
            }

            USBankAccountHolderType(String str) {
                this.value = str;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String getValue() {
                return this.value;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(name());
            }
        }

        @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\tHÖ\u0001J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;", "", "Lcom/stripe/android/core/model/StripeModel;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "UNKNOWN", "CHECKING", "SAVINGS", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public enum USBankAccountType implements StripeModel {
            UNKNOWN("unknown"),
            CHECKING("checking"),
            SAVINGS("savings");
            
            public static final Parcelable.Creator<USBankAccountType> CREATOR = new Creator();
            private final String value;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<USBankAccountType> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final USBankAccountType createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return USBankAccountType.valueOf(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final USBankAccountType[] newArray(int i) {
                    return new USBankAccountType[i];
                }
            }

            USBankAccountType(String str) {
                this.value = str;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String getValue() {
                return this.value;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(name());
            }
        }

        @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J%\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankNetworks;", "Lcom/stripe/android/core/model/StripeModel;", "preferred", "", "supported", "", "(Ljava/lang/String;Ljava/util/List;)V", "getPreferred", "()Ljava/lang/String;", "getSupported", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class USBankNetworks implements StripeModel {
            public static final int $stable = 8;
            public static final Parcelable.Creator<USBankNetworks> CREATOR = new Creator();
            private final String preferred;
            private final List<String> supported;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<USBankNetworks> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final USBankNetworks createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new USBankNetworks(parcel.readString(), parcel.createStringArrayList());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final USBankNetworks[] newArray(int i) {
                    return new USBankNetworks[i];
                }
            }

            public USBankNetworks(String str, List<String> supported) {
                Intrinsics.checkNotNullParameter(supported, "supported");
                this.preferred = str;
                this.supported = supported;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ USBankNetworks copy$default(USBankNetworks uSBankNetworks, String str, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = uSBankNetworks.preferred;
                }
                if ((i & 2) != 0) {
                    list = uSBankNetworks.supported;
                }
                return uSBankNetworks.copy(str, list);
            }

            public final String component1() {
                return this.preferred;
            }

            public final List<String> component2() {
                return this.supported;
            }

            public final USBankNetworks copy(String str, List<String> supported) {
                Intrinsics.checkNotNullParameter(supported, "supported");
                return new USBankNetworks(str, supported);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof USBankNetworks) {
                    USBankNetworks uSBankNetworks = (USBankNetworks) obj;
                    return Intrinsics.areEqual(this.preferred, uSBankNetworks.preferred) && Intrinsics.areEqual(this.supported, uSBankNetworks.supported);
                }
                return false;
            }

            public final String getPreferred() {
                return this.preferred;
            }

            public final List<String> getSupported() {
                return this.supported;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public int hashCode() {
                String str = this.preferred;
                return ((str == null ? 0 : str.hashCode()) * 31) + this.supported.hashCode();
            }

            public String toString() {
                String str = this.preferred;
                List<String> list = this.supported;
                return "USBankNetworks(preferred=" + str + ", supported=" + list + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(this.preferred);
                out.writeStringList(this.supported);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public USBankAccount(USBankAccountHolderType accountHolderType, USBankAccountType accountType, String str, String str2, String str3, String str4, USBankNetworks uSBankNetworks, String str5) {
            super(null);
            Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            this.accountHolderType = accountHolderType;
            this.accountType = accountType;
            this.bankName = str;
            this.fingerprint = str2;
            this.last4 = str3;
            this.linkedAccount = str4;
            this.networks = uSBankNetworks;
            this.routingNumber = str5;
        }

        public final USBankAccountHolderType component1() {
            return this.accountHolderType;
        }

        public final USBankAccountType component2() {
            return this.accountType;
        }

        public final String component3() {
            return this.bankName;
        }

        public final String component4() {
            return this.fingerprint;
        }

        public final String component5() {
            return this.last4;
        }

        public final String component6() {
            return this.linkedAccount;
        }

        public final USBankNetworks component7() {
            return this.networks;
        }

        public final String component8() {
            return this.routingNumber;
        }

        public final USBankAccount copy(USBankAccountHolderType accountHolderType, USBankAccountType accountType, String str, String str2, String str3, String str4, USBankNetworks uSBankNetworks, String str5) {
            Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            return new USBankAccount(accountHolderType, accountType, str, str2, str3, str4, uSBankNetworks, str5);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof USBankAccount) {
                USBankAccount uSBankAccount = (USBankAccount) obj;
                return this.accountHolderType == uSBankAccount.accountHolderType && this.accountType == uSBankAccount.accountType && Intrinsics.areEqual(this.bankName, uSBankAccount.bankName) && Intrinsics.areEqual(this.fingerprint, uSBankAccount.fingerprint) && Intrinsics.areEqual(this.last4, uSBankAccount.last4) && Intrinsics.areEqual(this.linkedAccount, uSBankAccount.linkedAccount) && Intrinsics.areEqual(this.networks, uSBankAccount.networks) && Intrinsics.areEqual(this.routingNumber, uSBankAccount.routingNumber);
            }
            return false;
        }

        @Override // com.stripe.android.model.PaymentMethod.TypeData
        public Type getType() {
            return Type.USBankAccount;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            int hashCode = ((this.accountHolderType.hashCode() * 31) + this.accountType.hashCode()) * 31;
            String str = this.bankName;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.fingerprint;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.last4;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.linkedAccount;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            USBankNetworks uSBankNetworks = this.networks;
            int hashCode6 = (hashCode5 + (uSBankNetworks == null ? 0 : uSBankNetworks.hashCode())) * 31;
            String str5 = this.routingNumber;
            return hashCode6 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            USBankAccountHolderType uSBankAccountHolderType = this.accountHolderType;
            USBankAccountType uSBankAccountType = this.accountType;
            String str = this.bankName;
            String str2 = this.fingerprint;
            String str3 = this.last4;
            String str4 = this.linkedAccount;
            USBankNetworks uSBankNetworks = this.networks;
            String str5 = this.routingNumber;
            return "USBankAccount(accountHolderType=" + uSBankAccountHolderType + ", accountType=" + uSBankAccountType + ", bankName=" + str + ", fingerprint=" + str2 + ", last4=" + str3 + ", linkedAccount=" + str4 + ", networks=" + uSBankNetworks + ", routingNumber=" + str5 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.accountHolderType.writeToParcel(out, i);
            this.accountType.writeToParcel(out, i);
            out.writeString(this.bankName);
            out.writeString(this.fingerprint);
            out.writeString(this.last4);
            out.writeString(this.linkedAccount);
            USBankNetworks uSBankNetworks = this.networks;
            if (uSBankNetworks == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                uSBankNetworks.writeToParcel(out, i);
            }
            out.writeString(this.routingNumber);
        }
    }

    @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethod$Upi;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "vpa", "", "(Ljava/lang/String;)V", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Upi extends TypeData {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Upi> CREATOR = new Creator();
        @JvmField
        public final String vpa;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Upi> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Upi createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Upi(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Upi[] newArray(int i) {
                return new Upi[i];
            }
        }

        public Upi(String str) {
            super(null);
            this.vpa = str;
        }

        public static /* synthetic */ Upi copy$default(Upi upi, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = upi.vpa;
            }
            return upi.copy(str);
        }

        public final String component1() {
            return this.vpa;
        }

        public final Upi copy(String str) {
            return new Upi(str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Upi) && Intrinsics.areEqual(this.vpa, ((Upi) obj).vpa);
        }

        @Override // com.stripe.android.model.PaymentMethod.TypeData
        public Type getType() {
            return Type.Upi;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.vpa;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.vpa;
            return "Upi(vpa=" + str + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.vpa);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.Card.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.CardPresent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Type.Fpx.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Type.Ideal.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Type.SepaDebit.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Type.AuBecsDebit.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Type.BacsDebit.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Type.Sofort.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Type.USBankAccount.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PaymentMethod(String str, Long l, boolean z, String str2, Type type, BillingDetails billingDetails, String str3, Card card, CardPresent cardPresent, Fpx fpx, Ideal ideal, SepaDebit sepaDebit, AuBecsDebit auBecsDebit, BacsDebit bacsDebit, Sofort sofort, Upi upi, Netbanking netbanking, USBankAccount uSBankAccount) {
        this.f75358id = str;
        this.created = l;
        this.liveMode = z;
        this.code = str2;
        this.type = type;
        this.billingDetails = billingDetails;
        this.customerId = str3;
        this.card = card;
        this.cardPresent = cardPresent;
        this.fpx = fpx;
        this.ideal = ideal;
        this.sepaDebit = sepaDebit;
        this.auBecsDebit = auBecsDebit;
        this.bacsDebit = bacsDebit;
        this.sofort = sofort;
        this.upi = upi;
        this.netbanking = netbanking;
        this.usBankAccount = uSBankAccount;
    }

    @JvmStatic
    public static final PaymentMethod fromJson(JSONObject jSONObject) {
        return Companion.fromJson(jSONObject);
    }

    public final String component1() {
        return this.f75358id;
    }

    public final Fpx component10() {
        return this.fpx;
    }

    public final Ideal component11() {
        return this.ideal;
    }

    public final SepaDebit component12() {
        return this.sepaDebit;
    }

    public final AuBecsDebit component13() {
        return this.auBecsDebit;
    }

    public final BacsDebit component14() {
        return this.bacsDebit;
    }

    public final Sofort component15() {
        return this.sofort;
    }

    public final Upi component16() {
        return this.upi;
    }

    public final Netbanking component17() {
        return this.netbanking;
    }

    public final USBankAccount component18() {
        return this.usBankAccount;
    }

    public final Long component2() {
        return this.created;
    }

    public final boolean component3() {
        return this.liveMode;
    }

    public final String component4$payments_core_release() {
        return this.code;
    }

    public final Type component5() {
        return this.type;
    }

    public final BillingDetails component6() {
        return this.billingDetails;
    }

    public final String component7() {
        return this.customerId;
    }

    public final Card component8() {
        return this.card;
    }

    public final CardPresent component9() {
        return this.cardPresent;
    }

    public final PaymentMethod copy(String str, Long l, boolean z, String str2, Type type, BillingDetails billingDetails, String str3, Card card, CardPresent cardPresent, Fpx fpx, Ideal ideal, SepaDebit sepaDebit, AuBecsDebit auBecsDebit, BacsDebit bacsDebit, Sofort sofort, Upi upi, Netbanking netbanking, USBankAccount uSBankAccount) {
        return new PaymentMethod(str, l, z, str2, type, billingDetails, str3, card, cardPresent, fpx, ideal, sepaDebit, auBecsDebit, bacsDebit, sofort, upi, netbanking, uSBankAccount);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentMethod) {
            PaymentMethod paymentMethod = (PaymentMethod) obj;
            return Intrinsics.areEqual(this.f75358id, paymentMethod.f75358id) && Intrinsics.areEqual(this.created, paymentMethod.created) && this.liveMode == paymentMethod.liveMode && Intrinsics.areEqual(this.code, paymentMethod.code) && this.type == paymentMethod.type && Intrinsics.areEqual(this.billingDetails, paymentMethod.billingDetails) && Intrinsics.areEqual(this.customerId, paymentMethod.customerId) && Intrinsics.areEqual(this.card, paymentMethod.card) && Intrinsics.areEqual(this.cardPresent, paymentMethod.cardPresent) && Intrinsics.areEqual(this.fpx, paymentMethod.fpx) && Intrinsics.areEqual(this.ideal, paymentMethod.ideal) && Intrinsics.areEqual(this.sepaDebit, paymentMethod.sepaDebit) && Intrinsics.areEqual(this.auBecsDebit, paymentMethod.auBecsDebit) && Intrinsics.areEqual(this.bacsDebit, paymentMethod.bacsDebit) && Intrinsics.areEqual(this.sofort, paymentMethod.sofort) && Intrinsics.areEqual(this.upi, paymentMethod.upi) && Intrinsics.areEqual(this.netbanking, paymentMethod.netbanking) && Intrinsics.areEqual(this.usBankAccount, paymentMethod.usBankAccount);
        }
        return false;
    }

    public final boolean hasExpectedDetails() {
        int i;
        Type type = this.type;
        if (type == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        }
        switch (i) {
            case 1:
                if (this.card == null) {
                    return false;
                }
                break;
            case 2:
                if (this.cardPresent == null) {
                    return false;
                }
                break;
            case 3:
                if (this.fpx == null) {
                    return false;
                }
                break;
            case 4:
                if (this.ideal == null) {
                    return false;
                }
                break;
            case 5:
                if (this.sepaDebit == null) {
                    return false;
                }
                break;
            case 6:
                if (this.auBecsDebit == null) {
                    return false;
                }
                break;
            case 7:
                if (this.bacsDebit == null) {
                    return false;
                }
                break;
            case 8:
                if (this.sofort == null) {
                    return false;
                }
                break;
            case 9:
                if (this.usBankAccount == null) {
                    return false;
                }
                break;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        String str = this.f75358id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.created;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        boolean z = this.liveMode;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        String str2 = this.code;
        int hashCode3 = (i2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Type type = this.type;
        int hashCode4 = (hashCode3 + (type == null ? 0 : type.hashCode())) * 31;
        BillingDetails billingDetails = this.billingDetails;
        int hashCode5 = (hashCode4 + (billingDetails == null ? 0 : billingDetails.hashCode())) * 31;
        String str3 = this.customerId;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Card card = this.card;
        int hashCode7 = (hashCode6 + (card == null ? 0 : card.hashCode())) * 31;
        CardPresent cardPresent = this.cardPresent;
        int hashCode8 = (hashCode7 + (cardPresent == null ? 0 : cardPresent.hashCode())) * 31;
        Fpx fpx = this.fpx;
        int hashCode9 = (hashCode8 + (fpx == null ? 0 : fpx.hashCode())) * 31;
        Ideal ideal = this.ideal;
        int hashCode10 = (hashCode9 + (ideal == null ? 0 : ideal.hashCode())) * 31;
        SepaDebit sepaDebit = this.sepaDebit;
        int hashCode11 = (hashCode10 + (sepaDebit == null ? 0 : sepaDebit.hashCode())) * 31;
        AuBecsDebit auBecsDebit = this.auBecsDebit;
        int hashCode12 = (hashCode11 + (auBecsDebit == null ? 0 : auBecsDebit.hashCode())) * 31;
        BacsDebit bacsDebit = this.bacsDebit;
        int hashCode13 = (hashCode12 + (bacsDebit == null ? 0 : bacsDebit.hashCode())) * 31;
        Sofort sofort = this.sofort;
        int hashCode14 = (hashCode13 + (sofort == null ? 0 : sofort.hashCode())) * 31;
        Upi upi = this.upi;
        int hashCode15 = (hashCode14 + (upi == null ? 0 : upi.hashCode())) * 31;
        Netbanking netbanking = this.netbanking;
        int hashCode16 = (hashCode15 + (netbanking == null ? 0 : netbanking.hashCode())) * 31;
        USBankAccount uSBankAccount = this.usBankAccount;
        return hashCode16 + (uSBankAccount != null ? uSBankAccount.hashCode() : 0);
    }

    public String toString() {
        String str = this.f75358id;
        Long l = this.created;
        boolean z = this.liveMode;
        String str2 = this.code;
        Type type = this.type;
        BillingDetails billingDetails = this.billingDetails;
        String str3 = this.customerId;
        Card card = this.card;
        CardPresent cardPresent = this.cardPresent;
        Fpx fpx = this.fpx;
        Ideal ideal = this.ideal;
        SepaDebit sepaDebit = this.sepaDebit;
        AuBecsDebit auBecsDebit = this.auBecsDebit;
        BacsDebit bacsDebit = this.bacsDebit;
        Sofort sofort = this.sofort;
        Upi upi = this.upi;
        Netbanking netbanking = this.netbanking;
        USBankAccount uSBankAccount = this.usBankAccount;
        return "PaymentMethod(id=" + str + ", created=" + l + ", liveMode=" + z + ", code=" + str2 + ", type=" + type + ", billingDetails=" + billingDetails + ", customerId=" + str3 + ", card=" + card + ", cardPresent=" + cardPresent + ", fpx=" + fpx + ", ideal=" + ideal + ", sepaDebit=" + sepaDebit + ", auBecsDebit=" + auBecsDebit + ", bacsDebit=" + bacsDebit + ", sofort=" + sofort + ", upi=" + upi + ", netbanking=" + netbanking + ", usBankAccount=" + uSBankAccount + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f75358id);
        Long l = this.created;
        if (l == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l.longValue());
        }
        out.writeInt(this.liveMode ? 1 : 0);
        out.writeString(this.code);
        Type type = this.type;
        if (type == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            type.writeToParcel(out, i);
        }
        BillingDetails billingDetails = this.billingDetails;
        if (billingDetails == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            billingDetails.writeToParcel(out, i);
        }
        out.writeString(this.customerId);
        Card card = this.card;
        if (card == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            card.writeToParcel(out, i);
        }
        CardPresent cardPresent = this.cardPresent;
        if (cardPresent == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            cardPresent.writeToParcel(out, i);
        }
        Fpx fpx = this.fpx;
        if (fpx == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            fpx.writeToParcel(out, i);
        }
        Ideal ideal = this.ideal;
        if (ideal == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            ideal.writeToParcel(out, i);
        }
        SepaDebit sepaDebit = this.sepaDebit;
        if (sepaDebit == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            sepaDebit.writeToParcel(out, i);
        }
        AuBecsDebit auBecsDebit = this.auBecsDebit;
        if (auBecsDebit == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            auBecsDebit.writeToParcel(out, i);
        }
        BacsDebit bacsDebit = this.bacsDebit;
        if (bacsDebit == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            bacsDebit.writeToParcel(out, i);
        }
        Sofort sofort = this.sofort;
        if (sofort == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            sofort.writeToParcel(out, i);
        }
        Upi upi = this.upi;
        if (upi == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            upi.writeToParcel(out, i);
        }
        Netbanking netbanking = this.netbanking;
        if (netbanking == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            netbanking.writeToParcel(out, i);
        }
        USBankAccount uSBankAccount = this.usBankAccount;
        if (uSBankAccount == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        uSBankAccount.writeToParcel(out, i);
    }

    public /* synthetic */ PaymentMethod(String str, Long l, boolean z, String str2, Type type, BillingDetails billingDetails, String str3, Card card, CardPresent cardPresent, Fpx fpx, Ideal ideal, SepaDebit sepaDebit, AuBecsDebit auBecsDebit, BacsDebit bacsDebit, Sofort sofort, Upi upi, Netbanking netbanking, USBankAccount uSBankAccount, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l, z, str2, type, (i & 32) != 0 ? null : billingDetails, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : card, (i & 256) != 0 ? null : cardPresent, (i & 512) != 0 ? null : fpx, (i & 1024) != 0 ? null : ideal, (i & 2048) != 0 ? null : sepaDebit, (i & 4096) != 0 ? null : auBecsDebit, (i & 8192) != 0 ? null : bacsDebit, (i & 16384) != 0 ? null : sofort, (32768 & i) != 0 ? null : upi, (65536 & i) != 0 ? null : netbanking, (i & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? null : uSBankAccount);
    }
}
