package com.stripe.android.model.parsers;

import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodsList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.json.JSONArray;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodsListJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethodsList;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPaymentMethodsListJsonParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodsListJsonParser.kt\ncom/stripe/android/model/parsers/PaymentMethodsListJsonParser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n1603#2,9:27\n1855#2:36\n1856#2:38\n1612#2:39\n1#3:37\n*S KotlinDebug\n*F\n+ 1 PaymentMethodsListJsonParser.kt\ncom/stripe/android/model/parsers/PaymentMethodsListJsonParser\n*L\n12#1:27,9\n12#1:36\n12#1:38\n12#1:39\n12#1:37\n*E\n"})
/* loaded from: classes7.dex */
public final class PaymentMethodsListJsonParser implements ModelJsonParser<PaymentMethodsList> {
    @Deprecated
    private static final String FIELD_DATA = "data";
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final PaymentMethodJsonParser PAYMENT_METHOD_JSON_PARSER = new PaymentMethodJsonParser();

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodsListJsonParser$Companion;", "", "()V", "FIELD_DATA", "", "PAYMENT_METHOD_JSON_PARSER", "Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public PaymentMethodsList parse(JSONObject json) {
        List m116783constructorimpl;
        List emptyList;
        IntRange until;
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            Result.Companion companion = Result.Companion;
            JSONArray optJSONArray = json.optJSONArray("data");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            } else {
                Intrinsics.checkNotNullExpressionValue(optJSONArray, "json.optJSONArray(FIELD_DATA) ?: JSONArray()");
            }
            until = RangesKt___RangesKt.until(0, optJSONArray.length());
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = until.iterator();
            while (it.hasNext()) {
                int nextInt = ((IntIterator) it).nextInt();
                PaymentMethodJsonParser paymentMethodJsonParser = PAYMENT_METHOD_JSON_PARSER;
                JSONObject optJSONObject = optJSONArray.optJSONObject(nextInt);
                Intrinsics.checkNotNullExpressionValue(optJSONObject, "data.optJSONObject(it)");
                PaymentMethod parse = paymentMethodJsonParser.parse(optJSONObject);
                if (parse != null) {
                    arrayList.add(parse);
                }
            }
            m116783constructorimpl = Result.m116783constructorimpl(arrayList);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        if (Result.m116789isFailureimpl(m116783constructorimpl)) {
            m116783constructorimpl = emptyList;
        }
        return new PaymentMethodsList((List) m116783constructorimpl);
    }
}
