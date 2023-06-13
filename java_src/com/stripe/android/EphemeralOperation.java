package com.stripe.android;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X \u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bX \u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/EphemeralOperation;", "Landroid/os/Parcelable;", "()V", "id", "", "getId$payments_core_release", "()Ljava/lang/String;", NamedConstantsKt.PRODUCT_USAGE, "", "getProductUsage$payments_core_release", "()Ljava/util/Set;", "Customer", "Issuing", "RetrieveKey", "Lcom/stripe/android/EphemeralOperation$Customer;", "Lcom/stripe/android/EphemeralOperation$Issuing;", "Lcom/stripe/android/EphemeralOperation$RetrieveKey;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public abstract class EphemeralOperation implements Parcelable {

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/EphemeralOperation$Customer;", "Lcom/stripe/android/EphemeralOperation;", "()V", "AddSource", "AttachPaymentMethod", "DeleteSource", "DetachPaymentMethod", "GetPaymentMethods", "UpdateDefaultSource", "UpdateShipping", "Lcom/stripe/android/EphemeralOperation$Customer$AddSource;", "Lcom/stripe/android/EphemeralOperation$Customer$AttachPaymentMethod;", "Lcom/stripe/android/EphemeralOperation$Customer$DeleteSource;", "Lcom/stripe/android/EphemeralOperation$Customer$DetachPaymentMethod;", "Lcom/stripe/android/EphemeralOperation$Customer$GetPaymentMethods;", "Lcom/stripe/android/EphemeralOperation$Customer$UpdateDefaultSource;", "Lcom/stripe/android/EphemeralOperation$Customer$UpdateShipping;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static abstract class Customer extends EphemeralOperation {

        @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000e\u0010\u0011\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0012J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÀ\u0003¢\u0006\u0002\b\u0014J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006#"}, m28432d2 = {"Lcom/stripe/android/EphemeralOperation$Customer$AddSource;", "Lcom/stripe/android/EphemeralOperation$Customer;", "sourceId", "", "sourceType", "id", NamedConstantsKt.PRODUCT_USAGE, "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "getId$payments_core_release", "()Ljava/lang/String;", "getProductUsage$payments_core_release", "()Ljava/util/Set;", "getSourceId", "getSourceType", "component1", "component2", "component3", "component3$payments_core_release", "component4", "component4$payments_core_release", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class AddSource extends Customer {
            public static final int $stable = 8;
            public static final Parcelable.Creator<AddSource> CREATOR = new Creator();

            /* renamed from: id */
            private final String f75249id;
            private final Set<String> productUsage;
            private final String sourceId;
            private final String sourceType;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<AddSource> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AddSource createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i = 0; i != readInt; i++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new AddSource(readString, readString2, readString3, linkedHashSet);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AddSource[] newArray(int i) {
                    return new AddSource[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AddSource(String sourceId, String sourceType, String id, Set<String> productUsage) {
                super(null);
                Intrinsics.checkNotNullParameter(sourceId, "sourceId");
                Intrinsics.checkNotNullParameter(sourceType, "sourceType");
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                this.sourceId = sourceId;
                this.sourceType = sourceType;
                this.f75249id = id;
                this.productUsage = productUsage;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ AddSource copy$default(AddSource addSource, String str, String str2, String str3, Set set, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = addSource.sourceId;
                }
                if ((i & 2) != 0) {
                    str2 = addSource.sourceType;
                }
                if ((i & 4) != 0) {
                    str3 = addSource.getId$payments_core_release();
                }
                if ((i & 8) != 0) {
                    set = addSource.getProductUsage$payments_core_release();
                }
                return addSource.copy(str, str2, str3, set);
            }

            public final String component1() {
                return this.sourceId;
            }

            public final String component2() {
                return this.sourceType;
            }

            public final String component3$payments_core_release() {
                return getId$payments_core_release();
            }

            public final Set<String> component4$payments_core_release() {
                return getProductUsage$payments_core_release();
            }

            public final AddSource copy(String sourceId, String sourceType, String id, Set<String> productUsage) {
                Intrinsics.checkNotNullParameter(sourceId, "sourceId");
                Intrinsics.checkNotNullParameter(sourceType, "sourceType");
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                return new AddSource(sourceId, sourceType, id, productUsage);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof AddSource) {
                    AddSource addSource = (AddSource) obj;
                    return Intrinsics.areEqual(this.sourceId, addSource.sourceId) && Intrinsics.areEqual(this.sourceType, addSource.sourceType) && Intrinsics.areEqual(getId$payments_core_release(), addSource.getId$payments_core_release()) && Intrinsics.areEqual(getProductUsage$payments_core_release(), addSource.getProductUsage$payments_core_release());
                }
                return false;
            }

            @Override // com.stripe.android.EphemeralOperation
            public String getId$payments_core_release() {
                return this.f75249id;
            }

            @Override // com.stripe.android.EphemeralOperation
            public Set<String> getProductUsage$payments_core_release() {
                return this.productUsage;
            }

            public final String getSourceId() {
                return this.sourceId;
            }

            public final String getSourceType() {
                return this.sourceType;
            }

            public int hashCode() {
                return (((((this.sourceId.hashCode() * 31) + this.sourceType.hashCode()) * 31) + getId$payments_core_release().hashCode()) * 31) + getProductUsage$payments_core_release().hashCode();
            }

            public String toString() {
                String str = this.sourceId;
                String str2 = this.sourceType;
                String id$payments_core_release = getId$payments_core_release();
                Set<String> productUsage$payments_core_release = getProductUsage$payments_core_release();
                return "AddSource(sourceId=" + str + ", sourceType=" + str2 + ", id=" + id$payments_core_release + ", productUsage=" + productUsage$payments_core_release + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(this.sourceId);
                out.writeString(this.sourceType);
                out.writeString(this.f75249id);
                Set<String> set = this.productUsage;
                out.writeInt(set.size());
                for (String str : set) {
                    out.writeString(str);
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000e\u0010\u000e\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u000fJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÀ\u0003¢\u0006\u0002\b\u0011J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006 "}, m28432d2 = {"Lcom/stripe/android/EphemeralOperation$Customer$AttachPaymentMethod;", "Lcom/stripe/android/EphemeralOperation$Customer;", "paymentMethodId", "", "id", NamedConstantsKt.PRODUCT_USAGE, "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "getId$payments_core_release", "()Ljava/lang/String;", "getPaymentMethodId", "getProductUsage$payments_core_release", "()Ljava/util/Set;", "component1", "component2", "component2$payments_core_release", "component3", "component3$payments_core_release", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class AttachPaymentMethod extends Customer {
            public static final int $stable = 8;
            public static final Parcelable.Creator<AttachPaymentMethod> CREATOR = new Creator();

            /* renamed from: id */
            private final String f75250id;
            private final String paymentMethodId;
            private final Set<String> productUsage;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<AttachPaymentMethod> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AttachPaymentMethod createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i = 0; i != readInt; i++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new AttachPaymentMethod(readString, readString2, linkedHashSet);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AttachPaymentMethod[] newArray(int i) {
                    return new AttachPaymentMethod[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AttachPaymentMethod(String paymentMethodId, String id, Set<String> productUsage) {
                super(null);
                Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                this.paymentMethodId = paymentMethodId;
                this.f75250id = id;
                this.productUsage = productUsage;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ AttachPaymentMethod copy$default(AttachPaymentMethod attachPaymentMethod, String str, String str2, Set set, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = attachPaymentMethod.paymentMethodId;
                }
                if ((i & 2) != 0) {
                    str2 = attachPaymentMethod.getId$payments_core_release();
                }
                if ((i & 4) != 0) {
                    set = attachPaymentMethod.getProductUsage$payments_core_release();
                }
                return attachPaymentMethod.copy(str, str2, set);
            }

            public final String component1() {
                return this.paymentMethodId;
            }

            public final String component2$payments_core_release() {
                return getId$payments_core_release();
            }

            public final Set<String> component3$payments_core_release() {
                return getProductUsage$payments_core_release();
            }

            public final AttachPaymentMethod copy(String paymentMethodId, String id, Set<String> productUsage) {
                Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                return new AttachPaymentMethod(paymentMethodId, id, productUsage);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof AttachPaymentMethod) {
                    AttachPaymentMethod attachPaymentMethod = (AttachPaymentMethod) obj;
                    return Intrinsics.areEqual(this.paymentMethodId, attachPaymentMethod.paymentMethodId) && Intrinsics.areEqual(getId$payments_core_release(), attachPaymentMethod.getId$payments_core_release()) && Intrinsics.areEqual(getProductUsage$payments_core_release(), attachPaymentMethod.getProductUsage$payments_core_release());
                }
                return false;
            }

            @Override // com.stripe.android.EphemeralOperation
            public String getId$payments_core_release() {
                return this.f75250id;
            }

            public final String getPaymentMethodId() {
                return this.paymentMethodId;
            }

            @Override // com.stripe.android.EphemeralOperation
            public Set<String> getProductUsage$payments_core_release() {
                return this.productUsage;
            }

            public int hashCode() {
                return (((this.paymentMethodId.hashCode() * 31) + getId$payments_core_release().hashCode()) * 31) + getProductUsage$payments_core_release().hashCode();
            }

            public String toString() {
                String str = this.paymentMethodId;
                String id$payments_core_release = getId$payments_core_release();
                Set<String> productUsage$payments_core_release = getProductUsage$payments_core_release();
                return "AttachPaymentMethod(paymentMethodId=" + str + ", id=" + id$payments_core_release + ", productUsage=" + productUsage$payments_core_release + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(this.paymentMethodId);
                out.writeString(this.f75250id);
                Set<String> set = this.productUsage;
                out.writeInt(set.size());
                for (String str : set) {
                    out.writeString(str);
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000e\u0010\u000e\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u000fJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÀ\u0003¢\u0006\u0002\b\u0011J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006 "}, m28432d2 = {"Lcom/stripe/android/EphemeralOperation$Customer$DeleteSource;", "Lcom/stripe/android/EphemeralOperation$Customer;", "sourceId", "", "id", NamedConstantsKt.PRODUCT_USAGE, "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "getId$payments_core_release", "()Ljava/lang/String;", "getProductUsage$payments_core_release", "()Ljava/util/Set;", "getSourceId", "component1", "component2", "component2$payments_core_release", "component3", "component3$payments_core_release", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class DeleteSource extends Customer {
            public static final int $stable = 8;
            public static final Parcelable.Creator<DeleteSource> CREATOR = new Creator();

            /* renamed from: id */
            private final String f75251id;
            private final Set<String> productUsage;
            private final String sourceId;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<DeleteSource> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DeleteSource createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i = 0; i != readInt; i++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new DeleteSource(readString, readString2, linkedHashSet);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DeleteSource[] newArray(int i) {
                    return new DeleteSource[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DeleteSource(String sourceId, String id, Set<String> productUsage) {
                super(null);
                Intrinsics.checkNotNullParameter(sourceId, "sourceId");
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                this.sourceId = sourceId;
                this.f75251id = id;
                this.productUsage = productUsage;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ DeleteSource copy$default(DeleteSource deleteSource, String str, String str2, Set set, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = deleteSource.sourceId;
                }
                if ((i & 2) != 0) {
                    str2 = deleteSource.getId$payments_core_release();
                }
                if ((i & 4) != 0) {
                    set = deleteSource.getProductUsage$payments_core_release();
                }
                return deleteSource.copy(str, str2, set);
            }

            public final String component1() {
                return this.sourceId;
            }

            public final String component2$payments_core_release() {
                return getId$payments_core_release();
            }

            public final Set<String> component3$payments_core_release() {
                return getProductUsage$payments_core_release();
            }

            public final DeleteSource copy(String sourceId, String id, Set<String> productUsage) {
                Intrinsics.checkNotNullParameter(sourceId, "sourceId");
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                return new DeleteSource(sourceId, id, productUsage);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof DeleteSource) {
                    DeleteSource deleteSource = (DeleteSource) obj;
                    return Intrinsics.areEqual(this.sourceId, deleteSource.sourceId) && Intrinsics.areEqual(getId$payments_core_release(), deleteSource.getId$payments_core_release()) && Intrinsics.areEqual(getProductUsage$payments_core_release(), deleteSource.getProductUsage$payments_core_release());
                }
                return false;
            }

            @Override // com.stripe.android.EphemeralOperation
            public String getId$payments_core_release() {
                return this.f75251id;
            }

            @Override // com.stripe.android.EphemeralOperation
            public Set<String> getProductUsage$payments_core_release() {
                return this.productUsage;
            }

            public final String getSourceId() {
                return this.sourceId;
            }

            public int hashCode() {
                return (((this.sourceId.hashCode() * 31) + getId$payments_core_release().hashCode()) * 31) + getProductUsage$payments_core_release().hashCode();
            }

            public String toString() {
                String str = this.sourceId;
                String id$payments_core_release = getId$payments_core_release();
                Set<String> productUsage$payments_core_release = getProductUsage$payments_core_release();
                return "DeleteSource(sourceId=" + str + ", id=" + id$payments_core_release + ", productUsage=" + productUsage$payments_core_release + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(this.sourceId);
                out.writeString(this.f75251id);
                Set<String> set = this.productUsage;
                out.writeInt(set.size());
                for (String str : set) {
                    out.writeString(str);
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000e\u0010\u000e\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u000fJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÀ\u0003¢\u0006\u0002\b\u0011J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006 "}, m28432d2 = {"Lcom/stripe/android/EphemeralOperation$Customer$DetachPaymentMethod;", "Lcom/stripe/android/EphemeralOperation$Customer;", "paymentMethodId", "", "id", NamedConstantsKt.PRODUCT_USAGE, "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "getId$payments_core_release", "()Ljava/lang/String;", "getPaymentMethodId", "getProductUsage$payments_core_release", "()Ljava/util/Set;", "component1", "component2", "component2$payments_core_release", "component3", "component3$payments_core_release", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class DetachPaymentMethod extends Customer {
            public static final int $stable = 8;
            public static final Parcelable.Creator<DetachPaymentMethod> CREATOR = new Creator();

            /* renamed from: id */
            private final String f75252id;
            private final String paymentMethodId;
            private final Set<String> productUsage;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<DetachPaymentMethod> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DetachPaymentMethod createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i = 0; i != readInt; i++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new DetachPaymentMethod(readString, readString2, linkedHashSet);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DetachPaymentMethod[] newArray(int i) {
                    return new DetachPaymentMethod[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DetachPaymentMethod(String paymentMethodId, String id, Set<String> productUsage) {
                super(null);
                Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                this.paymentMethodId = paymentMethodId;
                this.f75252id = id;
                this.productUsage = productUsage;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ DetachPaymentMethod copy$default(DetachPaymentMethod detachPaymentMethod, String str, String str2, Set set, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = detachPaymentMethod.paymentMethodId;
                }
                if ((i & 2) != 0) {
                    str2 = detachPaymentMethod.getId$payments_core_release();
                }
                if ((i & 4) != 0) {
                    set = detachPaymentMethod.getProductUsage$payments_core_release();
                }
                return detachPaymentMethod.copy(str, str2, set);
            }

            public final String component1() {
                return this.paymentMethodId;
            }

            public final String component2$payments_core_release() {
                return getId$payments_core_release();
            }

            public final Set<String> component3$payments_core_release() {
                return getProductUsage$payments_core_release();
            }

            public final DetachPaymentMethod copy(String paymentMethodId, String id, Set<String> productUsage) {
                Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                return new DetachPaymentMethod(paymentMethodId, id, productUsage);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof DetachPaymentMethod) {
                    DetachPaymentMethod detachPaymentMethod = (DetachPaymentMethod) obj;
                    return Intrinsics.areEqual(this.paymentMethodId, detachPaymentMethod.paymentMethodId) && Intrinsics.areEqual(getId$payments_core_release(), detachPaymentMethod.getId$payments_core_release()) && Intrinsics.areEqual(getProductUsage$payments_core_release(), detachPaymentMethod.getProductUsage$payments_core_release());
                }
                return false;
            }

            @Override // com.stripe.android.EphemeralOperation
            public String getId$payments_core_release() {
                return this.f75252id;
            }

            public final String getPaymentMethodId() {
                return this.paymentMethodId;
            }

            @Override // com.stripe.android.EphemeralOperation
            public Set<String> getProductUsage$payments_core_release() {
                return this.productUsage;
            }

            public int hashCode() {
                return (((this.paymentMethodId.hashCode() * 31) + getId$payments_core_release().hashCode()) * 31) + getProductUsage$payments_core_release().hashCode();
            }

            public String toString() {
                String str = this.paymentMethodId;
                String id$payments_core_release = getId$payments_core_release();
                Set<String> productUsage$payments_core_release = getProductUsage$payments_core_release();
                return "DetachPaymentMethod(paymentMethodId=" + str + ", id=" + id$payments_core_release + ", productUsage=" + productUsage$payments_core_release + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(this.paymentMethodId);
                out.writeString(this.f75252id);
                Set<String> set = this.productUsage;
                out.writeInt(set.size());
                for (String str : set) {
                    out.writeString(str);
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0002\u0010\fJ\u000e\u0010\u0018\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÀ\u0003¢\u0006\u0004\b\u001b\u0010\u0011J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÀ\u0003¢\u0006\u0002\b\u001dJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÀ\u0003¢\u0006\u0002\b\u001fJ\u000e\u0010 \u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b!J\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bHÀ\u0003¢\u0006\u0002\b#JV\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bHÆ\u0001¢\u0006\u0002\u0010%J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020\u0005HÖ\u0001J\t\u0010,\u001a\u00020\u0007HÖ\u0001J\u0019\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\t\u001a\u00020\u0007X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u00062"}, m28432d2 = {"Lcom/stripe/android/EphemeralOperation$Customer$GetPaymentMethods;", "Lcom/stripe/android/EphemeralOperation$Customer;", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "limit", "", "endingBefore", "", "startingAfter", "id", NamedConstantsKt.PRODUCT_USAGE, "", "(Lcom/stripe/android/model/PaymentMethod$Type;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "getEndingBefore$payments_core_release", "()Ljava/lang/String;", "getId$payments_core_release", "getLimit$payments_core_release", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getProductUsage$payments_core_release", "()Ljava/util/Set;", "getStartingAfter$payments_core_release", "getType$payments_core_release", "()Lcom/stripe/android/model/PaymentMethod$Type;", "component1", "component1$payments_core_release", "component2", "component2$payments_core_release", "component3", "component3$payments_core_release", "component4", "component4$payments_core_release", "component5", "component5$payments_core_release", "component6", "component6$payments_core_release", "copy", "(Lcom/stripe/android/model/PaymentMethod$Type;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Lcom/stripe/android/EphemeralOperation$Customer$GetPaymentMethods;", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class GetPaymentMethods extends Customer {
            public static final int $stable = 8;
            public static final Parcelable.Creator<GetPaymentMethods> CREATOR = new Creator();
            private final String endingBefore;

            /* renamed from: id */
            private final String f75253id;
            private final Integer limit;
            private final Set<String> productUsage;
            private final String startingAfter;
            private final PaymentMethod.Type type;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<GetPaymentMethods> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GetPaymentMethods createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    PaymentMethod.Type createFromParcel = PaymentMethod.Type.CREATOR.createFromParcel(parcel);
                    Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i = 0; i != readInt; i++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new GetPaymentMethods(createFromParcel, valueOf, readString, readString2, readString3, linkedHashSet);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GetPaymentMethods[] newArray(int i) {
                    return new GetPaymentMethods[i];
                }
            }

            public /* synthetic */ GetPaymentMethods(PaymentMethod.Type type, Integer num, String str, String str2, String str3, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(type, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, str3, set);
            }

            public static /* synthetic */ GetPaymentMethods copy$default(GetPaymentMethods getPaymentMethods, PaymentMethod.Type type, Integer num, String str, String str2, String str3, Set set, int i, Object obj) {
                if ((i & 1) != 0) {
                    type = getPaymentMethods.type;
                }
                if ((i & 2) != 0) {
                    num = getPaymentMethods.limit;
                }
                Integer num2 = num;
                if ((i & 4) != 0) {
                    str = getPaymentMethods.endingBefore;
                }
                String str4 = str;
                if ((i & 8) != 0) {
                    str2 = getPaymentMethods.startingAfter;
                }
                String str5 = str2;
                if ((i & 16) != 0) {
                    str3 = getPaymentMethods.getId$payments_core_release();
                }
                String str6 = str3;
                Set<String> set2 = set;
                if ((i & 32) != 0) {
                    set2 = getPaymentMethods.getProductUsage$payments_core_release();
                }
                return getPaymentMethods.copy(type, num2, str4, str5, str6, set2);
            }

            public final PaymentMethod.Type component1$payments_core_release() {
                return this.type;
            }

            public final Integer component2$payments_core_release() {
                return this.limit;
            }

            public final String component3$payments_core_release() {
                return this.endingBefore;
            }

            public final String component4$payments_core_release() {
                return this.startingAfter;
            }

            public final String component5$payments_core_release() {
                return getId$payments_core_release();
            }

            public final Set<String> component6$payments_core_release() {
                return getProductUsage$payments_core_release();
            }

            public final GetPaymentMethods copy(PaymentMethod.Type type, Integer num, String str, String str2, String id, Set<String> productUsage) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                return new GetPaymentMethods(type, num, str, str2, id, productUsage);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof GetPaymentMethods) {
                    GetPaymentMethods getPaymentMethods = (GetPaymentMethods) obj;
                    return this.type == getPaymentMethods.type && Intrinsics.areEqual(this.limit, getPaymentMethods.limit) && Intrinsics.areEqual(this.endingBefore, getPaymentMethods.endingBefore) && Intrinsics.areEqual(this.startingAfter, getPaymentMethods.startingAfter) && Intrinsics.areEqual(getId$payments_core_release(), getPaymentMethods.getId$payments_core_release()) && Intrinsics.areEqual(getProductUsage$payments_core_release(), getPaymentMethods.getProductUsage$payments_core_release());
                }
                return false;
            }

            public final String getEndingBefore$payments_core_release() {
                return this.endingBefore;
            }

            @Override // com.stripe.android.EphemeralOperation
            public String getId$payments_core_release() {
                return this.f75253id;
            }

            public final Integer getLimit$payments_core_release() {
                return this.limit;
            }

            @Override // com.stripe.android.EphemeralOperation
            public Set<String> getProductUsage$payments_core_release() {
                return this.productUsage;
            }

            public final String getStartingAfter$payments_core_release() {
                return this.startingAfter;
            }

            public final PaymentMethod.Type getType$payments_core_release() {
                return this.type;
            }

            public int hashCode() {
                int hashCode = this.type.hashCode() * 31;
                Integer num = this.limit;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                String str = this.endingBefore;
                int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.startingAfter;
                return ((((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + getId$payments_core_release().hashCode()) * 31) + getProductUsage$payments_core_release().hashCode();
            }

            public String toString() {
                PaymentMethod.Type type = this.type;
                Integer num = this.limit;
                String str = this.endingBefore;
                String str2 = this.startingAfter;
                String id$payments_core_release = getId$payments_core_release();
                Set<String> productUsage$payments_core_release = getProductUsage$payments_core_release();
                return "GetPaymentMethods(type=" + type + ", limit=" + num + ", endingBefore=" + str + ", startingAfter=" + str2 + ", id=" + id$payments_core_release + ", productUsage=" + productUsage$payments_core_release + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                int intValue;
                Intrinsics.checkNotNullParameter(out, "out");
                this.type.writeToParcel(out, i);
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
                out.writeString(this.f75253id);
                Set<String> set = this.productUsage;
                out.writeInt(set.size());
                for (String str : set) {
                    out.writeString(str);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GetPaymentMethods(PaymentMethod.Type type, Integer num, String str, String str2, String id, Set<String> productUsage) {
                super(null);
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                this.type = type;
                this.limit = num;
                this.endingBefore = str;
                this.startingAfter = str2;
                this.f75253id = id;
                this.productUsage = productUsage;
            }
        }

        @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000e\u0010\u0011\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0012J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÀ\u0003¢\u0006\u0002\b\u0014J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006#"}, m28432d2 = {"Lcom/stripe/android/EphemeralOperation$Customer$UpdateDefaultSource;", "Lcom/stripe/android/EphemeralOperation$Customer;", "sourceId", "", "sourceType", "id", NamedConstantsKt.PRODUCT_USAGE, "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "getId$payments_core_release", "()Ljava/lang/String;", "getProductUsage$payments_core_release", "()Ljava/util/Set;", "getSourceId", "getSourceType", "component1", "component2", "component3", "component3$payments_core_release", "component4", "component4$payments_core_release", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class UpdateDefaultSource extends Customer {
            public static final int $stable = 8;
            public static final Parcelable.Creator<UpdateDefaultSource> CREATOR = new Creator();

            /* renamed from: id */
            private final String f75254id;
            private final Set<String> productUsage;
            private final String sourceId;
            private final String sourceType;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<UpdateDefaultSource> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UpdateDefaultSource createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i = 0; i != readInt; i++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new UpdateDefaultSource(readString, readString2, readString3, linkedHashSet);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UpdateDefaultSource[] newArray(int i) {
                    return new UpdateDefaultSource[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateDefaultSource(String sourceId, String sourceType, String id, Set<String> productUsage) {
                super(null);
                Intrinsics.checkNotNullParameter(sourceId, "sourceId");
                Intrinsics.checkNotNullParameter(sourceType, "sourceType");
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                this.sourceId = sourceId;
                this.sourceType = sourceType;
                this.f75254id = id;
                this.productUsage = productUsage;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ UpdateDefaultSource copy$default(UpdateDefaultSource updateDefaultSource, String str, String str2, String str3, Set set, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = updateDefaultSource.sourceId;
                }
                if ((i & 2) != 0) {
                    str2 = updateDefaultSource.sourceType;
                }
                if ((i & 4) != 0) {
                    str3 = updateDefaultSource.getId$payments_core_release();
                }
                if ((i & 8) != 0) {
                    set = updateDefaultSource.getProductUsage$payments_core_release();
                }
                return updateDefaultSource.copy(str, str2, str3, set);
            }

            public final String component1() {
                return this.sourceId;
            }

            public final String component2() {
                return this.sourceType;
            }

            public final String component3$payments_core_release() {
                return getId$payments_core_release();
            }

            public final Set<String> component4$payments_core_release() {
                return getProductUsage$payments_core_release();
            }

            public final UpdateDefaultSource copy(String sourceId, String sourceType, String id, Set<String> productUsage) {
                Intrinsics.checkNotNullParameter(sourceId, "sourceId");
                Intrinsics.checkNotNullParameter(sourceType, "sourceType");
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                return new UpdateDefaultSource(sourceId, sourceType, id, productUsage);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof UpdateDefaultSource) {
                    UpdateDefaultSource updateDefaultSource = (UpdateDefaultSource) obj;
                    return Intrinsics.areEqual(this.sourceId, updateDefaultSource.sourceId) && Intrinsics.areEqual(this.sourceType, updateDefaultSource.sourceType) && Intrinsics.areEqual(getId$payments_core_release(), updateDefaultSource.getId$payments_core_release()) && Intrinsics.areEqual(getProductUsage$payments_core_release(), updateDefaultSource.getProductUsage$payments_core_release());
                }
                return false;
            }

            @Override // com.stripe.android.EphemeralOperation
            public String getId$payments_core_release() {
                return this.f75254id;
            }

            @Override // com.stripe.android.EphemeralOperation
            public Set<String> getProductUsage$payments_core_release() {
                return this.productUsage;
            }

            public final String getSourceId() {
                return this.sourceId;
            }

            public final String getSourceType() {
                return this.sourceType;
            }

            public int hashCode() {
                return (((((this.sourceId.hashCode() * 31) + this.sourceType.hashCode()) * 31) + getId$payments_core_release().hashCode()) * 31) + getProductUsage$payments_core_release().hashCode();
            }

            public String toString() {
                String str = this.sourceId;
                String str2 = this.sourceType;
                String id$payments_core_release = getId$payments_core_release();
                Set<String> productUsage$payments_core_release = getProductUsage$payments_core_release();
                return "UpdateDefaultSource(sourceId=" + str + ", sourceType=" + str2 + ", id=" + id$payments_core_release + ", productUsage=" + productUsage$payments_core_release + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(this.sourceId);
                out.writeString(this.sourceType);
                out.writeString(this.f75254id);
                Set<String> set = this.productUsage;
                out.writeInt(set.size());
                for (String str : set) {
                    out.writeString(str);
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000e\u0010\u0010\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u0011J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÀ\u0003¢\u0006\u0002\b\u0013J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\""}, m28432d2 = {"Lcom/stripe/android/EphemeralOperation$Customer$UpdateShipping;", "Lcom/stripe/android/EphemeralOperation$Customer;", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "id", "", NamedConstantsKt.PRODUCT_USAGE, "", "(Lcom/stripe/android/model/ShippingInformation;Ljava/lang/String;Ljava/util/Set;)V", "getId$payments_core_release", "()Ljava/lang/String;", "getProductUsage$payments_core_release", "()Ljava/util/Set;", "getShippingInformation", "()Lcom/stripe/android/model/ShippingInformation;", "component1", "component2", "component2$payments_core_release", "component3", "component3$payments_core_release", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class UpdateShipping extends Customer {
            public static final int $stable = 8;
            public static final Parcelable.Creator<UpdateShipping> CREATOR = new Creator();

            /* renamed from: id */
            private final String f75255id;
            private final Set<String> productUsage;
            private final ShippingInformation shippingInformation;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<UpdateShipping> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UpdateShipping createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    ShippingInformation createFromParcel = ShippingInformation.CREATOR.createFromParcel(parcel);
                    String readString = parcel.readString();
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i = 0; i != readInt; i++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new UpdateShipping(createFromParcel, readString, linkedHashSet);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UpdateShipping[] newArray(int i) {
                    return new UpdateShipping[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateShipping(ShippingInformation shippingInformation, String id, Set<String> productUsage) {
                super(null);
                Intrinsics.checkNotNullParameter(shippingInformation, "shippingInformation");
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                this.shippingInformation = shippingInformation;
                this.f75255id = id;
                this.productUsage = productUsage;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ UpdateShipping copy$default(UpdateShipping updateShipping, ShippingInformation shippingInformation, String str, Set set, int i, Object obj) {
                if ((i & 1) != 0) {
                    shippingInformation = updateShipping.shippingInformation;
                }
                if ((i & 2) != 0) {
                    str = updateShipping.getId$payments_core_release();
                }
                if ((i & 4) != 0) {
                    set = updateShipping.getProductUsage$payments_core_release();
                }
                return updateShipping.copy(shippingInformation, str, set);
            }

            public final ShippingInformation component1() {
                return this.shippingInformation;
            }

            public final String component2$payments_core_release() {
                return getId$payments_core_release();
            }

            public final Set<String> component3$payments_core_release() {
                return getProductUsage$payments_core_release();
            }

            public final UpdateShipping copy(ShippingInformation shippingInformation, String id, Set<String> productUsage) {
                Intrinsics.checkNotNullParameter(shippingInformation, "shippingInformation");
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                return new UpdateShipping(shippingInformation, id, productUsage);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof UpdateShipping) {
                    UpdateShipping updateShipping = (UpdateShipping) obj;
                    return Intrinsics.areEqual(this.shippingInformation, updateShipping.shippingInformation) && Intrinsics.areEqual(getId$payments_core_release(), updateShipping.getId$payments_core_release()) && Intrinsics.areEqual(getProductUsage$payments_core_release(), updateShipping.getProductUsage$payments_core_release());
                }
                return false;
            }

            @Override // com.stripe.android.EphemeralOperation
            public String getId$payments_core_release() {
                return this.f75255id;
            }

            @Override // com.stripe.android.EphemeralOperation
            public Set<String> getProductUsage$payments_core_release() {
                return this.productUsage;
            }

            public final ShippingInformation getShippingInformation() {
                return this.shippingInformation;
            }

            public int hashCode() {
                return (((this.shippingInformation.hashCode() * 31) + getId$payments_core_release().hashCode()) * 31) + getProductUsage$payments_core_release().hashCode();
            }

            public String toString() {
                ShippingInformation shippingInformation = this.shippingInformation;
                String id$payments_core_release = getId$payments_core_release();
                Set<String> productUsage$payments_core_release = getProductUsage$payments_core_release();
                return "UpdateShipping(shippingInformation=" + shippingInformation + ", id=" + id$payments_core_release + ", productUsage=" + productUsage$payments_core_release + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                this.shippingInformation.writeToParcel(out, i);
                out.writeString(this.f75255id);
                Set<String> set = this.productUsage;
                out.writeInt(set.size());
                for (String str : set) {
                    out.writeString(str);
                }
            }
        }

        public /* synthetic */ Customer(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Customer() {
            super(null);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\b\tB\u0017\b\u0004\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/EphemeralOperation$Issuing;", "Lcom/stripe/android/EphemeralOperation;", NamedConstantsKt.PRODUCT_USAGE, "", "", "(Ljava/util/Set;)V", "getProductUsage$payments_core_release", "()Ljava/util/Set;", "RetrievePin", "UpdatePin", "Lcom/stripe/android/EphemeralOperation$Issuing$RetrievePin;", "Lcom/stripe/android/EphemeralOperation$Issuing$UpdatePin;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static abstract class Issuing extends EphemeralOperation {
        private final Set<String> productUsage;

        @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000e\u0010\u0010\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0011J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0006\u001a\u00020\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006 "}, m28432d2 = {"Lcom/stripe/android/EphemeralOperation$Issuing$RetrievePin;", "Lcom/stripe/android/EphemeralOperation$Issuing;", "cardId", "", "verificationId", "userOneTimeCode", "id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCardId", "()Ljava/lang/String;", "getId$payments_core_release", "getUserOneTimeCode", "getVerificationId", "component1", "component2", "component3", "component4", "component4$payments_core_release", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class RetrievePin extends Issuing {
            public static final int $stable = 0;
            public static final Parcelable.Creator<RetrievePin> CREATOR = new Creator();
            private final String cardId;

            /* renamed from: id */
            private final String f75256id;
            private final String userOneTimeCode;
            private final String verificationId;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<RetrievePin> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RetrievePin createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new RetrievePin(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RetrievePin[] newArray(int i) {
                    return new RetrievePin[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RetrievePin(String cardId, String verificationId, String userOneTimeCode, String id) {
                super(null, 1, null);
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                Intrinsics.checkNotNullParameter(verificationId, "verificationId");
                Intrinsics.checkNotNullParameter(userOneTimeCode, "userOneTimeCode");
                Intrinsics.checkNotNullParameter(id, "id");
                this.cardId = cardId;
                this.verificationId = verificationId;
                this.userOneTimeCode = userOneTimeCode;
                this.f75256id = id;
            }

            public static /* synthetic */ RetrievePin copy$default(RetrievePin retrievePin, String str, String str2, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = retrievePin.cardId;
                }
                if ((i & 2) != 0) {
                    str2 = retrievePin.verificationId;
                }
                if ((i & 4) != 0) {
                    str3 = retrievePin.userOneTimeCode;
                }
                if ((i & 8) != 0) {
                    str4 = retrievePin.getId$payments_core_release();
                }
                return retrievePin.copy(str, str2, str3, str4);
            }

            public final String component1() {
                return this.cardId;
            }

            public final String component2() {
                return this.verificationId;
            }

            public final String component3() {
                return this.userOneTimeCode;
            }

            public final String component4$payments_core_release() {
                return getId$payments_core_release();
            }

            public final RetrievePin copy(String cardId, String verificationId, String userOneTimeCode, String id) {
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                Intrinsics.checkNotNullParameter(verificationId, "verificationId");
                Intrinsics.checkNotNullParameter(userOneTimeCode, "userOneTimeCode");
                Intrinsics.checkNotNullParameter(id, "id");
                return new RetrievePin(cardId, verificationId, userOneTimeCode, id);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof RetrievePin) {
                    RetrievePin retrievePin = (RetrievePin) obj;
                    return Intrinsics.areEqual(this.cardId, retrievePin.cardId) && Intrinsics.areEqual(this.verificationId, retrievePin.verificationId) && Intrinsics.areEqual(this.userOneTimeCode, retrievePin.userOneTimeCode) && Intrinsics.areEqual(getId$payments_core_release(), retrievePin.getId$payments_core_release());
                }
                return false;
            }

            public final String getCardId() {
                return this.cardId;
            }

            @Override // com.stripe.android.EphemeralOperation
            public String getId$payments_core_release() {
                return this.f75256id;
            }

            public final String getUserOneTimeCode() {
                return this.userOneTimeCode;
            }

            public final String getVerificationId() {
                return this.verificationId;
            }

            public int hashCode() {
                return (((((this.cardId.hashCode() * 31) + this.verificationId.hashCode()) * 31) + this.userOneTimeCode.hashCode()) * 31) + getId$payments_core_release().hashCode();
            }

            public String toString() {
                String str = this.cardId;
                String str2 = this.verificationId;
                String str3 = this.userOneTimeCode;
                String id$payments_core_release = getId$payments_core_release();
                return "RetrievePin(cardId=" + str + ", verificationId=" + str2 + ", userOneTimeCode=" + str3 + ", id=" + id$payments_core_release + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(this.cardId);
                out.writeString(this.verificationId);
                out.writeString(this.userOneTimeCode);
                out.writeString(this.f75256id);
            }
        }

        @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000e\u0010\u0013\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0014J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0007\u001a\u00020\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006#"}, m28432d2 = {"Lcom/stripe/android/EphemeralOperation$Issuing$UpdatePin;", "Lcom/stripe/android/EphemeralOperation$Issuing;", "cardId", "", "newPin", "verificationId", "userOneTimeCode", "id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCardId", "()Ljava/lang/String;", "getId$payments_core_release", "getNewPin", "getUserOneTimeCode", "getVerificationId", "component1", "component2", "component3", "component4", "component5", "component5$payments_core_release", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class UpdatePin extends Issuing {
            public static final int $stable = 0;
            public static final Parcelable.Creator<UpdatePin> CREATOR = new Creator();
            private final String cardId;

            /* renamed from: id */
            private final String f75257id;
            private final String newPin;
            private final String userOneTimeCode;
            private final String verificationId;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<UpdatePin> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UpdatePin createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new UpdatePin(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UpdatePin[] newArray(int i) {
                    return new UpdatePin[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdatePin(String cardId, String newPin, String verificationId, String userOneTimeCode, String id) {
                super(null, 1, null);
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                Intrinsics.checkNotNullParameter(newPin, "newPin");
                Intrinsics.checkNotNullParameter(verificationId, "verificationId");
                Intrinsics.checkNotNullParameter(userOneTimeCode, "userOneTimeCode");
                Intrinsics.checkNotNullParameter(id, "id");
                this.cardId = cardId;
                this.newPin = newPin;
                this.verificationId = verificationId;
                this.userOneTimeCode = userOneTimeCode;
                this.f75257id = id;
            }

            public static /* synthetic */ UpdatePin copy$default(UpdatePin updatePin, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = updatePin.cardId;
                }
                if ((i & 2) != 0) {
                    str2 = updatePin.newPin;
                }
                String str6 = str2;
                if ((i & 4) != 0) {
                    str3 = updatePin.verificationId;
                }
                String str7 = str3;
                if ((i & 8) != 0) {
                    str4 = updatePin.userOneTimeCode;
                }
                String str8 = str4;
                if ((i & 16) != 0) {
                    str5 = updatePin.getId$payments_core_release();
                }
                return updatePin.copy(str, str6, str7, str8, str5);
            }

            public final String component1() {
                return this.cardId;
            }

            public final String component2() {
                return this.newPin;
            }

            public final String component3() {
                return this.verificationId;
            }

            public final String component4() {
                return this.userOneTimeCode;
            }

            public final String component5$payments_core_release() {
                return getId$payments_core_release();
            }

            public final UpdatePin copy(String cardId, String newPin, String verificationId, String userOneTimeCode, String id) {
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                Intrinsics.checkNotNullParameter(newPin, "newPin");
                Intrinsics.checkNotNullParameter(verificationId, "verificationId");
                Intrinsics.checkNotNullParameter(userOneTimeCode, "userOneTimeCode");
                Intrinsics.checkNotNullParameter(id, "id");
                return new UpdatePin(cardId, newPin, verificationId, userOneTimeCode, id);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof UpdatePin) {
                    UpdatePin updatePin = (UpdatePin) obj;
                    return Intrinsics.areEqual(this.cardId, updatePin.cardId) && Intrinsics.areEqual(this.newPin, updatePin.newPin) && Intrinsics.areEqual(this.verificationId, updatePin.verificationId) && Intrinsics.areEqual(this.userOneTimeCode, updatePin.userOneTimeCode) && Intrinsics.areEqual(getId$payments_core_release(), updatePin.getId$payments_core_release());
                }
                return false;
            }

            public final String getCardId() {
                return this.cardId;
            }

            @Override // com.stripe.android.EphemeralOperation
            public String getId$payments_core_release() {
                return this.f75257id;
            }

            public final String getNewPin() {
                return this.newPin;
            }

            public final String getUserOneTimeCode() {
                return this.userOneTimeCode;
            }

            public final String getVerificationId() {
                return this.verificationId;
            }

            public int hashCode() {
                return (((((((this.cardId.hashCode() * 31) + this.newPin.hashCode()) * 31) + this.verificationId.hashCode()) * 31) + this.userOneTimeCode.hashCode()) * 31) + getId$payments_core_release().hashCode();
            }

            public String toString() {
                String str = this.cardId;
                String str2 = this.newPin;
                String str3 = this.verificationId;
                String str4 = this.userOneTimeCode;
                String id$payments_core_release = getId$payments_core_release();
                return "UpdatePin(cardId=" + str + ", newPin=" + str2 + ", verificationId=" + str3 + ", userOneTimeCode=" + str4 + ", id=" + id$payments_core_release + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(this.cardId);
                out.writeString(this.newPin);
                out.writeString(this.verificationId);
                out.writeString(this.userOneTimeCode);
                out.writeString(this.f75257id);
            }
        }

        public /* synthetic */ Issuing(Set set, DefaultConstructorMarker defaultConstructorMarker) {
            this(set);
        }

        @Override // com.stripe.android.EphemeralOperation
        public Set<String> getProductUsage$payments_core_release() {
            return this.productUsage;
        }

        public /* synthetic */ Issuing(Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? SetsKt__SetsKt.emptySet() : set, null);
        }

        private Issuing(Set<String> set) {
            super(null);
            this.productUsage = set;
        }
    }

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\fJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÀ\u0003¢\u0006\u0002\b\u000eJ#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001d"}, m28432d2 = {"Lcom/stripe/android/EphemeralOperation$RetrieveKey;", "Lcom/stripe/android/EphemeralOperation;", "id", "", NamedConstantsKt.PRODUCT_USAGE, "", "(Ljava/lang/String;Ljava/util/Set;)V", "getId$payments_core_release", "()Ljava/lang/String;", "getProductUsage$payments_core_release", "()Ljava/util/Set;", "component1", "component1$payments_core_release", "component2", "component2$payments_core_release", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class RetrieveKey extends EphemeralOperation {
        public static final Parcelable.Creator<RetrieveKey> CREATOR = new Creator();

        /* renamed from: id */
        private final String f75258id;
        private final Set<String> productUsage;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<RetrieveKey> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RetrieveKey createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashSet.add(parcel.readString());
                }
                return new RetrieveKey(readString, linkedHashSet);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RetrieveKey[] newArray(int i) {
                return new RetrieveKey[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RetrieveKey(String id, Set<String> productUsage) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(productUsage, "productUsage");
            this.f75258id = id;
            this.productUsage = productUsage;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RetrieveKey copy$default(RetrieveKey retrieveKey, String str, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                str = retrieveKey.getId$payments_core_release();
            }
            if ((i & 2) != 0) {
                set = retrieveKey.getProductUsage$payments_core_release();
            }
            return retrieveKey.copy(str, set);
        }

        public final String component1$payments_core_release() {
            return getId$payments_core_release();
        }

        public final Set<String> component2$payments_core_release() {
            return getProductUsage$payments_core_release();
        }

        public final RetrieveKey copy(String id, Set<String> productUsage) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(productUsage, "productUsage");
            return new RetrieveKey(id, productUsage);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RetrieveKey) {
                RetrieveKey retrieveKey = (RetrieveKey) obj;
                return Intrinsics.areEqual(getId$payments_core_release(), retrieveKey.getId$payments_core_release()) && Intrinsics.areEqual(getProductUsage$payments_core_release(), retrieveKey.getProductUsage$payments_core_release());
            }
            return false;
        }

        @Override // com.stripe.android.EphemeralOperation
        public String getId$payments_core_release() {
            return this.f75258id;
        }

        @Override // com.stripe.android.EphemeralOperation
        public Set<String> getProductUsage$payments_core_release() {
            return this.productUsage;
        }

        public int hashCode() {
            return (getId$payments_core_release().hashCode() * 31) + getProductUsage$payments_core_release().hashCode();
        }

        public String toString() {
            String id$payments_core_release = getId$payments_core_release();
            Set<String> productUsage$payments_core_release = getProductUsage$payments_core_release();
            return "RetrieveKey(id=" + id$payments_core_release + ", productUsage=" + productUsage$payments_core_release + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.f75258id);
            Set<String> set = this.productUsage;
            out.writeInt(set.size());
            for (String str : set) {
                out.writeString(str);
            }
        }
    }

    public /* synthetic */ EphemeralOperation(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getId$payments_core_release();

    public abstract Set<String> getProductUsage$payments_core_release();

    private EphemeralOperation() {
    }
}
