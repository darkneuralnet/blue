package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.PaymentMethod;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0010\u0011\u0012\u0013B\u000f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J!\u0010\b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n0\tH ¢\u0006\u0002\b\rJ\u0014\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u000fH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\u0014\u0015\u0016\u0017¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethodOptionsParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "(Lcom/stripe/android/model/PaymentMethod$Type;)V", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "createTypeParams", "", "Lkotlin/Pair;", "", "", "createTypeParams$payments_core_release", "toParamMap", "", "Blik", "Card", "USBankAccount", "WeChatPay", "Lcom/stripe/android/model/PaymentMethodOptionsParams$Blik;", "Lcom/stripe/android/model/PaymentMethodOptionsParams$Card;", "Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount;", "Lcom/stripe/android/model/PaymentMethodOptionsParams$WeChatPay;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPaymentMethodOptionsParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodOptionsParams.kt\ncom/stripe/android/model/PaymentMethodOptionsParams\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n1789#2,2:109\n1791#2:112\n1#3:111\n*S KotlinDebug\n*F\n+ 1 PaymentMethodOptionsParams.kt\ncom/stripe/android/model/PaymentMethodOptionsParams\n*L\n13#1:109,2\n13#1:112\n*E\n"})
/* loaded from: classes7.dex */
public abstract class PaymentMethodOptionsParams implements StripeParamsModel, Parcelable {
    public static final int $stable = 0;
    private final PaymentMethod.Type type;

    @Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J!\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0\f0\u000bH\u0010¢\u0006\u0002\b\u000eJ\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u001c"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethodOptionsParams$Blik;", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", Blik.PARAM_CODE, "", "(Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "setCode", "component1", "copy", "createTypeParams", "", "Lkotlin/Pair;", "", "createTypeParams$payments_core_release", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Blik extends PaymentMethodOptionsParams {
        public static final String PARAM_CODE = "code";
        private String code;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<Blik> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethodOptionsParams$Blik$Companion;", "", "()V", "PARAM_CODE", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
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
        public static final class Creator implements Parcelable.Creator<Blik> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Blik createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Blik(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Blik[] newArray(int i) {
                return new Blik[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Blik(String code) {
            super(PaymentMethod.Type.Blik, null);
            Intrinsics.checkNotNullParameter(code, "code");
            this.code = code;
        }

        public static /* synthetic */ Blik copy$default(Blik blik, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = blik.code;
            }
            return blik.copy(str);
        }

        public final String component1() {
            return this.code;
        }

        public final Blik copy(String code) {
            Intrinsics.checkNotNullParameter(code, "code");
            return new Blik(code);
        }

        @Override // com.stripe.android.model.PaymentMethodOptionsParams
        public List<Pair<String, Object>> createTypeParams$payments_core_release() {
            List<Pair<String, Object>> listOf;
            listOf = CollectionsKt__CollectionsJVMKt.listOf(TuplesKt.m28425to(PARAM_CODE, this.code));
            return listOf;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Blik) && Intrinsics.areEqual(this.code, ((Blik) obj).code);
        }

        public final String getCode() {
            return this.code;
        }

        public int hashCode() {
            return this.code.hashCode();
        }

        public final void setCode(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.code = str;
        }

        public String toString() {
            String str = this.code;
            return "Blik(code=" + str + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.code);
        }
    }

    @Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 12\u00020\u0001:\u00011B+\b\u0016\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B7\b\u0000\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\tHÀ\u0003¢\u0006\u0004\b\u001e\u0010\u0010J>\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010 J!\u0010!\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010$0#0\"H\u0010¢\u0006\u0002\b%J\t\u0010&\u001a\u00020'HÖ\u0001J\u0013\u0010(\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010*\u001a\u00020'HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\u0019\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020'HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u00062"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethodOptionsParams$Card;", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", Card.PARAM_CVC, "", Card.PARAM_NETWORK, "setupFutureUsage", "Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;)V", Card.PARAM_MOTO, "", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;Ljava/lang/Boolean;)V", "getCvc", "()Ljava/lang/String;", "setCvc", "(Ljava/lang/String;)V", "getMoto$payments_core_release", "()Ljava/lang/Boolean;", "setMoto$payments_core_release", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getNetwork", "setNetwork", "getSetupFutureUsage", "()Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;", "setSetupFutureUsage", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;)V", "component1", "component2", "component3", "component4", "component4$payments_core_release", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;Ljava/lang/Boolean;)Lcom/stripe/android/model/PaymentMethodOptionsParams$Card;", "createTypeParams", "", "Lkotlin/Pair;", "", "createTypeParams$payments_core_release", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Card extends PaymentMethodOptionsParams {
        @Deprecated
        private static final String PARAM_CVC = "cvc";
        @Deprecated
        private static final String PARAM_MOTO = "moto";
        @Deprecated
        private static final String PARAM_NETWORK = "network";
        @Deprecated
        private static final String PARAM_SETUP_FUTURE_USAGE = "setup_future_usage";
        private String cvc;
        private Boolean moto;
        private String network;
        private ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage;
        private static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<Card> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethodOptionsParams$Card$Companion;", "", "()V", "PARAM_CVC", "", "PARAM_MOTO", "PARAM_NETWORK", "PARAM_SETUP_FUTURE_USAGE", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
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
        public static final class Creator implements Parcelable.Creator<Card> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Boolean bool = null;
                ConfirmPaymentIntentParams.SetupFutureUsage valueOf = parcel.readInt() == 0 ? null : ConfirmPaymentIntentParams.SetupFutureUsage.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Card(readString, readString2, valueOf, bool);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card[] newArray(int i) {
                return new Card[i];
            }
        }

        public Card() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ Card copy$default(Card card, String str, String str2, ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                str = card.cvc;
            }
            if ((i & 2) != 0) {
                str2 = card.network;
            }
            if ((i & 4) != 0) {
                setupFutureUsage = card.setupFutureUsage;
            }
            if ((i & 8) != 0) {
                bool = card.moto;
            }
            return card.copy(str, str2, setupFutureUsage, bool);
        }

        public final String component1() {
            return this.cvc;
        }

        public final String component2() {
            return this.network;
        }

        public final ConfirmPaymentIntentParams.SetupFutureUsage component3() {
            return this.setupFutureUsage;
        }

        public final Boolean component4$payments_core_release() {
            return this.moto;
        }

        public final Card copy(String str, String str2, ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage, Boolean bool) {
            return new Card(str, str2, setupFutureUsage, bool);
        }

        @Override // com.stripe.android.model.PaymentMethodOptionsParams
        public List<Pair<String, Object>> createTypeParams$payments_core_release() {
            String str;
            List<Pair<String, Object>> listOf;
            Pair[] pairArr = new Pair[4];
            pairArr[0] = TuplesKt.m28425to(PARAM_CVC, this.cvc);
            pairArr[1] = TuplesKt.m28425to(PARAM_NETWORK, this.network);
            pairArr[2] = TuplesKt.m28425to(PARAM_MOTO, this.moto);
            ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage = this.setupFutureUsage;
            if (setupFutureUsage != null) {
                str = setupFutureUsage.getCode$payments_core_release();
            } else {
                str = null;
            }
            pairArr[3] = TuplesKt.m28425to("setup_future_usage", str);
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) pairArr);
            return listOf;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Card) {
                Card card = (Card) obj;
                return Intrinsics.areEqual(this.cvc, card.cvc) && Intrinsics.areEqual(this.network, card.network) && this.setupFutureUsage == card.setupFutureUsage && Intrinsics.areEqual(this.moto, card.moto);
            }
            return false;
        }

        public final String getCvc() {
            return this.cvc;
        }

        public final Boolean getMoto$payments_core_release() {
            return this.moto;
        }

        public final String getNetwork() {
            return this.network;
        }

        public final ConfirmPaymentIntentParams.SetupFutureUsage getSetupFutureUsage() {
            return this.setupFutureUsage;
        }

        public int hashCode() {
            String str = this.cvc;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.network;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage = this.setupFutureUsage;
            int hashCode3 = (hashCode2 + (setupFutureUsage == null ? 0 : setupFutureUsage.hashCode())) * 31;
            Boolean bool = this.moto;
            return hashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        public final void setCvc(String str) {
            this.cvc = str;
        }

        public final void setMoto$payments_core_release(Boolean bool) {
            this.moto = bool;
        }

        public final void setNetwork(String str) {
            this.network = str;
        }

        public final void setSetupFutureUsage(ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage) {
            this.setupFutureUsage = setupFutureUsage;
        }

        public String toString() {
            String str = this.cvc;
            String str2 = this.network;
            ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage = this.setupFutureUsage;
            Boolean bool = this.moto;
            return "Card(cvc=" + str + ", network=" + str2 + ", setupFutureUsage=" + setupFutureUsage + ", moto=" + bool + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.cvc);
            out.writeString(this.network);
            ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage = this.setupFutureUsage;
            if (setupFutureUsage == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(setupFutureUsage.name());
            }
            Boolean bool = this.moto;
            if (bool == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }

        public /* synthetic */ Card(String str, String str2, ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : setupFutureUsage, (i & 8) != 0 ? null : bool);
        }

        public Card(String str, String str2, ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage, Boolean bool) {
            super(PaymentMethod.Type.Card, null);
            this.cvc = str;
            this.network = str2;
            this.setupFutureUsage = setupFutureUsage;
            this.moto = bool;
        }

        public /* synthetic */ Card(String str, String str2, ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : setupFutureUsage);
        }

        public Card(String str, String str2, ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage) {
            this(str, str2, setupFutureUsage, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J!\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f0\u000bH\u0010¢\u0006\u0002\b\u000fJ\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u0015\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0016\u001a\u00020\rHÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u001d"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount;", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "setupFutureUsage", "Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;)V", "getSetupFutureUsage", "()Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;", "setSetupFutureUsage", "component1", "copy", "createTypeParams", "", "Lkotlin/Pair;", "", "", "createTypeParams$payments_core_release", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class USBankAccount extends PaymentMethodOptionsParams {
        public static final String PARAM_SETUP_FUTURE_USAGE = "setup_future_usage";
        private ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<USBankAccount> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount$Companion;", "", "()V", "PARAM_SETUP_FUTURE_USAGE", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
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
        public static final class Creator implements Parcelable.Creator<USBankAccount> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final USBankAccount createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new USBankAccount(parcel.readInt() == 0 ? null : ConfirmPaymentIntentParams.SetupFutureUsage.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final USBankAccount[] newArray(int i) {
                return new USBankAccount[i];
            }
        }

        public USBankAccount() {
            this(null, 1, null);
        }

        public static /* synthetic */ USBankAccount copy$default(USBankAccount uSBankAccount, ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage, int i, Object obj) {
            if ((i & 1) != 0) {
                setupFutureUsage = uSBankAccount.setupFutureUsage;
            }
            return uSBankAccount.copy(setupFutureUsage);
        }

        public final ConfirmPaymentIntentParams.SetupFutureUsage component1() {
            return this.setupFutureUsage;
        }

        public final USBankAccount copy(ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage) {
            return new USBankAccount(setupFutureUsage);
        }

        @Override // com.stripe.android.model.PaymentMethodOptionsParams
        public List<Pair<String, Object>> createTypeParams$payments_core_release() {
            String str;
            List<Pair<String, Object>> listOf;
            ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage = this.setupFutureUsage;
            if (setupFutureUsage != null) {
                str = setupFutureUsage.getCode$payments_core_release();
            } else {
                str = null;
            }
            listOf = CollectionsKt__CollectionsJVMKt.listOf(TuplesKt.m28425to(PARAM_SETUP_FUTURE_USAGE, str));
            return listOf;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof USBankAccount) && this.setupFutureUsage == ((USBankAccount) obj).setupFutureUsage;
        }

        public final ConfirmPaymentIntentParams.SetupFutureUsage getSetupFutureUsage() {
            return this.setupFutureUsage;
        }

        public int hashCode() {
            ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage = this.setupFutureUsage;
            if (setupFutureUsage == null) {
                return 0;
            }
            return setupFutureUsage.hashCode();
        }

        public final void setSetupFutureUsage(ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage) {
            this.setupFutureUsage = setupFutureUsage;
        }

        public String toString() {
            ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage = this.setupFutureUsage;
            return "USBankAccount(setupFutureUsage=" + setupFutureUsage + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage = this.setupFutureUsage;
            if (setupFutureUsage == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeString(setupFutureUsage.name());
        }

        public /* synthetic */ USBankAccount(ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : setupFutureUsage);
        }

        public USBankAccount(ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage) {
            super(PaymentMethod.Type.USBankAccount, null);
            this.setupFutureUsage = setupFutureUsage;
        }
    }

    @Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J!\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0\f0\u000bH\u0010¢\u0006\u0002\b\u000eJ\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u001c"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethodOptionsParams$WeChatPay;", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "appId", "", "(Ljava/lang/String;)V", "getAppId", "()Ljava/lang/String;", "setAppId", "component1", "copy", "createTypeParams", "", "Lkotlin/Pair;", "", "createTypeParams$payments_core_release", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class WeChatPay extends PaymentMethodOptionsParams {
        public static final String PARAM_APP_ID = "app_id";
        public static final String PARAM_CLIENT = "client";
        private String appId;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<WeChatPay> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethodOptionsParams$WeChatPay$Companion;", "", "()V", "PARAM_APP_ID", "", "PARAM_CLIENT", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
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
        public static final class Creator implements Parcelable.Creator<WeChatPay> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WeChatPay createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WeChatPay(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WeChatPay[] newArray(int i) {
                return new WeChatPay[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WeChatPay(String appId) {
            super(PaymentMethod.Type.WeChatPay, null);
            Intrinsics.checkNotNullParameter(appId, "appId");
            this.appId = appId;
        }

        public static /* synthetic */ WeChatPay copy$default(WeChatPay weChatPay, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = weChatPay.appId;
            }
            return weChatPay.copy(str);
        }

        public final String component1() {
            return this.appId;
        }

        public final WeChatPay copy(String appId) {
            Intrinsics.checkNotNullParameter(appId, "appId");
            return new WeChatPay(appId);
        }

        @Override // com.stripe.android.model.PaymentMethodOptionsParams
        public List<Pair<String, Object>> createTypeParams$payments_core_release() {
            List<Pair<String, Object>> listOf;
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m28425to(PARAM_CLIENT, "android"), TuplesKt.m28425to(PARAM_APP_ID, this.appId)});
            return listOf;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WeChatPay) && Intrinsics.areEqual(this.appId, ((WeChatPay) obj).appId);
        }

        public final String getAppId() {
            return this.appId;
        }

        public int hashCode() {
            return this.appId.hashCode();
        }

        public final void setAppId(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.appId = str;
        }

        public String toString() {
            String str = this.appId;
            return "WeChatPay(appId=" + str + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.appId);
        }
    }

    public /* synthetic */ PaymentMethodOptionsParams(PaymentMethod.Type type, DefaultConstructorMarker defaultConstructorMarker) {
        this(type);
    }

    public abstract List<Pair<String, Object>> createTypeParams$payments_core_release();

    public final PaymentMethod.Type getType() {
        return this.type;
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        Map emptyMap;
        Map<String, Object> emptyMap2;
        Map<String, Object> mapOf;
        Map map;
        emptyMap = MapsKt__MapsKt.emptyMap();
        Iterator<T> it = createTypeParams$payments_core_release().iterator();
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
        if (!emptyMap.isEmpty()) {
            mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(this.type.code, emptyMap));
            return mapOf;
        }
        emptyMap2 = MapsKt__MapsKt.emptyMap();
        return emptyMap2;
    }

    private PaymentMethodOptionsParams(PaymentMethod.Type type) {
        this.type = type;
    }
}
