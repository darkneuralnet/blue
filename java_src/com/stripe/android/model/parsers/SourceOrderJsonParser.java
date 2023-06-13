package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.SourceOrder;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.json.JSONArray;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\t\n\u000bB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/model/parsers/SourceOrderJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/SourceOrder;", "()V", "itemJsonParser", "Lcom/stripe/android/model/parsers/SourceOrderJsonParser$ItemJsonParser;", "parse", "json", "Lorg/json/JSONObject;", "Companion", "ItemJsonParser", "ShippingJsonParser", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nSourceOrderJsonParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SourceOrderJsonParser.kt\ncom/stripe/android/model/parsers/SourceOrderJsonParser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1549#2:88\n1620#2,3:89\n1603#2,9:92\n1855#2:101\n1856#2:103\n1612#2:104\n1#3:102\n*S KotlinDebug\n*F\n+ 1 SourceOrderJsonParser.kt\ncom/stripe/android/model/parsers/SourceOrderJsonParser\n*L\n16#1:88\n16#1:89,3\n17#1:92,9\n17#1:101\n17#1:103\n17#1:104\n17#1:102\n*E\n"})
/* loaded from: classes7.dex */
public final class SourceOrderJsonParser implements ModelJsonParser<SourceOrder> {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String FIELD_AMOUNT = "amount";
    @Deprecated
    private static final String FIELD_CURRENCY = "currency";
    @Deprecated
    private static final String FIELD_EMAIL = "email";
    @Deprecated
    private static final String FIELD_ITEMS = "items";
    @Deprecated
    private static final String FIELD_SHIPPING = "shipping";
    private final ItemJsonParser itemJsonParser = new ItemJsonParser();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/model/parsers/SourceOrderJsonParser$Companion;", "", "()V", "FIELD_AMOUNT", "", "FIELD_CURRENCY", "FIELD_EMAIL", "FIELD_ITEMS", "FIELD_SHIPPING", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/SourceOrderJsonParser$ItemJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/SourceOrder$Item;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class ItemJsonParser implements ModelJsonParser<SourceOrder.Item> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_AMOUNT = "amount";
        @Deprecated
        private static final String FIELD_CURRENCY = "currency";
        @Deprecated
        private static final String FIELD_DESCRIPTION = "description";
        @Deprecated
        private static final String FIELD_QUANTITY = "quantity";
        @Deprecated
        private static final String FIELD_TYPE = "type";

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/model/parsers/SourceOrderJsonParser$ItemJsonParser$Companion;", "", "()V", "FIELD_AMOUNT", "", "FIELD_CURRENCY", "FIELD_DESCRIPTION", "FIELD_QUANTITY", "FIELD_TYPE", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public SourceOrder.Item parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            SourceOrder.Item.Type fromCode$payments_core_release = SourceOrder.Item.Type.Companion.fromCode$payments_core_release(StripeJsonUtils.optString(json, "type"));
            if (fromCode$payments_core_release != null) {
                StripeJsonUtils stripeJsonUtils = StripeJsonUtils.INSTANCE;
                return new SourceOrder.Item(fromCode$payments_core_release, stripeJsonUtils.optInteger(json, FIELD_AMOUNT), StripeJsonUtils.optString(json, FIELD_CURRENCY), StripeJsonUtils.optString(json, FIELD_DESCRIPTION), stripeJsonUtils.optInteger(json, FIELD_QUANTITY));
            }
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/SourceOrderJsonParser$ShippingJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/SourceOrder$Shipping;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class ShippingJsonParser implements ModelJsonParser<SourceOrder.Shipping> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_ADDRESS = "address";
        @Deprecated
        private static final String FIELD_CARRIER = "carrier";
        @Deprecated
        private static final String FIELD_NAME = "name";
        @Deprecated
        private static final String FIELD_PHONE = "phone";
        @Deprecated
        private static final String FIELD_TRACKING_NUMBER = "tracking_number";

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/model/parsers/SourceOrderJsonParser$ShippingJsonParser$Companion;", "", "()V", "FIELD_ADDRESS", "", "FIELD_CARRIER", "FIELD_NAME", "FIELD_PHONE", "FIELD_TRACKING_NUMBER", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public SourceOrder.Shipping parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            JSONObject optJSONObject = json.optJSONObject("address");
            return new SourceOrder.Shipping(optJSONObject != null ? new AddressJsonParser().parse(optJSONObject) : null, StripeJsonUtils.optString(json, FIELD_CARRIER), StripeJsonUtils.optString(json, "name"), StripeJsonUtils.optString(json, "phone"), StripeJsonUtils.optString(json, FIELD_TRACKING_NUMBER));
        }
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public SourceOrder parse(JSONObject json) {
        IntRange until;
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(json, "json");
        JSONArray optJSONArray = json.optJSONArray(FIELD_ITEMS);
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        until = RangesKt___RangesKt.until(0, optJSONArray.length());
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
        ArrayList<JSONObject> arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(optJSONArray.optJSONObject(((IntIterator) it).nextInt()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (JSONObject it2 : arrayList) {
            ItemJsonParser itemJsonParser = this.itemJsonParser;
            Intrinsics.checkNotNullExpressionValue(it2, "it");
            SourceOrder.Item parse = itemJsonParser.parse(it2);
            if (parse != null) {
                arrayList2.add(parse);
            }
        }
        Integer optInteger = StripeJsonUtils.INSTANCE.optInteger(json, FIELD_AMOUNT);
        String optString = StripeJsonUtils.optString(json, FIELD_CURRENCY);
        String optString2 = StripeJsonUtils.optString(json, "email");
        JSONObject optJSONObject = json.optJSONObject(FIELD_SHIPPING);
        return new SourceOrder(optInteger, optString, optString2, arrayList2, optJSONObject != null ? new ShippingJsonParser().parse(optJSONObject) : null);
    }
}
