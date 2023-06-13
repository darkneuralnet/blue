package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005\u0082\u0001\u0003\u0011\u0012\u0013¨\u0006\u0014"}, m28432d2 = {"Lcom/stripe/android/model/ElementsSessionParams;", "Landroid/os/Parcelable;", "clientSecret", "", "getClientSecret", "()Ljava/lang/String;", "expandFields", "", "getExpandFields", "()Ljava/util/List;", "locale", "getLocale", "type", "getType", "DeferredIntentType", "PaymentIntentType", "SetupIntentType", "Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;", "Lcom/stripe/android/model/ElementsSessionParams$PaymentIntentType;", "Lcom/stripe/android/model/ElementsSessionParams$SetupIntentType;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public interface ElementsSessionParams extends Parcelable {
    String getClientSecret();

    List<String> getExpandFields();

    String getLocale();

    String getType();

    @Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\t¨\u0006#"}, m28432d2 = {"Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;", "Lcom/stripe/android/model/ElementsSessionParams;", "locale", "", "deferredIntentParams", "Lcom/stripe/android/model/DeferredIntentParams;", "(Ljava/lang/String;Lcom/stripe/android/model/DeferredIntentParams;)V", "clientSecret", "getClientSecret", "()Ljava/lang/String;", "getDeferredIntentParams", "()Lcom/stripe/android/model/DeferredIntentParams;", "expandFields", "", "getExpandFields", "()Ljava/util/List;", "getLocale", "type", "getType", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class DeferredIntentType implements ElementsSessionParams {
        public static final int $stable = 8;
        public static final Parcelable.Creator<DeferredIntentType> CREATOR = new Creator();
        private final DeferredIntentParams deferredIntentParams;
        private final String locale;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<DeferredIntentType> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DeferredIntentType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeferredIntentType(parcel.readString(), DeferredIntentParams.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DeferredIntentType[] newArray(int i) {
                return new DeferredIntentType[i];
            }
        }

        public DeferredIntentType(String str, DeferredIntentParams deferredIntentParams) {
            Intrinsics.checkNotNullParameter(deferredIntentParams, "deferredIntentParams");
            this.locale = str;
            this.deferredIntentParams = deferredIntentParams;
        }

        public static /* synthetic */ DeferredIntentType copy$default(DeferredIntentType deferredIntentType, String str, DeferredIntentParams deferredIntentParams, int i, Object obj) {
            if ((i & 1) != 0) {
                str = deferredIntentType.getLocale();
            }
            if ((i & 2) != 0) {
                deferredIntentParams = deferredIntentType.deferredIntentParams;
            }
            return deferredIntentType.copy(str, deferredIntentParams);
        }

        public final String component1() {
            return getLocale();
        }

        public final DeferredIntentParams component2() {
            return this.deferredIntentParams;
        }

        public final DeferredIntentType copy(String str, DeferredIntentParams deferredIntentParams) {
            Intrinsics.checkNotNullParameter(deferredIntentParams, "deferredIntentParams");
            return new DeferredIntentType(str, deferredIntentParams);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof DeferredIntentType) {
                DeferredIntentType deferredIntentType = (DeferredIntentType) obj;
                return Intrinsics.areEqual(getLocale(), deferredIntentType.getLocale()) && Intrinsics.areEqual(this.deferredIntentParams, deferredIntentType.deferredIntentParams);
            }
            return false;
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public String getClientSecret() {
            return null;
        }

        public final DeferredIntentParams getDeferredIntentParams() {
            return this.deferredIntentParams;
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public List<String> getExpandFields() {
            List<String> emptyList;
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public String getLocale() {
            return this.locale;
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public String getType() {
            return "deferred_intent";
        }

        public int hashCode() {
            return ((getLocale() == null ? 0 : getLocale().hashCode()) * 31) + this.deferredIntentParams.hashCode();
        }

        public String toString() {
            String locale = getLocale();
            DeferredIntentParams deferredIntentParams = this.deferredIntentParams;
            return "DeferredIntentType(locale=" + locale + ", deferredIntentParams=" + deferredIntentParams + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.locale);
            this.deferredIntentParams.writeToParcel(out, i);
        }

        public /* synthetic */ DeferredIntentType(String str, DeferredIntentParams deferredIntentParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Locale.getDefault().toLanguageTag() : str, deferredIntentParams);
        }
    }

    @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0007¨\u0006\u001f"}, m28432d2 = {"Lcom/stripe/android/model/ElementsSessionParams$PaymentIntentType;", "Lcom/stripe/android/model/ElementsSessionParams;", "clientSecret", "", "locale", "(Ljava/lang/String;Ljava/lang/String;)V", "getClientSecret", "()Ljava/lang/String;", "expandFields", "", "getExpandFields", "()Ljava/util/List;", "getLocale", "type", "getType", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class PaymentIntentType implements ElementsSessionParams {
        public static final int $stable = 0;
        public static final Parcelable.Creator<PaymentIntentType> CREATOR = new Creator();
        private final String clientSecret;
        private final String locale;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<PaymentIntentType> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentIntentType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentIntentType(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentIntentType[] newArray(int i) {
                return new PaymentIntentType[i];
            }
        }

        public PaymentIntentType(String clientSecret, String str) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            this.locale = str;
        }

        public static /* synthetic */ PaymentIntentType copy$default(PaymentIntentType paymentIntentType, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = paymentIntentType.getClientSecret();
            }
            if ((i & 2) != 0) {
                str2 = paymentIntentType.getLocale();
            }
            return paymentIntentType.copy(str, str2);
        }

        public final String component1() {
            return getClientSecret();
        }

        public final String component2() {
            return getLocale();
        }

        public final PaymentIntentType copy(String clientSecret, String str) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return new PaymentIntentType(clientSecret, str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PaymentIntentType) {
                PaymentIntentType paymentIntentType = (PaymentIntentType) obj;
                return Intrinsics.areEqual(getClientSecret(), paymentIntentType.getClientSecret()) && Intrinsics.areEqual(getLocale(), paymentIntentType.getLocale());
            }
            return false;
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public String getClientSecret() {
            return this.clientSecret;
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public List<String> getExpandFields() {
            List<String> listOf;
            String type = getType();
            listOf = CollectionsKt__CollectionsJVMKt.listOf("payment_method_preference." + type + ".payment_method");
            return listOf;
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public String getLocale() {
            return this.locale;
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public String getType() {
            return "payment_intent";
        }

        public int hashCode() {
            return (getClientSecret().hashCode() * 31) + (getLocale() == null ? 0 : getLocale().hashCode());
        }

        public String toString() {
            String clientSecret = getClientSecret();
            String locale = getLocale();
            return "PaymentIntentType(clientSecret=" + clientSecret + ", locale=" + locale + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.clientSecret);
            out.writeString(this.locale);
        }

        public /* synthetic */ PaymentIntentType(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? Locale.getDefault().toLanguageTag() : str2);
        }
    }

    @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0007¨\u0006\u001f"}, m28432d2 = {"Lcom/stripe/android/model/ElementsSessionParams$SetupIntentType;", "Lcom/stripe/android/model/ElementsSessionParams;", "clientSecret", "", "locale", "(Ljava/lang/String;Ljava/lang/String;)V", "getClientSecret", "()Ljava/lang/String;", "expandFields", "", "getExpandFields", "()Ljava/util/List;", "getLocale", "type", "getType", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class SetupIntentType implements ElementsSessionParams {
        public static final int $stable = 0;
        public static final Parcelable.Creator<SetupIntentType> CREATOR = new Creator();
        private final String clientSecret;
        private final String locale;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<SetupIntentType> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SetupIntentType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SetupIntentType(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SetupIntentType[] newArray(int i) {
                return new SetupIntentType[i];
            }
        }

        public SetupIntentType(String clientSecret, String str) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            this.locale = str;
        }

        public static /* synthetic */ SetupIntentType copy$default(SetupIntentType setupIntentType, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = setupIntentType.getClientSecret();
            }
            if ((i & 2) != 0) {
                str2 = setupIntentType.getLocale();
            }
            return setupIntentType.copy(str, str2);
        }

        public final String component1() {
            return getClientSecret();
        }

        public final String component2() {
            return getLocale();
        }

        public final SetupIntentType copy(String clientSecret, String str) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return new SetupIntentType(clientSecret, str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SetupIntentType) {
                SetupIntentType setupIntentType = (SetupIntentType) obj;
                return Intrinsics.areEqual(getClientSecret(), setupIntentType.getClientSecret()) && Intrinsics.areEqual(getLocale(), setupIntentType.getLocale());
            }
            return false;
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public String getClientSecret() {
            return this.clientSecret;
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public List<String> getExpandFields() {
            List<String> listOf;
            String type = getType();
            listOf = CollectionsKt__CollectionsJVMKt.listOf("payment_method_preference." + type + ".payment_method");
            return listOf;
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public String getLocale() {
            return this.locale;
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public String getType() {
            return "setup_intent";
        }

        public int hashCode() {
            return (getClientSecret().hashCode() * 31) + (getLocale() == null ? 0 : getLocale().hashCode());
        }

        public String toString() {
            String clientSecret = getClientSecret();
            String locale = getLocale();
            return "SetupIntentType(clientSecret=" + clientSecret + ", locale=" + locale + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.clientSecret);
            out.writeString(this.locale);
        }

        public /* synthetic */ SetupIntentType(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? Locale.getDefault().toLanguageTag() : str2);
        }
    }
}
