package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002/0BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\fHÆ\u0003JS\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\fHÆ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020!HÖ\u0001J\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010%0(J\t\u0010)\u001a\u00020\tHÖ\u0001J\u0019\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020!HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u00061"}, m28432d2 = {"Lcom/stripe/android/model/DeferredIntentParams;", "Lcom/stripe/android/core/model/StripeModel;", "mode", "Lcom/stripe/android/model/DeferredIntentParams$Mode;", "setupFutureUsage", "Lcom/stripe/android/model/StripeIntent$Usage;", "captureMethod", "Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;", PaymentSheetEvent.FIELD_CUSTOMER, "", "onBehalfOf", "paymentMethodTypes", "", "(Lcom/stripe/android/model/DeferredIntentParams$Mode;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "getCaptureMethod", "()Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;", "getCustomer", "()Ljava/lang/String;", "getMode", "()Lcom/stripe/android/model/DeferredIntentParams$Mode;", "getOnBehalfOf", "getPaymentMethodTypes", "()Ljava/util/Set;", "getSetupFutureUsage", "()Lcom/stripe/android/model/StripeIntent$Usage;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toQueryParams", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "CaptureMethod", "Mode", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nDeferredIntentParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeferredIntentParams.kt\ncom/stripe/android/model/DeferredIntentParams\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,62:1\n1559#2:63\n1590#2,4:64\n*S KotlinDebug\n*F\n+ 1 DeferredIntentParams.kt\ncom/stripe/android/model/DeferredIntentParams\n*L\n57#1:63\n57#1:64,4\n*E\n"})
/* loaded from: classes7.dex */
public final class DeferredIntentParams implements StripeModel {
    public static final int $stable = 8;
    public static final Parcelable.Creator<DeferredIntentParams> CREATOR = new Creator();
    private final CaptureMethod captureMethod;
    private final String customer;
    private final Mode mode;
    private final String onBehalfOf;
    private final Set<String> paymentMethodTypes;
    private final StripeIntent.Usage setupFutureUsage;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "Manual", "Automatic", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum CaptureMethod {
        Manual("manual"),
        Automatic("automatic");
        
        private final String code;

        CaptureMethod(String str) {
            this.code = str;
        }

        public final String getCode() {
            return this.code;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<DeferredIntentParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeferredIntentParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Mode mode = (Mode) parcel.readParcelable(DeferredIntentParams.class.getClassLoader());
            StripeIntent.Usage valueOf = parcel.readInt() == 0 ? null : StripeIntent.Usage.valueOf(parcel.readString());
            CaptureMethod valueOf2 = parcel.readInt() == 0 ? null : CaptureMethod.valueOf(parcel.readString());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashSet.add(parcel.readString());
            }
            return new DeferredIntentParams(mode, valueOf, valueOf2, readString, readString2, linkedHashSet);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeferredIntentParams[] newArray(int i) {
            return new DeferredIntentParams[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/model/DeferredIntentParams$Mode;", "Landroid/os/Parcelable;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "getCode", "()Ljava/lang/String;", "Payment", "Setup", "Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;", "Lcom/stripe/android/model/DeferredIntentParams$Mode$Setup;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public interface Mode extends Parcelable {

        @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u001d"}, m28432d2 = {"Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;", "Lcom/stripe/android/model/DeferredIntentParams$Mode;", "amount", "", "currency", "", "(JLjava/lang/String;)V", "getAmount", "()J", PaymentMethodOptionsParams.Blik.PARAM_CODE, "getCode", "()Ljava/lang/String;", "getCurrency", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Payment implements Mode {
            public static final int $stable = 0;
            public static final Parcelable.Creator<Payment> CREATOR = new Creator();
            private final long amount;
            private final String currency;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<Payment> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Payment createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Payment(parcel.readLong(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Payment[] newArray(int i) {
                    return new Payment[i];
                }
            }

            public Payment(long j, String currency) {
                Intrinsics.checkNotNullParameter(currency, "currency");
                this.amount = j;
                this.currency = currency;
            }

            public static /* synthetic */ Payment copy$default(Payment payment, long j, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = payment.amount;
                }
                if ((i & 2) != 0) {
                    str = payment.currency;
                }
                return payment.copy(j, str);
            }

            public final long component1() {
                return this.amount;
            }

            public final String component2() {
                return this.currency;
            }

            public final Payment copy(long j, String currency) {
                Intrinsics.checkNotNullParameter(currency, "currency");
                return new Payment(j, currency);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Payment) {
                    Payment payment = (Payment) obj;
                    return this.amount == payment.amount && Intrinsics.areEqual(this.currency, payment.currency);
                }
                return false;
            }

            public final long getAmount() {
                return this.amount;
            }

            @Override // com.stripe.android.model.DeferredIntentParams.Mode
            public String getCode() {
                return "payment";
            }

            public final String getCurrency() {
                return this.currency;
            }

            public int hashCode() {
                return (Long.hashCode(this.amount) * 31) + this.currency.hashCode();
            }

            public String toString() {
                long j = this.amount;
                String str = this.currency;
                return "Payment(amount=" + j + ", currency=" + str + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeLong(this.amount);
                out.writeString(this.currency);
            }
        }

        @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/model/DeferredIntentParams$Mode$Setup;", "Lcom/stripe/android/model/DeferredIntentParams$Mode;", "currency", "", "(Ljava/lang/String;)V", PaymentMethodOptionsParams.Blik.PARAM_CODE, "getCode", "()Ljava/lang/String;", "getCurrency", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Setup implements Mode {
            public static final int $stable = 0;
            public static final Parcelable.Creator<Setup> CREATOR = new Creator();
            private final String currency;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<Setup> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Setup createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Setup(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Setup[] newArray(int i) {
                    return new Setup[i];
                }
            }

            public Setup(String str) {
                this.currency = str;
            }

            public static /* synthetic */ Setup copy$default(Setup setup, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = setup.currency;
                }
                return setup.copy(str);
            }

            public final String component1() {
                return this.currency;
            }

            public final Setup copy(String str) {
                return new Setup(str);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Setup) && Intrinsics.areEqual(this.currency, ((Setup) obj).currency);
            }

            @Override // com.stripe.android.model.DeferredIntentParams.Mode
            public String getCode() {
                return "setup";
            }

            public final String getCurrency() {
                return this.currency;
            }

            public int hashCode() {
                String str = this.currency;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                String str = this.currency;
                return "Setup(currency=" + str + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(this.currency);
            }
        }

        String getCode();
    }

    public DeferredIntentParams(Mode mode, StripeIntent.Usage usage, CaptureMethod captureMethod, String str, String str2, Set<String> paymentMethodTypes) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(paymentMethodTypes, "paymentMethodTypes");
        this.mode = mode;
        this.setupFutureUsage = usage;
        this.captureMethod = captureMethod;
        this.customer = str;
        this.onBehalfOf = str2;
        this.paymentMethodTypes = paymentMethodTypes;
    }

    public static /* synthetic */ DeferredIntentParams copy$default(DeferredIntentParams deferredIntentParams, Mode mode, StripeIntent.Usage usage, CaptureMethod captureMethod, String str, String str2, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            mode = deferredIntentParams.mode;
        }
        if ((i & 2) != 0) {
            usage = deferredIntentParams.setupFutureUsage;
        }
        StripeIntent.Usage usage2 = usage;
        if ((i & 4) != 0) {
            captureMethod = deferredIntentParams.captureMethod;
        }
        CaptureMethod captureMethod2 = captureMethod;
        if ((i & 8) != 0) {
            str = deferredIntentParams.customer;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = deferredIntentParams.onBehalfOf;
        }
        String str4 = str2;
        Set<String> set2 = set;
        if ((i & 32) != 0) {
            set2 = deferredIntentParams.paymentMethodTypes;
        }
        return deferredIntentParams.copy(mode, usage2, captureMethod2, str3, str4, set2);
    }

    public final Mode component1() {
        return this.mode;
    }

    public final StripeIntent.Usage component2() {
        return this.setupFutureUsage;
    }

    public final CaptureMethod component3() {
        return this.captureMethod;
    }

    public final String component4() {
        return this.customer;
    }

    public final String component5() {
        return this.onBehalfOf;
    }

    public final Set<String> component6() {
        return this.paymentMethodTypes;
    }

    public final DeferredIntentParams copy(Mode mode, StripeIntent.Usage usage, CaptureMethod captureMethod, String str, String str2, Set<String> paymentMethodTypes) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(paymentMethodTypes, "paymentMethodTypes");
        return new DeferredIntentParams(mode, usage, captureMethod, str, str2, paymentMethodTypes);
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
        if (obj instanceof DeferredIntentParams) {
            DeferredIntentParams deferredIntentParams = (DeferredIntentParams) obj;
            return Intrinsics.areEqual(this.mode, deferredIntentParams.mode) && this.setupFutureUsage == deferredIntentParams.setupFutureUsage && this.captureMethod == deferredIntentParams.captureMethod && Intrinsics.areEqual(this.customer, deferredIntentParams.customer) && Intrinsics.areEqual(this.onBehalfOf, deferredIntentParams.onBehalfOf) && Intrinsics.areEqual(this.paymentMethodTypes, deferredIntentParams.paymentMethodTypes);
        }
        return false;
    }

    public final CaptureMethod getCaptureMethod() {
        return this.captureMethod;
    }

    public final String getCustomer() {
        return this.customer;
    }

    public final Mode getMode() {
        return this.mode;
    }

    public final String getOnBehalfOf() {
        return this.onBehalfOf;
    }

    public final Set<String> getPaymentMethodTypes() {
        return this.paymentMethodTypes;
    }

    public final StripeIntent.Usage getSetupFutureUsage() {
        return this.setupFutureUsage;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int hashCode = this.mode.hashCode() * 31;
        StripeIntent.Usage usage = this.setupFutureUsage;
        int hashCode2 = (hashCode + (usage == null ? 0 : usage.hashCode())) * 31;
        CaptureMethod captureMethod = this.captureMethod;
        int hashCode3 = (hashCode2 + (captureMethod == null ? 0 : captureMethod.hashCode())) * 31;
        String str = this.customer;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.onBehalfOf;
        return ((hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.paymentMethodTypes.hashCode();
    }

    public final Map<String, Object> toQueryParams() {
        Mode.Payment payment;
        Long l;
        Mode.Payment payment2;
        String str;
        String str2;
        Map mapOf;
        int collectionSizeOrDefault;
        Map<String, Object> plus;
        Pair[] pairArr = new Pair[7];
        int i = 0;
        pairArr[0] = TuplesKt.m28425to("deferred_intent[mode]", this.mode.getCode());
        Mode mode = this.mode;
        String str3 = null;
        if (mode instanceof Mode.Payment) {
            payment = (Mode.Payment) mode;
        } else {
            payment = null;
        }
        if (payment != null) {
            l = Long.valueOf(payment.getAmount());
        } else {
            l = null;
        }
        pairArr[1] = TuplesKt.m28425to("deferred_intent[amount]", l);
        Mode mode2 = this.mode;
        if (mode2 instanceof Mode.Payment) {
            payment2 = (Mode.Payment) mode2;
        } else {
            payment2 = null;
        }
        if (payment2 != null) {
            str = payment2.getCurrency();
        } else {
            str = null;
        }
        pairArr[2] = TuplesKt.m28425to("deferred_intent[currency]", str);
        StripeIntent.Usage usage = this.setupFutureUsage;
        if (usage != null) {
            str2 = usage.getCode();
        } else {
            str2 = null;
        }
        pairArr[3] = TuplesKt.m28425to("deferred_intent[setup_future_usage]", str2);
        CaptureMethod captureMethod = this.captureMethod;
        if (captureMethod != null) {
            str3 = captureMethod.getCode();
        }
        pairArr[4] = TuplesKt.m28425to("deferred_intent[capture_method]", str3);
        pairArr[5] = TuplesKt.m28425to("deferred_intent[customer]", this.customer);
        pairArr[6] = TuplesKt.m28425to("deferred_intent[on_behalf_of]", this.onBehalfOf);
        mapOf = MapsKt__MapsKt.mapOf(pairArr);
        Set<String> set = this.paymentMethodTypes;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Object obj : set) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(TuplesKt.m28425to("deferred_intent[payment_method_types][" + i + "]", (String) obj));
            i = i2;
        }
        plus = MapsKt__MapsKt.plus(mapOf, arrayList);
        return plus;
    }

    public String toString() {
        Mode mode = this.mode;
        StripeIntent.Usage usage = this.setupFutureUsage;
        CaptureMethod captureMethod = this.captureMethod;
        String str = this.customer;
        String str2 = this.onBehalfOf;
        Set<String> set = this.paymentMethodTypes;
        return "DeferredIntentParams(mode=" + mode + ", setupFutureUsage=" + usage + ", captureMethod=" + captureMethod + ", customer=" + str + ", onBehalfOf=" + str2 + ", paymentMethodTypes=" + set + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeParcelable(this.mode, i);
        StripeIntent.Usage usage = this.setupFutureUsage;
        if (usage == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(usage.name());
        }
        CaptureMethod captureMethod = this.captureMethod;
        if (captureMethod == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(captureMethod.name());
        }
        out.writeString(this.customer);
        out.writeString(this.onBehalfOf);
        Set<String> set = this.paymentMethodTypes;
        out.writeInt(set.size());
        for (String str : set) {
            out.writeString(str);
        }
    }

    public /* synthetic */ DeferredIntentParams(Mode mode, StripeIntent.Usage usage, CaptureMethod captureMethod, String str, String str2, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(mode, (i & 2) != 0 ? null : usage, (i & 4) != 0 ? null : captureMethod, (i & 8) != 0 ? null : str, (i & 16) == 0 ? str2 : null, (i & 32) != 0 ? SetsKt__SetsKt.emptySet() : set);
    }
}
