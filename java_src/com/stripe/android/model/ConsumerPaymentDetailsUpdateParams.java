package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.ConsumerPaymentDetails;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0014\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0005\u0010\u000e¨\u0006\u001a"}, m28432d2 = {"Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "id", "", "isDefault", "", "cardPaymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/model/PaymentMethodCreateParams;)V", "getCardPaymentMethodCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "getId", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "describeContents", "", "toParamMap", "", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nConsumerPaymentDetailsUpdateParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsumerPaymentDetailsUpdateParams.kt\ncom/stripe/android/model/ConsumerPaymentDetailsUpdateParams\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
/* loaded from: classes7.dex */
public final class ConsumerPaymentDetailsUpdateParams implements StripeParamsModel, Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ConsumerPaymentDetailsUpdateParams> CREATOR = new Creator();
    private final PaymentMethodCreateParams cardPaymentMethodCreateParams;

    /* renamed from: id */
    private final String f75354id;
    private final Boolean isDefault;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<ConsumerPaymentDetailsUpdateParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConsumerPaymentDetailsUpdateParams createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ConsumerPaymentDetailsUpdateParams(readString, valueOf, parcel.readInt() != 0 ? PaymentMethodCreateParams.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConsumerPaymentDetailsUpdateParams[] newArray(int i) {
            return new ConsumerPaymentDetailsUpdateParams[i];
        }
    }

    public ConsumerPaymentDetailsUpdateParams(String id, Boolean bool, PaymentMethodCreateParams paymentMethodCreateParams) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.f75354id = id;
        this.isDefault = bool;
        this.cardPaymentMethodCreateParams = paymentMethodCreateParams;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final PaymentMethodCreateParams getCardPaymentMethodCreateParams() {
        return this.cardPaymentMethodCreateParams;
    }

    public final String getId() {
        return this.f75354id;
    }

    public final Boolean isDefault() {
        return this.isDefault;
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        Map<String, ? extends Object> paramMap;
        Map map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Boolean bool = this.isDefault;
        if (bool != null) {
            linkedHashMap.put("is_default", Boolean.valueOf(bool.booleanValue()));
        }
        PaymentMethodCreateParams paymentMethodCreateParams = this.cardPaymentMethodCreateParams;
        if (paymentMethodCreateParams != null && (paramMap = paymentMethodCreateParams.toParamMap()) != null) {
            Object obj = paramMap.get("card");
            if (obj instanceof Map) {
                map = (Map) obj;
            } else {
                map = null;
            }
            if (map != null) {
                Object obj2 = map.get("exp_month");
                if (obj2 != null) {
                    linkedHashMap.put("exp_month", obj2);
                }
                Object obj3 = map.get("exp_year");
                if (obj3 != null) {
                    linkedHashMap.put("exp_year", obj3);
                }
            }
            Pair<String, Object> addressFromMap = ConsumerPaymentDetails.Card.Companion.getAddressFromMap(paramMap);
            if (addressFromMap != null) {
                linkedHashMap.put(addressFromMap.getFirst(), addressFromMap.getSecond());
            }
        }
        return linkedHashMap;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f75354id);
        Boolean bool = this.isDefault;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        PaymentMethodCreateParams paymentMethodCreateParams = this.cardPaymentMethodCreateParams;
        if (paymentMethodCreateParams == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        paymentMethodCreateParams.writeToParcel(out, i);
    }

    public /* synthetic */ ConsumerPaymentDetailsUpdateParams(String str, Boolean bool, PaymentMethodCreateParams paymentMethodCreateParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : paymentMethodCreateParams);
    }
}
