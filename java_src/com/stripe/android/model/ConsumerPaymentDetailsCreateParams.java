package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.PaymentMethod;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB\u000f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0014\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\r¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/model/ConsumerPaymentDetailsCreateParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "(Lcom/stripe/android/model/PaymentMethod$Type;)V", "getType$payments_core_release", "()Lcom/stripe/android/model/PaymentMethod$Type;", "toParamMap", "", "", "", "Card", "Lcom/stripe/android/model/ConsumerPaymentDetailsCreateParams$Card;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class ConsumerPaymentDetailsCreateParams implements StripeParamsModel, Parcelable {
    public static final int $stable = 0;
    private final PaymentMethod.Type type;

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B#\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007HÖ\u0001R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"Lcom/stripe/android/model/ConsumerPaymentDetailsCreateParams$Card;", "Lcom/stripe/android/model/ConsumerPaymentDetailsCreateParams;", "", "", "", "convertParamsMap", "toParamMap", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "cardPaymentMethodCreateParamsMap", "Ljava/util/Map;", "email", "Ljava/lang/String;", "<init>", "(Ljava/util/Map;Ljava/lang/String;)V", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nConsumerPaymentDetailsCreateParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsumerPaymentDetailsCreateParams.kt\ncom/stripe/android/model/ConsumerPaymentDetailsCreateParams$Card\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,59:1\n467#2,7:60\n*S KotlinDebug\n*F\n+ 1 ConsumerPaymentDetailsCreateParams.kt\ncom/stripe/android/model/ConsumerPaymentDetailsCreateParams$Card\n*L\n40#1:60,7\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class Card extends ConsumerPaymentDetailsCreateParams {
        private final Map<String, Object> cardPaymentMethodCreateParamsMap;
        private final String email;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<Card> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/ConsumerPaymentDetailsCreateParams$Card$Companion;", "", "()V", "extraConfirmationParams", "", "", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Map<String, Map<String, Object>> extraConfirmationParams(PaymentMethodCreateParams paymentMethodCreateParams) {
                Map map;
                Map mapOf;
                Map<String, Map<String, Object>> mapOf2;
                Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
                Object obj = paymentMethodCreateParams.toParamMap().get("card");
                if (obj instanceof Map) {
                    map = (Map) obj;
                } else {
                    map = null;
                }
                if (map != null) {
                    mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("cvc", map.get("cvc")));
                    mapOf2 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("card", mapOf));
                    return mapOf2;
                }
                return null;
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
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashMap.put(parcel.readString(), parcel.readValue(Card.class.getClassLoader()));
                }
                return new Card(linkedHashMap, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card[] newArray(int i) {
                return new Card[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Card(Map<String, ? extends Object> cardPaymentMethodCreateParamsMap, String email) {
            super(PaymentMethod.Type.Card, null);
            Intrinsics.checkNotNullParameter(cardPaymentMethodCreateParamsMap, "cardPaymentMethodCreateParamsMap");
            Intrinsics.checkNotNullParameter(email, "email");
            this.cardPaymentMethodCreateParamsMap = cardPaymentMethodCreateParamsMap;
            this.email = email;
        }

        private final Map<String, Object> convertParamsMap() {
            Map map;
            Map mutableMap;
            Set of;
            boolean contains;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("billing_email_address", this.email);
            Pair<String, Object> addressFromMap = ConsumerPaymentDetails.Card.Companion.getAddressFromMap(this.cardPaymentMethodCreateParamsMap);
            if (addressFromMap != null) {
                linkedHashMap.put(addressFromMap.getFirst(), addressFromMap.getSecond());
            }
            Object obj = this.cardPaymentMethodCreateParamsMap.get("card");
            if (obj instanceof Map) {
                map = (Map) obj;
            } else {
                map = null;
            }
            if (map != null) {
                mutableMap = MapsKt__MapsKt.toMutableMap(map);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : mutableMap.entrySet()) {
                    Object key = entry.getKey();
                    of = SetsKt__SetsKt.setOf((Object[]) new String[]{"number", "exp_month", "exp_year"});
                    contains = CollectionsKt___CollectionsKt.contains(of, key);
                    if (contains) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                linkedHashMap.put("card", linkedHashMap2);
            }
            return linkedHashMap;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.model.ConsumerPaymentDetailsCreateParams, com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map<String, Object> plus;
            plus = MapsKt__MapsKt.plus(super.toParamMap(), convertParamsMap());
            return plus;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            Map<String, Object> map = this.cardPaymentMethodCreateParamsMap;
            out.writeInt(map.size());
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                out.writeString(entry.getKey());
                out.writeValue(entry.getValue());
            }
            out.writeString(this.email);
        }
    }

    public /* synthetic */ ConsumerPaymentDetailsCreateParams(PaymentMethod.Type type, DefaultConstructorMarker defaultConstructorMarker) {
        this(type);
    }

    public final PaymentMethod.Type getType$payments_core_release() {
        return this.type;
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("type", this.type.code));
        return mapOf;
    }

    private ConsumerPaymentDetailsCreateParams(PaymentMethod.Type type) {
        this.type = type;
    }
}
