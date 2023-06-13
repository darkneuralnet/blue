package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.adyen.checkout.components.model.payments.response.Action;
import com.stripe.android.model.PaymentMethod;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001&B9\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u000bJ\t\u0010\u000f\u001a\u00020\u0004HÂ\u0003J\u000e\u0010\u0010\u001a\u00020\u0006HÀ\u0003¢\u0006\u0002\b\u0011J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\bHÂ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÂ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÂ\u0003JF\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010\u0017J\t\u0010\u0018\u001a\u00020\bHÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\u0014\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001c0\u001fH\u0016J\t\u0010 \u001a\u00020\u0004HÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\bHÖ\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, m28432d2 = {"Lcom/stripe/android/model/ListPaymentMethodsParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "customerId", "", Action.PAYMENT_METHOD_TYPE, "Lcom/stripe/android/model/PaymentMethod$Type;", ListPaymentMethodsParams.PARAM_LIMIT, "", "endingBefore", "startingAfter", "(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$Type;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/Integer;", "getPaymentMethodType$payments_core_release", "()Lcom/stripe/android/model/PaymentMethod$Type;", "component1", "component2", "component2$payments_core_release", "component3", "()Ljava/lang/Integer;", "component4", "component5", "copy", "(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$Type;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/ListPaymentMethodsParams;", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nListPaymentMethodsParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListPaymentMethodsParams.kt\ncom/stripe/android/model/ListPaymentMethodsParams\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1789#2,2:39\n1791#2:42\n1#3:41\n*S KotlinDebug\n*F\n+ 1 ListPaymentMethodsParams.kt\ncom/stripe/android/model/ListPaymentMethodsParams\n*L\n23#1:39,2\n23#1:42\n*E\n"})
/* loaded from: classes7.dex */
public final class ListPaymentMethodsParams implements StripeParamsModel, Parcelable {
    public static final int $stable = 0;
    @Deprecated
    private static final String PARAM_CUSTOMER = "customer";
    @Deprecated
    private static final String PARAM_ENDING_BEFORE = "ending_before";
    @Deprecated
    private static final String PARAM_LIMIT = "limit";
    @Deprecated
    private static final String PARAM_STARTING_AFTER = "starting_after";
    @Deprecated
    private static final String PARAM_TYPE = "type";
    private final String customerId;
    private final String endingBefore;
    private final Integer limit;
    private final PaymentMethod.Type paymentMethodType;
    private final String startingAfter;
    private static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ListPaymentMethodsParams> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/model/ListPaymentMethodsParams$Companion;", "", "()V", "PARAM_CUSTOMER", "", "PARAM_ENDING_BEFORE", "PARAM_LIMIT", "PARAM_STARTING_AFTER", "PARAM_TYPE", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
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
    public static final class Creator implements Parcelable.Creator<ListPaymentMethodsParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ListPaymentMethodsParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ListPaymentMethodsParams(parcel.readString(), PaymentMethod.Type.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ListPaymentMethodsParams[] newArray(int i) {
            return new ListPaymentMethodsParams[i];
        }
    }

    public ListPaymentMethodsParams(String customerId, PaymentMethod.Type paymentMethodType, Integer num, String str, String str2) {
        Intrinsics.checkNotNullParameter(customerId, "customerId");
        Intrinsics.checkNotNullParameter(paymentMethodType, "paymentMethodType");
        this.customerId = customerId;
        this.paymentMethodType = paymentMethodType;
        this.limit = num;
        this.endingBefore = str;
        this.startingAfter = str2;
    }

    private final String component1() {
        return this.customerId;
    }

    private final Integer component3() {
        return this.limit;
    }

    private final String component4() {
        return this.endingBefore;
    }

    private final String component5() {
        return this.startingAfter;
    }

    public static /* synthetic */ ListPaymentMethodsParams copy$default(ListPaymentMethodsParams listPaymentMethodsParams, String str, PaymentMethod.Type type, Integer num, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = listPaymentMethodsParams.customerId;
        }
        if ((i & 2) != 0) {
            type = listPaymentMethodsParams.paymentMethodType;
        }
        PaymentMethod.Type type2 = type;
        if ((i & 4) != 0) {
            num = listPaymentMethodsParams.limit;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            str2 = listPaymentMethodsParams.endingBefore;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            str3 = listPaymentMethodsParams.startingAfter;
        }
        return listPaymentMethodsParams.copy(str, type2, num2, str4, str3);
    }

    public final PaymentMethod.Type component2$payments_core_release() {
        return this.paymentMethodType;
    }

    public final ListPaymentMethodsParams copy(String customerId, PaymentMethod.Type paymentMethodType, Integer num, String str, String str2) {
        Intrinsics.checkNotNullParameter(customerId, "customerId");
        Intrinsics.checkNotNullParameter(paymentMethodType, "paymentMethodType");
        return new ListPaymentMethodsParams(customerId, paymentMethodType, num, str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ListPaymentMethodsParams) {
            ListPaymentMethodsParams listPaymentMethodsParams = (ListPaymentMethodsParams) obj;
            return Intrinsics.areEqual(this.customerId, listPaymentMethodsParams.customerId) && this.paymentMethodType == listPaymentMethodsParams.paymentMethodType && Intrinsics.areEqual(this.limit, listPaymentMethodsParams.limit) && Intrinsics.areEqual(this.endingBefore, listPaymentMethodsParams.endingBefore) && Intrinsics.areEqual(this.startingAfter, listPaymentMethodsParams.startingAfter);
        }
        return false;
    }

    public final PaymentMethod.Type getPaymentMethodType$payments_core_release() {
        return this.paymentMethodType;
    }

    public int hashCode() {
        int hashCode = ((this.customerId.hashCode() * 31) + this.paymentMethodType.hashCode()) * 31;
        Integer num = this.limit;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.endingBefore;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.startingAfter;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        List<Pair> listOf;
        Map<String, Object> emptyMap;
        Map map;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m28425to("customer", this.customerId), TuplesKt.m28425to("type", this.paymentMethodType.code), TuplesKt.m28425to(PARAM_LIMIT, this.limit), TuplesKt.m28425to(PARAM_ENDING_BEFORE, this.endingBefore), TuplesKt.m28425to(PARAM_STARTING_AFTER, this.startingAfter)});
        emptyMap = MapsKt__MapsKt.emptyMap();
        for (Pair pair : listOf) {
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

    public String toString() {
        String str = this.customerId;
        PaymentMethod.Type type = this.paymentMethodType;
        Integer num = this.limit;
        String str2 = this.endingBefore;
        String str3 = this.startingAfter;
        return "ListPaymentMethodsParams(customerId=" + str + ", paymentMethodType=" + type + ", limit=" + num + ", endingBefore=" + str2 + ", startingAfter=" + str3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        int intValue;
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.customerId);
        this.paymentMethodType.writeToParcel(out, i);
        Integer num = this.limit;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeString(this.endingBefore);
        out.writeString(this.startingAfter);
    }

    public /* synthetic */ ListPaymentMethodsParams(String str, PaymentMethod.Type type, Integer num, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, type, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }
}
