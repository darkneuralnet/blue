package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0003 !\"B%\b\u0007\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\u0014\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00150\u0018H\u0016J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006#"}, m28432d2 = {"Lcom/stripe/android/model/SourceOrderParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", SourceOrderParams.PARAM_ITEMS, "", "Lcom/stripe/android/model/SourceOrderParams$Item;", SourceOrderParams.PARAM_SHIPPING, "Lcom/stripe/android/model/SourceOrderParams$Shipping;", "(Ljava/util/List;Lcom/stripe/android/model/SourceOrderParams$Shipping;)V", "getItems", "()Ljava/util/List;", "getShipping", "()Lcom/stripe/android/model/SourceOrderParams$Shipping;", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toParamMap", "", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "Item", "Shipping", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nSourceOrderParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SourceOrderParams.kt\ncom/stripe/android/model/SourceOrderParams\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,180:1\n1549#2:181\n1620#2,3:182\n1#3:185\n*S KotlinDebug\n*F\n+ 1 SourceOrderParams.kt\ncom/stripe/android/model/SourceOrderParams\n*L\n30#1:181\n30#1:182,3\n*E\n"})
/* loaded from: classes7.dex */
public final class SourceOrderParams implements StripeParamsModel, Parcelable {
    @Deprecated
    private static final String PARAM_ITEMS = "items";
    @Deprecated
    private static final String PARAM_SHIPPING = "shipping";
    private final List<Item> items;
    private final Shipping shipping;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SourceOrderParams> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/model/SourceOrderParams$Companion;", "", "()V", "PARAM_ITEMS", "", "PARAM_SHIPPING", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
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
    public static final class Creator implements Parcelable.Creator<SourceOrderParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SourceOrderParams createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(Item.CREATOR.createFromParcel(parcel));
                }
            }
            return new SourceOrderParams(arrayList, parcel.readInt() != 0 ? Shipping.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SourceOrderParams[] newArray(int i) {
            return new SourceOrderParams[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0002-.BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJV\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u001eJ\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0006HÖ\u0001J\u0014\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020#0&H\u0016J\t\u0010'\u001a\u00020\bHÖ\u0001J\u0019\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006/"}, m28432d2 = {"Lcom/stripe/android/model/SourceOrderParams$Item;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "type", "Lcom/stripe/android/model/SourceOrderParams$Item$Type;", Item.PARAM_AMOUNT, "", Item.PARAM_CURRENCY, "", Item.PARAM_DESCRIPTION, Item.PARAM_PARENT, Item.PARAM_QUANTITY, "(Lcom/stripe/android/model/SourceOrderParams$Item$Type;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCurrency", "()Ljava/lang/String;", "getDescription", "getParent", "getQuantity", "getType", "()Lcom/stripe/android/model/SourceOrderParams$Item$Type;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/stripe/android/model/SourceOrderParams$Item$Type;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/stripe/android/model/SourceOrderParams$Item;", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "Type", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nSourceOrderParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SourceOrderParams.kt\ncom/stripe/android/model/SourceOrderParams$Item\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,180:1\n1#2:181\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class Item implements StripeParamsModel, Parcelable {
        public static final int $stable = 0;
        @Deprecated
        private static final String PARAM_AMOUNT = "amount";
        @Deprecated
        private static final String PARAM_CURRENCY = "currency";
        @Deprecated
        private static final String PARAM_DESCRIPTION = "description";
        @Deprecated
        private static final String PARAM_PARENT = "parent";
        @Deprecated
        private static final String PARAM_QUANTITY = "quantity";
        @Deprecated
        private static final String PARAM_TYPE = "type";
        private final Integer amount;
        private final String currency;
        private final String description;
        private final String parent;
        private final Integer quantity;
        private final Type type;
        private static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Item> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/model/SourceOrderParams$Item$Companion;", "", "()V", "PARAM_AMOUNT", "", "PARAM_CURRENCY", "PARAM_DESCRIPTION", "PARAM_PARENT", "PARAM_QUANTITY", "PARAM_TYPE", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
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
        public static final class Creator implements Parcelable.Creator<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Item createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Item(parcel.readInt() == 0 ? null : Type.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Item[] newArray(int i) {
                return new Item[i];
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/model/SourceOrderParams$Item$Type;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_release", "()Ljava/lang/String;", "Sku", "Tax", "Shipping", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public enum Type {
            Sku("sku"),
            Tax("tax"),
            Shipping(SourceOrderParams.PARAM_SHIPPING);
            
            private final String code;

            Type(String str) {
                this.code = str;
            }

            public final String getCode$payments_core_release() {
                return this.code;
            }
        }

        public Item() {
            this(null, null, null, null, null, null, 63, null);
        }

        public static /* synthetic */ Item copy$default(Item item, Type type, Integer num, String str, String str2, String str3, Integer num2, int i, Object obj) {
            if ((i & 1) != 0) {
                type = item.type;
            }
            if ((i & 2) != 0) {
                num = item.amount;
            }
            Integer num3 = num;
            if ((i & 4) != 0) {
                str = item.currency;
            }
            String str4 = str;
            if ((i & 8) != 0) {
                str2 = item.description;
            }
            String str5 = str2;
            if ((i & 16) != 0) {
                str3 = item.parent;
            }
            String str6 = str3;
            if ((i & 32) != 0) {
                num2 = item.quantity;
            }
            return item.copy(type, num3, str4, str5, str6, num2);
        }

        public final Type component1() {
            return this.type;
        }

        public final Integer component2() {
            return this.amount;
        }

        public final String component3() {
            return this.currency;
        }

        public final String component4() {
            return this.description;
        }

        public final String component5() {
            return this.parent;
        }

        public final Integer component6() {
            return this.quantity;
        }

        public final Item copy(Type type, Integer num, String str, String str2, String str3, Integer num2) {
            return new Item(type, num, str, str2, str3, num2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Item) {
                Item item = (Item) obj;
                return this.type == item.type && Intrinsics.areEqual(this.amount, item.amount) && Intrinsics.areEqual(this.currency, item.currency) && Intrinsics.areEqual(this.description, item.description) && Intrinsics.areEqual(this.parent, item.parent) && Intrinsics.areEqual(this.quantity, item.quantity);
            }
            return false;
        }

        public final Integer getAmount() {
            return this.amount;
        }

        public final String getCurrency() {
            return this.currency;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getParent() {
            return this.parent;
        }

        public final Integer getQuantity() {
            return this.quantity;
        }

        public final Type getType() {
            return this.type;
        }

        public int hashCode() {
            Type type = this.type;
            int hashCode = (type == null ? 0 : type.hashCode()) * 31;
            Integer num = this.amount;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.currency;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.description;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.parent;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num2 = this.quantity;
            return hashCode5 + (num2 != null ? num2.hashCode() : 0);
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
            Map map4;
            Map plus4;
            Map map5;
            Map plus5;
            Map<String, Object> plus6;
            emptyMap = MapsKt__MapsKt.emptyMap();
            Integer num = this.amount;
            Map map6 = null;
            if (num != null) {
                map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_AMOUNT, Integer.valueOf(num.intValue())));
            } else {
                map = null;
            }
            if (map == null) {
                map = MapsKt__MapsKt.emptyMap();
            }
            plus = MapsKt__MapsKt.plus(emptyMap, map);
            String str = this.currency;
            if (str != null) {
                map2 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_CURRENCY, str));
            } else {
                map2 = null;
            }
            if (map2 == null) {
                map2 = MapsKt__MapsKt.emptyMap();
            }
            plus2 = MapsKt__MapsKt.plus(plus, map2);
            String str2 = this.description;
            if (str2 != null) {
                map3 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_DESCRIPTION, str2));
            } else {
                map3 = null;
            }
            if (map3 == null) {
                map3 = MapsKt__MapsKt.emptyMap();
            }
            plus3 = MapsKt__MapsKt.plus(plus2, map3);
            String str3 = this.parent;
            if (str3 != null) {
                map4 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_PARENT, str3));
            } else {
                map4 = null;
            }
            if (map4 == null) {
                map4 = MapsKt__MapsKt.emptyMap();
            }
            plus4 = MapsKt__MapsKt.plus(plus3, map4);
            Integer num2 = this.quantity;
            if (num2 != null) {
                map5 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_QUANTITY, Integer.valueOf(num2.intValue())));
            } else {
                map5 = null;
            }
            if (map5 == null) {
                map5 = MapsKt__MapsKt.emptyMap();
            }
            plus5 = MapsKt__MapsKt.plus(plus4, map5);
            Type type = this.type;
            if (type != null) {
                map6 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("type", type.getCode$payments_core_release()));
            }
            if (map6 == null) {
                map6 = MapsKt__MapsKt.emptyMap();
            }
            plus6 = MapsKt__MapsKt.plus(plus5, map6);
            return plus6;
        }

        public String toString() {
            Type type = this.type;
            Integer num = this.amount;
            String str = this.currency;
            String str2 = this.description;
            String str3 = this.parent;
            Integer num2 = this.quantity;
            return "Item(type=" + type + ", amount=" + num + ", currency=" + str + ", description=" + str2 + ", parent=" + str3 + ", quantity=" + num2 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            Type type = this.type;
            if (type == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(type.name());
            }
            Integer num = this.amount;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            out.writeString(this.currency);
            out.writeString(this.description);
            out.writeString(this.parent);
            Integer num2 = this.quantity;
            if (num2 == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }

        public Item(Type type, Integer num, String str, String str2, String str3, Integer num2) {
            this.type = type;
            this.amount = num;
            this.currency = str;
            this.description = str2;
            this.parent = str3;
            this.quantity = num2;
        }

        public /* synthetic */ Item(Type type, Integer num, String str, String str2, String str3, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : type, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : num2);
        }
    }

    @JvmOverloads
    public SourceOrderParams() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SourceOrderParams copy$default(SourceOrderParams sourceOrderParams, List list, Shipping shipping, int i, Object obj) {
        if ((i & 1) != 0) {
            list = sourceOrderParams.items;
        }
        if ((i & 2) != 0) {
            shipping = sourceOrderParams.shipping;
        }
        return sourceOrderParams.copy(list, shipping);
    }

    public final List<Item> component1() {
        return this.items;
    }

    public final Shipping component2() {
        return this.shipping;
    }

    public final SourceOrderParams copy(List<Item> list, Shipping shipping) {
        return new SourceOrderParams(list, shipping);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SourceOrderParams) {
            SourceOrderParams sourceOrderParams = (SourceOrderParams) obj;
            return Intrinsics.areEqual(this.items, sourceOrderParams.items) && Intrinsics.areEqual(this.shipping, sourceOrderParams.shipping);
        }
        return false;
    }

    public final List<Item> getItems() {
        return this.items;
    }

    public final Shipping getShipping() {
        return this.shipping;
    }

    public int hashCode() {
        List<Item> list = this.items;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Shipping shipping = this.shipping;
        return hashCode + (shipping != null ? shipping.hashCode() : 0);
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        Map emptyMap;
        Map map;
        Map plus;
        Map<String, Object> plus2;
        int collectionSizeOrDefault;
        emptyMap = MapsKt__MapsKt.emptyMap();
        List<Item> list = this.items;
        Map map2 = null;
        if (list != null) {
            List<Item> list2 = list;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (Item item : list2) {
                arrayList.add(item.toParamMap());
            }
            map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_ITEMS, arrayList));
        } else {
            map = null;
        }
        if (map == null) {
            map = MapsKt__MapsKt.emptyMap();
        }
        plus = MapsKt__MapsKt.plus(emptyMap, map);
        Shipping shipping = this.shipping;
        if (shipping != null) {
            map2 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_SHIPPING, shipping.toParamMap()));
        }
        if (map2 == null) {
            map2 = MapsKt__MapsKt.emptyMap();
        }
        plus2 = MapsKt__MapsKt.plus(plus, map2);
        return plus2;
    }

    public String toString() {
        List<Item> list = this.items;
        Shipping shipping = this.shipping;
        return "SourceOrderParams(items=" + list + ", shipping=" + shipping + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        List<Item> list = this.items;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            for (Item item : list) {
                item.writeToParcel(out, i);
            }
        }
        Shipping shipping = this.shipping;
        if (shipping == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        shipping.writeToParcel(out, i);
    }

    @JvmOverloads
    public SourceOrderParams(List<Item> list) {
        this(list, null, 2, null);
    }

    @JvmOverloads
    public SourceOrderParams(List<Item> list, Shipping shipping) {
        this.items = list;
        this.shipping = shipping;
    }

    @Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003JC\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\u0014\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001d0 H\u0016J\t\u0010!\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006("}, m28432d2 = {"Lcom/stripe/android/model/SourceOrderParams$Shipping;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "address", "Lcom/stripe/android/model/Address;", Shipping.PARAM_CARRIER, "", "name", "phone", "trackingNumber", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Lcom/stripe/android/model/Address;", "getCarrier", "()Ljava/lang/String;", "getName", "getPhone", "getTrackingNumber", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nSourceOrderParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SourceOrderParams.kt\ncom/stripe/android/model/SourceOrderParams$Shipping\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,180:1\n1#2:181\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class Shipping implements StripeParamsModel, Parcelable {
        public static final int $stable = 0;
        @Deprecated
        private static final String PARAM_ADDRESS = "address";
        @Deprecated
        private static final String PARAM_CARRIER = "carrier";
        @Deprecated
        private static final String PARAM_NAME = "name";
        @Deprecated
        private static final String PARAM_PHONE = "phone";
        @Deprecated
        private static final String PARAM_TRACKING_NUMBER = "tracking_number";
        private final Address address;
        private final String carrier;
        private final String name;
        private final String phone;
        private final String trackingNumber;
        private static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Shipping> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/model/SourceOrderParams$Shipping$Companion;", "", "()V", "PARAM_ADDRESS", "", "PARAM_CARRIER", "PARAM_NAME", "PARAM_PHONE", "PARAM_TRACKING_NUMBER", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
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
        public static final class Creator implements Parcelable.Creator<Shipping> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Shipping createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Shipping(Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Shipping[] newArray(int i) {
                return new Shipping[i];
            }
        }

        public Shipping(Address address, String str, String str2, String str3, String str4) {
            Intrinsics.checkNotNullParameter(address, "address");
            this.address = address;
            this.carrier = str;
            this.name = str2;
            this.phone = str3;
            this.trackingNumber = str4;
        }

        public static /* synthetic */ Shipping copy$default(Shipping shipping, Address address, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                address = shipping.address;
            }
            if ((i & 2) != 0) {
                str = shipping.carrier;
            }
            String str5 = str;
            if ((i & 4) != 0) {
                str2 = shipping.name;
            }
            String str6 = str2;
            if ((i & 8) != 0) {
                str3 = shipping.phone;
            }
            String str7 = str3;
            if ((i & 16) != 0) {
                str4 = shipping.trackingNumber;
            }
            return shipping.copy(address, str5, str6, str7, str4);
        }

        public final Address component1() {
            return this.address;
        }

        public final String component2() {
            return this.carrier;
        }

        public final String component3() {
            return this.name;
        }

        public final String component4() {
            return this.phone;
        }

        public final String component5() {
            return this.trackingNumber;
        }

        public final Shipping copy(Address address, String str, String str2, String str3, String str4) {
            Intrinsics.checkNotNullParameter(address, "address");
            return new Shipping(address, str, str2, str3, str4);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Shipping) {
                Shipping shipping = (Shipping) obj;
                return Intrinsics.areEqual(this.address, shipping.address) && Intrinsics.areEqual(this.carrier, shipping.carrier) && Intrinsics.areEqual(this.name, shipping.name) && Intrinsics.areEqual(this.phone, shipping.phone) && Intrinsics.areEqual(this.trackingNumber, shipping.trackingNumber);
            }
            return false;
        }

        public final Address getAddress() {
            return this.address;
        }

        public final String getCarrier() {
            return this.carrier;
        }

        public final String getName() {
            return this.name;
        }

        public final String getPhone() {
            return this.phone;
        }

        public final String getTrackingNumber() {
            return this.trackingNumber;
        }

        public int hashCode() {
            int hashCode = this.address.hashCode() * 31;
            String str = this.carrier;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phone;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.trackingNumber;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map mapOf;
            Map map;
            Map plus;
            Map map2;
            Map plus2;
            Map map3;
            Map plus3;
            Map<String, Object> plus4;
            mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("address", this.address.toParamMap()));
            String str = this.carrier;
            Map map4 = null;
            if (str != null) {
                map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_CARRIER, str));
            } else {
                map = null;
            }
            if (map == null) {
                map = MapsKt__MapsKt.emptyMap();
            }
            plus = MapsKt__MapsKt.plus(mapOf, map);
            String str2 = this.name;
            if (str2 != null) {
                map2 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("name", str2));
            } else {
                map2 = null;
            }
            if (map2 == null) {
                map2 = MapsKt__MapsKt.emptyMap();
            }
            plus2 = MapsKt__MapsKt.plus(plus, map2);
            String str3 = this.phone;
            if (str3 != null) {
                map3 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("phone", str3));
            } else {
                map3 = null;
            }
            if (map3 == null) {
                map3 = MapsKt__MapsKt.emptyMap();
            }
            plus3 = MapsKt__MapsKt.plus(plus2, map3);
            String str4 = this.trackingNumber;
            if (str4 != null) {
                map4 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_TRACKING_NUMBER, str4));
            }
            if (map4 == null) {
                map4 = MapsKt__MapsKt.emptyMap();
            }
            plus4 = MapsKt__MapsKt.plus(plus3, map4);
            return plus4;
        }

        public String toString() {
            Address address = this.address;
            String str = this.carrier;
            String str2 = this.name;
            String str3 = this.phone;
            String str4 = this.trackingNumber;
            return "Shipping(address=" + address + ", carrier=" + str + ", name=" + str2 + ", phone=" + str3 + ", trackingNumber=" + str4 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.address.writeToParcel(out, i);
            out.writeString(this.carrier);
            out.writeString(this.name);
            out.writeString(this.phone);
            out.writeString(this.trackingNumber);
        }

        public /* synthetic */ Shipping(Address address, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(address, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
        }
    }

    public /* synthetic */ SourceOrderParams(List list, Shipping shipping, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : shipping);
    }
}
