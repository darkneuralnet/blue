package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.Customer;
import com.stripe.android.model.CustomerPaymentSource;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.TokenizationMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.json.JSONArray;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/model/parsers/CustomerJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Customer;", "()V", "customerSourceJsonParser", "Lcom/stripe/android/model/parsers/CustomerPaymentSourceJsonParser;", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nCustomerJsonParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerJsonParser.kt\ncom/stripe/android/model/parsers/CustomerJsonParser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,82:1\n1549#2:83\n1620#2,3:84\n1603#2,9:87\n1855#2:96\n1856#2:98\n1612#2:99\n819#2:100\n847#2,2:101\n1#3:97\n*S KotlinDebug\n*F\n+ 1 CustomerJsonParser.kt\ncom/stripe/android/model/parsers/CustomerJsonParser\n*L\n39#1:83\n39#1:84,3\n40#1:87,9\n40#1:96\n40#1:98\n40#1:99\n41#1:100\n41#1:101,2\n40#1:97\n*E\n"})
/* loaded from: classes7.dex */
public final class CustomerJsonParser implements ModelJsonParser<Customer> {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String FIELD_DATA = "data";
    @Deprecated
    private static final String FIELD_DEFAULT_SOURCE = "default_source";
    @Deprecated
    private static final String FIELD_DESCRIPTION = "description";
    @Deprecated
    private static final String FIELD_EMAIL = "email";
    @Deprecated
    private static final String FIELD_HAS_MORE = "has_more";
    @Deprecated
    private static final String FIELD_ID = "id";
    @Deprecated
    private static final String FIELD_LIVEMODE = "livemode";
    @Deprecated
    private static final String FIELD_OBJECT = "object";
    @Deprecated
    private static final String FIELD_SHIPPING = "shipping";
    @Deprecated
    private static final String FIELD_SOURCES = "sources";
    @Deprecated
    private static final String FIELD_TOTAL_COUNT = "total_count";
    @Deprecated
    private static final String FIELD_URL = "url";
    @Deprecated
    private static final String VALUE_CUSTOMER = "customer";
    @Deprecated
    private static final String VALUE_LIST = "list";
    private final CustomerPaymentSourceJsonParser customerSourceJsonParser = new CustomerPaymentSourceJsonParser();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/model/parsers/CustomerJsonParser$Companion;", "", "()V", "FIELD_DATA", "", "FIELD_DEFAULT_SOURCE", "FIELD_DESCRIPTION", "FIELD_EMAIL", "FIELD_HAS_MORE", "FIELD_ID", "FIELD_LIVEMODE", "FIELD_OBJECT", "FIELD_SHIPPING", "FIELD_SOURCES", "FIELD_TOTAL_COUNT", "FIELD_URL", "VALUE_CUSTOMER", "VALUE_LIST", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public Customer parse(JSONObject json) {
        List emptyList;
        ArrayList arrayList;
        Integer num;
        String str;
        boolean z;
        IntRange until;
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(json, "json");
        if (Intrinsics.areEqual("customer", StripeJsonUtils.optString(json, FIELD_OBJECT))) {
            String optString = StripeJsonUtils.optString(json, "id");
            String optString2 = StripeJsonUtils.optString(json, FIELD_DEFAULT_SOURCE);
            JSONObject optJSONObject = json.optJSONObject(FIELD_SHIPPING);
            ShippingInformation parse = optJSONObject != null ? new ShippingInformationJsonParser().parse(optJSONObject) : null;
            JSONObject optJSONObject2 = json.optJSONObject(FIELD_SOURCES);
            if (optJSONObject2 != null && Intrinsics.areEqual(VALUE_LIST, StripeJsonUtils.optString(optJSONObject2, FIELD_OBJECT))) {
                StripeJsonUtils stripeJsonUtils = StripeJsonUtils.INSTANCE;
                boolean optBoolean = stripeJsonUtils.optBoolean(optJSONObject2, FIELD_HAS_MORE);
                Integer optInteger = stripeJsonUtils.optInteger(optJSONObject2, FIELD_TOTAL_COUNT);
                String optString3 = StripeJsonUtils.optString(optJSONObject2, "url");
                JSONArray optJSONArray = optJSONObject2.optJSONArray("data");
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                }
                until = RangesKt___RangesKt.until(0, optJSONArray.length());
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
                ArrayList<JSONObject> arrayList2 = new ArrayList(collectionSizeOrDefault);
                Iterator<Integer> it = until.iterator();
                while (it.hasNext()) {
                    arrayList2.add(optJSONArray.getJSONObject(((IntIterator) it).nextInt()));
                }
                ArrayList arrayList3 = new ArrayList();
                for (JSONObject it2 : arrayList2) {
                    CustomerPaymentSourceJsonParser customerPaymentSourceJsonParser = this.customerSourceJsonParser;
                    Intrinsics.checkNotNullExpressionValue(it2, "it");
                    CustomerPaymentSource parse2 = customerPaymentSourceJsonParser.parse(it2);
                    if (parse2 != null) {
                        arrayList3.add(parse2);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj : arrayList3) {
                    if (!(((CustomerPaymentSource) obj).getTokenizationMethod() == TokenizationMethod.ApplePay)) {
                        arrayList4.add(obj);
                    }
                }
                num = optInteger;
                str = optString3;
                arrayList = arrayList4;
                z = optBoolean;
            } else {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                arrayList = emptyList;
                num = null;
                str = null;
                z = false;
            }
            return new Customer(optString, optString2, parse, arrayList, z, num, str, StripeJsonUtils.optString(json, FIELD_DESCRIPTION), StripeJsonUtils.optString(json, "email"), json.optBoolean(FIELD_LIVEMODE, false));
        }
        return null;
    }
}
